// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.3.0
// - protoc             v3.20.3
// source: services/universal-wallet/v1/universal-wallet.proto

package wallet

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

const (
	UniversalWallet_GetItem_FullMethodName                    = "/services.universalwallet.v1.UniversalWallet/GetItem"
	UniversalWallet_Search_FullMethodName                     = "/services.universalwallet.v1.UniversalWallet/Search"
	UniversalWallet_InsertItem_FullMethodName                 = "/services.universalwallet.v1.UniversalWallet/InsertItem"
	UniversalWallet_UpdateItem_FullMethodName                 = "/services.universalwallet.v1.UniversalWallet/UpdateItem"
	UniversalWallet_DeleteItem_FullMethodName                 = "/services.universalwallet.v1.UniversalWallet/DeleteItem"
	UniversalWallet_DeleteWallet_FullMethodName               = "/services.universalwallet.v1.UniversalWallet/DeleteWallet"
	UniversalWallet_CreateWallet_FullMethodName               = "/services.universalwallet.v1.UniversalWallet/CreateWallet"
	UniversalWallet_GetWalletInfo_FullMethodName              = "/services.universalwallet.v1.UniversalWallet/GetWalletInfo"
	UniversalWallet_GetMyInfo_FullMethodName                  = "/services.universalwallet.v1.UniversalWallet/GetMyInfo"
	UniversalWallet_GenerateAuthToken_FullMethodName          = "/services.universalwallet.v1.UniversalWallet/GenerateAuthToken"
	UniversalWallet_RevokeAuthToken_FullMethodName            = "/services.universalwallet.v1.UniversalWallet/RevokeAuthToken"
	UniversalWallet_AddExternalIdentityInit_FullMethodName    = "/services.universalwallet.v1.UniversalWallet/AddExternalIdentityInit"
	UniversalWallet_AddExternalIdentityConfirm_FullMethodName = "/services.universalwallet.v1.UniversalWallet/AddExternalIdentityConfirm"
	UniversalWallet_AuthenticateInit_FullMethodName           = "/services.universalwallet.v1.UniversalWallet/AuthenticateInit"
	UniversalWallet_AuthenticateConfirm_FullMethodName        = "/services.universalwallet.v1.UniversalWallet/AuthenticateConfirm"
	UniversalWallet_ListWallets_FullMethodName                = "/services.universalwallet.v1.UniversalWallet/ListWallets"
)

// UniversalWalletClient is the client API for UniversalWallet service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type UniversalWalletClient interface {
	// Retrieve an item from the wallet with a given item identifier
	GetItem(ctx context.Context, in *GetItemRequest, opts ...grpc.CallOption) (*GetItemResponse, error)
	// Search the wallet using a SQL syntax
	Search(ctx context.Context, in *SearchRequest, opts ...grpc.CallOption) (*SearchResponse, error)
	// Insert an item into the wallet
	InsertItem(ctx context.Context, in *InsertItemRequest, opts ...grpc.CallOption) (*InsertItemResponse, error)
	// Update an item in the wallet
	UpdateItem(ctx context.Context, in *UpdateItemRequest, opts ...grpc.CallOption) (*UpdateItemResponse, error)
	// Delete an item from the wallet permanently
	DeleteItem(ctx context.Context, in *DeleteItemRequest, opts ...grpc.CallOption) (*DeleteItemResponse, error)
	// Delete a wallet and its credentials
	DeleteWallet(ctx context.Context, in *DeleteWalletRequest, opts ...grpc.CallOption) (*DeleteWalletResponse, error)
	// Create a new wallet and generate an auth token for access
	CreateWallet(ctx context.Context, in *CreateWalletRequest, opts ...grpc.CallOption) (*CreateWalletResponse, error)
	// Retrieve wallet details and configuration
	GetWalletInfo(ctx context.Context, in *GetWalletInfoRequest, opts ...grpc.CallOption) (*GetWalletInfoResponse, error)
	// Retrieve wallet details and configuration about the currently authenticated wallet
	GetMyInfo(ctx context.Context, in *GetMyInfoRequest, opts ...grpc.CallOption) (*GetMyInfoResponse, error)
	// Generate new token for a given wallet and add it to the collection of known auth tokens.
	// This endpoint requires authentication and will return a new token ID and auth token.
	// Use this endpoint if you want to authorize another device, without having to share your
	// existing auth token.
	GenerateAuthToken(ctx context.Context, in *GenerateAuthTokenRequest, opts ...grpc.CallOption) (*GenerateAuthTokenResponse, error)
	// Revokes a previously issued auth token and updates the collection of known auth tokens.
	// This endpoint requires authentication.
	RevokeAuthToken(ctx context.Context, in *RevokeAuthTokenRequest, opts ...grpc.CallOption) (*RevokeAuthTokenResponse, error)
	// Add new external identity to the current wallet, such as email, sms, ethereum address, etc.
	// This identity ownership must be confirmed using `AddIdentityConfirm` via OTP, signature, etc.
	AddExternalIdentityInit(ctx context.Context, in *AddExternalIdentityInitRequest, opts ...grpc.CallOption) (*AddExternalIdentityInitResponse, error)
	// Confirm identity added to the current wallet using `AddIdentity`
	AddExternalIdentityConfirm(ctx context.Context, in *AddExternalIdentityConfirmRequest, opts ...grpc.CallOption) (*AddExternalIdentityConfirmResponse, error)
	// Sign-in to an already existing wallet, using an identity added that was previously registered
	// This endpoint does not require authentication, and will return a challenge to be signed or verified
	AuthenticateInit(ctx context.Context, in *AuthenticateInitRequest, opts ...grpc.CallOption) (*AuthenticateInitResponse, error)
	// Confirm sign-in to an already existing wallet and return authentication token
	AuthenticateConfirm(ctx context.Context, in *AuthenticateConfirmRequest, opts ...grpc.CallOption) (*AuthenticateConfirmResponse, error)
	// List all wallets in the ecosystem
	ListWallets(ctx context.Context, in *ListWalletsRequest, opts ...grpc.CallOption) (*ListWalletsResponse, error)
}

