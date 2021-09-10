// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.17.3
// source: models/CredentialTemplates.proto

package sdk

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

type CreateCredentialTemplateRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *CreateCredentialTemplateRequest) Reset() {
	*x = CreateCredentialTemplateRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_models_CredentialTemplates_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateCredentialTemplateRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateCredentialTemplateRequest) ProtoMessage() {}

func (x *CreateCredentialTemplateRequest) ProtoReflect() protoreflect.Message {
	mi := &file_models_CredentialTemplates_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateCredentialTemplateRequest.ProtoReflect.Descriptor instead.
func (*CreateCredentialTemplateRequest) Descriptor() ([]byte, []int) {
	return file_models_CredentialTemplates_proto_rawDescGZIP(), []int{0}
}

type CreateCredentialTemplateResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *CreateCredentialTemplateResponse) Reset() {
	*x = CreateCredentialTemplateResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_models_CredentialTemplates_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateCredentialTemplateResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateCredentialTemplateResponse) ProtoMessage() {}

func (x *CreateCredentialTemplateResponse) ProtoReflect() protoreflect.Message {
	mi := &file_models_CredentialTemplates_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateCredentialTemplateResponse.ProtoReflect.Descriptor instead.
func (*CreateCredentialTemplateResponse) Descriptor() ([]byte, []int) {
	return file_models_CredentialTemplates_proto_rawDescGZIP(), []int{1}
}

type ListCredentialTemplatesRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Query string `protobuf:"bytes,1,opt,name=query,proto3" json:"query,omitempty"`
}

func (x *ListCredentialTemplatesRequest) Reset() {
	*x = ListCredentialTemplatesRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_models_CredentialTemplates_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListCredentialTemplatesRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListCredentialTemplatesRequest) ProtoMessage() {}

func (x *ListCredentialTemplatesRequest) ProtoReflect() protoreflect.Message {
	mi := &file_models_CredentialTemplates_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListCredentialTemplatesRequest.ProtoReflect.Descriptor instead.
func (*ListCredentialTemplatesRequest) Descriptor() ([]byte, []int) {
	return file_models_CredentialTemplates_proto_rawDescGZIP(), []int{2}
}

func (x *ListCredentialTemplatesRequest) GetQuery() string {
	if x != nil {
		return x.Query
	}
	return ""
}

type ListCredentialTemplatesResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Templates []*CredentialTemplate `protobuf:"bytes,1,rep,name=templates,proto3" json:"templates,omitempty"`
}

func (x *ListCredentialTemplatesResponse) Reset() {
	*x = ListCredentialTemplatesResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_models_CredentialTemplates_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListCredentialTemplatesResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListCredentialTemplatesResponse) ProtoMessage() {}

func (x *ListCredentialTemplatesResponse) ProtoReflect() protoreflect.Message {
	mi := &file_models_CredentialTemplates_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListCredentialTemplatesResponse.ProtoReflect.Descriptor instead.
func (*ListCredentialTemplatesResponse) Descriptor() ([]byte, []int) {
	return file_models_CredentialTemplates_proto_rawDescGZIP(), []int{3}
}

func (x *ListCredentialTemplatesResponse) GetTemplates() []*CredentialTemplate {
	if x != nil {
		return x.Templates
	}
	return nil
}

type CredentialTemplate struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id          string   `protobuf:"bytes,1,opt,name=Id,proto3" json:"Id,omitempty"`
	Title       string   `protobuf:"bytes,2,opt,name=Title,proto3" json:"Title,omitempty"`
	Description string   `protobuf:"bytes,3,opt,name=Description,proto3" json:"Description,omitempty"`
	Contexts    []string `protobuf:"bytes,4,rep,name=Contexts,proto3" json:"Contexts,omitempty"`
	Schema      string   `protobuf:"bytes,5,opt,name=Schema,proto3" json:"Schema,omitempty"`
}

func (x *CredentialTemplate) Reset() {
	*x = CredentialTemplate{}
	if protoimpl.UnsafeEnabled {
		mi := &file_models_CredentialTemplates_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CredentialTemplate) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CredentialTemplate) ProtoMessage() {}

func (x *CredentialTemplate) ProtoReflect() protoreflect.Message {
	mi := &file_models_CredentialTemplates_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CredentialTemplate.ProtoReflect.Descriptor instead.
func (*CredentialTemplate) Descriptor() ([]byte, []int) {
	return file_models_CredentialTemplates_proto_rawDescGZIP(), []int{4}
}

func (x *CredentialTemplate) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *CredentialTemplate) GetTitle() string {
	if x != nil {
		return x.Title
	}
	return ""
}

func (x *CredentialTemplate) GetDescription() string {
	if x != nil {
		return x.Description
	}
	return ""
}

func (x *CredentialTemplate) GetContexts() []string {
	if x != nil {
		return x.Contexts
	}
	return nil
}

func (x *CredentialTemplate) GetSchema() string {
	if x != nil {
		return x.Schema
	}
	return ""
}

var File_models_CredentialTemplates_proto protoreflect.FileDescriptor

