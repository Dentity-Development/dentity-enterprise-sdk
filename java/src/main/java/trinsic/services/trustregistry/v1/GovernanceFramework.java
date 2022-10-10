// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/trust-registry/v1/trust-registry.proto

package trinsic.services.trustregistry.v1;

/**
 *
 *
 * <pre>
 * Ecosystem Governance Framework
 * </pre>
 *
 * Protobuf type {@code services.trustregistry.v1.GovernanceFramework}
 */
public final class GovernanceFramework extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.trustregistry.v1.GovernanceFramework)
    GovernanceFrameworkOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GovernanceFramework.newBuilder() to construct.
  private GovernanceFramework(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GovernanceFramework() {
    governanceFrameworkUri_ = "";
    trustRegistryUri_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GovernanceFramework();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
        .internal_static_services_trustregistry_v1_GovernanceFramework_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
        .internal_static_services_trustregistry_v1_GovernanceFramework_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.trustregistry.v1.GovernanceFramework.class,
            trinsic.services.trustregistry.v1.GovernanceFramework.Builder.class);
  }

  public static final int GOVERNANCE_FRAMEWORK_URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object governanceFrameworkUri_;
  /**
   *
   *
   * <pre>
   * URI of governance framework organization
   * </pre>
   *
   * <code>string governance_framework_uri = 1;</code>
   *
   * @return The governanceFrameworkUri.
   */
  @java.lang.Override
  public java.lang.String getGovernanceFrameworkUri() {
    java.lang.Object ref = governanceFrameworkUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      governanceFrameworkUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URI of governance framework organization
   * </pre>
   *
   * <code>string governance_framework_uri = 1;</code>
   *
   * @return The bytes for governanceFrameworkUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGovernanceFrameworkUriBytes() {
    java.lang.Object ref = governanceFrameworkUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      governanceFrameworkUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRUST_REGISTRY_URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object trustRegistryUri_;
  /**
   *
   *
   * <pre>
   * URI of trust registry associated with governance framework
   * </pre>
   *
   * <code>string trust_registry_uri = 2;</code>
   *
   * @return The trustRegistryUri.
   */
  @java.lang.Override
  public java.lang.String getTrustRegistryUri() {
    java.lang.Object ref = trustRegistryUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      trustRegistryUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URI of trust registry associated with governance framework
   * </pre>
   *
   * <code>string trust_registry_uri = 2;</code>
   *
   * @return The bytes for trustRegistryUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTrustRegistryUriBytes() {
    java.lang.Object ref = trustRegistryUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      trustRegistryUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   *
   *
   * <pre>
   * Description of governance framework
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Description of governance framework
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(governanceFrameworkUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, governanceFrameworkUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trustRegistryUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, trustRegistryUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(governanceFrameworkUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, governanceFrameworkUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trustRegistryUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, trustRegistryUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
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
    if (!(obj instanceof trinsic.services.trustregistry.v1.GovernanceFramework)) {
      return super.equals(obj);
    }
    trinsic.services.trustregistry.v1.GovernanceFramework other =
        (trinsic.services.trustregistry.v1.GovernanceFramework) obj;

    if (!getGovernanceFrameworkUri().equals(other.getGovernanceFrameworkUri())) return false;
    if (!getTrustRegistryUri().equals(other.getTrustRegistryUri())) return false;
    if (!getDescription().equals(other.getDescription())) return false;
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
    hash = (37 * hash) + GOVERNANCE_FRAMEWORK_URI_FIELD_NUMBER;
    hash = (53 * hash) + getGovernanceFrameworkUri().hashCode();
    hash = (37 * hash) + TRUST_REGISTRY_URI_FIELD_NUMBER;
    hash = (53 * hash) + getTrustRegistryUri().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.trustregistry.v1.GovernanceFramework parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.trustregistry.v1.GovernanceFramework parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.GovernanceFramework parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.trustregistry.v1.GovernanceFramework parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.GovernanceFramework parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.trustregistry.v1.GovernanceFramework parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.GovernanceFramework parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.trustregistry.v1.GovernanceFramework parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.GovernanceFramework parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.trustregistry.v1.GovernanceFramework parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.GovernanceFramework parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.trustregistry.v1.GovernanceFramework parseFrom(
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
      trinsic.services.trustregistry.v1.GovernanceFramework prototype) {
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
   * Ecosystem Governance Framework
   * </pre>
   *
   * Protobuf type {@code services.trustregistry.v1.GovernanceFramework}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.trustregistry.v1.GovernanceFramework)
      trinsic.services.trustregistry.v1.GovernanceFrameworkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
          .internal_static_services_trustregistry_v1_GovernanceFramework_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
          .internal_static_services_trustregistry_v1_GovernanceFramework_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.trustregistry.v1.GovernanceFramework.class,
              trinsic.services.trustregistry.v1.GovernanceFramework.Builder.class);
    }

    // Construct using trinsic.services.trustregistry.v1.GovernanceFramework.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      governanceFrameworkUri_ = "";

      trustRegistryUri_ = "";

      description_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
          .internal_static_services_trustregistry_v1_GovernanceFramework_descriptor;
    }

    @java.lang.Override
    public trinsic.services.trustregistry.v1.GovernanceFramework getDefaultInstanceForType() {
      return trinsic.services.trustregistry.v1.GovernanceFramework.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.trustregistry.v1.GovernanceFramework build() {
      trinsic.services.trustregistry.v1.GovernanceFramework result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.trustregistry.v1.GovernanceFramework buildPartial() {
      trinsic.services.trustregistry.v1.GovernanceFramework result =
          new trinsic.services.trustregistry.v1.GovernanceFramework(this);
      result.governanceFrameworkUri_ = governanceFrameworkUri_;
      result.trustRegistryUri_ = trustRegistryUri_;
      result.description_ = description_;
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
      if (other instanceof trinsic.services.trustregistry.v1.GovernanceFramework) {
        return mergeFrom((trinsic.services.trustregistry.v1.GovernanceFramework) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.trustregistry.v1.GovernanceFramework other) {
      if (other == trinsic.services.trustregistry.v1.GovernanceFramework.getDefaultInstance())
        return this;
      if (!other.getGovernanceFrameworkUri().isEmpty()) {
        governanceFrameworkUri_ = other.governanceFrameworkUri_;
        onChanged();
      }
      if (!other.getTrustRegistryUri().isEmpty()) {
        trustRegistryUri_ = other.trustRegistryUri_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
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
            case 10:
              {
                governanceFrameworkUri_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                trustRegistryUri_ = input.readStringRequireUtf8();

                break;
              } // case 18
            case 26:
              {
                description_ = input.readStringRequireUtf8();

                break;
              } // case 26
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

    private java.lang.Object governanceFrameworkUri_ = "";
    /**
     *
     *
     * <pre>
     * URI of governance framework organization
     * </pre>
     *
     * <code>string governance_framework_uri = 1;</code>
     *
     * @return The governanceFrameworkUri.
     */
    public java.lang.String getGovernanceFrameworkUri() {
      java.lang.Object ref = governanceFrameworkUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        governanceFrameworkUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of governance framework organization
     * </pre>
     *
     * <code>string governance_framework_uri = 1;</code>
     *
     * @return The bytes for governanceFrameworkUri.
     */
    public com.google.protobuf.ByteString getGovernanceFrameworkUriBytes() {
      java.lang.Object ref = governanceFrameworkUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        governanceFrameworkUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of governance framework organization
     * </pre>
     *
     * <code>string governance_framework_uri = 1;</code>
     *
     * @param value The governanceFrameworkUri to set.
     * @return This builder for chaining.
     */
    public Builder setGovernanceFrameworkUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      governanceFrameworkUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of governance framework organization
     * </pre>
     *
     * <code>string governance_framework_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGovernanceFrameworkUri() {

      governanceFrameworkUri_ = getDefaultInstance().getGovernanceFrameworkUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of governance framework organization
     * </pre>
     *
     * <code>string governance_framework_uri = 1;</code>
     *
     * @param value The bytes for governanceFrameworkUri to set.
     * @return This builder for chaining.
     */
    public Builder setGovernanceFrameworkUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      governanceFrameworkUri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object trustRegistryUri_ = "";
    /**
     *
     *
     * <pre>
     * URI of trust registry associated with governance framework
     * </pre>
     *
     * <code>string trust_registry_uri = 2;</code>
     *
     * @return The trustRegistryUri.
     */
    public java.lang.String getTrustRegistryUri() {
      java.lang.Object ref = trustRegistryUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trustRegistryUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of trust registry associated with governance framework
     * </pre>
     *
     * <code>string trust_registry_uri = 2;</code>
     *
     * @return The bytes for trustRegistryUri.
     */
    public com.google.protobuf.ByteString getTrustRegistryUriBytes() {
      java.lang.Object ref = trustRegistryUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        trustRegistryUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of trust registry associated with governance framework
     * </pre>
     *
     * <code>string trust_registry_uri = 2;</code>
     *
     * @param value The trustRegistryUri to set.
     * @return This builder for chaining.
     */
    public Builder setTrustRegistryUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      trustRegistryUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of trust registry associated with governance framework
     * </pre>
     *
     * <code>string trust_registry_uri = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTrustRegistryUri() {

      trustRegistryUri_ = getDefaultInstance().getTrustRegistryUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of trust registry associated with governance framework
     * </pre>
     *
     * <code>string trust_registry_uri = 2;</code>
     *
     * @param value The bytes for trustRegistryUri to set.
     * @return This builder for chaining.
     */
    public Builder setTrustRegistryUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      trustRegistryUri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     *
     *
     * <pre>
     * Description of governance framework
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Description of governance framework
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Description of governance framework
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      description_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of governance framework
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {

      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of governance framework
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      description_ = value;
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

    // @@protoc_insertion_point(builder_scope:services.trustregistry.v1.GovernanceFramework)
  }

  // @@protoc_insertion_point(class_scope:services.trustregistry.v1.GovernanceFramework)
  private static final trinsic.services.trustregistry.v1.GovernanceFramework DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.trustregistry.v1.GovernanceFramework();
  }

  public static trinsic.services.trustregistry.v1.GovernanceFramework getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GovernanceFramework> PARSER =
      new com.google.protobuf.AbstractParser<GovernanceFramework>() {
        @java.lang.Override
        public GovernanceFramework parsePartialFrom(
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

  public static com.google.protobuf.Parser<GovernanceFramework> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GovernanceFramework> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.trustregistry.v1.GovernanceFramework getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
