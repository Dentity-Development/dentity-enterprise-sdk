package trinsic.services.provider.v1

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.Deprecated
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import trinsic.services.provider.v1.ProviderGrpc.getServiceDescriptor

/** Holder for Kotlin coroutine-based client and server APIs for services.provider.v1.Provider. */
object ProviderGrpcKt {
  const val SERVICE_NAME: String = ProviderGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = ProviderGrpc.getServiceDescriptor()

  val createEcosystemMethod: MethodDescriptor<CreateEcosystemRequest, CreateEcosystemResponse>
    @JvmStatic get() = ProviderGrpc.getCreateEcosystemMethod()

  val updateEcosystemMethod: MethodDescriptor<UpdateEcosystemRequest, UpdateEcosystemResponse>
    @JvmStatic get() = ProviderGrpc.getUpdateEcosystemMethod()

  val getOberonKeyMethod: MethodDescriptor<GetOberonKeyRequest, GetOberonKeyResponse>
    @JvmStatic get() = ProviderGrpc.getGetOberonKeyMethod()

  val upgradeDIDMethod: MethodDescriptor<UpgradeDidRequest, UpgradeDidResponse>
    @JvmStatic get() = ProviderGrpc.getUpgradeDIDMethod()

  val retrieveDomainVerificationRecordMethod:
      MethodDescriptor<
          RetrieveDomainVerificationRecordRequest, RetrieveDomainVerificationRecordResponse>
    @JvmStatic get() = ProviderGrpc.getRetrieveDomainVerificationRecordMethod()

  val refreshDomainVerificationStatusMethod:
      MethodDescriptor<
          RefreshDomainVerificationStatusRequest, RefreshDomainVerificationStatusResponse>
    @JvmStatic get() = ProviderGrpc.getRefreshDomainVerificationStatusMethod()

  val searchWalletConfigurationsMethod:
      MethodDescriptor<SearchWalletConfigurationsRequest, SearchWalletConfigurationResponse>
    @JvmStatic get() = ProviderGrpc.getSearchWalletConfigurationsMethod()

