// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: sdk/options/v1/options.proto
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
private struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
    struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
    typealias Version = _2
}

/// Configuration for Trinsic SDK Services
public struct Sdk_Options_V1_ServiceOptions {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    /// Trinsic API endpoint. Defaults to `prod.trinsic.cloud`
    public var serverEndpoint: String = .init()

    /// Trinsic API port; defaults to `443`
    public var serverPort: Int32 = 0

    /// Whether TLS is enabled between SDK and Trinsic API; defaults to `true`
    public var serverUseTls: Bool = false

    /// Authentication token for SDK calls; defaults to empty string (unauthenticated)
    public var authToken: String = .init()

    /// Default ecosystem ID to use for various SDK calls; defaults to `default`
    public var defaultEcosystem: String = .init()

    public var unknownFields = SwiftProtobuf.UnknownStorage()

    public init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
    extension Sdk_Options_V1_ServiceOptions: @unchecked Sendable {}
#endif // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

private let _protobuf_package = "sdk.options.v1"

extension Sdk_Options_V1_ServiceOptions: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
    public static let protoMessageName: String = _protobuf_package + ".ServiceOptions"
    public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
        1: .standard(proto: "server_endpoint"),
        2: .standard(proto: "server_port"),
        3: .standard(proto: "server_use_tls"),
        4: .standard(proto: "auth_token"),
        5: .standard(proto: "default_ecosystem"),
    ]

    public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
        while let fieldNumber = try decoder.nextFieldNumber() {
            // The use of inline closures is to circumvent an issue where the compiler
            // allocates stack space for every case branch when no optimizations are
            // enabled. https://github.com/apple/swift-protobuf/issues/1034
            switch fieldNumber {
            case 1: try try decoder.decodeSingularStringField(value: &serverEndpoint)
            case 2: try try decoder.decodeSingularInt32Field(value: &serverPort)
            case 3: try try decoder.decodeSingularBoolField(value: &serverUseTls)
            case 4: try try decoder.decodeSingularStringField(value: &authToken)
            case 5: try try decoder.decodeSingularStringField(value: &defaultEcosystem)
            default: break
            }
        }
    }

    public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
        if !serverEndpoint.isEmpty {
            try visitor.visitSingularStringField(value: serverEndpoint, fieldNumber: 1)
        }
        if serverPort != 0 {
            try visitor.visitSingularInt32Field(value: serverPort, fieldNumber: 2)
        }
        if serverUseTls != false {
            try visitor.visitSingularBoolField(value: serverUseTls, fieldNumber: 3)
        }
        if !authToken.isEmpty {
            try visitor.visitSingularStringField(value: authToken, fieldNumber: 4)
        }
        if !defaultEcosystem.isEmpty {
            try visitor.visitSingularStringField(value: defaultEcosystem, fieldNumber: 5)
        }
        try unknownFields.traverse(visitor: &visitor)
    }

    public static func == (lhs: Sdk_Options_V1_ServiceOptions, rhs: Sdk_Options_V1_ServiceOptions) -> Bool {
        if lhs.serverEndpoint != rhs.serverEndpoint { return false }
        if lhs.serverPort != rhs.serverPort { return false }
        if lhs.serverUseTls != rhs.serverUseTls { return false }
        if lhs.authToken != rhs.authToken { return false }
        if lhs.defaultEcosystem != rhs.defaultEcosystem { return false }
        if lhs.unknownFields != rhs.unknownFields { return false }
        return true
    }
}
