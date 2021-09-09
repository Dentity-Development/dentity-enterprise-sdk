// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: models/CredentialTemplates.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

struct Trinsic_Services_CreateCredentialTemplateRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Trinsic_Services_CreateCredentialTemplateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Trinsic_Services_ListCredentialTemplatesRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var query: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Trinsic_Services_ListCredentialTemplatesResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var templates: [Trinsic_Services_CredentialTemplate] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Trinsic_Services_CredentialTemplate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var title: String = String()

  var description_p: String = String()

  var contexts: [String] = []

  var schema: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "trinsic.services"

extension Trinsic_Services_CreateCredentialTemplateRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CreateCredentialTemplateRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Trinsic_Services_CreateCredentialTemplateRequest, rhs: Trinsic_Services_CreateCredentialTemplateRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Trinsic_Services_CreateCredentialTemplateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CreateCredentialTemplateResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Trinsic_Services_CreateCredentialTemplateResponse, rhs: Trinsic_Services_CreateCredentialTemplateResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Trinsic_Services_ListCredentialTemplatesRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ListCredentialTemplatesRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "query"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.query) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.query.isEmpty {
      try visitor.visitSingularStringField(value: self.query, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Trinsic_Services_ListCredentialTemplatesRequest, rhs: Trinsic_Services_ListCredentialTemplatesRequest) -> Bool {
    if lhs.query != rhs.query {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Trinsic_Services_ListCredentialTemplatesResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ListCredentialTemplatesResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "templates"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.templates) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.templates.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.templates, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Trinsic_Services_ListCredentialTemplatesResponse, rhs: Trinsic_Services_ListCredentialTemplatesResponse) -> Bool {
    if lhs.templates != rhs.templates {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Trinsic_Services_CredentialTemplate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CredentialTemplate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "Id"),
    2: .same(proto: "Title"),
    3: .same(proto: "Description"),
    4: .same(proto: "Contexts"),
    5: .same(proto: "Schema"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 4: try { try decoder.decodeRepeatedStringField(value: &self.contexts) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.schema) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 2)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 3)
    }
    if !self.contexts.isEmpty {
      try visitor.visitRepeatedStringField(value: self.contexts, fieldNumber: 4)
    }
    if !self.schema.isEmpty {
      try visitor.visitSingularStringField(value: self.schema, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Trinsic_Services_CredentialTemplate, rhs: Trinsic_Services_CredentialTemplate) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.contexts != rhs.contexts {return false}
    if lhs.schema != rhs.schema {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
