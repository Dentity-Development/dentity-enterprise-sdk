package services

import (
	"context"
	"encoding/base64"
	"errors"

	"github.com/trinsic-id/okapi/go/okapi"
	"github.com/trinsic-id/okapi/go/okapiproto"
	"github.com/trinsic-id/sdk/go/proto/services/account/v1/account"

	"google.golang.org/protobuf/proto"
)

// NewAccountService returns an account service with the base service configured
// using the provided options
func NewAccountService(options *Options) (AccountService, error) {
	base, err := NewServiceBase(options)
	if err != nil {
		return nil, err
	}
	service := &accountBase{
		Service: base,
		client:  account.NewAccountClient(base.GetChannel()),
	}

	return service, nil
}

// AccountService wraps all the functions for interacting with accounts
type AccountService interface {
	Service

	// SignIn (DEPRECATED, USE Login) attempts to log in and returns an authentication token
	SignIn(userContext context.Context, request *account.SignInRequest) (string, account.ConfirmationMethod, error)

	// Unprotect takes an authtoken that has been protected using a pin code
	// and returns an unlocked token
	Unprotect(authtoken, securityCode string) (string, error)

	// Protect will apply the given security code blind to the provided token
	Protect(authtoken, securityCode string) (string, error)

	// Login performs the first stage of login, which must be finalized with LoginConfirm
	Login(userContext context.Context, request *account.LoginRequest) (*account.LoginResponse, error)

	// LoginConfirm finalizes login, using challenge received from Login(), and authCode sent to user email
	LoginConfirm(userContext context.Context, challenge []byte, authCode string) (string, error)

	// LoginAnonymous creates an anonymous account in the current ecosystem and returns an auth token
	LoginAnonymous(userContext context.Context) (string, error)

	// GetInfo returns details about the wallet associated with the account token
	GetInfo(userContext context.Context) (*account.AccountInfoResponse, error)

	// ListDevices returns a list of devices that are associated with the cloud wallet
	ListDevices(userContext context.Context, request *account.ListDevicesRequest) (*account.ListDevicesResponse, error)

	// RevokeDevice removes access to the cloud wallet for the provided device
	RevokeDevice(userContext context.Context, request *account.RevokeDeviceRequest) (*account.RevokeDeviceResponse, error)

	// AuthorizeWebhook authorizes provider of account's ecosystem to receive webhooks for events relating to this account
	AuthorizeWebhook(userContext context.Context, request *account.AuthorizeWebhookRequest) (*account.AuthorizeWebhookResponse, error)
}

type accountBase struct {
	Service
	client account.AccountClient
}

// SignIn to a given account
func (a *accountBase) SignIn(userContext context.Context, request *account.SignInRequest) (string, account.ConfirmationMethod, error) {
	if request == nil {
		request = &account.SignInRequest{}
	}
	if request.Details == nil {
		request.Details = &account.AccountDetails{}
	}

	if len(request.EcosystemId) == 0 {
		request.EcosystemId = a.GetServiceOptions().DefaultEcosystem
	}

	resp, err := a.client.SignIn(userContext, request)
	if err != nil {
		return "", account.ConfirmationMethod_None, err
	}

	tkn, err := ProfileToToken(resp.Profile)
	if err != nil {
		return "", account.ConfirmationMethod_None, err
	}

	return tkn, resp.ConfirmationMethod, nil
}

// Unprotect an authtoken using the given security code
//
// This method can be called multiple times on an individual token
// to "unwrap" the blindings that have been applied
func (a *accountBase) Unprotect(authtoken, securityCode string) (string, error) {
	profile, err := ProfileFromToken(authtoken)
	if err != nil {
		return "", err
	}

	request := &okapiproto.UnBlindOberonTokenRequest{
		Token:    profile.AuthToken,
		Blinding: append([][]byte{}, []byte(securityCode)),
	}

	response, err := okapi.Oberon().UnBlindToken(request)
	if err != nil {
		return "", err
	}

	profile.AuthToken = response.Token
	profile.Protection = &account.TokenProtection{
		Enabled: false,
		Method:  account.ConfirmationMethod_None,
	}

	return ProfileToToken(profile)
}

