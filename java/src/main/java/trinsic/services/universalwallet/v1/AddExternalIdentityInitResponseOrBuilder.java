// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/universal-wallet/v1/universal-wallet.proto

package trinsic.services.universalwallet.v1;

public interface AddExternalIdentityInitResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.universalwallet.v1.AddExternalIdentityInitResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Challenge to be verified by the user.
   * Pass this challenge back to the `AddIdentityConfirm` endpoint
   * </pre>
   *
   * <code>string challenge = 1;</code>
   *
   * @return The challenge.
   */
  java.lang.String getChallenge();
  /**
   *
   *
   * <pre>
   * Challenge to be verified by the user.
   * Pass this challenge back to the `AddIdentityConfirm` endpoint
   * </pre>
   *
   * <code>string challenge = 1;</code>
   *
   * @return The bytes for challenge.
   */
  com.google.protobuf.ByteString getChallengeBytes();
}
