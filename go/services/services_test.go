package services

import (
	"context"
	"path/filepath"
	"runtime"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/trinsic-id/sdk/go/proto/sdk/options/v1/options"
	"github.com/trinsic-id/sdk/go/proto/services/provider/v1/provider"
	"github.com/trinsic-id/sdk/go/proto/services/trustregistry/v1/trustregistry"
)

// pathData() {
func GetBasePath() string {
	_, fileName, _, _ := runtime.Caller(1)
	path := filepath.Clean(filepath.Join(filepath.Dir(fileName), "..", "..", "devops", "testdata"))
	return path
}

// }

// CreateTestTrinsicWithNewEcosystem creates a testing ecosystem and returns a `services.Trinsic` configured against it
func CreateTestTrinsicWithNewEcosystem() (*Trinsic, *provider.Ecosystem, error) {
	trinsic, err := NewTrinsic(WithTestEnv())
	if err != nil {
		return nil, nil, err
	}

	// Make a new ecosystem
	ecoResponse, err := trinsic.Provider().CreateEcosystem(context.Background(), &provider.CreateEcosystemRequest{})
	if err != nil {
		return nil, nil, err
	}

	// Set auth token and ecosystem ID
	token, err := ProfileToToken(ecoResponse.GetProfile())
	if err != nil {
		return nil, nil, err
	}

	trinsic.SetAuthToken(token)

	return trinsic, ecoResponse.Ecosystem, nil
}

func TestServiceOptions(t *testing.T) {
	assert := assert.New(t)

	opts, err := NewServiceOptions()
	assert.Nil(err)

	prodOpts := &Options{TrinsicOptions: &options.TrinsicOptions{}}
	err = WithProductionEnv()(prodOpts)
	assert.Nil(err, "production options should return")

	assert.Equal(prodOpts, opts, "should default to production env")
	assert.Equal("prod.trinsic.cloud", opts.TrinsicOptions.ServerEndpoint, "incorrect prod url")

	err = WithAuthToken("test token")(opts)
	assert.Nil(err, "should not error on test token")
	assert.Equal("test token", opts.TrinsicOptions.AuthToken, "test token not applied")

	err = WithDevEnv()(opts)
	assert.Nil(err, "should not error on dev env")
	assert.Equal("dev-internal.trinsic.cloud", opts.TrinsicOptions.ServerEndpoint, "incorrect dev url")

	err = WithStagingEnv()(opts)
	assert.Nil(err, "should not error on staging env")
	assert.Equal("staging-internal.trinsic.cloud", opts.TrinsicOptions.ServerEndpoint, "incorrect staging url")

	err = WithDefaultEcosystem("test1")(opts)
	assert.Nil(err, "should not error on setting default ecosystem")
}

func TestTrustRegistryDemo(t *testing.T) {
	assert2 := assert.New(t)
	trinsic, _, err := CreateTestTrinsicWithNewEcosystem()
	if !assert2.Nil(err) {
		return
	}

	// register issuer
	didURI := "did:example:test"
	schemaURI := "https://schema.org/Card"

	// registerMemberSample() {
	registerMemberResponse, err := trinsic.TrustRegistry().RegisterMember(context.Background(), &trustregistry.RegisterMemberRequest{
		SchemaUri: schemaURI,
		Member:    &trustregistry.RegisterMemberRequest_DidUri{DidUri: didURI},
	})
	// }
	if !assert2.Nil(err) {
		return
	}

	// getMembershipStatus() {
	getMembershipStatusResponse, err := trinsic.TrustRegistry().GetMemberAuthorizationStatus(context.Background(), &trustregistry.GetMemberAuthorizationStatusRequest{
		DidUri:    didURI,
		SchemaUri: schemaURI,
	})
	// }
	if !assert2.Nil(err) {
		return
	}
	assert2.Equal(trustregistry.RegistrationStatus_CURRENT, getMembershipStatusResponse.Status, "Member status should be current")

	// unregisterMember() {
	unregisterMemberResponse, err := trinsic.TrustRegistry().UnregisterMember(context.Background(), &trustregistry.UnregisterMemberRequest{
		SchemaUri: schemaURI,
	})
	// }

	// This is for the variables used for demos above, so they appear "used".
	if unregisterMemberResponse == nil || registerMemberResponse == nil || getMembershipStatusResponse == nil {
		// Do absolutely nothing
	}
}

func TestEcosystemDemo(t *testing.T) {
	assert2 := assert.New(t)
	trinsic, _, err := CreateTestTrinsicWithNewEcosystem()
	if !assert2.Nil(err) {
		return
	}

	// createEcosystem() {
	actualCreate, err := trinsic.Provider().CreateEcosystem(context.Background(), &provider.CreateEcosystemRequest{
		Description: "My ecosystem",
		Domain:      "https://example.com",
	})
	// }
	if !assert2.Nil(err) {
		return
	}
	assert2.NotNil(actualCreate)
	// assert2.NotNil(actualCreate.Id)
	// assert2.True(strings.HasPrefix(actualCreate.Id, "urn:trinsic:ecosystems:"))

	// inviteParticipant() {
	// }
	// invitationStatus() {
	// }

}