  /**
   * A stub for issuing RPCs to a(n) services.provider.v1.Provider service as suspending coroutines.
   */
  @StubFor(ProviderGrpc::class)
  class ProviderCoroutineStub
  @JvmOverloads
  constructor(channel: Channel, callOptions: CallOptions = DEFAULT) :
      AbstractCoroutineStub<ProviderCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ProviderCoroutineStub =
        ProviderCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes with
     * [`Status.OK`][Status]. If the RPC completes with another status, a corresponding
     * [StatusException] is thrown. If this coroutine is cancelled, the RPC is also cancelled with
     * the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request. Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun createEcosystem(
        request: CreateEcosystemRequest,
        headers: Metadata = Metadata()
    ): CreateEcosystemResponse =
        unaryRpc(channel, ProviderGrpc.getCreateEcosystemMethod(), request, callOptions, headers)
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes with
     * [`Status.OK`][Status]. If the RPC completes with another status, a corresponding
     * [StatusException] is thrown. If this coroutine is cancelled, the RPC is also cancelled with
     * the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request. Most users will not need this.
     *
     * @return The single response from the server.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    suspend fun updateEcosystem(
        request: UpdateEcosystemRequest,
        headers: Metadata = Metadata()
    ): UpdateEcosystemResponse =
        unaryRpc(channel, ProviderGrpc.getUpdateEcosystemMethod(), request, callOptions, headers)
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes with
     * [`Status.OK`][Status]. If the RPC completes with another status, a corresponding
     * [StatusException] is thrown. If this coroutine is cancelled, the RPC is also cancelled with
     * the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request. Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun getOberonKey(
        request: GetOberonKeyRequest,
        headers: Metadata = Metadata()
    ): GetOberonKeyResponse =
        unaryRpc(channel, ProviderGrpc.getGetOberonKeyMethod(), request, callOptions, headers)
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes with
     * [`Status.OK`][Status]. If the RPC completes with another status, a corresponding
     * [StatusException] is thrown. If this coroutine is cancelled, the RPC is also cancelled with
     * the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request. Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun upgradeDID(
        request: UpgradeDidRequest,
        headers: Metadata = Metadata()
    ): UpgradeDidResponse =
        unaryRpc(channel, ProviderGrpc.getUpgradeDIDMethod(), request, callOptions, headers)
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes with
     * [`Status.OK`][Status]. If the RPC completes with another status, a corresponding
     * [StatusException] is thrown. If this coroutine is cancelled, the RPC is also cancelled with
     * the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request. Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun retrieveDomainVerificationRecord(
        request: RetrieveDomainVerificationRecordRequest,
        headers: Metadata = Metadata()
    ): RetrieveDomainVerificationRecordResponse =
        unaryRpc(
            channel,
            ProviderGrpc.getRetrieveDomainVerificationRecordMethod(),
            request,
            callOptions,
            headers)
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes with
     * [`Status.OK`][Status]. If the RPC completes with another status, a corresponding
     * [StatusException] is thrown. If this coroutine is cancelled, the RPC is also cancelled with
     * the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request. Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun refreshDomainVerificationStatus(
        request: RefreshDomainVerificationStatusRequest,
        headers: Metadata = Metadata()
    ): RefreshDomainVerificationStatusResponse =
        unaryRpc(
            channel,
            ProviderGrpc.getRefreshDomainVerificationStatusMethod(),
            request,
            callOptions,
            headers)
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes with
     * [`Status.OK`][Status]. If the RPC completes with another status, a corresponding
     * [StatusException] is thrown. If this coroutine is cancelled, the RPC is also cancelled with
     * the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request. Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun searchWalletConfigurations(
        request: SearchWalletConfigurationsRequest,
        headers: Metadata = Metadata()
    ): SearchWalletConfigurationResponse =
        unaryRpc(
            channel,
            ProviderGrpc.getSearchWalletConfigurationsMethod(),
            request,
            callOptions,
            headers)
  }

  /**
   * Skeletal implementation of the services.provider.v1.Provider service based on Kotlin
   * coroutines.
   */
  abstract class ProviderCoroutineImplBase(
      coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for services.provider.v1.Provider.CreateEcosystem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status]. If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail with status `Status.CANCELLED`. If this method fails for any other reason, the RPC
     * will fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createEcosystem(request: CreateEcosystemRequest): CreateEcosystemResponse =
        throw StatusException(
            UNIMPLEMENTED.withDescription(
                "Method services.provider.v1.Provider.CreateEcosystem is unimplemented"))

    /**
     * Returns the response to an RPC for services.provider.v1.Provider.UpdateEcosystem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status]. If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail with status `Status.CANCELLED`. If this method fails for any other reason, the RPC
     * will fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    open suspend fun updateEcosystem(request: UpdateEcosystemRequest): UpdateEcosystemResponse =
        throw StatusException(
            UNIMPLEMENTED.withDescription(
                "Method services.provider.v1.Provider.UpdateEcosystem is unimplemented"))

    /**
     * Returns the response to an RPC for services.provider.v1.Provider.GetOberonKey.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status]. If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail with status `Status.CANCELLED`. If this method fails for any other reason, the RPC
     * will fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getOberonKey(request: GetOberonKeyRequest): GetOberonKeyResponse =
        throw StatusException(
            UNIMPLEMENTED.withDescription(
                "Method services.provider.v1.Provider.GetOberonKey is unimplemented"))

    /**
     * Returns the response to an RPC for services.provider.v1.Provider.UpgradeDID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status]. If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail with status `Status.CANCELLED`. If this method fails for any other reason, the RPC
     * will fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun upgradeDID(request: UpgradeDidRequest): UpgradeDidResponse =
        throw StatusException(
            UNIMPLEMENTED.withDescription(
                "Method services.provider.v1.Provider.UpgradeDID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * services.provider.v1.Provider.RetrieveDomainVerificationRecord.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status]. If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail with status `Status.CANCELLED`. If this method fails for any other reason, the RPC
     * will fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun retrieveDomainVerificationRecord(
        request: RetrieveDomainVerificationRecordRequest
    ): RetrieveDomainVerificationRecordResponse =
        throw StatusException(
            UNIMPLEMENTED.withDescription(
                "Method services.provider.v1.Provider.RetrieveDomainVerificationRecord is unimplemented"))

    /**
     * Returns the response to an RPC for
     * services.provider.v1.Provider.RefreshDomainVerificationStatus.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status]. If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail with status `Status.CANCELLED`. If this method fails for any other reason, the RPC
     * will fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun refreshDomainVerificationStatus(
        request: RefreshDomainVerificationStatusRequest
    ): RefreshDomainVerificationStatusResponse =
        throw StatusException(
            UNIMPLEMENTED.withDescription(
                "Method services.provider.v1.Provider.RefreshDomainVerificationStatus is unimplemented"))

    /**
     * Returns the response to an RPC for services.provider.v1.Provider.SearchWalletConfigurations.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status]. If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail with status `Status.CANCELLED`. If this method fails for any other reason, the RPC
     * will fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun searchWalletConfigurations(
        request: SearchWalletConfigurationsRequest
    ): SearchWalletConfigurationResponse =
        throw StatusException(
            UNIMPLEMENTED.withDescription(
                "Method services.provider.v1.Provider.SearchWalletConfigurations is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
            .addMethod(
                unaryServerMethodDefinition(
                    context = this.context,
                    descriptor = ProviderGrpc.getCreateEcosystemMethod(),
                    implementation = ::createEcosystem))
            .addMethod(
                unaryServerMethodDefinition(
                    context = this.context,
                    descriptor = ProviderGrpc.getUpdateEcosystemMethod(),
                    implementation = ::updateEcosystem))
            .addMethod(
                unaryServerMethodDefinition(
                    context = this.context,
                    descriptor = ProviderGrpc.getGetOberonKeyMethod(),
                    implementation = ::getOberonKey))
            .addMethod(
                unaryServerMethodDefinition(
                    context = this.context,
                    descriptor = ProviderGrpc.getUpgradeDIDMethod(),
                    implementation = ::upgradeDID))
            .addMethod(
                unaryServerMethodDefinition(
                    context = this.context,
                    descriptor = ProviderGrpc.getRetrieveDomainVerificationRecordMethod(),
                    implementation = ::retrieveDomainVerificationRecord))
            .addMethod(
                unaryServerMethodDefinition(
                    context = this.context,
                    descriptor = ProviderGrpc.getRefreshDomainVerificationStatusMethod(),
                    implementation = ::refreshDomainVerificationStatus))
            .addMethod(
                unaryServerMethodDefinition(
                    context = this.context,
                    descriptor = ProviderGrpc.getSearchWalletConfigurationsMethod(),
                    implementation = ::searchWalletConfigurations))
            .build()
  }
}
