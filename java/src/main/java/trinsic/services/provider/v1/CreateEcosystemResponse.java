// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/provider.proto

package trinsic.services.provider.v1;

/**
 * <pre>
 * Response to `CreateEcosystemRequest`
 * </pre>
 *
 * Protobuf type {@code services.provider.v1.CreateEcosystemResponse}
 */
public final class CreateEcosystemResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.provider.v1.CreateEcosystemResponse)
    CreateEcosystemResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEcosystemResponse.newBuilder() to construct.
  private CreateEcosystemResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEcosystemResponse() {
    confirmationMethod_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateEcosystemResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateEcosystemResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            trinsic.services.provider.v1.Ecosystem.Builder subBuilder = null;
            if (ecosystem_ != null) {
              subBuilder = ecosystem_.toBuilder();
            }
            ecosystem_ = input.readMessage(trinsic.services.provider.v1.Ecosystem.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ecosystem_);
              ecosystem_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            trinsic.services.account.v1.AccountProfile.Builder subBuilder = null;
            if (profile_ != null) {
              subBuilder = profile_.toBuilder();
            }
            profile_ = input.readMessage(trinsic.services.account.v1.AccountProfile.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(profile_);
              profile_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            confirmationMethod_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return trinsic.services.provider.v1.ProviderOuterClass.internal_static_services_provider_v1_CreateEcosystemResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.provider.v1.ProviderOuterClass.internal_static_services_provider_v1_CreateEcosystemResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.provider.v1.CreateEcosystemResponse.class, trinsic.services.provider.v1.CreateEcosystemResponse.Builder.class);
  }

  public static final int ECOSYSTEM_FIELD_NUMBER = 1;
  private trinsic.services.provider.v1.Ecosystem ecosystem_;
  /**
   * <pre>
   * Details of the created ecosystem
   * </pre>
   *
   * <code>.services.provider.v1.Ecosystem ecosystem = 1;</code>
   * @return Whether the ecosystem field is set.
   */
  @java.lang.Override
  public boolean hasEcosystem() {
    return ecosystem_ != null;
  }
  /**
   * <pre>
   * Details of the created ecosystem
   * </pre>
   *
   * <code>.services.provider.v1.Ecosystem ecosystem = 1;</code>
   * @return The ecosystem.
   */
  @java.lang.Override
  public trinsic.services.provider.v1.Ecosystem getEcosystem() {
    return ecosystem_ == null ? trinsic.services.provider.v1.Ecosystem.getDefaultInstance() : ecosystem_;
  }
  /**
   * <pre>
   * Details of the created ecosystem
   * </pre>
   *
   * <code>.services.provider.v1.Ecosystem ecosystem = 1;</code>
   */
  @java.lang.Override
  public trinsic.services.provider.v1.EcosystemOrBuilder getEcosystemOrBuilder() {
    return getEcosystem();
  }

  public static final int PROFILE_FIELD_NUMBER = 2;
  private trinsic.services.account.v1.AccountProfile profile_;
  /**
   * <pre>
   * Account profile for auth of the owner of the ecosystem
   * </pre>
   *
   * <code>.services.account.v1.AccountProfile profile = 2;</code>
   * @return Whether the profile field is set.
   */
  @java.lang.Override
  public boolean hasProfile() {
    return profile_ != null;
  }
  /**
   * <pre>
   * Account profile for auth of the owner of the ecosystem
   * </pre>
   *
   * <code>.services.account.v1.AccountProfile profile = 2;</code>
   * @return The profile.
   */
  @java.lang.Override
  public trinsic.services.account.v1.AccountProfile getProfile() {
    return profile_ == null ? trinsic.services.account.v1.AccountProfile.getDefaultInstance() : profile_;
  }
  /**
   * <pre>
   * Account profile for auth of the owner of the ecosystem
   * </pre>
   *
   * <code>.services.account.v1.AccountProfile profile = 2;</code>
   */
  @java.lang.Override
  public trinsic.services.account.v1.AccountProfileOrBuilder getProfileOrBuilder() {
    return getProfile();
  }

  public static final int CONFIRMATION_METHOD_FIELD_NUMBER = 3;
  private int confirmationMethod_;
  /**
   * <pre>
   * Indicates if confirmation of account is required.
   * </pre>
   *
   * <code>.services.account.v1.ConfirmationMethod confirmation_method = 3;</code>
   * @return The enum numeric value on the wire for confirmationMethod.
   */
  @java.lang.Override public int getConfirmationMethodValue() {
    return confirmationMethod_;
  }
  /**
   * <pre>
   * Indicates if confirmation of account is required.
   * </pre>
   *
   * <code>.services.account.v1.ConfirmationMethod confirmation_method = 3;</code>
   * @return The confirmationMethod.
   */
  @java.lang.Override public trinsic.services.account.v1.ConfirmationMethod getConfirmationMethod() {
    @SuppressWarnings("deprecation")
    trinsic.services.account.v1.ConfirmationMethod result = trinsic.services.account.v1.ConfirmationMethod.valueOf(confirmationMethod_);
    return result == null ? trinsic.services.account.v1.ConfirmationMethod.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (ecosystem_ != null) {
      output.writeMessage(1, getEcosystem());
    }
    if (profile_ != null) {
      output.writeMessage(2, getProfile());
    }
    if (confirmationMethod_ != trinsic.services.account.v1.ConfirmationMethod.None.getNumber()) {
      output.writeEnum(3, confirmationMethod_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ecosystem_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEcosystem());
    }
    if (profile_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProfile());
    }
    if (confirmationMethod_ != trinsic.services.account.v1.ConfirmationMethod.None.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, confirmationMethod_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof trinsic.services.provider.v1.CreateEcosystemResponse)) {
      return super.equals(obj);
    }
    trinsic.services.provider.v1.CreateEcosystemResponse other = (trinsic.services.provider.v1.CreateEcosystemResponse) obj;

    if (hasEcosystem() != other.hasEcosystem()) return false;
    if (hasEcosystem()) {
      if (!getEcosystem()
          .equals(other.getEcosystem())) return false;
    }
    if (hasProfile() != other.hasProfile()) return false;
    if (hasProfile()) {
      if (!getProfile()
          .equals(other.getProfile())) return false;
    }
    if (confirmationMethod_ != other.confirmationMethod_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasEcosystem()) {
      hash = (37 * hash) + ECOSYSTEM_FIELD_NUMBER;
      hash = (53 * hash) + getEcosystem().hashCode();
    }
    if (hasProfile()) {
      hash = (37 * hash) + PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getProfile().hashCode();
    }
    hash = (37 * hash) + CONFIRMATION_METHOD_FIELD_NUMBER;
    hash = (53 * hash) + confirmationMethod_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.provider.v1.CreateEcosystemResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.services.provider.v1.CreateEcosystemResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.services.provider.v1.CreateEcosystemResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.services.provider.v1.CreateEcosystemResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.services.provider.v1.CreateEcosystemResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.services.provider.v1.CreateEcosystemResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.services.provider.v1.CreateEcosystemResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static trinsic.services.provider.v1.CreateEcosystemResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static trinsic.services.provider.v1.CreateEcosystemResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static trinsic.services.provider.v1.CreateEcosystemResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static trinsic.services.provider.v1.CreateEcosystemResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static trinsic.services.provider.v1.CreateEcosystemResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(trinsic.services.provider.v1.CreateEcosystemResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response to `CreateEcosystemRequest`
   * </pre>
   *
   * Protobuf type {@code services.provider.v1.CreateEcosystemResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.provider.v1.CreateEcosystemResponse)
      trinsic.services.provider.v1.CreateEcosystemResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return trinsic.services.provider.v1.ProviderOuterClass.internal_static_services_provider_v1_CreateEcosystemResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.provider.v1.ProviderOuterClass.internal_static_services_provider_v1_CreateEcosystemResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.provider.v1.CreateEcosystemResponse.class, trinsic.services.provider.v1.CreateEcosystemResponse.Builder.class);
    }

    // Construct using trinsic.services.provider.v1.CreateEcosystemResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ecosystemBuilder_ == null) {
        ecosystem_ = null;
      } else {
        ecosystem_ = null;
        ecosystemBuilder_ = null;
      }
      if (profileBuilder_ == null) {
        profile_ = null;
      } else {
        profile_ = null;
        profileBuilder_ = null;
      }
      confirmationMethod_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return trinsic.services.provider.v1.ProviderOuterClass.internal_static_services_provider_v1_CreateEcosystemResponse_descriptor;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.CreateEcosystemResponse getDefaultInstanceForType() {
      return trinsic.services.provider.v1.CreateEcosystemResponse.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.provider.v1.CreateEcosystemResponse build() {
      trinsic.services.provider.v1.CreateEcosystemResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.CreateEcosystemResponse buildPartial() {
      trinsic.services.provider.v1.CreateEcosystemResponse result = new trinsic.services.provider.v1.CreateEcosystemResponse(this);
      if (ecosystemBuilder_ == null) {
        result.ecosystem_ = ecosystem_;
      } else {
        result.ecosystem_ = ecosystemBuilder_.build();
      }
      if (profileBuilder_ == null) {
        result.profile_ = profile_;
      } else {
        result.profile_ = profileBuilder_.build();
      }
      result.confirmationMethod_ = confirmationMethod_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof trinsic.services.provider.v1.CreateEcosystemResponse) {
        return mergeFrom((trinsic.services.provider.v1.CreateEcosystemResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.provider.v1.CreateEcosystemResponse other) {
      if (other == trinsic.services.provider.v1.CreateEcosystemResponse.getDefaultInstance()) return this;
      if (other.hasEcosystem()) {
        mergeEcosystem(other.getEcosystem());
      }
      if (other.hasProfile()) {
        mergeProfile(other.getProfile());
      }
      if (other.confirmationMethod_ != 0) {
        setConfirmationMethodValue(other.getConfirmationMethodValue());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      trinsic.services.provider.v1.CreateEcosystemResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (trinsic.services.provider.v1.CreateEcosystemResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private trinsic.services.provider.v1.Ecosystem ecosystem_;
    private com.google.protobuf.SingleFieldBuilderV3<
        trinsic.services.provider.v1.Ecosystem, trinsic.services.provider.v1.Ecosystem.Builder, trinsic.services.provider.v1.EcosystemOrBuilder> ecosystemBuilder_;
    /**
     * <pre>
     * Details of the created ecosystem
     * </pre>
     *
     * <code>.services.provider.v1.Ecosystem ecosystem = 1;</code>
     * @return Whether the ecosystem field is set.
     */
    public boolean hasEcosystem() {
      return ecosystemBuilder_ != null || ecosystem_ != null;
    }
    /**
     * <pre>
     * Details of the created ecosystem
     * </pre>
     *
     * <code>.services.provider.v1.Ecosystem ecosystem = 1;</code>
     * @return The ecosystem.
     */
    public trinsic.services.provider.v1.Ecosystem getEcosystem() {
      if (ecosystemBuilder_ == null) {
        return ecosystem_ == null ? trinsic.services.provider.v1.Ecosystem.getDefaultInstance() : ecosystem_;
      } else {
        return ecosystemBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Details of the created ecosystem
     * </pre>
     *
     * <code>.services.provider.v1.Ecosystem ecosystem = 1;</code>
     */
    public Builder setEcosystem(trinsic.services.provider.v1.Ecosystem value) {
      if (ecosystemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ecosystem_ = value;
        onChanged();
      } else {
        ecosystemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Details of the created ecosystem
     * </pre>
     *
     * <code>.services.provider.v1.Ecosystem ecosystem = 1;</code>
     */
    public Builder setEcosystem(
        trinsic.services.provider.v1.Ecosystem.Builder builderForValue) {
      if (ecosystemBuilder_ == null) {
        ecosystem_ = builderForValue.build();
        onChanged();
      } else {
        ecosystemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Details of the created ecosystem
     * </pre>
     *
     * <code>.services.provider.v1.Ecosystem ecosystem = 1;</code>
     */
    public Builder mergeEcosystem(trinsic.services.provider.v1.Ecosystem value) {
      if (ecosystemBuilder_ == null) {
        if (ecosystem_ != null) {
          ecosystem_ =
            trinsic.services.provider.v1.Ecosystem.newBuilder(ecosystem_).mergeFrom(value).buildPartial();
        } else {
          ecosystem_ = value;
        }
        onChanged();
      } else {
        ecosystemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Details of the created ecosystem
     * </pre>
     *
     * <code>.services.provider.v1.Ecosystem ecosystem = 1;</code>
     */
    public Builder clearEcosystem() {
      if (ecosystemBuilder_ == null) {
        ecosystem_ = null;
        onChanged();
      } else {
        ecosystem_ = null;
        ecosystemBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Details of the created ecosystem
     * </pre>
     *
     * <code>.services.provider.v1.Ecosystem ecosystem = 1;</code>
     */
    public trinsic.services.provider.v1.Ecosystem.Builder getEcosystemBuilder() {
      
      onChanged();
      return getEcosystemFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Details of the created ecosystem
     * </pre>
     *
     * <code>.services.provider.v1.Ecosystem ecosystem = 1;</code>
     */
    public trinsic.services.provider.v1.EcosystemOrBuilder getEcosystemOrBuilder() {
      if (ecosystemBuilder_ != null) {
        return ecosystemBuilder_.getMessageOrBuilder();
      } else {
        return ecosystem_ == null ?
            trinsic.services.provider.v1.Ecosystem.getDefaultInstance() : ecosystem_;
      }
    }
    /**
     * <pre>
     * Details of the created ecosystem
     * </pre>
     *
     * <code>.services.provider.v1.Ecosystem ecosystem = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        trinsic.services.provider.v1.Ecosystem, trinsic.services.provider.v1.Ecosystem.Builder, trinsic.services.provider.v1.EcosystemOrBuilder> 
        getEcosystemFieldBuilder() {
      if (ecosystemBuilder_ == null) {
        ecosystemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.provider.v1.Ecosystem, trinsic.services.provider.v1.Ecosystem.Builder, trinsic.services.provider.v1.EcosystemOrBuilder>(
                getEcosystem(),
                getParentForChildren(),
                isClean());
        ecosystem_ = null;
      }
      return ecosystemBuilder_;
    }

    private trinsic.services.account.v1.AccountProfile profile_;
    private com.google.protobuf.SingleFieldBuilderV3<
        trinsic.services.account.v1.AccountProfile, trinsic.services.account.v1.AccountProfile.Builder, trinsic.services.account.v1.AccountProfileOrBuilder> profileBuilder_;
    /**
     * <pre>
     * Account profile for auth of the owner of the ecosystem
     * </pre>
     *
     * <code>.services.account.v1.AccountProfile profile = 2;</code>
     * @return Whether the profile field is set.
     */
    public boolean hasProfile() {
      return profileBuilder_ != null || profile_ != null;
    }
    /**
     * <pre>
     * Account profile for auth of the owner of the ecosystem
     * </pre>
     *
     * <code>.services.account.v1.AccountProfile profile = 2;</code>
     * @return The profile.
     */
    public trinsic.services.account.v1.AccountProfile getProfile() {
      if (profileBuilder_ == null) {
        return profile_ == null ? trinsic.services.account.v1.AccountProfile.getDefaultInstance() : profile_;
      } else {
        return profileBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Account profile for auth of the owner of the ecosystem
     * </pre>
     *
     * <code>.services.account.v1.AccountProfile profile = 2;</code>
     */
    public Builder setProfile(trinsic.services.account.v1.AccountProfile value) {
      if (profileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        profile_ = value;
        onChanged();
      } else {
        profileBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Account profile for auth of the owner of the ecosystem
     * </pre>
     *
     * <code>.services.account.v1.AccountProfile profile = 2;</code>
     */
    public Builder setProfile(
        trinsic.services.account.v1.AccountProfile.Builder builderForValue) {
      if (profileBuilder_ == null) {
        profile_ = builderForValue.build();
        onChanged();
      } else {
        profileBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Account profile for auth of the owner of the ecosystem
     * </pre>
     *
     * <code>.services.account.v1.AccountProfile profile = 2;</code>
     */
    public Builder mergeProfile(trinsic.services.account.v1.AccountProfile value) {
      if (profileBuilder_ == null) {
        if (profile_ != null) {
          profile_ =
            trinsic.services.account.v1.AccountProfile.newBuilder(profile_).mergeFrom(value).buildPartial();
        } else {
          profile_ = value;
        }
        onChanged();
      } else {
        profileBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Account profile for auth of the owner of the ecosystem
     * </pre>
     *
     * <code>.services.account.v1.AccountProfile profile = 2;</code>
     */
    public Builder clearProfile() {
      if (profileBuilder_ == null) {
        profile_ = null;
        onChanged();
      } else {
        profile_ = null;
        profileBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Account profile for auth of the owner of the ecosystem
     * </pre>
     *
     * <code>.services.account.v1.AccountProfile profile = 2;</code>
     */
    public trinsic.services.account.v1.AccountProfile.Builder getProfileBuilder() {
      
      onChanged();
      return getProfileFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Account profile for auth of the owner of the ecosystem
     * </pre>
     *
     * <code>.services.account.v1.AccountProfile profile = 2;</code>
     */
    public trinsic.services.account.v1.AccountProfileOrBuilder getProfileOrBuilder() {
      if (profileBuilder_ != null) {
        return profileBuilder_.getMessageOrBuilder();
      } else {
        return profile_ == null ?
            trinsic.services.account.v1.AccountProfile.getDefaultInstance() : profile_;
      }
    }
    /**
     * <pre>
     * Account profile for auth of the owner of the ecosystem
     * </pre>
     *
     * <code>.services.account.v1.AccountProfile profile = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        trinsic.services.account.v1.AccountProfile, trinsic.services.account.v1.AccountProfile.Builder, trinsic.services.account.v1.AccountProfileOrBuilder> 
        getProfileFieldBuilder() {
      if (profileBuilder_ == null) {
        profileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.account.v1.AccountProfile, trinsic.services.account.v1.AccountProfile.Builder, trinsic.services.account.v1.AccountProfileOrBuilder>(
                getProfile(),
                getParentForChildren(),
                isClean());
        profile_ = null;
      }
      return profileBuilder_;
    }

    private int confirmationMethod_ = 0;
    /**
     * <pre>
     * Indicates if confirmation of account is required.
     * </pre>
     *
     * <code>.services.account.v1.ConfirmationMethod confirmation_method = 3;</code>
     * @return The enum numeric value on the wire for confirmationMethod.
     */
    @java.lang.Override public int getConfirmationMethodValue() {
      return confirmationMethod_;
    }
    /**
     * <pre>
     * Indicates if confirmation of account is required.
     * </pre>
     *
     * <code>.services.account.v1.ConfirmationMethod confirmation_method = 3;</code>
     * @param value The enum numeric value on the wire for confirmationMethod to set.
     * @return This builder for chaining.
     */
    public Builder setConfirmationMethodValue(int value) {
      
      confirmationMethod_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates if confirmation of account is required.
     * </pre>
     *
     * <code>.services.account.v1.ConfirmationMethod confirmation_method = 3;</code>
     * @return The confirmationMethod.
     */
    @java.lang.Override
    public trinsic.services.account.v1.ConfirmationMethod getConfirmationMethod() {
      @SuppressWarnings("deprecation")
      trinsic.services.account.v1.ConfirmationMethod result = trinsic.services.account.v1.ConfirmationMethod.valueOf(confirmationMethod_);
      return result == null ? trinsic.services.account.v1.ConfirmationMethod.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Indicates if confirmation of account is required.
     * </pre>
     *
     * <code>.services.account.v1.ConfirmationMethod confirmation_method = 3;</code>
     * @param value The confirmationMethod to set.
     * @return This builder for chaining.
     */
    public Builder setConfirmationMethod(trinsic.services.account.v1.ConfirmationMethod value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      confirmationMethod_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates if confirmation of account is required.
     * </pre>
     *
     * <code>.services.account.v1.ConfirmationMethod confirmation_method = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfirmationMethod() {
      
      confirmationMethod_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:services.provider.v1.CreateEcosystemResponse)
  }

  // @@protoc_insertion_point(class_scope:services.provider.v1.CreateEcosystemResponse)
  private static final trinsic.services.provider.v1.CreateEcosystemResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new trinsic.services.provider.v1.CreateEcosystemResponse();
  }

  public static trinsic.services.provider.v1.CreateEcosystemResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEcosystemResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateEcosystemResponse>() {
    @java.lang.Override
    public CreateEcosystemResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateEcosystemResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateEcosystemResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEcosystemResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.provider.v1.CreateEcosystemResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

