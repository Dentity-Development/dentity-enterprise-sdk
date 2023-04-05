# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: services/account/v1/account.proto
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


if TYPE_CHECKING:
    from betterproto.grpc.grpclib_client import MetadataLike
    from grpclib.metadata import Deadline


class ConfirmationMethod(betterproto.Enum):
    """Confirmation method type for two-factor workflows"""

    None_ = 0
    """No confirmation required"""

    Email = 1
    """Email confirmation required"""

    Sms = 2
    """SMS confirmation required"""

    ConnectedDevice = 3
    """Confirmation from a connected device is required"""

    Other = 10
    """Third-party method of confirmation is required"""


@dataclass(eq=False, repr=False)
class SignInRequest(betterproto.Message):
    """Request for creating or signing into an account"""

    details: "AccountDetails" = betterproto.message_field(1)
    """Account registration details"""

    invitation_code: str = betterproto.string_field(2)
    """
    DEPRECATED, will be removed April 1st 2023 Invitation code associated with
    this registration
    """

    ecosystem_id: str = betterproto.string_field(3)
    """ID of Ecosystem to use Ignored if `invitation_code` is passed"""

    def __post_init__(self) -> None:
        super().__post_init__()
        if self.is_set("invitation_code"):
            warnings.warn(
                "SignInRequest.invitation_code is deprecated", DeprecationWarning
            )


@dataclass(eq=False, repr=False)
class AccountDetails(betterproto.Message):
    """Account registration details"""

    name: str = betterproto.string_field(1)
    """Account name"""

    email: str = betterproto.string_field(2)
    """Email address of account"""

    sms: str = betterproto.string_field(3)
    """SMS number including country code"""


@dataclass(eq=False, repr=False)
class SignInResponse(betterproto.Message):
    """
    Response for creating new account This object will indicate if a
    confirmation code was sent to one of the users two-factor methods like
    email, SMS, etc.
    """

    confirmation_method: "ConfirmationMethod" = betterproto.enum_field(3)
    """Indicates if confirmation of account is required."""

    profile: "AccountProfile" = betterproto.message_field(4)
    """
    Contains authentication data for use with the current device. This object
    must be stored in a secure place. It can also be protected with a PIN, but
    this is optional. See the docs at https://docs.trinsic.id for more
    information on working with authentication data.
    """


@dataclass(eq=False, repr=False)
class AccountProfile(betterproto.Message):
    """
    Device profile containing sensitive authentication data. This information
    should be stored securely
    """

    profile_type: str = betterproto.string_field(1)
    """
    The type of profile, used to differentiate between protocol schemes or
    versions
    """

    auth_data: bytes = betterproto.bytes_field(2)
    """Auth data containg information about the current device access"""

    auth_token: bytes = betterproto.bytes_field(3)
    """Secure token issued by server used to generate zero-knowledge proofs"""

    protection: "TokenProtection" = betterproto.message_field(4)
    """
    Token security information about the token. If token protection is enabled,
    implementations must supply protection secret before using the token for
    authentication.
    """


@dataclass(eq=False, repr=False)
class TokenProtection(betterproto.Message):
    """Token protection info"""

    enabled: bool = betterproto.bool_field(1)
    """
    Indicates if token is protected using a PIN, security code, HSM secret,
    etc.
    """

    method: "ConfirmationMethod" = betterproto.enum_field(2)
    """The method used to protect the token"""


@dataclass(eq=False, repr=False)
class AccountInfoRequest(betterproto.Message):
    """Request for information about the account used to make the request"""

    pass


