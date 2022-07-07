# Code generated by protoc-gen-rbi. DO NOT EDIT.
# source: services/common/v1/common.proto
# typed: strict

class Services::Common::V1::Nonce
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Common::V1::Nonce) }
  def self.decode(str)
  end

  sig { params(msg: Services::Common::V1::Nonce).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Common::V1::Nonce) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Common::V1::Nonce, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      timestamp: T.nilable(Integer),
      request_hash: T.nilable(String)
    ).void
  end
  def initialize(
    timestamp: 0,
    request_hash: ""
  )
  end

  sig { returns(Integer) }
  def timestamp
  end

  sig { params(value: Integer).void }
  def timestamp=(value)
  end

  sig { void }
  def clear_timestamp
  end

  sig { returns(String) }
  def request_hash
  end

  sig { params(value: String).void }
  def request_hash=(value)
  end

  sig { void }
  def clear_request_hash
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

module Services::Common::V1::ResponseStatus
  self::SUCCESS = T.let(0, Integer)
  self::WALLET_ACCESS_DENIED = T.let(10, Integer)
  self::WALLET_EXISTS = T.let(11, Integer)
  self::ITEM_NOT_FOUND = T.let(20, Integer)
  self::SERIALIZATION_ERROR = T.let(200, Integer)
  self::UNKNOWN_ERROR = T.let(100, Integer)

  sig { params(value: Integer).returns(T.nilable(Symbol)) }
  def self.lookup(value)
  end

  sig { params(value: Symbol).returns(T.nilable(Integer)) }
  def self.resolve(value)
  end

  sig { returns(::Google::Protobuf::EnumDescriptor) }
  def self.descriptor
  end
end
