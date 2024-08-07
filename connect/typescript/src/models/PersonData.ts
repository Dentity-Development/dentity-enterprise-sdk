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
import type { Address } from "./Address";
import {
    AddressFromJSON,
    AddressFromJSONTyped,
    AddressToJSON,
} from "./Address";

/**
 *
 * @export
 * @interface PersonData
 */
export interface PersonData {
    /**
     *
     * @type {string}
     * @memberof PersonData
     */
    givenName?: string;
    /**
     *
     * @type {string}
     * @memberof PersonData
     */
    familyName?: string;
    /**
     *
     * @type {string}
     * @memberof PersonData
     */
    middleName?: string;
    /**
     *
     * @type {string}
     * @memberof PersonData
     */
    fullName?: string;
    /**
     *
     * @type {string}
     * @memberof PersonData
     */
    nationality?: string;
    /**
     *
     * @type {string}
     * @memberof PersonData
     */
    gender?: string;
    /**
     *
     * @type {string}
     * @memberof PersonData
     */
    phoneNumber?: string;
    /**
     *
     * @type {Address}
     * @memberof PersonData
     */
    address?: Address;
    /**
     *
     * @type {string}
     * @memberof PersonData
     */
    dateOfBirth?: string;
}

/**
 * Check if a given object implements the PersonData interface.
 */
export function instanceOfPersonData(value: object): value is PersonData {
    return true;
}

export function PersonDataFromJSON(json: any): PersonData {
    return PersonDataFromJSONTyped(json, false);
}

export function PersonDataFromJSONTyped(
    json: any,
    ignoreDiscriminator: boolean,
): PersonData {
    if (json == null) {
        return json;
    }
    return {
        givenName: json["givenName"] == null ? undefined : json["givenName"],
        familyName: json["familyName"] == null ? undefined : json["familyName"],
        middleName: json["middleName"] == null ? undefined : json["middleName"],
        fullName: json["fullName"] == null ? undefined : json["fullName"],
        nationality:
            json["nationality"] == null ? undefined : json["nationality"],
        gender: json["gender"] == null ? undefined : json["gender"],
        phoneNumber:
            json["phoneNumber"] == null ? undefined : json["phoneNumber"],
        address:
            json["address"] == null
                ? undefined
                : AddressFromJSON(json["address"]),
        dateOfBirth:
            json["dateOfBirth"] == null ? undefined : json["dateOfBirth"],
    };
}

export function PersonDataToJSON(value?: PersonData | null): any {
    if (value == null) {
        return value;
    }
    return {
        givenName: value["givenName"],
        familyName: value["familyName"],
        middleName: value["middleName"],
        fullName: value["fullName"],
        nationality: value["nationality"],
        gender: value["gender"],
        phoneNumber: value["phoneNumber"],
        address: AddressToJSON(value["address"]),
        dateOfBirth: value["dateOfBirth"],
    };
}