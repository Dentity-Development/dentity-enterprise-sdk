# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: services/options/field-options.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import Optional

import betterproto
from betterproto.grpc.grpclib_server import ServiceBase


@dataclass(eq=False, repr=False)
class SdkTemplateOption(betterproto.Message):
    anonymous: Optional[bool] = betterproto.bool_field(
        1, optional=True, group="_anonymous"
    )
    """
    Whether the service endpoint allows anonymous (no auth token necessary)
    authentication This is used by the `protoc-gen-trinsic-sdk` plugin for
    metadata.
    """

    ignore: Optional[bool] = betterproto.bool_field(2, optional=True, group="_ignore")
    """
    Whether the SDK template generator should ignore this method. This method
    will be wrapped manually.
    """
