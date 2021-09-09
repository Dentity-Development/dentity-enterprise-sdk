# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: models/Attributes.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("models/Attributes.proto", :syntax => :proto3) do
    add_message "trinsic.services.Attribute" do
      optional :Id, :string, 1
      optional :name, :string, 2
      optional :type, :enum, 3, "trinsic.services.AttributeType"
      optional :value, :string, 4
    end
    add_message "trinsic.services.AttributeId" do
      optional :Id, :string, 1
    end
    add_message "trinsic.services.ListAttributesResponse" do
      repeated :attributes, :message, 1, "trinsic.services.Attribute"
    end
    add_enum "trinsic.services.AttributeType" do
      value :date, 0
      value :number, 1
      value :text, 2
      value :enum, 3
    end
  end
end

module Trinsic
  module Services
    Attribute = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.Attribute").msgclass
    AttributeId = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.AttributeId").msgclass
    ListAttributesResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.ListAttributesResponse").msgclass
    AttributeType = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.AttributeType").enummodule
  end
end
