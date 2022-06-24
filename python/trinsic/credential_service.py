from trinsic.proto.sdk.options.v1 import ServiceOptions
from trinsic.proto.services.verifiablecredentials.v1 import *
from trinsic.service_base import ServiceBase, ResponseStatusException


class CredentialService(ServiceBase):
    """Wrapper for the [Credentials Service](/reference/services/Credentials-service/)"""

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
        self.client: VerifiableCredentialStub = self.stub_with_metadata(
            VerifiableCredentialStub
        )

    async def try_update_status(self, *, request: UpdateStatusRequest) -> None:
        """
        Update the status of a credential
        Args:
            request:
        """
        response = await self.client.update_status(update_status_request=request)
        ResponseStatusException.assert_success(
            response.status, "update credential status"
        )

    async def try_send(self, *, request: SendRequest) -> None:
        """
        [Send the provided document to the given email](/reference/services/wallet-service/#sending-documents-using-email-as-identifier)
        """
        response = await self.client.send(send_request=request)
        ResponseStatusException.assert_success(response.status, "sending credential")

# BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
# target: ..\sdk\python\trinsic\credential_service.py

    async def issue(self, *, request: IssueRequest) -> IssueResponse:
        """
 Sign and issue a verifiable credential from a submitted document.
 The document must be a valid JSON-LD document.

"""
        return await self.client.issue(request)
    
    async def issue_from_template(self, *, request: IssueFromTemplateRequest) -> IssueFromTemplateResponse:
        """
 Sign and issue a verifiable credential from a pre-defined template.
 This process will also add schema validation and 
 revocation registry entry in the credential.

"""
        return await self.client.issue_from_template(request)
    
    async def check_status(self, *, request: CheckStatusRequest) -> CheckStatusResponse:
        """
 Check credential status in the revocation registry

"""
        return await self.client.check_status(request)
    
    async def update_status(self, *, request: UpdateStatusRequest) -> UpdateStatusResponse:
        """
 Update credential status by setting the revocation value

"""
        return await self.client.update_status(request)
    
    async def create_proof(self, *, request: CreateProofRequest) -> CreateProofResponse:
        """
 Create a proof from a signed document that is a valid
 verifiable credential and contains a signature from which a proof can be derived.

"""
        return await self.client.create_proof(request)
    
    async def verify_proof(self, *, request: VerifyProofRequest) -> VerifyProofResponse:
        """
 Verifies a proof by checking the signature value, and if possible schema validation,
 revocation status, and issuer status against a trust registry

"""
        return await self.client.verify_proof(request)
    
    async def send(self, *, request: SendRequest) -> SendResponse:
        """
 Sends a document directly to a user's email within the given ecosystem

"""
        return await self.client.send(request)
    

# END Code generated by protoc-gen-trinsic. DO NOT EDIT.
