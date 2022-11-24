package trinsic.services;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Base64;
import java.util.concurrent.Executors;
import trinsic.okapi.DidException;
import trinsic.sdk.options.v1.Options;
import trinsic.services.provider.v1.*;

public class ProviderService extends ServiceBase {
  public ProviderGrpc.ProviderFutureStub stub;

  public ProviderService() {
    this(null);
  }

  public ProviderService(Options.ServiceOptions.Builder options) {
    super(options);
    this.stub = ProviderGrpc.newFutureStub(this.getChannel());
  }

  public ListenableFuture<CreateEcosystemResponse> createEcosystem(CreateEcosystemRequest request)
      throws InvalidProtocolBufferException, DidException {
    ListenableFuture<CreateEcosystemResponse> response;
    if (request.getName().isBlank() && request.getDetails().getEmail().isBlank()) {
      response = stub.createEcosystem(request);
    } else {
      response = withMetadata(stub, request).createEcosystem(request);
    }
    return Futures.transform(
        response,
        input -> {
          if (!input.hasProfile() || input.getProfile().getProtection().getEnabled()) return null;

          var token = Base64.getUrlEncoder().encodeToString(input.getProfile().toByteArray());
          this.getOptionsBuilder().setAuthToken(token);
          tokenProvider.save(token);
          return input;
        },
        Executors.newSingleThreadExecutor());
  }

  // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
  // target: /home/runner/work/sdk/sdk/java/src/main/java/trinsic/services/ProviderService.java

  /** Update an existing ecosystem */
  public ListenableFuture<UpdateEcosystemResponse> updateEcosystem(UpdateEcosystemRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).updateEcosystem(request);
  }
  /** Grant user authorization to ecosystem resources */
  public ListenableFuture<GrantAuthorizationResponse> grantAuthorization(
      GrantAuthorizationRequest request) throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).grantAuthorization(request);
  }
  /** Revoke user authorization to ecosystem resources */
  public ListenableFuture<RevokeAuthorizationResponse> revokeAuthorization(
      RevokeAuthorizationRequest request) throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).revokeAuthorization(request);
  }
  /** Retrieve the list of permissions for this particular account/ecosystem */
  public ListenableFuture<GetAuthorizationsResponse> getAuthorizations(
      GetAuthorizationsRequest request) throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).getAuthorizations(request);
  }
  /** Add a webhook endpoint to the ecosystem */
  public ListenableFuture<AddWebhookResponse> addWebhook(AddWebhookRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).addWebhook(request);
  }
  /** Delete a webhook endpoint from the ecosystem */
  public ListenableFuture<DeleteWebhookResponse> deleteWebhook(DeleteWebhookRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).deleteWebhook(request);
  }
  /** Get ecosystem information */
  public ListenableFuture<EcosystemInfoResponse> ecosystemInfo(EcosystemInfoRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).ecosystemInfo(request);
  }
  /** Get public ecosystem information about *any* ecosystem */
  public ListenableFuture<GetPublicEcosystemInfoResponse> getPublicEcosystemInfo(
      GetPublicEcosystemInfoRequest request) throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).getPublicEcosystemInfo(request);
  }
  /**
   * Generates an unprotected authentication token that can be used to configure server side
   * applications
   */
  public ListenableFuture<GenerateTokenResponse> generateToken(GenerateTokenRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).generateToken(request);
  }
  /** Invite a user to the ecosystem */
  public ListenableFuture<InviteResponse> invite(InviteRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).invite(request);
  }
  /** Check the status of an invitation */
  public ListenableFuture<InvitationStatusResponse> invitationStatus(
      InvitationStatusRequest request) throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).invitationStatus(request);
  }
  /** Returns the public key being used to create/verify oberon tokens */
  public ListenableFuture<GetOberonKeyResponse> getOberonKey(GetOberonKeyRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).getOberonKey(request);
  }
  /** Generate a signed token (JWT) that can be used to connect to the message bus */
  public ListenableFuture<GetEventTokenResponse> getEventToken(GetEventTokenRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).getEventToken(request);
  }
  /** Upgrade a wallet's DID from `did:key` to another method */
  public ListenableFuture<UpgradeDidResponse> upgradeDID(UpgradeDidRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).upgradeDID(request);
  }
  /** Retrieve a random hash TXT that can be used to verify domain ownership */
  public ListenableFuture<RetrieveDomainVerificationRecordResponse>
      retrieveDomainVerificationRecord() throws InvalidProtocolBufferException, DidException {
    var request = RetrieveDomainVerificationRecordRequest.newBuilder().build();
    return withMetadata(stub, request).retrieveDomainVerificationRecord(request);
  }
  /** Call to verify domain */
  public ListenableFuture<RefreshDomainVerificationStatusResponse> refreshDomainVerificationStatus(
      RefreshDomainVerificationStatusRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).refreshDomainVerificationStatus(request);
  }
  /** Search for issuers/providers/verifiers in the current ecosystem */
  public ListenableFuture<SearchWalletConfigurationResponse> searchWalletConfigurations(
      SearchWalletConfigurationsRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).searchWalletConfigurations(request);
  }
  // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
