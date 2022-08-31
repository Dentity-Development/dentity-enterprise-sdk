package services

import (
	"context"
	"github.com/golang/protobuf/ptypes/empty"
	"github.com/trinsic-id/sdk/go/proto/services/debug/v1/debug"
)

// NewDebugService returns an instance of the debugging service
func NewDebugService(options *Options) (DebugService, error) {
	base, err := NewServiceBase(options)
	if err != nil {
		return nil, err
	}
	service := &debugBase{
		Service: base,
		client:  debug.NewDebuggingClient(base.GetChannel()),
	}

	return service, nil
}

type DebugService interface {
	Service
	// BEGIN Interface Code generated by protoc-gen-trinsic. DO NOT EDIT.
	// target: /home/runner/work/sdk/sdk/go/services/debug_service.go

	CallEmpty(userContext context.Context, request *empty.Empty) (*empty.Empty, error)

	CallEmptyAuth(userContext context.Context, request *empty.Empty) (*empty.Empty, error)

	// END Interface Code generated by protoc-gen-trinsic. DO NOT EDIT.
}

type debugBase struct {
	Service
	client debug.DebuggingClient
}

// BEGIN Implementation Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: /home/runner/work/sdk/sdk/go/services/debug_service.go

func (d *debugBase) CallEmpty(userContext context.Context, request *empty.Empty) (*empty.Empty, error) {
	// TODO - Handle a flag for the metadata context
	md, err := d.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := d.client.CallEmpty(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

func (d *debugBase) CallEmptyAuth(userContext context.Context, request *empty.Empty) (*empty.Empty, error) {
	// TODO - Handle a flag for the metadata context
	md, err := d.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := d.client.CallEmptyAuth(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// END Implementation Code generated by protoc-gen-trinsic. DO NOT EDIT.
