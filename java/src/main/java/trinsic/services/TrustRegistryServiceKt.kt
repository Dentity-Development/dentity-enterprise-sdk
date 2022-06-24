package trinsic.services

import com.google.protobuf.InvalidProtocolBufferException
import java.net.MalformedURLException
import java.net.URL
import java.util.concurrent.ExecutionException
import kotlinx.coroutines.flow.Flow
import trinsic.okapi.DidException
import trinsic.sdk.options.v1.Options
import trinsic.services.trustregistry.v1.TrustRegistryGrpcKt
import trinsic.services.trustregistry.v1.TrustRegistryOuterClass.*

class TrustRegistryServiceKt(options: Options.ServiceOptions.Builder?) : ServiceBase(options) {
  var stub = TrustRegistryGrpcKt.TrustRegistryCoroutineStub(this.channel)

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun addFramework(request: AddFrameworkRequest): AddFrameworkResponse {
    try {
      URL(request.governanceFrameworkUri)
    } catch (e: MalformedURLException) {
      throw IllegalArgumentException("invalid uri string", e)
    }
    return withMetadata(stub, request).addFramework(request)
  }

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun searchRegistry(): SearchRegistryResponse {
    return searchRegistry(SearchRegistryRequest.getDefaultInstance())
  }

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun searchRegistry(request: SearchRegistryRequest): SearchRegistryResponse {
    var request2 = request
    if (request2.query.isBlank())
        request2 =
            SearchRegistryRequest.newBuilder(request2)
                .setQuery("SELECT * FROM c OFFSET 0 LIMIT 100")
                .build()
    return withMetadata(stub, request2).searchRegistry(request2)
  }

// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: ..\sdk\java\src\main\java\trinsic\services\trustregistryServiceKt.kt

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun removeFramework(request: RemoveFrameworkRequest): RemoveFrameworkResponse {
	
    // TODO - Support metadata anonymous
    return withMetadata(stub, request).removeFramework(request)
  }

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun registerMember(request: RegisterMemberRequest): RegisterMemberResponse {
	 /**  Registers an authoritative issuer with a credential template
*/
    // TODO - Support metadata anonymous
    return withMetadata(stub, request).registerMember(request)
  }

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun unregisterMember(request: UnregisterMemberRequest): UnregisterMemberResponse {
	 /**  Removes an authoritative issuer with a credential template from the trust registry
*/
    // TODO - Support metadata anonymous
    return withMetadata(stub, request).unregisterMember(request)
  }

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun getMembershipStatus(request: GetMembershipStatusRequest): GetMembershipStatusResponse {
	
    // TODO - Support metadata anonymous
    return withMetadata(stub, request).getMembershipStatus(request)
  }

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun fetchData(request: FetchDataRequest): Flow<FetchDataResponse> {
	
    // TODO - Support metadata anonymous
    return withMetadata(stub, request).fetchData(request)
  }

// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
