// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/provider.proto

package trinsic.services.provider.v1;

public interface WalletExternalIdentityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.provider.v1.WalletExternalIdentity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of this identity (whether this identity is an email address, phone number, etc.)
   * </pre>
   *
   * <code>.services.provider.v1.IdentityProvider provider = 1;</code>
   *
   * @return The enum numeric value on the wire for provider.
   */
  int getProviderValue();
  /**
   *
   *
   * <pre>
   * The type of this identity (whether this identity is an email address, phone number, etc.)
   * </pre>
   *
   * <code>.services.provider.v1.IdentityProvider provider = 1;</code>
   *
   * @return The provider.
   */
  trinsic.services.provider.v1.IdentityProvider getProvider();

  /**
   *
   *
   * <pre>
   * The actual email address/phone number/etc. for this identity
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * The actual email address/phone number/etc. for this identity
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();
}