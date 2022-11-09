// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/account/v1/account.proto

package trinsic.services.account.v1;

/**
 * <pre>
 * Token protection info
 * </pre>
 *
 * Protobuf type {@code services.account.v1.TokenProtection}
 */
public final class TokenProtection extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.account.v1.TokenProtection)
    TokenProtectionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TokenProtection.newBuilder() to construct.
  private TokenProtection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TokenProtection() {
    method_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TokenProtection();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TokenProtection(
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
          case 8: {

            enabled_ = input.readBool();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            method_ = rawValue;
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
    return trinsic.services.account.v1.AccountOuterClass.internal_static_services_account_v1_TokenProtection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.account.v1.AccountOuterClass.internal_static_services_account_v1_TokenProtection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.account.v1.TokenProtection.class, trinsic.services.account.v1.TokenProtection.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_;
  /**
   * <pre>
   * Indicates if token is protected using a PIN,
   * security code, HSM secret, etc.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int METHOD_FIELD_NUMBER = 2;
  private int method_;
  /**
   * <pre>
   * The method used to protect the token
   * </pre>
   *
   * <code>.services.account.v1.ConfirmationMethod method = 2;</code>
   * @return The enum numeric value on the wire for method.
   */
  @java.lang.Override public int getMethodValue() {
    return method_;
  }
  /**
   * <pre>
   * The method used to protect the token
   * </pre>
   *
   * <code>.services.account.v1.ConfirmationMethod method = 2;</code>
   * @return The method.
   */
  @java.lang.Override public trinsic.services.account.v1.ConfirmationMethod getMethod() {
    @SuppressWarnings("deprecation")
    trinsic.services.account.v1.ConfirmationMethod result = trinsic.services.account.v1.ConfirmationMethod.valueOf(method_);
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (method_ != trinsic.services.account.v1.ConfirmationMethod.None.getNumber()) {
      output.writeEnum(2, method_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enabled_);
    }
    if (method_ != trinsic.services.account.v1.ConfirmationMethod.None.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, method_);
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
    if (!(obj instanceof trinsic.services.account.v1.TokenProtection)) {
      return super.equals(obj);
    }
    trinsic.services.account.v1.TokenProtection other = (trinsic.services.account.v1.TokenProtection) obj;

    if (getEnabled()
        != other.getEnabled()) return false;
    if (method_ != other.method_) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    hash = (37 * hash) + METHOD_FIELD_NUMBER;
    hash = (53 * hash) + method_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.account.v1.TokenProtection parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.services.account.v1.TokenProtection parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.services.account.v1.TokenProtection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.services.account.v1.TokenProtection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.services.account.v1.TokenProtection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.services.account.v1.TokenProtection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.services.account.v1.TokenProtection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static trinsic.services.account.v1.TokenProtection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static trinsic.services.account.v1.TokenProtection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static trinsic.services.account.v1.TokenProtection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static trinsic.services.account.v1.TokenProtection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static trinsic.services.account.v1.TokenProtection parseFrom(
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
  public static Builder newBuilder(trinsic.services.account.v1.TokenProtection prototype) {
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
   * Token protection info
   * </pre>
   *
   * Protobuf type {@code services.account.v1.TokenProtection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.account.v1.TokenProtection)
      trinsic.services.account.v1.TokenProtectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return trinsic.services.account.v1.AccountOuterClass.internal_static_services_account_v1_TokenProtection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.account.v1.AccountOuterClass.internal_static_services_account_v1_TokenProtection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.account.v1.TokenProtection.class, trinsic.services.account.v1.TokenProtection.Builder.class);
    }

    // Construct using trinsic.services.account.v1.TokenProtection.newBuilder()
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
      enabled_ = false;

      method_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return trinsic.services.account.v1.AccountOuterClass.internal_static_services_account_v1_TokenProtection_descriptor;
    }

    @java.lang.Override
    public trinsic.services.account.v1.TokenProtection getDefaultInstanceForType() {
      return trinsic.services.account.v1.TokenProtection.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.account.v1.TokenProtection build() {
      trinsic.services.account.v1.TokenProtection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.account.v1.TokenProtection buildPartial() {
      trinsic.services.account.v1.TokenProtection result = new trinsic.services.account.v1.TokenProtection(this);
      result.enabled_ = enabled_;
      result.method_ = method_;
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
      if (other instanceof trinsic.services.account.v1.TokenProtection) {
        return mergeFrom((trinsic.services.account.v1.TokenProtection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.account.v1.TokenProtection other) {
      if (other == trinsic.services.account.v1.TokenProtection.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.method_ != 0) {
        setMethodValue(other.getMethodValue());
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
      trinsic.services.account.v1.TokenProtection parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (trinsic.services.account.v1.TokenProtection) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enabled_ ;
    /**
     * <pre>
     * Indicates if token is protected using a PIN,
     * security code, HSM secret, etc.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <pre>
     * Indicates if token is protected using a PIN,
     * security code, HSM secret, etc.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates if token is protected using a PIN,
     * security code, HSM secret, etc.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      
      enabled_ = false;
      onChanged();
      return this;
    }

    private int method_ = 0;
    /**
     * <pre>
     * The method used to protect the token
     * </pre>
     *
     * <code>.services.account.v1.ConfirmationMethod method = 2;</code>
     * @return The enum numeric value on the wire for method.
     */
    @java.lang.Override public int getMethodValue() {
      return method_;
    }
    /**
     * <pre>
     * The method used to protect the token
     * </pre>
     *
     * <code>.services.account.v1.ConfirmationMethod method = 2;</code>
     * @param value The enum numeric value on the wire for method to set.
     * @return This builder for chaining.
     */
    public Builder setMethodValue(int value) {
      
      method_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The method used to protect the token
     * </pre>
     *
     * <code>.services.account.v1.ConfirmationMethod method = 2;</code>
     * @return The method.
     */
    @java.lang.Override
    public trinsic.services.account.v1.ConfirmationMethod getMethod() {
      @SuppressWarnings("deprecation")
      trinsic.services.account.v1.ConfirmationMethod result = trinsic.services.account.v1.ConfirmationMethod.valueOf(method_);
      return result == null ? trinsic.services.account.v1.ConfirmationMethod.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The method used to protect the token
     * </pre>
     *
     * <code>.services.account.v1.ConfirmationMethod method = 2;</code>
     * @param value The method to set.
     * @return This builder for chaining.
     */
    public Builder setMethod(trinsic.services.account.v1.ConfirmationMethod value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      method_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The method used to protect the token
     * </pre>
     *
     * <code>.services.account.v1.ConfirmationMethod method = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMethod() {
      
      method_ = 0;
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


    // @@protoc_insertion_point(builder_scope:services.account.v1.TokenProtection)
  }

  // @@protoc_insertion_point(class_scope:services.account.v1.TokenProtection)
  private static final trinsic.services.account.v1.TokenProtection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new trinsic.services.account.v1.TokenProtection();
  }

  public static trinsic.services.account.v1.TokenProtection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TokenProtection>
      PARSER = new com.google.protobuf.AbstractParser<TokenProtection>() {
    @java.lang.Override
    public TokenProtection parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TokenProtection(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TokenProtection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TokenProtection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.account.v1.TokenProtection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

