// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/verifiable-credentials/v1/verifiable-credentials.proto

package trinsic.services.verifiablecredentials.v1;

public interface IssueFromTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.verifiablecredentials.v1.IssueFromTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of template to use
   * </pre>
   *
   * <code>string template_id = 1;</code>
   * @return The templateId.
   */
  java.lang.String getTemplateId();
  /**
   * <pre>
   * ID of template to use
   * </pre>
   *
   * <code>string template_id = 1;</code>
   * @return The bytes for templateId.
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes();

  /**
   * <pre>
   * JSON document string with keys corresponding to the fields of
   * the template referenced by `template_id`
   * </pre>
   *
   * <code>string values_json = 2;</code>
   * @return The valuesJson.
   */
  java.lang.String getValuesJson();
  /**
   * <pre>
   * JSON document string with keys corresponding to the fields of
   * the template referenced by `template_id`
   * </pre>
   *
   * <code>string values_json = 2;</code>
   * @return The bytes for valuesJson.
   */
  com.google.protobuf.ByteString
      getValuesJsonBytes();

  /**
   * <pre>
   * Governance framework ID to use with issuance of this credential.
   * If specified, the issued credential will contain extended issuer
   * metadata with membership info for the given ecosystem governance framework (EGF)
   * </pre>
   *
   * <code>string framework_id = 3 [(.services.options.optional) = true];</code>
   * @return The frameworkId.
   */
  java.lang.String getFrameworkId();
  /**
   * <pre>
   * Governance framework ID to use with issuance of this credential.
   * If specified, the issued credential will contain extended issuer
   * metadata with membership info for the given ecosystem governance framework (EGF)
   * </pre>
   *
   * <code>string framework_id = 3 [(.services.options.optional) = true];</code>
   * @return The bytes for frameworkId.
   */
  com.google.protobuf.ByteString
      getFrameworkIdBytes();
}
