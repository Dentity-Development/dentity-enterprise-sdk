/*
 * Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System.Collections.Generic;
using System.Runtime.Serialization;
using System.Text;
using Newtonsoft.Json;

namespace Trinsic.Connect.Model;

/// <summary>
/// CreateSessionRequest
/// </summary>
[DataContract(Name = "CreateSessionRequest")]
public partial class CreateSessionRequest
{
    /// <summary>
    /// Initializes a new instance of the <see cref="CreateSessionRequest" /> class.
    /// </summary>
    /// <param name="governmentIdOptions">governmentIdOptions.</param>
    public CreateSessionRequest(GovernmentIDOptionsRequest governmentIdOptions = default(GovernmentIDOptionsRequest))
    {
        GovernmentIdOptions = governmentIdOptions;
        AdditionalProperties = new Dictionary<string, object>();
    }

    /// <summary>
    /// Gets or Sets GovernmentIdOptions
    /// </summary>
    [DataMember(Name = "governmentIdOptions", EmitDefaultValue = false)]
    public GovernmentIDOptionsRequest GovernmentIdOptions { get; set; }

    /// <summary>
    /// Gets or Sets additional properties
    /// </summary>
    [JsonExtensionData]
    public IDictionary<string, object> AdditionalProperties { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
        var sb = new StringBuilder();
        sb.Append("class CreateSessionRequest {\n");
        sb.Append("  GovernmentIdOptions: ").Append(GovernmentIdOptions).Append("\n");
        sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
        sb.Append("}\n");
        return sb.ToString();
    }

    /// <summary>
    /// Returns the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public virtual string ToJson()
    {
        return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }
}
