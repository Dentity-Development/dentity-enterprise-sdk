from trinsic.proto.sdk.options.v1 import ServiceOptions
from trinsic.proto.services.verifiablecredentials.templates.v1 import *
from trinsic.service_base import ServiceBase


class TemplateService(ServiceBase):
    """Wrapper for the [Credential Templates Service](/reference/services/CredentialTemplates-service/)"""

    def __init__(
        self,
        *,
        server_config: ServiceOptions = None,
    ):
        """
        Initialize a connection to the server.
        Args:
            server_config: The URL of the server, or a channel which encapsulates the connection already.
        """
        super().__init__(server_config)
        self.client = CredentialTemplatesStub(super().channel)

    async def search_template(
        self, *, request: SearchCredentialTemplatesRequest
    ) -> SearchCredentialTemplatesResponse:
        request.query = request.query or "SELECT * from c OFFSET 0 LIMIT 100"
        return await self.client.search(search_credential_templates_request=request)

    # BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    # target: C:\work\sdk\python\trinsic\template_service.py

    async def create(
        self, *, request: CreateCredentialTemplateRequest
    ) -> Createcredentialtemplateresponse:
        """
        Create a credential template in the current ecosystem
        """
        return await self.client.create(request, metadata=self.build_metadata(request))

    async def get(
        self, *, request: GetCredentialTemplateRequest
    ) -> Getcredentialtemplateresponse:
        """
        Fetch a credential template by ID
        """
        return await self.client.get(request, metadata=self.build_metadata(request))

    async def list(
        self, *, request: ListCredentialTemplatesRequest
    ) -> Listcredentialtemplatesresponse:
        """
        Search credential templates using SQL, returning strongly-typed template data
        """
        return await self.client.list(request, metadata=self.build_metadata(request))

    async def search(
        self, *, request: SearchCredentialTemplatesRequest
    ) -> Searchcredentialtemplatesresponse:
        """
        Search credential templates using SQL, returning raw JSON data
        """
        return await self.client.search(request, metadata=self.build_metadata(request))

    async def delete(
        self, *, request: DeleteCredentialTemplateRequest
    ) -> Deletecredentialtemplateresponse:
        """
        Delete a credential template from the current ecosystem by ID
        """
        return await self.client.delete(request, metadata=self.build_metadata(request))


# END Code generated by protoc-gen-trinsic. DO NOT EDIT.