@dataclass(eq=False, repr=False)
class AccountInfoResponse(betterproto.Message):
    """Information about the account used to make the request"""

    details: "AccountDetails" = betterproto.message_field(1)
    """The account details associated with the calling request context"""

    ecosystems: List["AccountEcosystem"] = betterproto.message_field(2)
    """Use `ecosystem_id` instead"""

    wallet_id: str = betterproto.string_field(3)
    """The wallet ID associated with this account"""

    device_id: str = betterproto.string_field(4)
    """The device ID associated with this account session"""

    ecosystem_id: str = betterproto.string_field(5)
    """The ecosystem ID within which this account resides"""

    public_did: str = betterproto.string_field(6)
    """
    The public DID associated with this account. This DID is used as the
    `issuer` when signing verifiable credentials
    """

    auth_tokens: List["WalletAuthToken"] = betterproto.message_field(8)
    """
    List of active authentication tokens for this wallet. This list does not
    contain the issued token, only metadata such as ID, description, and
    creation date.
    """

    def __post_init__(self) -> None:
        super().__post_init__()
        if self.is_set("ecosystems"):
            warnings.warn(
                "AccountInfoResponse.ecosystems is deprecated", DeprecationWarning
            )


@dataclass(eq=False, repr=False)
class AccountEcosystem(betterproto.Message):
    """Deprecated"""

    id: str = betterproto.string_field(1)
    name: str = betterproto.string_field(2)
    description: str = betterproto.string_field(3)
    uri: str = betterproto.string_field(4)


@dataclass(eq=False, repr=False)
class LoginRequest(betterproto.Message):
    """Request to begin login flow"""

    email: str = betterproto.string_field(1)
    """
    Email address of account. If unspecified, an anonymous account will be
    created.
    """

    invitation_code: str = betterproto.string_field(2)
    """
    DEPRECATED, will be removed April 1st 2023 Invitation code associated with
    this registration
    """

    ecosystem_id: str = betterproto.string_field(3)
    """
    ID of Ecosystem to sign into. Ignored if `invitation_code` is passed.
    """

    def __post_init__(self) -> None:
        super().__post_init__()
        if self.is_set("invitation_code"):
            warnings.warn(
                "LoginRequest.invitation_code is deprecated", DeprecationWarning
            )


@dataclass(eq=False, repr=False)
class LoginResponse(betterproto.Message):
    """Response to `LoginRequest`"""

    challenge: bytes = betterproto.bytes_field(1, group="response")
    """
    Random byte sequence unique to this login request. If present, two-factor
    confirmation of login is required. Must be sent back, unaltered, in
    `LoginConfirm`.
    """

    profile: "AccountProfile" = betterproto.message_field(2, group="response")
    """
    Account profile response. If present, no confirmation of login is required.
    """


@dataclass(eq=False, repr=False)
class LoginConfirmRequest(betterproto.Message):
    """Request to finalize login flow"""

    challenge: bytes = betterproto.bytes_field(1)
    """Challenge received from `Login`"""

    confirmation_code_hashed: bytes = betterproto.bytes_field(2)
    """
    Two-factor confirmation code sent to account email or phone, hashed using
    Blake3. Our SDKs will handle this hashing process for you.
    """


@dataclass(eq=False, repr=False)
class LoginConfirmResponse(betterproto.Message):
    """Response to `LoginConfirmRequest`"""

    profile: "AccountProfile" = betterproto.message_field(1)
    """
    Profile response; must be unprotected using unhashed confirmation code. Our
    SDKs will handle this process for you, and return to you an authentication
    token string.
    """


@dataclass(eq=False, repr=False)
class AuthorizeWebhookRequest(betterproto.Message):
    """
    Request to authorize Ecosystem provider to receive webhooks for events
    which occur on this wallet.
    """

    events: List[str] = betterproto.string_field(1)
    """Events to authorize access to. Default is "*" (all events)"""

    def __post_init__(self) -> None:
        warnings.warn("AuthorizeWebhookRequest is deprecated", DeprecationWarning)
        super().__post_init__()


@dataclass(eq=False, repr=False)
class AuthorizeWebhookResponse(betterproto.Message):
    """Response to `AuthorizeWebhookRequest`"""

    pass

    def __post_init__(self) -> None:
        warnings.warn("AuthorizeWebhookResponse is deprecated", DeprecationWarning)
        super().__post_init__()


