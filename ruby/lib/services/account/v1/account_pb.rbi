# Code generated by protoc-gen-rbi. DO NOT EDIT.
# source: services/account/v1/account.proto
# typed: strict

class Services::Account::V1::SignInRequest
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::SignInRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::SignInRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::SignInRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::SignInRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      details: T.nilable(Services::Account::V1::AccountDetails),
      invitation_code: T.nilable(String),
      ecosystem_id: T.nilable(String)
    ).void
  end
  def initialize(
    details: nil,
    invitation_code: "",
    ecosystem_id: ""
  )
  end

  sig { returns(T.nilable(Services::Account::V1::AccountDetails)) }
  def details
  end

  sig { params(value: T.nilable(Services::Account::V1::AccountDetails)).void }
  def details=(value)
  end

  sig { void }
  def clear_details
  end

  sig { returns(String) }
  def invitation_code
  end

  sig { params(value: String).void }
  def invitation_code=(value)
  end

  sig { void }
  def clear_invitation_code
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

class Services::Account::V1::AccountDetails
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::AccountDetails) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::AccountDetails).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::AccountDetails) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::AccountDetails, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      name: T.nilable(String),
      email: T.nilable(String),
      sms: T.nilable(String)
    ).void
  end
  def initialize(
    name: "",
    email: "",
    sms: ""
  )
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
  def email
  end

  sig { params(value: String).void }
  def email=(value)
  end

  sig { void }
  def clear_email
  end

  sig { returns(String) }
  def sms
  end

  sig { params(value: String).void }
  def sms=(value)
  end

  sig { void }
  def clear_sms
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

class Services::Account::V1::SignInResponse
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::SignInResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::SignInResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::SignInResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::SignInResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      confirmation_method: T.nilable(T.any(Symbol, String, Integer)),
      profile: T.nilable(Services::Account::V1::AccountProfile)
    ).void
  end
  def initialize(
    confirmation_method: :None,
    profile: nil
  )
  end

  sig { returns(Symbol) }
  def confirmation_method
  end

  sig { params(value: T.any(Symbol, String, Integer)).void }
  def confirmation_method=(value)
  end

  sig { void }
  def clear_confirmation_method
  end

  sig { returns(T.nilable(Services::Account::V1::AccountProfile)) }
  def profile
  end

  sig { params(value: T.nilable(Services::Account::V1::AccountProfile)).void }
  def profile=(value)
  end

  sig { void }
  def clear_profile
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

class Services::Account::V1::AccountProfile
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::AccountProfile) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::AccountProfile).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::AccountProfile) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::AccountProfile, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      profile_type: T.nilable(String),
      auth_data: T.nilable(String),
      auth_token: T.nilable(String),
      protection: T.nilable(Services::Account::V1::TokenProtection)
    ).void
  end
  def initialize(
    profile_type: "",
    auth_data: "",
    auth_token: "",
    protection: nil
  )
  end

  sig { returns(String) }
  def profile_type
  end

  sig { params(value: String).void }
  def profile_type=(value)
  end

  sig { void }
  def clear_profile_type
  end

  sig { returns(String) }
  def auth_data
  end

  sig { params(value: String).void }
  def auth_data=(value)
  end

  sig { void }
  def clear_auth_data
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

  sig { returns(T.nilable(Services::Account::V1::TokenProtection)) }
  def protection
  end

  sig { params(value: T.nilable(Services::Account::V1::TokenProtection)).void }
  def protection=(value)
  end

  sig { void }
  def clear_protection
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

class Services::Account::V1::TokenProtection
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::TokenProtection) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::TokenProtection).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::TokenProtection) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::TokenProtection, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      enabled: T.nilable(T::Boolean),
      method: T.nilable(T.any(Symbol, String, Integer))
    ).void
  end
  def initialize(
    enabled: false,
    method: :None
  )
  end

  sig { returns(T::Boolean) }
  def enabled
  end

  sig { params(value: T::Boolean).void }
  def enabled=(value)
  end

  sig { void }
  def clear_enabled
  end

  sig { returns(Symbol) }
  def method
  end

  sig { params(value: T.any(Symbol, String, Integer)).void }
  def method=(value)
  end

  sig { void }
  def clear_method
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

class Services::Account::V1::AccountInfoRequest
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::AccountInfoRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::AccountInfoRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::AccountInfoRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::AccountInfoRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig {void}
  def initialize; end

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

class Services::Account::V1::AccountInfoResponse
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::AccountInfoResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::AccountInfoResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::AccountInfoResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::AccountInfoResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      details: T.nilable(Services::Account::V1::AccountDetails),
      ecosystems: T.nilable(T::Array[T.nilable(Services::Account::V1::AccountEcosystem)]),
      wallet_id: T.nilable(String),
      device_id: T.nilable(String),
      ecosystem_id: T.nilable(String),
      public_did: T.nilable(String),
      authorized_webhooks: T.nilable(T::Array[String])
    ).void
  end
  def initialize(
    details: nil,
    ecosystems: [],
    wallet_id: "",
    device_id: "",
    ecosystem_id: "",
    public_did: "",
    authorized_webhooks: []
  )
  end

  sig { returns(T.nilable(Services::Account::V1::AccountDetails)) }
  def details
  end

  sig { params(value: T.nilable(Services::Account::V1::AccountDetails)).void }
  def details=(value)
  end

  sig { void }
  def clear_details
  end

  sig { returns(T::Array[T.nilable(Services::Account::V1::AccountEcosystem)]) }
  def ecosystems
  end

  sig { params(value: ::Google::Protobuf::RepeatedField).void }
  def ecosystems=(value)
  end

  sig { void }
  def clear_ecosystems
  end

  sig { returns(String) }
  def wallet_id
  end

  sig { params(value: String).void }
  def wallet_id=(value)
  end

  sig { void }
  def clear_wallet_id
  end

  sig { returns(String) }
  def device_id
  end

  sig { params(value: String).void }
  def device_id=(value)
  end

  sig { void }
  def clear_device_id
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
  def public_did
  end

  sig { params(value: String).void }
  def public_did=(value)
  end

  sig { void }
  def clear_public_did
  end

  sig { returns(T::Array[String]) }
  def authorized_webhooks
  end

  sig { params(value: ::Google::Protobuf::RepeatedField).void }
  def authorized_webhooks=(value)
  end

  sig { void }
  def clear_authorized_webhooks
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

