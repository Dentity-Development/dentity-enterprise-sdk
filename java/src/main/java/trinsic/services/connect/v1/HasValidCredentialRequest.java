// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/connect/v1/connect.proto

package trinsic.services.connect.v1;

/**
 *
 *
 * <pre>
 * Request to preemptively check if an identity has a valid reusable credential
 * </pre>
 *
 * Protobuf type {@code services.connect.v1.HasValidCredentialRequest}
 */
public final class HasValidCredentialRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.connect.v1.HasValidCredentialRequest)
    HasValidCredentialRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HasValidCredentialRequest.newBuilder() to construct.
  private HasValidCredentialRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HasValidCredentialRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HasValidCredentialRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.connect.v1.ConnectOuterClass
        .internal_static_services_connect_v1_HasValidCredentialRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.connect.v1.ConnectOuterClass
        .internal_static_services_connect_v1_HasValidCredentialRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.connect.v1.HasValidCredentialRequest.class,
            trinsic.services.connect.v1.HasValidCredentialRequest.Builder.class);
  }

  public static final int IDENTITY_FIELD_NUMBER = 1;
  private trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity_;
  /**
   *
   *
   * <pre>
   * The the identity used to find a credential for
   * </pre>
   *
   * <code>.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity = 1;</code>
   *
   * @return Whether the identity field is set.
   */
  @java.lang.Override
  public boolean hasIdentity() {
    return identity_ != null;
  }
  /**
   *
   *
   * <pre>
   * The the identity used to find a credential for
   * </pre>
   *
   * <code>.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity = 1;</code>
   *
   * @return The identity.
   */
  @java.lang.Override
  public trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity getIdentity() {
    return identity_ == null
        ? trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity
            .getDefaultInstance()
        : identity_;
  }
  /**
   *
   *
   * <pre>
   * The the identity used to find a credential for
   * </pre>
   *
   * <code>.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity = 1;</code>
   */
  @java.lang.Override
  public trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentityOrBuilder
      getIdentityOrBuilder() {
    return getIdentity();
  }

  public static final int CREDENTIAL_REQUEST_DATA_FIELD_NUMBER = 2;
  private trinsic.services.connect.v1.CredentialRequestData credentialRequestData_;
  /**
   *
   *
   * <pre>
   * The criteria used to find a valid credential
   * </pre>
   *
   * <code>.services.connect.v1.CredentialRequestData credential_request_data = 2;</code>
   *
   * @return Whether the credentialRequestData field is set.
   */
  @java.lang.Override
  public boolean hasCredentialRequestData() {
    return credentialRequestData_ != null;
  }
  /**
   *
   *
   * <pre>
   * The criteria used to find a valid credential
   * </pre>
   *
   * <code>.services.connect.v1.CredentialRequestData credential_request_data = 2;</code>
   *
   * @return The credentialRequestData.
   */
  @java.lang.Override
  public trinsic.services.connect.v1.CredentialRequestData getCredentialRequestData() {
    return credentialRequestData_ == null
        ? trinsic.services.connect.v1.CredentialRequestData.getDefaultInstance()
        : credentialRequestData_;
  }
  /**
   *
   *
   * <pre>
   * The criteria used to find a valid credential
   * </pre>
   *
   * <code>.services.connect.v1.CredentialRequestData credential_request_data = 2;</code>
   */
  @java.lang.Override
  public trinsic.services.connect.v1.CredentialRequestDataOrBuilder
      getCredentialRequestDataOrBuilder() {
    return getCredentialRequestData();
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
    if (credentialRequestData_ != null) {
      output.writeMessage(2, getCredentialRequestData());
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
    if (credentialRequestData_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCredentialRequestData());
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
    if (!(obj instanceof trinsic.services.connect.v1.HasValidCredentialRequest)) {
      return super.equals(obj);
    }
    trinsic.services.connect.v1.HasValidCredentialRequest other =
        (trinsic.services.connect.v1.HasValidCredentialRequest) obj;

    if (hasIdentity() != other.hasIdentity()) return false;
    if (hasIdentity()) {
      if (!getIdentity().equals(other.getIdentity())) return false;
    }
    if (hasCredentialRequestData() != other.hasCredentialRequestData()) return false;
    if (hasCredentialRequestData()) {
      if (!getCredentialRequestData().equals(other.getCredentialRequestData())) return false;
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
    if (hasCredentialRequestData()) {
      hash = (37 * hash) + CREDENTIAL_REQUEST_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getCredentialRequestData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.connect.v1.HasValidCredentialRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.connect.v1.HasValidCredentialRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.connect.v1.HasValidCredentialRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.connect.v1.HasValidCredentialRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.connect.v1.HasValidCredentialRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.connect.v1.HasValidCredentialRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.connect.v1.HasValidCredentialRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.connect.v1.HasValidCredentialRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.connect.v1.HasValidCredentialRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.connect.v1.HasValidCredentialRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.connect.v1.HasValidCredentialRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.connect.v1.HasValidCredentialRequest parseFrom(
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
      trinsic.services.connect.v1.HasValidCredentialRequest prototype) {
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
   * Request to preemptively check if an identity has a valid reusable credential
   * </pre>
   *
   * Protobuf type {@code services.connect.v1.HasValidCredentialRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.connect.v1.HasValidCredentialRequest)
      trinsic.services.connect.v1.HasValidCredentialRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.connect.v1.ConnectOuterClass
          .internal_static_services_connect_v1_HasValidCredentialRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.connect.v1.ConnectOuterClass
          .internal_static_services_connect_v1_HasValidCredentialRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.connect.v1.HasValidCredentialRequest.class,
              trinsic.services.connect.v1.HasValidCredentialRequest.Builder.class);
    }

    // Construct using trinsic.services.connect.v1.HasValidCredentialRequest.newBuilder()
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
      if (credentialRequestDataBuilder_ == null) {
        credentialRequestData_ = null;
      } else {
        credentialRequestData_ = null;
        credentialRequestDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.connect.v1.ConnectOuterClass
          .internal_static_services_connect_v1_HasValidCredentialRequest_descriptor;
    }

    @java.lang.Override
    public trinsic.services.connect.v1.HasValidCredentialRequest getDefaultInstanceForType() {
      return trinsic.services.connect.v1.HasValidCredentialRequest.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.connect.v1.HasValidCredentialRequest build() {
      trinsic.services.connect.v1.HasValidCredentialRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.connect.v1.HasValidCredentialRequest buildPartial() {
      trinsic.services.connect.v1.HasValidCredentialRequest result =
          new trinsic.services.connect.v1.HasValidCredentialRequest(this);
      if (identityBuilder_ == null) {
        result.identity_ = identity_;
      } else {
        result.identity_ = identityBuilder_.build();
      }
      if (credentialRequestDataBuilder_ == null) {
        result.credentialRequestData_ = credentialRequestData_;
      } else {
        result.credentialRequestData_ = credentialRequestDataBuilder_.build();
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
      if (other instanceof trinsic.services.connect.v1.HasValidCredentialRequest) {
        return mergeFrom((trinsic.services.connect.v1.HasValidCredentialRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.connect.v1.HasValidCredentialRequest other) {
      if (other == trinsic.services.connect.v1.HasValidCredentialRequest.getDefaultInstance())
        return this;
      if (other.hasIdentity()) {
        mergeIdentity(other.getIdentity());
      }
      if (other.hasCredentialRequestData()) {
        mergeCredentialRequestData(other.getCredentialRequestData());
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
            case 18:
              {
                input.readMessage(
                    getCredentialRequestDataFieldBuilder().getBuilder(), extensionRegistry);

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

    private trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity_;
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity,
            trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity.Builder,
            trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentityOrBuilder>
        identityBuilder_;
    /**
     *
     *
     * <pre>
     * The the identity used to find a credential for
     * </pre>
     *
     * <code>.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity = 1;</code>
     *
     * @return Whether the identity field is set.
     */
    public boolean hasIdentity() {
      return identityBuilder_ != null || identity_ != null;
    }
    /**
     *
     *
     * <pre>
     * The the identity used to find a credential for
     * </pre>
     *
     * <code>.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity = 1;</code>
     *
     * @return The identity.
     */
    public trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity getIdentity() {
      if (identityBuilder_ == null) {
        return identity_ == null
            ? trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity
                .getDefaultInstance()
            : identity_;
      } else {
        return identityBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The the identity used to find a credential for
     * </pre>
     *
     * <code>.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity = 1;</code>
     */
    public Builder setIdentity(
        trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity value) {
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
    /**
     *
     *
     * <pre>
     * The the identity used to find a credential for
     * </pre>
     *
     * <code>.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity = 1;</code>
     */
    public Builder setIdentity(
        trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity.Builder
            builderForValue) {
      if (identityBuilder_ == null) {
        identity_ = builderForValue.build();
        onChanged();
      } else {
        identityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The the identity used to find a credential for
     * </pre>
     *
     * <code>.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity = 1;</code>
     */
    public Builder mergeIdentity(
        trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity value) {
      if (identityBuilder_ == null) {
        if (identity_ != null) {
          identity_ =
              trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity.newBuilder(
                      identity_)
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
    /**
     *
     *
     * <pre>
     * The the identity used to find a credential for
     * </pre>
     *
     * <code>.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity = 1;</code>
     */
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
    /**
     *
     *
     * <pre>
     * The the identity used to find a credential for
     * </pre>
     *
     * <code>.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity = 1;</code>
     */
    public trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity.Builder
        getIdentityBuilder() {

      onChanged();
      return getIdentityFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The the identity used to find a credential for
     * </pre>
     *
     * <code>.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity = 1;</code>
     */
    public trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentityOrBuilder
        getIdentityOrBuilder() {
      if (identityBuilder_ != null) {
        return identityBuilder_.getMessageOrBuilder();
      } else {
        return identity_ == null
            ? trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity
                .getDefaultInstance()
            : identity_;
      }
    }
    /**
     *
     *
     * <pre>
     * The the identity used to find a credential for
     * </pre>
     *
     * <code>.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity identity = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity,
            trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity.Builder,
            trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentityOrBuilder>
        getIdentityFieldBuilder() {
      if (identityBuilder_ == null) {
        identityBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity,
                trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentity.Builder,
                trinsic.services.universalwallet.v1.CreateWalletRequest.ExternalIdentityOrBuilder>(
                getIdentity(), getParentForChildren(), isClean());
        identity_ = null;
      }
      return identityBuilder_;
    }

    private trinsic.services.connect.v1.CredentialRequestData credentialRequestData_;
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.connect.v1.CredentialRequestData,
            trinsic.services.connect.v1.CredentialRequestData.Builder,
            trinsic.services.connect.v1.CredentialRequestDataOrBuilder>
        credentialRequestDataBuilder_;
    /**
     *
     *
     * <pre>
     * The criteria used to find a valid credential
     * </pre>
     *
     * <code>.services.connect.v1.CredentialRequestData credential_request_data = 2;</code>
     *
     * @return Whether the credentialRequestData field is set.
     */
    public boolean hasCredentialRequestData() {
      return credentialRequestDataBuilder_ != null || credentialRequestData_ != null;
    }
    /**
     *
     *
     * <pre>
     * The criteria used to find a valid credential
     * </pre>
     *
     * <code>.services.connect.v1.CredentialRequestData credential_request_data = 2;</code>
     *
     * @return The credentialRequestData.
     */
    public trinsic.services.connect.v1.CredentialRequestData getCredentialRequestData() {
      if (credentialRequestDataBuilder_ == null) {
        return credentialRequestData_ == null
            ? trinsic.services.connect.v1.CredentialRequestData.getDefaultInstance()
            : credentialRequestData_;
      } else {
        return credentialRequestDataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The criteria used to find a valid credential
     * </pre>
     *
     * <code>.services.connect.v1.CredentialRequestData credential_request_data = 2;</code>
     */
    public Builder setCredentialRequestData(
        trinsic.services.connect.v1.CredentialRequestData value) {
      if (credentialRequestDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        credentialRequestData_ = value;
        onChanged();
      } else {
        credentialRequestDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The criteria used to find a valid credential
     * </pre>
     *
     * <code>.services.connect.v1.CredentialRequestData credential_request_data = 2;</code>
     */
    public Builder setCredentialRequestData(
        trinsic.services.connect.v1.CredentialRequestData.Builder builderForValue) {
      if (credentialRequestDataBuilder_ == null) {
        credentialRequestData_ = builderForValue.build();
        onChanged();
      } else {
        credentialRequestDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The criteria used to find a valid credential
     * </pre>
     *
     * <code>.services.connect.v1.CredentialRequestData credential_request_data = 2;</code>
     */
    public Builder mergeCredentialRequestData(
        trinsic.services.connect.v1.CredentialRequestData value) {
      if (credentialRequestDataBuilder_ == null) {
        if (credentialRequestData_ != null) {
          credentialRequestData_ =
              trinsic.services.connect.v1.CredentialRequestData.newBuilder(credentialRequestData_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          credentialRequestData_ = value;
        }
        onChanged();
      } else {
        credentialRequestDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The criteria used to find a valid credential
     * </pre>
     *
     * <code>.services.connect.v1.CredentialRequestData credential_request_data = 2;</code>
     */
    public Builder clearCredentialRequestData() {
      if (credentialRequestDataBuilder_ == null) {
        credentialRequestData_ = null;
        onChanged();
      } else {
        credentialRequestData_ = null;
        credentialRequestDataBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The criteria used to find a valid credential
     * </pre>
     *
     * <code>.services.connect.v1.CredentialRequestData credential_request_data = 2;</code>
     */
    public trinsic.services.connect.v1.CredentialRequestData.Builder
        getCredentialRequestDataBuilder() {

      onChanged();
      return getCredentialRequestDataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The criteria used to find a valid credential
     * </pre>
     *
     * <code>.services.connect.v1.CredentialRequestData credential_request_data = 2;</code>
     */
    public trinsic.services.connect.v1.CredentialRequestDataOrBuilder
        getCredentialRequestDataOrBuilder() {
      if (credentialRequestDataBuilder_ != null) {
        return credentialRequestDataBuilder_.getMessageOrBuilder();
      } else {
        return credentialRequestData_ == null
            ? trinsic.services.connect.v1.CredentialRequestData.getDefaultInstance()
            : credentialRequestData_;
      }
    }
    /**
     *
     *
     * <pre>
     * The criteria used to find a valid credential
     * </pre>
     *
     * <code>.services.connect.v1.CredentialRequestData credential_request_data = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.connect.v1.CredentialRequestData,
            trinsic.services.connect.v1.CredentialRequestData.Builder,
            trinsic.services.connect.v1.CredentialRequestDataOrBuilder>
        getCredentialRequestDataFieldBuilder() {
      if (credentialRequestDataBuilder_ == null) {
        credentialRequestDataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                trinsic.services.connect.v1.CredentialRequestData,
                trinsic.services.connect.v1.CredentialRequestData.Builder,
                trinsic.services.connect.v1.CredentialRequestDataOrBuilder>(
                getCredentialRequestData(), getParentForChildren(), isClean());
        credentialRequestData_ = null;
      }
      return credentialRequestDataBuilder_;
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

    // @@protoc_insertion_point(builder_scope:services.connect.v1.HasValidCredentialRequest)
  }

  // @@protoc_insertion_point(class_scope:services.connect.v1.HasValidCredentialRequest)
  private static final trinsic.services.connect.v1.HasValidCredentialRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.connect.v1.HasValidCredentialRequest();
  }

  public static trinsic.services.connect.v1.HasValidCredentialRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HasValidCredentialRequest> PARSER =
      new com.google.protobuf.AbstractParser<HasValidCredentialRequest>() {
        @java.lang.Override
        public HasValidCredentialRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<HasValidCredentialRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HasValidCredentialRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.connect.v1.HasValidCredentialRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}