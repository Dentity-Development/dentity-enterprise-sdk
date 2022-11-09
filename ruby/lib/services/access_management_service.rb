# frozen_string_literal: true

require 'services/service_base'

module Trinsic
  # Credential Service wrapper
  class AccessManagementService < ServiceBase
    def initialize(service_options = nil)
      super(service_options)
      if @service_options.server_use_tls
        channel_creds = GRPC::Core::ChannelCredentials.new
        @client = Access::AccessManagement::Stub.new(url_string, channel_creds)
      else
        @client = Access::AccessManagement::Stub.new(url_string, :this_channel_is_insecure)
      end
    end

    # BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    # target: C:\work\sdk\ruby\lib\services\access_management_service.rb

    #  Adds a role assignment to an account
    # @param [AddRoleAssignmentRequest] request
    # @return [Services::Provider::V1::AddRoleAssignmentResponse]
    def add_role_assignment(request)
      @client.add_role_assignment(request, metadata: metadata(request))
    end

    #  Removes a role assignment from the account
    # @param [RemoveRoleAssignmentRequest] request
    # @return [Services::Provider::V1::RemoveRoleAssignmentResponse]
    def remove_role_assignment(request)
      @client.remove_role_assignment(request, metadata: metadata(request))
    end

    #  List the role assignments for the given account
    # @param [ListRoleAssignmentsRequest] request
    # @return [Services::Provider::V1::ListRoleAssignmentsResponse]
    def list_role_assignments(request)
      @client.list_role_assignments(request, metadata: metadata(request))
    end

    # END Code generated by protoc-gen-trinsic. DO NOT EDIT.
  end
end
