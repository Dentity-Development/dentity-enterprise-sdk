using System.Threading.Tasks;
using Microsoft.Extensions.Options;
using Trinsic.Sdk.Options.V1;
using Trinsic.Services.FileManagement.V1;

namespace Trinsic;

public class FileManagementService : ServiceBase
{
    public FileManagementService(ServiceOptions options)
        : base(options) {
        Client = new(Channel);
    }

    public FileManagementService() {
        Client = new(Channel);
    }

    internal FileManagementService(ITokenProvider tokenProvider) : base(new(), tokenProvider) {
        Client = new(Channel);
    }

    internal FileManagementService(ITokenProvider tokenProvider, IOptions<ServiceOptions> options)
        : base(options.Value, tokenProvider) {
        Client = new(Channel);
    }

    /// <summary>
    /// Gets the underlying grpc client
    /// </summary>
    private FileManagement.FileManagementClient Client { get; }

// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: D:\trinsic\sdk\dotnet\Trinsic\FileManagementService.cs

	/// <summary>
    /// Upload a file to Trinsic's CDN
    /// </summary>	
    public UploadFileResponse UploadFile(UploadFileRequest request) {
        
        return Client.UploadFile(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// Upload a file to Trinsic's CDN
    /// </summary>	
    public async Task<UploadFileResponse> UploadFileAsync(UploadFileRequest request) {
        
        return await Client.UploadFileAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    /// Fetch information about a file by its ID
    /// </summary>	
    public GetFileResponse GetFile(GetFileRequest request) {
        
        return Client.GetFile(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// Fetch information about a file by its ID
    /// </summary>	
    public async Task<GetFileResponse> GetFileAsync(GetFileRequest request) {
        
        return await Client.GetFileAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    /// Delete a file by its ID
    /// </summary>	
    public DeleteFileResponse DeleteFile(DeleteFileRequest request) {
        
        return Client.DeleteFile(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// Delete a file by its ID
    /// </summary>	
    public async Task<DeleteFileResponse> DeleteFileAsync(DeleteFileRequest request) {
        
        return await Client.DeleteFileAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    /// List files the calling account has uploaded
    /// </summary>	
    public ListFilesResponse ListFiles(ListFilesRequest request) {
        
        return Client.ListFiles(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// List files the calling account has uploaded
    /// </summary>	
    public async Task<ListFilesResponse> ListFilesAsync(ListFilesRequest request) {
        
        return await Client.ListFilesAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    /// Get statistics about files uploaded by the calling account
    /// </summary>	
    public GetStorageStatsResponse GetStorageStats(GetStorageStatsRequest request) {
        
        return Client.GetStorageStats(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// Get statistics about files uploaded by the calling account
    /// </summary>	
    public async Task<GetStorageStatsResponse> GetStorageStatsAsync(GetStorageStatsRequest request) {
        
        return await Client.GetStorageStatsAsync(request, await BuildMetadataAsync(request));
    }

// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}