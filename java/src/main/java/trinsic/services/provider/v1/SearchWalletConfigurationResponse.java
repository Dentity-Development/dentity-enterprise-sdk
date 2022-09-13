// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/provider.proto

package trinsic.services.provider.v1;

/** Protobuf type {@code services.provider.v1.SearchWalletConfigurationResponse} */
public final class SearchWalletConfigurationResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.provider.v1.SearchWalletConfigurationResponse)
    SearchWalletConfigurationResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchWalletConfigurationResponse.newBuilder() to construct.
  private SearchWalletConfigurationResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchWalletConfigurationResponse() {
    results_ = java.util.Collections.emptyList();
    continuationToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchWalletConfigurationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SearchWalletConfigurationResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                results_ =
                    new java.util.ArrayList<trinsic.services.provider.v1.WalletConfiguration>();
                mutable_bitField0_ |= 0x00000001;
              }
              results_.add(
                  input.readMessage(
                      trinsic.services.provider.v1.WalletConfiguration.parser(),
                      extensionRegistry));
              break;
            }
          case 16:
            {
              hasMore_ = input.readBool();
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              continuationToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        results_ = java.util.Collections.unmodifiableList(results_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.provider.v1.ProviderOuterClass
        .internal_static_services_provider_v1_SearchWalletConfigurationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.provider.v1.ProviderOuterClass
        .internal_static_services_provider_v1_SearchWalletConfigurationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.provider.v1.SearchWalletConfigurationResponse.class,
            trinsic.services.provider.v1.SearchWalletConfigurationResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 1;
  private java.util.List<trinsic.services.provider.v1.WalletConfiguration> results_;
  /**
   *
   *
   * <pre>
   * Results matching the search query
   * </pre>
   *
   * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<trinsic.services.provider.v1.WalletConfiguration> getResultsList() {
    return results_;
  }
  /**
   *
   *
   * <pre>
   * Results matching the search query
   * </pre>
   *
   * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends trinsic.services.provider.v1.WalletConfigurationOrBuilder>
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   *
   *
   * <pre>
   * Results matching the search query
   * </pre>
   *
   * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
   */
  @java.lang.Override
  public int getResultsCount() {
    return results_.size();
  }
  /**
   *
   *
   * <pre>
   * Results matching the search query
   * </pre>
   *
   * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
   */
  @java.lang.Override
  public trinsic.services.provider.v1.WalletConfiguration getResults(int index) {
    return results_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Results matching the search query
   * </pre>
   *
   * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
   */
  @java.lang.Override
  public trinsic.services.provider.v1.WalletConfigurationOrBuilder getResultsOrBuilder(int index) {
    return results_.get(index);
  }

  public static final int HAS_MORE_FIELD_NUMBER = 2;
  private boolean hasMore_;
  /**
   *
   *
   * <pre>
   * Whether more results are available for this query via `continuation_token`
   * </pre>
   *
   * <code>bool has_more = 2;</code>
   *
   * @return The hasMore.
   */
  @java.lang.Override
  public boolean getHasMore() {
    return hasMore_;
  }

  public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 4;
  private volatile java.lang.Object continuationToken_;
  /**
   *
   *
   * <pre>
   * Token to fetch next set of results via `SearchRequest`
   * </pre>
   *
   * <code>string continuation_token = 4;</code>
   *
   * @return The continuationToken.
   */
  @java.lang.Override
  public java.lang.String getContinuationToken() {
    java.lang.Object ref = continuationToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      continuationToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to fetch next set of results via `SearchRequest`
   * </pre>
   *
   * <code>string continuation_token = 4;</code>
   *
   * @return The bytes for continuationToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContinuationTokenBytes() {
    java.lang.Object ref = continuationToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(1, results_.get(i));
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
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, results_.get(i));
    }
    if (hasMore_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, hasMore_);
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
    if (!(obj instanceof trinsic.services.provider.v1.SearchWalletConfigurationResponse)) {
      return super.equals(obj);
    }
    trinsic.services.provider.v1.SearchWalletConfigurationResponse other =
        (trinsic.services.provider.v1.SearchWalletConfigurationResponse) obj;

    if (!getResultsList().equals(other.getResultsList())) return false;
    if (getHasMore() != other.getHasMore()) return false;
    if (!getContinuationToken().equals(other.getContinuationToken())) return false;
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
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    hash = (37 * hash) + HAS_MORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getHasMore());
    hash = (37 * hash) + CONTINUATION_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getContinuationToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.provider.v1.SearchWalletConfigurationResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.SearchWalletConfigurationResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.SearchWalletConfigurationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.SearchWalletConfigurationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.SearchWalletConfigurationResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.SearchWalletConfigurationResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.SearchWalletConfigurationResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.SearchWalletConfigurationResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.SearchWalletConfigurationResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.SearchWalletConfigurationResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.SearchWalletConfigurationResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.SearchWalletConfigurationResponse parseFrom(
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
      trinsic.services.provider.v1.SearchWalletConfigurationResponse prototype) {
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
  /** Protobuf type {@code services.provider.v1.SearchWalletConfigurationResponse} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.provider.v1.SearchWalletConfigurationResponse)
      trinsic.services.provider.v1.SearchWalletConfigurationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_SearchWalletConfigurationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_SearchWalletConfigurationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.provider.v1.SearchWalletConfigurationResponse.class,
              trinsic.services.provider.v1.SearchWalletConfigurationResponse.Builder.class);
    }

    // Construct using trinsic.services.provider.v1.SearchWalletConfigurationResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getResultsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        resultsBuilder_.clear();
      }
      hasMore_ = false;

      continuationToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.provider.v1.ProviderOuterClass
          .internal_static_services_provider_v1_SearchWalletConfigurationResponse_descriptor;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.SearchWalletConfigurationResponse
        getDefaultInstanceForType() {
      return trinsic.services.provider.v1.SearchWalletConfigurationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.provider.v1.SearchWalletConfigurationResponse build() {
      trinsic.services.provider.v1.SearchWalletConfigurationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.SearchWalletConfigurationResponse buildPartial() {
      trinsic.services.provider.v1.SearchWalletConfigurationResponse result =
          new trinsic.services.provider.v1.SearchWalletConfigurationResponse(this);
      int from_bitField0_ = bitField0_;
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
      }
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
      if (other instanceof trinsic.services.provider.v1.SearchWalletConfigurationResponse) {
        return mergeFrom((trinsic.services.provider.v1.SearchWalletConfigurationResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.provider.v1.SearchWalletConfigurationResponse other) {
      if (other
          == trinsic.services.provider.v1.SearchWalletConfigurationResponse.getDefaultInstance())
        return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getResultsFieldBuilder()
                    : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
          }
        }
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
      trinsic.services.provider.v1.SearchWalletConfigurationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (trinsic.services.provider.v1.SearchWalletConfigurationResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<trinsic.services.provider.v1.WalletConfiguration> results_ =
        java.util.Collections.emptyList();

    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ =
            new java.util.ArrayList<trinsic.services.provider.v1.WalletConfiguration>(results_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            trinsic.services.provider.v1.WalletConfiguration,
            trinsic.services.provider.v1.WalletConfiguration.Builder,
            trinsic.services.provider.v1.WalletConfigurationOrBuilder>
        resultsBuilder_;

    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public java.util.List<trinsic.services.provider.v1.WalletConfiguration> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public trinsic.services.provider.v1.WalletConfiguration getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public Builder setResults(int index, trinsic.services.provider.v1.WalletConfiguration value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public Builder setResults(
        int index, trinsic.services.provider.v1.WalletConfiguration.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public Builder addResults(trinsic.services.provider.v1.WalletConfiguration value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public Builder addResults(int index, trinsic.services.provider.v1.WalletConfiguration value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public Builder addResults(
        trinsic.services.provider.v1.WalletConfiguration.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public Builder addResults(
        int index, trinsic.services.provider.v1.WalletConfiguration.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends trinsic.services.provider.v1.WalletConfiguration> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public trinsic.services.provider.v1.WalletConfiguration.Builder getResultsBuilder(int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public trinsic.services.provider.v1.WalletConfigurationOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public java.util.List<? extends trinsic.services.provider.v1.WalletConfigurationOrBuilder>
        getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public trinsic.services.provider.v1.WalletConfiguration.Builder addResultsBuilder() {
      return getResultsFieldBuilder()
          .addBuilder(trinsic.services.provider.v1.WalletConfiguration.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public trinsic.services.provider.v1.WalletConfiguration.Builder addResultsBuilder(int index) {
      return getResultsFieldBuilder()
          .addBuilder(index, trinsic.services.provider.v1.WalletConfiguration.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Results matching the search query
     * </pre>
     *
     * <code>repeated .services.provider.v1.WalletConfiguration results = 1;</code>
     */
    public java.util.List<trinsic.services.provider.v1.WalletConfiguration.Builder>
        getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            trinsic.services.provider.v1.WalletConfiguration,
            trinsic.services.provider.v1.WalletConfiguration.Builder,
            trinsic.services.provider.v1.WalletConfigurationOrBuilder>
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                trinsic.services.provider.v1.WalletConfiguration,
                trinsic.services.provider.v1.WalletConfiguration.Builder,
                trinsic.services.provider.v1.WalletConfigurationOrBuilder>(
                results_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }

    private boolean hasMore_;
    /**
     *
     *
     * <pre>
     * Whether more results are available for this query via `continuation_token`
     * </pre>
     *
     * <code>bool has_more = 2;</code>
     *
     * @return The hasMore.
     */
    @java.lang.Override
    public boolean getHasMore() {
      return hasMore_;
    }
    /**
     *
     *
     * <pre>
     * Whether more results are available for this query via `continuation_token`
     * </pre>
     *
     * <code>bool has_more = 2;</code>
     *
     * @param value The hasMore to set.
     * @return This builder for chaining.
     */
    public Builder setHasMore(boolean value) {

      hasMore_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether more results are available for this query via `continuation_token`
     * </pre>
     *
     * <code>bool has_more = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHasMore() {

      hasMore_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object continuationToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to fetch next set of results via `SearchRequest`
     * </pre>
     *
     * <code>string continuation_token = 4;</code>
     *
     * @return The continuationToken.
     */
    public java.lang.String getContinuationToken() {
      java.lang.Object ref = continuationToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        continuationToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to fetch next set of results via `SearchRequest`
     * </pre>
     *
     * <code>string continuation_token = 4;</code>
     *
     * @return The bytes for continuationToken.
     */
    public com.google.protobuf.ByteString getContinuationTokenBytes() {
      java.lang.Object ref = continuationToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        continuationToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to fetch next set of results via `SearchRequest`
     * </pre>
     *
     * <code>string continuation_token = 4;</code>
     *
     * @param value The continuationToken to set.
     * @return This builder for chaining.
     */
    public Builder setContinuationToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      continuationToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to fetch next set of results via `SearchRequest`
     * </pre>
     *
     * <code>string continuation_token = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContinuationToken() {

      continuationToken_ = getDefaultInstance().getContinuationToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to fetch next set of results via `SearchRequest`
     * </pre>
     *
     * <code>string continuation_token = 4;</code>
     *
     * @param value The bytes for continuationToken to set.
     * @return This builder for chaining.
     */
    public Builder setContinuationTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      continuationToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:services.provider.v1.SearchWalletConfigurationResponse)
  }

  // @@protoc_insertion_point(class_scope:services.provider.v1.SearchWalletConfigurationResponse)
  private static final trinsic.services.provider.v1.SearchWalletConfigurationResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.provider.v1.SearchWalletConfigurationResponse();
  }

  public static trinsic.services.provider.v1.SearchWalletConfigurationResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchWalletConfigurationResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchWalletConfigurationResponse>() {
        @java.lang.Override
        public SearchWalletConfigurationResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SearchWalletConfigurationResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SearchWalletConfigurationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchWalletConfigurationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.provider.v1.SearchWalletConfigurationResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}