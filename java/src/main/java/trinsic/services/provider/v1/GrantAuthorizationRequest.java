// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/provider.proto

package trinsic.services.provider.v1;

/**
 *
 *
 * <pre>
 * Grant permissions to a resource or path in the ecosystem
 * </pre>
 *
 * Protobuf type {@code services.provider.v1.GrantAuthorizationRequest}
 */
public final class GrantAuthorizationRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.provider.v1.GrantAuthorizationRequest)
    GrantAuthorizationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GrantAuthorizationRequest.newBuilder() to construct.
  private GrantAuthorizationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GrantAuthorizationRequest() {
    resource_ = "";
    action_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GrantAuthorizationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.provider.v1.ProviderOuterClass
        .internal_static_services_provider_v1_GrantAuthorizationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.provider.v1.ProviderOuterClass
        .internal_static_services_provider_v1_GrantAuthorizationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.provider.v1.GrantAuthorizationRequest.class,
            trinsic.services.provider.v1.GrantAuthorizationRequest.Builder.class);
  }

  private int accountCase_ = 0;
  private java.lang.Object account_;

  public enum AccountCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EMAIL(1),
    WALLETID(2),
    ACCOUNT_NOT_SET(0);
    private final int value;

    private AccountCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AccountCase valueOf(int value) {
      return forNumber(value);
    }

    public static AccountCase forNumber(int value) {
      switch (value) {
        case 1:
          return EMAIL;
        case 2:
          return WALLETID;
        case 0:
          return ACCOUNT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public AccountCase getAccountCase() {
    return AccountCase.forNumber(accountCase_);
  }

  public static final int EMAIL_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Email address of account being granted permission.
   * Mutually exclusive with `walletId`.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return Whether the email field is set.
   */
  public boolean hasEmail() {
    return accountCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Email address of account being granted permission.
   * Mutually exclusive with `walletId`.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return The email.
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = "";
    if (accountCase_ == 1) {
      ref = account_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (accountCase_ == 1) {
        account_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Email address of account being granted permission.
   * Mutually exclusive with `walletId`.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return The bytes for email.
   */
  public com.google.protobuf.ByteString getEmailBytes() {
    java.lang.Object ref = "";
    if (accountCase_ == 1) {
      ref = account_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (accountCase_ == 1) {
        account_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WALLETID_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Wallet ID of account being granted permission.
   * Mutually exclusive with `email`.
   * </pre>
   *
   * <code>string walletId = 2;</code>
   *
   * @return Whether the walletId field is set.
   */
  public boolean hasWalletId() {
    return accountCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Wallet ID of account being granted permission.
   * Mutually exclusive with `email`.
   * </pre>
   *
   * <code>string walletId = 2;</code>
   *
   * @return The walletId.
   */
  public java.lang.String getWalletId() {
    java.lang.Object ref = "";
    if (accountCase_ == 2) {
      ref = account_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (accountCase_ == 2) {
        account_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Wallet ID of account being granted permission.
   * Mutually exclusive with `email`.
   * </pre>
   *
   * <code>string walletId = 2;</code>
   *
   * @return The bytes for walletId.
   */
  public com.google.protobuf.ByteString getWalletIdBytes() {
    java.lang.Object ref = "";
    if (accountCase_ == 2) {
      ref = account_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (accountCase_ == 2) {
        account_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_FIELD_NUMBER = 3;
  private volatile java.lang.Object resource_;
  /**
   *
   *
   * <pre>
   * Resource string that account is receiving permissions for.
   * Resources are specified as a RESTful path: /{ecoId}/{resource type}/{resource id}. `ecoId` may be omitted.
   * </pre>
   *
   * <code>string resource = 3;</code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource string that account is receiving permissions for.
   * Resources are specified as a RESTful path: /{ecoId}/{resource type}/{resource id}. `ecoId` may be omitted.
   * </pre>
   *
   * <code>string resource = 3;</code>
   *
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_FIELD_NUMBER = 4;
  private volatile java.lang.Object action_;
  /**
   *
   *
   * <pre>
   * Action to authorize. Default is "*" (all)
   * </pre>
   *
   * <code>string action = 4;</code>
   *
   * @return The action.
   */
  @java.lang.Override
  public java.lang.String getAction() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      action_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Action to authorize. Default is "*" (all)
   * </pre>
   *
   * <code>string action = 4;</code>
   *
   * @return The bytes for action.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getActionBytes() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      action_ = b;
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
    if (accountCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, account_);
    }
    if (accountCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, account_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(action_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, action_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, account_);
    }
    if (accountCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, account_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, resource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(action_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, action_);
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
    if (!(obj instanceof trinsic.services.provider.v1.GrantAuthorizationRequest)) {
      return super.equals(obj);
    }
    trinsic.services.provider.v1.GrantAuthorizationRequest other =
        (trinsic.services.provider.v1.GrantAuthorizationRequest) obj;

    if (!getResource().equals(other.getResource())) return false;
    if (!getAction().equals(other.getAction())) return false;
    if (!getAccountCase().equals(other.getAccountCase())) return false;
    switch (accountCase_) {
      case 1:
        if (!getEmail().equals(other.getEmail())) return false;
        break;
      case 2:
        if (!getWalletId().equals(other.getWalletId())) return false;
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
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction().hashCode();
    switch (accountCase_) {
      case 1:
        hash = (37 * hash) + EMAIL_FIELD_NUMBER;
        hash = (53 * hash) + getEmail().hashCode();
        break;
      case 2:
        hash = (37 * hash) + WALLETID_FIELD_NUMBER;
        hash = (53 * hash) + getWalletId().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.provider.v1.GrantAuthorizationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.GrantAuthorizationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.GrantAuthorizationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.GrantAuthorizationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.GrantAuthorizationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.GrantAuthorizationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.GrantAuthorizationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.GrantAuthorizationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.GrantAuthorizationRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.GrantAuthorizationRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.GrantAuthorizationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.GrantAuthorizationRequest parseFrom(
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
      trinsic.services.provider.v1.GrantAuthorizationRequest prototype) {
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
   * Grant permissions to a resource or path in the ecosystem
   * </pre>
   *
   * Protobuf type {@code services.provider.v1.GrantAuthorizationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.provider.v1.GrantAuthorizationRequest)
      trinsic.services.provider.v1.GrantAuthorizationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_GrantAuthorizationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_GrantAuthorizationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.provider.v1.GrantAuthorizationRequest.class,
              trinsic.services.provider.v1.GrantAuthorizationRequest.Builder.class);
    }

    // Construct using trinsic.services.provider.v1.GrantAuthorizationRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      resource_ = "";

      action_ = "";

      accountCase_ = 0;
      account_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_GrantAuthorizationRequest_descriptor;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.GrantAuthorizationRequest getDefaultInstanceForType() {
      return trinsic.services.provider.v1.GrantAuthorizationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.provider.v1.GrantAuthorizationRequest build() {
      trinsic.services.provider.v1.GrantAuthorizationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.GrantAuthorizationRequest buildPartial() {
      trinsic.services.provider.v1.GrantAuthorizationRequest result =
          new trinsic.services.provider.v1.GrantAuthorizationRequest(this);
      if (accountCase_ == 1) {
        result.account_ = account_;
      }
      if (accountCase_ == 2) {
        result.account_ = account_;
      }
      result.resource_ = resource_;
      result.action_ = action_;
      result.accountCase_ = accountCase_;
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
      if (other instanceof trinsic.services.provider.v1.GrantAuthorizationRequest) {
        return mergeFrom((trinsic.services.provider.v1.GrantAuthorizationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.provider.v1.GrantAuthorizationRequest other) {
      if (other == trinsic.services.provider.v1.GrantAuthorizationRequest.getDefaultInstance())
        return this;
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        onChanged();
      }
      if (!other.getAction().isEmpty()) {
        action_ = other.action_;
        onChanged();
      }
      switch (other.getAccountCase()) {
        case EMAIL:
          {
            accountCase_ = 1;
            account_ = other.account_;
            onChanged();
            break;
          }
        case WALLETID:
          {
            accountCase_ = 2;
            account_ = other.account_;
            onChanged();
            break;
          }
        case ACCOUNT_NOT_SET:
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
                accountCase_ = 1;
                account_ = s;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                accountCase_ = 2;
                account_ = s;
                break;
              } // case 18
            case 26:
              {
                resource_ = input.readStringRequireUtf8();

                break;
              } // case 26
            case 34:
              {
                action_ = input.readStringRequireUtf8();

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

    private int accountCase_ = 0;
    private java.lang.Object account_;

    public AccountCase getAccountCase() {
      return AccountCase.forNumber(accountCase_);
    }

    public Builder clearAccount() {
      accountCase_ = 0;
      account_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Email address of account being granted permission.
     * Mutually exclusive with `walletId`.
     * </pre>
     *
     * <code>string email = 1;</code>
     *
     * @return Whether the email field is set.
     */
    @java.lang.Override
    public boolean hasEmail() {
      return accountCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Email address of account being granted permission.
     * Mutually exclusive with `walletId`.
     * </pre>
     *
     * <code>string email = 1;</code>
     *
     * @return The email.
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      java.lang.Object ref = "";
      if (accountCase_ == 1) {
        ref = account_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (accountCase_ == 1) {
          account_ = s;
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
     * Email address of account being granted permission.
     * Mutually exclusive with `walletId`.
     * </pre>
     *
     * <code>string email = 1;</code>
     *
     * @return The bytes for email.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEmailBytes() {
      java.lang.Object ref = "";
      if (accountCase_ == 1) {
        ref = account_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (accountCase_ == 1) {
          account_ = b;
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
     * Email address of account being granted permission.
     * Mutually exclusive with `walletId`.
     * </pre>
     *
     * <code>string email = 1;</code>
     *
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      accountCase_ = 1;
      account_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email address of account being granted permission.
     * Mutually exclusive with `walletId`.
     * </pre>
     *
     * <code>string email = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      if (accountCase_ == 1) {
        accountCase_ = 0;
        account_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email address of account being granted permission.
     * Mutually exclusive with `walletId`.
     * </pre>
     *
     * <code>string email = 1;</code>
     *
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      accountCase_ = 1;
      account_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Wallet ID of account being granted permission.
     * Mutually exclusive with `email`.
     * </pre>
     *
     * <code>string walletId = 2;</code>
     *
     * @return Whether the walletId field is set.
     */
    @java.lang.Override
    public boolean hasWalletId() {
      return accountCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Wallet ID of account being granted permission.
     * Mutually exclusive with `email`.
     * </pre>
     *
     * <code>string walletId = 2;</code>
     *
     * @return The walletId.
     */
    @java.lang.Override
    public java.lang.String getWalletId() {
      java.lang.Object ref = "";
      if (accountCase_ == 2) {
        ref = account_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (accountCase_ == 2) {
          account_ = s;
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
     * Wallet ID of account being granted permission.
     * Mutually exclusive with `email`.
     * </pre>
     *
     * <code>string walletId = 2;</code>
     *
     * @return The bytes for walletId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getWalletIdBytes() {
      java.lang.Object ref = "";
      if (accountCase_ == 2) {
        ref = account_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (accountCase_ == 2) {
          account_ = b;
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
     * Wallet ID of account being granted permission.
     * Mutually exclusive with `email`.
     * </pre>
     *
     * <code>string walletId = 2;</code>
     *
     * @param value The walletId to set.
     * @return This builder for chaining.
     */
    public Builder setWalletId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      accountCase_ = 2;
      account_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Wallet ID of account being granted permission.
     * Mutually exclusive with `email`.
     * </pre>
     *
     * <code>string walletId = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWalletId() {
      if (accountCase_ == 2) {
        accountCase_ = 0;
        account_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Wallet ID of account being granted permission.
     * Mutually exclusive with `email`.
     * </pre>
     *
     * <code>string walletId = 2;</code>
     *
     * @param value The bytes for walletId to set.
     * @return This builder for chaining.
     */
    public Builder setWalletIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      accountCase_ = 2;
      account_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resource_ = "";
    /**
     *
     *
     * <pre>
     * Resource string that account is receiving permissions for.
     * Resources are specified as a RESTful path: /{ecoId}/{resource type}/{resource id}. `ecoId` may be omitted.
     * </pre>
     *
     * <code>string resource = 3;</code>
     *
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource string that account is receiving permissions for.
     * Resources are specified as a RESTful path: /{ecoId}/{resource type}/{resource id}. `ecoId` may be omitted.
     * </pre>
     *
     * <code>string resource = 3;</code>
     *
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource string that account is receiving permissions for.
     * Resources are specified as a RESTful path: /{ecoId}/{resource type}/{resource id}. `ecoId` may be omitted.
     * </pre>
     *
     * <code>string resource = 3;</code>
     *
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      resource_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource string that account is receiving permissions for.
     * Resources are specified as a RESTful path: /{ecoId}/{resource type}/{resource id}. `ecoId` may be omitted.
     * </pre>
     *
     * <code>string resource = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResource() {

      resource_ = getDefaultInstance().getResource();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource string that account is receiving permissions for.
     * Resources are specified as a RESTful path: /{ecoId}/{resource type}/{resource id}. `ecoId` may be omitted.
     * </pre>
     *
     * <code>string resource = 3;</code>
     *
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      resource_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object action_ = "";
    /**
     *
     *
     * <pre>
     * Action to authorize. Default is "*" (all)
     * </pre>
     *
     * <code>string action = 4;</code>
     *
     * @return The action.
     */
    public java.lang.String getAction() {
      java.lang.Object ref = action_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        action_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Action to authorize. Default is "*" (all)
     * </pre>
     *
     * <code>string action = 4;</code>
     *
     * @return The bytes for action.
     */
    public com.google.protobuf.ByteString getActionBytes() {
      java.lang.Object ref = action_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        action_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Action to authorize. Default is "*" (all)
     * </pre>
     *
     * <code>string action = 4;</code>
     *
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      action_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Action to authorize. Default is "*" (all)
     * </pre>
     *
     * <code>string action = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAction() {

      action_ = getDefaultInstance().getAction();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Action to authorize. Default is "*" (all)
     * </pre>
     *
     * <code>string action = 4;</code>
     *
     * @param value The bytes for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      action_ = value;
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

    // @@protoc_insertion_point(builder_scope:services.provider.v1.GrantAuthorizationRequest)
  }

  // @@protoc_insertion_point(class_scope:services.provider.v1.GrantAuthorizationRequest)
  private static final trinsic.services.provider.v1.GrantAuthorizationRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.provider.v1.GrantAuthorizationRequest();
  }

  public static trinsic.services.provider.v1.GrantAuthorizationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrantAuthorizationRequest> PARSER =
      new com.google.protobuf.AbstractParser<GrantAuthorizationRequest>() {
        @java.lang.Override
        public GrantAuthorizationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GrantAuthorizationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrantAuthorizationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.provider.v1.GrantAuthorizationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
