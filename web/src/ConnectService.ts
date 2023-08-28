import ServiceBase from "./ServiceBase";

import type { Client as BrowserClient } from "nice-grpc-web";
import { ConnectDefinition, TrinsicOptions } from "./proto";
import * as proto from "./proto";

export class ConnectService extends ServiceBase {
    client: BrowserClient<typeof ConnectDefinition>;

    constructor(options?: TrinsicOptions) {
        super(options);

        this.client = this.createClient(ConnectDefinition);
    }

// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: /home/runner/work/sdk/sdk/web/src/ConnectService.ts

  /** Create an IDVSession */
  public async createSession(request: proto.CreateSessionRequest): Promise<proto.CreateSessionResponse2> {

    return this.client.createSession(request, {
      metadata: await this.buildMetadata(proto.CreateSessionRequest.encode(request).finish())
    });
  }
  /** Cancel an IDVSession */
  public async cancelSession(request: proto.CancelSessionRequest): Promise<proto.CancelSessionResponse> {

    return this.client.cancelSession(request, {
      metadata: await this.buildMetadata(proto.CancelSessionRequest.encode(request).finish())
    });
  }
  /** Get an IDVSession */
  public async getSession(request: proto.GetSessionRequest): Promise<proto.GetSessionResponse> {

    return this.client.getSession(request, {
      metadata: await this.buildMetadata(proto.GetSessionRequest.encode(request).finish())
    });
  }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
