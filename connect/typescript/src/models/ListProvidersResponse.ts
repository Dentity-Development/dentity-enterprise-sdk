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

import { mapValues } from "../runtime";
import type { Integration } from "./Integration";
import {
    IntegrationFromJSON,
    IntegrationFromJSONTyped,
    IntegrationToJSON,
} from "./Integration";

/**
 *
 * @export
 * @interface ListProvidersResponse
 */
export interface ListProvidersResponse {
    /**
     * The list of integrations available to your account
     * @type {Array<Integration>}
     * @memberof ListProvidersResponse
     */
    integrations: Array<Integration>;
}

/**
 * Check if a given object implements the ListProvidersResponse interface.
 */
export function instanceOfListProvidersResponse(
    value: object,
): value is ListProvidersResponse {
    if (!("integrations" in value) || value["integrations"] === undefined)
        return false;
    return true;
}

export function ListProvidersResponseFromJSON(
    json: any,
): ListProvidersResponse {
    return ListProvidersResponseFromJSONTyped(json, false);
}

export function ListProvidersResponseFromJSONTyped(
    json: any,
    ignoreDiscriminator: boolean,
): ListProvidersResponse {
    if (json == null) {
        return json;
    }
    return {
        integrations: (json["integrations"] as Array<any>).map(
            IntegrationFromJSON,
        ),
    };
}

export function ListProvidersResponseToJSON(
    value?: ListProvidersResponse | null,
): any {
    if (value == null) {
        return value;
    }
    return {
        integrations: (value["integrations"] as Array<any>).map(
            IntegrationToJSON,
        ),
    };
}