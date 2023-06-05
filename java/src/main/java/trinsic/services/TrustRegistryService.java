package trinsic.services;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.InvalidProtocolBufferException;
import trinsic.sdk.options.v1.Options;
import trinsic.services.trustregistry.v1.*;

public class TrustRegistryService extends ServiceBase {
  public TrustRegistryGrpc.TrustRegistryFutureStub stub;
  // We only use the blocking stub for server-side streaming call.
  public TrustRegistryGrpc.TrustRegistryBlockingStub stub2;

  public TrustRegistryService() {
    this(null);
  }

  public TrustRegistryService(Options.TrinsicOptions.Builder options) {
    super(options);
    this.stub = TrustRegistryGrpc.newFutureStub(this.getChannel());
    this.stub2 = TrustRegistryGrpc.newBlockingStub(this.getChannel());
  }

  public ListenableFuture<SearchRegistryResponse> search() throws InvalidProtocolBufferException {
    return search(SearchRegistryRequest.getDefaultInstance());
  }

  public ListenableFuture<SearchRegistryResponse> search(SearchRegistryRequest request)
      throws InvalidProtocolBufferException {
    if (request.getQuery().isBlank())
      request =
          SearchRegistryRequest.newBuilder(request)
              .setQuery("SELECT * FROM c OFFSET 0 LIMIT 100")
              .build();
    return searchRegistry(request);
  }
  // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
  // target: /home/runner/work/sdk/sdk/java/src/main/java/trinsic/services/TrustRegistryService.java

  /** Search the ecosystem's governance framework */
  public ListenableFuture<SearchRegistryResponse> searchRegistry(SearchRegistryRequest request)
      throws InvalidProtocolBufferException {

    return withMetadata(stub, request).searchRegistry(request);
  }
  /** Register an authoritative issuer for a credential schema */
  public ListenableFuture<RegisterMemberResponse> registerMember(RegisterMemberRequest request)
      throws InvalidProtocolBufferException {

    return withMetadata(stub, request).registerMember(request);
  }
  /** Removes an authoritative issuer for a credential schema from the trust registry */
  public ListenableFuture<UnregisterMemberResponse> unregisterMember(
      UnregisterMemberRequest request) throws InvalidProtocolBufferException {

    return withMetadata(stub, request).unregisterMember(request);
  }
  /** Fetch the status of a member for a given credential schema in a trust registry */
  public ListenableFuture<GetMemberAuthorizationStatusResponse> getMemberAuthorizationStatus(
      GetMemberAuthorizationStatusRequest request) throws InvalidProtocolBufferException {

    return withMetadata(stub, request).getMemberAuthorizationStatus(request);
  }
  /**
   * Fetch the ecosystem's authorized issuers and the respective templates against which it can
   * issue
   */
  public ListenableFuture<ListAuthorizedMembersResponse> listAuthorizedMembers(
      ListAuthorizedMembersRequest request) throws InvalidProtocolBufferException {

    return withMetadata(stub, request).listAuthorizedMembers(request);
  }
  /** Get member for a given did in a trust registry */
  public ListenableFuture<GetMemberResponse> getMember(GetMemberRequest request)
      throws InvalidProtocolBufferException {

    return withMetadata(stub, request).getMember(request);
  }
  // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
