// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.17.3
// source: IssuerService.proto

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

type IssueRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Document *JsonPayload `protobuf:"bytes,1,opt,name=document,proto3" json:"document,omitempty"`
}

func (x *IssueRequest) Reset() {
	*x = IssueRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_IssuerService_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IssueRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IssueRequest) ProtoMessage() {}

func (x *IssueRequest) ProtoReflect() protoreflect.Message {
	mi := &file_IssuerService_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use IssueRequest.ProtoReflect.Descriptor instead.
func (*IssueRequest) Descriptor() ([]byte, []int) {
	return file_IssuerService_proto_rawDescGZIP(), []int{0}
}

func (x *IssueRequest) GetDocument() *JsonPayload {
	if x != nil {
		return x.Document
	}
	return nil
}

type IssueResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Document *JsonPayload `protobuf:"bytes,1,opt,name=document,proto3" json:"document,omitempty"`
}

func (x *IssueResponse) Reset() {
	*x = IssueResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_IssuerService_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IssueResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IssueResponse) ProtoMessage() {}

func (x *IssueResponse) ProtoReflect() protoreflect.Message {
	mi := &file_IssuerService_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use IssueResponse.ProtoReflect.Descriptor instead.
func (*IssueResponse) Descriptor() ([]byte, []int) {
	return file_IssuerService_proto_rawDescGZIP(), []int{1}
}

func (x *IssueResponse) GetDocument() *JsonPayload {
	if x != nil {
		return x.Document
	}
	return nil
}

// Create Proof
type CreateProofRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	RevealDocument *JsonPayload `protobuf:"bytes,1,opt,name=reveal_document,json=revealDocument,proto3" json:"reveal_document,omitempty"`
	DocumentId     string       `protobuf:"bytes,2,opt,name=document_id,json=documentId,proto3" json:"document_id,omitempty"`
}

func (x *CreateProofRequest) Reset() {
	*x = CreateProofRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_IssuerService_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateProofRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateProofRequest) ProtoMessage() {}

func (x *CreateProofRequest) ProtoReflect() protoreflect.Message {
	mi := &file_IssuerService_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateProofRequest.ProtoReflect.Descriptor instead.
func (*CreateProofRequest) Descriptor() ([]byte, []int) {
	return file_IssuerService_proto_rawDescGZIP(), []int{2}
}

func (x *CreateProofRequest) GetRevealDocument() *JsonPayload {
	if x != nil {
		return x.RevealDocument
	}
	return nil
}

func (x *CreateProofRequest) GetDocumentId() string {
	if x != nil {
		return x.DocumentId
	}
	return ""
}

type CreateProofResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ProofDocument *JsonPayload `protobuf:"bytes,1,opt,name=proof_document,json=proofDocument,proto3" json:"proof_document,omitempty"`
}

func (x *CreateProofResponse) Reset() {
	*x = CreateProofResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_IssuerService_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateProofResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateProofResponse) ProtoMessage() {}

func (x *CreateProofResponse) ProtoReflect() protoreflect.Message {
	mi := &file_IssuerService_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateProofResponse.ProtoReflect.Descriptor instead.
func (*CreateProofResponse) Descriptor() ([]byte, []int) {
	return file_IssuerService_proto_rawDescGZIP(), []int{3}
}

func (x *CreateProofResponse) GetProofDocument() *JsonPayload {
	if x != nil {
		return x.ProofDocument
	}
	return nil
}

// Verify Proof
type VerifyProofRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ProofDocument *JsonPayload `protobuf:"bytes,1,opt,name=proof_document,json=proofDocument,proto3" json:"proof_document,omitempty"`
}

func (x *VerifyProofRequest) Reset() {
	*x = VerifyProofRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_IssuerService_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *VerifyProofRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*VerifyProofRequest) ProtoMessage() {}

