# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: services/provider/v1/access-management.proto, services/provider/v1/provider.proto
# plugin: python-betterproto
import warnings
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

from ...account import v1 as __account_v1__
from ...common import v1 as __common_v1__


if TYPE_CHECKING:
    from betterproto.grpc.grpclib_client import MetadataLike
    from grpclib.metadata import Deadline


class IdentityProvider(betterproto.Enum):
    Unknown = 0
    """Identity provider is unknown"""

    Email = 1
    """Identity provider is email"""

    Phone = 2
    """Identity provider is phone"""

    Passkey = 3
    """
    Identity provider is passkey (WebAuthn) -- for Trinsic internal use only
    """


class IonOptionsIonNetwork(betterproto.Enum):
    TestNet = 0
    MainNet = 1


class IndyOptionsIndyNetwork(betterproto.Enum):
    Danube = 0
    SovrinBuilder = 1
    SovrinStaging = 2
    Sovrin = 3
    IdUnionTest = 4
    IdUnion = 5
    IndicioTest = 6
    IndicioDemo = 7
    Indicio = 8


@dataclass(eq=False, repr=False)
class Ecosystem(betterproto.Message):
    """Details of an ecosystem"""

    id: str = betterproto.string_field(1)
    """URN of the ecosystem"""

    name: str = betterproto.string_field(2)
    """Globally unique name for the ecosystem"""

    description: str = betterproto.string_field(3)
    """Ecosystem description"""


@dataclass(eq=False, repr=False)
class CreateEcosystemRequest(betterproto.Message):
    """Request to create an ecosystem"""

    name: str = betterproto.string_field(1)
    """
    Globally unique name for the Ecosystem. This name will be part of the
    ecosystem-specific URLs and namespaces. Allowed characters are lowercase
    letters, numbers, underscore and hyphen. If not passed, ecosystem name will
    be auto-generated.
    """

    description: str = betterproto.string_field(2)
    """Ecosystem description"""

    details: "__account_v1__.AccountDetails" = betterproto.message_field(4)
    """The account details of the owner of the ecosystem"""

    domain: str = betterproto.string_field(5)
    """New domain URL"""


@dataclass(eq=False, repr=False)
class CreateEcosystemResponse(betterproto.Message):
    """Response to `CreateEcosystemRequest`"""

    ecosystem: "Ecosystem" = betterproto.message_field(1)
    """Details of the created ecosystem"""

    profile: "__account_v1__.AccountProfile" = betterproto.message_field(2)
    """Account profile for auth of the owner of the ecosystem"""

    confirmation_method: "__account_v1__.ConfirmationMethod" = betterproto.enum_field(3)
    """Indicates if confirmation of account is required."""


@dataclass(eq=False, repr=False)
class EcosystemInfoRequest(betterproto.Message):
    """Request to fetch information about an ecosystem"""

    pass


@dataclass(eq=False, repr=False)
class EcosystemInfoResponse(betterproto.Message):
    """Response to `InfoRequest`"""

    ecosystem: "Ecosystem" = betterproto.message_field(1)
    """Ecosystem corresponding to current ecosystem in the account token"""


@dataclass(eq=False, repr=False)
class GetOberonKeyRequest(betterproto.Message):
    """
    Request to fetch the Trinsic public key used to verify authentication token
    validity
    """

    pass


@dataclass(eq=False, repr=False)
class GetOberonKeyResponse(betterproto.Message):
    """Response to `GetOberonKeyRequest`"""

    key: str = betterproto.string_field(1)
    """Oberon Public Key as RAW base64-url encoded string"""


@dataclass(eq=False, repr=False)
class SearchWalletConfigurationsRequest(betterproto.Message):
    """Search for issuers/holders/verifiers"""

    query_filter: str = betterproto.string_field(1)
    """SQL filter to execute. `SELECT * FROM c WHERE [**queryFilter**]`"""

    continuation_token: str = betterproto.string_field(2)
    """
    Token provided by previous `SearchResponse` if more data is available for
    query
    """


@dataclass(eq=False, repr=False)
class SearchWalletConfigurationResponse(betterproto.Message):
    results: List["WalletConfiguration"] = betterproto.message_field(1)
    """Results matching the search query"""

    has_more_results: bool = betterproto.bool_field(2)
    """
    Whether more results are available for this query via `continuation_token`
    """

    continuation_token: str = betterproto.string_field(4)
    """Token to fetch next set of results via `SearchRequest`"""


