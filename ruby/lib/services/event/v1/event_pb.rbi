# Code generated by protoc-gen-rbi. DO NOT EDIT.
# source: services/event/v1/event.proto
# typed: strict

class Trinsic::Services::Event::Event
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Trinsic::Services::Event::Event) }
  def self.decode(str)
  end

  sig { params(msg: Trinsic::Services::Event::Event).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Trinsic::Services::Event::Event) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Trinsic::Services::Event::Event, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      id: T.nilable(String),
      type: T.nilable(T.any(Symbol, String, Integer)),
      timestamp: T.nilable(String),
      data: T.nilable(String)
    ).void
  end
  def initialize(
    id: "",
    type: :PING,
    timestamp: "",
    data: ""
  )
  end

  sig { returns(String) }
  def id
  end

  sig { params(value: String).void }
  def id=(value)
  end

  sig { void }
  def clear_id
  end

  sig { returns(Symbol) }
  def type
  end

  sig { params(value: T.any(Symbol, String, Integer)).void }
  def type=(value)
  end

  sig { void }
  def clear_type
  end

  sig { returns(String) }
  def timestamp
  end

  sig { params(value: String).void }
  def timestamp=(value)
  end

  sig { void }
  def clear_timestamp
  end

  sig { returns(String) }
  def data
  end

  sig { params(value: String).void }
  def data=(value)
  end

  sig { void }
  def clear_data
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

class Trinsic::Services::Event::APICall
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Trinsic::Services::Event::APICall) }
  def self.decode(str)
  end

  sig { params(msg: Trinsic::Services::Event::APICall).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Trinsic::Services::Event::APICall) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Trinsic::Services::Event::APICall, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      source: T.nilable(String),
      request: T.nilable(String),
      response: T.nilable(String)
    ).void
  end
  def initialize(
    source: "",
    request: "",
    response: ""
  )
  end

  sig { returns(String) }
  def source
  end

  sig { params(value: String).void }
  def source=(value)
  end

  sig { void }
  def clear_source
  end

  sig { returns(String) }
  def request
  end

  sig { params(value: String).void }
  def request=(value)
  end

  sig { void }
  def clear_request
  end

  sig { returns(String) }
  def response
  end

  sig { params(value: String).void }
  def response=(value)
  end

  sig { void }
  def clear_response
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

class Trinsic::Services::Event::Ping
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Trinsic::Services::Event::Ping) }
  def self.decode(str)
  end

  sig { params(msg: Trinsic::Services::Event::Ping).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Trinsic::Services::Event::Ping) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Trinsic::Services::Event::Ping, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      id: T.nilable(String),
      webhook_id: T.nilable(String),
      timestamp: T.nilable(String),
      message: T.nilable(String)
    ).void
  end
  def initialize(
    id: "",
    webhook_id: "",
    timestamp: "",
    message: ""
  )
  end

  sig { returns(String) }
  def id
  end

  sig { params(value: String).void }
  def id=(value)
  end

  sig { void }
  def clear_id
  end

  sig { returns(String) }
  def webhook_id
  end

  sig { params(value: String).void }
  def webhook_id=(value)
  end

  sig { void }
  def clear_webhook_id
  end

  sig { returns(String) }
  def timestamp
  end

  sig { params(value: String).void }
  def timestamp=(value)
  end

  sig { void }
  def clear_timestamp
  end

  sig { returns(String) }
  def message
  end

  sig { params(value: String).void }
  def message=(value)
  end

  sig { void }
  def clear_message
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

