# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: services/verifiable-credentials/v1/verifiable-credentials.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import Dict

import betterproto
from betterproto.grpc.grpclib_server import ServiceBase
import grpclib


@dataclass(eq=False, repr=False)
class IssueRequest(betterproto.Message):
    document: "__common_v1__.JsonPayload" = betterproto.message_field(1)


@dataclass(eq=False, repr=False)
class IssueResponse(betterproto.Message):
    document: "__common_v1__.JsonPayload" = betterproto.message_field(1)


@dataclass(eq=False, repr=False)
class IssueFromTemplateRequest(betterproto.Message):
    template_id: str = betterproto.string_field(1)
    values_json: str = betterproto.string_field(2)


@dataclass(eq=False, repr=False)
class IssueFromTemplateResponse(betterproto.Message):
    document_json: str = betterproto.string_field(1)


@dataclass(eq=False, repr=False)
class CreateProofRequest(betterproto.Message):
    """Create Proof"""

    reveal_document: "__common_v1__.JsonPayload" = betterproto.message_field(1)
    document_id: str = betterproto.string_field(2)


@dataclass(eq=False, repr=False)
class CreateProofResponse(betterproto.Message):
    proof_document: "__common_v1__.JsonPayload" = betterproto.message_field(1)


@dataclass(eq=False, repr=False)
class VerifyProofRequest(betterproto.Message):
    """Verify Proof"""

    proof_document: "__common_v1__.JsonPayload" = betterproto.message_field(1)


@dataclass(eq=False, repr=False)
class VerifyProofResponse(betterproto.Message):
    valid: bool = betterproto.bool_field(1)


@dataclass(eq=False, repr=False)
class SendRequest(betterproto.Message):
    email: str = betterproto.string_field(1, group="delivery_method")
    did_uri: str = betterproto.string_field(2, group="delivery_method")
    didcomm_invitation: "__common_v1__.JsonPayload" = betterproto.message_field(
        3, group="delivery_method"
    )
    document: "__common_v1__.JsonPayload" = betterproto.message_field(100)


@dataclass(eq=False, repr=False)
class SendResponse(betterproto.Message):
    status: "__common_v1__.ResponseStatus" = betterproto.enum_field(1)


class VerifiableCredentialStub(betterproto.ServiceStub):
    async def issue(
        self, *, document: "__common_v1__.JsonPayload" = None
    ) -> "IssueResponse":

        request = IssueRequest()
        if document is not None:
            request.document = document

        return await self._unary_unary(
            "/services.verifiablecredentials.v1.VerifiableCredential/Issue",
            request,
            IssueResponse,
        )

    async def issue_from_template(
        self, *, template_id: str = "", values_json: str = ""
    ) -> "IssueFromTemplateResponse":

        request = IssueFromTemplateRequest()
        request.template_id = template_id
        request.values_json = values_json

        return await self._unary_unary(
            "/services.verifiablecredentials.v1.VerifiableCredential/IssueFromTemplate",
            request,
            IssueFromTemplateResponse,
        )

    async def create_proof(
        self,
        *,
        reveal_document: "__common_v1__.JsonPayload" = None,
        document_id: str = "",
    ) -> "CreateProofResponse":

        request = CreateProofRequest()
        if reveal_document is not None:
            request.reveal_document = reveal_document
        request.document_id = document_id

        return await self._unary_unary(
            "/services.verifiablecredentials.v1.VerifiableCredential/CreateProof",
            request,
            CreateProofResponse,
        )

    async def verify_proof(
        self, *, proof_document: "__common_v1__.JsonPayload" = None
    ) -> "VerifyProofResponse":

        request = VerifyProofRequest()
        if proof_document is not None:
            request.proof_document = proof_document

        return await self._unary_unary(
            "/services.verifiablecredentials.v1.VerifiableCredential/VerifyProof",
            request,
            VerifyProofResponse,
        )

    async def send(
        self,
        *,
        email: str = "",
        did_uri: str = "",
        didcomm_invitation: "__common_v1__.JsonPayload" = None,
        document: "__common_v1__.JsonPayload" = None,
    ) -> "SendResponse":

        request = SendRequest()
        request.email = email
        request.did_uri = did_uri
        if didcomm_invitation is not None:
            request.didcomm_invitation = didcomm_invitation
        if document is not None:
            request.document = document

        return await self._unary_unary(
            "/services.verifiablecredentials.v1.VerifiableCredential/Send",
            request,
            SendResponse,
        )


class VerifiableCredentialBase(ServiceBase):
    async def issue(self, document: "__common_v1__.JsonPayload") -> "IssueResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def issue_from_template(
        self, template_id: str, values_json: str
    ) -> "IssueFromTemplateResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def create_proof(
        self, reveal_document: "__common_v1__.JsonPayload", document_id: str
    ) -> "CreateProofResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def verify_proof(
        self, proof_document: "__common_v1__.JsonPayload"
    ) -> "VerifyProofResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def send(
        self,
        email: str,
        did_uri: str,
        didcomm_invitation: "__common_v1__.JsonPayload",
        document: "__common_v1__.JsonPayload",
    ) -> "SendResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_issue(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "document": request.document,
        }

        response = await self.issue(**request_kwargs)
        await stream.send_message(response)

    async def __rpc_issue_from_template(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "template_id": request.template_id,
            "values_json": request.values_json,
        }

        response = await self.issue_from_template(**request_kwargs)
        await stream.send_message(response)

    async def __rpc_create_proof(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "reveal_document": request.reveal_document,
            "document_id": request.document_id,
        }

        response = await self.create_proof(**request_kwargs)
        await stream.send_message(response)

    async def __rpc_verify_proof(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "proof_document": request.proof_document,
        }

        response = await self.verify_proof(**request_kwargs)
        await stream.send_message(response)

    async def __rpc_send(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "email": request.email,
            "did_uri": request.did_uri,
            "didcomm_invitation": request.didcomm_invitation,
            "document": request.document,
        }

        response = await self.send(**request_kwargs)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/services.verifiablecredentials.v1.VerifiableCredential/Issue": grpclib.const.Handler(
                self.__rpc_issue,
                grpclib.const.Cardinality.UNARY_UNARY,
                IssueRequest,
                IssueResponse,
            ),
            "/services.verifiablecredentials.v1.VerifiableCredential/IssueFromTemplate": grpclib.const.Handler(
                self.__rpc_issue_from_template,
                grpclib.const.Cardinality.UNARY_UNARY,
                IssueFromTemplateRequest,
                IssueFromTemplateResponse,
            ),
            "/services.verifiablecredentials.v1.VerifiableCredential/CreateProof": grpclib.const.Handler(
                self.__rpc_create_proof,
                grpclib.const.Cardinality.UNARY_UNARY,
                CreateProofRequest,
                CreateProofResponse,
            ),
            "/services.verifiablecredentials.v1.VerifiableCredential/VerifyProof": grpclib.const.Handler(
                self.__rpc_verify_proof,
                grpclib.const.Cardinality.UNARY_UNARY,
                VerifyProofRequest,
                VerifyProofResponse,
            ),
            "/services.verifiablecredentials.v1.VerifiableCredential/Send": grpclib.const.Handler(
                self.__rpc_send,
                grpclib.const.Cardinality.UNARY_UNARY,
                SendRequest,
                SendResponse,
            ),
        }


from ...common import v1 as __common_v1__