@dataclass(eq=False, repr=False)
class WalletConfiguration(betterproto.Message):
    """Strongly typed information about wallet configurations"""

    name: str = betterproto.string_field(1)
    """Name/description of the wallet"""

    email: str = betterproto.string_field(2)
    """
    Deprecated and will be removed on August 1, 2023 -- use
    external_identities. This field is set to the first email address present
    in `external_identities`, if any.
    """

    sms: str = betterproto.string_field(3)
    """Deprecated -- use external_identities"""

    wallet_id: str = betterproto.string_field(4)
    public_did: str = betterproto.string_field(5)
    """The DID of the wallet"""

    config_type: str = betterproto.string_field(6)
    auth_tokens: List["__account_v1__.WalletAuthToken"] = betterproto.message_field(7)
    """
    List of active authentication tokens for this wallet. This list does not
    contain the issued token, only metadata such as ID, description, and
    creation date.
    """

    external_identity_ids: List[str] = betterproto.string_field(8)
    """
    List of external identity IDs (email addresses, phone numbers, etc.)
    associated with this wallet. This is deprecated; use `external_identities`
    instead.
    """

    ecosystem_id: str = betterproto.string_field(9)
    """Ecosystem in which this wallet is contained."""

    description: str = betterproto.string_field(10)
    external_identities: List["WalletExternalIdentity"] = betterproto.message_field(11)
    """List of external identities associated with this wallet."""

    def __post_init__(self) -> None:
        super().__post_init__()
        if self.is_set("email"):
            warnings.warn("WalletConfiguration.email is deprecated", DeprecationWarning)
        if self.is_set("sms"):
            warnings.warn("WalletConfiguration.sms is deprecated", DeprecationWarning)
        if self.is_set("external_identity_ids"):
            warnings.warn(
                "WalletConfiguration.external_identity_ids is deprecated",
                DeprecationWarning,
            )


@dataclass(eq=False, repr=False)
class WalletExternalIdentity(betterproto.Message):
    """
    An external identity (email address, phone number, etc.) associated with a
    wallet for authentication purposes.
    """

    provider: "IdentityProvider" = betterproto.enum_field(1)
    """
    The type of this identity (whether this identity is an email address, phone
    number, etc.)
    """

    id: str = betterproto.string_field(2)
    """The actual email address/phone number/etc. for this identity"""


@dataclass(eq=False, repr=False)
class IonOptions(betterproto.Message):
    """Options for creation of DID on the ION network"""

    network: "IonOptionsIonNetwork" = betterproto.enum_field(1)
    """ION network on which DID should be published"""


@dataclass(eq=False, repr=False)
class IndyOptions(betterproto.Message):
    """Options for creation of DID on the SOV network"""

    network: "IndyOptionsIndyNetwork" = betterproto.enum_field(1)
    """SOV network on which DID should be published"""


@dataclass(eq=False, repr=False)
class UpgradeDidRequest(betterproto.Message):
    """Request to upgrade a wallet"""

    email: str = betterproto.string_field(1, group="account")
    """
    Email address of account to upgrade. Mutually exclusive with `walletId` and
    `didUri`.
    """

    wallet_id: str = betterproto.string_field(2, group="account")
    """
    Wallet ID of account to upgrade. Mutually exclusive with `email` and
    `didUri`.
    """

    did_uri: str = betterproto.string_field(6, group="account")
    """
    DID URI of the account to upgrade. Mutually exclusive with `email` and
    `walletId`.
    """

    method: "__common_v1__.SupportedDidMethod" = betterproto.enum_field(3)
    """DID Method to which wallet should be upgraded"""

    ion_options: "IonOptions" = betterproto.message_field(4, group="options")
    """Configuration for creation of DID on ION network"""

    indy_options: "IndyOptions" = betterproto.message_field(5, group="options")
    """Configuration for creation of DID on INDY network"""


@dataclass(eq=False, repr=False)
class UpgradeDidResponse(betterproto.Message):
    """Response to `UpgradeDIDRequest`"""

    did: str = betterproto.string_field(1)
    """New DID of wallet"""


@dataclass(eq=False, repr=False)
class AddRoleAssignmentRequest(betterproto.Message):
    """Role management"""

    role: str = betterproto.string_field(1)
    """Role to assign"""

    email: str = betterproto.string_field(2, group="account")
    """
    Email address of account to assign role. Mutually exclusive with `walletId`
    and `didUri`.
    """

    wallet_id: str = betterproto.string_field(3, group="account")
    """
    Wallet ID of account to assign role to. Mutually exclusive with `email` and
    `didUri`.
    """

    did_uri: str = betterproto.string_field(4, group="account")
    """
    DID URI of the account to assign role. Mutually exclusive with `email` and
    `walletId`.
    """


