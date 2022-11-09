from trinsic.proto.sdk.options.v1 import ServiceOptions
from trinsic.proto.services.provider.v1 import *
from trinsic.security_providers import ITokenProvider
from trinsic.service_base import ServiceBase


class AccessManagementService(ServiceBase):
    """Wrapper for the [Credentials Service](/reference/services/Credentials-service/)"""

    def __init__(
        self,
        *,
        server_config: ServiceOptions = None,
        token_provider: ITokenProvider = None
    ):
        """
        Initialize a connection to the server.
        Args:
            server_config: The URL of the server, or a channel which encapsulates the connection already.
        """
        super().__init__(server_config, token_provider)
        self.client = AccessManagementStub(super().channel)

    # BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    # target: C:\work\sdk\python\trinsic\access_management_service.py

    async def add_role_assignment(
        self, *, request: AddRoleAssignmentRequest
    ) -> AddRoleAssignmentResponse:
        """Adds a role assignment to an account"""

        return await self.client.add_role_assignment(
            request, metadata=self.build_metadata(request)
        )

    async def remove_role_assignment(
        self, *, request: RemoveRoleAssignmentRequest
    ) -> RemoveRoleAssignmentResponse:
        """Removes a role assignment from the account"""

        return await self.client.remove_role_assignment(
            request, metadata=self.build_metadata(request)
        )

    async def list_role_assignments(
        self, *, request: ListRoleAssignmentsRequest
    ) -> ListRoleAssignmentsResponse:
        """List the role assignments for the given account"""

        return await self.client.list_role_assignments(
            request, metadata=self.build_metadata(request)
        )


# END Code generated by protoc-gen-trinsic. DO NOT EDIT.
