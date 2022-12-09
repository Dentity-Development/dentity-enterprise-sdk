# frozen_string_literal: true

require 'services/service_base'

module Trinsic
  # Credential Service wrapper
  class CredentialService < ServiceBase
    def initialize(service_options = nil)
      super(service_options)
      if @service_options.server_use_tls
        channel_creds = GRPC::Core::ChannelCredentials.new
        @client = Credentials::VerifiableCredential::Stub.new(url_string, channel_creds)
      else
        @client = Credentials::VerifiableCredential::Stub.new(url_string, :this_channel_is_insecure)
      end
    end

    # BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    # target: /home/runner/work/sdk/sdk/ruby/lib/services/credential_service.rb

    #  Sign and issue a verifiable credential from a submitted document.
    # The document must be a valid JSON-LD document.
    # @param [IssueRequest] request
    # @return [Services::Verifiablecredentials::V1::IssueResponse]
    def issue(request)
      @client.issue(request, metadata: metadata(request))
    end

    #  Sign and issue a verifiable credential from a pre-defined template.
    # This process will also add schema validation and
    # revocation registry values to the credential.
    # @param [IssueFromTemplateRequest] request
    # @return [Services::Verifiablecredentials::V1::IssueFromTemplateResponse]
    def issue_from_template(request)
      @client.issue_from_template(request, metadata: metadata(request))
    end

    #  Check credential status in the revocation registry
    # @param [CheckStatusRequest] request
    # @return [Services::Verifiablecredentials::V1::CheckStatusResponse]
    def check_status(request)
      @client.check_status(request, metadata: metadata(request))
    end

    #  Update credential status by setting the revocation value
    # @param [UpdateStatusRequest] request
    # @return [Services::Verifiablecredentials::V1::UpdateStatusResponse]
    def update_status(request)
      @client.update_status(request, metadata: metadata(request))
    end

    #  Create a proof from a signed document that is a valid
    # verifiable credential and contains a signature from which a proof can be derived.
    # @param [CreateProofRequest] request
    # @return [Services::Verifiablecredentials::V1::CreateProofResponse]
    def create_proof(request)
      @client.create_proof(request, metadata: metadata(request))
    end

    #  Verifies a proof by checking the signature value, and if possible schema validation,
    # revocation status, and issuer status against a trust registry
    # @param [VerifyProofRequest] request
    # @return [Services::Verifiablecredentials::V1::VerifyProofResponse]
    def verify_proof(request)
      @client.verify_proof(request, metadata: metadata(request))
    end

    #  Sends a document directly to a user's email within the given ecosystem
    # @param [SendRequest] request
    # @return [Services::Verifiablecredentials::V1::SendResponse]
    def send(request)
      @client.send(request, metadata: metadata(request))
    end

    # END Code generated by protoc-gen-trinsic. DO NOT EDIT.
  end
end