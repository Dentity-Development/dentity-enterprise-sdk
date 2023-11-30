package services

import (
	"context"
	"github.com/trinsic-id/sdk/go/proto/services/connect/v1/connect"
)

// NewConnectService returns a Trinsic Connect service
func NewConnectService(options *Options) (ConnectService, error) {
	base, err := NewServiceBase(options)
	if err != nil {
		return nil, err
	}
	service := &connectBase{
		Service: base,
		client:  connect.NewConnectClient(base.GetChannel()),
	}

	return service, nil
}

// ConnectService wraps all the functions for interacting with Trinsic Connect
type ConnectService interface {
	Service
	// BEGIN Interface Code generated by protoc-gen-trinsic. DO NOT EDIT.
	// target: /home/runner/work/sdk/sdk/go/services/connect_service.go

	// CreateSession  Create an IDVSession
	CreateSession(userContext context.Context, request *connect.CreateSessionRequest) (*connect.CreateSessionResponse, error)
	// CancelSession  Cancel an IDVSession
	CancelSession(userContext context.Context, request *connect.CancelSessionRequest) (*connect.CancelSessionResponse, error)
	// GetSession  Get an IDVSession
	GetSession(userContext context.Context, request *connect.GetSessionRequest) (*connect.GetSessionResponse, error)
	// ListSessions  List IDVSessions created by the calling wallet
	ListSessions(userContext context.Context, request *connect.ListSessionsRequest) (*connect.ListSessionsResponse, error)
	// HasValidCredential  Checks if the identity provided in the request has a wallet containing a valid reusable credential
	HasValidCredential(userContext context.Context, request *connect.HasValidCredentialRequest) (*connect.HasValidCredentialResponse, error)

	// END Interface Code generated by protoc-gen-trinsic. DO NOT EDIT.
}

type connectBase struct {
	Service
	client connect.ConnectClient
}

// BEGIN Implementation Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: /home/runner/work/sdk/sdk/go/services/connect_service.go

// CreateSession  Create an IDVSession
func (c *connectBase) CreateSession(userContext context.Context, request *connect.CreateSessionRequest) (*connect.CreateSessionResponse, error) {
	md, err := c.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := c.client.CreateSession(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// CancelSession  Cancel an IDVSession
func (c *connectBase) CancelSession(userContext context.Context, request *connect.CancelSessionRequest) (*connect.CancelSessionResponse, error) {
	md, err := c.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := c.client.CancelSession(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// GetSession  Get an IDVSession
func (c *connectBase) GetSession(userContext context.Context, request *connect.GetSessionRequest) (*connect.GetSessionResponse, error) {
	md, err := c.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := c.client.GetSession(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// ListSessions  List IDVSessions created by the calling wallet
func (c *connectBase) ListSessions(userContext context.Context, request *connect.ListSessionsRequest) (*connect.ListSessionsResponse, error) {
	md, err := c.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := c.client.ListSessions(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// HasValidCredential  Checks if the identity provided in the request has a wallet containing a valid reusable credential
func (c *connectBase) HasValidCredential(userContext context.Context, request *connect.HasValidCredentialRequest) (*connect.HasValidCredentialResponse, error) {
	md, err := c.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := c.client.HasValidCredential(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// END Implementation Code generated by protoc-gen-trinsic. DO NOT EDIT.