@dataclass(eq=False, repr=False)
class WalletAuthToken(betterproto.Message):
    """Information about authenticaton tokens for a wallet"""

    id: str = betterproto.string_field(1)
    """
    Unique identifier for the token. This field will match the `DeviceId` in
    the WalletAuthData
    """

    description: Optional[str] = betterproto.string_field(
        2, optional=True, group="_description"
    )
    """Device name/description"""

    date_created: str = betterproto.string_field(3)
    """Date when the token was created in ISO 8601 format"""


class AccountStub(betterproto.ServiceStub):
    async def sign_in(
        self,
        sign_in_request: "SignInRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "SignInResponse":
        return await self._unary_unary(
            "/services.account.v1.Account/SignIn",
            sign_in_request,
            SignInResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def login(
        self,
        login_request: "LoginRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "LoginResponse":
        return await self._unary_unary(
            "/services.account.v1.Account/Login",
            login_request,
            LoginResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def login_confirm(
        self,
        login_confirm_request: "LoginConfirmRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "LoginConfirmResponse":
        return await self._unary_unary(
            "/services.account.v1.Account/LoginConfirm",
            login_confirm_request,
            LoginConfirmResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def info(
        self,
        account_info_request: "AccountInfoRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "AccountInfoResponse":
        return await self._unary_unary(
            "/services.account.v1.Account/Info",
            account_info_request,
            AccountInfoResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def authorize_webhook(
        self,
        authorize_webhook_request: "AuthorizeWebhookRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "AuthorizeWebhookResponse":
        return await self._unary_unary(
            "/services.account.v1.Account/AuthorizeWebhook",
            authorize_webhook_request,
            AuthorizeWebhookResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )


class AccountBase(ServiceBase):
    async def sign_in(self, sign_in_request: "SignInRequest") -> "SignInResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def login(self, login_request: "LoginRequest") -> "LoginResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def login_confirm(
        self, login_confirm_request: "LoginConfirmRequest"
    ) -> "LoginConfirmResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def info(
        self, account_info_request: "AccountInfoRequest"
    ) -> "AccountInfoResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def authorize_webhook(
        self, authorize_webhook_request: "AuthorizeWebhookRequest"
    ) -> "AuthorizeWebhookResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_sign_in(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.sign_in(request)
        await stream.send_message(response)

    async def __rpc_login(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.login(request)
        await stream.send_message(response)

    async def __rpc_login_confirm(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.login_confirm(request)
        await stream.send_message(response)

    async def __rpc_info(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.info(request)
        await stream.send_message(response)

    async def __rpc_authorize_webhook(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.authorize_webhook(request)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/services.account.v1.Account/SignIn": grpclib.const.Handler(
                self.__rpc_sign_in,
                grpclib.const.Cardinality.UNARY_UNARY,
                SignInRequest,
                SignInResponse,
            ),
            "/services.account.v1.Account/Login": grpclib.const.Handler(
                self.__rpc_login,
                grpclib.const.Cardinality.UNARY_UNARY,
                LoginRequest,
                LoginResponse,
            ),
            "/services.account.v1.Account/LoginConfirm": grpclib.const.Handler(
                self.__rpc_login_confirm,
                grpclib.const.Cardinality.UNARY_UNARY,
                LoginConfirmRequest,
                LoginConfirmResponse,
            ),
            "/services.account.v1.Account/Info": grpclib.const.Handler(
                self.__rpc_info,
                grpclib.const.Cardinality.UNARY_UNARY,
                AccountInfoRequest,
                AccountInfoResponse,
            ),
            "/services.account.v1.Account/AuthorizeWebhook": grpclib.const.Handler(
                self.__rpc_authorize_webhook,
                grpclib.const.Cardinality.UNARY_UNARY,
                AuthorizeWebhookRequest,
                AuthorizeWebhookResponse,
            ),
        }
