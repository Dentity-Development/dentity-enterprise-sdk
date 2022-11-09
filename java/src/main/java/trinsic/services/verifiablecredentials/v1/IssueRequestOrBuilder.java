// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/verifiable-credentials/v1/verifiable-credentials.proto

package trinsic.services.verifiablecredentials.v1;

public interface IssueRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.verifiablecredentials.v1.IssueRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Valid JSON-LD Credential document to be signed, in string form
   * </pre>
   *
   * <code>string document_json = 1;</code>
   *
   * @return The documentJson.
   */
  java.lang.String getDocumentJson();
  /**
   *
   *
   * <pre>
   * Valid JSON-LD Credential document to be signed, in string form
   * </pre>
   *
   * <code>string document_json = 1;</code>
   *
   * @return The bytes for documentJson.
   */
  com.google.protobuf.ByteString getDocumentJsonBytes();
}
