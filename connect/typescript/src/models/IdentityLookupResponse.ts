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
/**
 *
 * @export
 * @interface IdentityLookupResponse
 */
export interface IdentityLookupResponse {
    /**
     * Whether the given phone number is known to have an identity in the network.
     * @type {boolean}
     * @memberof IdentityLookupResponse
     */
    identityInNetwork: boolean;
}

/**
 * Check if a given object implements the IdentityLookupResponse interface.
 */
export function instanceOfIdentityLookupResponse(
    value: object,
): value is IdentityLookupResponse {
    if (
        !("identityInNetwork" in value) ||
        value["identityInNetwork"] === undefined
    )
        return false;
    return true;
}

export function IdentityLookupResponseFromJSON(
    json: any,
): IdentityLookupResponse {
    return IdentityLookupResponseFromJSONTyped(json, false);
}

export function IdentityLookupResponseFromJSONTyped(
    json: any,
    ignoreDiscriminator: boolean,
): IdentityLookupResponse {
    if (json == null) {
        return json;
    }
    return {
        identityInNetwork: json["identityInNetwork"],
    };
}

export function IdentityLookupResponseToJSON(
    value?: IdentityLookupResponse | null,
): any {
    if (value == null) {
        return value;
    }
    return {
        identityInNetwork: value["identityInNetwork"],
    };
}
