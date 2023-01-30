import 'package:trinsic_dart/src/proto/sdk/options/v1/options.pb.dart';
import 'package:trinsic_dart/src/proto/services/provider/v1/access-management.pbgrpc.dart';
import 'package:trinsic_dart/src/service_base.dart';
import 'package:trinsic_dart/src/storage/token_provider.dart';

class AccessManagementService extends ServiceBase {
  late AccessManagementClient client;

  AccessManagementService(
      ServiceOptions? serverOptions, ITokenProvider? tokenProvider)
      : super(serverOptions, tokenProvider) {
    client = AccessManagementClient(super.channel);
  }
// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: C:\work\sdk\dart\lib\src\access_management_service.dart

    
    Future<AddRoleAssignmentResponse> addRoleAssignment(AddRoleAssignmentRequest request) async {
         ///  Adds a role assignment to an account
        
        return client.addRoleAssignment(request, options: await buildMetadata(request: request));
    }
    @Deprecated('This method is deprecated')
    Future<RemoveRoleAssignmentResponse> removeRoleAssignment(RemoveRoleAssignmentRequest request) async {
         /// This method is DEPRECATED
/// Removes a role assignment from the account
        
        return client.removeRoleAssignment(request, options: await buildMetadata(request: request));
    }
    @Deprecated('This method is experimental')
    Future<ListRoleAssignmentsResponse> listRoleAssignments(ListRoleAssignmentsRequest request) async {
         /// This method is EXPERIMENTAL
/// List the role assignments for the given account
        
        return client.listRoleAssignments(request, options: await buildMetadata(request: request));
    }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
