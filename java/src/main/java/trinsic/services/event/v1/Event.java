// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/event/v1/event.proto

package trinsic.services.event.v1;

/**
 *
 *
 * <pre>
 * Event
 * </pre>
 *
 * Protobuf type {@code trinsic.services.event.Event}
 */
public final class Event extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:trinsic.services.event.Event)
    EventOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Event.newBuilder() to construct.
  private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Event() {
    id_ = "";
    type_ = 0;
    timestamp_ = "";
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Event();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.event.v1.EventOuterClass
        .internal_static_trinsic_services_event_Event_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.event.v1.EventOuterClass
        .internal_static_trinsic_services_event_Event_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.event.v1.Event.class, trinsic.services.event.v1.Event.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   *
   *
   * <pre>
   * UUID of event
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * UUID of event
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   *
   *
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>.trinsic.services.event.EventType type = 2;</code>
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
   * Type of event
   * </pre>
   *
   * <code>.trinsic.services.event.EventType type = 2;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public trinsic.services.event.v1.EventType getType() {
    @SuppressWarnings("deprecation")
    trinsic.services.event.v1.EventType result = trinsic.services.event.v1.EventType.valueOf(type_);
    return result == null ? trinsic.services.event.v1.EventType.UNRECOGNIZED : result;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private volatile java.lang.Object timestamp_;
  /**
   *
   *
   * <pre>
   * Timestamp event occurred, in ISO 8601 format (ex. `2022-07-07T08:09:10.11Z`)
   * </pre>
   *
   * <code>string timestamp = 3;</code>
   *
   * @return The timestamp.
   */
  @java.lang.Override
  public java.lang.String getTimestamp() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timestamp_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Timestamp event occurred, in ISO 8601 format (ex. `2022-07-07T08:09:10.11Z`)
   * </pre>
   *
   * <code>string timestamp = 3;</code>
   *
   * @return The bytes for timestamp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTimestampBytes() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      timestamp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString data_;
  /**
   *
   *
   * <pre>
   * Event-specific payload, as an encoded protobuf message
   * </pre>
   *
   * <code>bytes data = 4;</code>
   *
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (type_ != trinsic.services.event.v1.EventType.PING.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timestamp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, timestamp_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(4, data_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (type_ != trinsic.services.event.v1.EventType.PING.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timestamp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, timestamp_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(4, data_);
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
    if (!(obj instanceof trinsic.services.event.v1.Event)) {
      return super.equals(obj);
    }
    trinsic.services.event.v1.Event other = (trinsic.services.event.v1.Event) obj;

    if (!getId().equals(other.getId())) return false;
    if (type_ != other.type_) return false;
    if (!getTimestamp().equals(other.getTimestamp())) return false;
    if (!getData().equals(other.getData())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimestamp().hashCode();
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.event.v1.Event parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.event.v1.Event parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.event.v1.Event parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.event.v1.Event parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.event.v1.Event parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.event.v1.Event parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.event.v1.Event parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.event.v1.Event parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.event.v1.Event parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.event.v1.Event parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.event.v1.Event parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.event.v1.Event parseFrom(
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

  public static Builder newBuilder(trinsic.services.event.v1.Event prototype) {
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
   * Event
   * </pre>
   *
   * Protobuf type {@code trinsic.services.event.Event}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:trinsic.services.event.Event)
      trinsic.services.event.v1.EventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.event.v1.EventOuterClass
          .internal_static_trinsic_services_event_Event_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.event.v1.EventOuterClass
          .internal_static_trinsic_services_event_Event_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.event.v1.Event.class, trinsic.services.event.v1.Event.Builder.class);
    }

    // Construct using trinsic.services.event.v1.Event.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      type_ = 0;

      timestamp_ = "";

      data_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.event.v1.EventOuterClass
          .internal_static_trinsic_services_event_Event_descriptor;
    }

    @java.lang.Override
    public trinsic.services.event.v1.Event getDefaultInstanceForType() {
      return trinsic.services.event.v1.Event.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.event.v1.Event build() {
      trinsic.services.event.v1.Event result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.event.v1.Event buildPartial() {
      trinsic.services.event.v1.Event result = new trinsic.services.event.v1.Event(this);
      result.id_ = id_;
      result.type_ = type_;
      result.timestamp_ = timestamp_;
      result.data_ = data_;
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
      if (other instanceof trinsic.services.event.v1.Event) {
        return mergeFrom((trinsic.services.event.v1.Event) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.event.v1.Event other) {
      if (other == trinsic.services.event.v1.Event.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getTimestamp().isEmpty()) {
        timestamp_ = other.timestamp_;
        onChanged();
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
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
                id_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 16:
              {
                type_ = input.readEnum();

                break;
              } // case 16
            case 26:
              {
                timestamp_ = input.readStringRequireUtf8();

                break;
              } // case 26
            case 34:
              {
                data_ = input.readBytes();

                break;
              } // case 34
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

    private java.lang.Object id_ = "";
    /**
     *
     *
     * <pre>
     * UUID of event
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * UUID of event
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * UUID of event
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      id_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * UUID of event
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearId() {

      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * UUID of event
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      id_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Type of event
     * </pre>
     *
     * <code>.trinsic.services.event.EventType type = 2;</code>
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
     * Type of event
     * </pre>
     *
     * <code>.trinsic.services.event.EventType type = 2;</code>
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
     * Type of event
     * </pre>
     *
     * <code>.trinsic.services.event.EventType type = 2;</code>
     *
     * @return The type.
     */
    @java.lang.Override
    public trinsic.services.event.v1.EventType getType() {
      @SuppressWarnings("deprecation")
      trinsic.services.event.v1.EventType result =
          trinsic.services.event.v1.EventType.valueOf(type_);
      return result == null ? trinsic.services.event.v1.EventType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Type of event
     * </pre>
     *
     * <code>.trinsic.services.event.EventType type = 2;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(trinsic.services.event.v1.EventType value) {
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
     * Type of event
     * </pre>
     *
     * <code>.trinsic.services.event.EventType type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {

      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object timestamp_ = "";
    /**
     *
     *
     * <pre>
     * Timestamp event occurred, in ISO 8601 format (ex. `2022-07-07T08:09:10.11Z`)
     * </pre>
     *
     * <code>string timestamp = 3;</code>
     *
     * @return The timestamp.
     */
    public java.lang.String getTimestamp() {
      java.lang.Object ref = timestamp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Timestamp event occurred, in ISO 8601 format (ex. `2022-07-07T08:09:10.11Z`)
     * </pre>
     *
     * <code>string timestamp = 3;</code>
     *
     * @return The bytes for timestamp.
     */
    public com.google.protobuf.ByteString getTimestampBytes() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Timestamp event occurred, in ISO 8601 format (ex. `2022-07-07T08:09:10.11Z`)
     * </pre>
     *
     * <code>string timestamp = 3;</code>
     *
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Timestamp event occurred, in ISO 8601 format (ex. `2022-07-07T08:09:10.11Z`)
     * </pre>
     *
     * <code>string timestamp = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {

      timestamp_ = getDefaultInstance().getTimestamp();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Timestamp event occurred, in ISO 8601 format (ex. `2022-07-07T08:09:10.11Z`)
     * </pre>
     *
     * <code>string timestamp = 3;</code>
     *
     * @param value The bytes for timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestampBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      timestamp_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Event-specific payload, as an encoded protobuf message
     * </pre>
     *
     * <code>bytes data = 4;</code>
     *
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     *
     *
     * <pre>
     * Event-specific payload, as an encoded protobuf message
     * </pre>
     *
     * <code>bytes data = 4;</code>
     *
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      data_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Event-specific payload, as an encoded protobuf message
     * </pre>
     *
     * <code>bytes data = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearData() {

      data_ = getDefaultInstance().getData();
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

    // @@protoc_insertion_point(builder_scope:trinsic.services.event.Event)
  }

  // @@protoc_insertion_point(class_scope:trinsic.services.event.Event)
  private static final trinsic.services.event.v1.Event DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.event.v1.Event();
  }

  public static trinsic.services.event.v1.Event getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Event> PARSER =
      new com.google.protobuf.AbstractParser<Event>() {
        @java.lang.Override
        public Event parsePartialFrom(
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

  public static com.google.protobuf.Parser<Event> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Event> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.event.v1.Event getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
