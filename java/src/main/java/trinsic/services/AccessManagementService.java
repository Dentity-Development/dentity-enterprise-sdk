package trinsic.services;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.InvalidProtocolBufferException;
import trinsic.sdk.options.v1.Options;
import trinsic.services.provider.v1.*;

public class AccessManagementService extends ServiceBase {
  private final AccessManagementGrpc.AccessManagementFutureStub stub;

  public AccessManagementService() {
    this(null);
  }

  public AccessManagementService(Options.TrinsicOptions.Builder options) {
    super(options);

    this.stub = AccessManagementGrpc.newFutureStub(this.getChannel());
  }
  // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
  // target:
  // /home/runner/work/sdk/sdk/java/src/main/java/trinsic/services/AccessManagementService.java

  /** This method is experimental Adds a role assignment to an account */
  @Deprecated(since = "This method is experimental")
  public ListenableFuture<AddRoleAssignmentResponse> addRoleAssignment(
      AddRoleAssignmentRequest request) throws InvalidProtocolBufferException {

    return withMetadata(stub, request).addRoleAssignment(request);
  }
  /** This method is experimental Removes a role assignment from the account */
  @Deprecated(since = "This method is experimental")
  public ListenableFuture<RemoveRoleAssignmentResponse> removeRoleAssignment(
      RemoveRoleAssignmentRequest request) throws InvalidProtocolBufferException {

    return withMetadata(stub, request).removeRoleAssignment(request);
  }
  /** This method is experimental List the role assignments for the given account */
  @Deprecated(since = "This method is experimental")
  public ListenableFuture<ListRoleAssignmentsResponse> listRoleAssignments(
      ListRoleAssignmentsRequest request) throws InvalidProtocolBufferException {

    return withMetadata(stub, request).listRoleAssignments(request);
  }
  // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
