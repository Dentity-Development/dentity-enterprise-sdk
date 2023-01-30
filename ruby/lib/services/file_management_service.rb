# frozen_string_literal: true

require 'services/service_base'

module Trinsic
  # Credential Service wrapper
  class FileManagementService < ServiceBase
    def initialize(service_options = nil)
      super(service_options)
      if @service_options.server_use_tls
        channel_creds = GRPC::Core::ChannelCredentials.new
        @client = Provider::FileManagement::Stub.new(url_string, channel_creds)
      else
        @client = Provider::FileManagement::Stub.new(url_string, :this_channel_is_insecure)
      end
    end

    # BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    # target: D:\trinsic\sdk\ruby\lib\services\file_management_service.rb

    #  Upload a file to Trinsic's CDN
    # @param [UploadFileRequest] request
    # @return [Services::Filemanagement::V1::UploadFileResponse]
    def upload_file(request)
      @client.upload_file(request, metadata: metadata(request))
    end

    #  Fetch information about a file by its ID
    # @param [GetFileRequest] request
    # @return [Services::Filemanagement::V1::GetFileResponse]
    def get_file(request)
      @client.get_file(request, metadata: metadata(request))
    end

    #  Delete a file by its ID
    # @param [DeleteFileRequest] request
    # @return [Services::Filemanagement::V1::DeleteFileResponse]
    def delete_file(request)
      @client.delete_file(request, metadata: metadata(request))
    end

    #  List files the calling account has uploaded
    # @param [ListFilesRequest] request
    # @return [Services::Filemanagement::V1::ListFilesResponse]
    def list_files(request)
      @client.list_files(request, metadata: metadata(request))
    end

    #  Get statistics about files uploaded by the calling account
    # @param [GetStorageStatsRequest] request
    # @return [Services::Filemanagement::V1::GetStorageStatsResponse]
    def get_storage_stats(request)
      @client.get_storage_stats(request, metadata: metadata(request))
    end

    # END Code generated by protoc-gen-trinsic. DO NOT EDIT.
  end
end
