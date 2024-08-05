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
 * @interface ListIntegrationsResponse
 */
export interface ListIntegrationsResponse {
    /**
     *
     * @type {Array<Integration>}
     * @memberof ListIntegrationsResponse
     */
    integrations: Array<Integration>;
}

/**
 * Check if a given object implements the ListIntegrationsResponse interface.
 */
export function instanceOfListIntegrationsResponse(
    value: object,
): value is ListIntegrationsResponse {
    if (!("integrations" in value) || value["integrations"] === undefined)
        return false;
    return true;
}

export function ListIntegrationsResponseFromJSON(
    json: any,
): ListIntegrationsResponse {
    return ListIntegrationsResponseFromJSONTyped(json, false);
}

export function ListIntegrationsResponseFromJSONTyped(
    json: any,
    ignoreDiscriminator: boolean,
): ListIntegrationsResponse {
    if (json == null) {
        return json;
    }
    return {
        integrations: (json["integrations"] as Array<any>).map(
            IntegrationFromJSON,
        ),
    };
}

export function ListIntegrationsResponseToJSON(
    value?: ListIntegrationsResponse | null,
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
