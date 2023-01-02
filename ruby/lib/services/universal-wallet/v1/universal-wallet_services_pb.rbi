# Code generated by protoc-gen-rbi. DO NOT EDIT.
# source: services/universal-wallet/v1/universal-wallet.proto
# typed: strict

module Services::Universalwallet::V1::UniversalWallet
  class Service
    include ::GRPC::GenericService
  end

  class Stub < ::GRPC::ClientStub
    sig do
      params(
        host: String,
        creds: T.any(::GRPC::Core::ChannelCredentials, Symbol),
        kw: T.untyped,
      ).void
    end
    def initialize(host, creds, **kw)
    end

    sig do
      params(
        request: Services::Universalwallet::V1::GetItemRequest
      ).returns(Services::Universalwallet::V1::GetItemResponse)
    end
    def get_item(request)
    end

    sig do
      params(
        request: Services::Universalwallet::V1::SearchRequest
      ).returns(Services::Universalwallet::V1::SearchResponse)
    end
    def search(request)
    end

    sig do
      params(
        request: Services::Universalwallet::V1::InsertItemRequest
      ).returns(Services::Universalwallet::V1::InsertItemResponse)
    end
    def insert_item(request)
    end

    sig do
      params(
        request: Services::Universalwallet::V1::UpdateItemRequest
      ).returns(Services::Universalwallet::V1::UpdateItemResponse)
    end
    def update_item(request)
    end

    sig do
      params(
        request: Services::Universalwallet::V1::DeleteItemRequest
      ).returns(Services::Universalwallet::V1::DeleteItemResponse)
    end
    def delete_item(request)
    end
  end
end