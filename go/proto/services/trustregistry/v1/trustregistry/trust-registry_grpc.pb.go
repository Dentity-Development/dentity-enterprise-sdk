// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.20.1
// source: services/trust-registry/v1/trust-registry.proto

package trustregistry

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// TrustRegistryClient is the client API for TrustRegistry service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type TrustRegistryClient interface {
	// Add a governance framework to the ecosystem
	AddFramework(ctx context.Context, in *AddFrameworkRequest, opts ...grpc.CallOption) (*AddFrameworkResponse, error)
	// Remove a governance framework from the ecosystem
	RemoveFramework(ctx context.Context, in *RemoveFrameworkRequest, opts ...grpc.CallOption) (*RemoveFrameworkResponse, error)
	// Search the ecosystem's governance frameworks
	SearchRegistry(ctx context.Context, in *SearchRegistryRequest, opts ...grpc.CallOption) (*SearchRegistryResponse, error)
	// Register an authoritative issuer for a credential schema
	RegisterMember(ctx context.Context, in *RegisterMemberRequest, opts ...grpc.CallOption) (*RegisterMemberResponse, error)
	// Removes an authoritative issuer for a credential schema from the trust registry
	UnregisterMember(ctx context.Context, in *UnregisterMemberRequest, opts ...grpc.CallOption) (*UnregisterMemberResponse, error)
	// Fetch the membership status of an issuer for a given credential schema in a trust registry
	GetMembershipStatus(ctx context.Context, in *GetMembershipStatusRequest, opts ...grpc.CallOption) (*GetMembershipStatusResponse, error)
	// Not implemented.
	FetchData(ctx context.Context, in *FetchDataRequest, opts ...grpc.CallOption) (TrustRegistry_FetchDataClient, error)
}

type trustRegistryClient struct {
	cc grpc.ClientConnInterface
}

func NewTrustRegistryClient(cc grpc.ClientConnInterface) TrustRegistryClient {
	return &trustRegistryClient{cc}
}