class Services::Account::V1::ListDevicesRequest
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::ListDevicesRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::ListDevicesRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::ListDevicesRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::ListDevicesRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig {void}
  def initialize; end

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

class Services::Account::V1::ListDevicesResponse
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::ListDevicesResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::ListDevicesResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::ListDevicesResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::ListDevicesResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig {void}
  def initialize; end

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

class Services::Account::V1::RevokeDeviceRequest
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::RevokeDeviceRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::RevokeDeviceRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::RevokeDeviceRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::RevokeDeviceRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig {void}
  def initialize; end

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

class Services::Account::V1::RevokeDeviceResponse
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::RevokeDeviceResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::RevokeDeviceResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::RevokeDeviceResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::RevokeDeviceResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig {void}
  def initialize; end

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

class Services::Account::V1::AccountEcosystem
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::AccountEcosystem) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::AccountEcosystem).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::AccountEcosystem) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::AccountEcosystem, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      id: T.nilable(String),
      name: T.nilable(String),
      description: T.nilable(String),
      uri: T.nilable(String)
    ).void
  end
  def initialize(
    id: "",
    name: "",
    description: "",
    uri: ""
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
  def uri
  end

  sig { params(value: String).void }
  def uri=(value)
  end

  sig { void }
  def clear_uri
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

class Services::Account::V1::LoginRequest
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::LoginRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::LoginRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::LoginRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::LoginRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      email: T.nilable(String),
      invitation_code: T.nilable(String),
      ecosystem_id: T.nilable(String)
    ).void
  end
  def initialize(
    email: "",
    invitation_code: "",
    ecosystem_id: ""
  )
  end

  sig { returns(String) }
  def email
  end

  sig { params(value: String).void }
  def email=(value)
  end

  sig { void }
  def clear_email
  end

  sig { returns(String) }
  def invitation_code
  end

  sig { params(value: String).void }
  def invitation_code=(value)
  end

  sig { void }
  def clear_invitation_code
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

class Services::Account::V1::LoginResponse
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::LoginResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::LoginResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::LoginResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::LoginResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      challenge: T.nilable(String),
      profile: T.nilable(Services::Account::V1::AccountProfile)
    ).void
  end
  def initialize(
    challenge: "",
    profile: nil
  )
  end

  sig { returns(String) }
  def challenge
  end

  sig { params(value: String).void }
  def challenge=(value)
  end

  sig { void }
  def clear_challenge
  end

  sig { returns(T.nilable(Services::Account::V1::AccountProfile)) }
  def profile
  end

  sig { params(value: T.nilable(Services::Account::V1::AccountProfile)).void }
  def profile=(value)
  end

  sig { void }
  def clear_profile
  end

  sig { returns(T.nilable(Symbol)) }
  def response
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

class Services::Account::V1::LoginConfirmRequest
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::LoginConfirmRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::LoginConfirmRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::LoginConfirmRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::LoginConfirmRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      challenge: T.nilable(String),
      confirmation_code_hashed: T.nilable(String)
    ).void
  end
  def initialize(
    challenge: "",
    confirmation_code_hashed: ""
  )
  end

  sig { returns(String) }
  def challenge
  end

  sig { params(value: String).void }
  def challenge=(value)
  end

  sig { void }
  def clear_challenge
  end

  sig { returns(String) }
  def confirmation_code_hashed
  end

  sig { params(value: String).void }
  def confirmation_code_hashed=(value)
  end

  sig { void }
  def clear_confirmation_code_hashed
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

class Services::Account::V1::LoginConfirmResponse
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::LoginConfirmResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::LoginConfirmResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::LoginConfirmResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::LoginConfirmResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      profile: T.nilable(Services::Account::V1::AccountProfile)
    ).void
  end
  def initialize(
    profile: nil
  )
  end

  sig { returns(T.nilable(Services::Account::V1::AccountProfile)) }
  def profile
  end

  sig { params(value: T.nilable(Services::Account::V1::AccountProfile)).void }
  def profile=(value)
  end

  sig { void }
  def clear_profile
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

class Services::Account::V1::AuthorizeWebhookRequest
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::AuthorizeWebhookRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::AuthorizeWebhookRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::AuthorizeWebhookRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::AuthorizeWebhookRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      events: T.nilable(T::Array[String])
    ).void
  end
  def initialize(
    events: []
  )
  end

  sig { returns(T::Array[String]) }
  def events
  end

  sig { params(value: ::Google::Protobuf::RepeatedField).void }
  def events=(value)
  end

  sig { void }
  def clear_events
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

class Services::Account::V1::AuthorizeWebhookResponse
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Account::V1::AuthorizeWebhookResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Account::V1::AuthorizeWebhookResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Account::V1::AuthorizeWebhookResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Account::V1::AuthorizeWebhookResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig {void}
  def initialize; end

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

module Services::Account::V1::ConfirmationMethod
  self::None = T.let(0, Integer)
  self::Email = T.let(1, Integer)
  self::Sms = T.let(2, Integer)
  self::ConnectedDevice = T.let(3, Integer)
  self::Other = T.let(10, Integer)

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
