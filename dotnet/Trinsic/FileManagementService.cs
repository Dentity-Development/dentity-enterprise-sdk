using System;
using System.Threading.Tasks;
using Trinsic.Sdk.Options.V1;
using Trinsic.Services.FileManagement.V1;

namespace Trinsic;

public class FileManagementService : ServiceBase
{
    public FileManagementService(TrinsicOptions options)
        : base(options) {
        Client = new(Channel);
    }

    /// <summary>
    /// Gets the underlying grpc client
    /// </summary>
    private FileManagement.FileManagementClient Client { get; }

    // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    // target: C:\work\sdk\dotnet\Trinsic\FileManagementService.cs

    /// <summary>
    ///This method is experimental
    ///  Upload a file to Trinsic's CDN
    /// </summary>
    [Obsolete("This method is experimental")]
    public UploadFileResponse UploadFile(UploadFileRequest request) {

        return Client.UploadFile(request, BuildMetadata(request));
    }

    /// <summary>
    ///This method is experimental
    ///  Upload a file to Trinsic's CDN
    /// </summary>
    [Obsolete("This method is experimental")]
    public async Task<UploadFileResponse> UploadFileAsync(UploadFileRequest request) {

        return await Client.UploadFileAsync(request, await BuildMetadataAsync(request));
    }

    /// <summary>
    ///This method is experimental
    ///  Fetch information about a file by its ID
    /// </summary>
    [Obsolete("This method is experimental")]
    public GetFileResponse GetFile(GetFileRequest request) {

        return Client.GetFile(request, BuildMetadata(request));
    }

    /// <summary>
    ///This method is experimental
    ///  Fetch information about a file by its ID
    /// </summary>
    [Obsolete("This method is experimental")]
    public async Task<GetFileResponse> GetFileAsync(GetFileRequest request) {

        return await Client.GetFileAsync(request, await BuildMetadataAsync(request));
    }

    /// <summary>
    ///This method is experimental
    ///  Delete a file by its ID
    /// </summary>
    [Obsolete("This method is experimental")]
    public DeleteFileResponse DeleteFile(DeleteFileRequest request) {

        return Client.DeleteFile(request, BuildMetadata(request));
    }

    /// <summary>
    ///This method is experimental
    ///  Delete a file by its ID
    /// </summary>
    [Obsolete("This method is experimental")]
    public async Task<DeleteFileResponse> DeleteFileAsync(DeleteFileRequest request) {

        return await Client.DeleteFileAsync(request, await BuildMetadataAsync(request));
    }

    /// <summary>
    ///This method is experimental
    ///  List files the calling account has uploaded
    /// </summary>
    [Obsolete("This method is experimental")]
    public ListFilesResponse ListFiles(ListFilesRequest request) {

        return Client.ListFiles(request, BuildMetadata(request));
    }

    /// <summary>
    ///This method is experimental
    ///  List files the calling account has uploaded
    /// </summary>
    [Obsolete("This method is experimental")]
    public async Task<ListFilesResponse> ListFilesAsync(ListFilesRequest request) {

        return await Client.ListFilesAsync(request, await BuildMetadataAsync(request));
    }

    /// <summary>
    ///This method is experimental
    ///  Get statistics about files uploaded by the calling account
    /// </summary>
    [Obsolete("This method is experimental")]
    public GetStorageStatsResponse GetStorageStats() {
        var request = new GetStorageStatsRequest();
        return Client.GetStorageStats(request, BuildMetadata(request));
    }

    /// <summary>
    ///This method is experimental
    ///  Get statistics about files uploaded by the calling account
    /// </summary>
    [Obsolete("This method is experimental")]
    public async Task<GetStorageStatsResponse> GetStorageStatsAsync() {
        var request = new GetStorageStatsRequest();
        return await Client.GetStorageStatsAsync(request, await BuildMetadataAsync(request));
    }

    // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}