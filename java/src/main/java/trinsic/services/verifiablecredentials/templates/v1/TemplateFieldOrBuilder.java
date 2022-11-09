// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/verifiable-credentials/templates/v1/templates.proto

package trinsic.services.verifiablecredentials.templates.v1;

public interface TemplateFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.verifiablecredentials.templates.v1.TemplateField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Human-readable description of the field
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Human-readable description of the field
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Whether this field may be omitted when a credential is issued against the template
   * </pre>
   *
   * <code>bool optional = 3;</code>
   * @return The optional.
   */
  boolean getOptional();

  /**
   * <pre>
   * The type of the field
   * </pre>
   *
   * <code>.services.verifiablecredentials.templates.v1.FieldType type = 4;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of the field
   * </pre>
   *
   * <code>.services.verifiablecredentials.templates.v1.FieldType type = 4;</code>
   * @return The type.
   */
  trinsic.services.verifiablecredentials.templates.v1.FieldType getType();
}
