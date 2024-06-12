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
    /// CancelSessionResponse
    /// </summary>
    [DataContract(Name = "CancelSessionResponse")]
    public partial class CancelSessionResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CancelSessionResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CancelSessionResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CancelSessionResponse" /> class.
        /// </summary>
        /// <param name="session">session (required).</param>
        public CancelSessionResponse(Session session = default(Session))
        {
            // to ensure "session" is required (not null)
            if (session == null)
            {
                throw new ArgumentNullException("session is a required property for CancelSessionResponse and cannot be null");
            }
            this.Session = session;
        }

        /// <summary>
        /// Gets or Sets Session
        /// </summary>
        [DataMember(Name = "session", IsRequired = true, EmitDefaultValue = true)]
        public Session Session { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CancelSessionResponse {\n");
            sb.Append("  Session: ").Append(Session).Append("\n");
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
