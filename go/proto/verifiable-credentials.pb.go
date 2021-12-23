// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.1
// source: services/verifiable-credentials/v1/verifiable-credentials.proto

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
		mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IssueRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IssueRequest) ProtoMessage() {}

func (x *IssueRequest) ProtoReflect() protoreflect.Message {
	mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[0]
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
	return file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescGZIP(), []int{0}
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
		mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IssueResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IssueResponse) ProtoMessage() {}

func (x *IssueResponse) ProtoReflect() protoreflect.Message {
	mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[1]
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
	return file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescGZIP(), []int{1}
}

func (x *IssueResponse) GetDocument() *JsonPayload {
	if x != nil {
		return x.Document
	}
	return nil
}

type IssueFromTemplateRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TemplateId string       `protobuf:"bytes,1,opt,name=templateId,proto3" json:"templateId,omitempty"`
	Attributes *JsonPayload `protobuf:"bytes,2,opt,name=attributes,proto3" json:"attributes,omitempty"`
}

func (x *IssueFromTemplateRequest) Reset() {
	*x = IssueFromTemplateRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IssueFromTemplateRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IssueFromTemplateRequest) ProtoMessage() {}

func (x *IssueFromTemplateRequest) ProtoReflect() protoreflect.Message {
	mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use IssueFromTemplateRequest.ProtoReflect.Descriptor instead.
func (*IssueFromTemplateRequest) Descriptor() ([]byte, []int) {
	return file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescGZIP(), []int{2}
}

func (x *IssueFromTemplateRequest) GetTemplateId() string {
	if x != nil {
		return x.TemplateId
	}
	return ""
}

func (x *IssueFromTemplateRequest) GetAttributes() *JsonPayload {
	if x != nil {
		return x.Attributes
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
		mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateProofRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateProofRequest) ProtoMessage() {}

func (x *CreateProofRequest) ProtoReflect() protoreflect.Message {
	mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[3]
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
	return file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescGZIP(), []int{3}
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
		mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateProofResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateProofResponse) ProtoMessage() {}

func (x *CreateProofResponse) ProtoReflect() protoreflect.Message {
	mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[4]
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
	return file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescGZIP(), []int{4}
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
		mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *VerifyProofRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*VerifyProofRequest) ProtoMessage() {}

func (x *VerifyProofRequest) ProtoReflect() protoreflect.Message {
	mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[5]
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
	return file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescGZIP(), []int{5}
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
		mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *VerifyProofResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*VerifyProofResponse) ProtoMessage() {}

func (x *VerifyProofResponse) ProtoReflect() protoreflect.Message {
	mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[6]
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
	return file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescGZIP(), []int{6}
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
		mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SendRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SendRequest) ProtoMessage() {}

func (x *SendRequest) ProtoReflect() protoreflect.Message {
	mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[7]
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
	return file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescGZIP(), []int{7}
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

	Status ResponseStatus `protobuf:"varint,1,opt,name=status,proto3,enum=services.common.v1.ResponseStatus" json:"status,omitempty"`
}

func (x *SendResponse) Reset() {
	*x = SendResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SendResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SendResponse) ProtoMessage() {}

func (x *SendResponse) ProtoReflect() protoreflect.Message {
	mi := &file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[8]
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
	return file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescGZIP(), []int{8}
}

func (x *SendResponse) GetStatus() ResponseStatus {
	if x != nil {
		return x.Status
	}
	return ResponseStatus_SUCCESS
}

var File_services_verifiable_credentials_v1_verifiable_credentials_proto protoreflect.FileDescriptor

var file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDesc = []byte{
	0x0a, 0x3f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2f, 0x76, 0x65, 0x72, 0x69, 0x66,
	0x69, 0x61, 0x62, 0x6c, 0x65, 0x2d, 0x63, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c,
	0x73, 0x2f, 0x76, 0x31, 0x2f, 0x76, 0x65, 0x72, 0x69, 0x66, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x2d,
	0x63, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x21, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x76, 0x65, 0x72, 0x69,
	0x66, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x63, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c,
	0x73, 0x2e, 0x76, 0x31, 0x1a, 0x1f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2f, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x76, 0x31, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x4b, 0x0a, 0x0c, 0x49, 0x73, 0x73, 0x75, 0x65, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x3b, 0x0a, 0x08, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e,
	0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x2e, 0x4a, 0x73, 0x6f,
	0x6e, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x52, 0x08, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65,
	0x6e, 0x74, 0x22, 0x4c, 0x0a, 0x0d, 0x49, 0x73, 0x73, 0x75, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x12, 0x3b, 0x0a, 0x08, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73,
	0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x2e, 0x4a, 0x73, 0x6f, 0x6e, 0x50,
	0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x52, 0x08, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74,
	0x22, 0x7b, 0x0a, 0x18, 0x49, 0x73, 0x73, 0x75, 0x65, 0x46, 0x72, 0x6f, 0x6d, 0x54, 0x65, 0x6d,
	0x70, 0x6c, 0x61, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1e, 0x0a, 0x0a,
	0x74, 0x65, 0x6d, 0x70, 0x6c, 0x61, 0x74, 0x65, 0x49, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0a, 0x74, 0x65, 0x6d, 0x70, 0x6c, 0x61, 0x74, 0x65, 0x49, 0x64, 0x12, 0x3f, 0x0a, 0x0a,
	0x61, 0x74, 0x74, 0x72, 0x69, 0x62, 0x75, 0x74, 0x65, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x1f, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x2e, 0x4a, 0x73, 0x6f, 0x6e, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61,
	0x64, 0x52, 0x0a, 0x61, 0x74, 0x74, 0x72, 0x69, 0x62, 0x75, 0x74, 0x65, 0x73, 0x22, 0x7f, 0x0a,
	0x12, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x50, 0x72, 0x6f, 0x6f, 0x66, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x12, 0x48, 0x0a, 0x0f, 0x72, 0x65, 0x76, 0x65, 0x61, 0x6c, 0x5f, 0x64, 0x6f,
	0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76,
	0x31, 0x2e, 0x4a, 0x73, 0x6f, 0x6e, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x52, 0x0e, 0x72,
	0x65, 0x76, 0x65, 0x61, 0x6c, 0x44, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x12, 0x1f, 0x0a,
	0x0b, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x0a, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x49, 0x64, 0x22, 0x5d,
	0x0a, 0x13, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x50, 0x72, 0x6f, 0x6f, 0x66, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x46, 0x0a, 0x0e, 0x70, 0x72, 0x6f, 0x6f, 0x66, 0x5f, 0x64,
	0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e,
	0x76, 0x31, 0x2e, 0x4a, 0x73, 0x6f, 0x6e, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x52, 0x0d,
	0x70, 0x72, 0x6f, 0x6f, 0x66, 0x44, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x22, 0x5c, 0x0a,
	0x12, 0x56, 0x65, 0x72, 0x69, 0x66, 0x79, 0x50, 0x72, 0x6f, 0x6f, 0x66, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x12, 0x46, 0x0a, 0x0e, 0x70, 0x72, 0x6f, 0x6f, 0x66, 0x5f, 0x64, 0x6f, 0x63,
	0x75, 0x6d, 0x65, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31,
	0x2e, 0x4a, 0x73, 0x6f, 0x6e, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x52, 0x0d, 0x70, 0x72,
	0x6f, 0x6f, 0x66, 0x44, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x22, 0x2b, 0x0a, 0x13, 0x56,
	0x65, 0x72, 0x69, 0x66, 0x79, 0x50, 0x72, 0x6f, 0x6f, 0x66, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x08, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x22, 0xe2, 0x01, 0x0a, 0x0b, 0x53, 0x65, 0x6e,
	0x64, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x16, 0x0a, 0x05, 0x65, 0x6d, 0x61, 0x69,
	0x6c, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x05, 0x65, 0x6d, 0x61, 0x69, 0x6c,
	0x12, 0x19, 0x0a, 0x07, 0x64, 0x69, 0x64, 0x5f, 0x75, 0x72, 0x69, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x48, 0x00, 0x52, 0x06, 0x64, 0x69, 0x64, 0x55, 0x72, 0x69, 0x12, 0x50, 0x0a, 0x12, 0x64,
	0x69, 0x64, 0x63, 0x6f, 0x6d, 0x6d, 0x5f, 0x69, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x2e, 0x4a, 0x73, 0x6f,
	0x6e, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x48, 0x00, 0x52, 0x11, 0x64, 0x69, 0x64, 0x63,
	0x6f, 0x6d, 0x6d, 0x49, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x3b, 0x0a,
	0x08, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x18, 0x64, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x1f, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0x2e, 0x76, 0x31, 0x2e, 0x4a, 0x73, 0x6f, 0x6e, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64,
	0x52, 0x08, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x42, 0x11, 0x0a, 0x0f, 0x64, 0x65,
	0x6c, 0x69, 0x76, 0x65, 0x72, 0x79, 0x5f, 0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x22, 0x4a, 0x0a,
	0x0c, 0x53, 0x65, 0x6e, 0x64, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x3a, 0x0a,
	0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x22, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e,
	0x76, 0x31, 0x2e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x53, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x32, 0xec, 0x04, 0x0a, 0x14, 0x56, 0x65,
	0x72, 0x69, 0x66, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x43, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69,
	0x61, 0x6c, 0x12, 0x6a, 0x0a, 0x05, 0x49, 0x73, 0x73, 0x75, 0x65, 0x12, 0x2f, 0x2e, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x76, 0x65, 0x72, 0x69, 0x66, 0x69, 0x61, 0x62, 0x6c,
	0x65, 0x63, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x73, 0x2e, 0x76, 0x31, 0x2e,
	0x49, 0x73, 0x73, 0x75, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x30, 0x2e, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x76, 0x65, 0x72, 0x69, 0x66, 0x69, 0x61, 0x62,
	0x6c, 0x65, 0x63, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x73, 0x2e, 0x76, 0x31,
	0x2e, 0x49, 0x73, 0x73, 0x75, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x82,
	0x01, 0x0a, 0x11, 0x49, 0x73, 0x73, 0x75, 0x65, 0x46, 0x72, 0x6f, 0x6d, 0x54, 0x65, 0x6d, 0x70,
	0x6c, 0x61, 0x74, 0x65, 0x12, 0x3b, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e,
	0x76, 0x65, 0x72, 0x69, 0x66, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x63, 0x72, 0x65, 0x64, 0x65, 0x6e,
	0x74, 0x69, 0x61, 0x6c, 0x73, 0x2e, 0x76, 0x31, 0x2e, 0x49, 0x73, 0x73, 0x75, 0x65, 0x46, 0x72,
	0x6f, 0x6d, 0x54, 0x65, 0x6d, 0x70, 0x6c, 0x61, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x30, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x76, 0x65, 0x72,
	0x69, 0x66, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x63, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61,
	0x6c, 0x73, 0x2e, 0x76, 0x31, 0x2e, 0x49, 0x73, 0x73, 0x75, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x12, 0x7c, 0x0a, 0x0b, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x50, 0x72, 0x6f,
	0x6f, 0x66, 0x12, 0x35, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x76, 0x65,
	0x72, 0x69, 0x66, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x63, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69,
	0x61, 0x6c, 0x73, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x50, 0x72, 0x6f,
	0x6f, 0x66, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x36, 0x2e, 0x73, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x73, 0x2e, 0x76, 0x65, 0x72, 0x69, 0x66, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x63,
	0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x73, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x50, 0x72, 0x6f, 0x6f, 0x66, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x12, 0x7c, 0x0a, 0x0b, 0x56, 0x65, 0x72, 0x69, 0x66, 0x79, 0x50, 0x72, 0x6f, 0x6f, 0x66,
	0x12, 0x35, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x76, 0x65, 0x72, 0x69,
	0x66, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x63, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c,
	0x73, 0x2e, 0x76, 0x31, 0x2e, 0x56, 0x65, 0x72, 0x69, 0x66, 0x79, 0x50, 0x72, 0x6f, 0x6f, 0x66,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x36, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2e, 0x76, 0x65, 0x72, 0x69, 0x66, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x63, 0x72, 0x65,
	0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x73, 0x2e, 0x76, 0x31, 0x2e, 0x56, 0x65, 0x72, 0x69,
	0x66, 0x79, 0x50, 0x72, 0x6f, 0x6f, 0x66, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12,
	0x67, 0x0a, 0x04, 0x53, 0x65, 0x6e, 0x64, 0x12, 0x2e, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2e, 0x76, 0x65, 0x72, 0x69, 0x66, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x63, 0x72, 0x65,
	0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x73, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x65, 0x6e, 0x64,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x2f, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2e, 0x76, 0x65, 0x72, 0x69, 0x66, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x63, 0x72, 0x65,
	0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x73, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x65, 0x6e, 0x64,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x84, 0x01, 0x0a, 0x29, 0x74, 0x72, 0x69,
	0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x76, 0x65,
	0x72, 0x69, 0x66, 0x69, 0x61, 0x62, 0x6c, 0x65, 0x63, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69,
	0x61, 0x6c, 0x73, 0x2e, 0x76, 0x31, 0x5a, 0x19, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63,
	0x6f, 0x6d, 0x2f, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2d, 0x69, 0x64, 0x2f, 0x73, 0x64,
	0x6b, 0xa2, 0x02, 0x0f, 0x54, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x53, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x73, 0xaa, 0x02, 0x29, 0x54, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x53, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x56, 0x65, 0x72, 0x69, 0x66, 0x69, 0x61, 0x62, 0x6c,
	0x65, 0x43, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x73, 0x2e, 0x56, 0x31, 0x62,
	0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescOnce sync.Once
	file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescData = file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDesc
)

func file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescGZIP() []byte {
	file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescOnce.Do(func() {
		file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescData = protoimpl.X.CompressGZIP(file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescData)
	})
	return file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDescData
}

var file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes = make([]protoimpl.MessageInfo, 9)
var file_services_verifiable_credentials_v1_verifiable_credentials_proto_goTypes = []interface{}{
	(*IssueRequest)(nil),             // 0: services.verifiablecredentials.v1.IssueRequest
	(*IssueResponse)(nil),            // 1: services.verifiablecredentials.v1.IssueResponse
	(*IssueFromTemplateRequest)(nil), // 2: services.verifiablecredentials.v1.IssueFromTemplateRequest
	(*CreateProofRequest)(nil),       // 3: services.verifiablecredentials.v1.CreateProofRequest
	(*CreateProofResponse)(nil),      // 4: services.verifiablecredentials.v1.CreateProofResponse
	(*VerifyProofRequest)(nil),       // 5: services.verifiablecredentials.v1.VerifyProofRequest
	(*VerifyProofResponse)(nil),      // 6: services.verifiablecredentials.v1.VerifyProofResponse
	(*SendRequest)(nil),              // 7: services.verifiablecredentials.v1.SendRequest
	(*SendResponse)(nil),             // 8: services.verifiablecredentials.v1.SendResponse
	(*JsonPayload)(nil),              // 9: services.common.v1.JsonPayload
	(ResponseStatus)(0),              // 10: services.common.v1.ResponseStatus
}
var file_services_verifiable_credentials_v1_verifiable_credentials_proto_depIdxs = []int32{
	9,  // 0: services.verifiablecredentials.v1.IssueRequest.document:type_name -> services.common.v1.JsonPayload
	9,  // 1: services.verifiablecredentials.v1.IssueResponse.document:type_name -> services.common.v1.JsonPayload
	9,  // 2: services.verifiablecredentials.v1.IssueFromTemplateRequest.attributes:type_name -> services.common.v1.JsonPayload
	9,  // 3: services.verifiablecredentials.v1.CreateProofRequest.reveal_document:type_name -> services.common.v1.JsonPayload
	9,  // 4: services.verifiablecredentials.v1.CreateProofResponse.proof_document:type_name -> services.common.v1.JsonPayload
	9,  // 5: services.verifiablecredentials.v1.VerifyProofRequest.proof_document:type_name -> services.common.v1.JsonPayload
	9,  // 6: services.verifiablecredentials.v1.SendRequest.didcomm_invitation:type_name -> services.common.v1.JsonPayload
	9,  // 7: services.verifiablecredentials.v1.SendRequest.document:type_name -> services.common.v1.JsonPayload
	10, // 8: services.verifiablecredentials.v1.SendResponse.status:type_name -> services.common.v1.ResponseStatus
	0,  // 9: services.verifiablecredentials.v1.VerifiableCredential.Issue:input_type -> services.verifiablecredentials.v1.IssueRequest
	2,  // 10: services.verifiablecredentials.v1.VerifiableCredential.IssueFromTemplate:input_type -> services.verifiablecredentials.v1.IssueFromTemplateRequest
	3,  // 11: services.verifiablecredentials.v1.VerifiableCredential.CreateProof:input_type -> services.verifiablecredentials.v1.CreateProofRequest
	5,  // 12: services.verifiablecredentials.v1.VerifiableCredential.VerifyProof:input_type -> services.verifiablecredentials.v1.VerifyProofRequest
	7,  // 13: services.verifiablecredentials.v1.VerifiableCredential.Send:input_type -> services.verifiablecredentials.v1.SendRequest
	1,  // 14: services.verifiablecredentials.v1.VerifiableCredential.Issue:output_type -> services.verifiablecredentials.v1.IssueResponse
	1,  // 15: services.verifiablecredentials.v1.VerifiableCredential.IssueFromTemplate:output_type -> services.verifiablecredentials.v1.IssueResponse
	4,  // 16: services.verifiablecredentials.v1.VerifiableCredential.CreateProof:output_type -> services.verifiablecredentials.v1.CreateProofResponse
	6,  // 17: services.verifiablecredentials.v1.VerifiableCredential.VerifyProof:output_type -> services.verifiablecredentials.v1.VerifyProofResponse
	8,  // 18: services.verifiablecredentials.v1.VerifiableCredential.Send:output_type -> services.verifiablecredentials.v1.SendResponse
	14, // [14:19] is the sub-list for method output_type
	9,  // [9:14] is the sub-list for method input_type
	9,  // [9:9] is the sub-list for extension type_name
	9,  // [9:9] is the sub-list for extension extendee
	0,  // [0:9] is the sub-list for field type_name
}

func init() { file_services_verifiable_credentials_v1_verifiable_credentials_proto_init() }
func file_services_verifiable_credentials_v1_verifiable_credentials_proto_init() {
	if File_services_verifiable_credentials_v1_verifiable_credentials_proto != nil {
		return
	}
	file_services_common_v1_common_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
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
		file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
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
		file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*IssueFromTemplateRequest); i {
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
		file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
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
		file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
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
		file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
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
		file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
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
		file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
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
		file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
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
	file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes[7].OneofWrappers = []interface{}{
		(*SendRequest_Email)(nil),
		(*SendRequest_DidUri)(nil),
		(*SendRequest_DidcommInvitation)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   9,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_services_verifiable_credentials_v1_verifiable_credentials_proto_goTypes,
		DependencyIndexes: file_services_verifiable_credentials_v1_verifiable_credentials_proto_depIdxs,
		MessageInfos:      file_services_verifiable_credentials_v1_verifiable_credentials_proto_msgTypes,
	}.Build()
	File_services_verifiable_credentials_v1_verifiable_credentials_proto = out.File
	file_services_verifiable_credentials_v1_verifiable_credentials_proto_rawDesc = nil
	file_services_verifiable_credentials_v1_verifiable_credentials_proto_goTypes = nil
	file_services_verifiable_credentials_v1_verifiable_credentials_proto_depIdxs = nil
}
