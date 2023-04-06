// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.30.0
// 	protoc        v3.20.3
// source: sdk/options/v1/options.proto

package options

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// Configuration for Trinsic SDK Services
type TrinsicOptions struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Trinsic API endpoint. Defaults to `prod.trinsic.cloud`
	ServerEndpoint string `protobuf:"bytes,1,opt,name=server_endpoint,json=serverEndpoint,proto3" json:"server_endpoint,omitempty"`
	// Trinsic API port; defaults to `443`
	ServerPort int32 `protobuf:"varint,2,opt,name=server_port,json=serverPort,proto3" json:"server_port,omitempty"`
	// Whether TLS is enabled between SDK and Trinsic API; defaults to `true`
	ServerUseTls bool `protobuf:"varint,3,opt,name=server_use_tls,json=serverUseTls,proto3" json:"server_use_tls,omitempty"`
	// Authentication token for SDK calls; defaults to empty string (unauthenticated)
	AuthToken string `protobuf:"bytes,4,opt,name=auth_token,json=authToken,proto3" json:"auth_token,omitempty"`
}

func (x *TrinsicOptions) Reset() {
	*x = TrinsicOptions{}
	if protoimpl.UnsafeEnabled {
		mi := &file_sdk_options_v1_options_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TrinsicOptions) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TrinsicOptions) ProtoMessage() {}

func (x *TrinsicOptions) ProtoReflect() protoreflect.Message {
	mi := &file_sdk_options_v1_options_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TrinsicOptions.ProtoReflect.Descriptor instead.
func (*TrinsicOptions) Descriptor() ([]byte, []int) {
	return file_sdk_options_v1_options_proto_rawDescGZIP(), []int{0}
}

func (x *TrinsicOptions) GetServerEndpoint() string {
	if x != nil {
		return x.ServerEndpoint
	}
	return ""
}

func (x *TrinsicOptions) GetServerPort() int32 {
	if x != nil {
		return x.ServerPort
	}
	return 0
}

func (x *TrinsicOptions) GetServerUseTls() bool {
	if x != nil {
		return x.ServerUseTls
	}
	return false
}

func (x *TrinsicOptions) GetAuthToken() string {
	if x != nil {
		return x.AuthToken
	}
	return ""
}

var File_sdk_options_v1_options_proto protoreflect.FileDescriptor

var file_sdk_options_v1_options_proto_rawDesc = []byte{
	0x0a, 0x1c, 0x73, 0x64, 0x6b, 0x2f, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x76, 0x31,
	0x2f, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0e,
	0x73, 0x64, 0x6b, 0x2e, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x76, 0x31, 0x22, 0x9f,
	0x01, 0x0a, 0x0e, 0x54, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x12, 0x27, 0x0a, 0x0f, 0x73, 0x65, 0x72, 0x76, 0x65, 0x72, 0x5f, 0x65, 0x6e, 0x64, 0x70,
	0x6f, 0x69, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x73, 0x65, 0x72, 0x76,
	0x65, 0x72, 0x45, 0x6e, 0x64, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x12, 0x1f, 0x0a, 0x0b, 0x73, 0x65,
	0x72, 0x76, 0x65, 0x72, 0x5f, 0x70, 0x6f, 0x72, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52,
	0x0a, 0x73, 0x65, 0x72, 0x76, 0x65, 0x72, 0x50, 0x6f, 0x72, 0x74, 0x12, 0x24, 0x0a, 0x0e, 0x73,
	0x65, 0x72, 0x76, 0x65, 0x72, 0x5f, 0x75, 0x73, 0x65, 0x5f, 0x74, 0x6c, 0x73, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x08, 0x52, 0x0c, 0x73, 0x65, 0x72, 0x76, 0x65, 0x72, 0x55, 0x73, 0x65, 0x54, 0x6c,
	0x73, 0x12, 0x1d, 0x0a, 0x0a, 0x61, 0x75, 0x74, 0x68, 0x5f, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x18,
	0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x61, 0x75, 0x74, 0x68, 0x54, 0x6f, 0x6b, 0x65, 0x6e,
	0x42, 0x49, 0x0a, 0x16, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x64, 0x6b, 0x2e,
	0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x76, 0x31, 0x5a, 0x16, 0x73, 0x64, 0x6b, 0x2f,
	0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x76, 0x31, 0x2f, 0x6f, 0x70, 0x74, 0x69, 0x6f,
	0x6e, 0x73, 0xaa, 0x02, 0x16, 0x54, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x53, 0x64, 0x6b,
	0x2e, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x56, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_sdk_options_v1_options_proto_rawDescOnce sync.Once
	file_sdk_options_v1_options_proto_rawDescData = file_sdk_options_v1_options_proto_rawDesc
)

func file_sdk_options_v1_options_proto_rawDescGZIP() []byte {
	file_sdk_options_v1_options_proto_rawDescOnce.Do(func() {
		file_sdk_options_v1_options_proto_rawDescData = protoimpl.X.CompressGZIP(file_sdk_options_v1_options_proto_rawDescData)
	})
	return file_sdk_options_v1_options_proto_rawDescData
}

var file_sdk_options_v1_options_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_sdk_options_v1_options_proto_goTypes = []interface{}{
	(*TrinsicOptions)(nil), // 0: sdk.options.v1.TrinsicOptions
}
var file_sdk_options_v1_options_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_sdk_options_v1_options_proto_init() }
func file_sdk_options_v1_options_proto_init() {
	if File_sdk_options_v1_options_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_sdk_options_v1_options_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TrinsicOptions); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_sdk_options_v1_options_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_sdk_options_v1_options_proto_goTypes,
		DependencyIndexes: file_sdk_options_v1_options_proto_depIdxs,
		MessageInfos:      file_sdk_options_v1_options_proto_msgTypes,
	}.Build()
	File_sdk_options_v1_options_proto = out.File
	file_sdk_options_v1_options_proto_rawDesc = nil
	file_sdk_options_v1_options_proto_goTypes = nil
	file_sdk_options_v1_options_proto_depIdxs = nil
}
