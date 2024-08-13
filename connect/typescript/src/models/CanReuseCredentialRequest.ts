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
 * @interface CanReuseCredentialRequest
 */
export interface CanReuseCredentialRequest {
    /**
     *
     * @type {string}
     * @memberof CanReuseCredentialRequest
     */
    phoneNumber: string;
}

/**
 * Check if a given object implements the CanReuseCredentialRequest interface.
 */
export function instanceOfCanReuseCredentialRequest(
    value: object,
): value is CanReuseCredentialRequest {
    if (!("phoneNumber" in value) || value["phoneNumber"] === undefined)
        return false;
    return true;
}

export function CanReuseCredentialRequestFromJSON(
    json: any,
): CanReuseCredentialRequest {
    return CanReuseCredentialRequestFromJSONTyped(json, false);
}

export function CanReuseCredentialRequestFromJSONTyped(
    json: any,
    ignoreDiscriminator: boolean,
): CanReuseCredentialRequest {
    if (json == null) {
        return json;
    }
    return {
        phoneNumber: json["phoneNumber"],
    };
}

export function CanReuseCredentialRequestToJSON(
    value?: CanReuseCredentialRequest | null,
): any {
    if (value == null) {
        return value;
    }
    return {
        phoneNumber: value["phoneNumber"],
    };
}