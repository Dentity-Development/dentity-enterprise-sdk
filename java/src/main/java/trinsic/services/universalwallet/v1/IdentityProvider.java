// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/universal-wallet/v1/universal-wallet.proto

package trinsic.services.universalwallet.v1;

/** Protobuf enum {@code services.universalwallet.v1.IdentityProvider} */
public enum IdentityProvider implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Identity provider is unknown
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   *
   *
   * <pre>
   * Identity provider is email
   * </pre>
   *
   * <code>EMAIL = 1;</code>
   */
  EMAIL(1),
  /**
   *
   *
   * <pre>
   * Identity provider is phone
   * </pre>
   *
   * <code>PHONE = 2;</code>
   */
  PHONE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Identity provider is unknown
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Identity provider is email
   * </pre>
   *
   * <code>EMAIL = 1;</code>
   */
  public static final int EMAIL_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Identity provider is phone
   * </pre>
   *
   * <code>PHONE = 2;</code>
   */
  public static final int PHONE_VALUE = 2;

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
  public static IdentityProvider valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IdentityProvider forNumber(int value) {
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return EMAIL;
      case 2:
        return PHONE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IdentityProvider> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<IdentityProvider> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<IdentityProvider>() {
        public IdentityProvider findValueByNumber(int number) {
          return IdentityProvider.forNumber(number);
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
    return trinsic.services.universalwallet.v1.UniversalWalletOuterClass.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final IdentityProvider[] VALUES = values();

  public static IdentityProvider valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private IdentityProvider(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.universalwallet.v1.IdentityProvider)
}
