import base64

import deprecation

from trinsic.proto.sdk.options.v1 import TrinsicOptions
from trinsic.proto.services.provider.v1 import *

from trinsic.service_base import ServiceBase


class ProviderService(ServiceBase):
    """
    Wrapper for the [Provider Service](/reference/services/provider-service)
    """

    def __init__(
        self,
        *,
        server_config: TrinsicOptions = None,
    ):
        """
        Initialize the connection
        Args:
            server_config: The address of the server to connect, or an already-connected `Channel`
        """
        super().__init__(server_config)
        self.client = ProviderStub(super().channel)

    async def create_ecosystem(
        self, *, request: CreateEcosystemRequest = None
    ) -> CreateEcosystemResponse:
        """
        Creates a new ecosystem
        Args:
            request:

        Returns:
            [CreateEcosystemResponse](/reference/proto/#createecosystemresponse)
        """
        request = request or CreateEcosystemRequest()
        # Authentication metadata interceptor is in `ServiceBase.py`
        authenticate = len(request.name) > 0 or (
            request.details and len(request.details.email) > 0
        )
        metadata = (
            self.build_metadata(request) if authenticate else self.build_metadata()
        )
        response = await self.client.create_ecosystem(request, metadata=metadata)

        auth_token = base64.urlsafe_b64encode(bytes(response.profile)).decode("utf8")

        if not response.profile.protection.enabled:
            self.service_options.auth_token = auth_token
        return response

    # BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    # target: /home/runner/work/sdk/sdk/python/trinsic/provider_service.py

    @deprecation.deprecated(details="This will be removed June 1, 2023")
    async def update_ecosystem(
        self, *, request: UpdateEcosystemRequest
    ) -> UpdateEcosystemResponse:
        """
        This will be removed June 1, 2023
          The below display can be removed only once the Dashboard is updating this itself - currently it uses this request
          DEPRECATED, will be removed June 1st 2023
        """

        return await self.client.update_ecosystem(
            request, metadata=self.build_metadata(request)
        )

    async def get_oberon_key(self) -> GetOberonKeyResponse:
        """Returns the public key being used to create/verify oberon tokens"""
        request = GetOberonKeyRequest()
        return await self.client.get_oberon_key(request, metadata=self.build_metadata())

    async def upgrade_did(self, *, request: UpgradeDidRequest) -> UpgradeDidResponse:
        """Upgrade a wallet's DID from `did:key` to another method"""

        return await self.client.upgrade_did(
            request, metadata=self.build_metadata(request)
        )

    async def retrieve_domain_verification_record(
        self,
    ) -> RetrieveDomainVerificationRecordResponse:
        """Retrieve a random hash TXT that can be used to verify domain ownership"""
        request = RetrieveDomainVerificationRecordRequest()
        return await self.client.retrieve_domain_verification_record(
            request, metadata=self.build_metadata(request)
        )

    async def refresh_domain_verification_status(
        self,
    ) -> RefreshDomainVerificationStatusResponse:
        """Call to verify domain"""
        request = RefreshDomainVerificationStatusRequest()
        return await self.client.refresh_domain_verification_status(
            request, metadata=self.build_metadata(request)
        )

    async def search_wallet_configurations(
        self, *, request: SearchWalletConfigurationsRequest
    ) -> SearchWalletConfigurationResponse:
        """Search for issuers/providers/verifiers in the current ecosystem"""

        return await self.client.search_wallet_configurations(
            request, metadata=self.build_metadata(request)
        )


# END Code generated by protoc-gen-trinsic. DO NOT EDIT.