var file_models_CredentialTemplates_proto_rawDesc = []byte{
	0x0a, 0x20, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x73, 0x2f, 0x43, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74,
	0x69, 0x61, 0x6c, 0x54, 0x65, 0x6d, 0x70, 0x6c, 0x61, 0x74, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x10, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x73, 0x22, 0x21, 0x0a, 0x1f, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x43, 0x72,
	0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x54, 0x65, 0x6d, 0x70, 0x6c, 0x61, 0x74, 0x65,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x22, 0x22, 0x0a, 0x20, 0x43, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x43, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x54, 0x65, 0x6d, 0x70, 0x6c,
	0x61, 0x74, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x36, 0x0a, 0x1e, 0x4c,
	0x69, 0x73, 0x74, 0x43, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x54, 0x65, 0x6d,
	0x70, 0x6c, 0x61, 0x74, 0x65, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x14, 0x0a,
	0x05, 0x71, 0x75, 0x65, 0x72, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x71, 0x75,
	0x65, 0x72, 0x79, 0x22, 0x65, 0x0a, 0x1f, 0x4c, 0x69, 0x73, 0x74, 0x43, 0x72, 0x65, 0x64, 0x65,
	0x6e, 0x74, 0x69, 0x61, 0x6c, 0x54, 0x65, 0x6d, 0x70, 0x6c, 0x61, 0x74, 0x65, 0x73, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x42, 0x0a, 0x09, 0x74, 0x65, 0x6d, 0x70, 0x6c, 0x61,
	0x74, 0x65, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x24, 0x2e, 0x74, 0x72, 0x69, 0x6e,
	0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x43, 0x72, 0x65,
	0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x54, 0x65, 0x6d, 0x70, 0x6c, 0x61, 0x74, 0x65, 0x52,
	0x09, 0x74, 0x65, 0x6d, 0x70, 0x6c, 0x61, 0x74, 0x65, 0x73, 0x22, 0x90, 0x01, 0x0a, 0x12, 0x43,
	0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x54, 0x65, 0x6d, 0x70, 0x6c, 0x61, 0x74,
	0x65, 0x12, 0x0e, 0x0a, 0x02, 0x49, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x49,
	0x64, 0x12, 0x14, 0x0a, 0x05, 0x54, 0x69, 0x74, 0x6c, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x05, 0x54, 0x69, 0x74, 0x6c, 0x65, 0x12, 0x20, 0x0a, 0x0b, 0x44, 0x65, 0x73, 0x63, 0x72,
	0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x44, 0x65,
	0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x1a, 0x0a, 0x08, 0x43, 0x6f, 0x6e,
	0x74, 0x65, 0x78, 0x74, 0x73, 0x18, 0x04, 0x20, 0x03, 0x28, 0x09, 0x52, 0x08, 0x43, 0x6f, 0x6e,
	0x74, 0x65, 0x78, 0x74, 0x73, 0x12, 0x16, 0x0a, 0x06, 0x53, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x18,
	0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x53, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x42, 0x2d, 0x0a,
	0x10, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x73, 0x5a, 0x19, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x74, 0x72,
	0x69, 0x6e, 0x73, 0x69, 0x63, 0x2d, 0x69, 0x64, 0x2f, 0x73, 0x64, 0x6b, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_models_CredentialTemplates_proto_rawDescOnce sync.Once
	file_models_CredentialTemplates_proto_rawDescData = file_models_CredentialTemplates_proto_rawDesc
)

func file_models_CredentialTemplates_proto_rawDescGZIP() []byte {
	file_models_CredentialTemplates_proto_rawDescOnce.Do(func() {
		file_models_CredentialTemplates_proto_rawDescData = protoimpl.X.CompressGZIP(file_models_CredentialTemplates_proto_rawDescData)
	})
	return file_models_CredentialTemplates_proto_rawDescData
}

var file_models_CredentialTemplates_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_models_CredentialTemplates_proto_goTypes = []interface{}{
	(*CreateCredentialTemplateRequest)(nil),  // 0: trinsic.services.CreateCredentialTemplateRequest
	(*CreateCredentialTemplateResponse)(nil), // 1: trinsic.services.CreateCredentialTemplateResponse
	(*ListCredentialTemplatesRequest)(nil),   // 2: trinsic.services.ListCredentialTemplatesRequest
	(*ListCredentialTemplatesResponse)(nil),  // 3: trinsic.services.ListCredentialTemplatesResponse
	(*CredentialTemplate)(nil),               // 4: trinsic.services.CredentialTemplate
}
var file_models_CredentialTemplates_proto_depIdxs = []int32{
	4, // 0: trinsic.services.ListCredentialTemplatesResponse.templates:type_name -> trinsic.services.CredentialTemplate
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_models_CredentialTemplates_proto_init() }
func file_models_CredentialTemplates_proto_init() {
	if File_models_CredentialTemplates_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_models_CredentialTemplates_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateCredentialTemplateRequest); i {
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
		file_models_CredentialTemplates_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateCredentialTemplateResponse); i {
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
		file_models_CredentialTemplates_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListCredentialTemplatesRequest); i {
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
		file_models_CredentialTemplates_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListCredentialTemplatesResponse); i {
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
		file_models_CredentialTemplates_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CredentialTemplate); i {
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
			RawDescriptor: file_models_CredentialTemplates_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_models_CredentialTemplates_proto_goTypes,
		DependencyIndexes: file_models_CredentialTemplates_proto_depIdxs,
		MessageInfos:      file_models_CredentialTemplates_proto_msgTypes,
	}.Build()
	File_models_CredentialTemplates_proto = out.File
	file_models_CredentialTemplates_proto_rawDesc = nil
	file_models_CredentialTemplates_proto_goTypes = nil
	file_models_CredentialTemplates_proto_depIdxs = nil
}
