# Code generated by protoc-gen-rbi. DO NOT EDIT.
# source: services/verifiable-credentials/templates/v1/templates.proto
# typed: strict

class Services::Verifiablecredentials::Templates::V1::GetCredentialTemplateRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::GetCredentialTemplateRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::GetCredentialTemplateRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::GetCredentialTemplateRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::GetCredentialTemplateRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      id: T.nilable(String)
    ).void
  end
  def initialize(
    id: ""
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

class Services::Verifiablecredentials::Templates::V1::GetCredentialTemplateResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::GetCredentialTemplateResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::GetCredentialTemplateResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::GetCredentialTemplateResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::GetCredentialTemplateResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      template: T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateData)
    ).void
  end
  def initialize(
    template: nil
  )
  end

  sig { returns(T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateData)) }
  def template
  end

  sig { params(value: T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateData)).void }
  def template=(value)
  end

  sig { void }
  def clear_template
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

class Services::Verifiablecredentials::Templates::V1::SearchCredentialTemplatesRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::SearchCredentialTemplatesRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::SearchCredentialTemplatesRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::SearchCredentialTemplatesRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::SearchCredentialTemplatesRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      query: T.nilable(String),
      continuation_token: T.nilable(String)
    ).void
  end
  def initialize(
    query: "",
    continuation_token: ""
  )
  end

  sig { returns(String) }
  def query
  end

  sig { params(value: String).void }
  def query=(value)
  end

  sig { void }
  def clear_query
  end

  sig { returns(String) }
  def continuation_token
  end

  sig { params(value: String).void }
  def continuation_token=(value)
  end

  sig { void }
  def clear_continuation_token
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

class Services::Verifiablecredentials::Templates::V1::SearchCredentialTemplatesResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::SearchCredentialTemplatesResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::SearchCredentialTemplatesResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::SearchCredentialTemplatesResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::SearchCredentialTemplatesResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      items_json: T.nilable(String),
      has_more: T.nilable(T::Boolean),
      continuation_token: T.nilable(String)
    ).void
  end
  def initialize(
    items_json: "",
    has_more: false,
    continuation_token: ""
  )
  end

  sig { returns(String) }
  def items_json
  end

  sig { params(value: String).void }
  def items_json=(value)
  end

  sig { void }
  def clear_items_json
  end

  sig { returns(T::Boolean) }
  def has_more
  end

  sig { params(value: T::Boolean).void }
  def has_more=(value)
  end

  sig { void }
  def clear_has_more
  end

  sig { returns(String) }
  def continuation_token
  end

  sig { params(value: String).void }
  def continuation_token=(value)
  end

  sig { void }
  def clear_continuation_token
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

class Services::Verifiablecredentials::Templates::V1::ListCredentialTemplatesRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::ListCredentialTemplatesRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::ListCredentialTemplatesRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::ListCredentialTemplatesRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::ListCredentialTemplatesRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      query: T.nilable(String),
      continuation_token: T.nilable(String)
    ).void
  end
  def initialize(
    query: "",
    continuation_token: ""
  )
  end

  sig { returns(String) }
  def query
  end

  sig { params(value: String).void }
  def query=(value)
  end

  sig { void }
  def clear_query
  end

  sig { returns(String) }
  def continuation_token
  end

  sig { params(value: String).void }
  def continuation_token=(value)
  end

  sig { void }
  def clear_continuation_token
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

class Services::Verifiablecredentials::Templates::V1::ListCredentialTemplatesResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::ListCredentialTemplatesResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::ListCredentialTemplatesResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::ListCredentialTemplatesResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::ListCredentialTemplatesResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      templates: T.nilable(T::Array[T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateData)]),
      has_more_results: T.nilable(T::Boolean),
      continuation_token: T.nilable(String)
    ).void
  end
  def initialize(
    templates: [],
    has_more_results: false,
    continuation_token: ""
  )
  end

  sig { returns(T::Array[T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateData)]) }
  def templates
  end

  sig { params(value: Google::Protobuf::RepeatedField).void }
  def templates=(value)
  end

  sig { void }
  def clear_templates
  end

  sig { returns(T::Boolean) }
  def has_more_results
  end

  sig { params(value: T::Boolean).void }
  def has_more_results=(value)
  end

  sig { void }
  def clear_has_more_results
  end

  sig { returns(String) }
  def continuation_token
  end

  sig { params(value: String).void }
  def continuation_token=(value)
  end

  sig { void }
  def clear_continuation_token
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

class Services::Verifiablecredentials::Templates::V1::DeleteCredentialTemplateRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::DeleteCredentialTemplateRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::DeleteCredentialTemplateRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::DeleteCredentialTemplateRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::DeleteCredentialTemplateRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      id: T.nilable(String)
    ).void
  end
  def initialize(
    id: ""
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

class Services::Verifiablecredentials::Templates::V1::DeleteCredentialTemplateResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::DeleteCredentialTemplateResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::DeleteCredentialTemplateResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::DeleteCredentialTemplateResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::DeleteCredentialTemplateResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
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

class Services::Verifiablecredentials::Templates::V1::CreateCredentialTemplateRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::CreateCredentialTemplateRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::CreateCredentialTemplateRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::CreateCredentialTemplateRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::CreateCredentialTemplateRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      name: T.nilable(String),
      fields: T.nilable(T::Hash[String, T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateField)]),
      allow_additional_fields: T.nilable(T::Boolean)
    ).void
  end
  def initialize(
    name: "",
    fields: Google::Protobuf::Map.new(:string, :message, Services::Verifiablecredentials::Templates::V1::TemplateField),
    allow_additional_fields: false
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

  sig { returns(T::Hash[String, T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateField)]) }
  def fields
  end

  sig { params(value: Google::Protobuf::Map).void }
  def fields=(value)
  end

  sig { void }
  def clear_fields
  end

  sig { returns(T::Boolean) }
  def allow_additional_fields
  end

  sig { params(value: T::Boolean).void }
  def allow_additional_fields=(value)
  end

  sig { void }
  def clear_allow_additional_fields
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

