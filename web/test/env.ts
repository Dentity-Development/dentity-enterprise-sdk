import { TrinsicOptions } from "../src";

export function getTestServerOptions(): TrinsicOptions {
    let testEnv: string | undefined;
    try {
        // @ts-ignore
        const argArr: string[] = __karma__?.config.args;
        argArr?.forEach((arg: string) => {
            let [key, value] = arg.split("=");
            key = key.replace("--", "");
            if (key === "trinsic_environment") testEnv = value;
        });
        // @ts-ignore
        testEnv = __karma__.config.args.trinsic_environment.toLowerCase();
    } catch (e) {
        // @ts-ignore
        if (typeof process !== "undefined" && process.env.trinsic_environment) {
            testEnv = process.env.trinsic_environment;
        }
    }
    testEnv ??= "dev"
    let serverEndpoint = "staging-internal.trinsic.cloud";
    if (testEnv.startsWith("dev"))
        serverEndpoint = "dev-internal.trinsic.cloud";
    if (testEnv.startsWith("prod"))
        serverEndpoint = "prod.trinsic.cloud";

    console.debug(`Provided environment:${testEnv} -> server endpoint:${serverEndpoint}`);

    return TrinsicOptions.fromPartial({
        serverEndpoint: serverEndpoint,
        serverPort: 443,
        serverUseTls: true,
    });
}

export function getLocalServerOptions(): TrinsicOptions {
    return {
        serverEndpoint: "127.0.0.1",
        serverPort: 5000,
        serverUseTls: false,
    };
}

export function setTestTimeout(timeoutMs: number = 40000) {
    if (typeof jasmine !== "undefined")
        jasmine.DEFAULT_TIMEOUT_INTERVAL = timeoutMs;
    if (typeof jest !== "undefined") jest.setTimeout(timeoutMs);
}

export function myEcosystemIdOrName(): string {
    return "integration-tests";
}