func (x *VerifyProofRequest) ProtoReflect() protoreflect.Message {
	mi := &file_IssuerService_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use VerifyProofRequest.ProtoReflect.Descriptor instead.
func (*VerifyProofRequest) Descriptor() ([]byte, []int) {
	return file_IssuerService_proto_rawDescGZIP(), []int{4}
}

func (x *VerifyProofRequest) GetProofDocument() *JsonPayload {
	if x != nil {
		return x.ProofDocument
	}
	return nil
}

type VerifyProofResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Valid bool `protobuf:"varint,1,opt,name=valid,proto3" json:"valid,omitempty"`
}

func (x *VerifyProofResponse) Reset() {
	*x = VerifyProofResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_IssuerService_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *VerifyProofResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*VerifyProofResponse) ProtoMessage() {}

func (x *VerifyProofResponse) ProtoReflect() protoreflect.Message {
	mi := &file_IssuerService_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use VerifyProofResponse.ProtoReflect.Descriptor instead.
func (*VerifyProofResponse) Descriptor() ([]byte, []int) {
	return file_IssuerService_proto_rawDescGZIP(), []int{5}
}

func (x *VerifyProofResponse) GetValid() bool {
	if x != nil {
		return x.Valid
	}
	return false
}

type SendRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to DeliveryMethod:
	//	*SendRequest_Email
	//	*SendRequest_DidUri
	//	*SendRequest_DidcommInvitation
	DeliveryMethod isSendRequest_DeliveryMethod `protobuf_oneof:"delivery_method"`
	Document       *JsonPayload                 `protobuf:"bytes,100,opt,name=document,proto3" json:"document,omitempty"`
}

func (x *SendRequest) Reset() {
	*x = SendRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_IssuerService_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SendRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SendRequest) ProtoMessage() {}

func (x *SendRequest) ProtoReflect() protoreflect.Message {
	mi := &file_IssuerService_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SendRequest.ProtoReflect.Descriptor instead.
func (*SendRequest) Descriptor() ([]byte, []int) {
	return file_IssuerService_proto_rawDescGZIP(), []int{6}
}

func (m *SendRequest) GetDeliveryMethod() isSendRequest_DeliveryMethod {
	if m != nil {
		return m.DeliveryMethod
	}
	return nil
}

func (x *SendRequest) GetEmail() string {
	if x, ok := x.GetDeliveryMethod().(*SendRequest_Email); ok {
		return x.Email
	}
	return ""
}

func (x *SendRequest) GetDidUri() string {
	if x, ok := x.GetDeliveryMethod().(*SendRequest_DidUri); ok {
		return x.DidUri
	}
	return ""
}

func (x *SendRequest) GetDidcommInvitation() *JsonPayload {
	if x, ok := x.GetDeliveryMethod().(*SendRequest_DidcommInvitation); ok {
		return x.DidcommInvitation
	}
	return nil
}

func (x *SendRequest) GetDocument() *JsonPayload {
	if x != nil {
		return x.Document
	}
	return nil
}

type isSendRequest_DeliveryMethod interface {
	isSendRequest_DeliveryMethod()
}

type SendRequest_Email struct {
	Email string `protobuf:"bytes,1,opt,name=email,proto3,oneof"`
}

type SendRequest_DidUri struct {
	DidUri string `protobuf:"bytes,2,opt,name=did_uri,json=didUri,proto3,oneof"`
}

type SendRequest_DidcommInvitation struct {
	DidcommInvitation *JsonPayload `protobuf:"bytes,3,opt,name=didcomm_invitation,json=didcommInvitation,proto3,oneof"`
}

func (*SendRequest_Email) isSendRequest_DeliveryMethod() {}

func (*SendRequest_DidUri) isSendRequest_DeliveryMethod() {}

func (*SendRequest_DidcommInvitation) isSendRequest_DeliveryMethod() {}

type SendResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Status ResponseStatus `protobuf:"varint,1,opt,name=status,proto3,enum=trinsic.services.ResponseStatus" json:"status,omitempty"`
}

func (x *SendResponse) Reset() {
	*x = SendResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_IssuerService_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SendResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SendResponse) ProtoMessage() {}

