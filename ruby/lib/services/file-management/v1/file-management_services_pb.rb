# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: services/file-management/v1/file-management.proto for package 'services.filemanagement.v1'

require 'grpc'
require 'services/file-management/v1/file-management_pb'

module Services
  module Filemanagement
    module V1
      module FileManagement
        class Service

          include ::GRPC::GenericService

          self.marshal_class_method = :encode
          self.unmarshal_class_method = :decode
          self.service_name = 'services.filemanagement.v1.FileManagement'

          # Upload a file to Trinsic's CDN
          rpc :UploadFile, ::Services::Filemanagement::V1::UploadFileRequest, ::Services::Filemanagement::V1::UploadFileResponse
          # Fetch information about a file by its ID
          rpc :GetFile, ::Services::Filemanagement::V1::GetFileRequest, ::Services::Filemanagement::V1::GetFileResponse
          # Delete a file by its ID
          rpc :DeleteFile, ::Services::Filemanagement::V1::DeleteFileRequest, ::Services::Filemanagement::V1::DeleteFileResponse
          # List files the calling account has uploaded
          rpc :ListFiles, ::Services::Filemanagement::V1::ListFilesRequest, ::Services::Filemanagement::V1::ListFilesResponse
          # Get statistics about files uploaded by the calling account
          rpc :GetStorageStats, ::Services::Filemanagement::V1::GetStorageStatsRequest, ::Services::Filemanagement::V1::GetStorageStatsResponse
        end

        Stub = Service.rpc_stub_class
      end
    end
  end
end