@dataclass(eq=False, repr=False)
class AddRoleAssignmentResponse(betterproto.Message):
    pass


@dataclass(eq=False, repr=False)
class RemoveRoleAssignmentRequest(betterproto.Message):
    role: str = betterproto.string_field(1)
    """Role to unassign"""

    email: str = betterproto.string_field(2, group="account")
    """
    Email address of account to unassign role. Mutually exclusive with
    `walletId` and `didUri`.
    """

    wallet_id: str = betterproto.string_field(3, group="account")
    """
    Wallet ID of account to unassign role. Mutually exclusive with `email` and
    `didUri`.
    """

    did_uri: str = betterproto.string_field(4, group="account")
    """
    DID URI of the account to unassign role. Mutually exclusive with `email`
    and `walletId`.
    """


@dataclass(eq=False, repr=False)
class RemoveRoleAssignmentResponse(betterproto.Message):
    pass


@dataclass(eq=False, repr=False)
class ListRoleAssignmentsRequest(betterproto.Message):
    """Request to fetch the list of roles assigned to the current account"""

    email: str = betterproto.string_field(2, group="account")
    """
    Email address of account to list roles. Mutually exclusive with `walletId`
    and `didUri`.
    """

    wallet_id: str = betterproto.string_field(3, group="account")
    """
    Wallet ID of account to list roles. Mutually exclusive with `email` and
    `didUri`.
    """

    did_uri: str = betterproto.string_field(4, group="account")
    """
    DID URI of the account to list roles. Mutually exclusive with `email` and
    `walletId`.
    """


@dataclass(eq=False, repr=False)
class ListRoleAssignmentsResponse(betterproto.Message):
    roles: List[str] = betterproto.string_field(1)
    """List of roles"""


@dataclass(eq=False, repr=False)
class ListAvailableRolesRequest(betterproto.Message):
    """Request to fetch the available roles in the current ecosystem"""

    pass


@dataclass(eq=False, repr=False)
class ListAvailableRolesResponse(betterproto.Message):
    roles: List[str] = betterproto.string_field(1)
    """List of roles"""


