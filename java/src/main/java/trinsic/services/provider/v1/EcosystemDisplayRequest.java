// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/provider.proto

package trinsic.services.provider.v1;

/** Protobuf type {@code services.provider.v1.EcosystemDisplayRequest} */
public final class EcosystemDisplayRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.provider.v1.EcosystemDisplayRequest)
    EcosystemDisplayRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EcosystemDisplayRequest.newBuilder() to construct.
  private EcosystemDisplayRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EcosystemDisplayRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EcosystemDisplayRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.provider.v1.ProviderOuterClass
        .internal_static_services_provider_v1_EcosystemDisplayRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.provider.v1.ProviderOuterClass
        .internal_static_services_provider_v1_EcosystemDisplayRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.provider.v1.EcosystemDisplayRequest.class,
            trinsic.services.provider.v1.EcosystemDisplayRequest.Builder.class);
  }

  public static final int DARK_FIELD_NUMBER = 1;
  private trinsic.services.provider.v1.EcosystemDisplayDetailsRequest dark_;
  /**
   * <code>.services.provider.v1.EcosystemDisplayDetailsRequest dark = 1;</code>
   *
   * @return Whether the dark field is set.
   */
  @java.lang.Override
  public boolean hasDark() {
    return dark_ != null;
  }
  /**
   * <code>.services.provider.v1.EcosystemDisplayDetailsRequest dark = 1;</code>
   *
   * @return The dark.
   */
  @java.lang.Override
  public trinsic.services.provider.v1.EcosystemDisplayDetailsRequest getDark() {
    return dark_ == null
        ? trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.getDefaultInstance()
        : dark_;
  }
  /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest dark = 1;</code> */
  @java.lang.Override
  public trinsic.services.provider.v1.EcosystemDisplayDetailsRequestOrBuilder getDarkOrBuilder() {
    return getDark();
  }

  public static final int LIGHT_FIELD_NUMBER = 2;
  private trinsic.services.provider.v1.EcosystemDisplayDetailsRequest light_;
  /**
   * <code>.services.provider.v1.EcosystemDisplayDetailsRequest light = 2;</code>
   *
   * @return Whether the light field is set.
   */
  @java.lang.Override
  public boolean hasLight() {
    return light_ != null;
  }
  /**
   * <code>.services.provider.v1.EcosystemDisplayDetailsRequest light = 2;</code>
   *
   * @return The light.
   */
  @java.lang.Override
  public trinsic.services.provider.v1.EcosystemDisplayDetailsRequest getLight() {
    return light_ == null
        ? trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.getDefaultInstance()
        : light_;
  }
  /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest light = 2;</code> */
  @java.lang.Override
  public trinsic.services.provider.v1.EcosystemDisplayDetailsRequestOrBuilder getLightOrBuilder() {
    return getLight();
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
    if (dark_ != null) {
      output.writeMessage(1, getDark());
    }
    if (light_ != null) {
      output.writeMessage(2, getLight());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dark_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDark());
    }
    if (light_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getLight());
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
    if (!(obj instanceof trinsic.services.provider.v1.EcosystemDisplayRequest)) {
      return super.equals(obj);
    }
    trinsic.services.provider.v1.EcosystemDisplayRequest other =
        (trinsic.services.provider.v1.EcosystemDisplayRequest) obj;

    if (hasDark() != other.hasDark()) return false;
    if (hasDark()) {
      if (!getDark().equals(other.getDark())) return false;
    }
    if (hasLight() != other.hasLight()) return false;
    if (hasLight()) {
      if (!getLight().equals(other.getLight())) return false;
    }
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
    if (hasDark()) {
      hash = (37 * hash) + DARK_FIELD_NUMBER;
      hash = (53 * hash) + getDark().hashCode();
    }
    if (hasLight()) {
      hash = (37 * hash) + LIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getLight().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.provider.v1.EcosystemDisplayRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.EcosystemDisplayRequest parseFrom(
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

  public static Builder newBuilder(trinsic.services.provider.v1.EcosystemDisplayRequest prototype) {
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
  /** Protobuf type {@code services.provider.v1.EcosystemDisplayRequest} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.provider.v1.EcosystemDisplayRequest)
      trinsic.services.provider.v1.EcosystemDisplayRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_EcosystemDisplayRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_EcosystemDisplayRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.provider.v1.EcosystemDisplayRequest.class,
              trinsic.services.provider.v1.EcosystemDisplayRequest.Builder.class);
    }

    // Construct using trinsic.services.provider.v1.EcosystemDisplayRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (darkBuilder_ == null) {
        dark_ = null;
      } else {
        dark_ = null;
        darkBuilder_ = null;
      }
      if (lightBuilder_ == null) {
        light_ = null;
      } else {
        light_ = null;
        lightBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_EcosystemDisplayRequest_descriptor;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.EcosystemDisplayRequest getDefaultInstanceForType() {
      return trinsic.services.provider.v1.EcosystemDisplayRequest.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.provider.v1.EcosystemDisplayRequest build() {
      trinsic.services.provider.v1.EcosystemDisplayRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.EcosystemDisplayRequest buildPartial() {
      trinsic.services.provider.v1.EcosystemDisplayRequest result =
          new trinsic.services.provider.v1.EcosystemDisplayRequest(this);
      if (darkBuilder_ == null) {
        result.dark_ = dark_;
      } else {
        result.dark_ = darkBuilder_.build();
      }
      if (lightBuilder_ == null) {
        result.light_ = light_;
      } else {
        result.light_ = lightBuilder_.build();
      }
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
      if (other instanceof trinsic.services.provider.v1.EcosystemDisplayRequest) {
        return mergeFrom((trinsic.services.provider.v1.EcosystemDisplayRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.provider.v1.EcosystemDisplayRequest other) {
      if (other == trinsic.services.provider.v1.EcosystemDisplayRequest.getDefaultInstance())
        return this;
      if (other.hasDark()) {
        mergeDark(other.getDark());
      }
      if (other.hasLight()) {
        mergeLight(other.getLight());
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
                input.readMessage(getDarkFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getLightFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
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

    private trinsic.services.provider.v1.EcosystemDisplayDetailsRequest dark_;
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.provider.v1.EcosystemDisplayDetailsRequest,
            trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.Builder,
            trinsic.services.provider.v1.EcosystemDisplayDetailsRequestOrBuilder>
        darkBuilder_;
    /**
     * <code>.services.provider.v1.EcosystemDisplayDetailsRequest dark = 1;</code>
     *
     * @return Whether the dark field is set.
     */
    public boolean hasDark() {
      return darkBuilder_ != null || dark_ != null;
    }
    /**
     * <code>.services.provider.v1.EcosystemDisplayDetailsRequest dark = 1;</code>
     *
     * @return The dark.
     */
    public trinsic.services.provider.v1.EcosystemDisplayDetailsRequest getDark() {
      if (darkBuilder_ == null) {
        return dark_ == null
            ? trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.getDefaultInstance()
            : dark_;
      } else {
        return darkBuilder_.getMessage();
      }
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest dark = 1;</code> */
    public Builder setDark(trinsic.services.provider.v1.EcosystemDisplayDetailsRequest value) {
      if (darkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dark_ = value;
        onChanged();
      } else {
        darkBuilder_.setMessage(value);
      }

      return this;
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest dark = 1;</code> */
    public Builder setDark(
        trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.Builder builderForValue) {
      if (darkBuilder_ == null) {
        dark_ = builderForValue.build();
        onChanged();
      } else {
        darkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest dark = 1;</code> */
    public Builder mergeDark(trinsic.services.provider.v1.EcosystemDisplayDetailsRequest value) {
      if (darkBuilder_ == null) {
        if (dark_ != null) {
          dark_ =
              trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.newBuilder(dark_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          dark_ = value;
        }
        onChanged();
      } else {
        darkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest dark = 1;</code> */
    public Builder clearDark() {
      if (darkBuilder_ == null) {
        dark_ = null;
        onChanged();
      } else {
        dark_ = null;
        darkBuilder_ = null;
      }

      return this;
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest dark = 1;</code> */
    public trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.Builder getDarkBuilder() {

      onChanged();
      return getDarkFieldBuilder().getBuilder();
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest dark = 1;</code> */
    public trinsic.services.provider.v1.EcosystemDisplayDetailsRequestOrBuilder getDarkOrBuilder() {
      if (darkBuilder_ != null) {
        return darkBuilder_.getMessageOrBuilder();
      } else {
        return dark_ == null
            ? trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.getDefaultInstance()
            : dark_;
      }
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest dark = 1;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.provider.v1.EcosystemDisplayDetailsRequest,
            trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.Builder,
            trinsic.services.provider.v1.EcosystemDisplayDetailsRequestOrBuilder>
        getDarkFieldBuilder() {
      if (darkBuilder_ == null) {
        darkBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                trinsic.services.provider.v1.EcosystemDisplayDetailsRequest,
                trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.Builder,
                trinsic.services.provider.v1.EcosystemDisplayDetailsRequestOrBuilder>(
                getDark(), getParentForChildren(), isClean());
        dark_ = null;
      }
      return darkBuilder_;
    }

    private trinsic.services.provider.v1.EcosystemDisplayDetailsRequest light_;
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.provider.v1.EcosystemDisplayDetailsRequest,
            trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.Builder,
            trinsic.services.provider.v1.EcosystemDisplayDetailsRequestOrBuilder>
        lightBuilder_;
    /**
     * <code>.services.provider.v1.EcosystemDisplayDetailsRequest light = 2;</code>
     *
     * @return Whether the light field is set.
     */
    public boolean hasLight() {
      return lightBuilder_ != null || light_ != null;
    }
    /**
     * <code>.services.provider.v1.EcosystemDisplayDetailsRequest light = 2;</code>
     *
     * @return The light.
     */
    public trinsic.services.provider.v1.EcosystemDisplayDetailsRequest getLight() {
      if (lightBuilder_ == null) {
        return light_ == null
            ? trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.getDefaultInstance()
            : light_;
      } else {
        return lightBuilder_.getMessage();
      }
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest light = 2;</code> */
    public Builder setLight(trinsic.services.provider.v1.EcosystemDisplayDetailsRequest value) {
      if (lightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        light_ = value;
        onChanged();
      } else {
        lightBuilder_.setMessage(value);
      }

      return this;
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest light = 2;</code> */
    public Builder setLight(
        trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.Builder builderForValue) {
      if (lightBuilder_ == null) {
        light_ = builderForValue.build();
        onChanged();
      } else {
        lightBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest light = 2;</code> */
    public Builder mergeLight(trinsic.services.provider.v1.EcosystemDisplayDetailsRequest value) {
      if (lightBuilder_ == null) {
        if (light_ != null) {
          light_ =
              trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.newBuilder(light_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          light_ = value;
        }
        onChanged();
      } else {
        lightBuilder_.mergeFrom(value);
      }

      return this;
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest light = 2;</code> */
    public Builder clearLight() {
      if (lightBuilder_ == null) {
        light_ = null;
        onChanged();
      } else {
        light_ = null;
        lightBuilder_ = null;
      }

      return this;
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest light = 2;</code> */
    public trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.Builder getLightBuilder() {

      onChanged();
      return getLightFieldBuilder().getBuilder();
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest light = 2;</code> */
    public trinsic.services.provider.v1.EcosystemDisplayDetailsRequestOrBuilder
        getLightOrBuilder() {
      if (lightBuilder_ != null) {
        return lightBuilder_.getMessageOrBuilder();
      } else {
        return light_ == null
            ? trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.getDefaultInstance()
            : light_;
      }
    }
    /** <code>.services.provider.v1.EcosystemDisplayDetailsRequest light = 2;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.provider.v1.EcosystemDisplayDetailsRequest,
            trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.Builder,
            trinsic.services.provider.v1.EcosystemDisplayDetailsRequestOrBuilder>
        getLightFieldBuilder() {
      if (lightBuilder_ == null) {
        lightBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                trinsic.services.provider.v1.EcosystemDisplayDetailsRequest,
                trinsic.services.provider.v1.EcosystemDisplayDetailsRequest.Builder,
                trinsic.services.provider.v1.EcosystemDisplayDetailsRequestOrBuilder>(
                getLight(), getParentForChildren(), isClean());
        light_ = null;
      }
      return lightBuilder_;
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

    // @@protoc_insertion_point(builder_scope:services.provider.v1.EcosystemDisplayRequest)
  }

  // @@protoc_insertion_point(class_scope:services.provider.v1.EcosystemDisplayRequest)
  private static final trinsic.services.provider.v1.EcosystemDisplayRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.provider.v1.EcosystemDisplayRequest();
  }

  public static trinsic.services.provider.v1.EcosystemDisplayRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EcosystemDisplayRequest> PARSER =
      new com.google.protobuf.AbstractParser<EcosystemDisplayRequest>() {
        @java.lang.Override
        public EcosystemDisplayRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<EcosystemDisplayRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EcosystemDisplayRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.provider.v1.EcosystemDisplayRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
