// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/options/field-options.proto

package trinsic.services.protobuf.options;

public final class FieldOptions {
  private FieldOptions() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(trinsic.services.protobuf.options.FieldOptions.optional);
    registry.add(trinsic.services.protobuf.options.FieldOptions.sdkTemplateOption);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int OPTIONAL_FIELD_NUMBER = 60000;
  /**
   * <pre>
   * Whether field is optional in Trinsic's backend.
   * This is not the same as an `optional` protobuf label;
   * it only impacts documentation generation for the field.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.Boolean> optional = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int SDK_TEMPLATE_OPTION_FIELD_NUMBER = 60001;
  /**
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MethodOptions,
      trinsic.services.protobuf.options.SdkTemplateOption> sdkTemplateOption = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        trinsic.services.protobuf.options.SdkTemplateOption.class,
        trinsic.services.protobuf.options.SdkTemplateOption.getDefaultInstance());
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_options_SdkTemplateOption_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_options_SdkTemplateOption_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$services/options/field-options.proto\022\020" +
      "services.options\032 google/protobuf/descri" +
      "ptor.proto\"L\n\021SdkTemplateOption\022\021\n\tanony" +
      "mous\030\001 \001(\010\022\016\n\006ignore\030\002 \001(\010\022\024\n\014no_argumen" +
      "ts\030\003 \001(\010:1\n\010optional\022\035.google.protobuf.F" +
      "ieldOptions\030\340\324\003 \001(\010:b\n\023sdk_template_opti" +
      "on\022\036.google.protobuf.MethodOptions\030\341\324\003 \001" +
      "(\0132#.services.options.SdkTemplateOptionB" +
      "[\n!trinsic.services.protobuf.optionsP\001Z\020" +
      "services/options\252\002!Trinsic.Services.Prot" +
      "obuf.Optionsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_services_options_SdkTemplateOption_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_options_SdkTemplateOption_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_options_SdkTemplateOption_descriptor,
        new java.lang.String[] { "Anonymous", "Ignore", "NoArguments", });
    optional.internalInit(descriptor.getExtensions().get(0));
    sdkTemplateOption.internalInit(descriptor.getExtensions().get(1));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
