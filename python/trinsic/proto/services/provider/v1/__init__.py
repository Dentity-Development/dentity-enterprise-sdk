# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: services/provider/v1/provider.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import Dict

import betterproto
from betterproto.grpc.grpclib_server import ServiceBase
import grpclib


class ParticipantType(betterproto.Enum):
    participant_type_individual = 0
    participant_type_organization = 1


class InvitationStatusResponseStatus(betterproto.Enum):
    Error = 0
    InvitationSent = 1
    Completed = 2
    Expired = 3


@dataclass(eq=False, repr=False)
class Invite(betterproto.Message):
    id: str = betterproto.string_field(1)
    code: str = betterproto.string_field(2)
    created: str = betterproto.string_field(3)
    accepted: str = betterproto.string_field(4)
    expires: str = betterproto.string_field(5)


@dataclass(eq=False, repr=False)
class InviteRequest(betterproto.Message):
    participant: "ParticipantType" = betterproto.enum_field(1)
    description: str = betterproto.string_field(2)
    details: "__account_v1__.AccountDetails" = betterproto.message_field(3)


@dataclass(eq=False, repr=False)
class InviteRequestDidCommInvitation(betterproto.Message):
    pass


@dataclass(eq=False, repr=False)
class InviteResponse(betterproto.Message):
    status: "__common_v1__.ResponseStatus" = betterproto.enum_field(1)
    invitation_id: str = betterproto.string_field(10)
    # Invitation Code that must be passed with the account 'SignIn' request to
    # correlate this user with the invitation sent.
    invitation_code: str = betterproto.string_field(11)


@dataclass(eq=False, repr=False)
class InvitationStatusRequest(betterproto.Message):
    """
    Request details for the status of onboarding an individual or organization.
    The reference_id passed is the response from the `Onboard` method call
    """

    invitation_id: str = betterproto.string_field(1)


@dataclass(eq=False, repr=False)
class InvitationStatusResponse(betterproto.Message):
    status: "InvitationStatusResponseStatus" = betterproto.enum_field(1)
    status_details: str = betterproto.string_field(2)


@dataclass(eq=False, repr=False)
class Ecosystem(betterproto.Message):
    id: str = betterproto.string_field(1)
    name: str = betterproto.string_field(2)
    description: str = betterproto.string_field(3)
    uri: str = betterproto.string_field(4)


@dataclass(eq=False, repr=False)
class CreateEcosystemRequest(betterproto.Message):
    # Globally unique name for the Ecosystem. This name will be part of the
    # ecosystem specific URLs and namespaces. Allowed characters are lowercase
    # letters, numbers, underscore and hyphen.
    name: str = betterproto.string_field(1)
    # Ecosystem description. This field is optional.
    description: str = betterproto.string_field(2)
    # External URL associated with your organization or ecosystem entity. This
    # field is optional
    uri: str = betterproto.string_field(3)
    # The account details of the owner of the ecosystem
    details: "__account_v1__.AccountDetails" = betterproto.message_field(4)


@dataclass(eq=False, repr=False)
class CreateEcosystemResponse(betterproto.Message):
    # Details of the created ecosystem
    ecosystem: "Ecosystem" = betterproto.message_field(1)
    # Account profile for auth of the owner of the ecosystem
    profile: "__account_v1__.AccountProfile" = betterproto.message_field(2)
    # Indicates if confirmation of account is required. This settings is
    # configured globally by the server administrator.
    confirmation_method: "__account_v1__.ConfirmationMethod" = betterproto.enum_field(3)


@dataclass(eq=False, repr=False)
class GenerateTokenRequest(betterproto.Message):
    # Optional description to identify this token
    description: str = betterproto.string_field(1)


@dataclass(eq=False, repr=False)
class GenerateTokenResponse(betterproto.Message):
    # Account authentication profile that contains unprotected token
    profile: "__account_v1__.AccountProfile" = betterproto.message_field(1)


