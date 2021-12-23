// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.1
// source: services/provider/v1/provider.proto

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

type ParticipantType int32

const (
	ParticipantType_participant_type_individual   ParticipantType = 0
	ParticipantType_participant_type_organization ParticipantType = 1
)

// Enum value maps for ParticipantType.
var (
	ParticipantType_name = map[int32]string{
		0: "participant_type_individual",
		1: "participant_type_organization",
	}
	ParticipantType_value = map[string]int32{
		"participant_type_individual":   0,
		"participant_type_organization": 1,
	}
)

func (x ParticipantType) Enum() *ParticipantType {
	p := new(ParticipantType)
	*p = x
	return p
}

func (x ParticipantType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (ParticipantType) Descriptor() protoreflect.EnumDescriptor {
	return file_services_provider_v1_provider_proto_enumTypes[0].Descriptor()
}

func (ParticipantType) Type() protoreflect.EnumType {
	return &file_services_provider_v1_provider_proto_enumTypes[0]
}

func (x ParticipantType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ParticipantType.Descriptor instead.
func (ParticipantType) EnumDescriptor() ([]byte, []int) {
	return file_services_provider_v1_provider_proto_rawDescGZIP(), []int{0}
}

type InvitationStatusResponse_Status int32

const (
	// Onboarding resulted in error
	InvitationStatusResponse_Error InvitationStatusResponse_Status = 0
	// The participant has been invited
	InvitationStatusResponse_InvitationSent InvitationStatusResponse_Status = 1
	// The participant has been onboarded
	InvitationStatusResponse_Completed InvitationStatusResponse_Status = 2
)

// Enum value maps for InvitationStatusResponse_Status.
var (
	InvitationStatusResponse_Status_name = map[int32]string{
		0: "Error",
		1: "InvitationSent",
		2: "Completed",
	}
	InvitationStatusResponse_Status_value = map[string]int32{
		"Error":          0,
		"InvitationSent": 1,
		"Completed":      2,
	}
)

func (x InvitationStatusResponse_Status) Enum() *InvitationStatusResponse_Status {
	p := new(InvitationStatusResponse_Status)
	*p = x
	return p
}

func (x InvitationStatusResponse_Status) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (InvitationStatusResponse_Status) Descriptor() protoreflect.EnumDescriptor {
	return file_services_provider_v1_provider_proto_enumTypes[1].Descriptor()
}

func (InvitationStatusResponse_Status) Type() protoreflect.EnumType {
	return &file_services_provider_v1_provider_proto_enumTypes[1]
}

func (x InvitationStatusResponse_Status) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use InvitationStatusResponse_Status.Descriptor instead.
func (InvitationStatusResponse_Status) EnumDescriptor() ([]byte, []int) {
	return file_services_provider_v1_provider_proto_rawDescGZIP(), []int{3, 0}
}

type InviteRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Participant ParticipantType `protobuf:"varint,1,opt,name=participant,proto3,enum=services.provider.v1.ParticipantType" json:"participant,omitempty"`
	Description string          `protobuf:"bytes,2,opt,name=description,proto3" json:"description,omitempty"`
	// Types that are assignable to ContactMethod:
	//	*InviteRequest_Email
	//	*InviteRequest_Phone
	//	*InviteRequest_DidcommInvitation
	ContactMethod isInviteRequest_ContactMethod `protobuf_oneof:"contact_method"`
}

func (x *InviteRequest) Reset() {
	*x = InviteRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_provider_v1_provider_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InviteRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InviteRequest) ProtoMessage() {}

func (x *InviteRequest) ProtoReflect() protoreflect.Message {
	mi := &file_services_provider_v1_provider_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InviteRequest.ProtoReflect.Descriptor instead.
func (*InviteRequest) Descriptor() ([]byte, []int) {
	return file_services_provider_v1_provider_proto_rawDescGZIP(), []int{0}
}

func (x *InviteRequest) GetParticipant() ParticipantType {
	if x != nil {
		return x.Participant
	}
	return ParticipantType_participant_type_individual
}

func (x *InviteRequest) GetDescription() string {
	if x != nil {
		return x.Description
	}
	return ""
}

func (m *InviteRequest) GetContactMethod() isInviteRequest_ContactMethod {
	if m != nil {
		return m.ContactMethod
	}
	return nil
}

func (x *InviteRequest) GetEmail() string {
	if x, ok := x.GetContactMethod().(*InviteRequest_Email); ok {
		return x.Email
	}
	return ""
}

func (x *InviteRequest) GetPhone() string {
	if x, ok := x.GetContactMethod().(*InviteRequest_Phone); ok {
		return x.Phone
	}
	return ""
}

func (x *InviteRequest) GetDidcommInvitation() *InviteRequest_DidCommInvitation {
	if x, ok := x.GetContactMethod().(*InviteRequest_DidcommInvitation); ok {
		return x.DidcommInvitation
	}
	return nil
}

type isInviteRequest_ContactMethod interface {
	isInviteRequest_ContactMethod()
}

type InviteRequest_Email struct {
	Email string `protobuf:"bytes,5,opt,name=email,proto3,oneof"`
}

type InviteRequest_Phone struct {
	Phone string `protobuf:"bytes,6,opt,name=phone,proto3,oneof"`
}

type InviteRequest_DidcommInvitation struct {
	DidcommInvitation *InviteRequest_DidCommInvitation `protobuf:"bytes,7,opt,name=didcomm_invitation,json=didcommInvitation,proto3,oneof"`
}

func (*InviteRequest_Email) isInviteRequest_ContactMethod() {}

func (*InviteRequest_Phone) isInviteRequest_ContactMethod() {}

func (*InviteRequest_DidcommInvitation) isInviteRequest_ContactMethod() {}

type InviteResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Status       ResponseStatus `protobuf:"varint,1,opt,name=status,proto3,enum=services.common.v1.ResponseStatus" json:"status,omitempty"`
	InvitationId string         `protobuf:"bytes,10,opt,name=invitation_id,json=invitationId,proto3" json:"invitation_id,omitempty"`
}

func (x *InviteResponse) Reset() {
	*x = InviteResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_provider_v1_provider_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InviteResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InviteResponse) ProtoMessage() {}

func (x *InviteResponse) ProtoReflect() protoreflect.Message {
	mi := &file_services_provider_v1_provider_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InviteResponse.ProtoReflect.Descriptor instead.
func (*InviteResponse) Descriptor() ([]byte, []int) {
	return file_services_provider_v1_provider_proto_rawDescGZIP(), []int{1}
}

func (x *InviteResponse) GetStatus() ResponseStatus {
	if x != nil {
		return x.Status
	}
	return ResponseStatus_SUCCESS
}

func (x *InviteResponse) GetInvitationId() string {
	if x != nil {
		return x.InvitationId
	}
	return ""
}

// Request details for the status of onboarding
// an individual or organization.
// The referenece_id passed is the response from the
// `Onboard` method call
type InvitationStatusRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	InvitationId string `protobuf:"bytes,1,opt,name=invitation_id,json=invitationId,proto3" json:"invitation_id,omitempty"`
}

func (x *InvitationStatusRequest) Reset() {
	*x = InvitationStatusRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_provider_v1_provider_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InvitationStatusRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InvitationStatusRequest) ProtoMessage() {}

func (x *InvitationStatusRequest) ProtoReflect() protoreflect.Message {
	mi := &file_services_provider_v1_provider_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InvitationStatusRequest.ProtoReflect.Descriptor instead.
func (*InvitationStatusRequest) Descriptor() ([]byte, []int) {
	return file_services_provider_v1_provider_proto_rawDescGZIP(), []int{2}
}

func (x *InvitationStatusRequest) GetInvitationId() string {
	if x != nil {
		return x.InvitationId
	}
	return ""
}

type InvitationStatusResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Status        InvitationStatusResponse_Status `protobuf:"varint,1,opt,name=status,proto3,enum=services.provider.v1.InvitationStatusResponse_Status" json:"status,omitempty"`
	StatusDetails string                          `protobuf:"bytes,2,opt,name=status_details,json=statusDetails,proto3" json:"status_details,omitempty"`
}

func (x *InvitationStatusResponse) Reset() {
	*x = InvitationStatusResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_provider_v1_provider_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InvitationStatusResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InvitationStatusResponse) ProtoMessage() {}

func (x *InvitationStatusResponse) ProtoReflect() protoreflect.Message {
	mi := &file_services_provider_v1_provider_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InvitationStatusResponse.ProtoReflect.Descriptor instead.
func (*InvitationStatusResponse) Descriptor() ([]byte, []int) {
	return file_services_provider_v1_provider_proto_rawDescGZIP(), []int{3}
}

func (x *InvitationStatusResponse) GetStatus() InvitationStatusResponse_Status {
	if x != nil {
		return x.Status
	}
	return InvitationStatusResponse_Error
}

func (x *InvitationStatusResponse) GetStatusDetails() string {
	if x != nil {
		return x.StatusDetails
	}
	return ""
}

type InviteRequest_DidCommInvitation struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *InviteRequest_DidCommInvitation) Reset() {
	*x = InviteRequest_DidCommInvitation{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_provider_v1_provider_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InviteRequest_DidCommInvitation) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InviteRequest_DidCommInvitation) ProtoMessage() {}

func (x *InviteRequest_DidCommInvitation) ProtoReflect() protoreflect.Message {
	mi := &file_services_provider_v1_provider_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InviteRequest_DidCommInvitation.ProtoReflect.Descriptor instead.
func (*InviteRequest_DidCommInvitation) Descriptor() ([]byte, []int) {
	return file_services_provider_v1_provider_proto_rawDescGZIP(), []int{0, 0}
}

var File_services_provider_v1_provider_proto protoreflect.FileDescriptor

var file_services_provider_v1_provider_proto_rawDesc = []byte{
	0x0a, 0x23, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2f, 0x70, 0x72, 0x6f, 0x76, 0x69,
	0x64, 0x65, 0x72, 0x2f, 0x76, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x14, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x1a, 0x1f, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x73, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x76, 0x31, 0x2f,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xb9, 0x02, 0x0a,
	0x0d, 0x49, 0x6e, 0x76, 0x69, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x47,
	0x0a, 0x0b, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0e, 0x32, 0x25, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x50, 0x61, 0x72, 0x74, 0x69,
	0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0b, 0x70, 0x61, 0x72, 0x74,
	0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x12, 0x20, 0x0a, 0x0b, 0x64, 0x65, 0x73, 0x63, 0x72,
	0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x64, 0x65,
	0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x16, 0x0a, 0x05, 0x65, 0x6d, 0x61,
	0x69, 0x6c, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x05, 0x65, 0x6d, 0x61, 0x69,
	0x6c, 0x12, 0x16, 0x0a, 0x05, 0x70, 0x68, 0x6f, 0x6e, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09,
	0x48, 0x00, 0x52, 0x05, 0x70, 0x68, 0x6f, 0x6e, 0x65, 0x12, 0x66, 0x0a, 0x12, 0x64, 0x69, 0x64,
	0x63, 0x6f, 0x6d, 0x6d, 0x5f, 0x69, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18,
	0x07, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x35, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73,
	0x2e, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x49, 0x6e, 0x76,
	0x69, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x69, 0x64, 0x43, 0x6f,
	0x6d, 0x6d, 0x49, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x48, 0x00, 0x52, 0x11,
	0x64, 0x69, 0x64, 0x63, 0x6f, 0x6d, 0x6d, 0x49, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x1a, 0x13, 0x0a, 0x11, 0x44, 0x69, 0x64, 0x43, 0x6f, 0x6d, 0x6d, 0x49, 0x6e, 0x76, 0x69,
	0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x42, 0x10, 0x0a, 0x0e, 0x63, 0x6f, 0x6e, 0x74, 0x61, 0x63,
	0x74, 0x5f, 0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x22, 0x71, 0x0a, 0x0e, 0x49, 0x6e, 0x76, 0x69,
	0x74, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x3a, 0x0a, 0x06, 0x73, 0x74,
	0x61, 0x74, 0x75, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x22, 0x2e, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x2e,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x06,
	0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x23, 0x0a, 0x0d, 0x69, 0x6e, 0x76, 0x69, 0x74, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x69, 0x64, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x69,
	0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x22, 0x3e, 0x0a, 0x17, 0x49,
	0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x23, 0x0a, 0x0d, 0x69, 0x6e, 0x76, 0x69, 0x74, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x69,
	0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x22, 0xc8, 0x01, 0x0a, 0x18,
	0x49, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x4d, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74,
	0x75, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x35, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e,
	0x49, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52,
	0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x25, 0x0a, 0x0e, 0x73, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x5f, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0d, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x22, 0x36,
	0x0a, 0x06, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x09, 0x0a, 0x05, 0x45, 0x72, 0x72, 0x6f,
	0x72, 0x10, 0x00, 0x12, 0x12, 0x0a, 0x0e, 0x49, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x53, 0x65, 0x6e, 0x74, 0x10, 0x01, 0x12, 0x0d, 0x0a, 0x09, 0x43, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x74, 0x65, 0x64, 0x10, 0x02, 0x2a, 0x55, 0x0a, 0x0f, 0x50, 0x61, 0x72, 0x74, 0x69, 0x63,
	0x69, 0x70, 0x61, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1f, 0x0a, 0x1b, 0x70, 0x61, 0x72,
	0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x5f, 0x69, 0x6e,
	0x64, 0x69, 0x76, 0x69, 0x64, 0x75, 0x61, 0x6c, 0x10, 0x00, 0x12, 0x21, 0x0a, 0x1d, 0x70, 0x61,
	0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x5f, 0x6f,
	0x72, 0x67, 0x61, 0x6e, 0x69, 0x7a, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x10, 0x01, 0x32, 0xb3, 0x02,
	0x0a, 0x08, 0x50, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x12, 0x53, 0x0a, 0x06, 0x49, 0x6e,
	0x76, 0x69, 0x74, 0x65, 0x12, 0x23, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x49, 0x6e, 0x76, 0x69,
	0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x24, 0x2e, 0x73, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2e, 0x76, 0x31,
	0x2e, 0x49, 0x6e, 0x76, 0x69, 0x74, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12,
	0x5f, 0x0a, 0x12, 0x49, 0x6e, 0x76, 0x69, 0x74, 0x65, 0x57, 0x69, 0x74, 0x68, 0x57, 0x6f, 0x72,
	0x6b, 0x66, 0x6c, 0x6f, 0x77, 0x12, 0x23, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73,
	0x2e, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x49, 0x6e, 0x76,
	0x69, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x24, 0x2e, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2e, 0x76,
	0x31, 0x2e, 0x49, 0x6e, 0x76, 0x69, 0x74, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x12, 0x71, 0x0a, 0x10, 0x49, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74,
	0x61, 0x74, 0x75, 0x73, 0x12, 0x2d, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x49, 0x6e, 0x76, 0x69,
	0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x1a, 0x2e, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x49, 0x6e, 0x76, 0x69, 0x74,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x42, 0x54, 0x0a, 0x1a, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76,
	0x31, 0x5a, 0x19, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x74, 0x72,
	0x69, 0x6e, 0x73, 0x69, 0x63, 0x2d, 0x69, 0x64, 0x2f, 0x73, 0x64, 0x6b, 0xaa, 0x02, 0x1a, 0x54,
	0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e,
	0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x56, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_services_provider_v1_provider_proto_rawDescOnce sync.Once
	file_services_provider_v1_provider_proto_rawDescData = file_services_provider_v1_provider_proto_rawDesc
)

func file_services_provider_v1_provider_proto_rawDescGZIP() []byte {
	file_services_provider_v1_provider_proto_rawDescOnce.Do(func() {
		file_services_provider_v1_provider_proto_rawDescData = protoimpl.X.CompressGZIP(file_services_provider_v1_provider_proto_rawDescData)
	})
	return file_services_provider_v1_provider_proto_rawDescData
}

var file_services_provider_v1_provider_proto_enumTypes = make([]protoimpl.EnumInfo, 2)
var file_services_provider_v1_provider_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_services_provider_v1_provider_proto_goTypes = []interface{}{
	(ParticipantType)(0),                    // 0: services.provider.v1.ParticipantType
	(InvitationStatusResponse_Status)(0),    // 1: services.provider.v1.InvitationStatusResponse.Status
	(*InviteRequest)(nil),                   // 2: services.provider.v1.InviteRequest
	(*InviteResponse)(nil),                  // 3: services.provider.v1.InviteResponse
	(*InvitationStatusRequest)(nil),         // 4: services.provider.v1.InvitationStatusRequest
	(*InvitationStatusResponse)(nil),        // 5: services.provider.v1.InvitationStatusResponse
	(*InviteRequest_DidCommInvitation)(nil), // 6: services.provider.v1.InviteRequest.DidCommInvitation
	(ResponseStatus)(0),                     // 7: services.common.v1.ResponseStatus
}
var file_services_provider_v1_provider_proto_depIdxs = []int32{
	0, // 0: services.provider.v1.InviteRequest.participant:type_name -> services.provider.v1.ParticipantType
	6, // 1: services.provider.v1.InviteRequest.didcomm_invitation:type_name -> services.provider.v1.InviteRequest.DidCommInvitation
	7, // 2: services.provider.v1.InviteResponse.status:type_name -> services.common.v1.ResponseStatus
	1, // 3: services.provider.v1.InvitationStatusResponse.status:type_name -> services.provider.v1.InvitationStatusResponse.Status
	2, // 4: services.provider.v1.Provider.Invite:input_type -> services.provider.v1.InviteRequest
	2, // 5: services.provider.v1.Provider.InviteWithWorkflow:input_type -> services.provider.v1.InviteRequest
	4, // 6: services.provider.v1.Provider.InvitationStatus:input_type -> services.provider.v1.InvitationStatusRequest
	3, // 7: services.provider.v1.Provider.Invite:output_type -> services.provider.v1.InviteResponse
	3, // 8: services.provider.v1.Provider.InviteWithWorkflow:output_type -> services.provider.v1.InviteResponse
	5, // 9: services.provider.v1.Provider.InvitationStatus:output_type -> services.provider.v1.InvitationStatusResponse
	7, // [7:10] is the sub-list for method output_type
	4, // [4:7] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_services_provider_v1_provider_proto_init() }
func file_services_provider_v1_provider_proto_init() {
	if File_services_provider_v1_provider_proto != nil {
		return
	}
	file_services_common_v1_common_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_services_provider_v1_provider_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InviteRequest); i {
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
		file_services_provider_v1_provider_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InviteResponse); i {
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
		file_services_provider_v1_provider_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InvitationStatusRequest); i {
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
		file_services_provider_v1_provider_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InvitationStatusResponse); i {
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
		file_services_provider_v1_provider_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InviteRequest_DidCommInvitation); i {
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
	file_services_provider_v1_provider_proto_msgTypes[0].OneofWrappers = []interface{}{
		(*InviteRequest_Email)(nil),
		(*InviteRequest_Phone)(nil),
		(*InviteRequest_DidcommInvitation)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_services_provider_v1_provider_proto_rawDesc,
			NumEnums:      2,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_services_provider_v1_provider_proto_goTypes,
		DependencyIndexes: file_services_provider_v1_provider_proto_depIdxs,
		EnumInfos:         file_services_provider_v1_provider_proto_enumTypes,
		MessageInfos:      file_services_provider_v1_provider_proto_msgTypes,
	}.Build()
	File_services_provider_v1_provider_proto = out.File
	file_services_provider_v1_provider_proto_rawDesc = nil
	file_services_provider_v1_provider_proto_goTypes = nil
	file_services_provider_v1_provider_proto_depIdxs = nil
}
