import ServiceBase from "./ServiceBase";
import {
    AccountProfile,
    AddWebhookRequest,
    AddWebhookResponse,
    CreateEcosystemRequest,
    CreateEcosystemResponse,
    DeleteWebhookRequest,
    DeleteWebhookResponse,
    EcosystemInfoRequest,
    EcosystemInfoResponse,
    GenerateTokenRequest,
    GenerateTokenResponse,
    GetAuthorizationsRequest,
    GetAuthorizationsResponse,
    GetEventTokenRequest,
    GetEventTokenResponse,
    GetOberonKeyRequest,
    GetOberonKeyResponse,
    GrantAuthorizationRequest,
    GrantAuthorizationResponse,
    InvitationStatusRequest,
    InvitationStatusResponse,
    InviteRequest,
    InviteResponse,
    ProviderDefinition, RefreshVerificationStatusRequest,
    RefreshVerificationStatusResponse,
    RetrieveVerificationRecordRequest,
    RetrieveVerificationRecordResponse,
    RevokeAuthorizationRequest,
    RevokeAuthorizationResponse,
    ServiceOptions,
    UpdateEcosystemRequest,
    UpdateEcosystemResponse,
} from "./proto";

import type { Client as BrowserClient } from "nice-grpc-web";
import { Base64 } from "js-base64";

export class ProviderService extends ServiceBase {
  client: BrowserClient<typeof ProviderDefinition>;

  constructor(options?: ServiceOptions) {
    super(options);

    this.client = this.createClient(ProviderDefinition);
  }

  public async createEcosystem(
    request: CreateEcosystemRequest
  ): Promise<CreateEcosystemResponse> {
    const response =
      request.name?.trim() || request.details?.email?.trim()
        ? await this.client.createEcosystem(request, {
            metadata: await this.buildMetadata(
              CreateEcosystemRequest.encode(request).finish()
            ),
          })
        : await this.client.createEcosystem(request);

    const authToken = Base64.fromUint8Array(
      (AccountProfile.encode(response.profile!).finish()),
      true
    );
    this.options.authToken = authToken;
    return response;
  }
// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: /home/runner/work/sdk/sdk/web/src/ProviderService.ts

  /** Update an existing ecosystem */
  public async updateEcosystem(request: UpdateEcosystemRequest): Promise<UpdateEcosystemResponse> {
    
    return this.client.updateEcosystem(request, {
      metadata: await this.buildMetadata(UpdateEcosystemRequest.encode(request).finish())
    });
  }
  /** Grant user authorization to ecosystem resources */
  public async grantAuthorization(request: GrantAuthorizationRequest): Promise<GrantAuthorizationResponse> {
    
    return this.client.grantAuthorization(request, {
      metadata: await this.buildMetadata(GrantAuthorizationRequest.encode(request).finish())
    });
  }
  /** Revoke user authorization to ecosystem resources */
  public async revokeAuthorization(request: RevokeAuthorizationRequest): Promise<RevokeAuthorizationResponse> {
    
    return this.client.revokeAuthorization(request, {
      metadata: await this.buildMetadata(RevokeAuthorizationRequest.encode(request).finish())
    });
  }
  /** Retreive the list of permissions for this particular account/ecosystem */
  public async getAuthorizations(request: GetAuthorizationsRequest): Promise<GetAuthorizationsResponse> {
    
    return this.client.getAuthorizations(request, {
      metadata: await this.buildMetadata(GetAuthorizationsRequest.encode(request).finish())
    });
  }
  /** Add a webhook endpoint to the ecosystem */
  public async addWebhook(request: AddWebhookRequest): Promise<AddWebhookResponse> {
    
    return this.client.addWebhook(request, {
      metadata: await this.buildMetadata(AddWebhookRequest.encode(request).finish())
    });
  }
  /** Delete a webhook endpoint from the ecosystem */
  public async deleteWebhook(request: DeleteWebhookRequest): Promise<DeleteWebhookResponse> {
    
    return this.client.deleteWebhook(request, {
      metadata: await this.buildMetadata(DeleteWebhookRequest.encode(request).finish())
    });
  }
  /** Get ecosystem information */
  public async ecosystemInfo(request: EcosystemInfoRequest): Promise<EcosystemInfoResponse> {
    
    return this.client.ecosystemInfo(request, {
      metadata: await this.buildMetadata(EcosystemInfoRequest.encode(request).finish())
    });
  }
  /** Generates an unprotected authentication token that can be used to
* configure server side applications */
  public async generateToken(request: GenerateTokenRequest): Promise<GenerateTokenResponse> {
    
    return this.client.generateToken(request, {
      metadata: await this.buildMetadata(GenerateTokenRequest.encode(request).finish())
    });
  }
  /** Invite a user to the ecosystem */
  public async invite(request: InviteRequest): Promise<InviteResponse> {
    
    return this.client.invite(request, {
      metadata: await this.buildMetadata(InviteRequest.encode(request).finish())
    });
  }
  /** Check the status of an invitation */
  public async invitationStatus(request: InvitationStatusRequest): Promise<InvitationStatusResponse> {
    
    return this.client.invitationStatus(request, {
      metadata: await this.buildMetadata(InvitationStatusRequest.encode(request).finish())
    });
  }
  /** Returns the public key being used to create/verify oberon tokens */
  public async getOberonKey(request: GetOberonKeyRequest): Promise<GetOberonKeyResponse> {
    
    return this.client.getOberonKey(request, {
      metadata: await this.buildMetadata()
    });
  }
  /** Generate a signed token (JWT) that can be used to connect to the message bus */
  public async getEventToken(request: GetEventTokenRequest): Promise<GetEventTokenResponse> {
    
    return this.client.getEventToken(request, {
      metadata: await this.buildMetadata(GetEventTokenRequest.encode(request).finish())
    });
  }
  /** Retrieve a random hash TXT that can be used to verify domain ownership */
  public async retrieveVerificationRecord(request: RetrieveVerificationRecordRequest): Promise<RetrieveVerificationRecordResponse> {
    
    return this.client.retrieveVerificationRecord(request, {
      metadata: await this.buildMetadata(RetrieveVerificationRecordRequest.encode(request).finish())
    });
  }
  /** Call to verif */
  public async refreshVerificationStatus(request: RefreshVerificationStatusRequest): Promise<RefreshVerificationStatusResponse> {
    
    return this.client.refreshVerificationStatus(request, {
      metadata: await this.buildMetadata(RefreshVerificationStatusRequest.encode(request).finish())
    });
  }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
