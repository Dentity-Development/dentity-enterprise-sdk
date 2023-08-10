# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: services/trust-registry/v1/trust-registry.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import (
    TYPE_CHECKING,
    Dict,
    List,
    Optional,
)

import betterproto
import grpclib
from betterproto.grpc.grpclib_server import ServiceBase


if TYPE_CHECKING:
    from betterproto.grpc.grpclib_client import MetadataLike
    from grpclib.metadata import Deadline


class RegistrationStatus(betterproto.Enum):
    CURRENT = 0
    EXPIRED = 1
    TERMINATED = 2
    REVOKED = 3
    NOT_FOUND = 10


@dataclass(eq=False, repr=False)
class RegisterMemberRequest(betterproto.Message):
    """
    Request to register a member as a valid issuer of a specific credential
    schema. Only one of `did_uri`, `wallet_id`, or `email` may be specified.
    """

    did_uri: str = betterproto.string_field(1, group="member")
    """DID URI of member to register"""

    wallet_id: str = betterproto.string_field(3, group="member")
    """Trinsic Wallet ID of member to register"""

    email: str = betterproto.string_field(4, group="member")
    """
    Email address of member to register. Must be associated with an existing
    Trinsic account.
    """

    schema_uri: str = betterproto.string_field(10)
    """URI of credential schema to register member as authorized issuer of"""

    valid_from_utc: int = betterproto.uint64_field(11)
    """
    Unix Timestamp member is valid from. Member will not be considered valid
    before this timestamp.
    """

    valid_until_utc: int = betterproto.uint64_field(12)
    """
    Unix Timestamp member is valid until. Member will not be considered valid
    after this timestamp.
    """


@dataclass(eq=False, repr=False)
class RegisterMemberResponse(betterproto.Message):
    """Response to `RegisterMemberRequest`"""

    pass


@dataclass(eq=False, repr=False)
class UnregisterMemberRequest(betterproto.Message):
    """
    Request to unregister a member as a valid issuer of a specific credential
    schema. Only one of `did_uri`, `wallet_id`, or `email` may be specified.
    """

    did_uri: str = betterproto.string_field(1, group="member")
    """DID URI of member to unregister"""

    wallet_id: str = betterproto.string_field(3, group="member")
    """Trinsic Wallet ID of member to unregister"""

    email: str = betterproto.string_field(4, group="member")
    """
    Email address of member to unregister. Must be associated with an existing
    Trinsic account.
    """

    schema_uri: str = betterproto.string_field(10)
    """
    URI of credential schema to unregister member as authorized issuer of
    """


@dataclass(eq=False, repr=False)
class UnregisterMemberResponse(betterproto.Message):
    """Response to `UnregisterMemberRequest`"""

    pass


@dataclass(eq=False, repr=False)
class GetMemberAuthorizationStatusRequest(betterproto.Message):
    """
    Request to fetch member status in governance framework for a specific
    credential schema.
    """

    did_uri: str = betterproto.string_field(1)
    """DID URI of member"""

    schema_uri: str = betterproto.string_field(2)
    """URI of credential schema associated with member"""


@dataclass(eq=False, repr=False)
class GetMemberAuthorizationStatusResponse(betterproto.Message):
    """Response to `GetMemberAuthorizationStatusRequest`"""

    status: "RegistrationStatus" = betterproto.enum_field(1)
    """Status of member for given credential schema"""


@dataclass(eq=False, repr=False)
class ListAuthorizedMembersRequest(betterproto.Message):
    schema_uri: Optional[str] = betterproto.string_field(
        1, optional=True, group="_schema_uri"
    )
    """id of schema that needs to be checked"""

    continuation_token: Optional[str] = betterproto.string_field(
        2, optional=True, group="_continuation_token"
    )
    """
    Token to fetch next set of results, from previous
    `ListAuthorizedMembersResponse`
    """


@dataclass(eq=False, repr=False)
class ListAuthorizedMembersResponse(betterproto.Message):
    """Response to `ListAuthorizedMembersRequest`"""

    authorized_members: List["AuthorizedMember"] = betterproto.message_field(1)
    """JSON string containing array of resultant objects"""

    has_more_results: bool = betterproto.bool_field(2)
    """Whether more data is available to fetch for query"""

    continuation_token: str = betterproto.string_field(3)
    """
    Token to fetch next set of results via `ListAuthorizedMembersRequest`
    """


@dataclass(eq=False, repr=False)
class AuthorizedMember(betterproto.Message):
    did: str = betterproto.string_field(1)
    authorized_member_schemas: List[
        "AuthorizedMemberSchema"
    ] = betterproto.message_field(2)


@dataclass(eq=False, repr=False)
class AuthorizedMemberSchema(betterproto.Message):
    schema_uri: str = betterproto.string_field(1)
    status: str = betterproto.string_field(2)
    status_details: str = betterproto.string_field(3)
    valid_from: int = betterproto.uint64_field(4)
    valid_until: int = betterproto.uint64_field(5)


