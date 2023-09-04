// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/connect/v1/connect.proto

package trinsic.services.connect.v1;

public interface IDVSessionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.connect.v1.IDVSession)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The ID of the IDVSession.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * The ID of the IDVSession.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The Client Token for this IDVSession. This should be passed to your frontend to initiate
   * the IDV flow using Trinsic's Web SDK.
   * </pre>
   *
   * <code>string client_token = 2;</code>
   *
   * @return The clientToken.
   */
  java.lang.String getClientToken();
  /**
   *
   *
   * <pre>
   * The Client Token for this IDVSession. This should be passed to your frontend to initiate
   * the IDV flow using Trinsic's Web SDK.
   * </pre>
   *
   * <code>string client_token = 2;</code>
   *
   * @return The bytes for clientToken.
   */
  com.google.protobuf.ByteString getClientTokenBytes();

  /**
   *
   *
   * <pre>
   * State of the IDVSession
   * </pre>
   *
   * <code>.services.connect.v1.IDVSessionState state = 3;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * State of the IDVSession
   * </pre>
   *
   * <code>.services.connect.v1.IDVSessionState state = 3;</code>
   *
   * @return The state.
   */
  trinsic.services.connect.v1.IDVSessionState getState();

  /**
   *
   *
   * <pre>
   * The actual Verifications to perform in this IDV flow
   * </pre>
   *
   * <code>map&lt;string, .services.connect.v1.Verification&gt; verifications = 4;</code>
   */
  int getVerificationsCount();
  /**
   *
   *
   * <pre>
   * The actual Verifications to perform in this IDV flow
   * </pre>
   *
   * <code>map&lt;string, .services.connect.v1.Verification&gt; verifications = 4;</code>
   */
  boolean containsVerifications(java.lang.String key);
  /** Use {@link #getVerificationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, trinsic.services.connect.v1.Verification> getVerifications();
  /**
   *
   *
   * <pre>
   * The actual Verifications to perform in this IDV flow
   * </pre>
   *
   * <code>map&lt;string, .services.connect.v1.Verification&gt; verifications = 4;</code>
   */
  java.util.Map<java.lang.String, trinsic.services.connect.v1.Verification> getVerificationsMap();
  /**
   *
   *
   * <pre>
   * The actual Verifications to perform in this IDV flow
   * </pre>
   *
   * <code>map&lt;string, .services.connect.v1.Verification&gt; verifications = 4;</code>
   */

  /* nullable */
  trinsic.services.connect.v1.Verification getVerificationsOrDefault(
      java.lang.String key,
      /* nullable */
      trinsic.services.connect.v1.Verification defaultValue);
  /**
   *
   *
   * <pre>
   * The actual Verifications to perform in this IDV flow
   * </pre>
   *
   * <code>map&lt;string, .services.connect.v1.Verification&gt; verifications = 4;</code>
   */
  trinsic.services.connect.v1.Verification getVerificationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The resultant signed VP combining the results of all verifications
   * </pre>
   *
   * <code>optional string result_vp = 5;</code>
   *
   * @return Whether the resultVp field is set.
   */
  boolean hasResultVp();
  /**
   *
   *
   * <pre>
   * The resultant signed VP combining the results of all verifications
   * </pre>
   *
   * <code>optional string result_vp = 5;</code>
   *
   * @return The resultVp.
   */
  java.lang.String getResultVp();
  /**
   *
   *
   * <pre>
   * The resultant signed VP combining the results of all verifications
   * </pre>
   *
   * <code>optional string result_vp = 5;</code>
   *
   * @return The bytes for resultVp.
   */
  com.google.protobuf.ByteString getResultVpBytes();

  /**
   *
   *
   * <pre>
   * The unix timestamp, in seconds, that this IDVSession was created
   * </pre>
   *
   * <code>fixed64 created = 6;</code>
   *
   * @return The created.
   */
  long getCreated();

  /**
   *
   *
   * <pre>
   * The unix timestamp, in seconds, that this IDVSession's `state` was last updated
   * </pre>
   *
   * <code>fixed64 updated = 7;</code>
   *
   * @return The updated.
   */
  long getUpdated();
}
