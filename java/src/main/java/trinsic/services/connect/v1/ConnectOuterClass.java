// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/connect/v1/connect.proto

package trinsic.services.connect.v1;

public final class ConnectOuterClass {
  private ConnectOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_IDVSession_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_IDVSession_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_IDVSession_VerificationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_IDVSession_VerificationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_Verification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_Verification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_NormalizedGovernmentIdData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_NormalizedGovernmentIdData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_DemoRelyingParty_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_DemoRelyingParty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_CreateSessionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_CreateSessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_CreateSessionRequest_DebugInformationEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_CreateSessionRequest_DebugInformationEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_RequestedVerification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_RequestedVerification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_GovernmentIDOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_GovernmentIDOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_GovernmentIDFields_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_GovernmentIDFields_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_CreateSessionResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_CreateSessionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_CancelSessionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_CancelSessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_CancelSessionResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_CancelSessionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_GetSessionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_GetSessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_GetSessionResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_GetSessionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_ListSessionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_ListSessionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_ListSessionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_ListSessionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_HasValidCredentialRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_HasValidCredentialRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_HasValidCredentialResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_HasValidCredentialResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_connect_v1_CredentialRequestData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_connect_v1_CredentialRequestData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "!services/connect/v1/connect.proto\022\023ser"
          + "vices.connect.v1\032\037services/common/v1/com"
          + "mon.proto\0323services/universal-wallet/v1/universal-wallet.proto\032%services/google/"
          + "api/annotations.proto\032$services/options/field-options.proto\"\233\003\n\n"
          + "IDVSession\022\n\n"
          + "\002id\030\001 \001(\t\022\024\n"
          + "\014client_token\030\002 \001(\t\0223\n"
          + "\005state\030\003 \001(\0162$.services.connect.v1.IDVSessionState\022I\n\r"
          + "verifications\030\004"
          + " \003(\01322.services.connect.v1.IDVSession.VerificationsEntry\022<\n"
          + "\tfail_code\030\005"
          + " \001(\0162$.services.connect.v1.SessionFailCodeH\000\210\001\001\022\026\n"
          + "\tresult_vp\030\006 \001(\tH\001\210\001\001\022\017\n"
          + "\007created\030\007 \001(\006\022\017\n"
          + "\007updated\030\010 \001(\006\032W\n"
          + "\022VerificationsEntry\022\013\n"
          + "\003key\030\001 \001(\t\0220\n"
          + "\005value\030\002 \001(\0132!.services.connect.v1.Verification:\0028\001B\014\n\n"
          + "_fail_codeB\014\n\n"
          + "_result_vp\"\356\003\n"
          + "\014Verification\022\n\n"
          + "\002id\030\001 \001(\t\0223\n"
          + "\004type\030\002 \001(\0162%.services.connect.v1.VerificationType\0225\n"
          + "\005state\030\003 \001(\0162&.services.connect.v1.VerificationState\022A\n"
          + "\tfail_code\030\004"
          + " \001(\0162).services.connect.v1.VerificationFailCodeH\000\210\001\001\022\016\n"
          + "\006reused\030\005 \001(\010\022\r\n"
          + "\005begun\030\006 \001(\006\022\017\n"
          + "\007updated\030\007 \001(\006\022L\n"
          + "\025government_id_options\030\010 \001(\0132(.s"
          + "ervices.connect.v1.GovernmentIDOptionsH\001\210\001\001\022[\n"
          + "\035normalized_government_id_data\030\t \001"
          + "(\0132/.services.connect.v1.NormalizedGovernmentIdDataH\002\210\001\001B\014\n\n"
          + "_fail_codeB\030\n"
          + "\026_government_id_optionsB \n"
          + "\036_normalized_government_id_data\"\273\003\n"
          + "\032NormalizedGovernmentIdData\022 \n"
          + "\tid_number\030\001 \001(\tH\000R\010idNumber\210\001\001\022\"\n\n"
          + "given_name\030\002 \001(\tH\001R\tgivenName\210\001\001\022$\n"
          + "\013family_name\030\003 \001(\tH\002R\n"
          + "familyName\210\001\001\022\035\n"
          + "\007address\030\004 \001(\tH\003R\007address\210\001\001\022\'\n\r"
          + "date_of_birth\030\005 \001(\tH\004R\013dateOfBirth\210\001\001\022\035\n"
          + "\007country\030\006 \001(\tH\005R\007country\210\001\001\022\"\n\n"
          + "issue_date\030\007 \001(\tH\006R\tissueDate\210\001\001\022,\n"
          + "\017expiration_date\030\010 \001(\tH\007R\016expirationDate\210\001\001B\014\n\n"
          + "_id_numberB\r\n"
          + "\013_given_nameB\016\n"
          + "\014_family_nameB\n\n"
          + "\010_addressB\020\n"
          + "\016_date_of_birthB\n\n"
          + "\010_countryB\r\n"
          + "\013_issue_dateB\022\n"
          + "\020_expiration_date\"u\n"
          + "\020DemoRelyingParty\022!\n"
          + "\014display_name\030\001 \001(\tR\013displayName\022\031\n"
          + "\010logo_url\030\002 \001(\tR\007logoUrl\022#\n\r"
          + "primary_color\030\003 \001(\tR\014primaryColor\"\321\002\n"
          + "\024CreateSessionRequest\022A\n\r"
          + "verifications\030\001 \003(\0132*.services.connect.v1.RequestedVerification\022l\n"
          + "\021debug_information\030\002 \003(\0132?.services.connect.v1.Cre"
          + "ateSessionRequest.DebugInformationEntryR\020debugInformation\022C\n"
          + "\007demo_rp\030\003 \001(\0132%.ser"
          + "vices.connect.v1.DemoRelyingPartyH\000R\006demoRp\210\001\001\0327\n"
          + "\025DebugInformationEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001B\n\n"
          + "\010_demo_rp\"\242\001\n"
          + "\025RequestedVerification\0223\n"
          + "\004type\030\001 \001(\0162%.services.connect.v1.VerificationType\022I\n"
          + "\025government_id_options\030\002"
          + " \001(\0132(.services.connect.v1.GovernmentIDOptionsH\000B\t\n"
          + "\007options\"N\n"
          + "\023GovernmentIDOptions\0227\n"
          + "\006fields\030\001 \001(\0132\'.services.connect.v1.GovernmentIDFields\"\266\001\n"
          + "\022GovernmentIDFields\022\021\n"
          + "\tid_number\030\001 \001(\010\022\022\n\n"
          + "given_name\030\002 \001(\010\022\023\n"
          + "\013family_name\030\003 \001(\010\022\017\n"
          + "\007address\030\004 \001(\010\022\025\n\r"
          + "date_of_birth\030\005 \001(\010\022\017\n"
          + "\007country\030\006 \001(\010\022\022\n\n"
          + "issue_date\030\007 \001(\010\022\027\n"
          + "\017expiration_date\030\010 \001(\010\"I\n"
          + "\025CreateSessionResponse\0220\n"
          + "\007session\030\001 \001(\0132\037.services.connect.v1.IDVSession\".\n"
          + "\024CancelSessionRequest\022\026\n"
          + "\016idv_session_id\030\001 \001(\t\"I\n"
          + "\025CancelSessionResponse\0220\n"
          + "\007session\030\001 \001(\0132\037.services.connect.v1.IDVSession\"+\n"
          + "\021GetSessionRequest\022\026\n"
          + "\016idv_session_id\030\001 \001(\t\"F\n"
          + "\022GetSessionResponse\0220\n"
          + "\007session\030\001 \001(\0132\037.services.connect.v1.IDVSession\"\314\001\n"
          + "\023ListSessionsRequest\0226\n"
          + "\010order_by\030\001 \001(\0162$.services.connect.v1.SessionOrdering\022;\n"
          + "\017order_direction\030\002 \001(\0162\".services.common.v1.OrderDirection\022\026\n"
          + "\tpage_size\030\003 \001(\005H\000\210\001\001\022\021\n"
          + "\004page\030\004 \001(\005H\001\210\001\001B\014\n\n"
          + "_page_sizeB\007\n"
          + "\005_page\"f\n"
          + "\024ListSessionsResponse\0221\n"
          + "\010sessions\030\001 \003(\0132\037.services.connect.v1.IDVSession\022\r\n"
          + "\005total\030\002 \001(\005\022\014\n"
          + "\004more\030\003 \001(\010\"\275\001\n"
          + "\031HasValidCredentialRequest\022S\n"
          + "\010identity\030\001 \001(\0132A.services.universal"
          + "wallet.v1.CreateWalletRequest.ExternalIdentity\022K\n"
          + "\027credential_request_data\030\002 \001(\0132"
          + "*.services.connect.v1.CredentialRequestData\":\n"
          + "\032HasValidCredentialResponse\022\034\n"
          + "\024has_valid_credential\030\001 \001(\010\"L\n"
          + "\025CredentialRequestData\0223\n"
          + "\004type\030\001 \001(\0162%.services.connect.v1.VerificationType*%\n"
          + "\020VerificationType\022\021\n\r"
          + "GOVERNMENT_ID\020\000*\203\001\n"
          + "\017IDVSessionState\022\017\n"
          + "\013IDV_CREATED\020\000\022\021\n\r"
          + "IDV_INITIATED\020\001\022\026\n"
          + "\022IDV_AUTHENTICATING\020\002\022\023\n"
          + "\017IDV_IN_PROGRESS\020\003\022\017\n"
          + "\013IDV_SUCCESS\020\004\022\016\n\n"
          + "IDV_FAILED\020\005*\232\001\n"
          + "\021VerificationState\022\030\n"
          + "\024VERIFICATION_PENDING\020\000\022\036\n"
          + "\032VERIFICATION_PENDING_REUSE\020\001\022\030\n"
          + "\024VERIFICATION_STARTED\020\002\022\030\n"
          + "\024VERIFICATION_SUCCESS\020\003\022\027\n"
          + "\023VERIFICATION_FAILED\020\004*\342\001\n"
          + "\017SessionFailCode\022\025\n"
          + "\021SESSION_FAIL_NONE\020\000\022\031\n"
          + "\025SESSION_FAIL_INTERNAL\020\001\022$\n"
          + " SESSION_FAIL_VERIFICATION_FAILED\020\002\022\037\n"
          + "\033SESSION_FAIL_AUTHENTICATION\020\003\022\030\n"
          + "\024SESSION_FAIL_EXPIRED\020\004\022\036\n"
          + "\032SESSION_FAIL_USER_CANCELED\020\005\022\034\n"
          + "\030SESSION_FAIL_RP_CANCELED\020\006*\306\001\n"
          + "\024VerificationFailCode\022\032\n"
          + "\026VERIFICATION_FAIL_NONE\020\000\022\036\n"
          + "\032VERIFICATION_FAIL_INTERNAL\020\001\022#\n"
          + "\037VERIFICATION_FAIL_INVALID_IMAGE\020\002\022!\n"
          + "\035VERIFICATION_FAIL_INAUTHENTIC\020\003\022*\n"
          + "&VERIFICATION_FAIL_UNSUPPORTED_DOCUMENT\020\004*6\n"
          + "\017SessionOrdering\022\013\n"
          + "\007CREATED\020\000\022\013\n"
          + "\007UPDATED\020\001\022\t\n"
          + "\005STATE\020\0022\200\006\n"
          + "\007Connect\022\224\001\n\r"
          + "CreateSession\022).services.connect.v1.CreateSessionRequest\032*.service"
          + "s.connect.v1.CreateSessionResponse\",\212\246\035\004"
          + "*\002\010\001\202\323\344\223\002\036\"\031/v1/connect/createsession:\001*\022\224\001\n\r"
          + "CancelSession\022).services.connect.v1.CancelSessionRequest\032*.services.connect"
          + ".v1.CancelSessionResponse\",\212\246\035\004*\002\010\001\202\323\344\223\002\036\"\031/v1/connect/cancelsession:\001*\022\210\001\n\n"
          + "GetSession\022&.services.connect.v1.GetSessionR"
          + "equest\032\'.services.connect.v1.GetSessionR"
          + "esponse\")\212\246\035\004*\002\010\001\202\323\344\223\002\033\"\026/v1/connect/getsession:\001*\022\220\001\n"
          + "\014ListSessions\022(.services.connect.v1.ListSessionsRequest\032).services"
          + ".connect.v1.ListSessionsResponse\"+\212\246\035\004*\002"
          + "\010\001\202\323\344\223\002\035\"\030/v1/connect/listsessions:\001*\022\250\001\n"
          + "\022HasValidCredential\022..services.connect."
          + "v1.HasValidCredentialRequest\032/.services."
          + "connect.v1.HasValidCredentialResponse\"1\212"
          + "\246\035\004*\002\010\001\202\323\344\223\002#\"\036/v1/connect/hasvalidcredential:\001*BZ\n"
          + "\033trinsic.services.connect.v1P"
          + "\001Z\033services/connect/v1/connect\252\002\033Trinsic.Services.Connect.V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              trinsic.services.common.v1.Common.getDescriptor(),
              trinsic.services.universalwallet.v1.UniversalWalletOuterClass.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              trinsic.services.protobuf.options.FieldOptions.getDescriptor(),
            });
    internal_static_services_connect_v1_IDVSession_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_services_connect_v1_IDVSession_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_IDVSession_descriptor,
            new java.lang.String[] {
              "Id",
              "ClientToken",
              "State",
              "Verifications",
              "FailCode",
              "ResultVp",
              "Created",
              "Updated",
              "FailCode",
              "ResultVp",
            });
    internal_static_services_connect_v1_IDVSession_VerificationsEntry_descriptor =
        internal_static_services_connect_v1_IDVSession_descriptor.getNestedTypes().get(0);
    internal_static_services_connect_v1_IDVSession_VerificationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_IDVSession_VerificationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_services_connect_v1_Verification_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_services_connect_v1_Verification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_Verification_descriptor,
            new java.lang.String[] {
              "Id",
              "Type",
              "State",
              "FailCode",
              "Reused",
              "Begun",
              "Updated",
              "GovernmentIdOptions",
              "NormalizedGovernmentIdData",
              "FailCode",
              "GovernmentIdOptions",
              "NormalizedGovernmentIdData",
            });
    internal_static_services_connect_v1_NormalizedGovernmentIdData_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_services_connect_v1_NormalizedGovernmentIdData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_NormalizedGovernmentIdData_descriptor,
            new java.lang.String[] {
              "IdNumber",
              "GivenName",
              "FamilyName",
              "Address",
              "DateOfBirth",
              "Country",
              "IssueDate",
              "ExpirationDate",
              "IdNumber",
              "GivenName",
              "FamilyName",
              "Address",
              "DateOfBirth",
              "Country",
              "IssueDate",
              "ExpirationDate",
            });
    internal_static_services_connect_v1_DemoRelyingParty_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_services_connect_v1_DemoRelyingParty_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_DemoRelyingParty_descriptor,
            new java.lang.String[] {
              "DisplayName", "LogoUrl", "PrimaryColor",
            });
    internal_static_services_connect_v1_CreateSessionRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_services_connect_v1_CreateSessionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_CreateSessionRequest_descriptor,
            new java.lang.String[] {
              "Verifications", "DebugInformation", "DemoRp", "DemoRp",
            });
    internal_static_services_connect_v1_CreateSessionRequest_DebugInformationEntry_descriptor =
        internal_static_services_connect_v1_CreateSessionRequest_descriptor.getNestedTypes().get(0);
    internal_static_services_connect_v1_CreateSessionRequest_DebugInformationEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_CreateSessionRequest_DebugInformationEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_services_connect_v1_RequestedVerification_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_services_connect_v1_RequestedVerification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_RequestedVerification_descriptor,
            new java.lang.String[] {
              "Type", "GovernmentIdOptions", "Options",
            });
    internal_static_services_connect_v1_GovernmentIDOptions_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_services_connect_v1_GovernmentIDOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_GovernmentIDOptions_descriptor,
            new java.lang.String[] {
              "Fields",
            });
    internal_static_services_connect_v1_GovernmentIDFields_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_services_connect_v1_GovernmentIDFields_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_GovernmentIDFields_descriptor,
            new java.lang.String[] {
              "IdNumber",
              "GivenName",
              "FamilyName",
              "Address",
              "DateOfBirth",
              "Country",
              "IssueDate",
              "ExpirationDate",
            });
    internal_static_services_connect_v1_CreateSessionResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_services_connect_v1_CreateSessionResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_CreateSessionResponse_descriptor,
            new java.lang.String[] {
              "Session",
            });
    internal_static_services_connect_v1_CancelSessionRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_services_connect_v1_CancelSessionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_CancelSessionRequest_descriptor,
            new java.lang.String[] {
              "IdvSessionId",
            });
    internal_static_services_connect_v1_CancelSessionResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_services_connect_v1_CancelSessionResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_CancelSessionResponse_descriptor,
            new java.lang.String[] {
              "Session",
            });
    internal_static_services_connect_v1_GetSessionRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_services_connect_v1_GetSessionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_GetSessionRequest_descriptor,
            new java.lang.String[] {
              "IdvSessionId",
            });
    internal_static_services_connect_v1_GetSessionResponse_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_services_connect_v1_GetSessionResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_GetSessionResponse_descriptor,
            new java.lang.String[] {
              "Session",
            });
    internal_static_services_connect_v1_ListSessionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_services_connect_v1_ListSessionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_ListSessionsRequest_descriptor,
            new java.lang.String[] {
              "OrderBy", "OrderDirection", "PageSize", "Page", "PageSize", "Page",
            });
    internal_static_services_connect_v1_ListSessionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_services_connect_v1_ListSessionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_ListSessionsResponse_descriptor,
            new java.lang.String[] {
              "Sessions", "Total", "More",
            });
    internal_static_services_connect_v1_HasValidCredentialRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_services_connect_v1_HasValidCredentialRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_HasValidCredentialRequest_descriptor,
            new java.lang.String[] {
              "Identity", "CredentialRequestData",
            });
    internal_static_services_connect_v1_HasValidCredentialResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_services_connect_v1_HasValidCredentialResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_HasValidCredentialResponse_descriptor,
            new java.lang.String[] {
              "HasValidCredential",
            });
    internal_static_services_connect_v1_CredentialRequestData_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_services_connect_v1_CredentialRequestData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_connect_v1_CredentialRequestData_descriptor,
            new java.lang.String[] {
              "Type",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(trinsic.services.protobuf.options.FieldOptions.sdkTemplateOption);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    trinsic.services.common.v1.Common.getDescriptor();
    trinsic.services.universalwallet.v1.UniversalWalletOuterClass.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    trinsic.services.protobuf.options.FieldOptions.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
