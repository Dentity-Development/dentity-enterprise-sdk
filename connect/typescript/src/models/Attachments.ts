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
 * Attachment Access Keys for attachments (eg document / selfie images)
 * @export
 * @interface Attachments
 */
export interface Attachments {
    /**
     * Key to access the selfie image (if relevant) for this verification
     * @type {string}
     * @memberof Attachments
     */
    selfie?: string;
    /**
     * Key to access the document front image (if relevant) for this verification
     * @type {string}
     * @memberof Attachments
     */
    documentFront?: string;
    /**
     * Key to access the document back image (if relevant) for this verification
     * @type {string}
     * @memberof Attachments
     */
    documentBack?: string;
    /**
     * Key to access the document portrait image (if relevant and available) for this verification.
     *
     * Specifically, this is a cropped version of the document front image which includes only the portrait on the document.
     * @type {string}
     * @memberof Attachments
     */
    documentPortrait?: string;
}

/**
 * Check if a given object implements the Attachments interface.
 */
export function instanceOfAttachments(value: object): value is Attachments {
    return true;
}

export function AttachmentsFromJSON(json: any): Attachments {
    return AttachmentsFromJSONTyped(json, false);
}

export function AttachmentsFromJSONTyped(
    json: any,
    ignoreDiscriminator: boolean,
): Attachments {
    if (json == null) {
        return json;
    }
    return {
        selfie: json["selfie"] == null ? undefined : json["selfie"],
        documentFront:
            json["documentFront"] == null ? undefined : json["documentFront"],
        documentBack:
            json["documentBack"] == null ? undefined : json["documentBack"],
        documentPortrait:
            json["documentPortrait"] == null
                ? undefined
                : json["documentPortrait"],
    };
}

export function AttachmentsToJSON(value?: Attachments | null): any {
    if (value == null) {
        return value;
    }
    return {
        selfie: value["selfie"],
        documentFront: value["documentFront"],
        documentBack: value["documentBack"],
        documentPortrait: value["documentPortrait"],
    };
}