class Trinsic::Services::Event::EGFCreated
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Trinsic::Services::Event::EGFCreated) }
  def self.decode(str)
  end

  sig { params(msg: Trinsic::Services::Event::EGFCreated).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Trinsic::Services::Event::EGFCreated) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Trinsic::Services::Event::EGFCreated, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      id: T.nilable(String),
      ecosystem_id: T.nilable(String),
      trust_registry: T.nilable(String),
      governing_authority: T.nilable(String),
      type: T.nilable(String),
      name: T.nilable(String),
      description: T.nilable(String),
      governance_framework: T.nilable(String)
    ).void
  end
  def initialize(
    id: "",
    ecosystem_id: "",
    trust_registry: "",
    governing_authority: "",
    type: "",
    name: "",
    description: "",
    governance_framework: ""
  )
  end

  sig { returns(String) }
  def id
  end

  sig { params(value: String).void }
  def id=(value)
  end

  sig { void }
  def clear_id
  end

  sig { returns(String) }
  def ecosystem_id
  end

  sig { params(value: String).void }
  def ecosystem_id=(value)
  end

  sig { void }
  def clear_ecosystem_id
  end

  sig { returns(String) }
  def trust_registry
  end

  sig { params(value: String).void }
  def trust_registry=(value)
  end

  sig { void }
  def clear_trust_registry
  end

  sig { returns(String) }
  def governing_authority
  end

  sig { params(value: String).void }
  def governing_authority=(value)
  end

  sig { void }
  def clear_governing_authority
  end

  sig { returns(String) }
  def type
  end

  sig { params(value: String).void }
  def type=(value)
  end

  sig { void }
  def clear_type
  end

  sig { returns(String) }
  def name
  end

  sig { params(value: String).void }
  def name=(value)
  end

  sig { void }
  def clear_name
  end

  sig { returns(String) }
  def description
  end

  sig { params(value: String).void }
  def description=(value)
  end

  sig { void }
  def clear_description
  end

  sig { returns(String) }
  def governance_framework
  end

  sig { params(value: String).void }
  def governance_framework=(value)
  end

  sig { void }
  def clear_governance_framework
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

class Trinsic::Services::Event::TemplateCreated
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Trinsic::Services::Event::TemplateCreated) }
  def self.decode(str)
  end

  sig { params(msg: Trinsic::Services::Event::TemplateCreated).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Trinsic::Services::Event::TemplateCreated) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Trinsic::Services::Event::TemplateCreated, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      id: T.nilable(String),
      ecosystem_id: T.nilable(String),
      name: T.nilable(String),
      type: T.nilable(String),
      created_by: T.nilable(String)
    ).void
  end
  def initialize(
    id: "",
    ecosystem_id: "",
    name: "",
    type: "",
    created_by: ""
  )
  end

  sig { returns(String) }
  def id
  end

  sig { params(value: String).void }
  def id=(value)
  end

  sig { void }
  def clear_id
  end

  sig { returns(String) }
  def ecosystem_id
  end

  sig { params(value: String).void }
  def ecosystem_id=(value)
  end

  sig { void }
  def clear_ecosystem_id
  end

  sig { returns(String) }
  def name
  end

  sig { params(value: String).void }
  def name=(value)
  end

  sig { void }
  def clear_name
  end

  sig { returns(String) }
  def type
  end

  sig { params(value: String).void }
  def type=(value)
  end

  sig { void }
  def clear_type
  end

  sig { returns(String) }
  def created_by
  end

  sig { params(value: String).void }
  def created_by=(value)
  end

  sig { void }
  def clear_created_by
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

class Trinsic::Services::Event::ItemReceived
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Trinsic::Services::Event::ItemReceived) }
  def self.decode(str)
  end

  sig { params(msg: Trinsic::Services::Event::ItemReceived).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Trinsic::Services::Event::ItemReceived) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Trinsic::Services::Event::ItemReceived, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      id: T.nilable(String),
      received: T.nilable(String)
    ).void
  end
  def initialize(
    id: "",
    received: ""
  )
  end

  sig { returns(String) }
  def id
  end

  sig { params(value: String).void }
  def id=(value)
  end

  sig { void }
  def clear_id
  end

  sig { returns(String) }
  def received
  end

  sig { params(value: String).void }
  def received=(value)
  end

  sig { void }
  def clear_received
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

module Trinsic::Services::Event::EventType
  self::PING = T.let(0, Integer)
  self::LOG = T.let(1, Integer)
  self::EGF_CREATED = T.let(5, Integer)
  self::EGF_MEMBER_REGISTERED = T.let(6, Integer)
  self::EGF_MEMBER_UNREGISTERED = T.let(7, Integer)
  self::TEMPLATE_CREATED = T.let(10, Integer)
  self::TEMPLATE_DELETED = T.let(11, Integer)
  self::WALLET_CREATED = T.let(15, Integer)
  self::ITEM_RECEIVED = T.let(16, Integer)
  self::CREDENTIAL_ISSUED = T.let(17, Integer)

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