func (c *trustRegistryClient) AddFramework(ctx context.Context, in *AddFrameworkRequest, opts ...grpc.CallOption) (*AddFrameworkResponse, error) {
	out := new(AddFrameworkResponse)
	err := c.cc.Invoke(ctx, "/services.trustregistry.v1.TrustRegistry/AddFramework", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *trustRegistryClient) RemoveFramework(ctx context.Context, in *RemoveFrameworkRequest, opts ...grpc.CallOption) (*RemoveFrameworkResponse, error) {
	out := new(RemoveFrameworkResponse)
	err := c.cc.Invoke(ctx, "/services.trustregistry.v1.TrustRegistry/RemoveFramework", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *trustRegistryClient) SearchRegistry(ctx context.Context, in *SearchRegistryRequest, opts ...grpc.CallOption) (*SearchRegistryResponse, error) {
	out := new(SearchRegistryResponse)
	err := c.cc.Invoke(ctx, "/services.trustregistry.v1.TrustRegistry/SearchRegistry", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *trustRegistryClient) RegisterMember(ctx context.Context, in *RegisterMemberRequest, opts ...grpc.CallOption) (*RegisterMemberResponse, error) {
	out := new(RegisterMemberResponse)
	err := c.cc.Invoke(ctx, "/services.trustregistry.v1.TrustRegistry/RegisterMember", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *trustRegistryClient) UnregisterMember(ctx context.Context, in *UnregisterMemberRequest, opts ...grpc.CallOption) (*UnregisterMemberResponse, error) {
	out := new(UnregisterMemberResponse)
	err := c.cc.Invoke(ctx, "/services.trustregistry.v1.TrustRegistry/UnregisterMember", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *trustRegistryClient) GetMembershipStatus(ctx context.Context, in *GetMembershipStatusRequest, opts ...grpc.CallOption) (*GetMembershipStatusResponse, error) {
	out := new(GetMembershipStatusResponse)
	err := c.cc.Invoke(ctx, "/services.trustregistry.v1.TrustRegistry/GetMembershipStatus", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *trustRegistryClient) FetchData(ctx context.Context, in *FetchDataRequest, opts ...grpc.CallOption) (TrustRegistry_FetchDataClient, error) {
	stream, err := c.cc.NewStream(ctx, &TrustRegistry_ServiceDesc.Streams[0], "/services.trustregistry.v1.TrustRegistry/FetchData", opts...)
	if err != nil {
		return nil, err
	}
	x := &trustRegistryFetchDataClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type TrustRegistry_FetchDataClient interface {
	Recv() (*FetchDataResponse, error)
	grpc.ClientStream
}

type trustRegistryFetchDataClient struct {
	grpc.ClientStream
}

func (x *trustRegistryFetchDataClient) Recv() (*FetchDataResponse, error) {
	m := new(FetchDataResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// TrustRegistryServer is the server API for TrustRegistry service.
// All implementations must embed UnimplementedTrustRegistryServer
// for forward compatibility
type TrustRegistryServer interface {
	// Add a governance framework to the ecosystem
	AddFramework(context.Context, *AddFrameworkRequest) (*AddFrameworkResponse, error)
	// Remove a governance framework from the ecosystem
	RemoveFramework(context.Context, *RemoveFrameworkRequest) (*RemoveFrameworkResponse, error)
	// Search the ecosystem's governance frameworks
	SearchRegistry(context.Context, *SearchRegistryRequest) (*SearchRegistryResponse, error)
	// Register an authoritative issuer for a credential schema
	RegisterMember(context.Context, *RegisterMemberRequest) (*RegisterMemberResponse, error)
	// Removes an authoritative issuer for a credential schema from the trust registry
	UnregisterMember(context.Context, *UnregisterMemberRequest) (*UnregisterMemberResponse, error)
	// Fetch the membership status of an issuer for a given credential schema in a trust registry
	GetMembershipStatus(context.Context, *GetMembershipStatusRequest) (*GetMembershipStatusResponse, error)
	// Not implemented.
	FetchData(*FetchDataRequest, TrustRegistry_FetchDataServer) error
	mustEmbedUnimplementedTrustRegistryServer()
}

// UnimplementedTrustRegistryServer must be embedded to have forward compatible implementations.
type UnimplementedTrustRegistryServer struct {
}

func (UnimplementedTrustRegistryServer) AddFramework(context.Context, *AddFrameworkRequest) (*AddFrameworkResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AddFramework not implemented")
}
func (UnimplementedTrustRegistryServer) RemoveFramework(context.Context, *RemoveFrameworkRequest) (*RemoveFrameworkResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RemoveFramework not implemented")
}
func (UnimplementedTrustRegistryServer) SearchRegistry(context.Context, *SearchRegistryRequest) (*SearchRegistryResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SearchRegistry not implemented")
}
func (UnimplementedTrustRegistryServer) RegisterMember(context.Context, *RegisterMemberRequest) (*RegisterMemberResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RegisterMember not implemented")
}
func (UnimplementedTrustRegistryServer) UnregisterMember(context.Context, *UnregisterMemberRequest) (*UnregisterMemberResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UnregisterMember not implemented")
}
func (UnimplementedTrustRegistryServer) GetMembershipStatus(context.Context, *GetMembershipStatusRequest) (*GetMembershipStatusResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetMembershipStatus not implemented")
}
func (UnimplementedTrustRegistryServer) FetchData(*FetchDataRequest, TrustRegistry_FetchDataServer) error {
	return status.Errorf(codes.Unimplemented, "method FetchData not implemented")
}
func (UnimplementedTrustRegistryServer) mustEmbedUnimplementedTrustRegistryServer() {}

// UnsafeTrustRegistryServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to TrustRegistryServer will
// result in compilation errors.
type UnsafeTrustRegistryServer interface {
	mustEmbedUnimplementedTrustRegistryServer()
}

func RegisterTrustRegistryServer(s grpc.ServiceRegistrar, srv TrustRegistryServer) {
	s.RegisterService(&TrustRegistry_ServiceDesc, srv)
}

func _TrustRegistry_AddFramework_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AddFrameworkRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TrustRegistryServer).AddFramework(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/services.trustregistry.v1.TrustRegistry/AddFramework",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TrustRegistryServer).AddFramework(ctx, req.(*AddFrameworkRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _TrustRegistry_RemoveFramework_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RemoveFrameworkRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TrustRegistryServer).RemoveFramework(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/services.trustregistry.v1.TrustRegistry/RemoveFramework",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TrustRegistryServer).RemoveFramework(ctx, req.(*RemoveFrameworkRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _TrustRegistry_SearchRegistry_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(SearchRegistryRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TrustRegistryServer).SearchRegistry(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/services.trustregistry.v1.TrustRegistry/SearchRegistry",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TrustRegistryServer).SearchRegistry(ctx, req.(*SearchRegistryRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _TrustRegistry_RegisterMember_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RegisterMemberRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TrustRegistryServer).RegisterMember(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/services.trustregistry.v1.TrustRegistry/RegisterMember",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TrustRegistryServer).RegisterMember(ctx, req.(*RegisterMemberRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _TrustRegistry_UnregisterMember_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UnregisterMemberRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TrustRegistryServer).UnregisterMember(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/services.trustregistry.v1.TrustRegistry/UnregisterMember",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TrustRegistryServer).UnregisterMember(ctx, req.(*UnregisterMemberRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _TrustRegistry_GetMembershipStatus_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetMembershipStatusRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TrustRegistryServer).GetMembershipStatus(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/services.trustregistry.v1.TrustRegistry/GetMembershipStatus",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TrustRegistryServer).GetMembershipStatus(ctx, req.(*GetMembershipStatusRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _TrustRegistry_FetchData_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(FetchDataRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(TrustRegistryServer).FetchData(m, &trustRegistryFetchDataServer{stream})
}

type TrustRegistry_FetchDataServer interface {
	Send(*FetchDataResponse) error
	grpc.ServerStream
}

type trustRegistryFetchDataServer struct {
	grpc.ServerStream
}

func (x *trustRegistryFetchDataServer) Send(m *FetchDataResponse) error {
	return x.ServerStream.SendMsg(m)
}

// TrustRegistry_ServiceDesc is the grpc.ServiceDesc for TrustRegistry service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var TrustRegistry_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "services.trustregistry.v1.TrustRegistry",
	HandlerType: (*TrustRegistryServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "AddFramework",
			Handler:    _TrustRegistry_AddFramework_Handler,
		},
		{
			MethodName: "RemoveFramework",
			Handler:    _TrustRegistry_RemoveFramework_Handler,
		},
		{
			MethodName: "SearchRegistry",
			Handler:    _TrustRegistry_SearchRegistry_Handler,
		},
		{
			MethodName: "RegisterMember",
			Handler:    _TrustRegistry_RegisterMember_Handler,
		},
		{
			MethodName: "UnregisterMember",
			Handler:    _TrustRegistry_UnregisterMember_Handler,
		},
		{
			MethodName: "GetMembershipStatus",
			Handler:    _TrustRegistry_GetMembershipStatus_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "FetchData",
			Handler:       _TrustRegistry_FetchData_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "services/trust-registry/v1/trust-registry.proto",
}
