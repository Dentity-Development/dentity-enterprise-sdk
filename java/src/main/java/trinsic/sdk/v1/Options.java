// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sdk/options/v1/options.proto

package trinsic.sdk.v1;

public final class Options {
  private Options() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServiceOptionsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sdk.options.v1.ServiceOptions)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * service endpoint
     * </pre>
     *
     * <code>string server_endpoint = 1;</code>
     * @return The serverEndpoint.
     */
    java.lang.String getServerEndpoint();
    /**
     * <pre>
     * service endpoint
     * </pre>
     *
     * <code>string server_endpoint = 1;</code>
     * @return The bytes for serverEndpoint.
     */
    com.google.protobuf.ByteString
        getServerEndpointBytes();

    /**
     * <pre>
     * service port
     * </pre>
     *
     * <code>int32 server_port = 2;</code>
     * @return The serverPort.
     */
    int getServerPort();

    /**
     * <pre>
     * indicates if tls is used
     * </pre>
     *
     * <code>bool server_use_tls = 3;</code>
     * @return The serverUseTls.
     */
    boolean getServerUseTls();

    /**
     * <pre>
     * default auth token for oberon security scheme
     * </pre>
     *
     * <code>string auth_token = 4;</code>
     * @return The authToken.
     */
    java.lang.String getAuthToken();
    /**
     * <pre>
     * default auth token for oberon security scheme
     * </pre>
     *
     * <code>string auth_token = 4;</code>
     * @return The bytes for authToken.
     */
    com.google.protobuf.ByteString
        getAuthTokenBytes();

    /**
     * <pre>
     * ecosystem to use with endpoints that require it
     * </pre>
     *
     * <code>string default_ecosystem = 5;</code>
     * @return The defaultEcosystem.
     */
    java.lang.String getDefaultEcosystem();
    /**
     * <pre>
     * ecosystem to use with endpoints that require it
     * </pre>
     *
     * <code>string default_ecosystem = 5;</code>
     * @return The bytes for defaultEcosystem.
     */
    com.google.protobuf.ByteString
        getDefaultEcosystemBytes();
  }
  /**
   * <pre>
   * service options
   * </pre>
   *
   * Protobuf type {@code sdk.options.v1.ServiceOptions}
   */
  public static final class ServiceOptions extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sdk.options.v1.ServiceOptions)
      ServiceOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServiceOptions.newBuilder() to construct.
    private ServiceOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServiceOptions() {
      serverEndpoint_ = "";
      authToken_ = "";
      defaultEcosystem_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ServiceOptions();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ServiceOptions(
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

              serverEndpoint_ = s;
              break;
            }
            case 16: {

              serverPort_ = input.readInt32();
              break;
            }
            case 24: {

              serverUseTls_ = input.readBool();
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              authToken_ = s;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              defaultEcosystem_ = s;
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
      return trinsic.sdk.v1.Options.internal_static_sdk_options_v1_ServiceOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.sdk.v1.Options.internal_static_sdk_options_v1_ServiceOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.sdk.v1.Options.ServiceOptions.class, trinsic.sdk.v1.Options.ServiceOptions.Builder.class);
    }

    public static final int SERVER_ENDPOINT_FIELD_NUMBER = 1;
    private volatile java.lang.Object serverEndpoint_;
    /**
     * <pre>
     * service endpoint
     * </pre>
     *
     * <code>string server_endpoint = 1;</code>
     * @return The serverEndpoint.
     */
    @java.lang.Override
    public java.lang.String getServerEndpoint() {
      java.lang.Object ref = serverEndpoint_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serverEndpoint_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * service endpoint
     * </pre>
     *
     * <code>string server_endpoint = 1;</code>
     * @return The bytes for serverEndpoint.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getServerEndpointBytes() {
      java.lang.Object ref = serverEndpoint_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverEndpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SERVER_PORT_FIELD_NUMBER = 2;
    private int serverPort_;
    /**
     * <pre>
     * service port
     * </pre>
     *
     * <code>int32 server_port = 2;</code>
     * @return The serverPort.
     */
    @java.lang.Override
    public int getServerPort() {
      return serverPort_;
    }

    public static final int SERVER_USE_TLS_FIELD_NUMBER = 3;
    private boolean serverUseTls_;
    /**
     * <pre>
     * indicates if tls is used
     * </pre>
     *
     * <code>bool server_use_tls = 3;</code>
     * @return The serverUseTls.
     */
    @java.lang.Override
    public boolean getServerUseTls() {
      return serverUseTls_;
    }

    public static final int AUTH_TOKEN_FIELD_NUMBER = 4;
    private volatile java.lang.Object authToken_;
    /**
     * <pre>
     * default auth token for oberon security scheme
     * </pre>
     *
     * <code>string auth_token = 4;</code>
     * @return The authToken.
     */
    @java.lang.Override
    public java.lang.String getAuthToken() {
      java.lang.Object ref = authToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authToken_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * default auth token for oberon security scheme
     * </pre>
     *
     * <code>string auth_token = 4;</code>
     * @return The bytes for authToken.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAuthTokenBytes() {
      java.lang.Object ref = authToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DEFAULT_ECOSYSTEM_FIELD_NUMBER = 5;
    private volatile java.lang.Object defaultEcosystem_;
    /**
     * <pre>
     * ecosystem to use with endpoints that require it
     * </pre>
     *
     * <code>string default_ecosystem = 5;</code>
     * @return The defaultEcosystem.
     */
    @java.lang.Override
    public java.lang.String getDefaultEcosystem() {
      java.lang.Object ref = defaultEcosystem_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultEcosystem_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * ecosystem to use with endpoints that require it
     * </pre>
     *
     * <code>string default_ecosystem = 5;</code>
     * @return The bytes for defaultEcosystem.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDefaultEcosystemBytes() {
      java.lang.Object ref = defaultEcosystem_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        defaultEcosystem_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverEndpoint_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serverEndpoint_);
      }
      if (serverPort_ != 0) {
        output.writeInt32(2, serverPort_);
      }
      if (serverUseTls_ != false) {
        output.writeBool(3, serverUseTls_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authToken_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, authToken_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultEcosystem_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, defaultEcosystem_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverEndpoint_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serverEndpoint_);
      }
      if (serverPort_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, serverPort_);
      }
      if (serverUseTls_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, serverUseTls_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authToken_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, authToken_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultEcosystem_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, defaultEcosystem_);
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
      if (!(obj instanceof trinsic.sdk.v1.Options.ServiceOptions)) {
        return super.equals(obj);
      }
      trinsic.sdk.v1.Options.ServiceOptions other = (trinsic.sdk.v1.Options.ServiceOptions) obj;

      if (!getServerEndpoint()
          .equals(other.getServerEndpoint())) return false;
      if (getServerPort()
          != other.getServerPort()) return false;
      if (getServerUseTls()
          != other.getServerUseTls()) return false;
      if (!getAuthToken()
          .equals(other.getAuthToken())) return false;
      if (!getDefaultEcosystem()
          .equals(other.getDefaultEcosystem())) return false;
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
      hash = (37 * hash) + SERVER_ENDPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getServerEndpoint().hashCode();
      hash = (37 * hash) + SERVER_PORT_FIELD_NUMBER;
      hash = (53 * hash) + getServerPort();
      hash = (37 * hash) + SERVER_USE_TLS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getServerUseTls());
      hash = (37 * hash) + AUTH_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getAuthToken().hashCode();
      hash = (37 * hash) + DEFAULT_ECOSYSTEM_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultEcosystem().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static trinsic.sdk.v1.Options.ServiceOptions parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static trinsic.sdk.v1.Options.ServiceOptions parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static trinsic.sdk.v1.Options.ServiceOptions parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static trinsic.sdk.v1.Options.ServiceOptions parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static trinsic.sdk.v1.Options.ServiceOptions parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static trinsic.sdk.v1.Options.ServiceOptions parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static trinsic.sdk.v1.Options.ServiceOptions parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static trinsic.sdk.v1.Options.ServiceOptions parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static trinsic.sdk.v1.Options.ServiceOptions parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static trinsic.sdk.v1.Options.ServiceOptions parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static trinsic.sdk.v1.Options.ServiceOptions parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static trinsic.sdk.v1.Options.ServiceOptions parseFrom(
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
    public static Builder newBuilder(trinsic.sdk.v1.Options.ServiceOptions prototype) {
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
     * service options
     * </pre>
     *
     * Protobuf type {@code sdk.options.v1.ServiceOptions}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sdk.options.v1.ServiceOptions)
        trinsic.sdk.v1.Options.ServiceOptionsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return trinsic.sdk.v1.Options.internal_static_sdk_options_v1_ServiceOptions_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return trinsic.sdk.v1.Options.internal_static_sdk_options_v1_ServiceOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                trinsic.sdk.v1.Options.ServiceOptions.class, trinsic.sdk.v1.Options.ServiceOptions.Builder.class);
      }

      // Construct using trinsic.sdk.v1.Options.ServiceOptions.newBuilder()
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
        serverEndpoint_ = "";

        serverPort_ = 0;

        serverUseTls_ = false;

        authToken_ = "";

        defaultEcosystem_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return trinsic.sdk.v1.Options.internal_static_sdk_options_v1_ServiceOptions_descriptor;
      }

      @java.lang.Override
      public trinsic.sdk.v1.Options.ServiceOptions getDefaultInstanceForType() {
        return trinsic.sdk.v1.Options.ServiceOptions.getDefaultInstance();
      }

      @java.lang.Override
      public trinsic.sdk.v1.Options.ServiceOptions build() {
        trinsic.sdk.v1.Options.ServiceOptions result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public trinsic.sdk.v1.Options.ServiceOptions buildPartial() {
        trinsic.sdk.v1.Options.ServiceOptions result = new trinsic.sdk.v1.Options.ServiceOptions(this);
        result.serverEndpoint_ = serverEndpoint_;
        result.serverPort_ = serverPort_;
        result.serverUseTls_ = serverUseTls_;
        result.authToken_ = authToken_;
        result.defaultEcosystem_ = defaultEcosystem_;
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
        if (other instanceof trinsic.sdk.v1.Options.ServiceOptions) {
          return mergeFrom((trinsic.sdk.v1.Options.ServiceOptions)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(trinsic.sdk.v1.Options.ServiceOptions other) {
        if (other == trinsic.sdk.v1.Options.ServiceOptions.getDefaultInstance()) return this;
        if (!other.getServerEndpoint().isEmpty()) {
          serverEndpoint_ = other.serverEndpoint_;
          onChanged();
        }
        if (other.getServerPort() != 0) {
          setServerPort(other.getServerPort());
        }
        if (other.getServerUseTls() != false) {
          setServerUseTls(other.getServerUseTls());
        }
        if (!other.getAuthToken().isEmpty()) {
          authToken_ = other.authToken_;
          onChanged();
        }
        if (!other.getDefaultEcosystem().isEmpty()) {
          defaultEcosystem_ = other.defaultEcosystem_;
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
        trinsic.sdk.v1.Options.ServiceOptions parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (trinsic.sdk.v1.Options.ServiceOptions) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object serverEndpoint_ = "";
      /**
       * <pre>
       * service endpoint
       * </pre>
       *
       * <code>string server_endpoint = 1;</code>
       * @return The serverEndpoint.
       */
      public java.lang.String getServerEndpoint() {
        java.lang.Object ref = serverEndpoint_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          serverEndpoint_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * service endpoint
       * </pre>
       *
       * <code>string server_endpoint = 1;</code>
       * @return The bytes for serverEndpoint.
       */
      public com.google.protobuf.ByteString
          getServerEndpointBytes() {
        java.lang.Object ref = serverEndpoint_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serverEndpoint_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * service endpoint
       * </pre>
       *
       * <code>string server_endpoint = 1;</code>
       * @param value The serverEndpoint to set.
       * @return This builder for chaining.
       */
      public Builder setServerEndpoint(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        serverEndpoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * service endpoint
       * </pre>
       *
       * <code>string server_endpoint = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerEndpoint() {
        
        serverEndpoint_ = getDefaultInstance().getServerEndpoint();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * service endpoint
       * </pre>
       *
       * <code>string server_endpoint = 1;</code>
       * @param value The bytes for serverEndpoint to set.
       * @return This builder for chaining.
       */
      public Builder setServerEndpointBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        serverEndpoint_ = value;
        onChanged();
        return this;
      }

      private int serverPort_ ;
      /**
       * <pre>
       * service port
       * </pre>
       *
       * <code>int32 server_port = 2;</code>
       * @return The serverPort.
       */
      @java.lang.Override
      public int getServerPort() {
        return serverPort_;
      }
      /**
       * <pre>
       * service port
       * </pre>
       *
       * <code>int32 server_port = 2;</code>
       * @param value The serverPort to set.
       * @return This builder for chaining.
       */
      public Builder setServerPort(int value) {
        
        serverPort_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * service port
       * </pre>
       *
       * <code>int32 server_port = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerPort() {
        
        serverPort_ = 0;
        onChanged();
        return this;
      }

      private boolean serverUseTls_ ;
      /**
       * <pre>
       * indicates if tls is used
       * </pre>
       *
       * <code>bool server_use_tls = 3;</code>
       * @return The serverUseTls.
       */
      @java.lang.Override
      public boolean getServerUseTls() {
        return serverUseTls_;
      }
      /**
       * <pre>
       * indicates if tls is used
       * </pre>
       *
       * <code>bool server_use_tls = 3;</code>
       * @param value The serverUseTls to set.
       * @return This builder for chaining.
       */
      public Builder setServerUseTls(boolean value) {
        
        serverUseTls_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * indicates if tls is used
       * </pre>
       *
       * <code>bool server_use_tls = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerUseTls() {
        
        serverUseTls_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object authToken_ = "";
      /**
       * <pre>
       * default auth token for oberon security scheme
       * </pre>
       *
       * <code>string auth_token = 4;</code>
       * @return The authToken.
       */
      public java.lang.String getAuthToken() {
        java.lang.Object ref = authToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          authToken_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * default auth token for oberon security scheme
       * </pre>
       *
       * <code>string auth_token = 4;</code>
       * @return The bytes for authToken.
       */
      public com.google.protobuf.ByteString
          getAuthTokenBytes() {
        java.lang.Object ref = authToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          authToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * default auth token for oberon security scheme
       * </pre>
       *
       * <code>string auth_token = 4;</code>
       * @param value The authToken to set.
       * @return This builder for chaining.
       */
      public Builder setAuthToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        authToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * default auth token for oberon security scheme
       * </pre>
       *
       * <code>string auth_token = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthToken() {
        
        authToken_ = getDefaultInstance().getAuthToken();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * default auth token for oberon security scheme
       * </pre>
       *
       * <code>string auth_token = 4;</code>
       * @param value The bytes for authToken to set.
       * @return This builder for chaining.
       */
      public Builder setAuthTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        authToken_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object defaultEcosystem_ = "";
      /**
       * <pre>
       * ecosystem to use with endpoints that require it
       * </pre>
       *
       * <code>string default_ecosystem = 5;</code>
       * @return The defaultEcosystem.
       */
      public java.lang.String getDefaultEcosystem() {
        java.lang.Object ref = defaultEcosystem_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          defaultEcosystem_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * ecosystem to use with endpoints that require it
       * </pre>
       *
       * <code>string default_ecosystem = 5;</code>
       * @return The bytes for defaultEcosystem.
       */
      public com.google.protobuf.ByteString
          getDefaultEcosystemBytes() {
        java.lang.Object ref = defaultEcosystem_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          defaultEcosystem_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ecosystem to use with endpoints that require it
       * </pre>
       *
       * <code>string default_ecosystem = 5;</code>
       * @param value The defaultEcosystem to set.
       * @return This builder for chaining.
       */
      public Builder setDefaultEcosystem(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        defaultEcosystem_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ecosystem to use with endpoints that require it
       * </pre>
       *
       * <code>string default_ecosystem = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDefaultEcosystem() {
        
        defaultEcosystem_ = getDefaultInstance().getDefaultEcosystem();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ecosystem to use with endpoints that require it
       * </pre>
       *
       * <code>string default_ecosystem = 5;</code>
       * @param value The bytes for defaultEcosystem to set.
       * @return This builder for chaining.
       */
      public Builder setDefaultEcosystemBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        defaultEcosystem_ = value;
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


      // @@protoc_insertion_point(builder_scope:sdk.options.v1.ServiceOptions)
    }

    // @@protoc_insertion_point(class_scope:sdk.options.v1.ServiceOptions)
    private static final trinsic.sdk.v1.Options.ServiceOptions DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new trinsic.sdk.v1.Options.ServiceOptions();
    }

    public static trinsic.sdk.v1.Options.ServiceOptions getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServiceOptions>
        PARSER = new com.google.protobuf.AbstractParser<ServiceOptions>() {
      @java.lang.Override
      public ServiceOptions parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServiceOptions(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServiceOptions> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServiceOptions> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public trinsic.sdk.v1.Options.ServiceOptions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sdk_options_v1_ServiceOptions_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sdk_options_v1_ServiceOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034sdk/options/v1/options.proto\022\016sdk.opti" +
      "ons.v1\"\205\001\n\016ServiceOptions\022\027\n\017server_endp" +
      "oint\030\001 \001(\t\022\023\n\013server_port\030\002 \001(\005\022\026\n\016serve" +
      "r_use_tls\030\003 \001(\010\022\022\n\nauth_token\030\004 \001(\t\022\031\n\021d" +
      "efault_ecosystem\030\005 \001(\tBO\n\016trinsic.sdk.v1" +
      "Z$github.com/trinsic-id/sdk/go/options\252\002" +
      "\026Trinsic.Sdk.Options.V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sdk_options_v1_ServiceOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sdk_options_v1_ServiceOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sdk_options_v1_ServiceOptions_descriptor,
        new java.lang.String[] { "ServerEndpoint", "ServerPort", "ServerUseTls", "AuthToken", "DefaultEcosystem", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
