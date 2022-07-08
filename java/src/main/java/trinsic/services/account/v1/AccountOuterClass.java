// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/account/v1/account.proto

package trinsic.services.account.v1;

public final class AccountOuterClass {
  private AccountOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_SignInRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_SignInRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_AccountDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_AccountDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_SignInResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_SignInResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_AccountProfile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_AccountProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_TokenProtection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_TokenProtection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_AccountInfoRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_AccountInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_AccountInfoResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_AccountInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_ListDevicesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_ListDevicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_ListDevicesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_ListDevicesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_RevokeDeviceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_RevokeDeviceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_RevokeDeviceResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_RevokeDeviceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_AccountEcosystem_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_AccountEcosystem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_LoginRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_LoginResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_LoginResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_LoginConfirmRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_LoginConfirmRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_LoginConfirmResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_LoginConfirmResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_AuthorizeWebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_AuthorizeWebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_account_v1_AuthorizeWebhookResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_account_v1_AuthorizeWebhookResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "!services/account/v1/account.proto\022\023ser"
          + "vices.account.v1\032$services/options/field-options.proto\"\206\001\n\r"
          + "SignInRequest\022:\n"
          + "\007details\030\001"
          + " \001(\0132#.services.account.v1.AccountDetailsB\004\200\246\035\001\022\035\n"
          + "\017invitation_code\030\002 \001(\tB\004\200\246\035\001\022\032\n"
          + "\014ecosystem_id\030\003 \001(\tB\004\200\246\035\001\"L\n"
          + "\016AccountDetails\022\022\n"
          + "\004name\030\001 \001(\tB\004\200\246\035\001\022\023\n"
          + "\005email\030\002 \001(\tB\004\200\246\035\001\022\021\n"
          + "\003sms\030\003 \001(\tB\004\200\246\035\001\"\214\001\n"
          + "\016SignInResponse\022D\n"
          + "\023confirmation_method\030\003 \001(\0162\'."
          + "services.account.v1.ConfirmationMethod\0224\n"
          + "\007profile\030\004 \001(\0132#.services.account.v1.AccountProfile\"\207\001\n"
          + "\016AccountProfile\022\024\n"
          + "\014profile_type\030\001 \001(\t\022\021\n"
          + "\tauth_data\030\002 \001(\014\022\022\n\n"
          + "auth_token\030\003 \001(\014\0228\n\n"
          + "protection\030\004 \001(\0132$.services.account.v1.TokenProtection\"[\n"
          + "\017TokenProtection\022\017\n"
          + "\007enabled\030\001 \001(\010\0227\n"
          + "\006method\030\002 \001(\0162\'.services.account.v1.ConfirmationMethod\"\024\n"
          + "\022AccountInfoRequest\"\367\001\n"
          + "\023AccountInfoResponse\0224\n"
          + "\007details\030\001 \001(\0132#.services.account.v1.AccountDetails\022=\n\n"
          + "ecosystems\030\002 "
          + "\003(\0132%.services.account.v1.AccountEcosystemB\002\030\001\022\021\n"
          + "\twallet_id\030\003 \001(\t\022\021\n"
          + "\tdevice_id\030\004 \001(\t\022\024\n"
          + "\014ecosystem_id\030\005 \001(\t\022\022\n\n"
          + "public_did\030\006 \001(\t\022\033\n"
          + "\023authorized_webhooks\030\007 \003(\t\"\024\n"
          + "\022ListDevicesRequest\"\025\n"
          + "\023ListDevicesResponse\"\025\n"
          + "\023RevokeDeviceRequest\"\026\n"
          + "\024RevokeDeviceResponse\"N\n"
          + "\020AccountEcosystem\022\n\n"
          + "\002id\030\001 \001(\t\022\014\n"
          + "\004name\030\002 \001(\t\022\023\n"
          + "\013description\030\003 \001(\t\022\013\n"
          + "\003uri\030\004 \001(\t\"^\n"
          + "\014LoginRequest\022\023\n"
          + "\005email\030\001 \001(\tB\004\200\246\035\001\022\035\n"
          + "\017invitation_code\030\002 \001(\tB\004\200\246\035\001\022\032\n"
          + "\014ecosystem_id\030\003 \001(\tB\004\200\246\035\001\"h\n\r"
          + "LoginResponse\022\023\n"
          + "\tchallenge\030\001 \001(\014H\000\0226\n"
          + "\007profile\030\002 \001(\0132#.services.account.v1.AccountProfileH\000B\n\n"
          + "\010response\"J\n"
          + "\023LoginConfirmRequest\022\021\n"
          + "\tchallenge\030\001 \001(\014\022 \n"
          + "\030confirmation_code_hashed\030\002 \001(\014\"L\n"
          + "\024LoginConfirmResponse\0224\n"
          + "\007profile\030\001 \001(\0132#.services.account.v1.AccountProfile\")\n"
          + "\027AuthorizeWebhookRequest\022\016\n"
          + "\006events\030\001 \003(\t\"\032\n"
          + "\030AuthorizeWebhookResponse*R\n"
          + "\022ConfirmationMethod\022\010\n"
          + "\004None\020\000\022\t\n"
          + "\005Email\020\001\022\007\n"
          + "\003Sms\020\002\022\023\n"
          + "\017ConnectedDevice\020\003\022\t\n"
          + "\005Other\020\n"
          + "2\313\005\n"
          + "\007Account\022b\n"
          + "\006SignIn\022\".services.account."
          + "v1.SignInRequest\032#.services.account.v1.SignInResponse\"\017\210\002\001\212\246\035\002\020\001\212\246\035\002\010\001\022\\\n"
          + "\005Login\022!.services.account.v1.LoginRequest\032\".ser"
          + "vices.account.v1.LoginResponse\"\014\212\246\035\002\020\001\212\246\035\002\010\001\022k\n"
          + "\014LoginConfirm\022(.services.account."
          + "v1.LoginConfirmRequest\032).services.account.v1.LoginConfirmResponse\"\006\212\246\035\002\020\001\022Y\n"
          + "\004Info\022\'.services.account.v1.AccountInfoReque"
          + "st\032(.services.account.v1.AccountInfoResponse\022`\n"
          + "\013ListDevices\022\'.services.account.v"
          + "1.ListDevicesRequest\032(.services.account.v1.ListDevicesResponse\022c\n"
          + "\014RevokeDevice\022(.services.account.v1.RevokeDeviceRequest"
          + "\032).services.account.v1.RevokeDeviceResponse\022o\n"
          + "\020AuthorizeWebhook\022,.services.accou"
          + "nt.v1.AuthorizeWebhookRequest\032-.services.account.v1.AuthorizeWebhookResponseBZ\n"
          + "\033trinsic.services.account.v1P\001Z\033services/"
          + "account/v1/account\252\002\033Trinsic.Services.Account.V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              trinsic.services.protobuf.options.FieldOptions.getDescriptor(),
            });
    internal_static_services_account_v1_SignInRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_services_account_v1_SignInRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_SignInRequest_descriptor,
            new java.lang.String[] {
              "Details", "InvitationCode", "EcosystemId",
            });
    internal_static_services_account_v1_AccountDetails_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_services_account_v1_AccountDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_AccountDetails_descriptor,
            new java.lang.String[] {
              "Name", "Email", "Sms",
            });
    internal_static_services_account_v1_SignInResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_services_account_v1_SignInResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_SignInResponse_descriptor,
            new java.lang.String[] {
              "ConfirmationMethod", "Profile",
            });
    internal_static_services_account_v1_AccountProfile_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_services_account_v1_AccountProfile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_AccountProfile_descriptor,
            new java.lang.String[] {
              "ProfileType", "AuthData", "AuthToken", "Protection",
            });
    internal_static_services_account_v1_TokenProtection_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_services_account_v1_TokenProtection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_TokenProtection_descriptor,
            new java.lang.String[] {
              "Enabled", "Method",
            });
    internal_static_services_account_v1_AccountInfoRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_services_account_v1_AccountInfoRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_AccountInfoRequest_descriptor,
            new java.lang.String[] {});
    internal_static_services_account_v1_AccountInfoResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_services_account_v1_AccountInfoResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_AccountInfoResponse_descriptor,
            new java.lang.String[] {
              "Details",
              "Ecosystems",
              "WalletId",
              "DeviceId",
              "EcosystemId",
              "PublicDid",
              "AuthorizedWebhooks",
            });
    internal_static_services_account_v1_ListDevicesRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_services_account_v1_ListDevicesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_ListDevicesRequest_descriptor,
            new java.lang.String[] {});
    internal_static_services_account_v1_ListDevicesResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_services_account_v1_ListDevicesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_ListDevicesResponse_descriptor,
            new java.lang.String[] {});
    internal_static_services_account_v1_RevokeDeviceRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_services_account_v1_RevokeDeviceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_RevokeDeviceRequest_descriptor,
            new java.lang.String[] {});
    internal_static_services_account_v1_RevokeDeviceResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_services_account_v1_RevokeDeviceResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_RevokeDeviceResponse_descriptor,
            new java.lang.String[] {});
    internal_static_services_account_v1_AccountEcosystem_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_services_account_v1_AccountEcosystem_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_AccountEcosystem_descriptor,
            new java.lang.String[] {
              "Id", "Name", "Description", "Uri",
            });
    internal_static_services_account_v1_LoginRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_services_account_v1_LoginRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_LoginRequest_descriptor,
            new java.lang.String[] {
              "Email", "InvitationCode", "EcosystemId",
            });
    internal_static_services_account_v1_LoginResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_services_account_v1_LoginResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_LoginResponse_descriptor,
            new java.lang.String[] {
              "Challenge", "Profile", "Response",
            });
    internal_static_services_account_v1_LoginConfirmRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_services_account_v1_LoginConfirmRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_LoginConfirmRequest_descriptor,
            new java.lang.String[] {
              "Challenge", "ConfirmationCodeHashed",
            });
    internal_static_services_account_v1_LoginConfirmResponse_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_services_account_v1_LoginConfirmResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_LoginConfirmResponse_descriptor,
            new java.lang.String[] {
              "Profile",
            });
    internal_static_services_account_v1_AuthorizeWebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_services_account_v1_AuthorizeWebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_AuthorizeWebhookRequest_descriptor,
            new java.lang.String[] {
              "Events",
            });
    internal_static_services_account_v1_AuthorizeWebhookResponse_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_services_account_v1_AuthorizeWebhookResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_account_v1_AuthorizeWebhookResponse_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(trinsic.services.protobuf.options.FieldOptions.optional);
    registry.add(trinsic.services.protobuf.options.FieldOptions.sdkTemplateOption);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    trinsic.services.protobuf.options.FieldOptions.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
