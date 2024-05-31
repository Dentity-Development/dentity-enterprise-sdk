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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface NormalizedGovernmentIdData
 */
export interface NormalizedGovernmentIdData {
    /**
     * 
     * @type {string}
     * @memberof NormalizedGovernmentIdData
     */
    idNumber?: string;
    /**
     * 
     * @type {string}
     * @memberof NormalizedGovernmentIdData
     */
    givenName?: string;
    /**
     * 
     * @type {string}
     * @memberof NormalizedGovernmentIdData
     */
    familyName?: string;
    /**
     * 
     * @type {string}
     * @memberof NormalizedGovernmentIdData
     */
    address?: string;
    /**
     * 
     * @type {string}
     * @memberof NormalizedGovernmentIdData
     */
    dateOfBirth?: string;
    /**
     * 
     * @type {string}
     * @memberof NormalizedGovernmentIdData
     */
    country?: string;
    /**
     * 
     * @type {string}
     * @memberof NormalizedGovernmentIdData
     */
    issueDate?: string;
    /**
     * 
     * @type {string}
     * @memberof NormalizedGovernmentIdData
     */
    expirationDate?: string;
}

/**
 * Check if a given object implements the NormalizedGovernmentIdData interface.
 */
export function instanceOfNormalizedGovernmentIdData(value: object): value is NormalizedGovernmentIdData {
    return true;
}

export function NormalizedGovernmentIdDataFromJSON(json: any): NormalizedGovernmentIdData {
    return NormalizedGovernmentIdDataFromJSONTyped(json, false);
}

export function NormalizedGovernmentIdDataFromJSONTyped(json: any, ignoreDiscriminator: boolean): NormalizedGovernmentIdData {
    if (json == null) {
        return json;
    }
    return {
        
        'idNumber': json['idNumber'] == null ? undefined : json['idNumber'],
        'givenName': json['givenName'] == null ? undefined : json['givenName'],
        'familyName': json['familyName'] == null ? undefined : json['familyName'],
        'address': json['address'] == null ? undefined : json['address'],
        'dateOfBirth': json['dateOfBirth'] == null ? undefined : json['dateOfBirth'],
        'country': json['country'] == null ? undefined : json['country'],
        'issueDate': json['issueDate'] == null ? undefined : json['issueDate'],
        'expirationDate': json['expirationDate'] == null ? undefined : json['expirationDate'],
    };
}

export function NormalizedGovernmentIdDataToJSON(value?: NormalizedGovernmentIdData | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'idNumber': value['idNumber'],
        'givenName': value['givenName'],
        'familyName': value['familyName'],
        'address': value['address'],
        'dateOfBirth': value['dateOfBirth'],
        'country': value['country'],
        'issueDate': value['issueDate'],
        'expirationDate': value['expirationDate'],
    };
}

