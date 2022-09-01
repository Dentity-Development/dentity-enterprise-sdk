using System.Threading.Tasks;
using Google.Protobuf.WellKnownTypes;
using Microsoft.Extensions.Options;
using Trinsic.Sdk.Options.V1;
using Trinsic.Services.Debug.V1;

namespace Trinsic;

public class DebugService : ServiceBase
{
    public DebugService(ServiceOptions options)
        : base(options) {
        Client = new(Channel);
    }

    public DebugService() {
        Client = new(Channel);
    }

    internal DebugService(ITokenProvider tokenProvider) : base(new(), tokenProvider) {
        Client = new(Channel);
    }

    internal DebugService(ITokenProvider tokenProvider, IOptions<ServiceOptions> options)
        : base(options.Value, tokenProvider) {
        Client = new(Channel);
    }

    private Debugging.DebuggingClient Client { get; }

// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: /home/runner/work/sdk/sdk/dotnet/Trinsic/DebugService.cs

		
    public Empty CallEmpty(Empty request) {
        return Client.CallEmpty(request, BuildMetadata(request));
    }
	
		
    public async Task<Empty> CallEmptyAsync(Empty request) {
        return await Client.CallEmptyAsync(request, await BuildMetadataAsync(request));
    }

		
    public Empty CallEmptyAuth(Empty request) {
        return Client.CallEmptyAuth(request, BuildMetadata(request));
    }
	
		
    public async Task<Empty> CallEmptyAuthAsync(Empty request) {
        return await Client.CallEmptyAuthAsync(request, await BuildMetadataAsync(request));
    }

// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}