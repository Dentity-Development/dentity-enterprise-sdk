# frozen_string_literal: true

require 'services/service_base'
require 'json'
require 'uri'

module Trinsic
  # Trust Registry Service wrapper
  class TrustRegistryService < ServiceBase
    def initialize(service_options = nil)
      super(service_options)
      if @service_options.server_use_tls
        channel_creds = GRPC::Core::ChannelCredentials.new
        @client = TrustRegistry::TrustRegistry::Stub.new(url_string, channel_creds)
      else
        @client = TrustRegistry::TrustRegistry::Stub.new(url_string, :this_channel_is_insecure)
      end
    end

    def search(request = nil)
      request ||= TrustRegistry::SearchRegistryRequest.new
      request.query = request.query.empty? ? 'SELECT * FROM c OFFSET 0 LIMIT 100' : request.query
      search_registry(request)
    end
    # BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    # target: /home/runner/work/sdk/sdk/ruby/lib/services/trustregistry_service.rb

    #  Add a governance framework to the ecosystem
    # @param [AddFrameworkRequest] request
    # @return [Services::Trustregistry::V1::AddFrameworkResponse]
    def add_framework(request)
      @client.add_framework(request, metadata: metadata(request))
    end

    #  Remove a governance framework from the ecosystem
    # @param [RemoveFrameworkRequest] request
    # @return [Services::Trustregistry::V1::RemoveFrameworkResponse]
    def remove_framework(request)
      @client.remove_framework(request, metadata: metadata(request))
    end

    #  Search the ecosystem's governance frameworks
    # @param [SearchRegistryRequest] request
    # @return [Services::Trustregistry::V1::SearchRegistryResponse]
    def search_registry(request)
      @client.search_registry(request, metadata: metadata(request))
    end

    #  Register an authoritative issuer for a credential schema
    # @param [RegisterMemberRequest] request
    # @return [Services::Trustregistry::V1::RegisterMemberResponse]
    def register_member(request)
      @client.register_member(request, metadata: metadata(request))
    end

    #  Removes an authoritative issuer for a credential schema from the trust registry
    # @param [UnregisterMemberRequest] request
    # @return [Services::Trustregistry::V1::UnregisterMemberResponse]
    def unregister_member(request)
      @client.unregister_member(request, metadata: metadata(request))
    end

    #  Fetch the membership status of an issuer for a given credential schema in a trust registry
    # @param [GetMembershipStatusRequest] request
    # @return [Services::Trustregistry::V1::GetMembershipStatusResponse]
    def get_membership_status(request)
      @client.get_membership_status(request, metadata: metadata(request))
    end

    # END Code generated by protoc-gen-trinsic. DO NOT EDIT.
  end
end
