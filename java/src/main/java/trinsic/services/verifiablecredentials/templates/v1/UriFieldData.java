// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/verifiable-credentials/templates/v1/templates.proto

package trinsic.services.verifiablecredentials.templates.v1;

/**
 *
 *
 * <pre>
 * Data pertaining to a URI Field
 * </pre>
 *
 * Protobuf type {@code services.verifiablecredentials.templates.v1.UriFieldData}
 */
public final class UriFieldData extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.verifiablecredentials.templates.v1.UriFieldData)
    UriFieldDataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UriFieldData.newBuilder() to construct.
  private UriFieldData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UriFieldData() {
    mimeType_ = "";
    renderMethod_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UriFieldData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.verifiablecredentials.templates.v1.Templates
        .internal_static_services_verifiablecredentials_templates_v1_UriFieldData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.verifiablecredentials.templates.v1.Templates
        .internal_static_services_verifiablecredentials_templates_v1_UriFieldData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.verifiablecredentials.templates.v1.UriFieldData.class,
            trinsic.services.verifiablecredentials.templates.v1.UriFieldData.Builder.class);
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object mimeType_;
  /**
   *
   *
   * <pre>
   * Expected MIME Type of content pointed to by URI. Can be generic (eg, "image/") or specific ("image/png").
   * Defaults to "application/octet-stream".
   * </pre>
   *
   * <code>string mime_type = 1;</code>
   *
   * @return The mimeType.
   */
  @java.lang.Override
  public java.lang.String getMimeType() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mimeType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Expected MIME Type of content pointed to by URI. Can be generic (eg, "image/") or specific ("image/png").
   * Defaults to "application/octet-stream".
   * </pre>
   *
   * <code>string mime_type = 1;</code>
   *
   * @return The bytes for mimeType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMimeTypeBytes() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      mimeType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RENDER_METHOD_FIELD_NUMBER = 2;
  private int renderMethod_;
  /**
   *
   *
   * <pre>
   * How to display the URI value when rendering a credential.
   * </pre>
   *
   * <code>.services.verifiablecredentials.templates.v1.UriRenderMethod render_method = 2;</code>
   *
   * @return The enum numeric value on the wire for renderMethod.
   */
  @java.lang.Override
  public int getRenderMethodValue() {
    return renderMethod_;
  }
  /**
   *
   *
   * <pre>
   * How to display the URI value when rendering a credential.
   * </pre>
   *
   * <code>.services.verifiablecredentials.templates.v1.UriRenderMethod render_method = 2;</code>
   *
   * @return The renderMethod.
   */
  @java.lang.Override
  public trinsic.services.verifiablecredentials.templates.v1.UriRenderMethod getRenderMethod() {
    @SuppressWarnings("deprecation")
    trinsic.services.verifiablecredentials.templates.v1.UriRenderMethod result =
        trinsic.services.verifiablecredentials.templates.v1.UriRenderMethod.valueOf(renderMethod_);
    return result == null
        ? trinsic.services.verifiablecredentials.templates.v1.UriRenderMethod.UNRECOGNIZED
        : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mimeType_);
    }
    if (renderMethod_
        != trinsic.services.verifiablecredentials.templates.v1.UriRenderMethod.TEXT.getNumber()) {
      output.writeEnum(2, renderMethod_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mimeType_);
    }
    if (renderMethod_
        != trinsic.services.verifiablecredentials.templates.v1.UriRenderMethod.TEXT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, renderMethod_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof trinsic.services.verifiablecredentials.templates.v1.UriFieldData)) {
      return super.equals(obj);
    }
    trinsic.services.verifiablecredentials.templates.v1.UriFieldData other =
        (trinsic.services.verifiablecredentials.templates.v1.UriFieldData) obj;

    if (!getMimeType().equals(other.getMimeType())) return false;
    if (renderMethod_ != other.renderMethod_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMimeType().hashCode();
    hash = (37 * hash) + RENDER_METHOD_FIELD_NUMBER;
    hash = (53 * hash) + renderMethod_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.verifiablecredentials.templates.v1.UriFieldData parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.templates.v1.UriFieldData parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.templates.v1.UriFieldData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.templates.v1.UriFieldData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.templates.v1.UriFieldData parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.templates.v1.UriFieldData parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.templates.v1.UriFieldData parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.templates.v1.UriFieldData parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.templates.v1.UriFieldData parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.templates.v1.UriFieldData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.templates.v1.UriFieldData parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.templates.v1.UriFieldData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      trinsic.services.verifiablecredentials.templates.v1.UriFieldData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Data pertaining to a URI Field
   * </pre>
   *
   * Protobuf type {@code services.verifiablecredentials.templates.v1.UriFieldData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.verifiablecredentials.templates.v1.UriFieldData)
      trinsic.services.verifiablecredentials.templates.v1.UriFieldDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.verifiablecredentials.templates.v1.Templates
          .internal_static_services_verifiablecredentials_templates_v1_UriFieldData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.verifiablecredentials.templates.v1.Templates
          .internal_static_services_verifiablecredentials_templates_v1_UriFieldData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.verifiablecredentials.templates.v1.UriFieldData.class,
              trinsic.services.verifiablecredentials.templates.v1.UriFieldData.Builder.class);
    }

    // Construct using trinsic.services.verifiablecredentials.templates.v1.UriFieldData.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      mimeType_ = "";

      renderMethod_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.verifiablecredentials.templates.v1.Templates
          .internal_static_services_verifiablecredentials_templates_v1_UriFieldData_descriptor;
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.templates.v1.UriFieldData
        getDefaultInstanceForType() {
      return trinsic.services.verifiablecredentials.templates.v1.UriFieldData.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.templates.v1.UriFieldData build() {
      trinsic.services.verifiablecredentials.templates.v1.UriFieldData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.templates.v1.UriFieldData buildPartial() {
      trinsic.services.verifiablecredentials.templates.v1.UriFieldData result =
          new trinsic.services.verifiablecredentials.templates.v1.UriFieldData(this);
      result.mimeType_ = mimeType_;
      result.renderMethod_ = renderMethod_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof trinsic.services.verifiablecredentials.templates.v1.UriFieldData) {
        return mergeFrom((trinsic.services.verifiablecredentials.templates.v1.UriFieldData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        trinsic.services.verifiablecredentials.templates.v1.UriFieldData other) {
      if (other
          == trinsic.services.verifiablecredentials.templates.v1.UriFieldData.getDefaultInstance())
        return this;
      if (!other.getMimeType().isEmpty()) {
        mimeType_ = other.mimeType_;
        onChanged();
      }
      if (other.renderMethod_ != 0) {
        setRenderMethodValue(other.getRenderMethodValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                mimeType_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 16:
              {
                renderMethod_ = input.readEnum();

                break;
              } // case 16
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object mimeType_ = "";
    /**
     *
     *
     * <pre>
     * Expected MIME Type of content pointed to by URI. Can be generic (eg, "image/") or specific ("image/png").
     * Defaults to "application/octet-stream".
     * </pre>
     *
     * <code>string mime_type = 1;</code>
     *
     * @return The mimeType.
     */
    public java.lang.String getMimeType() {
      java.lang.Object ref = mimeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mimeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Expected MIME Type of content pointed to by URI. Can be generic (eg, "image/") or specific ("image/png").
     * Defaults to "application/octet-stream".
     * </pre>
     *
     * <code>string mime_type = 1;</code>
     *
     * @return The bytes for mimeType.
     */
    public com.google.protobuf.ByteString getMimeTypeBytes() {
      java.lang.Object ref = mimeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        mimeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Expected MIME Type of content pointed to by URI. Can be generic (eg, "image/") or specific ("image/png").
     * Defaults to "application/octet-stream".
     * </pre>
     *
     * <code>string mime_type = 1;</code>
     *
     * @param value The mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      mimeType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Expected MIME Type of content pointed to by URI. Can be generic (eg, "image/") or specific ("image/png").
     * Defaults to "application/octet-stream".
     * </pre>
     *
     * <code>string mime_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMimeType() {

      mimeType_ = getDefaultInstance().getMimeType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Expected MIME Type of content pointed to by URI. Can be generic (eg, "image/") or specific ("image/png").
     * Defaults to "application/octet-stream".
     * </pre>
     *
     * <code>string mime_type = 1;</code>
     *
     * @param value The bytes for mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      mimeType_ = value;
      onChanged();
      return this;
    }

    private int renderMethod_ = 0;
    /**
     *
     *
     * <pre>
     * How to display the URI value when rendering a credential.
     * </pre>
     *
     * <code>.services.verifiablecredentials.templates.v1.UriRenderMethod render_method = 2;</code>
     *
     * @return The enum numeric value on the wire for renderMethod.
     */
    @java.lang.Override
    public int getRenderMethodValue() {
      return renderMethod_;
    }
    /**
     *
     *
     * <pre>
     * How to display the URI value when rendering a credential.
     * </pre>
     *
     * <code>.services.verifiablecredentials.templates.v1.UriRenderMethod render_method = 2;</code>
     *
     * @param value The enum numeric value on the wire for renderMethod to set.
     * @return This builder for chaining.
     */
    public Builder setRenderMethodValue(int value) {

      renderMethod_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How to display the URI value when rendering a credential.
     * </pre>
     *
     * <code>.services.verifiablecredentials.templates.v1.UriRenderMethod render_method = 2;</code>
     *
     * @return The renderMethod.
     */
    @java.lang.Override
    public trinsic.services.verifiablecredentials.templates.v1.UriRenderMethod getRenderMethod() {
      @SuppressWarnings("deprecation")
      trinsic.services.verifiablecredentials.templates.v1.UriRenderMethod result =
          trinsic.services.verifiablecredentials.templates.v1.UriRenderMethod.valueOf(
              renderMethod_);
      return result == null
          ? trinsic.services.verifiablecredentials.templates.v1.UriRenderMethod.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * How to display the URI value when rendering a credential.
     * </pre>
     *
     * <code>.services.verifiablecredentials.templates.v1.UriRenderMethod render_method = 2;</code>
     *
     * @param value The renderMethod to set.
     * @return This builder for chaining.
     */
    public Builder setRenderMethod(
        trinsic.services.verifiablecredentials.templates.v1.UriRenderMethod value) {
      if (value == null) {
        throw new NullPointerException();
      }

      renderMethod_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How to display the URI value when rendering a credential.
     * </pre>
     *
     * <code>.services.verifiablecredentials.templates.v1.UriRenderMethod render_method = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRenderMethod() {

      renderMethod_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:services.verifiablecredentials.templates.v1.UriFieldData)
  }

  // @@protoc_insertion_point(class_scope:services.verifiablecredentials.templates.v1.UriFieldData)
  private static final trinsic.services.verifiablecredentials.templates.v1.UriFieldData
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.verifiablecredentials.templates.v1.UriFieldData();
  }

  public static trinsic.services.verifiablecredentials.templates.v1.UriFieldData
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UriFieldData> PARSER =
      new com.google.protobuf.AbstractParser<UriFieldData>() {
        @java.lang.Override
        public UriFieldData parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UriFieldData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UriFieldData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.verifiablecredentials.templates.v1.UriFieldData
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
