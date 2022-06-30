import ServiceBase from "./ServiceBase";
import {
  CheckStatusRequest,
  CheckStatusResponse,
  CreateProofRequest,
  CreateProofResponse,
  IssueFromTemplateRequest,
  IssueFromTemplateResponse,
  IssueRequest,
  IssueResponse,
  SendRequest,
  SendResponse,
  ServiceOptions,
  UpdateStatusRequest,
  UpdateStatusResponse,
  VerifiableCredentialDefinition,
  VerifyProofRequest,
  VerifyProofResponse,
} from "./proto";

import type { Client as BrowserClient } from "nice-grpc-web";

export class CredentialService extends ServiceBase {
  client: BrowserClient<typeof VerifiableCredentialDefinition>;

  constructor(options?: ServiceOptions) {
    super(options);

    this.client = this.createClient(VerifiableCredentialDefinition);
  }
// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: ..\sdk\web\src\credentialService.ts

  public async issue(
    request: IssueRequest
  ): Promise<IssueResponse> {
    // TODO - handle metadata
    return this.client.issue(request, {
      metadata: await this.getMetadata(
        IssueRequest.encode(request).finish()
      ),
    });
  }
  public async issueFromTemplate(
    request: IssueFromTemplateRequest
  ): Promise<IssueFromTemplateResponse> {
    // TODO - handle metadata
    return this.client.issueFromTemplate(request, {
      metadata: await this.getMetadata(
        IssueFromTemplateRequest.encode(request).finish()
      ),
    });
  }
  public async checkStatus(
    request: CheckStatusRequest
  ): Promise<CheckStatusResponse> {
    // TODO - handle metadata
    return this.client.checkStatus(request, {
      metadata: await this.getMetadata(
        CheckStatusRequest.encode(request).finish()
      ),
    });
  }
  public async updateStatus(
    request: UpdateStatusRequest
  ): Promise<UpdateStatusResponse> {
    // TODO - handle metadata
    return this.client.updateStatus(request, {
      metadata: await this.getMetadata(
        UpdateStatusRequest.encode(request).finish()
      ),
    });
  }
  public async createProof(
    request: CreateProofRequest
  ): Promise<CreateProofResponse> {
    // TODO - handle metadata
    return this.client.createProof(request, {
      metadata: await this.getMetadata(
        CreateProofRequest.encode(request).finish()
      ),
    });
  }
  public async verifyProof(
    request: VerifyProofRequest
  ): Promise<VerifyProofResponse> {
    // TODO - handle metadata
    return this.client.verifyProof(request, {
      metadata: await this.getMetadata(
        VerifyProofRequest.encode(request).finish()
      ),
    });
  }
  public async send(
    request: SendRequest
  ): Promise<SendResponse> {
    // TODO - handle metadata
    return this.client.send(request, {
      metadata: await this.getMetadata(
        SendRequest.encode(request).finish()
      ),
    });
  }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
