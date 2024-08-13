/*
 * Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Net.Http;
using Trinsic.Connect.Client;

namespace Trinsic.Connect.Api;

/// <summary>
/// Represents a collection of functions to interact with the API endpoints
/// </summary>
public interface IAttachmentsApiSync : IApiAccessor
{
    #region Synchronous Operations
    /// <summary>
    /// Exchange an Attachment Access Key (from &#x60;IdentityData.Attachments&#x60;) for the raw contents of the linked resource.                Use this API to fetch document (front, back, portrait) or other (selfie) images from a verification, if relevant.
    /// </summary>
    /// <exception cref="Trinsic.Connect.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="attachmentAccessKey"> (optional)</param>
    /// <returns></returns>
    void GetAttachment(string? attachmentAccessKey = default(string?));

    /// <summary>
    /// Exchange an Attachment Access Key (from &#x60;IdentityData.Attachments&#x60;) for the raw contents of the linked resource.                Use this API to fetch document (front, back, portrait) or other (selfie) images from a verification, if relevant.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <exception cref="Trinsic.Connect.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="attachmentAccessKey"> (optional)</param>
    /// <returns>ApiResponse of Object(void)</returns>
    ApiResponse<object> GetAttachmentWithHttpInfo(string? attachmentAccessKey = default(string?));
    #endregion Synchronous Operations
}

/// <summary>
/// Represents a collection of functions to interact with the API endpoints
/// </summary>
public interface IAttachmentsApiAsync : IApiAccessor
{
    #region Asynchronous Operations
    /// <summary>
    /// Exchange an Attachment Access Key (from &#x60;IdentityData.Attachments&#x60;) for the raw contents of the linked resource.                Use this API to fetch document (front, back, portrait) or other (selfie) images from a verification, if relevant.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <exception cref="Trinsic.Connect.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="attachmentAccessKey"> (optional)</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of void</returns>
    System.Threading.Tasks.Task GetAttachmentAsync(string? attachmentAccessKey = default(string?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

    /// <summary>
    /// Exchange an Attachment Access Key (from &#x60;IdentityData.Attachments&#x60;) for the raw contents of the linked resource.                Use this API to fetch document (front, back, portrait) or other (selfie) images from a verification, if relevant.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <exception cref="Trinsic.Connect.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="attachmentAccessKey"> (optional)</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of ApiResponse</returns>
    System.Threading.Tasks.Task<ApiResponse<object>> GetAttachmentWithHttpInfoAsync(string? attachmentAccessKey = default(string?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
    #endregion Asynchronous Operations
}

/// <summary>
/// Represents a collection of functions to interact with the API endpoints
/// </summary>
public interface IAttachmentsApi : IAttachmentsApiSync, IAttachmentsApiAsync
{

}

/// <summary>
/// Represents a collection of functions to interact with the API endpoints
/// </summary>
public partial class AttachmentsApi : IDisposable, IAttachmentsApi
{
    private Trinsic.Connect.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

    /// <summary>
    /// Initializes a new instance of the <see cref="AttachmentsApi"/> class.
    /// **IMPORTANT** This will also create an instance of HttpClient, which is less than ideal.
    /// It's better to reuse the <see href="https://docs.microsoft.com/en-us/dotnet/architecture/microservices/implement-resilient-applications/use-httpclientfactory-to-implement-resilient-http-requests#issues-with-the-original-httpclient-class-available-in-net">HttpClient and HttpClientHandler</see>.
    /// </summary>
    /// <returns></returns>
    public AttachmentsApi() : this((string)null)
    {
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="AttachmentsApi"/> class.
    /// **IMPORTANT** This will also create an instance of HttpClient, which is less than ideal.
    /// It's better to reuse the <see href="https://docs.microsoft.com/en-us/dotnet/architecture/microservices/implement-resilient-applications/use-httpclientfactory-to-implement-resilient-http-requests#issues-with-the-original-httpclient-class-available-in-net">HttpClient and HttpClientHandler</see>.
    /// </summary>
    /// <param name="basePath">The target service's base path in URL format.</param>
    /// <exception cref="ArgumentException"></exception>
    /// <returns></returns>
    public AttachmentsApi(string basePath)
    {
        Configuration = Trinsic.Connect.Client.Configuration.MergeConfigurations(
            Trinsic.Connect.Client.GlobalConfiguration.Instance,
            new Trinsic.Connect.Client.Configuration { BasePath = basePath }
        );
        ApiClient = new Trinsic.Connect.Client.ApiClient(Configuration.BasePath);
        Client = ApiClient;
        AsynchronousClient = ApiClient;
        ExceptionFactory = Trinsic.Connect.Client.Configuration.DefaultExceptionFactory;
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="AttachmentsApi"/> class using Configuration object.
    /// **IMPORTANT** This will also create an instance of HttpClient, which is less than ideal.
    /// It's better to reuse the <see href="https://docs.microsoft.com/en-us/dotnet/architecture/microservices/implement-resilient-applications/use-httpclientfactory-to-implement-resilient-http-requests#issues-with-the-original-httpclient-class-available-in-net">HttpClient and HttpClientHandler</see>.
    /// </summary>
    /// <param name="configuration">An instance of Configuration.</param>
    /// <exception cref="ArgumentNullException"></exception>
    /// <returns></returns>
    public AttachmentsApi(Trinsic.Connect.Client.Configuration configuration)
    {
        if (configuration == null)
        {
            throw new ArgumentNullException("configuration");
        }

        Configuration = Trinsic.Connect.Client.Configuration.MergeConfigurations(
            Trinsic.Connect.Client.GlobalConfiguration.Instance,
            configuration
        );
        ApiClient = new Trinsic.Connect.Client.ApiClient(Configuration.BasePath);
        Client = ApiClient;
        AsynchronousClient = ApiClient;
        ExceptionFactory = Trinsic.Connect.Client.Configuration.DefaultExceptionFactory;
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="AttachmentsApi"/> class.
    /// </summary>
    /// <param name="client">An instance of HttpClient.</param>
    /// <param name="handler">An optional instance of HttpClientHandler that is used by HttpClient.</param>
    /// <exception cref="ArgumentNullException"></exception>
    /// <returns></returns>
    /// <remarks>
    /// Some configuration settings will not be applied without passing an HttpClientHandler.
    /// The features affected are: Setting and Retrieving Cookies, Client Certificates, Proxy settings.
    /// </remarks>
    public AttachmentsApi(HttpClient client, HttpClientHandler handler = null) : this(client, (string)null, handler)
    {
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="AttachmentsApi"/> class.
    /// </summary>
    /// <param name="client">An instance of HttpClient.</param>
    /// <param name="basePath">The target service's base path in URL format.</param>
    /// <param name="handler">An optional instance of HttpClientHandler that is used by HttpClient.</param>
    /// <exception cref="ArgumentNullException"></exception>
    /// <exception cref="ArgumentException"></exception>
    /// <returns></returns>
    /// <remarks>
    /// Some configuration settings will not be applied without passing an HttpClientHandler.
    /// The features affected are: Setting and Retrieving Cookies, Client Certificates, Proxy settings.
    /// </remarks>
    public AttachmentsApi(HttpClient client, string basePath, HttpClientHandler handler = null)
    {
        if (client == null)
        {
            throw new ArgumentNullException("client");
        }

        Configuration = Trinsic.Connect.Client.Configuration.MergeConfigurations(
            Trinsic.Connect.Client.GlobalConfiguration.Instance,
            new Trinsic.Connect.Client.Configuration { BasePath = basePath }
        );
        ApiClient = new Trinsic.Connect.Client.ApiClient(client, Configuration.BasePath, handler);
        Client = ApiClient;
        AsynchronousClient = ApiClient;
        ExceptionFactory = Trinsic.Connect.Client.Configuration.DefaultExceptionFactory;
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="AttachmentsApi"/> class using Configuration object.
    /// </summary>
    /// <param name="client">An instance of HttpClient.</param>
    /// <param name="configuration">An instance of Configuration.</param>
    /// <param name="handler">An optional instance of HttpClientHandler that is used by HttpClient.</param>
    /// <exception cref="ArgumentNullException"></exception>
    /// <returns></returns>
    /// <remarks>
    /// Some configuration settings will not be applied without passing an HttpClientHandler.
    /// The features affected are: Setting and Retrieving Cookies, Client Certificates, Proxy settings.
    /// </remarks>
    public AttachmentsApi(HttpClient client, Trinsic.Connect.Client.Configuration configuration, HttpClientHandler handler = null)
    {
        if (configuration == null)
        {
            throw new ArgumentNullException("configuration");
        }

        if (client == null)
        {
            throw new ArgumentNullException("client");
        }

        Configuration = Trinsic.Connect.Client.Configuration.MergeConfigurations(
            Trinsic.Connect.Client.GlobalConfiguration.Instance,
            configuration
        );
        ApiClient = new Trinsic.Connect.Client.ApiClient(client, Configuration.BasePath, handler);
        Client = ApiClient;
        AsynchronousClient = ApiClient;
        ExceptionFactory = Trinsic.Connect.Client.Configuration.DefaultExceptionFactory;
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="AttachmentsApi"/> class
    /// using a Configuration object and client instance.
    /// </summary>
    /// <param name="client">The client interface for synchronous API access.</param>
    /// <param name="asyncClient">The client interface for asynchronous API access.</param>
    /// <param name="configuration">The configuration object.</param>
    /// <exception cref="ArgumentNullException"></exception>
    public AttachmentsApi(Trinsic.Connect.Client.ISynchronousClient client, Trinsic.Connect.Client.IAsynchronousClient asyncClient, Trinsic.Connect.Client.IReadableConfiguration configuration)
    {
        Client = client ?? throw new ArgumentNullException("client");
        AsynchronousClient = asyncClient ?? throw new ArgumentNullException("asyncClient");
        Configuration = configuration ?? throw new ArgumentNullException("configuration");
        ExceptionFactory = Trinsic.Connect.Client.Configuration.DefaultExceptionFactory;
    }

    /// <summary>
    /// Disposes resources if they were created by us
    /// </summary>
    public void Dispose()
    {
        ApiClient?.Dispose();
    }

    /// <summary>
    /// Holds the ApiClient if created
    /// </summary>
    public Trinsic.Connect.Client.ApiClient ApiClient { get; set; } = null;

    /// <summary>
    /// The client for accessing this underlying API asynchronously.
    /// </summary>
    public Trinsic.Connect.Client.IAsynchronousClient AsynchronousClient { get; set; }

    /// <summary>
    /// The client for accessing this underlying API synchronously.
    /// </summary>
    public Trinsic.Connect.Client.ISynchronousClient Client { get; set; }

    /// <summary>
    /// Gets the base path of the API client.
    /// </summary>
    /// <value>The base path</value>
    public string GetBasePath()
    {
        return Configuration.BasePath;
    }

    /// <summary>
    /// Gets or sets the configuration object
    /// </summary>
    /// <value>An instance of the Configuration</value>
    public Trinsic.Connect.Client.IReadableConfiguration Configuration { get; set; }

    /// <summary>
    /// Provides a factory method hook for the creation of exceptions.
    /// </summary>
    public Trinsic.Connect.Client.ExceptionFactory ExceptionFactory
    {
        get
        {
            if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
            {
                throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
            }

            return _exceptionFactory;
        }
        set => _exceptionFactory = value;
    }

    /// <summary>
    /// Exchange an Attachment Access Key (from &#x60;IdentityData.Attachments&#x60;) for the raw contents of the linked resource.                Use this API to fetch document (front, back, portrait) or other (selfie) images from a verification, if relevant. 
    /// </summary>
    /// <exception cref="Trinsic.Connect.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="attachmentAccessKey"> (optional)</param>
    /// <returns></returns>
    public void GetAttachment(string? attachmentAccessKey = default(string?))
    {
        GetAttachmentWithHttpInfo(attachmentAccessKey);
    }

    /// <summary>
    /// Exchange an Attachment Access Key (from &#x60;IdentityData.Attachments&#x60;) for the raw contents of the linked resource.                Use this API to fetch document (front, back, portrait) or other (selfie) images from a verification, if relevant. 
    /// </summary>
    /// <exception cref="Trinsic.Connect.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="attachmentAccessKey"> (optional)</param>
    /// <returns>ApiResponse of Object(void)</returns>
    public Trinsic.Connect.Client.ApiResponse<Object> GetAttachmentWithHttpInfo(string? attachmentAccessKey = default(string?))
    {
        var localVarRequestOptions = new Trinsic.Connect.Client.RequestOptions();

        var _contentTypes = new string[] {
        };

        // to determine the Accept header
        var _accepts = new string[] {
            "application/json"
        };

        var localVarContentType = Trinsic.Connect.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
        if (localVarContentType != null)
        {
            localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
        }

        var localVarAccept = Trinsic.Connect.Client.ClientUtils.SelectHeaderAccept(_accepts);
        if (localVarAccept != null)
        {
            localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
        }

        if (attachmentAccessKey != null)
        {
            localVarRequestOptions.QueryParameters.Add(Trinsic.Connect.Client.ClientUtils.ParameterToMultiMap("", "attachmentAccessKey", attachmentAccessKey));
        }

        // authentication (Bearer) required
        // bearer authentication required
        if (!string.IsNullOrEmpty(Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
        {
            localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + Configuration.AccessToken);
        }

        // make the HTTP request
        var localVarResponse = Client.Get<object>("/api/v1/attachments/fetch", localVarRequestOptions, Configuration);

        if (ExceptionFactory != null)
        {
            var _exception = ExceptionFactory("GetAttachment", localVarResponse);
            if (_exception != null)
            {
                throw _exception;
            }
        }

        return localVarResponse;
    }

    /// <summary>
    /// Exchange an Attachment Access Key (from &#x60;IdentityData.Attachments&#x60;) for the raw contents of the linked resource.                Use this API to fetch document (front, back, portrait) or other (selfie) images from a verification, if relevant. 
    /// </summary>
    /// <exception cref="Trinsic.Connect.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="attachmentAccessKey"> (optional)</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of void</returns>
    public async System.Threading.Tasks.Task GetAttachmentAsync(string? attachmentAccessKey = default(string?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
    {
        await GetAttachmentWithHttpInfoAsync(attachmentAccessKey, cancellationToken).ConfigureAwait(false);
    }

    /// <summary>
    /// Exchange an Attachment Access Key (from &#x60;IdentityData.Attachments&#x60;) for the raw contents of the linked resource.                Use this API to fetch document (front, back, portrait) or other (selfie) images from a verification, if relevant. 
    /// </summary>
    /// <exception cref="Trinsic.Connect.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="attachmentAccessKey"> (optional)</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of ApiResponse</returns>
    public async System.Threading.Tasks.Task<Trinsic.Connect.Client.ApiResponse<Object>> GetAttachmentWithHttpInfoAsync(string? attachmentAccessKey = default(string?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
    {

        var localVarRequestOptions = new Trinsic.Connect.Client.RequestOptions();

        var _contentTypes = new string[] {
        };

        // to determine the Accept header
        var _accepts = new string[] {
            "application/json"
        };

        var localVarContentType = Trinsic.Connect.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
        if (localVarContentType != null)
        {
            localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
        }

        var localVarAccept = Trinsic.Connect.Client.ClientUtils.SelectHeaderAccept(_accepts);
        if (localVarAccept != null)
        {
            localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
        }

        if (attachmentAccessKey != null)
        {
            localVarRequestOptions.QueryParameters.Add(Trinsic.Connect.Client.ClientUtils.ParameterToMultiMap("", "attachmentAccessKey", attachmentAccessKey));
        }

        // authentication (Bearer) required
        // bearer authentication required
        if (!string.IsNullOrEmpty(Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
        {
            localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + Configuration.AccessToken);
        }

        // make the HTTP request

        var localVarResponse = await AsynchronousClient.GetAsync<object>("/api/v1/attachments/fetch", localVarRequestOptions, Configuration, cancellationToken).ConfigureAwait(false);

        if (ExceptionFactory != null)
        {
            var _exception = ExceptionFactory("GetAttachment", localVarResponse);
            if (_exception != null)
            {
                throw _exception;
            }
        }

        return localVarResponse;
    }
}
