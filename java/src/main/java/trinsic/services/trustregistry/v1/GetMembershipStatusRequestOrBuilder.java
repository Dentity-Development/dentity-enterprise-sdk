// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/trust-registry/v1/trust-registry.proto

package trinsic.services.trustregistry.v1;

public interface GetMembershipStatusRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.trustregistry.v1.GetMembershipStatusRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URI of governance framework
   * </pre>
   *
   * <code>string governance_framework_uri = 1;</code>
   *
   * @return The governanceFrameworkUri.
   */
  java.lang.String getGovernanceFrameworkUri();
  /**
   *
   *
   * <pre>
   * URI of governance framework
   * </pre>
   *
   * <code>string governance_framework_uri = 1;</code>
   *
   * @return The bytes for governanceFrameworkUri.
   */
  com.google.protobuf.ByteString getGovernanceFrameworkUriBytes();

  /**
   *
   *
   * <pre>
   * DID URI of member
   * </pre>
   *
   * <code>string did_uri = 2;</code>
   *
   * @return Whether the didUri field is set.
   */
  boolean hasDidUri();
  /**
   *
   *
   * <pre>
   * DID URI of member
   * </pre>
   *
   * <code>string did_uri = 2;</code>
   *
   * @return The didUri.
   */
  java.lang.String getDidUri();
  /**
   *
   *
   * <pre>
   * DID URI of member
   * </pre>
   *
   * <code>string did_uri = 2;</code>
   *
   * @return The bytes for didUri.
   */
  com.google.protobuf.ByteString getDidUriBytes();

  /**
   *
   *
   * <pre>
   * X.509 certificate of member
   * </pre>
   *
   * <code>string x509_cert = 3;</code>
   *
   * @return Whether the x509Cert field is set.
   */
  boolean hasX509Cert();
  /**
   *
   *
   * <pre>
   * X.509 certificate of member
   * </pre>
   *
   * <code>string x509_cert = 3;</code>
   *
   * @return The x509Cert.
   */
  java.lang.String getX509Cert();
  /**
   *
   *
   * <pre>
   * X.509 certificate of member
   * </pre>
   *
   * <code>string x509_cert = 3;</code>
   *
   * @return The bytes for x509Cert.
   */
  com.google.protobuf.ByteString getX509CertBytes();

  /**
   *
   *
   * <pre>
   * URI of credential schema associated with membership
   * </pre>
   *
   * <code>string schema_uri = 4;</code>
   *
   * @return The schemaUri.
   */
  java.lang.String getSchemaUri();
  /**
   *
   *
   * <pre>
   * URI of credential schema associated with membership
   * </pre>
   *
   * <code>string schema_uri = 4;</code>
   *
   * @return The bytes for schemaUri.
   */
  com.google.protobuf.ByteString getSchemaUriBytes();

  public trinsic.services.trustregistry.v1.GetMembershipStatusRequest.MemberCase getMemberCase();
}