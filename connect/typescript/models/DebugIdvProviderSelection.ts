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


/**
 * 
 * @export
 */
export const DebugIdvProviderSelection = {
    Default: 'Default',
    IdVerse: 'IdVerse',
    Argos: 'Argos',
    Clear: 'Clear',
    Yoti: 'Yoti',
    EidEasy: 'EidEasy'
} as const;
export type DebugIdvProviderSelection = typeof DebugIdvProviderSelection[keyof typeof DebugIdvProviderSelection];


export function instanceOfDebugIdvProviderSelection(value: any): boolean {
    for (const key in DebugIdvProviderSelection) {
        if (Object.prototype.hasOwnProperty.call(DebugIdvProviderSelection, key)) {
            if ((DebugIdvProviderSelection as Record<string, DebugIdvProviderSelection>)[key] === value) {
                return true;
            }
        }
    }
    return false;
}

export function DebugIdvProviderSelectionFromJSON(json: any): DebugIdvProviderSelection {
    return DebugIdvProviderSelectionFromJSONTyped(json, false);
}

export function DebugIdvProviderSelectionFromJSONTyped(json: any, ignoreDiscriminator: boolean): DebugIdvProviderSelection {
    return json as DebugIdvProviderSelection;
}

export function DebugIdvProviderSelectionToJSON(value?: DebugIdvProviderSelection | null): any {
    return value as any;
}

