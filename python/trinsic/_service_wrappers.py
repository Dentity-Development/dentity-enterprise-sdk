from typing import Optional, Type, List

from trinsic.proto.services.provider.v1 import ProviderStub
from trinsic.proto.services.trustregistry.v1 import TrustRegistryStub
from trinsic.proto.services.universalwallet.v1 import WalletStub
from trinsic.proto.services.verifiablecredentials.v1 import CredentialStub
from trinsic.service_base import ServiceBase

def _update_metadata(route: str, skip_routes: List[str], service: "ServiceBase", metadata: "_MetadataLike",
                    request: "_MessageLike") -> "_MetadataLike":
    if route in skip_routes:
        return metadata
    if metadata:
        raise NotImplementedError("Cannot combine metadata yet")
    return service.metadata(request)


# TODO - There needs to be a metadata decorator for this


class _WalletStubWithMetadata(WalletStub):
    skip_metadata = ['/services.universalwallet.v1.Wallet/CreateWallet']

    def __init__(
            self,
            service: ServiceBase
    ) -> None:
        self.service = service
        super().__init__(service.channel)

    async def _unary_unary(
            self,
            route: str,
            request: "_MessageLike",
            response_type: Type["T"],
            *,
            timeout: Optional[float] = None,
            deadline: Optional["Deadline"] = None,
            metadata: Optional["_MetadataLike"] = None) -> "T":
        metadata = _update_metadata(route, self.skip_metadata, self.service, metadata, request)
        return await super()._unary_unary(route, request, response_type, timeout=timeout, deadline=deadline,
                                          metadata=metadata)


class _CredentialStubWithMetadata(CredentialStub):
    skip_metadata = []

    def __init__(
            self,
            service: ServiceBase
    ) -> None:
        self.service = service
        super().__init__(service.channel)

    async def _unary_unary(
            self,
            route: str,
            request: "_MessageLike",
            response_type: Type["T"],
            *,
            timeout: Optional[float] = None,
            deadline: Optional["Deadline"] = None,
            metadata: Optional["_MetadataLike"] = None) -> "T":
        metadata = _update_metadata(route, self.skip_metadata, self.service, metadata, request)
        return await super()._unary_unary(route, request, response_type, timeout=timeout, deadline=deadline,
                                          metadata=metadata)


class _TrustRegistryStubWithMetadata(TrustRegistryStub):
    skip_metadata = []

    def __init__(
            self,
            service: ServiceBase
    ) -> None:
        self.service = service
        super().__init__(service.channel)

    async def _unary_unary(
            self,
            route: str,
            request: "_MessageLike",
            response_type: Type["T"],
            *,
            timeout: Optional[float] = None,
            deadline: Optional["Deadline"] = None,
            metadata: Optional["_MetadataLike"] = None) -> "T":
        metadata = _update_metadata(route, self.skip_metadata, self.service, metadata, request)
        return await super()._unary_unary(route, request, response_type, timeout=timeout, deadline=deadline,
                                          metadata=metadata)


class _ProviderStubWithMetadata(ProviderStub):
    skip_metadata = []

    def __init__(
            self,
            service: ServiceBase
    ) -> None:
        self.service = service
        super().__init__(service.channel)

    async def _unary_unary(
            self,
            route: str,
            request: "_MessageLike",
            response_type: Type["T"],
            *,
            timeout: Optional[float] = None,
            deadline: Optional["Deadline"] = None,
            metadata: Optional["_MetadataLike"] = None) -> "T":
        metadata = _update_metadata(route, self.skip_metadata, self.service, metadata, request)
        return await super()._unary_unary(route, request, response_type, timeout=timeout, deadline=deadline,
                                          metadata=metadata)