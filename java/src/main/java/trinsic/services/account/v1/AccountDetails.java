// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/account/v1/account.proto

package trinsic.services.account.v1;

/**
 *
 *
 * <pre>
 * Account registration details
 * </pre>
 *
 * Protobuf type {@code services.account.v1.AccountDetails}
 */
public final class AccountDetails extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.account.v1.AccountDetails)
    AccountDetailsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AccountDetails.newBuilder() to construct.
  private AccountDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AccountDetails() {
    name_ = "";
    email_ = "";
    sms_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AccountDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AccountDetails(
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

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              email_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              sms_ = s;
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
    return trinsic.services.account.v1.AccountOuterClass
        .internal_static_services_account_v1_AccountDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.account.v1.AccountOuterClass
        .internal_static_services_account_v1_AccountDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.account.v1.AccountDetails.class,
            trinsic.services.account.v1.AccountDetails.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Account name
   * </pre>
   *
   * <code>string name = 1 [(.services.options.optional) = true];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Account name
   * </pre>
   *
   * <code>string name = 1 [(.services.options.optional) = true];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 2;
  private volatile java.lang.Object email_;
  /**
   *
   *
   * <pre>
   * Email address of account
   * </pre>
   *
   * <code>string email = 2 [(.services.options.optional) = true];</code>
   *
   * @return The email.
   */
  @java.lang.Override
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Email address of account
   * </pre>
   *
   * <code>string email = 2 [(.services.options.optional) = true];</code>
   *
   * @return The bytes for email.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SMS_FIELD_NUMBER = 3;
  private volatile java.lang.Object sms_;
  /**
   *
   *
   * <pre>
   * SMS number including country code
   * </pre>
   *
   * <code>string sms = 3 [(.services.options.optional) = true];</code>
   *
   * @return The sms.
   */
  @java.lang.Override
  public java.lang.String getSms() {
    java.lang.Object ref = sms_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sms_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * SMS number including country code
   * </pre>
   *
   * <code>string sms = 3 [(.services.options.optional) = true];</code>
   *
   * @return The bytes for sms.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSmsBytes() {
    java.lang.Object ref = sms_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sms_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, email_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sms_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sms_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, email_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sms_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sms_);
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
    if (!(obj instanceof trinsic.services.account.v1.AccountDetails)) {
      return super.equals(obj);
    }
    trinsic.services.account.v1.AccountDetails other =
        (trinsic.services.account.v1.AccountDetails) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getEmail().equals(other.getEmail())) return false;
    if (!getSms().equals(other.getSms())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (37 * hash) + SMS_FIELD_NUMBER;
    hash = (53 * hash) + getSms().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.account.v1.AccountDetails parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.account.v1.AccountDetails parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.account.v1.AccountDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.account.v1.AccountDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.account.v1.AccountDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.account.v1.AccountDetails parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.account.v1.AccountDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.account.v1.AccountDetails parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.account.v1.AccountDetails parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.account.v1.AccountDetails parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.account.v1.AccountDetails parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.account.v1.AccountDetails parseFrom(
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

  public static Builder newBuilder(trinsic.services.account.v1.AccountDetails prototype) {
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
   * Account registration details
   * </pre>
   *
   * Protobuf type {@code services.account.v1.AccountDetails}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.account.v1.AccountDetails)
      trinsic.services.account.v1.AccountDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.account.v1.AccountOuterClass
          .internal_static_services_account_v1_AccountDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.account.v1.AccountOuterClass
          .internal_static_services_account_v1_AccountDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.account.v1.AccountDetails.class,
              trinsic.services.account.v1.AccountDetails.Builder.class);
    }

    // Construct using trinsic.services.account.v1.AccountDetails.newBuilder()
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
      name_ = "";

      email_ = "";

      sms_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.account.v1.AccountOuterClass
          .internal_static_services_account_v1_AccountDetails_descriptor;
    }

    @java.lang.Override
    public trinsic.services.account.v1.AccountDetails getDefaultInstanceForType() {
      return trinsic.services.account.v1.AccountDetails.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.account.v1.AccountDetails build() {
      trinsic.services.account.v1.AccountDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.account.v1.AccountDetails buildPartial() {
      trinsic.services.account.v1.AccountDetails result =
          new trinsic.services.account.v1.AccountDetails(this);
      result.name_ = name_;
      result.email_ = email_;
      result.sms_ = sms_;
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
      if (other instanceof trinsic.services.account.v1.AccountDetails) {
        return mergeFrom((trinsic.services.account.v1.AccountDetails) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.account.v1.AccountDetails other) {
      if (other == trinsic.services.account.v1.AccountDetails.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
      }
      if (!other.getSms().isEmpty()) {
        sms_ = other.sms_;
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
      trinsic.services.account.v1.AccountDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (trinsic.services.account.v1.AccountDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Account name
     * </pre>
     *
     * <code>string name = 1 [(.services.options.optional) = true];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Account name
     * </pre>
     *
     * <code>string name = 1 [(.services.options.optional) = true];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Account name
     * </pre>
     *
     * <code>string name = 1 [(.services.options.optional) = true];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Account name
     * </pre>
     *
     * <code>string name = 1 [(.services.options.optional) = true];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Account name
     * </pre>
     *
     * <code>string name = 1 [(.services.options.optional) = true];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     *
     *
     * <pre>
     * Email address of account
     * </pre>
     *
     * <code>string email = 2 [(.services.options.optional) = true];</code>
     *
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Email address of account
     * </pre>
     *
     * <code>string email = 2 [(.services.options.optional) = true];</code>
     *
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Email address of account
     * </pre>
     *
     * <code>string email = 2 [(.services.options.optional) = true];</code>
     *
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      email_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email address of account
     * </pre>
     *
     * <code>string email = 2 [(.services.options.optional) = true];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEmail() {

      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email address of account
     * </pre>
     *
     * <code>string email = 2 [(.services.options.optional) = true];</code>
     *
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      email_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sms_ = "";
    /**
     *
     *
     * <pre>
     * SMS number including country code
     * </pre>
     *
     * <code>string sms = 3 [(.services.options.optional) = true];</code>
     *
     * @return The sms.
     */
    public java.lang.String getSms() {
      java.lang.Object ref = sms_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sms_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * SMS number including country code
     * </pre>
     *
     * <code>string sms = 3 [(.services.options.optional) = true];</code>
     *
     * @return The bytes for sms.
     */
    public com.google.protobuf.ByteString getSmsBytes() {
      java.lang.Object ref = sms_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sms_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * SMS number including country code
     * </pre>
     *
     * <code>string sms = 3 [(.services.options.optional) = true];</code>
     *
     * @param value The sms to set.
     * @return This builder for chaining.
     */
    public Builder setSms(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      sms_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * SMS number including country code
     * </pre>
     *
     * <code>string sms = 3 [(.services.options.optional) = true];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSms() {

      sms_ = getDefaultInstance().getSms();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * SMS number including country code
     * </pre>
     *
     * <code>string sms = 3 [(.services.options.optional) = true];</code>
     *
     * @param value The bytes for sms to set.
     * @return This builder for chaining.
     */
    public Builder setSmsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      sms_ = value;
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

    // @@protoc_insertion_point(builder_scope:services.account.v1.AccountDetails)
  }

  // @@protoc_insertion_point(class_scope:services.account.v1.AccountDetails)
  private static final trinsic.services.account.v1.AccountDetails DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.account.v1.AccountDetails();
  }

  public static trinsic.services.account.v1.AccountDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountDetails> PARSER =
      new com.google.protobuf.AbstractParser<AccountDetails>() {
        @java.lang.Override
        public AccountDetails parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AccountDetails(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AccountDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.account.v1.AccountDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
