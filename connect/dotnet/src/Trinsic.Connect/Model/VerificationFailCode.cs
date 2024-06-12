/*
 * Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using FileParameter = Trinsic.Connect.Client.FileParameter;
using OpenAPIDateConverter = Trinsic.Connect.Client.OpenAPIDateConverter;

namespace Trinsic.Connect.Model
{
    /// <summary>
    /// Defines VerificationFailCode
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum VerificationFailCode
    {
        /// <summary>
        /// Enum VerificationFailNone for value: VerificationFailNone
        /// </summary>
        [EnumMember(Value = "VerificationFailNone")]
        VerificationFailNone = 1,

        /// <summary>
        /// Enum VerificationFailInternal for value: VerificationFailInternal
        /// </summary>
        [EnumMember(Value = "VerificationFailInternal")]
        VerificationFailInternal = 2,

        /// <summary>
        /// Enum VerificationFailInvalidImage for value: VerificationFailInvalidImage
        /// </summary>
        [EnumMember(Value = "VerificationFailInvalidImage")]
        VerificationFailInvalidImage = 3,

        /// <summary>
        /// Enum VerificationFailInauthentic for value: VerificationFailInauthentic
        /// </summary>
        [EnumMember(Value = "VerificationFailInauthentic")]
        VerificationFailInauthentic = 4,

        /// <summary>
        /// Enum VerificationFailUnsupportedDocument for value: VerificationFailUnsupportedDocument
        /// </summary>
        [EnumMember(Value = "VerificationFailUnsupportedDocument")]
        VerificationFailUnsupportedDocument = 5
    }

}
