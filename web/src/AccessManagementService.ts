import ServiceBase from "./ServiceBase";
import * as proto from "./proto";

import type { Client as BrowserClient } from "nice-grpc-web";

export class AccessManagementService extends ServiceBase {
    client: BrowserClient<typeof proto.AccessManagementDefinition>;

    constructor(options?: proto.ServiceOptions) {
        super(options);

        this.client = this.createClient(proto.AccessManagementDefinition);
    }

// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: D:\trinsic\sdk\web\src\AccessManagementService.ts

  /** Adds a role assignment to an account
*@deprecated This method is experimental */
  public async addRoleAssignment(request: proto.AddRoleAssignmentRequest): Promise<proto.AddRoleAssignmentResponse> {
    
    return this.client.addRoleAssignment(request, {
      metadata: await this.buildMetadata(proto.AddRoleAssignmentRequest.encode(request).finish())
    });
  }
  /** Removes a role assignment from the account
*@deprecated This method is experimental */
  public async removeRoleAssignment(request: proto.RemoveRoleAssignmentRequest): Promise<proto.RemoveRoleAssignmentResponse> {
    
    return this.client.removeRoleAssignment(request, {
      metadata: await this.buildMetadata(proto.RemoveRoleAssignmentRequest.encode(request).finish())
    });
  }
  /** List the role assignments for the given account
*@deprecated This method is experimental */
  public async listRoleAssignments(request: proto.ListRoleAssignmentsRequest): Promise<proto.ListRoleAssignmentsResponse> {
    
    return this.client.listRoleAssignments(request, {
      metadata: await this.buildMetadata(proto.ListRoleAssignmentsRequest.encode(request).finish())
    });
  }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
