// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/account/v1/account.proto

package trinsic.services.account.v1;

/**
 *
 *
 * <pre>
 * Confirmation method type for two-factor workflows
 * </pre>
 *
 * Protobuf enum {@code services.account.v1.ConfirmationMethod}
 */
public enum ConfirmationMethod implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * No confirmation required
   * </pre>
   *
   * <code>None = 0;</code>
   */
  None(0),
  /**
   *
   *
   * <pre>
   * Email confirmation required
   * </pre>
   *
   * <code>Email = 1;</code>
   */
  Email(1),
  /**
   *
   *
   * <pre>
   * SMS confirmation required
   * </pre>
   *
   * <code>Sms = 2;</code>
   */
  Sms(2),
  /**
   *
   *
   * <pre>
   * Confirmation from a connected device is required
   * </pre>
   *
   * <code>ConnectedDevice = 3;</code>
   */
  ConnectedDevice(3),
  /**
   *
   *
   * <pre>
   * Third-party method of confirmation is required
   * </pre>
   *
   * <code>Other = 10;</code>
   */
  Other(10),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * No confirmation required
   * </pre>
   *
   * <code>None = 0;</code>
   */
  public static final int None_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Email confirmation required
   * </pre>
   *
   * <code>Email = 1;</code>
   */
  public static final int Email_VALUE = 1;
  /**
   *
   *
   * <pre>
   * SMS confirmation required
   * </pre>
   *
   * <code>Sms = 2;</code>
   */
  public static final int Sms_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Confirmation from a connected device is required
   * </pre>
   *
   * <code>ConnectedDevice = 3;</code>
   */
  public static final int ConnectedDevice_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Third-party method of confirmation is required
   * </pre>
   *
   * <code>Other = 10;</code>
   */
  public static final int Other_VALUE = 10;

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
  public static ConfirmationMethod valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ConfirmationMethod forNumber(int value) {
    switch (value) {
      case 0:
        return None;
      case 1:
        return Email;
      case 2:
        return Sms;
      case 3:
        return ConnectedDevice;
      case 10:
        return Other;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ConfirmationMethod> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ConfirmationMethod>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConfirmationMethod>() {
            public ConfirmationMethod findValueByNumber(int number) {
              return ConfirmationMethod.forNumber(number);
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
    return trinsic.services.account.v1.Account.getDescriptor().getEnumTypes().get(0);
  }

  private static final ConfirmationMethod[] VALUES = values();

  public static ConfirmationMethod valueOf(
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

  private ConfirmationMethod(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.account.v1.ConfirmationMethod)
}