@dataclass(eq=False, repr=False)
class GetMemberRequest(betterproto.Message):
    """Request to get a member of the governance framework"""

    did_uri: str = betterproto.string_field(1, group="member")
    """DID URI of member to get"""

    wallet_id: str = betterproto.string_field(3, group="member")
    """Trinsic Wallet ID of member to get"""

    email: str = betterproto.string_field(4, group="member")
    """
    Email address of member to get. Must be associated with an existing Trinsic
    account.
    """


@dataclass(eq=False, repr=False)
class GetMemberResponse(betterproto.Message):
    """Response to `GetMemberAuthorizationStatusRequest`"""

    authorized_member: "AuthorizedMember" = betterproto.message_field(1)
    """Member for given did in given framework"""


class TrustRegistryStub(betterproto.ServiceStub):
    async def register_member(
        self,
        register_member_request: "RegisterMemberRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "RegisterMemberResponse":
        return await self._unary_unary(
            "/services.trustregistry.v1.TrustRegistry/RegisterMember",
            register_member_request,
            RegisterMemberResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def unregister_member(
        self,
        unregister_member_request: "UnregisterMemberRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "UnregisterMemberResponse":
        return await self._unary_unary(
            "/services.trustregistry.v1.TrustRegistry/UnregisterMember",
            unregister_member_request,
            UnregisterMemberResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def get_member_authorization_status(
        self,
        get_member_authorization_status_request: "GetMemberAuthorizationStatusRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "GetMemberAuthorizationStatusResponse":
        return await self._unary_unary(
            "/services.trustregistry.v1.TrustRegistry/GetMemberAuthorizationStatus",
            get_member_authorization_status_request,
            GetMemberAuthorizationStatusResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def list_authorized_members(
        self,
        list_authorized_members_request: "ListAuthorizedMembersRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "ListAuthorizedMembersResponse":
        return await self._unary_unary(
            "/services.trustregistry.v1.TrustRegistry/ListAuthorizedMembers",
            list_authorized_members_request,
            ListAuthorizedMembersResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def get_member(
        self,
        get_member_request: "GetMemberRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "GetMemberResponse":
        return await self._unary_unary(
            "/services.trustregistry.v1.TrustRegistry/GetMember",
            get_member_request,
            GetMemberResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )


class TrustRegistryBase(ServiceBase):
    async def register_member(
        self, register_member_request: "RegisterMemberRequest"
    ) -> "RegisterMemberResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def unregister_member(
        self, unregister_member_request: "UnregisterMemberRequest"
    ) -> "UnregisterMemberResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def get_member_authorization_status(
        self,
        get_member_authorization_status_request: "GetMemberAuthorizationStatusRequest",
    ) -> "GetMemberAuthorizationStatusResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def list_authorized_members(
        self, list_authorized_members_request: "ListAuthorizedMembersRequest"
    ) -> "ListAuthorizedMembersResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def get_member(
        self, get_member_request: "GetMemberRequest"
    ) -> "GetMemberResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_register_member(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.register_member(request)
        await stream.send_message(response)

    async def __rpc_unregister_member(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.unregister_member(request)
        await stream.send_message(response)

    async def __rpc_get_member_authorization_status(
        self, stream: grpclib.server.Stream
    ) -> None:
        request = await stream.recv_message()
        response = await self.get_member_authorization_status(request)
        await stream.send_message(response)

    async def __rpc_list_authorized_members(
        self, stream: grpclib.server.Stream
    ) -> None:
        request = await stream.recv_message()
        response = await self.list_authorized_members(request)
        await stream.send_message(response)

    async def __rpc_get_member(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.get_member(request)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/services.trustregistry.v1.TrustRegistry/RegisterMember": grpclib.const.Handler(
                self.__rpc_register_member,
                grpclib.const.Cardinality.UNARY_UNARY,
                RegisterMemberRequest,
                RegisterMemberResponse,
            ),
            "/services.trustregistry.v1.TrustRegistry/UnregisterMember": grpclib.const.Handler(
                self.__rpc_unregister_member,
                grpclib.const.Cardinality.UNARY_UNARY,
                UnregisterMemberRequest,
                UnregisterMemberResponse,
            ),
            "/services.trustregistry.v1.TrustRegistry/GetMemberAuthorizationStatus": grpclib.const.Handler(
                self.__rpc_get_member_authorization_status,
                grpclib.const.Cardinality.UNARY_UNARY,
                GetMemberAuthorizationStatusRequest,
                GetMemberAuthorizationStatusResponse,
            ),
            "/services.trustregistry.v1.TrustRegistry/ListAuthorizedMembers": grpclib.const.Handler(
                self.__rpc_list_authorized_members,
                grpclib.const.Cardinality.UNARY_UNARY,
                ListAuthorizedMembersRequest,
                ListAuthorizedMembersResponse,
            ),
            "/services.trustregistry.v1.TrustRegistry/GetMember": grpclib.const.Handler(
                self.__rpc_get_member,
                grpclib.const.Cardinality.UNARY_UNARY,
                GetMemberRequest,
                GetMemberResponse,
            ),
        }