func (x *SendResponse) ProtoReflect() protoreflect.Message {
	mi := &file_IssuerService_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SendResponse.ProtoReflect.Descriptor instead.
func (*SendResponse) Descriptor() ([]byte, []int) {
	return file_IssuerService_proto_rawDescGZIP(), []int{7}
}

func (x *SendResponse) GetStatus() ResponseStatus {
	if x != nil {
		return x.Status
	}
	return ResponseStatus_SUCCESS
}

var File_IssuerService_proto protoreflect.FileDescriptor

var file_IssuerService_proto_rawDesc = []byte{
	0x0a, 0x13, 0x49, 0x73, 0x73, 0x75, 0x65, 0x72, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x10, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x1a, 0x11, 0x43, 0x6f, 0x72, 0x65, 0x53, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x49, 0x0a, 0x0c, 0x49, 0x73,
	0x73, 0x75, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x39, 0x0a, 0x08, 0x64, 0x6f,
	0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x74,
	0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e,
	0x4a, 0x73, 0x6f, 0x6e, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x52, 0x08, 0x64, 0x6f, 0x63,
	0x75, 0x6d, 0x65, 0x6e, 0x74, 0x22, 0x4a, 0x0a, 0x0d, 0x49, 0x73, 0x73, 0x75, 0x65, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x39, 0x0a, 0x08, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65,
	0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x74, 0x72, 0x69, 0x6e, 0x73,
	0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4a, 0x73, 0x6f, 0x6e,
	0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x52, 0x08, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e,
	0x74, 0x22, 0x7d, 0x0a, 0x12, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x50, 0x72, 0x6f, 0x6f, 0x66,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x46, 0x0a, 0x0f, 0x72, 0x65, 0x76, 0x65, 0x61,
	0x6c, 0x5f, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x1d, 0x2e, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x73, 0x2e, 0x4a, 0x73, 0x6f, 0x6e, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x52,
	0x0e, 0x72, 0x65, 0x76, 0x65, 0x61, 0x6c, 0x44, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x12,
	0x1f, 0x0a, 0x0b, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x49, 0x64,
	0x22, 0x5b, 0x0a, 0x13, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x50, 0x72, 0x6f, 0x6f, 0x66, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x44, 0x0a, 0x0e, 0x70, 0x72, 0x6f, 0x6f, 0x66,
	0x5f, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x1d, 0x2e, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2e, 0x4a, 0x73, 0x6f, 0x6e, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x52, 0x0d,
	0x70, 0x72, 0x6f, 0x6f, 0x66, 0x44, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x22, 0x5a, 0x0a,
	0x12, 0x56, 0x65, 0x72, 0x69, 0x66, 0x79, 0x50, 0x72, 0x6f, 0x6f, 0x66, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x12, 0x44, 0x0a, 0x0e, 0x70, 0x72, 0x6f, 0x6f, 0x66, 0x5f, 0x64, 0x6f, 0x63,
	0x75, 0x6d, 0x65, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x74, 0x72,
	0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4a,
	0x73, 0x6f, 0x6e, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x52, 0x0d, 0x70, 0x72, 0x6f, 0x6f,
	0x66, 0x44, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x22, 0x2b, 0x0a, 0x13, 0x56, 0x65, 0x72,
	0x69, 0x66, 0x79, 0x50, 0x72, 0x6f, 0x6f, 0x66, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x12, 0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x08, 0x52,
	0x05, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x22, 0xde, 0x01, 0x0a, 0x0b, 0x53, 0x65, 0x6e, 0x64, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x16, 0x0a, 0x05, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x05, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x12, 0x19,
	0x0a, 0x07, 0x64, 0x69, 0x64, 0x5f, 0x75, 0x72, 0x69, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x48,
	0x00, 0x52, 0x06, 0x64, 0x69, 0x64, 0x55, 0x72, 0x69, 0x12, 0x4e, 0x0a, 0x12, 0x64, 0x69, 0x64,
	0x63, 0x6f, 0x6d, 0x6d, 0x5f, 0x69, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4a, 0x73, 0x6f, 0x6e, 0x50, 0x61, 0x79,
	0x6c, 0x6f, 0x61, 0x64, 0x48, 0x00, 0x52, 0x11, 0x64, 0x69, 0x64, 0x63, 0x6f, 0x6d, 0x6d, 0x49,
	0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x39, 0x0a, 0x08, 0x64, 0x6f, 0x63,
	0x75, 0x6d, 0x65, 0x6e, 0x74, 0x18, 0x64, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x74, 0x72,
	0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4a,
	0x73, 0x6f, 0x6e, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x52, 0x08, 0x64, 0x6f, 0x63, 0x75,
	0x6d, 0x65, 0x6e, 0x74, 0x42, 0x11, 0x0a, 0x0f, 0x64, 0x65, 0x6c, 0x69, 0x76, 0x65, 0x72, 0x79,
	0x5f, 0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x22, 0x48, 0x0a, 0x0c, 0x53, 0x65, 0x6e, 0x64, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x38, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x20, 0x2e, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69,
	0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x32, 0xd5, 0x02, 0x0a, 0x0a, 0x43, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c,
	0x12, 0x48, 0x0a, 0x05, 0x49, 0x73, 0x73, 0x75, 0x65, 0x12, 0x1e, 0x2e, 0x74, 0x72, 0x69, 0x6e,
	0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x49, 0x73, 0x73,
	0x75, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1f, 0x2e, 0x74, 0x72, 0x69, 0x6e,
	0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x49, 0x73, 0x73,
	0x75, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x5a, 0x0a, 0x0b, 0x43, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x50, 0x72, 0x6f, 0x6f, 0x66, 0x12, 0x24, 0x2e, 0x74, 0x72, 0x69, 0x6e,
	0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x43, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x50, 0x72, 0x6f, 0x6f, 0x66, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a,
	0x25, 0x2e, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x50, 0x72, 0x6f, 0x6f, 0x66, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x5a, 0x0a, 0x0b, 0x56, 0x65, 0x72, 0x69, 0x66, 0x79,
	0x50, 0x72, 0x6f, 0x6f, 0x66, 0x12, 0x24, 0x2e, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x56, 0x65, 0x72, 0x69, 0x66, 0x79, 0x50,
	0x72, 0x6f, 0x6f, 0x66, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x25, 0x2e, 0x74, 0x72,
	0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x56,
	0x65, 0x72, 0x69, 0x66, 0x79, 0x50, 0x72, 0x6f, 0x6f, 0x66, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x12, 0x45, 0x0a, 0x04, 0x53, 0x65, 0x6e, 0x64, 0x12, 0x1d, 0x2e, 0x74, 0x72, 0x69,
	0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x53, 0x65,
	0x6e, 0x64, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1e, 0x2e, 0x74, 0x72, 0x69, 0x6e,
	0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x53, 0x65, 0x6e,
	0x64, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x2d, 0x0a, 0x10, 0x74, 0x72, 0x69,
	0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x5a, 0x19, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69,
	0x63, 0x2d, 0x69, 0x64, 0x2f, 0x73, 0x64, 0x6b, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_IssuerService_proto_rawDescOnce sync.Once
	file_IssuerService_proto_rawDescData = file_IssuerService_proto_rawDesc
)

func file_IssuerService_proto_rawDescGZIP() []byte {
	file_IssuerService_proto_rawDescOnce.Do(func() {
		file_IssuerService_proto_rawDescData = protoimpl.X.CompressGZIP(file_IssuerService_proto_rawDescData)
	})
	return file_IssuerService_proto_rawDescData
}

var file_IssuerService_proto_msgTypes = make([]protoimpl.MessageInfo, 8)
var file_IssuerService_proto_goTypes = []interface{}{
	(*IssueRequest)(nil),        // 0: trinsic.services.IssueRequest
	(*IssueResponse)(nil),       // 1: trinsic.services.IssueResponse
	(*CreateProofRequest)(nil),  // 2: trinsic.services.CreateProofRequest
	(*CreateProofResponse)(nil), // 3: trinsic.services.CreateProofResponse
	(*VerifyProofRequest)(nil),  // 4: trinsic.services.VerifyProofRequest
	(*VerifyProofResponse)(nil), // 5: trinsic.services.VerifyProofResponse
	(*SendRequest)(nil),         // 6: trinsic.services.SendRequest
	(*SendResponse)(nil),        // 7: trinsic.services.SendResponse
	(*JsonPayload)(nil),         // 8: trinsic.services.JsonPayload
	(ResponseStatus)(0),         // 9: trinsic.services.ResponseStatus
}
var file_IssuerService_proto_depIdxs = []int32{
	8,  // 0: trinsic.services.IssueRequest.document:type_name -> trinsic.services.JsonPayload
	8,  // 1: trinsic.services.IssueResponse.document:type_name -> trinsic.services.JsonPayload
	8,  // 2: trinsic.services.CreateProofRequest.reveal_document:type_name -> trinsic.services.JsonPayload
	8,  // 3: trinsic.services.CreateProofResponse.proof_document:type_name -> trinsic.services.JsonPayload
	8,  // 4: trinsic.services.VerifyProofRequest.proof_document:type_name -> trinsic.services.JsonPayload
	8,  // 5: trinsic.services.SendRequest.didcomm_invitation:type_name -> trinsic.services.JsonPayload
	8,  // 6: trinsic.services.SendRequest.document:type_name -> trinsic.services.JsonPayload
	9,  // 7: trinsic.services.SendResponse.status:type_name -> trinsic.services.ResponseStatus
	0,  // 8: trinsic.services.Credential.Issue:input_type -> trinsic.services.IssueRequest
	2,  // 9: trinsic.services.Credential.CreateProof:input_type -> trinsic.services.CreateProofRequest
	4,  // 10: trinsic.services.Credential.VerifyProof:input_type -> trinsic.services.VerifyProofRequest
	6,  // 11: trinsic.services.Credential.Send:input_type -> trinsic.services.SendRequest
	1,  // 12: trinsic.services.Credential.Issue:output_type -> trinsic.services.IssueResponse
	3,  // 13: trinsic.services.Credential.CreateProof:output_type -> trinsic.services.CreateProofResponse
	5,  // 14: trinsic.services.Credential.VerifyProof:output_type -> trinsic.services.VerifyProofResponse
	7,  // 15: trinsic.services.Credential.Send:output_type -> trinsic.services.SendResponse
	12, // [12:16] is the sub-list for method output_type
	8,  // [8:12] is the sub-list for method input_type
	8,  // [8:8] is the sub-list for extension type_name
	8,  // [8:8] is the sub-list for extension extendee
	0,  // [0:8] is the sub-list for field type_name
}

func init() { file_IssuerService_proto_init() }
func file_IssuerService_proto_init() {
	if File_IssuerService_proto != nil {
		return
	}
	file_CoreService_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_IssuerService_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*IssueRequest); i {
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
		file_IssuerService_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*IssueResponse); i {
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
		file_IssuerService_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateProofRequest); i {
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
		file_IssuerService_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateProofResponse); i {
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
		file_IssuerService_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*VerifyProofRequest); i {
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
		file_IssuerService_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*VerifyProofResponse); i {
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
		file_IssuerService_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SendRequest); i {
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
		file_IssuerService_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SendResponse); i {
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
	file_IssuerService_proto_msgTypes[6].OneofWrappers = []interface{}{
		(*SendRequest_Email)(nil),
		(*SendRequest_DidUri)(nil),
		(*SendRequest_DidcommInvitation)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_IssuerService_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   8,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_IssuerService_proto_goTypes,
		DependencyIndexes: file_IssuerService_proto_depIdxs,
		MessageInfos:      file_IssuerService_proto_msgTypes,
	}.Build()
	File_IssuerService_proto = out.File
	file_IssuerService_proto_rawDesc = nil
	file_IssuerService_proto_goTypes = nil
	file_IssuerService_proto_depIdxs = nil
}
