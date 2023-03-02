// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/provider.proto

package trinsic.services.provider.v1;

/** Protobuf type {@code services.provider.v1.EcosystemDisplayDetails} */
public final class EcosystemDisplayDetails extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.provider.v1.EcosystemDisplayDetails)
    EcosystemDisplayDetailsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EcosystemDisplayDetails.newBuilder() to construct.
  private EcosystemDisplayDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EcosystemDisplayDetails() {
    logoUrl_ = "";
    color_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EcosystemDisplayDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.provider.v1.ProviderOuterClass
        .internal_static_services_provider_v1_EcosystemDisplayDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.provider.v1.ProviderOuterClass
        .internal_static_services_provider_v1_EcosystemDisplayDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.provider.v1.EcosystemDisplayDetails.class,
            trinsic.services.provider.v1.EcosystemDisplayDetails.Builder.class);
  }

  public static final int LOGO_URL_FIELD_NUMBER = 3;
  private volatile java.lang.Object logoUrl_;
  /**
   * <code>string logo_url = 3;</code>
   *
   * @return The logoUrl.
   */
  @java.lang.Override
  public java.lang.String getLogoUrl() {
    java.lang.Object ref = logoUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logoUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string logo_url = 3;</code>
   *
   * @return The bytes for logoUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLogoUrlBytes() {
    java.lang.Object ref = logoUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      logoUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLOR_FIELD_NUMBER = 4;
  private volatile java.lang.Object color_;
  /**
   * <code>string color = 4;</code>
   *
   * @return The color.
   */
  @java.lang.Override
  public java.lang.String getColor() {
    java.lang.Object ref = color_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      color_ = s;
      return s;
    }
  }
  /**
   * <code>string color = 4;</code>
   *
   * @return The bytes for color.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getColorBytes() {
    java.lang.Object ref = color_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      color_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logoUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, logoUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(color_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, color_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logoUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, logoUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(color_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, color_);
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
    if (!(obj instanceof trinsic.services.provider.v1.EcosystemDisplayDetails)) {
      return super.equals(obj);
    }
    trinsic.services.provider.v1.EcosystemDisplayDetails other =
        (trinsic.services.provider.v1.EcosystemDisplayDetails) obj;

    if (!getLogoUrl().equals(other.getLogoUrl())) return false;
    if (!getColor().equals(other.getColor())) return false;
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
    hash = (37 * hash) + LOGO_URL_FIELD_NUMBER;
    hash = (53 * hash) + getLogoUrl().hashCode();
    hash = (37 * hash) + COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getColor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.provider.v1.EcosystemDisplayDetails parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayDetails parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayDetails parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayDetails parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayDetails parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayDetails parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayDetails parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayDetails parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayDetails parseFrom(
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

  public static Builder newBuilder(trinsic.services.provider.v1.EcosystemDisplayDetails prototype) {
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
  /** Protobuf type {@code services.provider.v1.EcosystemDisplayDetails} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.provider.v1.EcosystemDisplayDetails)
      trinsic.services.provider.v1.EcosystemDisplayDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_EcosystemDisplayDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_EcosystemDisplayDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.provider.v1.EcosystemDisplayDetails.class,
              trinsic.services.provider.v1.EcosystemDisplayDetails.Builder.class);
    }

    // Construct using trinsic.services.provider.v1.EcosystemDisplayDetails.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      logoUrl_ = "";

      color_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_EcosystemDisplayDetails_descriptor;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.EcosystemDisplayDetails getDefaultInstanceForType() {
      return trinsic.services.provider.v1.EcosystemDisplayDetails.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.provider.v1.EcosystemDisplayDetails build() {
      trinsic.services.provider.v1.EcosystemDisplayDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.EcosystemDisplayDetails buildPartial() {
      trinsic.services.provider.v1.EcosystemDisplayDetails result =
          new trinsic.services.provider.v1.EcosystemDisplayDetails(this);
      result.logoUrl_ = logoUrl_;
      result.color_ = color_;
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
      if (other instanceof trinsic.services.provider.v1.EcosystemDisplayDetails) {
        return mergeFrom((trinsic.services.provider.v1.EcosystemDisplayDetails) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.provider.v1.EcosystemDisplayDetails other) {
      if (other == trinsic.services.provider.v1.EcosystemDisplayDetails.getDefaultInstance())
        return this;
      if (!other.getLogoUrl().isEmpty()) {
        logoUrl_ = other.logoUrl_;
        onChanged();
      }
      if (!other.getColor().isEmpty()) {
        color_ = other.color_;
        onChanged();
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
            case 26:
              {
                logoUrl_ = input.readStringRequireUtf8();

                break;
              } // case 26
            case 34:
              {
                color_ = input.readStringRequireUtf8();

                break;
              } // case 34
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

    private java.lang.Object logoUrl_ = "";
    /**
     * <code>string logo_url = 3;</code>
     *
     * @return The logoUrl.
     */
    public java.lang.String getLogoUrl() {
      java.lang.Object ref = logoUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logoUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string logo_url = 3;</code>
     *
     * @return The bytes for logoUrl.
     */
    public com.google.protobuf.ByteString getLogoUrlBytes() {
      java.lang.Object ref = logoUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        logoUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string logo_url = 3;</code>
     *
     * @param value The logoUrl to set.
     * @return This builder for chaining.
     */
    public Builder setLogoUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      logoUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string logo_url = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLogoUrl() {

      logoUrl_ = getDefaultInstance().getLogoUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string logo_url = 3;</code>
     *
     * @param value The bytes for logoUrl to set.
     * @return This builder for chaining.
     */
    public Builder setLogoUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      logoUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object color_ = "";
    /**
     * <code>string color = 4;</code>
     *
     * @return The color.
     */
    public java.lang.String getColor() {
      java.lang.Object ref = color_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        color_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string color = 4;</code>
     *
     * @return The bytes for color.
     */
    public com.google.protobuf.ByteString getColorBytes() {
      java.lang.Object ref = color_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        color_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string color = 4;</code>
     *
     * @param value The color to set.
     * @return This builder for chaining.
     */
    public Builder setColor(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      color_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string color = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearColor() {

      color_ = getDefaultInstance().getColor();
      onChanged();
      return this;
    }
    /**
     * <code>string color = 4;</code>
     *
     * @param value The bytes for color to set.
     * @return This builder for chaining.
     */
    public Builder setColorBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      color_ = value;
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

    // @@protoc_insertion_point(builder_scope:services.provider.v1.EcosystemDisplayDetails)
  }

  // @@protoc_insertion_point(class_scope:services.provider.v1.EcosystemDisplayDetails)
  private static final trinsic.services.provider.v1.EcosystemDisplayDetails DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.provider.v1.EcosystemDisplayDetails();
  }

  public static trinsic.services.provider.v1.EcosystemDisplayDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EcosystemDisplayDetails> PARSER =
      new com.google.protobuf.AbstractParser<EcosystemDisplayDetails>() {
        @java.lang.Override
        public EcosystemDisplayDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<EcosystemDisplayDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EcosystemDisplayDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.provider.v1.EcosystemDisplayDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