class Services::Verifiablecredentials::Templates::V1::CreateCredentialTemplateResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::CreateCredentialTemplateResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::CreateCredentialTemplateResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::CreateCredentialTemplateResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::CreateCredentialTemplateResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      data: T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateData)
    ).void
  end
  def initialize(
    data: nil
  )
  end

  sig { returns(T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateData)) }
  def data
  end

  sig { params(value: T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateData)).void }
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

class Services::Verifiablecredentials::Templates::V1::TemplateField
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::TemplateField) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::TemplateField).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::TemplateField) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::TemplateField, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      description: T.nilable(String),
      optional: T.nilable(T::Boolean),
      type: T.nilable(T.any(Symbol, String, Integer)),
      annotations: T.nilable(T::Hash[String, String])
    ).void
  end
  def initialize(
    description: "",
    optional: false,
    type: :STRING,
    annotations: Google::Protobuf::Map.new(:string, :string)
  )
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

  sig { returns(T::Boolean) }
  def optional
  end

  sig { params(value: T::Boolean).void }
  def optional=(value)
  end

  sig { void }
  def clear_optional
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

  sig { returns(T::Hash[String, String]) }
  def annotations
  end

  sig { params(value: Google::Protobuf::Map).void }
  def annotations=(value)
  end

  sig { void }
  def clear_annotations
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

class Services::Verifiablecredentials::Templates::V1::GetTemplateRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::GetTemplateRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::GetTemplateRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::GetTemplateRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::GetTemplateRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      id: T.nilable(String)
    ).void
  end
  def initialize(
    id: ""
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

class Services::Verifiablecredentials::Templates::V1::GetTemplateResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::GetTemplateResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::GetTemplateResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::GetTemplateResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::GetTemplateResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      data: T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateData)
    ).void
  end
  def initialize(
    data: nil
  )
  end

  sig { returns(T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateData)) }
  def data
  end

  sig { params(value: T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateData)).void }
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

class Services::Verifiablecredentials::Templates::V1::ListTemplatesRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::ListTemplatesRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::ListTemplatesRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::ListTemplatesRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::ListTemplatesRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
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

class Services::Verifiablecredentials::Templates::V1::ListTemplatesResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::ListTemplatesResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::ListTemplatesResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::ListTemplatesResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::ListTemplatesResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      templates: T.nilable(T::Array[T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateData)])
    ).void
  end
  def initialize(
    templates: []
  )
  end

  sig { returns(T::Array[T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateData)]) }
  def templates
  end

  sig { params(value: Google::Protobuf::RepeatedField).void }
  def templates=(value)
  end

  sig { void }
  def clear_templates
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

class Services::Verifiablecredentials::Templates::V1::TemplateData
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Verifiablecredentials::Templates::V1::TemplateData) }
  def self.decode(str)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::TemplateData).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Verifiablecredentials::Templates::V1::TemplateData) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Verifiablecredentials::Templates::V1::TemplateData, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      id: T.nilable(String),
      name: T.nilable(String),
      version: T.nilable(Integer),
      fields: T.nilable(T::Hash[String, T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateField)]),
      allow_additional_fields: T.nilable(T::Boolean),
      schema_uri: T.nilable(String),
      context_uri: T.nilable(String),
      ecosystem_id: T.nilable(String),
      type: T.nilable(String),
      created_by: T.nilable(String),
      date_created: T.nilable(String)
    ).void
  end
  def initialize(
    id: "",
    name: "",
    version: 0,
    fields: Google::Protobuf::Map.new(:string, :message, Services::Verifiablecredentials::Templates::V1::TemplateField),
    allow_additional_fields: false,
    schema_uri: "",
    context_uri: "",
    ecosystem_id: "",
    type: "",
    created_by: "",
    date_created: ""
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

  sig { returns(Integer) }
  def version
  end

  sig { params(value: Integer).void }
  def version=(value)
  end

  sig { void }
  def clear_version
  end

  sig { returns(T::Hash[String, T.nilable(Services::Verifiablecredentials::Templates::V1::TemplateField)]) }
  def fields
  end

  sig { params(value: Google::Protobuf::Map).void }
  def fields=(value)
  end

  sig { void }
  def clear_fields
  end

  sig { returns(T::Boolean) }
  def allow_additional_fields
  end

  sig { params(value: T::Boolean).void }
  def allow_additional_fields=(value)
  end

  sig { void }
  def clear_allow_additional_fields
  end

  sig { returns(String) }
  def schema_uri
  end

  sig { params(value: String).void }
  def schema_uri=(value)
  end

  sig { void }
  def clear_schema_uri
  end

  sig { returns(String) }
  def context_uri
  end

  sig { params(value: String).void }
  def context_uri=(value)
  end

  sig { void }
  def clear_context_uri
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

  sig { returns(String) }
  def date_created
  end

  sig { params(value: String).void }
  def date_created=(value)
  end

  sig { void }
  def clear_date_created
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

module Services::Verifiablecredentials::Templates::V1::FieldType
  self::STRING = T.let(0, Integer)
  self::NUMBER = T.let(1, Integer)
  self::BOOL = T.let(2, Integer)
  self::DATETIME = T.let(4, Integer)
  self::URI = T.let(5, Integer)

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