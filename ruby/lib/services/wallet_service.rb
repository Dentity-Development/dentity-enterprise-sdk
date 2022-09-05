# frozen_string_literal: true

require 'services/service_base'

module Trinsic
  # Wallet Service wrapper
  class WalletService < ServiceBase
    def initialize(service_options = nil)
      super(service_options)
      if @service_options.server_use_tls
        channel_creds = GRPC::Core::ChannelCredentials.new
        @client = Wallet::UniversalWallet::Stub.new(url_string, channel_creds)
      else
        @client = Wallet::UniversalWallet::Stub.new(url_string, :this_channel_is_insecure)
      end
    end

    def search(request = nil)
      request ||= Wallet::SearchRequest.new
      request.query = request.query.empty? ? 'SELECT c.id, c.type, c.data FROM c OFFSET 0 LIMIT 100' : request.query
      @client.search(request, metadata: metadata(request))
    end

    # BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    # target: /home/runner/work/sdk/sdk/ruby/lib/services/wallet_service.rb
    nil

    #  Retrieve an item from the wallet with a given item identifier
    # @param [GetItemRequest] request
    # @return [Services::Universalwallet::V1::GetItemResponse]
    def get_item(request)
      @client.get_item(request, metadata: metadata(request))
    end

    #  Search the wallet using a SQL syntax
    # @param [SearchRequest] request
    # @return [Services::Universalwallet::V1::SearchResponse]
    def search(request)
      @client.search(request, metadata: metadata(request))
    end

    #  Insert an item into the wallet
    # @param [InsertItemRequest] request
    # @return [Services::Universalwallet::V1::InsertItemResponse]
    def insert_item(request)
      @client.insert_item(request, metadata: metadata(request))
    end

    #  Update an item in the wallet
    # @param [UpdateItemRequest] request
    # @return [Services::Universalwallet::V1::UpdateItemResponse]
    def update_item(request)
      @client.update_item(request, metadata: metadata(request))
    end

    #  Delete an item from the wallet permanently
    # @param [DeleteItemRequest] request
    # @return [Services::Universalwallet::V1::DeleteItemResponse]
    def delete_item(request)
      @client.delete_item(request, metadata: metadata(request))
    end

    # END Code generated by protoc-gen-trinsic. DO NOT EDIT.
  end
end
