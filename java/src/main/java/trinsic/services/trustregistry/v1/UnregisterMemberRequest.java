// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/trust-registry/v1/trust-registry.proto

package trinsic.services.trustregistry.v1;

/**
 *
 *
 * <pre>
 * Request to unregister a member as a valid issuer of a specific credential schema.
 * Only one of `did_uri`, `wallet_id`, or `email` may be specified.
 * </pre>
 *
 * Protobuf type {@code services.trustregistry.v1.UnregisterMemberRequest}
 */
public final class UnregisterMemberRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.trustregistry.v1.UnregisterMemberRequest)
    UnregisterMemberRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UnregisterMemberRequest.newBuilder() to construct.
  private UnregisterMemberRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UnregisterMemberRequest() {
    schemaUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UnregisterMemberRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
        .internal_static_services_trustregistry_v1_UnregisterMemberRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
        .internal_static_services_trustregistry_v1_UnregisterMemberRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.trustregistry.v1.UnregisterMemberRequest.class,
            trinsic.services.trustregistry.v1.UnregisterMemberRequest.Builder.class);
  }

  private int memberCase_ = 0;
  private java.lang.Object member_;

  public enum MemberCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DID_URI(1),
    WALLET_ID(3),
    EMAIL(4),
    MEMBER_NOT_SET(0);
    private final int value;

    private MemberCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MemberCase valueOf(int value) {
      return forNumber(value);
    }

    public static MemberCase forNumber(int value) {
      switch (value) {
        case 1:
          return DID_URI;
        case 3:
          return WALLET_ID;
        case 4:
          return EMAIL;
        case 0:
          return MEMBER_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public MemberCase getMemberCase() {
    return MemberCase.forNumber(memberCase_);
  }

  public static final int DID_URI_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * DID URI of member to unregister
   * </pre>
   *
   * <code>string did_uri = 1;</code>
   *
   * @return Whether the didUri field is set.
   */
  public boolean hasDidUri() {
    return memberCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * DID URI of member to unregister
   * </pre>
   *
   * <code>string did_uri = 1;</code>
   *
   * @return The didUri.
   */
  public java.lang.String getDidUri() {
    java.lang.Object ref = "";
    if (memberCase_ == 1) {
      ref = member_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (memberCase_ == 1) {
        member_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * DID URI of member to unregister
   * </pre>
   *
   * <code>string did_uri = 1;</code>
   *
   * @return The bytes for didUri.
   */
  public com.google.protobuf.ByteString getDidUriBytes() {
    java.lang.Object ref = "";
    if (memberCase_ == 1) {
      ref = member_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (memberCase_ == 1) {
        member_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WALLET_ID_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Trinsic Wallet ID of member to unregister
   * </pre>
   *
   * <code>string wallet_id = 3;</code>
   *
   * @return Whether the walletId field is set.
   */
  public boolean hasWalletId() {
    return memberCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Trinsic Wallet ID of member to unregister
   * </pre>
   *
   * <code>string wallet_id = 3;</code>
   *
   * @return The walletId.
   */
  public java.lang.String getWalletId() {
    java.lang.Object ref = "";
    if (memberCase_ == 3) {
      ref = member_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (memberCase_ == 3) {
        member_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Trinsic Wallet ID of member to unregister
   * </pre>
   *
   * <code>string wallet_id = 3;</code>
   *
   * @return The bytes for walletId.
   */
  public com.google.protobuf.ByteString getWalletIdBytes() {
    java.lang.Object ref = "";
    if (memberCase_ == 3) {
      ref = member_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (memberCase_ == 3) {
        member_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 4;
  /**
   *
   *
   * <pre>
   * Email address of member to unregister. Must be associated with an existing Trinsic account.
   * </pre>
   *
   * <code>string email = 4;</code>
   *
   * @return Whether the email field is set.
   */
  public boolean hasEmail() {
    return memberCase_ == 4;
  }
  /**
   *
   *
   * <pre>
   * Email address of member to unregister. Must be associated with an existing Trinsic account.
   * </pre>
   *
   * <code>string email = 4;</code>
   *
   * @return The email.
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = "";
    if (memberCase_ == 4) {
      ref = member_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (memberCase_ == 4) {
        member_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Email address of member to unregister. Must be associated with an existing Trinsic account.
   * </pre>
   *
   * <code>string email = 4;</code>
   *
   * @return The bytes for email.
   */
  public com.google.protobuf.ByteString getEmailBytes() {
    java.lang.Object ref = "";
    if (memberCase_ == 4) {
      ref = member_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (memberCase_ == 4) {
        member_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCHEMA_URI_FIELD_NUMBER = 10;
  private volatile java.lang.Object schemaUri_;
  /**
   *
   *
   * <pre>
   * URI of credential schema to unregister member as authorized issuer of
   * </pre>
   *
   * <code>string schema_uri = 10;</code>
   *
   * @return The schemaUri.
   */
  @java.lang.Override
  public java.lang.String getSchemaUri() {
    java.lang.Object ref = schemaUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      schemaUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URI of credential schema to unregister member as authorized issuer of
   * </pre>
   *
   * <code>string schema_uri = 10;</code>
   *
   * @return The bytes for schemaUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSchemaUriBytes() {
    java.lang.Object ref = schemaUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      schemaUri_ = b;
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
    if (memberCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, member_);
    }
    if (memberCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, member_);
    }
    if (memberCase_ == 4) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, member_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(schemaUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 10, schemaUri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (memberCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, member_);
    }
    if (memberCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, member_);
    }
    if (memberCase_ == 4) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, member_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(schemaUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, schemaUri_);
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
    if (!(obj instanceof trinsic.services.trustregistry.v1.UnregisterMemberRequest)) {
      return super.equals(obj);
    }
    trinsic.services.trustregistry.v1.UnregisterMemberRequest other =
        (trinsic.services.trustregistry.v1.UnregisterMemberRequest) obj;

    if (!getSchemaUri().equals(other.getSchemaUri())) return false;
    if (!getMemberCase().equals(other.getMemberCase())) return false;
    switch (memberCase_) {
      case 1:
        if (!getDidUri().equals(other.getDidUri())) return false;
        break;
      case 3:
        if (!getWalletId().equals(other.getWalletId())) return false;
        break;
      case 4:
        if (!getEmail().equals(other.getEmail())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + SCHEMA_URI_FIELD_NUMBER;
    hash = (53 * hash) + getSchemaUri().hashCode();
    switch (memberCase_) {
      case 1:
        hash = (37 * hash) + DID_URI_FIELD_NUMBER;
        hash = (53 * hash) + getDidUri().hashCode();
        break;
      case 3:
        hash = (37 * hash) + WALLET_ID_FIELD_NUMBER;
        hash = (53 * hash) + getWalletId().hashCode();
        break;
      case 4:
        hash = (37 * hash) + EMAIL_FIELD_NUMBER;
        hash = (53 * hash) + getEmail().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.trustregistry.v1.UnregisterMemberRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.trustregistry.v1.UnregisterMemberRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.UnregisterMemberRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.trustregistry.v1.UnregisterMemberRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.UnregisterMemberRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.trustregistry.v1.UnregisterMemberRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.UnregisterMemberRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.trustregistry.v1.UnregisterMemberRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.UnregisterMemberRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.trustregistry.v1.UnregisterMemberRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.UnregisterMemberRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.trustregistry.v1.UnregisterMemberRequest parseFrom(
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
      trinsic.services.trustregistry.v1.UnregisterMemberRequest prototype) {
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
   * Request to unregister a member as a valid issuer of a specific credential schema.
   * Only one of `did_uri`, `wallet_id`, or `email` may be specified.
   * </pre>
   *
   * Protobuf type {@code services.trustregistry.v1.UnregisterMemberRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.trustregistry.v1.UnregisterMemberRequest)
      trinsic.services.trustregistry.v1.UnregisterMemberRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
          .internal_static_services_trustregistry_v1_UnregisterMemberRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
          .internal_static_services_trustregistry_v1_UnregisterMemberRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.trustregistry.v1.UnregisterMemberRequest.class,
              trinsic.services.trustregistry.v1.UnregisterMemberRequest.Builder.class);
    }

    // Construct using trinsic.services.trustregistry.v1.UnregisterMemberRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      schemaUri_ = "";

      memberCase_ = 0;
      member_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
          .internal_static_services_trustregistry_v1_UnregisterMemberRequest_descriptor;
    }

    @java.lang.Override
    public trinsic.services.trustregistry.v1.UnregisterMemberRequest getDefaultInstanceForType() {
      return trinsic.services.trustregistry.v1.UnregisterMemberRequest.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.trustregistry.v1.UnregisterMemberRequest build() {
      trinsic.services.trustregistry.v1.UnregisterMemberRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.trustregistry.v1.UnregisterMemberRequest buildPartial() {
      trinsic.services.trustregistry.v1.UnregisterMemberRequest result =
          new trinsic.services.trustregistry.v1.UnregisterMemberRequest(this);
      if (memberCase_ == 1) {
        result.member_ = member_;
      }
      if (memberCase_ == 3) {
        result.member_ = member_;
      }
      if (memberCase_ == 4) {
        result.member_ = member_;
      }
      result.schemaUri_ = schemaUri_;
      result.memberCase_ = memberCase_;
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
      if (other instanceof trinsic.services.trustregistry.v1.UnregisterMemberRequest) {
        return mergeFrom((trinsic.services.trustregistry.v1.UnregisterMemberRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.trustregistry.v1.UnregisterMemberRequest other) {
      if (other == trinsic.services.trustregistry.v1.UnregisterMemberRequest.getDefaultInstance())
        return this;
      if (!other.getSchemaUri().isEmpty()) {
        schemaUri_ = other.schemaUri_;
        onChanged();
      }
      switch (other.getMemberCase()) {
        case DID_URI:
          {
            memberCase_ = 1;
            member_ = other.member_;
            onChanged();
            break;
          }
        case WALLET_ID:
          {
            memberCase_ = 3;
            member_ = other.member_;
            onChanged();
            break;
          }
        case EMAIL:
          {
            memberCase_ = 4;
            member_ = other.member_;
            onChanged();
            break;
          }
        case MEMBER_NOT_SET:
          {
            break;
          }
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
                java.lang.String s = input.readStringRequireUtf8();
                memberCase_ = 1;
                member_ = s;
                break;
              } // case 10
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                memberCase_ = 3;
                member_ = s;
                break;
              } // case 26
            case 34:
              {
                java.lang.String s = input.readStringRequireUtf8();
                memberCase_ = 4;
                member_ = s;
                break;
              } // case 34
            case 82:
              {
                schemaUri_ = input.readStringRequireUtf8();

                break;
              } // case 82
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

    private int memberCase_ = 0;
    private java.lang.Object member_;

    public MemberCase getMemberCase() {
      return MemberCase.forNumber(memberCase_);
    }

    public Builder clearMember() {
      memberCase_ = 0;
      member_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * DID URI of member to unregister
     * </pre>
     *
     * <code>string did_uri = 1;</code>
     *
     * @return Whether the didUri field is set.
     */
    @java.lang.Override
    public boolean hasDidUri() {
      return memberCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * DID URI of member to unregister
     * </pre>
     *
     * <code>string did_uri = 1;</code>
     *
     * @return The didUri.
     */
    @java.lang.Override
    public java.lang.String getDidUri() {
      java.lang.Object ref = "";
      if (memberCase_ == 1) {
        ref = member_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (memberCase_ == 1) {
          member_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * DID URI of member to unregister
     * </pre>
     *
     * <code>string did_uri = 1;</code>
     *
     * @return The bytes for didUri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDidUriBytes() {
      java.lang.Object ref = "";
      if (memberCase_ == 1) {
        ref = member_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (memberCase_ == 1) {
          member_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * DID URI of member to unregister
     * </pre>
     *
     * <code>string did_uri = 1;</code>
     *
     * @param value The didUri to set.
     * @return This builder for chaining.
     */
    public Builder setDidUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      memberCase_ = 1;
      member_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DID URI of member to unregister
     * </pre>
     *
     * <code>string did_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDidUri() {
      if (memberCase_ == 1) {
        memberCase_ = 0;
        member_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * DID URI of member to unregister
     * </pre>
     *
     * <code>string did_uri = 1;</code>
     *
     * @param value The bytes for didUri to set.
     * @return This builder for chaining.
     */
    public Builder setDidUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      memberCase_ = 1;
      member_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Trinsic Wallet ID of member to unregister
     * </pre>
     *
     * <code>string wallet_id = 3;</code>
     *
     * @return Whether the walletId field is set.
     */
    @java.lang.Override
    public boolean hasWalletId() {
      return memberCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Trinsic Wallet ID of member to unregister
     * </pre>
     *
     * <code>string wallet_id = 3;</code>
     *
     * @return The walletId.
     */
    @java.lang.Override
    public java.lang.String getWalletId() {
      java.lang.Object ref = "";
      if (memberCase_ == 3) {
        ref = member_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (memberCase_ == 3) {
          member_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Trinsic Wallet ID of member to unregister
     * </pre>
     *
     * <code>string wallet_id = 3;</code>
     *
     * @return The bytes for walletId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getWalletIdBytes() {
      java.lang.Object ref = "";
      if (memberCase_ == 3) {
        ref = member_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (memberCase_ == 3) {
          member_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Trinsic Wallet ID of member to unregister
     * </pre>
     *
     * <code>string wallet_id = 3;</code>
     *
     * @param value The walletId to set.
     * @return This builder for chaining.
     */
    public Builder setWalletId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      memberCase_ = 3;
      member_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Trinsic Wallet ID of member to unregister
     * </pre>
     *
     * <code>string wallet_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWalletId() {
      if (memberCase_ == 3) {
        memberCase_ = 0;
        member_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Trinsic Wallet ID of member to unregister
     * </pre>
     *
     * <code>string wallet_id = 3;</code>
     *
     * @param value The bytes for walletId to set.
     * @return This builder for chaining.
     */
    public Builder setWalletIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      memberCase_ = 3;
      member_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Email address of member to unregister. Must be associated with an existing Trinsic account.
     * </pre>
     *
     * <code>string email = 4;</code>
     *
     * @return Whether the email field is set.
     */
    @java.lang.Override
    public boolean hasEmail() {
      return memberCase_ == 4;
    }
    /**
     *
     *
     * <pre>
     * Email address of member to unregister. Must be associated with an existing Trinsic account.
     * </pre>
     *
     * <code>string email = 4;</code>
     *
     * @return The email.
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      java.lang.Object ref = "";
      if (memberCase_ == 4) {
        ref = member_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (memberCase_ == 4) {
          member_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Email address of member to unregister. Must be associated with an existing Trinsic account.
     * </pre>
     *
     * <code>string email = 4;</code>
     *
     * @return The bytes for email.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEmailBytes() {
      java.lang.Object ref = "";
      if (memberCase_ == 4) {
        ref = member_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (memberCase_ == 4) {
          member_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Email address of member to unregister. Must be associated with an existing Trinsic account.
     * </pre>
     *
     * <code>string email = 4;</code>
     *
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      memberCase_ = 4;
      member_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email address of member to unregister. Must be associated with an existing Trinsic account.
     * </pre>
     *
     * <code>string email = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      if (memberCase_ == 4) {
        memberCase_ = 0;
        member_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email address of member to unregister. Must be associated with an existing Trinsic account.
     * </pre>
     *
     * <code>string email = 4;</code>
     *
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      memberCase_ = 4;
      member_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object schemaUri_ = "";
    /**
     *
     *
     * <pre>
     * URI of credential schema to unregister member as authorized issuer of
     * </pre>
     *
     * <code>string schema_uri = 10;</code>
     *
     * @return The schemaUri.
     */
    public java.lang.String getSchemaUri() {
      java.lang.Object ref = schemaUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        schemaUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of credential schema to unregister member as authorized issuer of
     * </pre>
     *
     * <code>string schema_uri = 10;</code>
     *
     * @return The bytes for schemaUri.
     */
    public com.google.protobuf.ByteString getSchemaUriBytes() {
      java.lang.Object ref = schemaUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        schemaUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of credential schema to unregister member as authorized issuer of
     * </pre>
     *
     * <code>string schema_uri = 10;</code>
     *
     * @param value The schemaUri to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      schemaUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of credential schema to unregister member as authorized issuer of
     * </pre>
     *
     * <code>string schema_uri = 10;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSchemaUri() {

      schemaUri_ = getDefaultInstance().getSchemaUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of credential schema to unregister member as authorized issuer of
     * </pre>
     *
     * <code>string schema_uri = 10;</code>
     *
     * @param value The bytes for schemaUri to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      schemaUri_ = value;
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

    // @@protoc_insertion_point(builder_scope:services.trustregistry.v1.UnregisterMemberRequest)
  }

  // @@protoc_insertion_point(class_scope:services.trustregistry.v1.UnregisterMemberRequest)
  private static final trinsic.services.trustregistry.v1.UnregisterMemberRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.trustregistry.v1.UnregisterMemberRequest();
  }

  public static trinsic.services.trustregistry.v1.UnregisterMemberRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnregisterMemberRequest> PARSER =
      new com.google.protobuf.AbstractParser<UnregisterMemberRequest>() {
        @java.lang.Override
        public UnregisterMemberRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UnregisterMemberRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnregisterMemberRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.trustregistry.v1.UnregisterMemberRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
