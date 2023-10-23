// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/universal-wallet/v1/universal-wallet.proto

package trinsic.services.universalwallet.v1;

/** Protobuf type {@code services.universalwallet.v1.GetWalletFromExternalIdentityRequest} */
public final class GetWalletFromExternalIdentityRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.universalwallet.v1.GetWalletFromExternalIdentityRequest)
    GetWalletFromExternalIdentityRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetWalletFromExternalIdentityRequest.newBuilder() to construct.
  private GetWalletFromExternalIdentityRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetWalletFromExternalIdentityRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetWalletFromExternalIdentityRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.universalwallet.v1.UniversalWalletOuterClass
        .internal_static_services_universalwallet_v1_GetWalletFromExternalIdentityRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.universalwallet.v1.UniversalWalletOuterClass
        .internal_static_services_universalwallet_v1_GetWalletFromExternalIdentityRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest.class,
            trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest.Builder.class);
  }

  public static final int IDENTITY_FIELD_NUMBER = 1;
  private trinsic.services.provider.v1.WalletExternalIdentity identity_;
  /**
   * <code>.services.provider.v1.WalletExternalIdentity identity = 1;</code>
   *
   * @return Whether the identity field is set.
   */
  @java.lang.Override
  public boolean hasIdentity() {
    return identity_ != null;
  }
  /**
   * <code>.services.provider.v1.WalletExternalIdentity identity = 1;</code>
   *
   * @return The identity.
   */
  @java.lang.Override
  public trinsic.services.provider.v1.WalletExternalIdentity getIdentity() {
    return identity_ == null
        ? trinsic.services.provider.v1.WalletExternalIdentity.getDefaultInstance()
        : identity_;
  }
  /** <code>.services.provider.v1.WalletExternalIdentity identity = 1;</code> */
  @java.lang.Override
  public trinsic.services.provider.v1.WalletExternalIdentityOrBuilder getIdentityOrBuilder() {
    return getIdentity();
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
    if (identity_ != null) {
      output.writeMessage(1, getIdentity());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (identity_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getIdentity());
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
    if (!(obj
        instanceof trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest)) {
      return super.equals(obj);
    }
    trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest other =
        (trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest) obj;

    if (hasIdentity() != other.hasIdentity()) return false;
    if (hasIdentity()) {
      if (!getIdentity().equals(other.getIdentity())) return false;
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
    if (hasIdentity()) {
      hash = (37 * hash) + IDENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getIdentity().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest parseFrom(
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
      trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest prototype) {
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
  /** Protobuf type {@code services.universalwallet.v1.GetWalletFromExternalIdentityRequest} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.universalwallet.v1.GetWalletFromExternalIdentityRequest)
      trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.universalwallet.v1.UniversalWalletOuterClass
          .internal_static_services_universalwallet_v1_GetWalletFromExternalIdentityRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.universalwallet.v1.UniversalWalletOuterClass
          .internal_static_services_universalwallet_v1_GetWalletFromExternalIdentityRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest.class,
              trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest.Builder
                  .class);
    }

    // Construct using
    // trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (identityBuilder_ == null) {
        identity_ = null;
      } else {
        identity_ = null;
        identityBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.universalwallet.v1.UniversalWalletOuterClass
          .internal_static_services_universalwallet_v1_GetWalletFromExternalIdentityRequest_descriptor;
    }

    @java.lang.Override
    public trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest
        getDefaultInstanceForType() {
      return trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest build() {
      trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest buildPartial() {
      trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest result =
          new trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest(this);
      if (identityBuilder_ == null) {
        result.identity_ = identity_;
      } else {
        result.identity_ = identityBuilder_.build();
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
      if (other
          instanceof trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest) {
        return mergeFrom(
            (trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest other) {
      if (other
          == trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest
              .getDefaultInstance()) return this;
      if (other.hasIdentity()) {
        mergeIdentity(other.getIdentity());
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
                input.readMessage(getIdentityFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
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

    private trinsic.services.provider.v1.WalletExternalIdentity identity_;
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.provider.v1.WalletExternalIdentity,
            trinsic.services.provider.v1.WalletExternalIdentity.Builder,
            trinsic.services.provider.v1.WalletExternalIdentityOrBuilder>
        identityBuilder_;
    /**
     * <code>.services.provider.v1.WalletExternalIdentity identity = 1;</code>
     *
     * @return Whether the identity field is set.
     */
    public boolean hasIdentity() {
      return identityBuilder_ != null || identity_ != null;
    }
    /**
     * <code>.services.provider.v1.WalletExternalIdentity identity = 1;</code>
     *
     * @return The identity.
     */
    public trinsic.services.provider.v1.WalletExternalIdentity getIdentity() {
      if (identityBuilder_ == null) {
        return identity_ == null
            ? trinsic.services.provider.v1.WalletExternalIdentity.getDefaultInstance()
            : identity_;
      } else {
        return identityBuilder_.getMessage();
      }
    }
    /** <code>.services.provider.v1.WalletExternalIdentity identity = 1;</code> */
    public Builder setIdentity(trinsic.services.provider.v1.WalletExternalIdentity value) {
      if (identityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        identity_ = value;
        onChanged();
      } else {
        identityBuilder_.setMessage(value);
      }

      return this;
    }
    /** <code>.services.provider.v1.WalletExternalIdentity identity = 1;</code> */
    public Builder setIdentity(
        trinsic.services.provider.v1.WalletExternalIdentity.Builder builderForValue) {
      if (identityBuilder_ == null) {
        identity_ = builderForValue.build();
        onChanged();
      } else {
        identityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /** <code>.services.provider.v1.WalletExternalIdentity identity = 1;</code> */
    public Builder mergeIdentity(trinsic.services.provider.v1.WalletExternalIdentity value) {
      if (identityBuilder_ == null) {
        if (identity_ != null) {
          identity_ =
              trinsic.services.provider.v1.WalletExternalIdentity.newBuilder(identity_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          identity_ = value;
        }
        onChanged();
      } else {
        identityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /** <code>.services.provider.v1.WalletExternalIdentity identity = 1;</code> */
    public Builder clearIdentity() {
      if (identityBuilder_ == null) {
        identity_ = null;
        onChanged();
      } else {
        identity_ = null;
        identityBuilder_ = null;
      }

      return this;
    }
    /** <code>.services.provider.v1.WalletExternalIdentity identity = 1;</code> */
    public trinsic.services.provider.v1.WalletExternalIdentity.Builder getIdentityBuilder() {

      onChanged();
      return getIdentityFieldBuilder().getBuilder();
    }
    /** <code>.services.provider.v1.WalletExternalIdentity identity = 1;</code> */
    public trinsic.services.provider.v1.WalletExternalIdentityOrBuilder getIdentityOrBuilder() {
      if (identityBuilder_ != null) {
        return identityBuilder_.getMessageOrBuilder();
      } else {
        return identity_ == null
            ? trinsic.services.provider.v1.WalletExternalIdentity.getDefaultInstance()
            : identity_;
      }
    }
    /** <code>.services.provider.v1.WalletExternalIdentity identity = 1;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.provider.v1.WalletExternalIdentity,
            trinsic.services.provider.v1.WalletExternalIdentity.Builder,
            trinsic.services.provider.v1.WalletExternalIdentityOrBuilder>
        getIdentityFieldBuilder() {
      if (identityBuilder_ == null) {
        identityBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                trinsic.services.provider.v1.WalletExternalIdentity,
                trinsic.services.provider.v1.WalletExternalIdentity.Builder,
                trinsic.services.provider.v1.WalletExternalIdentityOrBuilder>(
                getIdentity(), getParentForChildren(), isClean());
        identity_ = null;
      }
      return identityBuilder_;
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

    // @@protoc_insertion_point(builder_scope:services.universalwallet.v1.GetWalletFromExternalIdentityRequest)
  }

  // @@protoc_insertion_point(class_scope:services.universalwallet.v1.GetWalletFromExternalIdentityRequest)
  private static final trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest();
  }

  public static trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetWalletFromExternalIdentityRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetWalletFromExternalIdentityRequest>() {
        @java.lang.Override
        public GetWalletFromExternalIdentityRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetWalletFromExternalIdentityRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetWalletFromExternalIdentityRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.universalwallet.v1.GetWalletFromExternalIdentityRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}