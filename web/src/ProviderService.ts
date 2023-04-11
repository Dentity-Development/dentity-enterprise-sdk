import ServiceBase from "./ServiceBase";
import * as proto from "./proto";

import type { Client as BrowserClient } from "nice-grpc-web";
import { Base64 } from "js-base64";

export class ProviderService extends ServiceBase {
    client: BrowserClient<typeof proto.ProviderDefinition>;

    constructor(options?: proto.TrinsicOptions) {
        super(options);

        this.client = this.createClient(proto.ProviderDefinition);
    }

    public async createEcosystem(
        request: proto.CreateEcosystemRequest
    ): Promise<proto.CreateEcosystemResponse> {
        const response =
            request.name?.trim() || request.details?.email?.trim()
                ? await this.client.createEcosystem(request, {
                      metadata: await this.buildMetadata(
                          proto.CreateEcosystemRequest.encode(request).finish()
                      ),
                  })
                : await this.client.createEcosystem(request);

        const authToken = Base64.fromUint8Array(
            proto.AccountProfile.encode(response.profile!).finish(),
            true
        );
        this.options.authToken = authToken;
        return response;
    }
// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: /home/runner/work/sdk/sdk/web/src/ProviderService.ts

  /** Update an existing ecosystem
*@deprecated This will be removed May 1, 2023 */
  public async updateEcosystem(request: proto.UpdateEcosystemRequest): Promise<proto.UpdateEcosystemResponse> {

    return this.client.updateEcosystem(request, {
      metadata: await this.buildMetadata(proto.UpdateEcosystemRequest.encode(request).finish())
    });
  }
  /** Get ecosystem information */
  public async ecosystemInfo(request: proto.EcosystemInfoRequest): Promise<proto.EcosystemInfoResponse> {

    return this.client.ecosystemInfo(request, {
      metadata: await this.buildMetadata(proto.EcosystemInfoRequest.encode(request).finish())
    });
  }
  /** Get public ecosystem information about *any* ecosystem
*@deprecated This will be removed May 1, 2023 */
  public async getPublicEcosystemInfo(request: proto.GetPublicEcosystemInfoRequest): Promise<proto.GetPublicEcosystemInfoResponse> {

    return this.client.getPublicEcosystemInfo(request, {
      metadata: await this.buildMetadata()
    });
  }
  /** Returns the public key being used to create/verify oberon tokens */
  public async getOberonKey(): Promise<proto.GetOberonKeyResponse> {
    let request = proto.GetOberonKeyRequest.fromPartial({});
    return this.client.getOberonKey(request, {
      metadata: await this.buildMetadata()
    });
  }
  /** Upgrade a wallet's DID from `did:key` to another method */
  public async upgradeDID(request: proto.UpgradeDidRequest): Promise<proto.UpgradeDidResponse> {

    return this.client.upgradeDID(request, {
      metadata: await this.buildMetadata(proto.UpgradeDidRequest.encode(request).finish())
    });
  }
  /** Retrieve a random hash TXT that can be used to verify domain ownership */
  public async retrieveDomainVerificationRecord(): Promise<proto.RetrieveDomainVerificationRecordResponse> {
    let request = proto.RetrieveDomainVerificationRecordRequest.fromPartial({});
    return this.client.retrieveDomainVerificationRecord(request, {
      metadata: await this.buildMetadata(proto.RetrieveDomainVerificationRecordRequest.encode(request).finish())
    });
  }
  /** Call to verify domain */
  public async refreshDomainVerificationStatus(): Promise<proto.RefreshDomainVerificationStatusResponse> {
    let request = proto.RefreshDomainVerificationStatusRequest.fromPartial({});
    return this.client.refreshDomainVerificationStatus(request, {
      metadata: await this.buildMetadata(proto.RefreshDomainVerificationStatusRequest.encode(request).finish())
    });
  }
  /** Search for issuers/providers/verifiers in the current ecosystem */
  public async searchWalletConfigurations(request: proto.SearchWalletConfigurationsRequest): Promise<proto.SearchWalletConfigurationResponse> {

    return this.client.searchWalletConfigurations(request, {
      metadata: await this.buildMetadata(proto.SearchWalletConfigurationsRequest.encode(request).finish())
    });
  }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
