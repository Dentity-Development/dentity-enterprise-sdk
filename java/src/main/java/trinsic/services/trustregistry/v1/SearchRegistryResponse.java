// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/trust-registry/v1/trust-registry.proto

package trinsic.services.trustregistry.v1;

/**
 * <pre>
 * Response to `SearchRegistryRequest`
 * </pre>
 *
 * Protobuf type {@code services.trustregistry.v1.SearchRegistryResponse}
 */
public final class SearchRegistryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.trustregistry.v1.SearchRegistryResponse)
    SearchRegistryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchRegistryResponse.newBuilder() to construct.
  private SearchRegistryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchRegistryResponse() {
    itemsJson_ = "";
    continuationToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchRegistryResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchRegistryResponse(
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

            itemsJson_ = s;
            break;
          }
          case 16: {

            hasMore_ = input.readBool();
            break;
          }
          case 34: {
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
    return trinsic.services.trustregistry.v1.TrustRegistryOuterClass.internal_static_services_trustregistry_v1_SearchRegistryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.trustregistry.v1.TrustRegistryOuterClass.internal_static_services_trustregistry_v1_SearchRegistryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.trustregistry.v1.SearchRegistryResponse.class, trinsic.services.trustregistry.v1.SearchRegistryResponse.Builder.class);
  }

  public static final int ITEMS_JSON_FIELD_NUMBER = 1;
  private volatile java.lang.Object itemsJson_;
  /**
   * <pre>
   * JSON string containing array of resultant objects
   * </pre>
   *
   * <code>string items_json = 1;</code>
   * @return The itemsJson.
   */
  @java.lang.Override
  public java.lang.String getItemsJson() {
    java.lang.Object ref = itemsJson_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemsJson_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * JSON string containing array of resultant objects
   * </pre>
   *
   * <code>string items_json = 1;</code>
   * @return The bytes for itemsJson.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getItemsJsonBytes() {
    java.lang.Object ref = itemsJson_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemsJson_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HAS_MORE_FIELD_NUMBER = 2;
  private boolean hasMore_;
  /**
   * <pre>
   * Whether more data is available to fetch for query
   * </pre>
   *
   * <code>bool has_more = 2;</code>
   * @return The hasMore.
   */
  @java.lang.Override
  public boolean getHasMore() {
    return hasMore_;
  }

  public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 4;
  private volatile java.lang.Object continuationToken_;
  /**
   * <pre>
   * Token to fetch next set of results via `SearchRegistryRequest`
   * </pre>
   *
   * <code>string continuation_token = 4;</code>
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
   * Token to fetch next set of results via `SearchRegistryRequest`
   * </pre>
   *
   * <code>string continuation_token = 4;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(itemsJson_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, itemsJson_);
    }
    if (hasMore_ != false) {
      output.writeBool(2, hasMore_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(continuationToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, continuationToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(itemsJson_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, itemsJson_);
    }
    if (hasMore_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, hasMore_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(continuationToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, continuationToken_);
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
    if (!(obj instanceof trinsic.services.trustregistry.v1.SearchRegistryResponse)) {
      return super.equals(obj);
    }
    trinsic.services.trustregistry.v1.SearchRegistryResponse other = (trinsic.services.trustregistry.v1.SearchRegistryResponse) obj;

    if (!getItemsJson()
        .equals(other.getItemsJson())) return false;
    if (getHasMore()
        != other.getHasMore()) return false;
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
    hash = (37 * hash) + ITEMS_JSON_FIELD_NUMBER;
    hash = (53 * hash) + getItemsJson().hashCode();
    hash = (37 * hash) + HAS_MORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasMore());
    hash = (37 * hash) + CONTINUATION_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getContinuationToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.trustregistry.v1.SearchRegistryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.services.trustregistry.v1.SearchRegistryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.services.trustregistry.v1.SearchRegistryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.services.trustregistry.v1.SearchRegistryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.services.trustregistry.v1.SearchRegistryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.services.trustregistry.v1.SearchRegistryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.services.trustregistry.v1.SearchRegistryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static trinsic.services.trustregistry.v1.SearchRegistryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static trinsic.services.trustregistry.v1.SearchRegistryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static trinsic.services.trustregistry.v1.SearchRegistryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static trinsic.services.trustregistry.v1.SearchRegistryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static trinsic.services.trustregistry.v1.SearchRegistryResponse parseFrom(
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
  public static Builder newBuilder(trinsic.services.trustregistry.v1.SearchRegistryResponse prototype) {
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
   * Response to `SearchRegistryRequest`
   * </pre>
   *
   * Protobuf type {@code services.trustregistry.v1.SearchRegistryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.trustregistry.v1.SearchRegistryResponse)
      trinsic.services.trustregistry.v1.SearchRegistryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return trinsic.services.trustregistry.v1.TrustRegistryOuterClass.internal_static_services_trustregistry_v1_SearchRegistryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.trustregistry.v1.TrustRegistryOuterClass.internal_static_services_trustregistry_v1_SearchRegistryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.trustregistry.v1.SearchRegistryResponse.class, trinsic.services.trustregistry.v1.SearchRegistryResponse.Builder.class);
    }

    // Construct using trinsic.services.trustregistry.v1.SearchRegistryResponse.newBuilder()
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
      itemsJson_ = "";

      hasMore_ = false;

      continuationToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return trinsic.services.trustregistry.v1.TrustRegistryOuterClass.internal_static_services_trustregistry_v1_SearchRegistryResponse_descriptor;
    }

    @java.lang.Override
    public trinsic.services.trustregistry.v1.SearchRegistryResponse getDefaultInstanceForType() {
      return trinsic.services.trustregistry.v1.SearchRegistryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.trustregistry.v1.SearchRegistryResponse build() {
      trinsic.services.trustregistry.v1.SearchRegistryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.trustregistry.v1.SearchRegistryResponse buildPartial() {
      trinsic.services.trustregistry.v1.SearchRegistryResponse result = new trinsic.services.trustregistry.v1.SearchRegistryResponse(this);
      result.itemsJson_ = itemsJson_;
      result.hasMore_ = hasMore_;
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
      if (other instanceof trinsic.services.trustregistry.v1.SearchRegistryResponse) {
        return mergeFrom((trinsic.services.trustregistry.v1.SearchRegistryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.trustregistry.v1.SearchRegistryResponse other) {
      if (other == trinsic.services.trustregistry.v1.SearchRegistryResponse.getDefaultInstance()) return this;
      if (!other.getItemsJson().isEmpty()) {
        itemsJson_ = other.itemsJson_;
        onChanged();
      }
      if (other.getHasMore() != false) {
        setHasMore(other.getHasMore());
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
      trinsic.services.trustregistry.v1.SearchRegistryResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (trinsic.services.trustregistry.v1.SearchRegistryResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object itemsJson_ = "";
    /**
     * <pre>
     * JSON string containing array of resultant objects
     * </pre>
     *
     * <code>string items_json = 1;</code>
     * @return The itemsJson.
     */
    public java.lang.String getItemsJson() {
      java.lang.Object ref = itemsJson_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemsJson_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * JSON string containing array of resultant objects
     * </pre>
     *
     * <code>string items_json = 1;</code>
     * @return The bytes for itemsJson.
     */
    public com.google.protobuf.ByteString
        getItemsJsonBytes() {
      java.lang.Object ref = itemsJson_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemsJson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * JSON string containing array of resultant objects
     * </pre>
     *
     * <code>string items_json = 1;</code>
     * @param value The itemsJson to set.
     * @return This builder for chaining.
     */
    public Builder setItemsJson(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemsJson_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * JSON string containing array of resultant objects
     * </pre>
     *
     * <code>string items_json = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemsJson() {
      
      itemsJson_ = getDefaultInstance().getItemsJson();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * JSON string containing array of resultant objects
     * </pre>
     *
     * <code>string items_json = 1;</code>
     * @param value The bytes for itemsJson to set.
     * @return This builder for chaining.
     */
    public Builder setItemsJsonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemsJson_ = value;
      onChanged();
      return this;
    }

    private boolean hasMore_ ;
    /**
     * <pre>
     * Whether more data is available to fetch for query
     * </pre>
     *
     * <code>bool has_more = 2;</code>
     * @return The hasMore.
     */
    @java.lang.Override
    public boolean getHasMore() {
      return hasMore_;
    }
    /**
     * <pre>
     * Whether more data is available to fetch for query
     * </pre>
     *
     * <code>bool has_more = 2;</code>
     * @param value The hasMore to set.
     * @return This builder for chaining.
     */
    public Builder setHasMore(boolean value) {
      
      hasMore_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether more data is available to fetch for query
     * </pre>
     *
     * <code>bool has_more = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasMore() {
      
      hasMore_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object continuationToken_ = "";
    /**
     * <pre>
     * Token to fetch next set of results via `SearchRegistryRequest`
     * </pre>
     *
     * <code>string continuation_token = 4;</code>
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
     * Token to fetch next set of results via `SearchRegistryRequest`
     * </pre>
     *
     * <code>string continuation_token = 4;</code>
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
     * Token to fetch next set of results via `SearchRegistryRequest`
     * </pre>
     *
     * <code>string continuation_token = 4;</code>
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
     * Token to fetch next set of results via `SearchRegistryRequest`
     * </pre>
     *
     * <code>string continuation_token = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearContinuationToken() {
      
      continuationToken_ = getDefaultInstance().getContinuationToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to fetch next set of results via `SearchRegistryRequest`
     * </pre>
     *
     * <code>string continuation_token = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:services.trustregistry.v1.SearchRegistryResponse)
  }

  // @@protoc_insertion_point(class_scope:services.trustregistry.v1.SearchRegistryResponse)
  private static final trinsic.services.trustregistry.v1.SearchRegistryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new trinsic.services.trustregistry.v1.SearchRegistryResponse();
  }

  public static trinsic.services.trustregistry.v1.SearchRegistryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchRegistryResponse>
      PARSER = new com.google.protobuf.AbstractParser<SearchRegistryResponse>() {
    @java.lang.Override
    public SearchRegistryResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchRegistryResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchRegistryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchRegistryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.trustregistry.v1.SearchRegistryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

