// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/provider.proto

package trinsic.services.common.v1;

public interface GetEventTokenResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.provider.v1.GetEventTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * a JWT bound to the PK provided in the request
   * </pre>
   *
   * <code>string token = 1;</code>
   *
   * @return The token.
   */
  java.lang.String getToken();
  /**
   *
   *
   * <pre>
   * a JWT bound to the PK provided in the request
   * </pre>
   *
   * <code>string token = 1;</code>
   *
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString getTokenBytes();
}
