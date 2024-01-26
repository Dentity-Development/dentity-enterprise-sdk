// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/connect/v1/connect.proto

package trinsic.services.connect.v1;

/**
 *
 *
 * <pre>
 * Response to `CancelIDVSessionRequest`
 * </pre>
 *
 * Protobuf type {@code services.connect.v1.CancelSessionResponse}
 */
public final class CancelSessionResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.connect.v1.CancelSessionResponse)
    CancelSessionResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CancelSessionResponse.newBuilder() to construct.
  private CancelSessionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CancelSessionResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CancelSessionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.connect.v1.ConnectOuterClass
        .internal_static_services_connect_v1_CancelSessionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.connect.v1.ConnectOuterClass
        .internal_static_services_connect_v1_CancelSessionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.connect.v1.CancelSessionResponse.class,
            trinsic.services.connect.v1.CancelSessionResponse.Builder.class);
  }

  public static final int SESSION_FIELD_NUMBER = 1;
  private trinsic.services.connect.v1.IDVSession session_;
  /**
   *
   *
   * <pre>
   * The IDVSession in its current state after cancellation
   * </pre>
   *
   * <code>.services.connect.v1.IDVSession session = 1;</code>
   *
   * @return Whether the session field is set.
   */
  @java.lang.Override
  public boolean hasSession() {
    return session_ != null;
  }
  /**
   *
   *
   * <pre>
   * The IDVSession in its current state after cancellation
   * </pre>
   *
   * <code>.services.connect.v1.IDVSession session = 1;</code>
   *
   * @return The session.
   */
  @java.lang.Override
  public trinsic.services.connect.v1.IDVSession getSession() {
    return session_ == null
        ? trinsic.services.connect.v1.IDVSession.getDefaultInstance()
        : session_;
  }
  /**
   *
   *
   * <pre>
   * The IDVSession in its current state after cancellation
   * </pre>
   *
   * <code>.services.connect.v1.IDVSession session = 1;</code>
   */
  @java.lang.Override
  public trinsic.services.connect.v1.IDVSessionOrBuilder getSessionOrBuilder() {
    return getSession();
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
    if (session_ != null) {
      output.writeMessage(1, getSession());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (session_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSession());
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
    if (!(obj instanceof trinsic.services.connect.v1.CancelSessionResponse)) {
      return super.equals(obj);
    }
    trinsic.services.connect.v1.CancelSessionResponse other =
        (trinsic.services.connect.v1.CancelSessionResponse) obj;

    if (hasSession() != other.hasSession()) return false;
    if (hasSession()) {
      if (!getSession().equals(other.getSession())) return false;
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
    if (hasSession()) {
      hash = (37 * hash) + SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getSession().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.connect.v1.CancelSessionResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.connect.v1.CancelSessionResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.connect.v1.CancelSessionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.connect.v1.CancelSessionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.connect.v1.CancelSessionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.connect.v1.CancelSessionResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.connect.v1.CancelSessionResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.connect.v1.CancelSessionResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.connect.v1.CancelSessionResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.connect.v1.CancelSessionResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.connect.v1.CancelSessionResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.connect.v1.CancelSessionResponse parseFrom(
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

  public static Builder newBuilder(trinsic.services.connect.v1.CancelSessionResponse prototype) {
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
   * Response to `CancelIDVSessionRequest`
   * </pre>
   *
   * Protobuf type {@code services.connect.v1.CancelSessionResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.connect.v1.CancelSessionResponse)
      trinsic.services.connect.v1.CancelSessionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.connect.v1.ConnectOuterClass
          .internal_static_services_connect_v1_CancelSessionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.connect.v1.ConnectOuterClass
          .internal_static_services_connect_v1_CancelSessionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.connect.v1.CancelSessionResponse.class,
              trinsic.services.connect.v1.CancelSessionResponse.Builder.class);
    }

    // Construct using trinsic.services.connect.v1.CancelSessionResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (sessionBuilder_ == null) {
        session_ = null;
      } else {
        session_ = null;
        sessionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.connect.v1.ConnectOuterClass
          .internal_static_services_connect_v1_CancelSessionResponse_descriptor;
    }

    @java.lang.Override
    public trinsic.services.connect.v1.CancelSessionResponse getDefaultInstanceForType() {
      return trinsic.services.connect.v1.CancelSessionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.connect.v1.CancelSessionResponse build() {
      trinsic.services.connect.v1.CancelSessionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.connect.v1.CancelSessionResponse buildPartial() {
      trinsic.services.connect.v1.CancelSessionResponse result =
          new trinsic.services.connect.v1.CancelSessionResponse(this);
      if (sessionBuilder_ == null) {
        result.session_ = session_;
      } else {
        result.session_ = sessionBuilder_.build();
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
      if (other instanceof trinsic.services.connect.v1.CancelSessionResponse) {
        return mergeFrom((trinsic.services.connect.v1.CancelSessionResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.connect.v1.CancelSessionResponse other) {
      if (other == trinsic.services.connect.v1.CancelSessionResponse.getDefaultInstance())
        return this;
      if (other.hasSession()) {
        mergeSession(other.getSession());
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
                input.readMessage(getSessionFieldBuilder().getBuilder(), extensionRegistry);

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

    private trinsic.services.connect.v1.IDVSession session_;
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.connect.v1.IDVSession,
            trinsic.services.connect.v1.IDVSession.Builder,
            trinsic.services.connect.v1.IDVSessionOrBuilder>
        sessionBuilder_;
    /**
     *
     *
     * <pre>
     * The IDVSession in its current state after cancellation
     * </pre>
     *
     * <code>.services.connect.v1.IDVSession session = 1;</code>
     *
     * @return Whether the session field is set.
     */
    public boolean hasSession() {
      return sessionBuilder_ != null || session_ != null;
    }
    /**
     *
     *
     * <pre>
     * The IDVSession in its current state after cancellation
     * </pre>
     *
     * <code>.services.connect.v1.IDVSession session = 1;</code>
     *
     * @return The session.
     */
    public trinsic.services.connect.v1.IDVSession getSession() {
      if (sessionBuilder_ == null) {
        return session_ == null
            ? trinsic.services.connect.v1.IDVSession.getDefaultInstance()
            : session_;
      } else {
        return sessionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The IDVSession in its current state after cancellation
     * </pre>
     *
     * <code>.services.connect.v1.IDVSession session = 1;</code>
     */
    public Builder setSession(trinsic.services.connect.v1.IDVSession value) {
      if (sessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        session_ = value;
        onChanged();
      } else {
        sessionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The IDVSession in its current state after cancellation
     * </pre>
     *
     * <code>.services.connect.v1.IDVSession session = 1;</code>
     */
    public Builder setSession(trinsic.services.connect.v1.IDVSession.Builder builderForValue) {
      if (sessionBuilder_ == null) {
        session_ = builderForValue.build();
        onChanged();
      } else {
        sessionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The IDVSession in its current state after cancellation
     * </pre>
     *
     * <code>.services.connect.v1.IDVSession session = 1;</code>
     */
    public Builder mergeSession(trinsic.services.connect.v1.IDVSession value) {
      if (sessionBuilder_ == null) {
        if (session_ != null) {
          session_ =
              trinsic.services.connect.v1.IDVSession.newBuilder(session_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          session_ = value;
        }
        onChanged();
      } else {
        sessionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The IDVSession in its current state after cancellation
     * </pre>
     *
     * <code>.services.connect.v1.IDVSession session = 1;</code>
     */
    public Builder clearSession() {
      if (sessionBuilder_ == null) {
        session_ = null;
        onChanged();
      } else {
        session_ = null;
        sessionBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The IDVSession in its current state after cancellation
     * </pre>
     *
     * <code>.services.connect.v1.IDVSession session = 1;</code>
     */
    public trinsic.services.connect.v1.IDVSession.Builder getSessionBuilder() {

      onChanged();
      return getSessionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The IDVSession in its current state after cancellation
     * </pre>
     *
     * <code>.services.connect.v1.IDVSession session = 1;</code>
     */
    public trinsic.services.connect.v1.IDVSessionOrBuilder getSessionOrBuilder() {
      if (sessionBuilder_ != null) {
        return sessionBuilder_.getMessageOrBuilder();
      } else {
        return session_ == null
            ? trinsic.services.connect.v1.IDVSession.getDefaultInstance()
            : session_;
      }
    }
    /**
     *
     *
     * <pre>
     * The IDVSession in its current state after cancellation
     * </pre>
     *
     * <code>.services.connect.v1.IDVSession session = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.connect.v1.IDVSession,
            trinsic.services.connect.v1.IDVSession.Builder,
            trinsic.services.connect.v1.IDVSessionOrBuilder>
        getSessionFieldBuilder() {
      if (sessionBuilder_ == null) {
        sessionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                trinsic.services.connect.v1.IDVSession,
                trinsic.services.connect.v1.IDVSession.Builder,
                trinsic.services.connect.v1.IDVSessionOrBuilder>(
                getSession(), getParentForChildren(), isClean());
        session_ = null;
      }
      return sessionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:services.connect.v1.CancelSessionResponse)
  }

  // @@protoc_insertion_point(class_scope:services.connect.v1.CancelSessionResponse)
  private static final trinsic.services.connect.v1.CancelSessionResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.connect.v1.CancelSessionResponse();
  }

  public static trinsic.services.connect.v1.CancelSessionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CancelSessionResponse> PARSER =
      new com.google.protobuf.AbstractParser<CancelSessionResponse>() {
        @java.lang.Override
        public CancelSessionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CancelSessionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CancelSessionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.connect.v1.CancelSessionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}