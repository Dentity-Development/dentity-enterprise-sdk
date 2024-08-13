/*
 * Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System.Runtime.Serialization;
using System.Text;
using Newtonsoft.Json;

namespace Trinsic.Connect.Model;

/// <summary>
/// DisclosedFields
/// </summary>
[DataContract(Name = "DisclosedFields")]
public partial class DisclosedFields
{
    /// <summary>
    /// Initializes a new instance of the <see cref="DisclosedFields" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected DisclosedFields() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="DisclosedFields" /> class.
    /// </summary>
    /// <param name="idNumber">idNumber (required).</param>
    /// <param name="givenName">givenName (required).</param>
    /// <param name="familyName">familyName (required).</param>
    /// <param name="address">address (required).</param>
    /// <param name="dateOfBirth">dateOfBirth (required).</param>
    /// <param name="country">country (required).</param>
    /// <param name="issueDate">issueDate (required).</param>
    /// <param name="expirationDate">expirationDate (required).</param>
    /// <param name="documentFront">documentFront (required).</param>
    /// <param name="documentBack">documentBack (required).</param>
    /// <param name="documentPortrait">documentPortrait (required).</param>
    /// <param name="selfie">selfie (required).</param>
    public DisclosedFields(bool idNumber = default(bool), bool givenName = default(bool), bool familyName = default(bool), bool address = default(bool), bool dateOfBirth = default(bool), bool country = default(bool), bool issueDate = default(bool), bool expirationDate = default(bool), bool documentFront = default(bool), bool documentBack = default(bool), bool documentPortrait = default(bool), bool selfie = default(bool))
    {
        IdNumber = idNumber;
        GivenName = givenName;
        FamilyName = familyName;
        Address = address;
        DateOfBirth = dateOfBirth;
        Country = country;
        IssueDate = issueDate;
        ExpirationDate = expirationDate;
        DocumentFront = documentFront;
        DocumentBack = documentBack;
        DocumentPortrait = documentPortrait;
        Selfie = selfie;
    }

    /// <summary>
    /// Gets or Sets IdNumber
    /// </summary>
    [DataMember(Name = "idNumber", IsRequired = true, EmitDefaultValue = true)]
    public bool IdNumber { get; set; }

    /// <summary>
    /// Gets or Sets GivenName
    /// </summary>
    [DataMember(Name = "givenName", IsRequired = true, EmitDefaultValue = true)]
    public bool GivenName { get; set; }

    /// <summary>
    /// Gets or Sets FamilyName
    /// </summary>
    [DataMember(Name = "familyName", IsRequired = true, EmitDefaultValue = true)]
    public bool FamilyName { get; set; }

    /// <summary>
    /// Gets or Sets Address
    /// </summary>
    [DataMember(Name = "address", IsRequired = true, EmitDefaultValue = true)]
    public bool Address { get; set; }

    /// <summary>
    /// Gets or Sets DateOfBirth
    /// </summary>
    [DataMember(Name = "dateOfBirth", IsRequired = true, EmitDefaultValue = true)]
    public bool DateOfBirth { get; set; }

    /// <summary>
    /// Gets or Sets Country
    /// </summary>
    [DataMember(Name = "country", IsRequired = true, EmitDefaultValue = true)]
    public bool Country { get; set; }

    /// <summary>
    /// Gets or Sets IssueDate
    /// </summary>
    [DataMember(Name = "issueDate", IsRequired = true, EmitDefaultValue = true)]
    public bool IssueDate { get; set; }

    /// <summary>
    /// Gets or Sets ExpirationDate
    /// </summary>
    [DataMember(Name = "expirationDate", IsRequired = true, EmitDefaultValue = true)]
    public bool ExpirationDate { get; set; }

    /// <summary>
    /// Gets or Sets DocumentFront
    /// </summary>
    [DataMember(Name = "documentFront", IsRequired = true, EmitDefaultValue = true)]
    public bool DocumentFront { get; set; }

    /// <summary>
    /// Gets or Sets DocumentBack
    /// </summary>
    [DataMember(Name = "documentBack", IsRequired = true, EmitDefaultValue = true)]
    public bool DocumentBack { get; set; }

    /// <summary>
    /// Gets or Sets DocumentPortrait
    /// </summary>
    [DataMember(Name = "documentPortrait", IsRequired = true, EmitDefaultValue = true)]
    public bool DocumentPortrait { get; set; }

    /// <summary>
    /// Gets or Sets Selfie
    /// </summary>
    [DataMember(Name = "selfie", IsRequired = true, EmitDefaultValue = true)]
    public bool Selfie { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
        var sb = new StringBuilder();
        sb.Append("class DisclosedFields {\n");
        sb.Append("  IdNumber: ").Append(IdNumber).Append("\n");
        sb.Append("  GivenName: ").Append(GivenName).Append("\n");
        sb.Append("  FamilyName: ").Append(FamilyName).Append("\n");
        sb.Append("  Address: ").Append(Address).Append("\n");
        sb.Append("  DateOfBirth: ").Append(DateOfBirth).Append("\n");
        sb.Append("  Country: ").Append(Country).Append("\n");
        sb.Append("  IssueDate: ").Append(IssueDate).Append("\n");
        sb.Append("  ExpirationDate: ").Append(ExpirationDate).Append("\n");
        sb.Append("  DocumentFront: ").Append(DocumentFront).Append("\n");
        sb.Append("  DocumentBack: ").Append(DocumentBack).Append("\n");
        sb.Append("  DocumentPortrait: ").Append(DocumentPortrait).Append("\n");
        sb.Append("  Selfie: ").Append(Selfie).Append("\n");
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
