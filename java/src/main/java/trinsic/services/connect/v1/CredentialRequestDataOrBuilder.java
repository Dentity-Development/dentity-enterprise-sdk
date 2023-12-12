// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/connect/v1/connect.proto

package trinsic.services.connect.v1;

public interface CredentialRequestDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.connect.v1.CredentialRequestData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of verification for which the credential can be used
   * </pre>
   *
   * <code>.services.connect.v1.VerificationType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of verification for which the credential can be used
   * </pre>
   *
   * <code>.services.connect.v1.VerificationType type = 1;</code>
   *
   * @return The type.
   */
  trinsic.services.connect.v1.VerificationType getType();
}
