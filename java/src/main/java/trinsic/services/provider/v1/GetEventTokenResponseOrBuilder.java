// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/provider.proto

package trinsic.services.provider.v1;

public interface GetEventTokenResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.provider.v1.GetEventTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * JWT bound to the public key provided in `GetEventTokenRequest`
   * </pre>
   *
   * <code>string token = 1;</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <pre>
   * JWT bound to the public key provided in `GetEventTokenRequest`
   * </pre>
   *
   * <code>string token = 1;</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
