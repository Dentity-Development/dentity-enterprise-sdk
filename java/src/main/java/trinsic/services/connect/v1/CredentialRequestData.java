// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/connect/v1/connect.proto

package trinsic.services.connect.v1;

/** Protobuf type {@code services.connect.v1.CredentialRequestData} */
public final class CredentialRequestData extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.connect.v1.CredentialRequestData)
    CredentialRequestDataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CredentialRequestData.newBuilder() to construct.
  private CredentialRequestData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CredentialRequestData() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CredentialRequestData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.connect.v1.ConnectOuterClass
        .internal_static_services_connect_v1_CredentialRequestData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.connect.v1.ConnectOuterClass
        .internal_static_services_connect_v1_CredentialRequestData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.connect.v1.CredentialRequestData.class,
            trinsic.services.connect.v1.CredentialRequestData.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   *
   *
   * <pre>
   * The type of verification for which the credential can be used
   * </pre>
   *
   * <code>.services.connect.v1.VerificationType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * The type of verification for which the credential can be used
   * </pre>
   *
   * <code>.services.connect.v1.VerificationType type = 1;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public trinsic.services.connect.v1.VerificationType getType() {
    @SuppressWarnings("deprecation")
    trinsic.services.connect.v1.VerificationType result =
        trinsic.services.connect.v1.VerificationType.valueOf(type_);
    return result == null ? trinsic.services.connect.v1.VerificationType.UNRECOGNIZED : result;
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
    if (type_ != trinsic.services.connect.v1.VerificationType.GOVERNMENT_ID.getNumber()) {
      output.writeEnum(1, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != trinsic.services.connect.v1.VerificationType.GOVERNMENT_ID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, type_);
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
    if (!(obj instanceof trinsic.services.connect.v1.CredentialRequestData)) {
      return super.equals(obj);
    }
    trinsic.services.connect.v1.CredentialRequestData other =
        (trinsic.services.connect.v1.CredentialRequestData) obj;

    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.connect.v1.CredentialRequestData parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.connect.v1.CredentialRequestData parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.connect.v1.CredentialRequestData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.connect.v1.CredentialRequestData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.connect.v1.CredentialRequestData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.connect.v1.CredentialRequestData parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.connect.v1.CredentialRequestData parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.connect.v1.CredentialRequestData parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.connect.v1.CredentialRequestData parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.connect.v1.CredentialRequestData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.connect.v1.CredentialRequestData parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.connect.v1.CredentialRequestData parseFrom(
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

  public static Builder newBuilder(trinsic.services.connect.v1.CredentialRequestData prototype) {
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
  /** Protobuf type {@code services.connect.v1.CredentialRequestData} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.connect.v1.CredentialRequestData)
      trinsic.services.connect.v1.CredentialRequestDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.connect.v1.ConnectOuterClass
          .internal_static_services_connect_v1_CredentialRequestData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.connect.v1.ConnectOuterClass
          .internal_static_services_connect_v1_CredentialRequestData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.connect.v1.CredentialRequestData.class,
              trinsic.services.connect.v1.CredentialRequestData.Builder.class);
    }

    // Construct using trinsic.services.connect.v1.CredentialRequestData.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.connect.v1.ConnectOuterClass
          .internal_static_services_connect_v1_CredentialRequestData_descriptor;
    }

    @java.lang.Override
    public trinsic.services.connect.v1.CredentialRequestData getDefaultInstanceForType() {
      return trinsic.services.connect.v1.CredentialRequestData.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.connect.v1.CredentialRequestData build() {
      trinsic.services.connect.v1.CredentialRequestData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.connect.v1.CredentialRequestData buildPartial() {
      trinsic.services.connect.v1.CredentialRequestData result =
          new trinsic.services.connect.v1.CredentialRequestData(this);
      result.type_ = type_;
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
      if (other instanceof trinsic.services.connect.v1.CredentialRequestData) {
        return mergeFrom((trinsic.services.connect.v1.CredentialRequestData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.connect.v1.CredentialRequestData other) {
      if (other == trinsic.services.connect.v1.CredentialRequestData.getDefaultInstance())
        return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
            case 8:
              {
                type_ = input.readEnum();

                break;
              } // case 8
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

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * The type of verification for which the credential can be used
     * </pre>
     *
     * <code>.services.connect.v1.VerificationType type = 1;</code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * The type of verification for which the credential can be used
     * </pre>
     *
     * <code>.services.connect.v1.VerificationType type = 1;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {

      type_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of verification for which the credential can be used
     * </pre>
     *
     * <code>.services.connect.v1.VerificationType type = 1;</code>
     *
     * @return The type.
     */
    @java.lang.Override
    public trinsic.services.connect.v1.VerificationType getType() {
      @SuppressWarnings("deprecation")
      trinsic.services.connect.v1.VerificationType result =
          trinsic.services.connect.v1.VerificationType.valueOf(type_);
      return result == null ? trinsic.services.connect.v1.VerificationType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The type of verification for which the credential can be used
     * </pre>
     *
     * <code>.services.connect.v1.VerificationType type = 1;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(trinsic.services.connect.v1.VerificationType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of verification for which the credential can be used
     * </pre>
     *
     * <code>.services.connect.v1.VerificationType type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {

      type_ = 0;
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

    // @@protoc_insertion_point(builder_scope:services.connect.v1.CredentialRequestData)
  }

  // @@protoc_insertion_point(class_scope:services.connect.v1.CredentialRequestData)
  private static final trinsic.services.connect.v1.CredentialRequestData DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.connect.v1.CredentialRequestData();
  }

  public static trinsic.services.connect.v1.CredentialRequestData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CredentialRequestData> PARSER =
      new com.google.protobuf.AbstractParser<CredentialRequestData>() {
        @java.lang.Override
        public CredentialRequestData parsePartialFrom(
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

  public static com.google.protobuf.Parser<CredentialRequestData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CredentialRequestData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.connect.v1.CredentialRequestData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}