# frozen_string_literal: true

# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: services/verifiable-credentials/templates/v1/templates.proto for package 'services.verifiablecredentials.templates.v1'

require 'grpc'
require 'services/verifiable-credentials/templates/v1/templates_pb'

module Services
  module Verifiablecredentials
    module Templates
      module V1
        module CredentialTemplates
          class Service
            include ::GRPC::GenericService

            self.marshal_class_method = :encode
            self.unmarshal_class_method = :decode
            self.service_name = 'services.verifiablecredentials.templates.v1.CredentialTemplates'

            rpc :Create, ::Services::Verifiablecredentials::Templates::V1::CreateCredentialTemplateRequest,
                ::Services::Verifiablecredentials::Templates::V1::CreateCredentialTemplateResponse
            rpc :Get, ::Services::Verifiablecredentials::Templates::V1::GetCredentialTemplateRequest,
                ::Services::Verifiablecredentials::Templates::V1::GetCredentialTemplateResponse
            rpc :List, ::Services::Verifiablecredentials::Templates::V1::ListCredentialTemplatesRequest,
                ::Services::Verifiablecredentials::Templates::V1::ListCredentialTemplatesResponse
            rpc :Search, ::Services::Verifiablecredentials::Templates::V1::SearchCredentialTemplatesRequest,
                ::Services::Verifiablecredentials::Templates::V1::SearchCredentialTemplatesResponse
            rpc :Delete, ::Services::Verifiablecredentials::Templates::V1::DeleteCredentialTemplateRequest,
                ::Services::Verifiablecredentials::Templates::V1::DeleteCredentialTemplateResponse
          end

          Stub = Service.rpc_stub_class
        end
      end
    end
  end
end
