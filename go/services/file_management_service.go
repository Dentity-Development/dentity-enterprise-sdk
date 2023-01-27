package services

import "context"
import "github.com/trinsic-id/sdk/go/proto/services/filemanagement/v1/filemanagement"

// NewFileManagementService returns a file management service with the base service configured
// using the provided options
func NewFileManagementService(options *Options) (FileManagementService, error) {
	base, err := NewServiceBase(options)
	if err != nil {
		return nil, err
	}
	service := &fileManagementBase{
		Service: base,
		client:  filemanagement.NewFileManagementClient(base.GetChannel()),
	}

	return service, nil
}

// FileManagementService defines the interface for interacting with credentials
type FileManagementService interface {
	Service
	// BEGIN Interface Code generated by protoc-gen-trinsic. DO NOT EDIT.
	// target: D:\trinsic\sdk\go\services\file_management_service.go

	// UploadFile  Upload a file to Trinsic's CDN
	UploadFile(userContext context.Context, request *filemanagement.UploadFileRequest) (*filemanagement.UploadFileResponse, error)
	// GetFile  Fetch information about a file by its ID
	GetFile(userContext context.Context, request *filemanagement.GetFileRequest) (*filemanagement.GetFileResponse, error)
	// DeleteFile  Delete a file by its ID
	DeleteFile(userContext context.Context, request *filemanagement.DeleteFileRequest) (*filemanagement.DeleteFileResponse, error)
	// ListFiles  List files the calling account has uploaded
	ListFiles(userContext context.Context, request *filemanagement.ListFilesRequest) (*filemanagement.ListFilesResponse, error)
	// GetStorageStats  Get statistics about files uploaded by the calling account
	GetStorageStats(userContext context.Context, request *filemanagement.GetStorageStatsRequest) (*filemanagement.GetStorageStatsResponse, error)

	// END Interface Code generated by protoc-gen-trinsic. DO NOT EDIT.
}

type fileManagementBase struct {
	Service
	client filemanagement.FileManagementClient
}

// BEGIN Implementation Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: D:\trinsic\sdk\go\services\file_management_service.go

// UploadFile  Upload a file to Trinsic's CDN
func (f *fileManagementBase) UploadFile(userContext context.Context, request *filemanagement.UploadFileRequest) (*filemanagement.UploadFileResponse, error) {
	md, err := f.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := f.client.UploadFile(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// GetFile  Fetch information about a file by its ID
func (f *fileManagementBase) GetFile(userContext context.Context, request *filemanagement.GetFileRequest) (*filemanagement.GetFileResponse, error) {
	md, err := f.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := f.client.GetFile(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// DeleteFile  Delete a file by its ID
func (f *fileManagementBase) DeleteFile(userContext context.Context, request *filemanagement.DeleteFileRequest) (*filemanagement.DeleteFileResponse, error) {
	md, err := f.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := f.client.DeleteFile(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// ListFiles  List files the calling account has uploaded
func (f *fileManagementBase) ListFiles(userContext context.Context, request *filemanagement.ListFilesRequest) (*filemanagement.ListFilesResponse, error) {
	md, err := f.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := f.client.ListFiles(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// GetStorageStats  Get statistics about files uploaded by the calling account
func (f *fileManagementBase) GetStorageStats(userContext context.Context, request *filemanagement.GetStorageStatsRequest) (*filemanagement.GetStorageStatsResponse, error) {
	md, err := f.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := f.client.GetStorageStats(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// END Implementation Code generated by protoc-gen-trinsic. DO NOT EDIT.
