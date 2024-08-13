/*
 * Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Runtime.Serialization;
using System.Text;
using Newtonsoft.Json;

namespace Trinsic.Connect.Model;

/// <summary>
/// ExchangeResultsKeyResponse
/// </summary>
[DataContract(Name = "ExchangeResultsKeyResponse")]
public partial class ExchangeResultsKeyResponse
{
    /// <summary>
    /// Initializes a new instance of the <see cref="ExchangeResultsKeyResponse" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected ExchangeResultsKeyResponse() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="ExchangeResultsKeyResponse" /> class.
    /// </summary>
    /// <param name="session">session (required).</param>
    /// <param name="identityData">identityData.</param>
    public ExchangeResultsKeyResponse(Session session = default(Session), IdentityData identityData = default(IdentityData))
    {
        Session = session ?? throw new ArgumentNullException("session is a required property for ExchangeResultsKeyResponse and cannot be null");
        IdentityData = identityData;
    }

    /// <summary>
    /// Gets or Sets Session
    /// </summary>
    [DataMember(Name = "session", IsRequired = true, EmitDefaultValue = true)]
    public Session Session { get; set; }

    /// <summary>
    /// Gets or Sets IdentityData
    /// </summary>
    [DataMember(Name = "identityData", EmitDefaultValue = false)]
    public IdentityData IdentityData { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
        var sb = new StringBuilder();
        sb.Append("class ExchangeResultsKeyResponse {\n");
        sb.Append("  Session: ").Append(Session).Append("\n");
        sb.Append("  IdentityData: ").Append(IdentityData).Append("\n");
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
