import 'package:trinsic_dart/src/proto/sdk/options/v1/options.pb.dart';
import 'package:trinsic_dart/src/proto/services/universal-wallet/v1/universal-wallet.pbgrpc.dart';
import 'package:trinsic_dart/src/service_base.dart';
import 'package:trinsic_dart/src/storage/token_provider.dart';

class WalletService extends ServiceBase {
  late UniversalWalletClient client;

  WalletService(ServiceOptions? serverOptions, ITokenProvider? tokenProvider)
      : super(serverOptions, tokenProvider) {
    client = UniversalWalletClient(super.channel);
  }

  Future<SearchResponse> searchWallet(SearchRequest request) async {
    if (request.query == "") {
      request.query = "SELECT c.id, c.type, c.data FROM c OFFSET 0 LIMIT 100";
    }
    return await search(request);
  }
// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: D:\trinsic\sdk\dart\lib\src\wallet_service.dart

  Future<GetItemResponse> getItem(GetItemRequest request) async {
    ///  Retrieve an item from the wallet with a given item identifier

    return client.getItem(request,
        options: await buildMetadata(request: request));
  }

  Future<SearchResponse> search(SearchRequest request) async {
    ///  Search the wallet using a SQL syntax

    return client.search(request,
        options: await buildMetadata(request: request));
  }

  Future<InsertItemResponse> insertItem(InsertItemRequest request) async {
    ///  Insert an item into the wallet

    return client.insertItem(request,
        options: await buildMetadata(request: request));
  }

  Future<UpdateItemResponse> updateItem(UpdateItemRequest request) async {
    ///  Update an item in the wallet

    return client.updateItem(request,
        options: await buildMetadata(request: request));
  }

  Future<DeleteItemResponse> deleteItem(DeleteItemRequest request) async {
    ///  Delete an item from the wallet permanently

    return client.deleteItem(request,
        options: await buildMetadata(request: request));
  }

  Future<DeleteWalletResponse> deleteWallet(DeleteWalletRequest request) async {
    ///  Delete a wallet and its credentials

    return client.deleteWallet(request,
        options: await buildMetadata(request: request));
  }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
