// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/verifiable-credentials/v1/verifiable-credentials.proto

package trinsic.services.verifiablecredentials.v1;

/** Protobuf type {@code services.verifiablecredentials.v1.AcceptCredentialRequest} */
public final class AcceptCredentialRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.verifiablecredentials.v1.AcceptCredentialRequest)
    AcceptCredentialRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AcceptCredentialRequest.newBuilder() to construct.
  private AcceptCredentialRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AcceptCredentialRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AcceptCredentialRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
        .internal_static_services_verifiablecredentials_v1_AcceptCredentialRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
        .internal_static_services_verifiablecredentials_v1_AcceptCredentialRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest.class,
            trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest.Builder.class);
  }

  private int offerCase_ = 0;
  private java.lang.Object offer_;

  public enum OfferCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DOCUMENT_JSON(1),
    ITEM_ID(2),
    OFFER_NOT_SET(0);
    private final int value;

    private OfferCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OfferCase valueOf(int value) {
      return forNumber(value);
    }

    public static OfferCase forNumber(int value) {
      switch (value) {
        case 1:
          return DOCUMENT_JSON;
        case 2:
          return ITEM_ID;
        case 0:
          return OFFER_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public OfferCase getOfferCase() {
    return OfferCase.forNumber(offerCase_);
  }

  public static final int DOCUMENT_JSON_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * The JSON document that contains the credential offer
   * </pre>
   *
   * <code>string document_json = 1;</code>
   *
   * @return Whether the documentJson field is set.
   */
  public boolean hasDocumentJson() {
    return offerCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * The JSON document that contains the credential offer
   * </pre>
   *
   * <code>string document_json = 1;</code>
   *
   * @return The documentJson.
   */
  public java.lang.String getDocumentJson() {
    java.lang.Object ref = "";
    if (offerCase_ == 1) {
      ref = offer_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (offerCase_ == 1) {
        offer_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The JSON document that contains the credential offer
   * </pre>
   *
   * <code>string document_json = 1;</code>
   *
   * @return The bytes for documentJson.
   */
  public com.google.protobuf.ByteString getDocumentJsonBytes() {
    java.lang.Object ref = "";
    if (offerCase_ == 1) {
      ref = offer_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (offerCase_ == 1) {
        offer_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEM_ID_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * The ID of the credential offer (Parameter ID inside the JSON document)
   * </pre>
   *
   * <code>string item_id = 2 [(.services.options.optional) = true];</code>
   *
   * @return Whether the itemId field is set.
   */
  public boolean hasItemId() {
    return offerCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * The ID of the credential offer (Parameter ID inside the JSON document)
   * </pre>
   *
   * <code>string item_id = 2 [(.services.options.optional) = true];</code>
   *
   * @return The itemId.
   */
  public java.lang.String getItemId() {
    java.lang.Object ref = "";
    if (offerCase_ == 2) {
      ref = offer_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (offerCase_ == 2) {
        offer_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID of the credential offer (Parameter ID inside the JSON document)
   * </pre>
   *
   * <code>string item_id = 2 [(.services.options.optional) = true];</code>
   *
   * @return The bytes for itemId.
   */
  public com.google.protobuf.ByteString getItemIdBytes() {
    java.lang.Object ref = "";
    if (offerCase_ == 2) {
      ref = offer_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (offerCase_ == 2) {
        offer_ = b;
      }
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
    if (offerCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, offer_);
    }
    if (offerCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, offer_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (offerCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, offer_);
    }
    if (offerCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, offer_);
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
    if (!(obj instanceof trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest)) {
      return super.equals(obj);
    }
    trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest other =
        (trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest) obj;

    if (!getOfferCase().equals(other.getOfferCase())) return false;
    switch (offerCase_) {
      case 1:
        if (!getDocumentJson().equals(other.getDocumentJson())) return false;
        break;
      case 2:
        if (!getItemId().equals(other.getItemId())) return false;
        break;
      case 0:
      default:
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
    switch (offerCase_) {
      case 1:
        hash = (37 * hash) + DOCUMENT_JSON_FIELD_NUMBER;
        hash = (53 * hash) + getDocumentJson().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
        hash = (53 * hash) + getItemId().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest parseFrom(
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
      trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest prototype) {
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
  /** Protobuf type {@code services.verifiablecredentials.v1.AcceptCredentialRequest} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.verifiablecredentials.v1.AcceptCredentialRequest)
      trinsic.services.verifiablecredentials.v1.AcceptCredentialRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
          .internal_static_services_verifiablecredentials_v1_AcceptCredentialRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
          .internal_static_services_verifiablecredentials_v1_AcceptCredentialRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest.class,
              trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest.Builder.class);
    }

    // Construct using
    // trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      offerCase_ = 0;
      offer_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.verifiablecredentials.v1.VerifiableCredentials
          .internal_static_services_verifiablecredentials_v1_AcceptCredentialRequest_descriptor;
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest
        getDefaultInstanceForType() {
      return trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest build() {
      trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest buildPartial() {
      trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest result =
          new trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest(this);
      if (offerCase_ == 1) {
        result.offer_ = offer_;
      }
      if (offerCase_ == 2) {
        result.offer_ = offer_;
      }
      result.offerCase_ = offerCase_;
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
      if (other instanceof trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest) {
        return mergeFrom((trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest other) {
      if (other
          == trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest.getDefaultInstance())
        return this;
      switch (other.getOfferCase()) {
        case DOCUMENT_JSON:
          {
            offerCase_ = 1;
            offer_ = other.offer_;
            onChanged();
            break;
          }
        case ITEM_ID:
          {
            offerCase_ = 2;
            offer_ = other.offer_;
            onChanged();
            break;
          }
        case OFFER_NOT_SET:
          {
            break;
          }
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
                java.lang.String s = input.readStringRequireUtf8();
                offerCase_ = 1;
                offer_ = s;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                offerCase_ = 2;
                offer_ = s;
                break;
              } // case 18
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

    private int offerCase_ = 0;
    private java.lang.Object offer_;

    public OfferCase getOfferCase() {
      return OfferCase.forNumber(offerCase_);
    }

    public Builder clearOffer() {
      offerCase_ = 0;
      offer_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The JSON document that contains the credential offer
     * </pre>
     *
     * <code>string document_json = 1;</code>
     *
     * @return Whether the documentJson field is set.
     */
    @java.lang.Override
    public boolean hasDocumentJson() {
      return offerCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * The JSON document that contains the credential offer
     * </pre>
     *
     * <code>string document_json = 1;</code>
     *
     * @return The documentJson.
     */
    @java.lang.Override
    public java.lang.String getDocumentJson() {
      java.lang.Object ref = "";
      if (offerCase_ == 1) {
        ref = offer_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (offerCase_ == 1) {
          offer_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The JSON document that contains the credential offer
     * </pre>
     *
     * <code>string document_json = 1;</code>
     *
     * @return The bytes for documentJson.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDocumentJsonBytes() {
      java.lang.Object ref = "";
      if (offerCase_ == 1) {
        ref = offer_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (offerCase_ == 1) {
          offer_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The JSON document that contains the credential offer
     * </pre>
     *
     * <code>string document_json = 1;</code>
     *
     * @param value The documentJson to set.
     * @return This builder for chaining.
     */
    public Builder setDocumentJson(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      offerCase_ = 1;
      offer_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The JSON document that contains the credential offer
     * </pre>
     *
     * <code>string document_json = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDocumentJson() {
      if (offerCase_ == 1) {
        offerCase_ = 0;
        offer_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The JSON document that contains the credential offer
     * </pre>
     *
     * <code>string document_json = 1;</code>
     *
     * @param value The bytes for documentJson to set.
     * @return This builder for chaining.
     */
    public Builder setDocumentJsonBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      offerCase_ = 1;
      offer_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ID of the credential offer (Parameter ID inside the JSON document)
     * </pre>
     *
     * <code>string item_id = 2 [(.services.options.optional) = true];</code>
     *
     * @return Whether the itemId field is set.
     */
    @java.lang.Override
    public boolean hasItemId() {
      return offerCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * The ID of the credential offer (Parameter ID inside the JSON document)
     * </pre>
     *
     * <code>string item_id = 2 [(.services.options.optional) = true];</code>
     *
     * @return The itemId.
     */
    @java.lang.Override
    public java.lang.String getItemId() {
      java.lang.Object ref = "";
      if (offerCase_ == 2) {
        ref = offer_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (offerCase_ == 2) {
          offer_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the credential offer (Parameter ID inside the JSON document)
     * </pre>
     *
     * <code>string item_id = 2 [(.services.options.optional) = true];</code>
     *
     * @return The bytes for itemId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getItemIdBytes() {
      java.lang.Object ref = "";
      if (offerCase_ == 2) {
        ref = offer_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (offerCase_ == 2) {
          offer_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the credential offer (Parameter ID inside the JSON document)
     * </pre>
     *
     * <code>string item_id = 2 [(.services.options.optional) = true];</code>
     *
     * @param value The itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      offerCase_ = 2;
      offer_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the credential offer (Parameter ID inside the JSON document)
     * </pre>
     *
     * <code>string item_id = 2 [(.services.options.optional) = true];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearItemId() {
      if (offerCase_ == 2) {
        offerCase_ = 0;
        offer_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the credential offer (Parameter ID inside the JSON document)
     * </pre>
     *
     * <code>string item_id = 2 [(.services.options.optional) = true];</code>
     *
     * @param value The bytes for itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      offerCase_ = 2;
      offer_ = value;
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

    // @@protoc_insertion_point(builder_scope:services.verifiablecredentials.v1.AcceptCredentialRequest)
  }

  // @@protoc_insertion_point(class_scope:services.verifiablecredentials.v1.AcceptCredentialRequest)
  private static final trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest();
  }

  public static trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcceptCredentialRequest> PARSER =
      new com.google.protobuf.AbstractParser<AcceptCredentialRequest>() {
        @java.lang.Override
        public AcceptCredentialRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AcceptCredentialRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcceptCredentialRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.verifiablecredentials.v1.AcceptCredentialRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
