// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/provider.proto

package trinsic.services.provider.v1;

public interface GrantAuthorizationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.provider.v1.GrantAuthorizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Email address of account being granted permission.
   * Mutually exclusive with `walletId`.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   *
   *
   * <pre>
   * Email address of account being granted permission.
   * Mutually exclusive with `walletId`.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   *
   *
   * <pre>
   * Email address of account being granted permission.
   * Mutually exclusive with `walletId`.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString getEmailBytes();

  /**
   *
   *
   * <pre>
   * Wallet ID of account being granted permission.
   * Mutually exclusive with `email`.
   * </pre>
   *
   * <code>string walletId = 2;</code>
   *
   * @return Whether the walletId field is set.
   */
  boolean hasWalletId();
  /**
   *
   *
   * <pre>
   * Wallet ID of account being granted permission.
   * Mutually exclusive with `email`.
   * </pre>
   *
   * <code>string walletId = 2;</code>
   *
   * @return The walletId.
   */
  java.lang.String getWalletId();
  /**
   *
   *
   * <pre>
   * Wallet ID of account being granted permission.
   * Mutually exclusive with `email`.
   * </pre>
   *
   * <code>string walletId = 2;</code>
   *
   * @return The bytes for walletId.
   */
  com.google.protobuf.ByteString getWalletIdBytes();

  /**
   *
   *
   * <pre>
   * Resource string that account is receiving permissions for.
   * Resources are specified as a RESTful path: /{ecoId}/{resource type}/{resource id}. `ecoId` may be omitted.
   * </pre>
   *
   * <code>string resource = 3;</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * Resource string that account is receiving permissions for.
   * Resources are specified as a RESTful path: /{ecoId}/{resource type}/{resource id}. `ecoId` may be omitted.
   * </pre>
   *
   * <code>string resource = 3;</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * Action to authorize. Default is "*" (all)
   * </pre>
   *
   * <code>string action = 4;</code>
   *
   * @return The action.
   */
  java.lang.String getAction();
  /**
   *
   *
   * <pre>
   * Action to authorize. Default is "*" (all)
   * </pre>
   *
   * <code>string action = 4;</code>
   *
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString getActionBytes();

  public trinsic.services.provider.v1.GrantAuthorizationRequest.AccountCase getAccountCase();
}
