// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/file-management/v1/file-management.proto

package trinsic.services.provider.v1;

/**
 *
 *
 * <pre>
 * Response to `GetStorageStatsRequest`
 * </pre>
 *
 * Protobuf type {@code services.filemanagement.v1.GetStorageStatsResponse}
 */
public final class GetStorageStatsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.filemanagement.v1.GetStorageStatsResponse)
    GetStorageStatsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetStorageStatsResponse.newBuilder() to construct.
  private GetStorageStatsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetStorageStatsResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetStorageStatsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.provider.v1.FileManagementOuterClass
        .internal_static_services_filemanagement_v1_GetStorageStatsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.provider.v1.FileManagementOuterClass
        .internal_static_services_filemanagement_v1_GetStorageStatsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.provider.v1.GetStorageStatsResponse.class,
            trinsic.services.provider.v1.GetStorageStatsResponse.Builder.class);
  }

  public static final int STATS_FIELD_NUMBER = 1;
  private trinsic.services.provider.v1.StorageStats stats_;
  /**
   *
   *
   * <pre>
   * Statistics about files uploaded by the calling account
   * </pre>
   *
   * <code>.services.filemanagement.v1.StorageStats stats = 1;</code>
   *
   * @return Whether the stats field is set.
   */
  @java.lang.Override
  public boolean hasStats() {
    return stats_ != null;
  }
  /**
   *
   *
   * <pre>
   * Statistics about files uploaded by the calling account
   * </pre>
   *
   * <code>.services.filemanagement.v1.StorageStats stats = 1;</code>
   *
   * @return The stats.
   */
  @java.lang.Override
  public trinsic.services.provider.v1.StorageStats getStats() {
    return stats_ == null ? trinsic.services.provider.v1.StorageStats.getDefaultInstance() : stats_;
  }
  /**
   *
   *
   * <pre>
   * Statistics about files uploaded by the calling account
   * </pre>
   *
   * <code>.services.filemanagement.v1.StorageStats stats = 1;</code>
   */
  @java.lang.Override
  public trinsic.services.provider.v1.StorageStatsOrBuilder getStatsOrBuilder() {
    return getStats();
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
    if (stats_ != null) {
      output.writeMessage(1, getStats());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stats_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getStats());
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
    if (!(obj instanceof trinsic.services.provider.v1.GetStorageStatsResponse)) {
      return super.equals(obj);
    }
    trinsic.services.provider.v1.GetStorageStatsResponse other =
        (trinsic.services.provider.v1.GetStorageStatsResponse) obj;

    if (hasStats() != other.hasStats()) return false;
    if (hasStats()) {
      if (!getStats().equals(other.getStats())) return false;
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
    if (hasStats()) {
      hash = (37 * hash) + STATS_FIELD_NUMBER;
      hash = (53 * hash) + getStats().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.provider.v1.GetStorageStatsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.GetStorageStatsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.GetStorageStatsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.GetStorageStatsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.GetStorageStatsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.GetStorageStatsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.GetStorageStatsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.GetStorageStatsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.GetStorageStatsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.GetStorageStatsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.GetStorageStatsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.GetStorageStatsResponse parseFrom(
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

  public static Builder newBuilder(trinsic.services.provider.v1.GetStorageStatsResponse prototype) {
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
   * Response to `GetStorageStatsRequest`
   * </pre>
   *
   * Protobuf type {@code services.filemanagement.v1.GetStorageStatsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.filemanagement.v1.GetStorageStatsResponse)
      trinsic.services.provider.v1.GetStorageStatsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.provider.v1.FileManagementOuterClass
          .internal_static_services_filemanagement_v1_GetStorageStatsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.provider.v1.FileManagementOuterClass
          .internal_static_services_filemanagement_v1_GetStorageStatsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.provider.v1.GetStorageStatsResponse.class,
              trinsic.services.provider.v1.GetStorageStatsResponse.Builder.class);
    }

    // Construct using trinsic.services.provider.v1.GetStorageStatsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (statsBuilder_ == null) {
        stats_ = null;
      } else {
        stats_ = null;
        statsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.provider.v1.FileManagementOuterClass
          .internal_static_services_filemanagement_v1_GetStorageStatsResponse_descriptor;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.GetStorageStatsResponse getDefaultInstanceForType() {
      return trinsic.services.provider.v1.GetStorageStatsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.provider.v1.GetStorageStatsResponse build() {
      trinsic.services.provider.v1.GetStorageStatsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.GetStorageStatsResponse buildPartial() {
      trinsic.services.provider.v1.GetStorageStatsResponse result =
          new trinsic.services.provider.v1.GetStorageStatsResponse(this);
      if (statsBuilder_ == null) {
        result.stats_ = stats_;
      } else {
        result.stats_ = statsBuilder_.build();
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
      if (other instanceof trinsic.services.provider.v1.GetStorageStatsResponse) {
        return mergeFrom((trinsic.services.provider.v1.GetStorageStatsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.provider.v1.GetStorageStatsResponse other) {
      if (other == trinsic.services.provider.v1.GetStorageStatsResponse.getDefaultInstance())
        return this;
      if (other.hasStats()) {
        mergeStats(other.getStats());
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
                input.readMessage(getStatsFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
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

    private trinsic.services.provider.v1.StorageStats stats_;
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.provider.v1.StorageStats,
            trinsic.services.provider.v1.StorageStats.Builder,
            trinsic.services.provider.v1.StorageStatsOrBuilder>
        statsBuilder_;
    /**
     *
     *
     * <pre>
     * Statistics about files uploaded by the calling account
     * </pre>
     *
     * <code>.services.filemanagement.v1.StorageStats stats = 1;</code>
     *
     * @return Whether the stats field is set.
     */
    public boolean hasStats() {
      return statsBuilder_ != null || stats_ != null;
    }
    /**
     *
     *
     * <pre>
     * Statistics about files uploaded by the calling account
     * </pre>
     *
     * <code>.services.filemanagement.v1.StorageStats stats = 1;</code>
     *
     * @return The stats.
     */
    public trinsic.services.provider.v1.StorageStats getStats() {
      if (statsBuilder_ == null) {
        return stats_ == null
            ? trinsic.services.provider.v1.StorageStats.getDefaultInstance()
            : stats_;
      } else {
        return statsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Statistics about files uploaded by the calling account
     * </pre>
     *
     * <code>.services.filemanagement.v1.StorageStats stats = 1;</code>
     */
    public Builder setStats(trinsic.services.provider.v1.StorageStats value) {
      if (statsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stats_ = value;
        onChanged();
      } else {
        statsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Statistics about files uploaded by the calling account
     * </pre>
     *
     * <code>.services.filemanagement.v1.StorageStats stats = 1;</code>
     */
    public Builder setStats(trinsic.services.provider.v1.StorageStats.Builder builderForValue) {
      if (statsBuilder_ == null) {
        stats_ = builderForValue.build();
        onChanged();
      } else {
        statsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Statistics about files uploaded by the calling account
     * </pre>
     *
     * <code>.services.filemanagement.v1.StorageStats stats = 1;</code>
     */
    public Builder mergeStats(trinsic.services.provider.v1.StorageStats value) {
      if (statsBuilder_ == null) {
        if (stats_ != null) {
          stats_ =
              trinsic.services.provider.v1.StorageStats.newBuilder(stats_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          stats_ = value;
        }
        onChanged();
      } else {
        statsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Statistics about files uploaded by the calling account
     * </pre>
     *
     * <code>.services.filemanagement.v1.StorageStats stats = 1;</code>
     */
    public Builder clearStats() {
      if (statsBuilder_ == null) {
        stats_ = null;
        onChanged();
      } else {
        stats_ = null;
        statsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Statistics about files uploaded by the calling account
     * </pre>
     *
     * <code>.services.filemanagement.v1.StorageStats stats = 1;</code>
     */
    public trinsic.services.provider.v1.StorageStats.Builder getStatsBuilder() {

      onChanged();
      return getStatsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Statistics about files uploaded by the calling account
     * </pre>
     *
     * <code>.services.filemanagement.v1.StorageStats stats = 1;</code>
     */
    public trinsic.services.provider.v1.StorageStatsOrBuilder getStatsOrBuilder() {
      if (statsBuilder_ != null) {
        return statsBuilder_.getMessageOrBuilder();
      } else {
        return stats_ == null
            ? trinsic.services.provider.v1.StorageStats.getDefaultInstance()
            : stats_;
      }
    }
    /**
     *
     *
     * <pre>
     * Statistics about files uploaded by the calling account
     * </pre>
     *
     * <code>.services.filemanagement.v1.StorageStats stats = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.provider.v1.StorageStats,
            trinsic.services.provider.v1.StorageStats.Builder,
            trinsic.services.provider.v1.StorageStatsOrBuilder>
        getStatsFieldBuilder() {
      if (statsBuilder_ == null) {
        statsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                trinsic.services.provider.v1.StorageStats,
                trinsic.services.provider.v1.StorageStats.Builder,
                trinsic.services.provider.v1.StorageStatsOrBuilder>(
                getStats(), getParentForChildren(), isClean());
        stats_ = null;
      }
      return statsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:services.filemanagement.v1.GetStorageStatsResponse)
  }

  // @@protoc_insertion_point(class_scope:services.filemanagement.v1.GetStorageStatsResponse)
  private static final trinsic.services.provider.v1.GetStorageStatsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.provider.v1.GetStorageStatsResponse();
  }

  public static trinsic.services.provider.v1.GetStorageStatsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetStorageStatsResponse> PARSER =
      new com.google.protobuf.AbstractParser<GetStorageStatsResponse>() {
        @java.lang.Override
        public GetStorageStatsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetStorageStatsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetStorageStatsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.provider.v1.GetStorageStatsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
