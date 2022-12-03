using System.Threading.Tasks;
using Microsoft.Extensions.Options;
using Trinsic.Sdk.Options.V1;
using Trinsic.Services.Provider.V1;

namespace Trinsic;

public class AccessManagementService : ServiceBase
{
    public AccessManagementService(ServiceOptions options)
        : base(options) {
        Client = new(Channel);
    }

    public AccessManagementService() {
        Client = new(Channel);
    }

    internal AccessManagementService(ITokenProvider tokenProvider) : base(new(), tokenProvider) {
        Client = new(Channel);
    }

    internal AccessManagementService(ITokenProvider tokenProvider, IOptions<ServiceOptions> options)
        : base(options.Value, tokenProvider) {
        Client = new(Channel);
    }

    /// <summary>
    /// Gets the underlying grpc client
    /// </summary>
    private AccessManagement.AccessManagementClient Client { get; }

// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: /home/runner/work/sdk/sdk/dotnet/Trinsic/AccessManagementService.cs

	/// <summary>
    /// Adds a role assignment to an account
    /// </summary>	
    public AddRoleAssignmentResponse AddRoleAssignment(AddRoleAssignmentRequest request) {
        
        return Client.AddRoleAssignment(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// Adds a role assignment to an account
    /// </summary>	
    public async Task<AddRoleAssignmentResponse> AddRoleAssignmentAsync(AddRoleAssignmentRequest request) {
        
        return await Client.AddRoleAssignmentAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    /// Removes a role assignment from the account
    /// </summary>	
    public RemoveRoleAssignmentResponse RemoveRoleAssignment(RemoveRoleAssignmentRequest request) {
        
        return Client.RemoveRoleAssignment(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// Removes a role assignment from the account
    /// </summary>	
    public async Task<RemoveRoleAssignmentResponse> RemoveRoleAssignmentAsync(RemoveRoleAssignmentRequest request) {
        
        return await Client.RemoveRoleAssignmentAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    /// List the role assignments for the given account
    /// </summary>	
    public ListRoleAssignmentsResponse ListRoleAssignments(ListRoleAssignmentsRequest request) {
        
        return Client.ListRoleAssignments(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// List the role assignments for the given account
    /// </summary>	
    public async Task<ListRoleAssignmentsResponse> ListRoleAssignmentsAsync(ListRoleAssignmentsRequest request) {
        
        return await Client.ListRoleAssignmentsAsync(request, await BuildMetadataAsync(request));
    }

// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}