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
import type { DisclosedFields } from "./DisclosedFields";
import {
    DisclosedFieldsFromJSON,
    DisclosedFieldsFromJSONTyped,
    DisclosedFieldsToJSON,
} from "./DisclosedFields";
import type { VerificationState } from "./VerificationState";
import {
    VerificationStateFromJSON,
    VerificationStateFromJSONTyped,
    VerificationStateToJSON,
} from "./VerificationState";
import type { IdentityData } from "./IdentityData";
import {
    IdentityDataFromJSON,
    IdentityDataFromJSONTyped,
    IdentityDataToJSON,
} from "./IdentityData";
import type { VerificationFailCode } from "./VerificationFailCode";
import {
    VerificationFailCodeFromJSON,
    VerificationFailCodeFromJSONTyped,
    VerificationFailCodeToJSON,
} from "./VerificationFailCode";

/**
 *
 * @export
 * @interface Verification
 */
export interface Verification {
    /**
     *
     * @type {string}
     * @memberof Verification
     */
    id: string;
    /**
     *
     * @type {VerificationState}
     * @memberof Verification
     */
    state: VerificationState;
    /**
     *
     * @type {VerificationFailCode}
     * @memberof Verification
     */
    failCode?: VerificationFailCode;
    /**
     *
     * @type {boolean}
     * @memberof Verification
     */
    reused: boolean;
    /**
     *
     * @type {number}
     * @memberof Verification
     */
    updated: number;
    /**
     *
     * @type {DisclosedFields}
     * @memberof Verification
     */
    disclosedFields: DisclosedFields;
    /**
     *
     * @type {IdentityData}
     * @memberof Verification
     */
    identityData?: IdentityData;
}

/**
 * Check if a given object implements the Verification interface.
 */
export function instanceOfVerification(value: object): value is Verification {
    if (!("id" in value) || value["id"] === undefined) return false;
    if (!("state" in value) || value["state"] === undefined) return false;
    if (!("reused" in value) || value["reused"] === undefined) return false;
    if (!("updated" in value) || value["updated"] === undefined) return false;
    if (!("disclosedFields" in value) || value["disclosedFields"] === undefined)
        return false;
    return true;
}

export function VerificationFromJSON(json: any): Verification {
    return VerificationFromJSONTyped(json, false);
}

export function VerificationFromJSONTyped(
    json: any,
    ignoreDiscriminator: boolean,
): Verification {
    if (json == null) {
        return json;
    }
    return {
        id: json["id"],
        state: VerificationStateFromJSON(json["state"]),
        failCode:
            json["failCode"] == null
                ? undefined
                : VerificationFailCodeFromJSON(json["failCode"]),
        reused: json["reused"],
        updated: json["updated"],
        disclosedFields: DisclosedFieldsFromJSON(json["disclosedFields"]),
        identityData:
            json["identityData"] == null
                ? undefined
                : IdentityDataFromJSON(json["identityData"]),
    };
}

export function VerificationToJSON(value?: Verification | null): any {
    if (value == null) {
        return value;
    }
    return {
        id: value["id"],
        state: VerificationStateToJSON(value["state"]),
        failCode: VerificationFailCodeToJSON(value["failCode"]),
        reused: value["reused"],
        updated: value["updated"],
        disclosedFields: DisclosedFieldsToJSON(value["disclosedFields"]),
        identityData: IdentityDataToJSON(value["identityData"]),
    };
}
