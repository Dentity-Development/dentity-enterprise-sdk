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
    /// NormalizedGovernmentIdData
    /// </summary>
    [DataContract(Name = "NormalizedGovernmentIdData")]
    public partial class NormalizedGovernmentIdData
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NormalizedGovernmentIdData" /> class.
        /// </summary>
        /// <param name="idNumber">idNumber.</param>
        /// <param name="givenName">givenName.</param>
        /// <param name="familyName">familyName.</param>
        /// <param name="address">address.</param>
        /// <param name="dateOfBirth">dateOfBirth.</param>
        /// <param name="country">country.</param>
        /// <param name="issueDate">issueDate.</param>
        /// <param name="expirationDate">expirationDate.</param>
        public NormalizedGovernmentIdData(string idNumber = default(string), string givenName = default(string), string familyName = default(string), string address = default(string), string dateOfBirth = default(string), string country = default(string), string issueDate = default(string), string expirationDate = default(string))
        {
            this.IdNumber = idNumber;
            this.GivenName = givenName;
            this.FamilyName = familyName;
            this.Address = address;
            this.DateOfBirth = dateOfBirth;
            this.Country = country;
            this.IssueDate = issueDate;
            this.ExpirationDate = expirationDate;
        }

        /// <summary>
        /// Gets or Sets IdNumber
        /// </summary>
        [DataMember(Name = "idNumber", EmitDefaultValue = true)]
        public string IdNumber { get; set; }

        /// <summary>
        /// Gets or Sets GivenName
        /// </summary>
        [DataMember(Name = "givenName", EmitDefaultValue = true)]
        public string GivenName { get; set; }

        /// <summary>
        /// Gets or Sets FamilyName
        /// </summary>
        [DataMember(Name = "familyName", EmitDefaultValue = true)]
        public string FamilyName { get; set; }

        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name = "address", EmitDefaultValue = true)]
        public string Address { get; set; }

        /// <summary>
        /// Gets or Sets DateOfBirth
        /// </summary>
        [DataMember(Name = "dateOfBirth", EmitDefaultValue = true)]
        public string DateOfBirth { get; set; }

        /// <summary>
        /// Gets or Sets Country
        /// </summary>
        [DataMember(Name = "country", EmitDefaultValue = true)]
        public string Country { get; set; }

        /// <summary>
        /// Gets or Sets IssueDate
        /// </summary>
        [DataMember(Name = "issueDate", EmitDefaultValue = true)]
        public string IssueDate { get; set; }

        /// <summary>
        /// Gets or Sets ExpirationDate
        /// </summary>
        [DataMember(Name = "expirationDate", EmitDefaultValue = true)]
        public string ExpirationDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NormalizedGovernmentIdData {\n");
            sb.Append("  IdNumber: ").Append(IdNumber).Append("\n");
            sb.Append("  GivenName: ").Append(GivenName).Append("\n");
            sb.Append("  FamilyName: ").Append(FamilyName).Append("\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  DateOfBirth: ").Append(DateOfBirth).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  IssueDate: ").Append(IssueDate).Append("\n");
            sb.Append("  ExpirationDate: ").Append(ExpirationDate).Append("\n");
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

}
