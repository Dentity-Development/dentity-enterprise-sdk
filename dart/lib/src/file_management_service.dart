import 'package:trinsic_dart/src/proto/sdk/options/v1/options.pb.dart';
import 'package:trinsic_dart/src/proto/services/file-management/v1/file-management.pbgrpc.dart';
import 'package:trinsic_dart/src/service_base.dart';
import 'package:trinsic_dart/src/storage/token_provider.dart';

class FileManagementService extends ServiceBase {
  late FileManagementClient client;

  FileManagementService(
      ServiceOptions? serverOptions, ITokenProvider? tokenProvider)
      : super(serverOptions, tokenProvider) {
    client = FileManagementClient(super.channel);
  }
// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: D:\trinsic\sdk\dart\lib\src\file_management_service.dart

  Future<UploadFileResponse> uploadFile(UploadFileRequest request) async {
    ///  Upload a file to Trinsic's CDN

    return client.uploadFile(request,
        options: await buildMetadata(request: request));
  }

  Future<GetFileResponse> getFile(GetFileRequest request) async {
    ///  Fetch information about a file by its ID

    return client.getFile(request,
        options: await buildMetadata(request: request));
  }

  Future<DeleteFileResponse> deleteFile(DeleteFileRequest request) async {
    ///  Delete a file by its ID

    return client.deleteFile(request,
        options: await buildMetadata(request: request));
  }

  Future<ListFilesResponse> listFiles(ListFilesRequest request) async {
    ///  List files the calling account has uploaded

    return client.listFiles(request,
        options: await buildMetadata(request: request));
  }

  Future<GetStorageStatsResponse> getStorageStats(
      GetStorageStatsRequest request) async {
    ///  Get statistics about files uploaded by the calling account

    return client.getStorageStats(request,
        options: await buildMetadata(request: request));
  }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}