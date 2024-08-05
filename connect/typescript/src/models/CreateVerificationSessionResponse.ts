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
 * @interface CreateVerificationSessionResponse
 */
export interface CreateVerificationSessionResponse {
    /**
     *
     * @type {string}
     * @memberof CreateVerificationSessionResponse
     */
    sessionId: string;
    /**
     *
     * @type {string}
     * @memberof CreateVerificationSessionResponse
     */
    launchUrl: string;
}

/**
 * Check if a given object implements the CreateVerificationSessionResponse interface.
 */
export function instanceOfCreateVerificationSessionResponse(
    value: object,
): value is CreateVerificationSessionResponse {
    if (!("sessionId" in value) || value["sessionId"] === undefined)
        return false;
    if (!("launchUrl" in value) || value["launchUrl"] === undefined)
        return false;
    return true;
}

export function CreateVerificationSessionResponseFromJSON(
    json: any,
): CreateVerificationSessionResponse {
    return CreateVerificationSessionResponseFromJSONTyped(json, false);
}

export function CreateVerificationSessionResponseFromJSONTyped(
    json: any,
    ignoreDiscriminator: boolean,
): CreateVerificationSessionResponse {
    if (json == null) {
        return json;
    }
    return {
        sessionId: json["sessionId"],
        launchUrl: json["launchUrl"],
    };
}

export function CreateVerificationSessionResponseToJSON(
    value?: CreateVerificationSessionResponse | null,
): any {
    if (value == null) {
        return value;
    }
    return {
        sessionId: value["sessionId"],
        launchUrl: value["launchUrl"],
    };
}
