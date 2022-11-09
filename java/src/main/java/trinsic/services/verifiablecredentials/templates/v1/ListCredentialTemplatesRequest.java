// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/verifiable-credentials/templates/v1/templates.proto

package trinsic.services.verifiablecredentials.templates.v1;

/**
 * <pre>
 * Request to list templates using a SQL query
 * </pre>
 *
 * Protobuf type {@code services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest}
 */
public final class ListCredentialTemplatesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest)
    ListCredentialTemplatesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCredentialTemplatesRequest.newBuilder() to construct.
  private ListCredentialTemplatesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCredentialTemplatesRequest() {
    query_ = "";
    continuationToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCredentialTemplatesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListCredentialTemplatesRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            query_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            continuationToken_ = s;
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
    return trinsic.services.verifiablecredentials.templates.v1.Templates.internal_static_services_verifiablecredentials_templates_v1_ListCredentialTemplatesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.verifiablecredentials.templates.v1.Templates.internal_static_services_verifiablecredentials_templates_v1_ListCredentialTemplatesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest.class, trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest.Builder.class);
  }

  public static final int QUERY_FIELD_NUMBER = 1;
  private volatile java.lang.Object query_;
  /**
   * <pre>
   * SQL query to execute. Example: `SELECT * FROM c WHERE c.name = 'Diploma'`
   * </pre>
   *
   * <code>string query = 1;</code>
   * @return The query.
   */
  @java.lang.Override
  public java.lang.String getQuery() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      query_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * SQL query to execute. Example: `SELECT * FROM c WHERE c.name = 'Diploma'`
   * </pre>
   *
   * <code>string query = 1;</code>
   * @return The bytes for query.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueryBytes() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      query_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object continuationToken_;
  /**
   * <pre>
   * Token provided by previous `ListCredentialTemplatesResponse`
   * if more data is available for query
   * </pre>
   *
   * <code>string continuation_token = 2 [(.services.options.optional) = true];</code>
   * @return The continuationToken.
   */
  @java.lang.Override
  public java.lang.String getContinuationToken() {
    java.lang.Object ref = continuationToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      continuationToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token provided by previous `ListCredentialTemplatesResponse`
   * if more data is available for query
   * </pre>
   *
   * <code>string continuation_token = 2 [(.services.options.optional) = true];</code>
   * @return The bytes for continuationToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContinuationTokenBytes() {
    java.lang.Object ref = continuationToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      continuationToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, query_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(continuationToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, continuationToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, query_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(continuationToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, continuationToken_);
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
    if (!(obj instanceof trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest)) {
      return super.equals(obj);
    }
    trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest other = (trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest) obj;

    if (!getQuery()
        .equals(other.getQuery())) return false;
    if (!getContinuationToken()
        .equals(other.getContinuationToken())) return false;
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
    hash = (37 * hash) + QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getQuery().hashCode();
    hash = (37 * hash) + CONTINUATION_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getContinuationToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest parseFrom(
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
  public static Builder newBuilder(trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest prototype) {
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
   * Request to list templates using a SQL query
   * </pre>
   *
   * Protobuf type {@code services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest)
      trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return trinsic.services.verifiablecredentials.templates.v1.Templates.internal_static_services_verifiablecredentials_templates_v1_ListCredentialTemplatesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.verifiablecredentials.templates.v1.Templates.internal_static_services_verifiablecredentials_templates_v1_ListCredentialTemplatesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest.class, trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest.Builder.class);
    }

    // Construct using trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest.newBuilder()
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
      query_ = "";

      continuationToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return trinsic.services.verifiablecredentials.templates.v1.Templates.internal_static_services_verifiablecredentials_templates_v1_ListCredentialTemplatesRequest_descriptor;
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest getDefaultInstanceForType() {
      return trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest build() {
      trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest buildPartial() {
      trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest result = new trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest(this);
      result.query_ = query_;
      result.continuationToken_ = continuationToken_;
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
      if (other instanceof trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest) {
        return mergeFrom((trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest other) {
      if (other == trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest.getDefaultInstance()) return this;
      if (!other.getQuery().isEmpty()) {
        query_ = other.query_;
        onChanged();
      }
      if (!other.getContinuationToken().isEmpty()) {
        continuationToken_ = other.continuationToken_;
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
      trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object query_ = "";
    /**
     * <pre>
     * SQL query to execute. Example: `SELECT * FROM c WHERE c.name = 'Diploma'`
     * </pre>
     *
     * <code>string query = 1;</code>
     * @return The query.
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * SQL query to execute. Example: `SELECT * FROM c WHERE c.name = 'Diploma'`
     * </pre>
     *
     * <code>string query = 1;</code>
     * @return The bytes for query.
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * SQL query to execute. Example: `SELECT * FROM c WHERE c.name = 'Diploma'`
     * </pre>
     *
     * <code>string query = 1;</code>
     * @param value The query to set.
     * @return This builder for chaining.
     */
    public Builder setQuery(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      query_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SQL query to execute. Example: `SELECT * FROM c WHERE c.name = 'Diploma'`
     * </pre>
     *
     * <code>string query = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuery() {
      
      query_ = getDefaultInstance().getQuery();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SQL query to execute. Example: `SELECT * FROM c WHERE c.name = 'Diploma'`
     * </pre>
     *
     * <code>string query = 1;</code>
     * @param value The bytes for query to set.
     * @return This builder for chaining.
     */
    public Builder setQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      query_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object continuationToken_ = "";
    /**
     * <pre>
     * Token provided by previous `ListCredentialTemplatesResponse`
     * if more data is available for query
     * </pre>
     *
     * <code>string continuation_token = 2 [(.services.options.optional) = true];</code>
     * @return The continuationToken.
     */
    public java.lang.String getContinuationToken() {
      java.lang.Object ref = continuationToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        continuationToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token provided by previous `ListCredentialTemplatesResponse`
     * if more data is available for query
     * </pre>
     *
     * <code>string continuation_token = 2 [(.services.options.optional) = true];</code>
     * @return The bytes for continuationToken.
     */
    public com.google.protobuf.ByteString
        getContinuationTokenBytes() {
      java.lang.Object ref = continuationToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        continuationToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token provided by previous `ListCredentialTemplatesResponse`
     * if more data is available for query
     * </pre>
     *
     * <code>string continuation_token = 2 [(.services.options.optional) = true];</code>
     * @param value The continuationToken to set.
     * @return This builder for chaining.
     */
    public Builder setContinuationToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      continuationToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token provided by previous `ListCredentialTemplatesResponse`
     * if more data is available for query
     * </pre>
     *
     * <code>string continuation_token = 2 [(.services.options.optional) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearContinuationToken() {
      
      continuationToken_ = getDefaultInstance().getContinuationToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token provided by previous `ListCredentialTemplatesResponse`
     * if more data is available for query
     * </pre>
     *
     * <code>string continuation_token = 2 [(.services.options.optional) = true];</code>
     * @param value The bytes for continuationToken to set.
     * @return This builder for chaining.
     */
    public Builder setContinuationTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      continuationToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest)
  }

  // @@protoc_insertion_point(class_scope:services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest)
  private static final trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest();
  }

  public static trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCredentialTemplatesRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListCredentialTemplatesRequest>() {
    @java.lang.Override
    public ListCredentialTemplatesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListCredentialTemplatesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListCredentialTemplatesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCredentialTemplatesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.verifiablecredentials.templates.v1.ListCredentialTemplatesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

