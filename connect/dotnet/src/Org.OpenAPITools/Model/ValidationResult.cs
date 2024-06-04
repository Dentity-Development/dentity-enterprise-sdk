/*
 * Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using System.Text;

namespace Org.OpenAPITools.Model;

/// <summary>
/// ValidationResult
/// </summary>
[DataContract(Name = "ValidationResult")]
public partial class ValidationResult : IValidatableObject
{
    /// <summary>
    /// Initializes a new instance of the <see cref="ValidationResult" /> class.
    /// </summary>
    /// <param name="errorMessage">errorMessage.</param>
    public ValidationResult(string errorMessage = default(string))
    {
        ErrorMessage = errorMessage;
    }

    /// <summary>
    /// Gets or Sets MemberNames
    /// </summary>
    [DataMember(Name = "memberNames", EmitDefaultValue = true)]
    public List<string> MemberNames { get; private set; }

    /// <summary>
    /// Returns false as MemberNames should not be serialized given that it's read-only.
    /// </summary>
    /// <returns>false (boolean)</returns>
    public static bool ShouldSerializeMemberNames()
    {
        return false;
    }
    /// <summary>
    /// Gets or Sets ErrorMessage
    /// </summary>
    [DataMember(Name = "errorMessage", EmitDefaultValue = true)]
    public string ErrorMessage { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
        var sb = new StringBuilder();
        sb.Append("class ValidationResult {\n");
        sb.Append("  MemberNames: ").Append(MemberNames).Append("\n");
        sb.Append("  ErrorMessage: ").Append(ErrorMessage).Append("\n");
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

    /// <summary>
    /// To validate all properties of the instance
    /// </summary>
    /// <param name="validationContext">Validation context</param>
    /// <returns>Validation Result</returns>
    IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
    {
        yield break;
    }
}