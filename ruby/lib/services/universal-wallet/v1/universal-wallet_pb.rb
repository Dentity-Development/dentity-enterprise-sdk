# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: services/universal-wallet/v1/universal-wallet.proto

require 'google/protobuf'

require 'services/common/v1/common_pb'
require 'pbmse/v1/pbmse_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("services/universal-wallet/v1/universal-wallet.proto", :syntax => :proto3) do
    add_message "services.universalwallet.v1.CreateWalletRequest" do
      optional :controller, :string, 1
      optional :description, :string, 2
      optional :security_code, :string, 3
    end
    add_message "services.universalwallet.v1.CreateWalletResponse" do
      optional :status, :enum, 1, "services.common.v1.ResponseStatus"
      optional :wallet_id, :string, 2
      optional :capability, :string, 3
      optional :invoker, :string, 4
    end
    add_message "services.universalwallet.v1.ConnectRequest" do
      oneof :contact_method do
        optional :email, :string, 5
        optional :phone, :string, 6
      end
    end
    add_message "services.universalwallet.v1.ConnectResponse" do
      optional :status, :enum, 1, "services.common.v1.ResponseStatus"
    end
    add_message "services.universalwallet.v1.InvitationToken" do
      optional :security_code, :string, 1
      optional :wallet_id, :string, 2
      oneof :contact_method do
        optional :email, :string, 5
        optional :phone, :string, 6
      end
    end
    add_message "services.universalwallet.v1.WalletProfile" do
      optional :did_document, :message, 1, "services.common.v1.JsonPayload"
      optional :wallet_id, :string, 2
      optional :invoker, :string, 3
      optional :capability, :string, 4
      optional :invoker_jwk, :bytes, 5
    end
    add_message "services.universalwallet.v1.GrantAccessRequest" do
      optional :wallet_id, :string, 1
      optional :did, :string, 2
    end
    add_message "services.universalwallet.v1.GrantAccessResponse" do
      optional :status, :enum, 1, "services.common.v1.ResponseStatus"
    end
    add_message "services.universalwallet.v1.RevokeAccessRequest" do
      optional :wallet_id, :string, 1
      optional :did, :string, 2
    end
    add_message "services.universalwallet.v1.RevokeAccessResponse" do
      optional :status, :enum, 1, "services.common.v1.ResponseStatus"
    end
    add_message "services.universalwallet.v1.GetProviderConfigurationRequest" do
      optional :request_options, :message, 1, "services.common.v1.RequestOptions"
    end
    add_message "services.universalwallet.v1.GetProviderConfigurationResponse" do
      optional :did_document, :message, 1, "services.common.v1.JsonPayload"
      optional :key_agreement_key_id, :string, 2
    end
    add_message "services.universalwallet.v1.SearchRequest" do
      optional :query, :string, 1
      optional :continuation_token, :string, 2
      optional :options, :message, 5, "services.common.v1.RequestOptions"
    end
    add_message "services.universalwallet.v1.SearchResponse" do
      repeated :items, :message, 1, "services.common.v1.JsonPayload"
      optional :has_more, :bool, 2
      optional :count, :int32, 3
      optional :continuation_token, :string, 4
    end
    add_message "services.universalwallet.v1.InsertItemRequest" do
      optional :item, :message, 1, "services.common.v1.JsonPayload"
      optional :item_type, :string, 2
    end
    add_message "services.universalwallet.v1.InsertItemResponse" do
      optional :status, :enum, 1, "services.common.v1.ResponseStatus"
      optional :item_id, :string, 2
    end
  end
end

module Services
  module Universalwallet
    module V1
      CreateWalletRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.CreateWalletRequest").msgclass
      CreateWalletResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.CreateWalletResponse").msgclass
      ConnectRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.ConnectRequest").msgclass
      ConnectResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.ConnectResponse").msgclass
      InvitationToken = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.InvitationToken").msgclass
      WalletProfile = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.WalletProfile").msgclass
      GrantAccessRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.GrantAccessRequest").msgclass
      GrantAccessResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.GrantAccessResponse").msgclass
      RevokeAccessRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.RevokeAccessRequest").msgclass
      RevokeAccessResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.RevokeAccessResponse").msgclass
      GetProviderConfigurationRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.GetProviderConfigurationRequest").msgclass
      GetProviderConfigurationResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.GetProviderConfigurationResponse").msgclass
      SearchRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.SearchRequest").msgclass
      SearchResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.SearchResponse").msgclass
      InsertItemRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.InsertItemRequest").msgclass
      InsertItemResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("services.universalwallet.v1.InsertItemResponse").msgclass
    end
  end
end
