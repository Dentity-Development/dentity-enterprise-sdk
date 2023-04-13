import { TrinsicOptions } from "../src";

export function getTestServerOptions(): TrinsicOptions {
    return {
        serverEndpoint: "dev-internal.trinsic.cloud",
        serverPort: 443,
        serverUseTls: true,
    };
}

export function setTestTimeout(timeoutMs: number = 40000) {
    if (typeof jasmine !== "undefined")
        jasmine.DEFAULT_TIMEOUT_INTERVAL = timeoutMs;
    if (typeof jest !== "undefined") jest.setTimeout(timeoutMs);
}

export function myEcosystemIdOrName(): string {
    return "default";
}
