/* tslint:disable */
/* eslint-disable */
/**
 * Connect API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import * as runtime from "../runtime";
import type {
    CancelSessionResponse,
    CreateSessionRequest,
    CreateSessionResponse,
    FailureMessage,
    GetSessionResponseV1,
    ListSessionsResponse,
    OrderDirection,
    SessionOrdering,
    ValidationResult,
} from "../models/index";
import {
    CancelSessionResponseFromJSON,
    CancelSessionResponseToJSON,
    CreateSessionRequestFromJSON,
    CreateSessionRequestToJSON,
    CreateSessionResponseFromJSON,
    CreateSessionResponseToJSON,
    FailureMessageFromJSON,
    FailureMessageToJSON,
    GetSessionResponseV1FromJSON,
    GetSessionResponseV1ToJSON,
    ListSessionsResponseFromJSON,
    ListSessionsResponseToJSON,
    OrderDirectionFromJSON,
    OrderDirectionToJSON,
    SessionOrderingFromJSON,
    SessionOrderingToJSON,
    ValidationResultFromJSON,
    ValidationResultToJSON,
} from "../models/index";

export interface CancelSessionRequest {
    sessionId: string;
}

export interface CreateSessionOperationRequest {
    createSessionRequest?: CreateSessionRequest;
}

export interface GetSessionRequest {
    sessionId: string;
}

export interface ListSessionsRequest {
    orderBy?: SessionOrdering;
    orderDirection?: OrderDirection;
    pageSize?: number;
    page?: number;
}

export interface RedactSessionRequest {
    sessionId: string;
}

/**
 *
 */
export class SessionsApi extends runtime.BaseAPI {
    /**
     */
    async cancelSessionRaw(
        requestParameters: CancelSessionRequest,
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<runtime.ApiResponse<CancelSessionResponse>> {
        if (requestParameters["sessionId"] == null) {
            throw new runtime.RequiredError(
                "sessionId",
                'Required parameter "sessionId" was null or undefined when calling cancelSession().',
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request(
            {
                path: `/api/v1/sessions/{sessionId}/cancel`.replace(
                    `{${"sessionId"}}`,
                    encodeURIComponent(String(requestParameters["sessionId"])),
                ),
                method: "POST",
                headers: headerParameters,
                query: queryParameters,
            },
            initOverrides,
        );

        return new runtime.JSONApiResponse(response, (jsonValue) =>
            CancelSessionResponseFromJSON(jsonValue),
        );
    }

    /**
     */
    async cancelSession(
        requestParameters: CancelSessionRequest,
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<CancelSessionResponse> {
        const response = await this.cancelSessionRaw(
            requestParameters,
            initOverrides,
        );
        return await response.value();
    }

    /**
     */
    async createSessionRaw(
        requestParameters: CreateSessionOperationRequest,
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<runtime.ApiResponse<CreateSessionResponse>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters["Content-Type"] = "application/json";

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request(
            {
                path: `/api/v1/sessions`,
                method: "POST",
                headers: headerParameters,
                query: queryParameters,
                body: CreateSessionRequestToJSON(
                    requestParameters["createSessionRequest"],
                ),
            },
            initOverrides,
        );

        return new runtime.JSONApiResponse(response, (jsonValue) =>
            CreateSessionResponseFromJSON(jsonValue),
        );
    }

    /**
     */
    async createSession(
        requestParameters: CreateSessionOperationRequest = {},
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<CreateSessionResponse> {
        const response = await this.createSessionRaw(
            requestParameters,
            initOverrides,
        );
        return await response.value();
    }

    /**
     */
    async getSessionRaw(
        requestParameters: GetSessionRequest,
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<runtime.ApiResponse<GetSessionResponseV1>> {
        if (requestParameters["sessionId"] == null) {
            throw new runtime.RequiredError(
                "sessionId",
                'Required parameter "sessionId" was null or undefined when calling getSession().',
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request(
            {
                path: `/api/v1/sessions/{sessionId}`.replace(
                    `{${"sessionId"}}`,
                    encodeURIComponent(String(requestParameters["sessionId"])),
                ),
                method: "GET",
                headers: headerParameters,
                query: queryParameters,
            },
            initOverrides,
        );

        return new runtime.JSONApiResponse(response, (jsonValue) =>
            GetSessionResponseV1FromJSON(jsonValue),
        );
    }

    /**
     */
    async getSession(
        requestParameters: GetSessionRequest,
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<GetSessionResponseV1> {
        const response = await this.getSessionRaw(
            requestParameters,
            initOverrides,
        );
        return await response.value();
    }

    /**
     */
    async listSessionsRaw(
        requestParameters: ListSessionsRequest,
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<runtime.ApiResponse<ListSessionsResponse>> {
        const queryParameters: any = {};

        if (requestParameters["orderBy"] != null) {
            queryParameters["OrderBy"] = requestParameters["orderBy"];
        }

        if (requestParameters["orderDirection"] != null) {
            queryParameters["OrderDirection"] =
                requestParameters["orderDirection"];
        }

        if (requestParameters["pageSize"] != null) {
            queryParameters["PageSize"] = requestParameters["pageSize"];
        }

        if (requestParameters["page"] != null) {
            queryParameters["Page"] = requestParameters["page"];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request(
            {
                path: `/api/v1/sessions`,
                method: "GET",
                headers: headerParameters,
                query: queryParameters,
            },
            initOverrides,
        );

        return new runtime.JSONApiResponse(response, (jsonValue) =>
            ListSessionsResponseFromJSON(jsonValue),
        );
    }

    /**
     */
    async listSessions(
        requestParameters: ListSessionsRequest = {},
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<ListSessionsResponse> {
        const response = await this.listSessionsRaw(
            requestParameters,
            initOverrides,
        );
        return await response.value();
    }

    /**
     */
    async redactSessionRaw(
        requestParameters: RedactSessionRequest,
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<runtime.ApiResponse<void>> {
        if (requestParameters["sessionId"] == null) {
            throw new runtime.RequiredError(
                "sessionId",
                'Required parameter "sessionId" was null or undefined when calling redactSession().',
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request(
            {
                path: `/api/v1/sessions/{sessionId}/redact`.replace(
                    `{${"sessionId"}}`,
                    encodeURIComponent(String(requestParameters["sessionId"])),
                ),
                method: "POST",
                headers: headerParameters,
                query: queryParameters,
            },
            initOverrides,
        );

        return new runtime.VoidApiResponse(response);
    }

    /**
     */
    async redactSession(
        requestParameters: RedactSessionRequest,
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<void> {
        await this.redactSessionRaw(requestParameters, initOverrides);
    }
}