type universalWalletClient struct {
	cc grpc.ClientConnInterface
}

func NewUniversalWalletClient(cc grpc.ClientConnInterface) UniversalWalletClient {
	return &universalWalletClient{cc}
}

func (c *universalWalletClient) GetItem(ctx context.Context, in *GetItemRequest, opts ...grpc.CallOption) (*GetItemResponse, error) {
	out := new(GetItemResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_GetItem_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) Search(ctx context.Context, in *SearchRequest, opts ...grpc.CallOption) (*SearchResponse, error) {
	out := new(SearchResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_Search_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) InsertItem(ctx context.Context, in *InsertItemRequest, opts ...grpc.CallOption) (*InsertItemResponse, error) {
	out := new(InsertItemResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_InsertItem_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) UpdateItem(ctx context.Context, in *UpdateItemRequest, opts ...grpc.CallOption) (*UpdateItemResponse, error) {
	out := new(UpdateItemResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_UpdateItem_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) DeleteItem(ctx context.Context, in *DeleteItemRequest, opts ...grpc.CallOption) (*DeleteItemResponse, error) {
	out := new(DeleteItemResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_DeleteItem_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) DeleteWallet(ctx context.Context, in *DeleteWalletRequest, opts ...grpc.CallOption) (*DeleteWalletResponse, error) {
	out := new(DeleteWalletResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_DeleteWallet_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) CreateWallet(ctx context.Context, in *CreateWalletRequest, opts ...grpc.CallOption) (*CreateWalletResponse, error) {
	out := new(CreateWalletResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_CreateWallet_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) GetWalletInfo(ctx context.Context, in *GetWalletInfoRequest, opts ...grpc.CallOption) (*GetWalletInfoResponse, error) {
	out := new(GetWalletInfoResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_GetWalletInfo_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) GetMyInfo(ctx context.Context, in *GetMyInfoRequest, opts ...grpc.CallOption) (*GetMyInfoResponse, error) {
	out := new(GetMyInfoResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_GetMyInfo_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) GenerateAuthToken(ctx context.Context, in *GenerateAuthTokenRequest, opts ...grpc.CallOption) (*GenerateAuthTokenResponse, error) {
	out := new(GenerateAuthTokenResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_GenerateAuthToken_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) RevokeAuthToken(ctx context.Context, in *RevokeAuthTokenRequest, opts ...grpc.CallOption) (*RevokeAuthTokenResponse, error) {
	out := new(RevokeAuthTokenResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_RevokeAuthToken_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) AddExternalIdentityInit(ctx context.Context, in *AddExternalIdentityInitRequest, opts ...grpc.CallOption) (*AddExternalIdentityInitResponse, error) {
	out := new(AddExternalIdentityInitResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_AddExternalIdentityInit_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) AddExternalIdentityConfirm(ctx context.Context, in *AddExternalIdentityConfirmRequest, opts ...grpc.CallOption) (*AddExternalIdentityConfirmResponse, error) {
	out := new(AddExternalIdentityConfirmResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_AddExternalIdentityConfirm_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) AuthenticateInit(ctx context.Context, in *AuthenticateInitRequest, opts ...grpc.CallOption) (*AuthenticateInitResponse, error) {
	out := new(AuthenticateInitResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_AuthenticateInit_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) AuthenticateConfirm(ctx context.Context, in *AuthenticateConfirmRequest, opts ...grpc.CallOption) (*AuthenticateConfirmResponse, error) {
	out := new(AuthenticateConfirmResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_AuthenticateConfirm_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *universalWalletClient) ListWallets(ctx context.Context, in *ListWalletsRequest, opts ...grpc.CallOption) (*ListWalletsResponse, error) {
	out := new(ListWalletsResponse)
	err := c.cc.Invoke(ctx, UniversalWallet_ListWallets_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// UniversalWalletServer is the server API for UniversalWallet service.
// All implementations must embed UnimplementedUniversalWalletServer
// for forward compatibility
type UniversalWalletServer interface {
	// Retrieve an item from the wallet with a given item identifier
	GetItem(context.Context, *GetItemRequest) (*GetItemResponse, error)
	// Search the wallet using a SQL syntax
	Search(context.Context, *SearchRequest) (*SearchResponse, error)
	// Insert an item into the wallet
	InsertItem(context.Context, *InsertItemRequest) (*InsertItemResponse, error)
	// Update an item in the wallet
	UpdateItem(context.Context, *UpdateItemRequest) (*UpdateItemResponse, error)
	// Delete an item from the wallet permanently
	DeleteItem(context.Context, *DeleteItemRequest) (*DeleteItemResponse, error)
	// Delete a wallet and its credentials
	DeleteWallet(context.Context, *DeleteWalletRequest) (*DeleteWalletResponse, error)
	// Create a new wallet and generate an auth token for access
	CreateWallet(context.Context, *CreateWalletRequest) (*CreateWalletResponse, error)
	// Retrieve wallet details and configuration
	GetWalletInfo(context.Context, *GetWalletInfoRequest) (*GetWalletInfoResponse, error)
	// Retrieve wallet details and configuration about the currently authenticated wallet
	GetMyInfo(context.Context, *GetMyInfoRequest) (*GetMyInfoResponse, error)
	// Generate new token for a given wallet and add it to the collection of known auth tokens.
	// This endpoint requires authentication and will return a new token ID and auth token.
	// Use this endpoint if you want to authorize another device, without having to share your
	// existing auth token.
	GenerateAuthToken(context.Context, *GenerateAuthTokenRequest) (*GenerateAuthTokenResponse, error)
	// Revokes a previously issued auth token and updates the collection of known auth tokens.
	// This endpoint requires authentication.
	RevokeAuthToken(context.Context, *RevokeAuthTokenRequest) (*RevokeAuthTokenResponse, error)
	// Add new external identity to the current wallet, such as email, sms, ethereum address, etc.
	// This identity ownership must be confirmed using `AddIdentityConfirm` via OTP, signature, etc.
	AddExternalIdentityInit(context.Context, *AddExternalIdentityInitRequest) (*AddExternalIdentityInitResponse, error)
	// Confirm identity added to the current wallet using `AddIdentity`
	AddExternalIdentityConfirm(context.Context, *AddExternalIdentityConfirmRequest) (*AddExternalIdentityConfirmResponse, error)
	// Sign-in to an already existing wallet, using an identity added that was previously registered
	// This endpoint does not require authentication, and will return a challenge to be signed or verified
	AuthenticateInit(context.Context, *AuthenticateInitRequest) (*AuthenticateInitResponse, error)
	// Confirm sign-in to an already existing wallet and return authentication token
	AuthenticateConfirm(context.Context, *AuthenticateConfirmRequest) (*AuthenticateConfirmResponse, error)
	// List all wallets in the ecosystem
	ListWallets(context.Context, *ListWalletsRequest) (*ListWalletsResponse, error)
	mustEmbedUnimplementedUniversalWalletServer()
}

// UnimplementedUniversalWalletServer must be embedded to have forward compatible implementations.
type UnimplementedUniversalWalletServer struct {
}

func (UnimplementedUniversalWalletServer) GetItem(context.Context, *GetItemRequest) (*GetItemResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetItem not implemented")
}
func (UnimplementedUniversalWalletServer) Search(context.Context, *SearchRequest) (*SearchResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Search not implemented")
}
func (UnimplementedUniversalWalletServer) InsertItem(context.Context, *InsertItemRequest) (*InsertItemResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method InsertItem not implemented")
}
func (UnimplementedUniversalWalletServer) UpdateItem(context.Context, *UpdateItemRequest) (*UpdateItemResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateItem not implemented")
}
func (UnimplementedUniversalWalletServer) DeleteItem(context.Context, *DeleteItemRequest) (*DeleteItemResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteItem not implemented")
}
func (UnimplementedUniversalWalletServer) DeleteWallet(context.Context, *DeleteWalletRequest) (*DeleteWalletResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteWallet not implemented")
}
func (UnimplementedUniversalWalletServer) CreateWallet(context.Context, *CreateWalletRequest) (*CreateWalletResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateWallet not implemented")
}
func (UnimplementedUniversalWalletServer) GetWalletInfo(context.Context, *GetWalletInfoRequest) (*GetWalletInfoResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetWalletInfo not implemented")
}
func (UnimplementedUniversalWalletServer) GetMyInfo(context.Context, *GetMyInfoRequest) (*GetMyInfoResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetMyInfo not implemented")
}
func (UnimplementedUniversalWalletServer) GenerateAuthToken(context.Context, *GenerateAuthTokenRequest) (*GenerateAuthTokenResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GenerateAuthToken not implemented")
}
func (UnimplementedUniversalWalletServer) RevokeAuthToken(context.Context, *RevokeAuthTokenRequest) (*RevokeAuthTokenResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RevokeAuthToken not implemented")
}
func (UnimplementedUniversalWalletServer) AddExternalIdentityInit(context.Context, *AddExternalIdentityInitRequest) (*AddExternalIdentityInitResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AddExternalIdentityInit not implemented")
}
func (UnimplementedUniversalWalletServer) AddExternalIdentityConfirm(context.Context, *AddExternalIdentityConfirmRequest) (*AddExternalIdentityConfirmResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AddExternalIdentityConfirm not implemented")
}
func (UnimplementedUniversalWalletServer) AuthenticateInit(context.Context, *AuthenticateInitRequest) (*AuthenticateInitResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AuthenticateInit not implemented")
}
func (UnimplementedUniversalWalletServer) AuthenticateConfirm(context.Context, *AuthenticateConfirmRequest) (*AuthenticateConfirmResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AuthenticateConfirm not implemented")
}
func (UnimplementedUniversalWalletServer) ListWallets(context.Context, *ListWalletsRequest) (*ListWalletsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListWallets not implemented")
}
func (UnimplementedUniversalWalletServer) mustEmbedUnimplementedUniversalWalletServer() {}

// UnsafeUniversalWalletServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to UniversalWalletServer will
// result in compilation errors.
type UnsafeUniversalWalletServer interface {
	mustEmbedUnimplementedUniversalWalletServer()
}

func RegisterUniversalWalletServer(s grpc.ServiceRegistrar, srv UniversalWalletServer) {
	s.RegisterService(&UniversalWallet_ServiceDesc, srv)
}

func _UniversalWallet_GetItem_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetItemRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).GetItem(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_GetItem_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).GetItem(ctx, req.(*GetItemRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_Search_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(SearchRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).Search(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_Search_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).Search(ctx, req.(*SearchRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_InsertItem_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(InsertItemRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).InsertItem(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_InsertItem_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).InsertItem(ctx, req.(*InsertItemRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_UpdateItem_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateItemRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).UpdateItem(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_UpdateItem_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).UpdateItem(ctx, req.(*UpdateItemRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_DeleteItem_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteItemRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).DeleteItem(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_DeleteItem_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).DeleteItem(ctx, req.(*DeleteItemRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_DeleteWallet_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteWalletRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).DeleteWallet(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_DeleteWallet_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).DeleteWallet(ctx, req.(*DeleteWalletRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_CreateWallet_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateWalletRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).CreateWallet(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_CreateWallet_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).CreateWallet(ctx, req.(*CreateWalletRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_GetWalletInfo_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetWalletInfoRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).GetWalletInfo(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_GetWalletInfo_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).GetWalletInfo(ctx, req.(*GetWalletInfoRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_GetMyInfo_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetMyInfoRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).GetMyInfo(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_GetMyInfo_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).GetMyInfo(ctx, req.(*GetMyInfoRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_GenerateAuthToken_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GenerateAuthTokenRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).GenerateAuthToken(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_GenerateAuthToken_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).GenerateAuthToken(ctx, req.(*GenerateAuthTokenRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_RevokeAuthToken_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RevokeAuthTokenRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).RevokeAuthToken(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_RevokeAuthToken_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).RevokeAuthToken(ctx, req.(*RevokeAuthTokenRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_AddExternalIdentityInit_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AddExternalIdentityInitRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).AddExternalIdentityInit(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_AddExternalIdentityInit_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).AddExternalIdentityInit(ctx, req.(*AddExternalIdentityInitRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_AddExternalIdentityConfirm_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AddExternalIdentityConfirmRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).AddExternalIdentityConfirm(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_AddExternalIdentityConfirm_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).AddExternalIdentityConfirm(ctx, req.(*AddExternalIdentityConfirmRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_AuthenticateInit_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AuthenticateInitRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).AuthenticateInit(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_AuthenticateInit_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).AuthenticateInit(ctx, req.(*AuthenticateInitRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_AuthenticateConfirm_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AuthenticateConfirmRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).AuthenticateConfirm(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_AuthenticateConfirm_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).AuthenticateConfirm(ctx, req.(*AuthenticateConfirmRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _UniversalWallet_ListWallets_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListWalletsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(UniversalWalletServer).ListWallets(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: UniversalWallet_ListWallets_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(UniversalWalletServer).ListWallets(ctx, req.(*ListWalletsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// UniversalWallet_ServiceDesc is the grpc.ServiceDesc for UniversalWallet service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var UniversalWallet_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "services.universalwallet.v1.UniversalWallet",
	HandlerType: (*UniversalWalletServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetItem",
			Handler:    _UniversalWallet_GetItem_Handler,
		},
		{
			MethodName: "Search",
			Handler:    _UniversalWallet_Search_Handler,
		},
		{
			MethodName: "InsertItem",
			Handler:    _UniversalWallet_InsertItem_Handler,
		},
		{
			MethodName: "UpdateItem",
			Handler:    _UniversalWallet_UpdateItem_Handler,
		},
		{
			MethodName: "DeleteItem",
			Handler:    _UniversalWallet_DeleteItem_Handler,
		},
		{
			MethodName: "DeleteWallet",
			Handler:    _UniversalWallet_DeleteWallet_Handler,
		},
		{
			MethodName: "CreateWallet",
			Handler:    _UniversalWallet_CreateWallet_Handler,
		},
		{
			MethodName: "GetWalletInfo",
			Handler:    _UniversalWallet_GetWalletInfo_Handler,
		},
		{
			MethodName: "GetMyInfo",
			Handler:    _UniversalWallet_GetMyInfo_Handler,
		},
		{
			MethodName: "GenerateAuthToken",
			Handler:    _UniversalWallet_GenerateAuthToken_Handler,
		},
		{
			MethodName: "RevokeAuthToken",
			Handler:    _UniversalWallet_RevokeAuthToken_Handler,
		},
		{
			MethodName: "AddExternalIdentityInit",
			Handler:    _UniversalWallet_AddExternalIdentityInit_Handler,
		},
		{
			MethodName: "AddExternalIdentityConfirm",
			Handler:    _UniversalWallet_AddExternalIdentityConfirm_Handler,
		},
		{
			MethodName: "AuthenticateInit",
			Handler:    _UniversalWallet_AuthenticateInit_Handler,
		},
		{
			MethodName: "AuthenticateConfirm",
			Handler:    _UniversalWallet_AuthenticateConfirm_Handler,
		},
		{
			MethodName: "ListWallets",
			Handler:    _UniversalWallet_ListWallets_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "services/universal-wallet/v1/universal-wallet.proto",
}
