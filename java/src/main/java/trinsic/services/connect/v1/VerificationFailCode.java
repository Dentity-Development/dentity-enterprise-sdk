// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/connect/v1/connect.proto

package trinsic.services.connect.v1;

/**
 *
 *
 * <pre>
 * The specific reason a Verification is in the `Failed` state
 * </pre>
 *
 * Protobuf enum {@code services.connect.v1.VerificationFailCode}
 */
public enum VerificationFailCode implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * An internal Trinsic error caused this verification to fail
   * </pre>
   *
   * <code>VERIFICATION_FAIL_INTERNAL = 0;</code>
   */
  VERIFICATION_FAIL_INTERNAL(0),
  /**
   *
   *
   * <pre>
   * The image(s) provided for this verification were either too low-quality, not of the correct type, or otherwise
   * unable to be processed.
   * </pre>
   *
   * <code>VERIFICATION_FAIL_INVALID_IMAGE = 1;</code>
   */
  VERIFICATION_FAIL_INVALID_IMAGE(1),
  /**
   *
   *
   * <pre>
   * The identity data/images provided are suspected to be inauthentic, fraudulent, or forged.
   * </pre>
   *
   * <code>VERIFICATION_FAIL_INAUTHENTIC = 2;</code>
   */
  VERIFICATION_FAIL_INAUTHENTIC(2),
  /**
   *
   *
   * <pre>
   * The document provided is either of an unsupported type, or from an unsupported country.
   * </pre>
   *
   * <code>VERIFICATION_FAIL_UNSUPPORTED_DOCUMENT = 3;</code>
   */
  VERIFICATION_FAIL_UNSUPPORTED_DOCUMENT(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * An internal Trinsic error caused this verification to fail
   * </pre>
   *
   * <code>VERIFICATION_FAIL_INTERNAL = 0;</code>
   */
  public static final int VERIFICATION_FAIL_INTERNAL_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The image(s) provided for this verification were either too low-quality, not of the correct type, or otherwise
   * unable to be processed.
   * </pre>
   *
   * <code>VERIFICATION_FAIL_INVALID_IMAGE = 1;</code>
   */
  public static final int VERIFICATION_FAIL_INVALID_IMAGE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The identity data/images provided are suspected to be inauthentic, fraudulent, or forged.
   * </pre>
   *
   * <code>VERIFICATION_FAIL_INAUTHENTIC = 2;</code>
   */
  public static final int VERIFICATION_FAIL_INAUTHENTIC_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The document provided is either of an unsupported type, or from an unsupported country.
   * </pre>
   *
   * <code>VERIFICATION_FAIL_UNSUPPORTED_DOCUMENT = 3;</code>
   */
  public static final int VERIFICATION_FAIL_UNSUPPORTED_DOCUMENT_VALUE = 3;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static VerificationFailCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VerificationFailCode forNumber(int value) {
    switch (value) {
      case 0:
        return VERIFICATION_FAIL_INTERNAL;
      case 1:
        return VERIFICATION_FAIL_INVALID_IMAGE;
      case 2:
        return VERIFICATION_FAIL_INAUTHENTIC;
      case 3:
        return VERIFICATION_FAIL_UNSUPPORTED_DOCUMENT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VerificationFailCode>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<VerificationFailCode>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VerificationFailCode>() {
            public VerificationFailCode findValueByNumber(int number) {
              return VerificationFailCode.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return trinsic.services.connect.v1.ConnectOuterClass.getDescriptor().getEnumTypes().get(4);
  }

  private static final VerificationFailCode[] VALUES = values();

  public static VerificationFailCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private VerificationFailCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.connect.v1.VerificationFailCode)
}
