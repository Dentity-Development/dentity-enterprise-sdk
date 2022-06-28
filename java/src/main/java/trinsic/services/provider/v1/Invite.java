// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/provider.proto

package trinsic.services.provider.v1;

/** Protobuf type {@code services.provider.v1.Invite} */
public final class Invite extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.provider.v1.Invite)
    InviteOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Invite.newBuilder() to construct.
  private Invite(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Invite() {
    id_ = "";
    code_ = "";
    created_ = "";
    accepted_ = "";
    expires_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Invite();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Invite(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              id_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              code_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              created_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              accepted_ = s;
              break;
            }
          case 42:
            {
              java.lang.String s = input.readStringRequireUtf8();

              expires_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.provider.v1.ProviderOuterClass
        .internal_static_services_provider_v1_Invite_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.provider.v1.ProviderOuterClass
        .internal_static_services_provider_v1_Invite_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.provider.v1.Invite.class,
            trinsic.services.provider.v1.Invite.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object code_;
  /**
   * <code>string code = 2;</code>
   *
   * @return The code.
   */
  @java.lang.Override
  public java.lang.String getCode() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      code_ = s;
      return s;
    }
  }
  /**
   * <code>string code = 2;</code>
   *
   * @return The bytes for code.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCodeBytes() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      code_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATED_FIELD_NUMBER = 3;
  private volatile java.lang.Object created_;
  /**
   * <code>string created = 3;</code>
   *
   * @return The created.
   */
  @java.lang.Override
  public java.lang.String getCreated() {
    java.lang.Object ref = created_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      created_ = s;
      return s;
    }
  }
  /**
   * <code>string created = 3;</code>
   *
   * @return The bytes for created.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCreatedBytes() {
    java.lang.Object ref = created_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      created_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCEPTED_FIELD_NUMBER = 4;
  private volatile java.lang.Object accepted_;
  /**
   * <code>string accepted = 4;</code>
   *
   * @return The accepted.
   */
  @java.lang.Override
  public java.lang.String getAccepted() {
    java.lang.Object ref = accepted_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accepted_ = s;
      return s;
    }
  }
  /**
   * <code>string accepted = 4;</code>
   *
   * @return The bytes for accepted.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAcceptedBytes() {
    java.lang.Object ref = accepted_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      accepted_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRES_FIELD_NUMBER = 5;
  private volatile java.lang.Object expires_;
  /**
   * <code>string expires = 5;</code>
   *
   * @return The expires.
   */
  @java.lang.Override
  public java.lang.String getExpires() {
    java.lang.Object ref = expires_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expires_ = s;
      return s;
    }
  }
  /**
   * <code>string expires = 5;</code>
   *
   * @return The bytes for expires.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExpiresBytes() {
    java.lang.Object ref = expires_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      expires_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(code_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, code_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(created_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, created_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accepted_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, accepted_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(expires_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, expires_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(code_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, code_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(created_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, created_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accepted_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, accepted_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(expires_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, expires_);
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
    if (!(obj instanceof trinsic.services.provider.v1.Invite)) {
      return super.equals(obj);
    }
    trinsic.services.provider.v1.Invite other = (trinsic.services.provider.v1.Invite) obj;

    if (!getId().equals(other.getId())) return false;
    if (!getCode().equals(other.getCode())) return false;
    if (!getCreated().equals(other.getCreated())) return false;
    if (!getAccepted().equals(other.getAccepted())) return false;
    if (!getExpires().equals(other.getExpires())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode().hashCode();
    hash = (37 * hash) + CREATED_FIELD_NUMBER;
    hash = (53 * hash) + getCreated().hashCode();
    hash = (37 * hash) + ACCEPTED_FIELD_NUMBER;
    hash = (53 * hash) + getAccepted().hashCode();
    hash = (37 * hash) + EXPIRES_FIELD_NUMBER;
    hash = (53 * hash) + getExpires().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.provider.v1.Invite parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.Invite parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.Invite parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.Invite parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.Invite parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.Invite parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.Invite parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.Invite parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.Invite parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.Invite parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.Invite parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.Invite parseFrom(
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

  public static Builder newBuilder(trinsic.services.provider.v1.Invite prototype) {
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
  /** Protobuf type {@code services.provider.v1.Invite} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.provider.v1.Invite)
      trinsic.services.provider.v1.InviteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_Invite_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_Invite_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.provider.v1.Invite.class,
              trinsic.services.provider.v1.Invite.Builder.class);
    }

    // Construct using trinsic.services.provider.v1.Invite.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      code_ = "";

      created_ = "";

      accepted_ = "";

      expires_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_Invite_descriptor;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.Invite getDefaultInstanceForType() {
      return trinsic.services.provider.v1.Invite.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.provider.v1.Invite build() {
      trinsic.services.provider.v1.Invite result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.Invite buildPartial() {
      trinsic.services.provider.v1.Invite result = new trinsic.services.provider.v1.Invite(this);
      result.id_ = id_;
      result.code_ = code_;
      result.created_ = created_;
      result.accepted_ = accepted_;
      result.expires_ = expires_;
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
      if (other instanceof trinsic.services.provider.v1.Invite) {
        return mergeFrom((trinsic.services.provider.v1.Invite) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.provider.v1.Invite other) {
      if (other == trinsic.services.provider.v1.Invite.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getCode().isEmpty()) {
        code_ = other.code_;
        onChanged();
      }
      if (!other.getCreated().isEmpty()) {
        created_ = other.created_;
        onChanged();
      }
      if (!other.getAccepted().isEmpty()) {
        accepted_ = other.accepted_;
        onChanged();
      }
      if (!other.getExpires().isEmpty()) {
        expires_ = other.expires_;
        onChanged();
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
      trinsic.services.provider.v1.Invite parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (trinsic.services.provider.v1.Invite) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     *
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     *
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     *
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearId() {

      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     *
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object code_ = "";
    /**
     * <code>string code = 2;</code>
     *
     * @return The code.
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string code = 2;</code>
     *
     * @return The bytes for code.
     */
    public com.google.protobuf.ByteString getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string code = 2;</code>
     *
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string code = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCode() {

      code_ = getDefaultInstance().getCode();
      onChanged();
      return this;
    }
    /**
     * <code>string code = 2;</code>
     *
     * @param value The bytes for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      code_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object created_ = "";
    /**
     * <code>string created = 3;</code>
     *
     * @return The created.
     */
    public java.lang.String getCreated() {
      java.lang.Object ref = created_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        created_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string created = 3;</code>
     *
     * @return The bytes for created.
     */
    public com.google.protobuf.ByteString getCreatedBytes() {
      java.lang.Object ref = created_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        created_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string created = 3;</code>
     *
     * @param value The created to set.
     * @return This builder for chaining.
     */
    public Builder setCreated(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      created_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string created = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCreated() {

      created_ = getDefaultInstance().getCreated();
      onChanged();
      return this;
    }
    /**
     * <code>string created = 3;</code>
     *
     * @param value The bytes for created to set.
     * @return This builder for chaining.
     */
    public Builder setCreatedBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      created_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object accepted_ = "";
    /**
     * <code>string accepted = 4;</code>
     *
     * @return The accepted.
     */
    public java.lang.String getAccepted() {
      java.lang.Object ref = accepted_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accepted_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string accepted = 4;</code>
     *
     * @return The bytes for accepted.
     */
    public com.google.protobuf.ByteString getAcceptedBytes() {
      java.lang.Object ref = accepted_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        accepted_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string accepted = 4;</code>
     *
     * @param value The accepted to set.
     * @return This builder for chaining.
     */
    public Builder setAccepted(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      accepted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string accepted = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAccepted() {

      accepted_ = getDefaultInstance().getAccepted();
      onChanged();
      return this;
    }
    /**
     * <code>string accepted = 4;</code>
     *
     * @param value The bytes for accepted to set.
     * @return This builder for chaining.
     */
    public Builder setAcceptedBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      accepted_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object expires_ = "";
    /**
     * <code>string expires = 5;</code>
     *
     * @return The expires.
     */
    public java.lang.String getExpires() {
      java.lang.Object ref = expires_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expires_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string expires = 5;</code>
     *
     * @return The bytes for expires.
     */
    public com.google.protobuf.ByteString getExpiresBytes() {
      java.lang.Object ref = expires_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        expires_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string expires = 5;</code>
     *
     * @param value The expires to set.
     * @return This builder for chaining.
     */
    public Builder setExpires(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      expires_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string expires = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExpires() {

      expires_ = getDefaultInstance().getExpires();
      onChanged();
      return this;
    }
    /**
     * <code>string expires = 5;</code>
     *
     * @param value The bytes for expires to set.
     * @return This builder for chaining.
     */
    public Builder setExpiresBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      expires_ = value;
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

    // @@protoc_insertion_point(builder_scope:services.provider.v1.Invite)
  }

  // @@protoc_insertion_point(class_scope:services.provider.v1.Invite)
  private static final trinsic.services.provider.v1.Invite DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.provider.v1.Invite();
  }

  public static trinsic.services.provider.v1.Invite getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Invite> PARSER =
      new com.google.protobuf.AbstractParser<Invite>() {
        @java.lang.Override
        public Invite parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Invite(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Invite> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Invite> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.provider.v1.Invite getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
