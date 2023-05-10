package trinsic.services;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.InvalidProtocolBufferException;
import trinsic.sdk.options.v1.Options;
import trinsic.services.universalwallet.v1.*;

public class WalletService extends ServiceBase {
  private final UniversalWalletGrpc.UniversalWalletFutureStub stub;

  public WalletService() {
    this(null);
  }

  public WalletService(Options.TrinsicOptions.Builder options) {
    super(options);
    this.stub = UniversalWalletGrpc.newFutureStub(this.getChannel());
  }

  public ListenableFuture<SearchResponse> searchWallet() throws InvalidProtocolBufferException {
    return searchWallet(SearchRequest.getDefaultInstance());
  }

  public ListenableFuture<SearchResponse> searchWallet(SearchRequest request)
      throws InvalidProtocolBufferException {
    if (request.getQuery().isBlank())
      request =
          SearchRequest.newBuilder(request)
              .setQuery("SELECT c.id, c.type, c.data FROM c OFFSET 0 LIMIT 100")
              .build();

    return search(request);
  }

  // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
  // target: /home/runner/work/sdk/sdk/java/src/main/java/trinsic/services/WalletService.java

  /** Retrieve an item from the wallet with a given item identifier */
  public ListenableFuture<GetItemResponse> getItem(GetItemRequest request)
      throws InvalidProtocolBufferException {

    return withMetadata(stub, request).getItem(request);
  }
  /** Search the wallet using a SQL syntax */
  public ListenableFuture<SearchResponse> search(SearchRequest request)
      throws InvalidProtocolBufferException {

    return withMetadata(stub, request).search(request);
  }
  /** Insert an item into the wallet */
  public ListenableFuture<InsertItemResponse> insertItem(InsertItemRequest request)
      throws InvalidProtocolBufferException {

    return withMetadata(stub, request).insertItem(request);
  }
  /** Update an item in the wallet */
  public ListenableFuture<UpdateItemResponse> updateItem(UpdateItemRequest request)
      throws InvalidProtocolBufferException {

    return withMetadata(stub, request).updateItem(request);
  }
  /** Delete an item from the wallet permanently */
  public ListenableFuture<DeleteItemResponse> deleteItem(DeleteItemRequest request)
      throws InvalidProtocolBufferException {

    return withMetadata(stub, request).deleteItem(request);
  }
  /** Delete a wallet and its credentials */
  public ListenableFuture<DeleteWalletResponse> deleteWallet(DeleteWalletRequest request)
      throws InvalidProtocolBufferException {

    return withMetadata(stub, request).deleteWallet(request);
  }
  /** Create a new wallet and generate an auth token for access */
  public ListenableFuture<CreateWalletResponse> createWallet(CreateWalletRequest request)
      throws InvalidProtocolBufferException {

    return withMetadata(stub, request).createWallet(request);
  }
  /** Retrieve wallet details and configuration */
  public ListenableFuture<GetWalletInfoResponse> getWalletInfo(GetWalletInfoRequest request)
      throws InvalidProtocolBufferException {

    return withMetadata(stub, request).getWalletInfo(request);
  }
  /** Retrieve wallet details and configuration about the currently authenticated wallet */
  public ListenableFuture<GetMyInfoResponse> getMyInfo() throws InvalidProtocolBufferException {
    var request = GetMyInfoRequest.newBuilder().build();
    return withMetadata(stub, request).getMyInfo(request);
  }
  /**
   * Generate new token for a given wallet and add it to the collection of known auth tokens. This
   * endpoint requires authentication and will return a new token ID and auth token. Use this
   * endpoint if you want to authorize another device, without having to share your existing auth
   * token.
   */
  public ListenableFuture<GenerateAuthTokenResponse> generateAuthToken(
      GenerateAuthTokenRequest request) throws InvalidProtocolBufferException {

    return withMetadata(stub, request).generateAuthToken(request);
  }
  /**
   * Revokes a previously issued auth token and updates the collection of known auth tokens. This
   * endpoint requires authentication.
   */
  public ListenableFuture<RevokeAuthTokenResponse> revokeAuthToken(RevokeAuthTokenRequest request)
      throws InvalidProtocolBufferException {

    return withMetadata(stub, request).revokeAuthToken(request);
  }
  /**
   * Add new external identity to the current wallet, such as email, sms, ethereum address, etc.
   * This identity ownership must be confirmed using `AddIdentityConfirm` via OTP, signature, etc.
   */
  public ListenableFuture<AddExternalIdentityInitResponse> addExternalIdentityInit(
      AddExternalIdentityInitRequest request) throws InvalidProtocolBufferException {

    return withMetadata(stub, request).addExternalIdentityInit(request);
  }
  /** Confirm identity added to the current wallet using `AddExternalIdentityInit` */
  public ListenableFuture<AddExternalIdentityConfirmResponse> addExternalIdentityConfirm(
      AddExternalIdentityConfirmRequest request) throws InvalidProtocolBufferException {

    return withMetadata(stub, request).addExternalIdentityConfirm(request);
  }
  /** Remove an external identity from the current wallet */
  public ListenableFuture<RemoveExternalIdentityResponse> removeExternalIdentity(
      RemoveExternalIdentityRequest request) throws InvalidProtocolBufferException {

    return withMetadata(stub, request).removeExternalIdentity(request);
  }
  /**
   * Sign-in to an already existing wallet, using an identity added that was previously registered
   * This endpoint does not require authentication, and will return a challenge to be signed or
   * verified
   */
  public ListenableFuture<AuthenticateInitResponse> authenticateInit(
      AuthenticateInitRequest request) throws InvalidProtocolBufferException {

    return withMetadata(stub, request).authenticateInit(request);
  }
  /** Confirm sign-in to an already existing wallet and return authentication token */
  public ListenableFuture<AuthenticateConfirmResponse> authenticateConfirm(
      AuthenticateConfirmRequest request) throws InvalidProtocolBufferException {

    return withMetadata(stub, request).authenticateConfirm(request);
  }
  /** Resend previous authentication code */
  public ListenableFuture<AuthenticateResendCodeResponse> authenticateResendCode(
      AuthenticateResendCodeRequest request) throws InvalidProtocolBufferException {

    return withMetadata(stub, request).authenticateResendCode(request);
  }
  /** List all wallets in the ecosystem */
  public ListenableFuture<ListWalletsResponse> listWallets(ListWalletsRequest request)
      throws InvalidProtocolBufferException {

    return withMetadata(stub, request).listWallets(request);
  }
  // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
