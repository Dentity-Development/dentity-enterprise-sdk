package services

import (
	"context"

	"github.com/trinsic-id/sdk/go/proto/services/verifiablecredentials/templates/v1/template"
)

// NewTemplateService returns a credential template service with the base service configured
// using the provided options
func NewTemplateService(options *Options) (TemplateService, error) {
	base, err := NewServiceBase(options)
	if err != nil {
		return nil, err
	}
	service := &credentialTemplatesBase{
		Service: base,
		client:  template.NewCredentialTemplatesClient(base.GetChannel()),
	}

	return service, nil
}

// TemplateService defines the interface for interacting with credentials templates
type TemplateService interface {
	Service
// BEGIN Interface Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: C:\work\sdk\go\services\template_service.go

    // Create  Create a credential template in the current ecosystem 
    Create(userContext context.Context, request *template.CreateCredentialTemplateRequest) (*template.CreateCredentialTemplateResponse, error)
    // Get  Fetch a credential template by ID 
    Get(userContext context.Context, request *template.GetCredentialTemplateRequest) (*template.GetCredentialTemplateResponse, error)
    // Update  Update metadata of a template 
    Update(userContext context.Context, request *template.UpdateCredentialTemplateRequest) (*template.UpdateCredentialTemplateResponse, error)
    // List  Search credential templates using SQL, returning strongly-typed template data 
    List(userContext context.Context, request *template.ListCredentialTemplatesRequest) (*template.ListCredentialTemplatesResponse, error)
    // Search  Search credential templates using SQL, returning raw JSON data 
    Search(userContext context.Context, request *template.SearchCredentialTemplatesRequest) (*template.SearchCredentialTemplatesResponse, error)
    // Delete  Delete a credential template from the current ecosystem by ID 
    Delete(userContext context.Context, request *template.DeleteCredentialTemplateRequest) (*template.DeleteCredentialTemplateResponse, error)
    // CreateVerificationTemplate Deprecated: This method is experimental
// Create/update verification templates 
    CreateVerificationTemplate(userContext context.Context, request *template.CreateVerificationTemplateRequest) (*template.CreateVerificationTemplateResponse, error)
    // ListVerificationTemplates Deprecated: This method is experimental 
    ListVerificationTemplates(userContext context.Context, request *template.ListVerificationTemplatesRequest) (*template.ListVerificationTemplatesResponse, error)
    // GetVerificationTemplate Deprecated: This method is experimental 
    GetVerificationTemplate(userContext context.Context, request *template.GetVerificationTemplateRequest) (*template.GetVerificationTemplateResponse, error)
    // UpdateVerificationTemplate Deprecated: This method is experimental 
    UpdateVerificationTemplate(userContext context.Context, request *template.UpdateVerificationTemplateRequest) (*template.UpdateVerificationTemplateResponse, error)
    // DeleteVerificationTemplate Deprecated: This method is experimental 
    DeleteVerificationTemplate(userContext context.Context, request *template.DeleteVerificationTemplateRequest) (*template.DeleteVerificationTemplateResponse, error)

// END Interface Code generated by protoc-gen-trinsic. DO NOT EDIT.
}

type credentialTemplatesBase struct {
	Service
	client template.CredentialTemplatesClient
}

// BEGIN Implementation Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: C:\work\sdk\go\services\template_service.go

// Create  Create a credential template in the current ecosystem
func (t *credentialTemplatesBase) Create(userContext context.Context, request *template.CreateCredentialTemplateRequest) (*template.CreateCredentialTemplateResponse, error) {
    md, err := t.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := t.client.Create(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// Get  Fetch a credential template by ID
func (t *credentialTemplatesBase) Get(userContext context.Context, request *template.GetCredentialTemplateRequest) (*template.GetCredentialTemplateResponse, error) {
    md, err := t.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := t.client.Get(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// Update  Update metadata of a template
func (t *credentialTemplatesBase) Update(userContext context.Context, request *template.UpdateCredentialTemplateRequest) (*template.UpdateCredentialTemplateResponse, error) {
    md, err := t.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := t.client.Update(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// List  Search credential templates using SQL, returning strongly-typed template data
func (t *credentialTemplatesBase) List(userContext context.Context, request *template.ListCredentialTemplatesRequest) (*template.ListCredentialTemplatesResponse, error) {
    md, err := t.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := t.client.List(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// Search  Search credential templates using SQL, returning raw JSON data
func (t *credentialTemplatesBase) Search(userContext context.Context, request *template.SearchCredentialTemplatesRequest) (*template.SearchCredentialTemplatesResponse, error) {
    md, err := t.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := t.client.Search(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// Delete  Delete a credential template from the current ecosystem by ID
func (t *credentialTemplatesBase) Delete(userContext context.Context, request *template.DeleteCredentialTemplateRequest) (*template.DeleteCredentialTemplateResponse, error) {
    md, err := t.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := t.client.Delete(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// CreateVerificationTemplate Deprecated: This method is experimental
// Create/update verification templates
func (t *credentialTemplatesBase) CreateVerificationTemplate(userContext context.Context, request *template.CreateVerificationTemplateRequest) (*template.CreateVerificationTemplateResponse, error) {
    md, err := t.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := t.client.CreateVerificationTemplate(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// ListVerificationTemplates Deprecated: This method is experimental
func (t *credentialTemplatesBase) ListVerificationTemplates(userContext context.Context, request *template.ListVerificationTemplatesRequest) (*template.ListVerificationTemplatesResponse, error) {
    md, err := t.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := t.client.ListVerificationTemplates(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// GetVerificationTemplate Deprecated: This method is experimental
func (t *credentialTemplatesBase) GetVerificationTemplate(userContext context.Context, request *template.GetVerificationTemplateRequest) (*template.GetVerificationTemplateResponse, error) {
    md, err := t.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := t.client.GetVerificationTemplate(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// UpdateVerificationTemplate Deprecated: This method is experimental
func (t *credentialTemplatesBase) UpdateVerificationTemplate(userContext context.Context, request *template.UpdateVerificationTemplateRequest) (*template.UpdateVerificationTemplateResponse, error) {
    md, err := t.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := t.client.UpdateVerificationTemplate(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// DeleteVerificationTemplate Deprecated: This method is experimental
func (t *credentialTemplatesBase) DeleteVerificationTemplate(userContext context.Context, request *template.DeleteVerificationTemplateRequest) (*template.DeleteVerificationTemplateResponse, error) {
    md, err := t.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := t.client.DeleteVerificationTemplate(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// END Implementation Code generated by protoc-gen-trinsic. DO NOT EDIT.
