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
    CreateVerificationSessionRequest,
    CreateVerificationSessionResponse,
    ExchangeTokenRequest,
    ExchangeTokenResponse,
    FailureMessage,
    ListIntegrationsResponse,
    ValidationResult,
} from "../models/index";
import {
    CreateVerificationSessionRequestFromJSON,
    CreateVerificationSessionRequestToJSON,
    CreateVerificationSessionResponseFromJSON,
    CreateVerificationSessionResponseToJSON,
    ExchangeTokenRequestFromJSON,
    ExchangeTokenRequestToJSON,
    ExchangeTokenResponseFromJSON,
    ExchangeTokenResponseToJSON,
    FailureMessageFromJSON,
    FailureMessageToJSON,
    ListIntegrationsResponseFromJSON,
    ListIntegrationsResponseToJSON,
    ValidationResultFromJSON,
    ValidationResultToJSON,
} from "../models/index";

export interface CreateVerificationSessionOperationRequest {
    createVerificationSessionRequest?: CreateVerificationSessionRequest;
}

export interface ExchangeTokenOperationRequest {
    verificationSessionId: string;
    exchangeTokenRequest?: ExchangeTokenRequest;
}

export interface GetLinkedResourceRequest {
    resourceToken?: string;
}

/**
 *
 */
export class AcceptanceApi extends runtime.BaseAPI {
    /**
     */
    async createVerificationSessionRaw(
        requestParameters: CreateVerificationSessionOperationRequest,
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<runtime.ApiResponse<CreateVerificationSessionResponse>> {
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
                path: `/api/v1/acceptance/verification-session`,
                method: "PUT",
                headers: headerParameters,
                query: queryParameters,
                body: CreateVerificationSessionRequestToJSON(
                    requestParameters["createVerificationSessionRequest"],
                ),
            },
            initOverrides,
        );

        return new runtime.JSONApiResponse(response, (jsonValue) =>
            CreateVerificationSessionResponseFromJSON(jsonValue),
        );
    }

    /**
     */
    async createVerificationSession(
        requestParameters: CreateVerificationSessionOperationRequest = {},
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<CreateVerificationSessionResponse> {
        const response = await this.createVerificationSessionRaw(
            requestParameters,
            initOverrides,
        );
        return await response.value();
    }

    /**
     */
    async exchangeTokenRaw(
        requestParameters: ExchangeTokenOperationRequest,
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<runtime.ApiResponse<ExchangeTokenResponse>> {
        if (requestParameters["verificationSessionId"] == null) {
            throw new runtime.RequiredError(
                "verificationSessionId",
                'Required parameter "verificationSessionId" was null or undefined when calling exchangeToken().',
            );
        }

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
                path: `/api/v1/acceptance/verification-session/{verificationSessionId}/exchange`.replace(
                    `{${"verificationSessionId"}}`,
                    encodeURIComponent(
                        String(requestParameters["verificationSessionId"]),
                    ),
                ),
                method: "POST",
                headers: headerParameters,
                query: queryParameters,
                body: ExchangeTokenRequestToJSON(
                    requestParameters["exchangeTokenRequest"],
                ),
            },
            initOverrides,
        );

        return new runtime.JSONApiResponse(response, (jsonValue) =>
            ExchangeTokenResponseFromJSON(jsonValue),
        );
    }

    /**
     */
    async exchangeToken(
        requestParameters: ExchangeTokenOperationRequest,
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<ExchangeTokenResponse> {
        const response = await this.exchangeTokenRaw(
            requestParameters,
            initOverrides,
        );
        return await response.value();
    }

    /**
     */
    async getLinkedResourceRaw(
        requestParameters: GetLinkedResourceRequest,
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<runtime.ApiResponse<void>> {
        const queryParameters: any = {};

        if (requestParameters["resourceToken"] != null) {
            queryParameters["resourceToken"] =
                requestParameters["resourceToken"];
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
                path: `/api/v1/acceptance/resource`,
                method: "GET",
                headers: headerParameters,
                query: queryParameters,
            },
            initOverrides,
        );

        return new runtime.VoidApiResponse(response);
    }

    /**
     */
    async getLinkedResource(
        requestParameters: GetLinkedResourceRequest = {},
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<void> {
        await this.getLinkedResourceRaw(requestParameters, initOverrides);
    }

    /**
     */
    async listIntegrationsRaw(
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<runtime.ApiResponse<ListIntegrationsResponse>> {
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
                path: `/api/v1/acceptance/integrations`,
                method: "GET",
                headers: headerParameters,
                query: queryParameters,
            },
            initOverrides,
        );

        return new runtime.JSONApiResponse(response, (jsonValue) =>
            ListIntegrationsResponseFromJSON(jsonValue),
        );
    }

    /**
     */
    async listIntegrations(
        initOverrides?: RequestInit | runtime.InitOverrideFunction,
    ): Promise<ListIntegrationsResponse> {
        const response = await this.listIntegrationsRaw(initOverrides);
        return await response.value();
    }
}