// Protect an authtoken with the given security code. Must be unprotected before use
//
// This method can be called as many times as you want, but each code must be "unwrapped"
// by calling Unprotect in the reverse order before use
func (a *accountBase) Protect(authtoken, securityCode string) (string, error) {
	profile, err := ProfileFromToken(authtoken)
	if err != nil {
		return "", err
	}

	request := &okapiproto.BlindOberonTokenRequest{
		Token:    profile.AuthToken,
		Blinding: append([][]byte{}, []byte(securityCode)),
	}

	response, err := okapi.Oberon().BlindToken(request)
	if err != nil {
		return "", err
	}

	profile.AuthToken = response.Token
	profile.Protection = &account.TokenProtection{
		Enabled: true,
		Method:  account.ConfirmationMethod_Other,
	}

	return ProfileToToken(profile)
}

func (a *accountBase) Login(userContext context.Context, request *account.LoginRequest) (*account.LoginResponse, error) {
	response, err := a.client.Login(userContext, request)
	if err != nil {
		return nil, err
	}

	return response, nil
}

func (a *accountBase) LoginConfirm(userContext context.Context, challenge []byte, authCode string) (string, error) {
	// Hash the authcode
	codeHash, err := okapi.Hashing().Blake3Hash(&okapiproto.Blake3HashRequest{Data: []byte(authCode)})
	if err != nil {
		return "", err
	}

	// Generate request
	request := &account.LoginConfirmRequest{
		Challenge:              challenge,
		ConfirmationCodeHashed: codeHash.Digest,
	}

	// Send request
	response, err := a.client.LoginConfirm(userContext, request)
	if err != nil {
		return "", err
	}

	// If profile isn't protected, something is wrong.
	if !response.Profile.Protection.Enabled {
		return "", errors.New("account information was not protected")
	}

	// Tokenize profile
	authToken, err := ProfileToToken(response.Profile)
	if err != nil {
		return "", err
	}

	// Unprotect profile
	authToken, err = a.Unprotect(authToken, authCode)
	if err != nil {
		return "", err
	}

	return authToken, nil
}

func (a *accountBase) LoginAnonymous(userContext context.Context) (string, error) {
	// Create request
	request := &account.LoginRequest{
		Email:       "",
		EcosystemId: a.GetServiceOptions().GetDefaultEcosystem(),
	}

	// Attempt login
	response, err := a.Login(userContext, request)
	if err != nil {
		return "", err
	}

	// Interrogate results
	if response.GetProfile() == nil {
		return "", errors.New("no profile returned from Login()")
	}
	if response.GetProfile().Protection.Enabled {
		return "", errors.New("protected profile returned from Login()")
	}

	// Tokenize and return profile
	authToken, err := ProfileToToken(response.GetProfile())
	if err != nil {
		return "", err
	}

	return authToken, nil
}

// GetInfo associated with a given wallet
func (a *accountBase) GetInfo(userContext context.Context) (*account.AccountInfoResponse, error) {
	request := &account.AccountInfoRequest{}
	md, err := a.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := a.client.Info(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// ListDevices that can access the cloud wallet
func (a *accountBase) ListDevices(userContext context.Context, request *account.ListDevicesRequest) (*account.ListDevicesResponse, error) {
	md, err := a.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := a.client.ListDevices(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// RevokeDevice from the cloud wallet
func (a *accountBase) RevokeDevice(userContext context.Context, request *account.RevokeDeviceRequest) (*account.RevokeDeviceResponse, error) {
	md, err := a.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := a.client.RevokeDevice(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

func (a *accountBase) AuthorizeWebhook(userContext context.Context, request *account.AuthorizeWebhookRequest) (*account.AuthorizeWebhookResponse, error) {
	md, err := a.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := a.client.AuthorizeWebhook(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// ProfileToToken takes the proile and returns an encoded auth token
func ProfileToToken(profile *account.AccountProfile) (string, error) {
	pbytes, err := proto.Marshal(profile)
	if err != nil {
		return "", err
	}

	return base64.RawURLEncoding.EncodeToString(pbytes), nil
}

// ProfileFromToken takes an encoded auth token and returns the account profile
func ProfileFromToken(token string) (*account.AccountProfile, error) {
	tb, err := base64.RawURLEncoding.DecodeString(token)
	if err != nil {
		return nil, err
	}

	profile := &account.AccountProfile{}

	err = proto.Unmarshal(tb, profile)

	return profile, err
}
