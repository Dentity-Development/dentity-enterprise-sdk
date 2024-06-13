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
import type { Session } from "./Session";
import {
    SessionFromJSON,
    SessionFromJSONTyped,
    SessionToJSON,
} from "./Session";

/**
 *
 * @export
 * @interface ListSessionsResponseV1
 */
export interface ListSessionsResponseV1 {
    /**
     *
     * @type {number}
     * @memberof ListSessionsResponseV1
     */
    total?: number;
    /**
     *
     * @type {boolean}
     * @memberof ListSessionsResponseV1
     */
    more?: boolean;
    /**
     *
     * @type {Array<Session>}
     * @memberof ListSessionsResponseV1
     */
    sessions?: Array<Session> | null;
}

/**
 * Check if a given object implements the ListSessionsResponseV1 interface.
 */
export function instanceOfListSessionsResponseV1(
    value: object,
): value is ListSessionsResponseV1 {
    return true;
}

export function ListSessionsResponseV1FromJSON(
    json: any,
): ListSessionsResponseV1 {
    return ListSessionsResponseV1FromJSONTyped(json, false);
}

export function ListSessionsResponseV1FromJSONTyped(
    json: any,
    ignoreDiscriminator: boolean,
): ListSessionsResponseV1 {
    if (json == null) {
        return json;
    }
    return {
        total: json["total"] == null ? undefined : json["total"],
        more: json["more"] == null ? undefined : json["more"],
        sessions:
            json["sessions"] == null
                ? undefined
                : (json["sessions"] as Array<any>).map(SessionFromJSON),
    };
}

export function ListSessionsResponseV1ToJSON(
    value?: ListSessionsResponseV1 | null,
): any {
    if (value == null) {
        return value;
    }
    return {
        total: value["total"],
        more: value["more"],
        sessions:
            value["sessions"] == null
                ? undefined
                : (value["sessions"] as Array<any>).map(SessionToJSON),
    };
}