class ProviderStub(betterproto.ServiceStub):
    async def create_ecosystem(
        self,
        create_ecosystem_request: "CreateEcosystemRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "CreateEcosystemResponse":
        return await self._unary_unary(
            "/services.provider.v1.Provider/CreateEcosystem",
            create_ecosystem_request,
            CreateEcosystemResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def get_oberon_key(
        self,
        get_oberon_key_request: "GetOberonKeyRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "GetOberonKeyResponse":
        return await self._unary_unary(
            "/services.provider.v1.Provider/GetOberonKey",
            get_oberon_key_request,
            GetOberonKeyResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def upgrade_did(
        self,
        upgrade_did_request: "UpgradeDidRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "UpgradeDidResponse":
        return await self._unary_unary(
            "/services.provider.v1.Provider/UpgradeDID",
            upgrade_did_request,
            UpgradeDidResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def search_wallet_configurations(
        self,
        search_wallet_configurations_request: "SearchWalletConfigurationsRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "SearchWalletConfigurationResponse":
        return await self._unary_unary(
            "/services.provider.v1.Provider/SearchWalletConfigurations",
            search_wallet_configurations_request,
            SearchWalletConfigurationResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )


class AccessManagementStub(betterproto.ServiceStub):
    async def add_role_assignment(
        self,
        add_role_assignment_request: "AddRoleAssignmentRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "AddRoleAssignmentResponse":
        return await self._unary_unary(
            "/services.provider.v1.AccessManagement/AddRoleAssignment",
            add_role_assignment_request,
            AddRoleAssignmentResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def remove_role_assignment(
        self,
        remove_role_assignment_request: "RemoveRoleAssignmentRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "RemoveRoleAssignmentResponse":
        return await self._unary_unary(
            "/services.provider.v1.AccessManagement/RemoveRoleAssignment",
            remove_role_assignment_request,
            RemoveRoleAssignmentResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def list_role_assignments(
        self,
        list_role_assignments_request: "ListRoleAssignmentsRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "ListRoleAssignmentsResponse":
        return await self._unary_unary(
            "/services.provider.v1.AccessManagement/ListRoleAssignments",
            list_role_assignments_request,
            ListRoleAssignmentsResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def list_available_roles(
        self,
        list_available_roles_request: "ListAvailableRolesRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "ListAvailableRolesResponse":
        return await self._unary_unary(
            "/services.provider.v1.AccessManagement/ListAvailableRoles",
            list_available_roles_request,
            ListAvailableRolesResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )


class ProviderBase(ServiceBase):
    async def create_ecosystem(
        self, create_ecosystem_request: "CreateEcosystemRequest"
    ) -> "CreateEcosystemResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def get_oberon_key(
        self, get_oberon_key_request: "GetOberonKeyRequest"
    ) -> "GetOberonKeyResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def upgrade_did(
        self, upgrade_did_request: "UpgradeDidRequest"
    ) -> "UpgradeDidResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def search_wallet_configurations(
        self, search_wallet_configurations_request: "SearchWalletConfigurationsRequest"
    ) -> "SearchWalletConfigurationResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_create_ecosystem(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.create_ecosystem(request)
        await stream.send_message(response)

    async def __rpc_get_oberon_key(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.get_oberon_key(request)
        await stream.send_message(response)

    async def __rpc_upgrade_did(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.upgrade_did(request)
        await stream.send_message(response)

    async def __rpc_search_wallet_configurations(
        self, stream: grpclib.server.Stream
    ) -> None:
        request = await stream.recv_message()
        response = await self.search_wallet_configurations(request)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/services.provider.v1.Provider/CreateEcosystem": grpclib.const.Handler(
                self.__rpc_create_ecosystem,
                grpclib.const.Cardinality.UNARY_UNARY,
                CreateEcosystemRequest,
                CreateEcosystemResponse,
            ),
            "/services.provider.v1.Provider/GetOberonKey": grpclib.const.Handler(
                self.__rpc_get_oberon_key,
                grpclib.const.Cardinality.UNARY_UNARY,
                GetOberonKeyRequest,
                GetOberonKeyResponse,
            ),
            "/services.provider.v1.Provider/UpgradeDID": grpclib.const.Handler(
                self.__rpc_upgrade_did,
                grpclib.const.Cardinality.UNARY_UNARY,
                UpgradeDidRequest,
                UpgradeDidResponse,
            ),
            "/services.provider.v1.Provider/SearchWalletConfigurations": grpclib.const.Handler(
                self.__rpc_search_wallet_configurations,
                grpclib.const.Cardinality.UNARY_UNARY,
                SearchWalletConfigurationsRequest,
                SearchWalletConfigurationResponse,
            ),
        }


class AccessManagementBase(ServiceBase):
    async def add_role_assignment(
        self, add_role_assignment_request: "AddRoleAssignmentRequest"
    ) -> "AddRoleAssignmentResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def remove_role_assignment(
        self, remove_role_assignment_request: "RemoveRoleAssignmentRequest"
    ) -> "RemoveRoleAssignmentResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def list_role_assignments(
        self, list_role_assignments_request: "ListRoleAssignmentsRequest"
    ) -> "ListRoleAssignmentsResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def list_available_roles(
        self, list_available_roles_request: "ListAvailableRolesRequest"
    ) -> "ListAvailableRolesResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_add_role_assignment(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.add_role_assignment(request)
        await stream.send_message(response)

    async def __rpc_remove_role_assignment(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.remove_role_assignment(request)
        await stream.send_message(response)

    async def __rpc_list_role_assignments(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.list_role_assignments(request)
        await stream.send_message(response)

    async def __rpc_list_available_roles(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.list_available_roles(request)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/services.provider.v1.AccessManagement/AddRoleAssignment": grpclib.const.Handler(
                self.__rpc_add_role_assignment,
                grpclib.const.Cardinality.UNARY_UNARY,
                AddRoleAssignmentRequest,
                AddRoleAssignmentResponse,
            ),
            "/services.provider.v1.AccessManagement/RemoveRoleAssignment": grpclib.const.Handler(
                self.__rpc_remove_role_assignment,
                grpclib.const.Cardinality.UNARY_UNARY,
                RemoveRoleAssignmentRequest,
                RemoveRoleAssignmentResponse,
            ),
            "/services.provider.v1.AccessManagement/ListRoleAssignments": grpclib.const.Handler(
                self.__rpc_list_role_assignments,
                grpclib.const.Cardinality.UNARY_UNARY,
                ListRoleAssignmentsRequest,
                ListRoleAssignmentsResponse,
            ),
            "/services.provider.v1.AccessManagement/ListAvailableRoles": grpclib.const.Handler(
                self.__rpc_list_available_roles,
                grpclib.const.Cardinality.UNARY_UNARY,
                ListAvailableRolesRequest,
                ListAvailableRolesResponse,
            ),
        }
