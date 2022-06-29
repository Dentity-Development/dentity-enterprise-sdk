// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/verifiable-credentials/v1/verifiable-credentials.proto

package trinsic.services.verifiablecredentials.v1;

/**
 *
 *
 * <pre>
 * Request to verify a proof
 * </pre>
 *
 * Protobuf type {@code services.verifiablecredentials.v1.VerifyProofRequest}
 */
public final class VerifyProofRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.verifiablecredentials.v1.VerifyProofRequest)
    VerifyProofRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VerifyProofRequest.newBuilder() to construct.
  private VerifyProofRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VerifyProofRequest() {
    proofDocumentJson_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VerifyProofRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private VerifyProofRequest(
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

              proofDocumentJson_ = s;
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
    return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
        .internal_static_services_verifiablecredentials_v1_VerifyProofRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
        .internal_static_services_verifiablecredentials_v1_VerifyProofRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.verifiablecredentials.v1.VerifyProofRequest.class,
            trinsic.services.verifiablecredentials.v1.VerifyProofRequest.Builder.class);
  }

  public static final int PROOF_DOCUMENT_JSON_FIELD_NUMBER = 1;
  private volatile java.lang.Object proofDocumentJson_;
  /**
   *
   *
   * <pre>
   * JSON-LD proof document string to verify
   * </pre>
   *
   * <code>string proof_document_json = 1;</code>
   *
   * @return The proofDocumentJson.
   */
  @java.lang.Override
  public java.lang.String getProofDocumentJson() {
    java.lang.Object ref = proofDocumentJson_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      proofDocumentJson_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * JSON-LD proof document string to verify
   * </pre>
   *
   * <code>string proof_document_json = 1;</code>
   *
   * @return The bytes for proofDocumentJson.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProofDocumentJsonBytes() {
    java.lang.Object ref = proofDocumentJson_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      proofDocumentJson_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(proofDocumentJson_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, proofDocumentJson_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(proofDocumentJson_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, proofDocumentJson_);
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
    if (!(obj instanceof trinsic.services.verifiablecredentials.v1.VerifyProofRequest)) {
      return super.equals(obj);
    }
    trinsic.services.verifiablecredentials.v1.VerifyProofRequest other =
        (trinsic.services.verifiablecredentials.v1.VerifyProofRequest) obj;

    if (!getProofDocumentJson().equals(other.getProofDocumentJson())) return false;
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
    hash = (37 * hash) + PROOF_DOCUMENT_JSON_FIELD_NUMBER;
    hash = (53 * hash) + getProofDocumentJson().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.verifiablecredentials.v1.VerifyProofRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.v1.VerifyProofRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.VerifyProofRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.v1.VerifyProofRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.VerifyProofRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.v1.VerifyProofRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.VerifyProofRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.v1.VerifyProofRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.VerifyProofRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.v1.VerifyProofRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.VerifyProofRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.v1.VerifyProofRequest parseFrom(
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
      trinsic.services.verifiablecredentials.v1.VerifyProofRequest prototype) {
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
   * Request to verify a proof
   * </pre>
   *
   * Protobuf type {@code services.verifiablecredentials.v1.VerifyProofRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.verifiablecredentials.v1.VerifyProofRequest)
      trinsic.services.verifiablecredentials.v1.VerifyProofRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
          .internal_static_services_verifiablecredentials_v1_VerifyProofRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
          .internal_static_services_verifiablecredentials_v1_VerifyProofRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.verifiablecredentials.v1.VerifyProofRequest.class,
              trinsic.services.verifiablecredentials.v1.VerifyProofRequest.Builder.class);
    }

    // Construct using trinsic.services.verifiablecredentials.v1.VerifyProofRequest.newBuilder()
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
      proofDocumentJson_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
          .internal_static_services_verifiablecredentials_v1_VerifyProofRequest_descriptor;
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.v1.VerifyProofRequest
        getDefaultInstanceForType() {
      return trinsic.services.verifiablecredentials.v1.VerifyProofRequest.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.v1.VerifyProofRequest build() {
      trinsic.services.verifiablecredentials.v1.VerifyProofRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.v1.VerifyProofRequest buildPartial() {
      trinsic.services.verifiablecredentials.v1.VerifyProofRequest result =
          new trinsic.services.verifiablecredentials.v1.VerifyProofRequest(this);
      result.proofDocumentJson_ = proofDocumentJson_;
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
      if (other instanceof trinsic.services.verifiablecredentials.v1.VerifyProofRequest) {
        return mergeFrom((trinsic.services.verifiablecredentials.v1.VerifyProofRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.verifiablecredentials.v1.VerifyProofRequest other) {
      if (other
          == trinsic.services.verifiablecredentials.v1.VerifyProofRequest.getDefaultInstance())
        return this;
      if (!other.getProofDocumentJson().isEmpty()) {
        proofDocumentJson_ = other.proofDocumentJson_;
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
      trinsic.services.verifiablecredentials.v1.VerifyProofRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (trinsic.services.verifiablecredentials.v1.VerifyProofRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object proofDocumentJson_ = "";
    /**
     *
     *
     * <pre>
     * JSON-LD proof document string to verify
     * </pre>
     *
     * <code>string proof_document_json = 1;</code>
     *
     * @return The proofDocumentJson.
     */
    public java.lang.String getProofDocumentJson() {
      java.lang.Object ref = proofDocumentJson_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        proofDocumentJson_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * JSON-LD proof document string to verify
     * </pre>
     *
     * <code>string proof_document_json = 1;</code>
     *
     * @return The bytes for proofDocumentJson.
     */
    public com.google.protobuf.ByteString getProofDocumentJsonBytes() {
      java.lang.Object ref = proofDocumentJson_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        proofDocumentJson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * JSON-LD proof document string to verify
     * </pre>
     *
     * <code>string proof_document_json = 1;</code>
     *
     * @param value The proofDocumentJson to set.
     * @return This builder for chaining.
     */
    public Builder setProofDocumentJson(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      proofDocumentJson_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * JSON-LD proof document string to verify
     * </pre>
     *
     * <code>string proof_document_json = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProofDocumentJson() {

      proofDocumentJson_ = getDefaultInstance().getProofDocumentJson();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * JSON-LD proof document string to verify
     * </pre>
     *
     * <code>string proof_document_json = 1;</code>
     *
     * @param value The bytes for proofDocumentJson to set.
     * @return This builder for chaining.
     */
    public Builder setProofDocumentJsonBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      proofDocumentJson_ = value;
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

    // @@protoc_insertion_point(builder_scope:services.verifiablecredentials.v1.VerifyProofRequest)
  }

  // @@protoc_insertion_point(class_scope:services.verifiablecredentials.v1.VerifyProofRequest)
  private static final trinsic.services.verifiablecredentials.v1.VerifyProofRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.verifiablecredentials.v1.VerifyProofRequest();
  }

  public static trinsic.services.verifiablecredentials.v1.VerifyProofRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VerifyProofRequest> PARSER =
      new com.google.protobuf.AbstractParser<VerifyProofRequest>() {
        @java.lang.Override
        public VerifyProofRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new VerifyProofRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<VerifyProofRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VerifyProofRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.verifiablecredentials.v1.VerifyProofRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
