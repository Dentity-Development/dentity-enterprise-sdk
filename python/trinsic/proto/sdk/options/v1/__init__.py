# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: sdk/options/v1/options.proto
# plugin: python-betterproto
from dataclasses import dataclass

import betterproto
from betterproto.grpc.grpclib_server import ServiceBase


@dataclass(eq=False, repr=False)
class ServiceOptions(betterproto.Message):
    """Configuration for Trinsic SDK Services"""

    server_endpoint: str = betterproto.string_field(1)
    """Trinsic API endpoint; defaults to `prod.trinsic.cloud`"""

    server_port: int = betterproto.int32_field(2)
    """Trinsic API port; defaults to `443`"""

    server_use_tls: bool = betterproto.bool_field(3)
    """
    Whether TLS is enabled between SDK and Trinsic API; defaults to `true`
    """

    auth_token: str = betterproto.string_field(4)
    """
    Authentication token for SDK calls; defaults to empty string
    (unauthenticated)
    """

    default_ecosystem: str = betterproto.string_field(5)
    """
    Default ecosystem ID to use for various SDK calls; defaults to `default`
    """
