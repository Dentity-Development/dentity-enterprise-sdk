package trinsic.services

import com.google.protobuf.InvalidProtocolBufferException
import java.util.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import trinsic.okapi.DidException
import trinsic.sdk.options.v1.Options
import trinsic.services.provider.v1.*

class ProviderServiceKt(options: Options.TrinsicOptions.Builder?) : ServiceBase(options) {
  var stub = ProviderGrpcKt.ProviderCoroutineStub(this.channel)

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun createEcosystem(request: CreateEcosystemRequest): CreateEcosystemResponse {
    val response: CreateEcosystemResponse =
        if (request.name.isNullOrBlank() && request.details.email.isNullOrBlank()) {
          stub.createEcosystem(request)
        } else {
          withMetadata(stub, request).createEcosystem(request)
        }
    val token = Base64.getUrlEncoder().encodeToString(response.profile.toByteArray())
    this.setAuthToken(token)
    return response
  }
  // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
  // target: /home/runner/work/sdk/sdk/java/src/main/java/trinsic/services/ProviderServiceKt.kt

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  @Deprecated("This will be removed May 1, 2023")
  suspend fun updateEcosystem(request: UpdateEcosystemRequest): UpdateEcosystemResponse {
    /** This will be removed May 1, 2023 Update an existing ecosystem */
    return withMetadata(stub, request).updateEcosystem(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun ecosystemInfo(request: EcosystemInfoRequest): EcosystemInfoResponse {
    /** Get ecosystem information */
    return withMetadata(stub, request).ecosystemInfo(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  @Deprecated("This will be removed May 1, 2023")
  suspend fun getPublicEcosystemInfo(
      request: GetPublicEcosystemInfoRequest
  ): GetPublicEcosystemInfoResponse {
    /** This will be removed May 1, 2023 Get public ecosystem information about *any* ecosystem */
    return withMetadata(stub, request).getPublicEcosystemInfo(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun getOberonKey(): GetOberonKeyResponse {
    /** Returns the public key being used to create/verify oberon tokens */
    val request = GetOberonKeyRequest.newBuilder().build()
    return withMetadata(stub, request).getOberonKey(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun upgradeDID(request: UpgradeDidRequest): UpgradeDidResponse {
    /** Upgrade a wallet's DID from `did:key` to another method */
    return withMetadata(stub, request).upgradeDID(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun retrieveDomainVerificationRecord(): RetrieveDomainVerificationRecordResponse {
    /** Retrieve a random hash TXT that can be used to verify domain ownership */
    val request = RetrieveDomainVerificationRecordRequest.newBuilder().build()
    return withMetadata(stub, request).retrieveDomainVerificationRecord(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun refreshDomainVerificationStatus(): RefreshDomainVerificationStatusResponse {
    /** Call to verify domain */
    val request = RefreshDomainVerificationStatusRequest.newBuilder().build()
    return withMetadata(stub, request).refreshDomainVerificationStatus(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun searchWalletConfigurations(
      request: SearchWalletConfigurationsRequest
  ): SearchWalletConfigurationResponse {
    /** Search for issuers/providers/verifiers in the current ecosystem */
    return withMetadata(stub, request).searchWalletConfigurations(request)
  }
  // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