class ProviderStub(betterproto.ServiceStub):
    async def create_ecosystem(
        self,
        *,
        name: str = "",
        description: str = "",
        uri: str = "",
        details: "__account_v1__.AccountDetails" = None
    ) -> "CreateEcosystemResponse":

        request = CreateEcosystemRequest()
        request.name = name
        request.description = description
        request.uri = uri
        if details is not None:
            request.details = details

        return await self._unary_unary(
            "/services.provider.v1.Provider/CreateEcosystem",
            request,
            CreateEcosystemResponse,
        )

    async def generate_token(self, *, description: str = "") -> "GenerateTokenResponse":

        request = GenerateTokenRequest()
        request.description = description

        return await self._unary_unary(
            "/services.provider.v1.Provider/GenerateToken",
            request,
            GenerateTokenResponse,
        )

    async def invite(
        self,
        *,
        participant: "ParticipantType" = 0,
        description: str = "",
        details: "__account_v1__.AccountDetails" = None
    ) -> "InviteResponse":

        request = InviteRequest()
        request.participant = participant
        request.description = description
        if details is not None:
            request.details = details

        return await self._unary_unary(
            "/services.provider.v1.Provider/Invite", request, InviteResponse
        )

    async def invitation_status(
        self, *, invitation_id: str = ""
    ) -> "InvitationStatusResponse":

        request = InvitationStatusRequest()
        request.invitation_id = invitation_id

        return await self._unary_unary(
            "/services.provider.v1.Provider/InvitationStatus",
            request,
            InvitationStatusResponse,
        )


class ProviderBase(ServiceBase):
    async def create_ecosystem(
        self,
        name: str,
        description: str,
        uri: str,
        details: "__account_v1__.AccountDetails",
    ) -> "CreateEcosystemResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def generate_token(self, description: str) -> "GenerateTokenResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def invite(
        self,
        participant: "ParticipantType",
        description: str,
        details: "__account_v1__.AccountDetails",
    ) -> "InviteResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def invitation_status(self, invitation_id: str) -> "InvitationStatusResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_create_ecosystem(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "name": request.name,
            "description": request.description,
            "uri": request.uri,
            "details": request.details,
        }

        response = await self.create_ecosystem(**request_kwargs)
        await stream.send_message(response)

    async def __rpc_generate_token(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "description": request.description,
        }

        response = await self.generate_token(**request_kwargs)
        await stream.send_message(response)

    async def __rpc_invite(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "participant": request.participant,
            "description": request.description,
            "details": request.details,
        }

        response = await self.invite(**request_kwargs)
        await stream.send_message(response)

    async def __rpc_invitation_status(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "invitation_id": request.invitation_id,
        }

        response = await self.invitation_status(**request_kwargs)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/services.provider.v1.Provider/CreateEcosystem": grpclib.const.Handler(
                self.__rpc_create_ecosystem,
                grpclib.const.Cardinality.UNARY_UNARY,
                CreateEcosystemRequest,
                CreateEcosystemResponse,
            ),
            "/services.provider.v1.Provider/GenerateToken": grpclib.const.Handler(
                self.__rpc_generate_token,
                grpclib.const.Cardinality.UNARY_UNARY,
                GenerateTokenRequest,
                GenerateTokenResponse,
            ),
            "/services.provider.v1.Provider/Invite": grpclib.const.Handler(
                self.__rpc_invite,
                grpclib.const.Cardinality.UNARY_UNARY,
                InviteRequest,
                InviteResponse,
            ),
            "/services.provider.v1.Provider/InvitationStatus": grpclib.const.Handler(
                self.__rpc_invitation_status,
                grpclib.const.Cardinality.UNARY_UNARY,
                InvitationStatusRequest,
                InvitationStatusResponse,
            ),
        }


from ...account import v1 as __account_v1__
from ...common import v1 as __common_v1__
