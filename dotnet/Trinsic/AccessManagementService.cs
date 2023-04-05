using System;
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

    /// <summary>
    /// Gets the underlying grpc client
    /// </summary>
    private AccessManagement.AccessManagementClient Client { get; }

// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: /home/runner/work/sdk/sdk/dotnet/Trinsic/AccessManagementService.cs

	/// <summary>
    ///This method is experimental
    ///  Adds a role assignment to an account
    /// </summary>
    [Obsolete("This method is experimental")]
    public AddRoleAssignmentResponse AddRoleAssignment(AddRoleAssignmentRequest request) {
        
        return Client.AddRoleAssignment(request, BuildMetadata(request));
    }
	
	/// <summary>
    ///This method is experimental
    ///  Adds a role assignment to an account
    /// </summary>
    [Obsolete("This method is experimental")]
    public async Task<AddRoleAssignmentResponse> AddRoleAssignmentAsync(AddRoleAssignmentRequest request) {
        
        return await Client.AddRoleAssignmentAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    ///This method is experimental
    ///  Removes a role assignment from the account
    /// </summary>
    [Obsolete("This method is experimental")]
    public RemoveRoleAssignmentResponse RemoveRoleAssignment(RemoveRoleAssignmentRequest request) {
        
        return Client.RemoveRoleAssignment(request, BuildMetadata(request));
    }
	
	/// <summary>
    ///This method is experimental
    ///  Removes a role assignment from the account
    /// </summary>
    [Obsolete("This method is experimental")]
    public async Task<RemoveRoleAssignmentResponse> RemoveRoleAssignmentAsync(RemoveRoleAssignmentRequest request) {
        
        return await Client.RemoveRoleAssignmentAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    ///This method is experimental
    ///  List the role assignments for the given account
    /// </summary>
    [Obsolete("This method is experimental")]
    public ListRoleAssignmentsResponse ListRoleAssignments(ListRoleAssignmentsRequest request) {
        
        return Client.ListRoleAssignments(request, BuildMetadata(request));
    }
	
	/// <summary>
    ///This method is experimental
    ///  List the role assignments for the given account
    /// </summary>
    [Obsolete("This method is experimental")]
    public async Task<ListRoleAssignmentsResponse> ListRoleAssignmentsAsync(ListRoleAssignmentsRequest request) {
        
        return await Client.ListRoleAssignmentsAsync(request, await BuildMetadataAsync(request));
    }

// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}