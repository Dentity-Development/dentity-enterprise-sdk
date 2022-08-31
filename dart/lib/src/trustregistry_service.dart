import 'package:grpc/service_api.dart' as $grpc;
import 'package:trinsic_dart/src/proto/sdk/options/v1/options.pb.dart';
import 'package:trinsic_dart/src/proto/services/trust-registry/v1/trust-registry.pbgrpc.dart';
import 'package:trinsic_dart/src/service_base.dart';

class TrustRegistryService extends ServiceBase {
  late TrustRegistryClient client;

  TrustRegistryService(ServiceOptions? serverOptions) : super(serverOptions) {
    client = TrustRegistryClient(super.channel);
  }
  Future<SearchRegistryResponse> search(
      {SearchRegistryRequest? request}) async {
    request ??= SearchRegistryRequest();
    if (request.query == "") {
      request.query = "SELECT * FROM c OFFSET 0 LIMIT 100";
    }
    return await searchRegistry(request);
  }
// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: C:\work\sdk\dart\lib\src\trustregistry_service.dart

  Future<AddFrameworkResponse> addFramework(AddFrameworkRequest request) async {
    ///  Add a governance framework to the ecosystem
    return await client.addFramework(request,
        options: buildMetadata(request: request));
  }

  Future<RemoveFrameworkResponse> removeFramework(
      RemoveFrameworkRequest request) async {
    ///  Remove a governance framework from the ecosystem
    return await client.removeFramework(request,
        options: buildMetadata(request: request));
  }

  Future<SearchRegistryResponse> searchRegistry(
      SearchRegistryRequest request) async {
    ///  Search the ecosystem's governance frameworks
    return await client.searchRegistry(request,
        options: buildMetadata(request: request));
  }

  Future<RegisterMemberResponse> registerMember(
      RegisterMemberRequest request) async {
    ///  Register an authoritative issuer for a credential schema
    return await client.registerMember(request,
        options: buildMetadata(request: request));
  }

  Future<UnregisterMemberResponse> unregisterMember(
      UnregisterMemberRequest request) async {
    ///  Removes an authoritative issuer for a credential schema from the trust registry
    return await client.unregisterMember(request,
        options: buildMetadata(request: request));
  }

  Future<GetMembershipStatusResponse> getMembershipStatus(
      GetMembershipStatusRequest request) async {
    ///  Fetch the membership status of an issuer for a given credential schema in a trust registry
    return await client.getMembershipStatus(request,
        options: buildMetadata(request: request));
  }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
