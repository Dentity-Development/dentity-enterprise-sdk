# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: services/common/v1/common.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import Dict, List, Optional

import betterproto
from betterproto.grpc.grpclib_server import ServiceBase
import grpclib


class ResponseStatus(betterproto.Enum):
    SUCCESS = 0
    WALLET_ACCESS_DENIED = 10
    WALLET_EXISTS = 11
    ITEM_NOT_FOUND = 20
    SERIALIZATION_ERROR = 200
    UNKNOWN_ERROR = 100


class JsonFormat(betterproto.Enum):
    Protobuf = 0
    Binary = 1
    String = 2


@dataclass(eq=False, repr=False)
class RequestOptions(betterproto.Message):
    response_json_format: "JsonFormat" = betterproto.enum_field(1)


@dataclass(eq=False, repr=False)
class JsonPayload(betterproto.Message):
    json_struct: "betterproto_lib_google_protobuf.Struct" = betterproto.message_field(
        1, group="json"
    )
    json_string: str = betterproto.string_field(2, group="json")
    json_bytes: bytes = betterproto.bytes_field(3, group="json")


@dataclass(eq=False, repr=False)
class ServerConfig(betterproto.Message):
    # service endpoint
    endpoint: str = betterproto.string_field(1)
    # service port
    port: int = betterproto.int32_field(2)
    # indicates if tls is used
    use_tls: bool = betterproto.bool_field(3)


@dataclass(eq=False, repr=False)
class Nonce(betterproto.Message):
    """Nonce used to generate an oberon proof"""

    timestamp: int = betterproto.int64_field(1)
    request_hash: bytes = betterproto.bytes_field(2)


class CommonStub(betterproto.ServiceStub):
    async def request(
        self,
        *,
        iv: bytes = b"",
        aad: bytes = b"",
        ciphertext: bytes = b"",
        tag: bytes = b"",
        recipients: Optional[List["EncryptionRecipient"]] = None
    ) -> "___pbmse_v1__.EncryptedMessage":
        recipients = recipients or []

        request = ___pbmse_v1__.EncryptedMessage()
        request.iv = iv
        request.aad = aad
        request.ciphertext = ciphertext
        request.tag = tag
        if recipients is not None:
            request.recipients = recipients

        return await self._unary_unary(
            "/services.common.v1.Common/Request",
            request,
            ___pbmse_v1__.EncryptedMessage,
        )


class CommonBase(ServiceBase):
    async def request(
        self,
        iv: bytes,
        aad: bytes,
        ciphertext: bytes,
        tag: bytes,
        recipients: Optional[List["EncryptionRecipient"]],
    ) -> "___pbmse_v1__.EncryptedMessage":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_request(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "iv": request.iv,
            "aad": request.aad,
            "ciphertext": request.ciphertext,
            "tag": request.tag,
            "recipients": request.recipients,
        }

        response = await self.request(**request_kwargs)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/services.common.v1.Common/Request": grpclib.const.Handler(
                self.__rpc_request,
                grpclib.const.Cardinality.UNARY_UNARY,
                ___pbmse_v1__.EncryptedMessage,
                ___pbmse_v1__.EncryptedMessage,
            ),
        }


from ....pbmse import v1 as ___pbmse_v1__
import betterproto.lib.google.protobuf as betterproto_lib_google_protobuf
