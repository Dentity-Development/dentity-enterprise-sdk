// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/access-management.proto

package trinsic.services.provider.v1;

public interface AddRoleAssignmentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.provider.v1.AddRoleAssignmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Role to assign
   * </pre>
   *
   * <code>string role = 1;</code>
   * @return The role.
   */
  java.lang.String getRole();
  /**
   * <pre>
   * Role to assign
   * </pre>
   *
   * <code>string role = 1;</code>
   * @return The bytes for role.
   */
  com.google.protobuf.ByteString
      getRoleBytes();

  /**
   * <pre>
   * Email address of account to assign role to.
   * Mutually exclusive with `walletId`.
   * </pre>
   *
   * <code>string email = 2;</code>
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   * <pre>
   * Email address of account to assign role to.
   * Mutually exclusive with `walletId`.
   * </pre>
   *
   * <code>string email = 2;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * Email address of account to assign role to.
   * Mutually exclusive with `walletId`.
   * </pre>
   *
   * <code>string email = 2;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * Wallet ID of account to assign role to.
   * Mutually exclusive with `email`.
   * </pre>
   *
   * <code>string wallet_id = 3;</code>
   * @return Whether the walletId field is set.
   */
  boolean hasWalletId();
  /**
   * <pre>
   * Wallet ID of account to assign role to.
   * Mutually exclusive with `email`.
   * </pre>
   *
   * <code>string wallet_id = 3;</code>
   * @return The walletId.
   */
  java.lang.String getWalletId();
  /**
   * <pre>
   * Wallet ID of account to assign role to.
   * Mutually exclusive with `email`.
   * </pre>
   *
   * <code>string wallet_id = 3;</code>
   * @return The bytes for walletId.
   */
  com.google.protobuf.ByteString
      getWalletIdBytes();

  public trinsic.services.provider.v1.AddRoleAssignmentRequest.AccountCase getAccountCase();
}
