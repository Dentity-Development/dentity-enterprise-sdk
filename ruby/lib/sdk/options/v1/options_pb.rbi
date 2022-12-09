# Code generated by protoc-gen-rbi. DO NOT EDIT.
# source: sdk/options/v1/options.proto
# typed: strict

class Sdk::Options::V1::ServiceOptions
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Sdk::Options::V1::ServiceOptions) }
  def self.decode(str)
  end

  sig { params(msg: Sdk::Options::V1::ServiceOptions).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Sdk::Options::V1::ServiceOptions) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Sdk::Options::V1::ServiceOptions, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      server_endpoint: T.nilable(String),
      server_port: T.nilable(Integer),
      server_use_tls: T.nilable(T::Boolean),
      auth_token: T.nilable(String)
    ).void
  end
  def initialize(
    server_endpoint: "",
    server_port: 0,
    server_use_tls: false,
    auth_token: ""
  )
  end

  sig { returns(String) }
  def server_endpoint
  end

  sig { params(value: String).void }
  def server_endpoint=(value)
  end

  sig { void }
  def clear_server_endpoint
  end

  sig { returns(Integer) }
  def server_port
  end

  sig { params(value: Integer).void }
  def server_port=(value)
  end

  sig { void }
  def clear_server_port
  end

  sig { returns(T::Boolean) }
  def server_use_tls
  end

  sig { params(value: T::Boolean).void }
  def server_use_tls=(value)
  end

  sig { void }
  def clear_server_use_tls
  end

  sig { returns(String) }
  def auth_token
  end

  sig { params(value: String).void }
  def auth_token=(value)
  end

  sig { void }
  def clear_auth_token
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end
