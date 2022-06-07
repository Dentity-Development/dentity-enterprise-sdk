# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: services/provider/v1/provider.proto

require 'google/protobuf'

require 'services/account/v1/account_pb'
require 'services/options/field-options_pb'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("services/provider/v1/provider.proto", :syntax => :proto3) do
    add_message "services.provider.v1.Invite" do
      optional :id, :string, 1
      optional :code, :string, 2
      optional :created, :string, 3
      optional :accepted, :string, 4
      optional :expires, :string, 5
    end
    add_message "services.provider.v1.InviteRequest" do
      optional :participant, :enum, 1, "services.provider.v1.ParticipantType"
      optional :description, :string, 2
      optional :details, :message, 3, "services.account.v1.AccountDetails"
    end
    add_message "services.provider.v1.InviteRequest.DidCommInvitation" do
    end
    add_message "services.provider.v1.InviteResponse" do
      optional :invitation_id, :string, 10
      optional :invitation_code, :string, 11
    end
    add_message "services.provider.v1.InvitationStatusRequest" do
      optional :invitation_id, :string, 1
    end
    add_message "services.provider.v1.InvitationStatusResponse" do
      optional :status, :enum, 1, "services.provider.v1.InvitationStatusResponse.Status"
      optional :status_details, :string, 2
    end
    add_enum "services.provider.v1.InvitationStatusResponse.Status" do
      value :Error, 0
      value :InvitationSent, 1
      value :Completed, 2
      value :Expired, 3
    end
    add_message "services.provider.v1.Ecosystem" do
      optional :id, :string, 1
      optional :name, :string, 2
      optional :description, :string, 3
      optional :uri, :string, 4
      repeated :webhooks, :message, 5, "services.provider.v1.WebhookConfig"
    end
    add_message "services.provider.v1.WebhookConfig" do
      optional :id, :string, 1
      optional :destination_url, :string, 2
      repeated :events, :string, 4
      optional :status, :string, 5
    end
    add_message "services.provider.v1.CreateEcosystemRequest" do
      optional :name, :string, 1
      optional :description, :string, 2
      optional :uri, :string, 3
      optional :details, :message, 4, "services.account.v1.AccountDetails"
    end
    add_message "services.provider.v1.CreateEcosystemResponse" do
      optional :ecosystem, :message, 1, "services.provider.v1.Ecosystem"
      optional :profile, :message, 2, "services.account.v1.AccountProfile"
      optional :confirmation_method, :enum, 3, "services.account.v1.ConfirmationMethod"
    end
    add_message "services.provider.v1.UpdateEcosystemRequest" do
      optional :ecosystem_id, :string, 1
      optional :description, :string, 2
      optional :uri, :string, 3
    end
    add_message "services.provider.v1.UpdateEcosystemResponse" do
      optional :Ecosystem, :message, 1, "services.provider.v1.Ecosystem"
    end
    add_message "services.provider.v1.AddWebhookRequest" do
      optional :ecosystem_id, :string, 1
      optional :destination_url, :string, 2
      optional :secret, :string, 3
      repeated :events, :string, 4
    end
    add_message "services.provider.v1.AddWebhookResponse" do
      optional :ecosystem, :message, 1, "services.provider.v1.Ecosystem"
    end
    add_message "services.provider.v1.DeleteWebhookRequest" do
      optional :ecosystem_id, :string, 1
      optional :webhook_id, :string, 2
    end
    add_message "services.provider.v1.DeleteWebhookResponse" do
      optional :ecosystem, :message, 1, "services.provider.v1.Ecosystem"
    end
    add_message "services.provider.v1.EcosystemInfoRequest" do
      optional :ecosystem_id, :string, 1
    end
    add_message "services.provider.v1.EcosystemInfoResponse" do
      optional :ecosystem, :message, 1, "services.provider.v1.Ecosystem"
    end
    add_message "services.provider.v1.GenerateTokenRequest" do
      optional :description, :string, 1
    end
    add_message "services.provider.v1.GenerateTokenResponse" do
      optional :profile, :message, 1, "services.account.v1.AccountProfile"
    end
    add_message "services.provider.v1.GetOberonKeyRequest" do
    end
    add_message "services.provider.v1.GetOberonKeyResponse" do
      optional :key, :string, 1
    end
    add_message "services.provider.v1.GetEventTokenRequest" do
      optional :pk, :bytes, 1
    end
    add_message "services.provider.v1.GetEventTokenResponse" do
      optional :token, :string, 1
    end
    add_enum "services.provider.v1.ParticipantType" do
      value :participant_type_individual, 0
      value :participant_type_organization, 1
    end
  end
end

module Services
  module Provider
    module V1
      Invite = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.Invite").msgclass
      InviteRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.InviteRequest").msgclass
      InviteRequest::DidCommInvitation = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.InviteRequest.DidCommInvitation").msgclass
      InviteResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.InviteResponse").msgclass
      InvitationStatusRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.InvitationStatusRequest").msgclass
      InvitationStatusResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.InvitationStatusResponse").msgclass
      InvitationStatusResponse::Status = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.InvitationStatusResponse.Status").enummodule
      Ecosystem = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.Ecosystem").msgclass
      WebhookConfig = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.WebhookConfig").msgclass
      CreateEcosystemRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.CreateEcosystemRequest").msgclass
      CreateEcosystemResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.CreateEcosystemResponse").msgclass
      UpdateEcosystemRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.UpdateEcosystemRequest").msgclass
      UpdateEcosystemResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.UpdateEcosystemResponse").msgclass
      AddWebhookRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.AddWebhookRequest").msgclass
      AddWebhookResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.AddWebhookResponse").msgclass
      DeleteWebhookRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.DeleteWebhookRequest").msgclass
      DeleteWebhookResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.DeleteWebhookResponse").msgclass
      EcosystemInfoRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.EcosystemInfoRequest").msgclass
      EcosystemInfoResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.EcosystemInfoResponse").msgclass
      GenerateTokenRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.GenerateTokenRequest").msgclass
      GenerateTokenResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.GenerateTokenResponse").msgclass
      GetOberonKeyRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.GetOberonKeyRequest").msgclass
      GetOberonKeyResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.GetOberonKeyResponse").msgclass
      GetEventTokenRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.GetEventTokenRequest").msgclass
      GetEventTokenResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.GetEventTokenResponse").msgclass
      ParticipantType = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.provider.v1.ParticipantType").enummodule
    end
  end
end
