# createAccessManagementService() {
from trinsic.proto.services.provider.v1 import *
from trinsic.trinsic_service import TrinsicService
from trinsic.trinsic_util import trinsic_config

trinsic = TrinsicService(server_config=trinsic_config(auth_token="[YOUR-AUTH-TOKEN]"))
access_management_service = trinsic.access_management
# }

# accessManagementAddRoleAssignment() {
await access_management_service.add_role_assignment(
    request=AddRoleAssignmentRequest(
        did_uri="[YOUR-DID-URI]",
        wallet_id="[WALLET-ID]",
        email="[YOUR-EMAIL]",
        role="[ROLE-TO-ASSIGN]",
    )
)
# }

# accessManagementRemoveRoleAssignment() {
await access_management_service.remove_role_assignment(
    request=RemoveRoleAssignmentRequest(
        did_uri="[YOUR-DID-URI]",
        wallet_id="[WALLET-ID]",
        email="[YOUR-EMAIL]",
        role="[ROLE-TO-REMOVE]",
    )
)
# }

# accessManagementListRoleAssignments() {
await access_management_service.list_role_assignments(
    request=ListRoleAssignmentsRequest(
        did_uri="[YOUR-DID-URI]",
        wallet_id="[WALLET-ID]",
        email="[YOUR-EMAIL]",
    )
)
# }

# accessManagementListAvailableRoles() {
# TODO - This doesn't exist in the Python SDK
# }

# END Doc Code generated by protoc-gen-trinsic. DO NOT EDIT.
