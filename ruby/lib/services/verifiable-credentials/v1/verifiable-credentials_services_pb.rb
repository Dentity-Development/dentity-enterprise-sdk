# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: services/verifiable-credentials/v1/verifiable-credentials.proto for package 'services.verifiablecredentials.v1'

require 'grpc'
require 'services/verifiable-credentials/v1/verifiable-credentials_pb'

module Services
  module Verifiablecredentials
    module V1
      module VerifiableCredential
        class Service

          include ::GRPC::GenericService

          self.marshal_class_method = :encode
          self.unmarshal_class_method = :decode
          self.service_name = 'services.verifiablecredentials.v1.VerifiableCredential'

          # Sign and issue a verifiable credential from a submitted document.
          # The document must be a valid JSON-LD document.
          rpc :Issue, ::Services::Verifiablecredentials::V1::IssueRequest, ::Services::Verifiablecredentials::V1::IssueResponse
          # Sign and issue a verifiable credential from a pre-defined template.
          # This process will also add schema validation and 
          # revocation registry values to the credential.
          rpc :IssueFromTemplate, ::Services::Verifiablecredentials::V1::IssueFromTemplateRequest, ::Services::Verifiablecredentials::V1::IssueFromTemplateResponse
          # Check credential status in the revocation registry
          rpc :CheckStatus, ::Services::Verifiablecredentials::V1::CheckStatusRequest, ::Services::Verifiablecredentials::V1::CheckStatusResponse
          # Update credential status by setting the revocation value
          rpc :UpdateStatus, ::Services::Verifiablecredentials::V1::UpdateStatusRequest, ::Services::Verifiablecredentials::V1::UpdateStatusResponse
          # Create a proof from a signed document that is a valid
          # verifiable credential and contains a signature from which a proof can be derived.
          rpc :CreateProof, ::Services::Verifiablecredentials::V1::CreateProofRequest, ::Services::Verifiablecredentials::V1::CreateProofResponse
          # Verifies a proof by checking the signature value, and if possible schema validation,
          # revocation status, and issuer status against a trust registry
          rpc :VerifyProof, ::Services::Verifiablecredentials::V1::VerifyProofRequest, ::Services::Verifiablecredentials::V1::VerifyProofResponse
          # Sends a document directly to a user's email within the given ecosystem
          rpc :Send, ::Services::Verifiablecredentials::V1::SendRequest, ::Services::Verifiablecredentials::V1::SendResponse
        end

        Stub = Service.rpc_stub_class
      end
    end
  end
end
