package trinsic.services

import com.google.protobuf.InvalidProtocolBufferException
import trinsic.okapi.DidException
import trinsic.sdk.options.v1.Options
import trinsic.services.universalwallet.v1.*
import trinsic.services.universalwallet.v1.UniversalWalletGrpcKt

class WalletServiceKt(options: Options.ServiceOptions.Builder?) : ServiceBase(options) {
  var stub = UniversalWalletGrpcKt.UniversalWalletCoroutineStub(this.channel)

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun searchWallet(request: SearchRequest): SearchResponse {
    var request2 = request
    if (request2.query.isBlank())
        request2 =
            SearchRequest.newBuilder(request2)
                .setQuery("SELECT c.id, c.type, c.data FROM c OFFSET 0 LIMIT 100")
                .build()
    return search(request2)
  }

  // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
  // target: D:\trinsic\sdk\java\src\main\java\trinsic\services\WalletServiceKt.kt

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun getItem(request: GetItemRequest): GetItemResponse {
    /** Retrieve an item from the wallet with a given item identifier */
    return withMetadata(stub, request).getItem(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun search(request: SearchRequest): SearchResponse {
    /** Search the wallet using a SQL syntax */
    return withMetadata(stub, request).search(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun insertItem(request: InsertItemRequest): InsertItemResponse {
    /** Insert an item into the wallet */
    return withMetadata(stub, request).insertItem(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun updateItem(request: UpdateItemRequest): UpdateItemResponse {
    /** Update an item in the wallet */
    return withMetadata(stub, request).updateItem(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun deleteItem(request: DeleteItemRequest): DeleteItemResponse {
    /** Delete an item from the wallet permanently */
    return withMetadata(stub, request).deleteItem(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun deleteWallet(request: DeleteWalletRequest): DeleteWalletResponse {
    /** Delete a wallet and its credentials */
    return withMetadata(stub, request).deleteWallet(request)
  }
  // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
