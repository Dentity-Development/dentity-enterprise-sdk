/// Account registration details
#[derive(::serde::Serialize, ::serde::Deserialize)]
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct AccountDetails {
    /// Account name
    #[prost(string, tag = "1")]
    pub name: ::prost::alloc::string::String,
    /// Email address of account.
    #[deprecated]
    #[prost(string, tag = "2")]
    pub email: ::prost::alloc::string::String,
    /// SMS number including country code
    #[deprecated]
    #[prost(string, tag = "3")]
    pub sms: ::prost::alloc::string::String,
}
/// Token protection info
#[derive(::serde::Serialize, ::serde::Deserialize)]
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct TokenProtection {
    /// Indicates if token is protected using a PIN,
    /// security code, HSM secret, etc.
    #[prost(bool, tag = "1")]
    pub enabled: bool,
    /// The method used to protect the token
    #[prost(enumeration = "ConfirmationMethod", tag = "2")]
    pub method: i32,
}
/// Device profile containing sensitive authentication data.
/// This information should be stored securely
#[derive(::serde::Serialize, ::serde::Deserialize)]
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct AccountProfile {
    /// The type of profile, used to differentiate between
    /// protocol schemes or versions
    #[prost(string, tag = "1")]
    pub profile_type: ::prost::alloc::string::String,
    /// Auth data containg information about the current device access
    #[prost(bytes = "vec", tag = "2")]
    pub auth_data: ::prost::alloc::vec::Vec<u8>,
    /// Secure token issued by server used to generate zero-knowledge proofs
    #[prost(bytes = "vec", tag = "3")]
    pub auth_token: ::prost::alloc::vec::Vec<u8>,
    /// Token security information about the token.
    /// If token protection is enabled, implementations must supply
    /// protection secret before using the token for authentication.
    #[prost(message, optional, tag = "4")]
    pub protection: ::core::option::Option<TokenProtection>,
}
/// Request for information about the account used to make the request
#[derive(::serde::Serialize, ::serde::Deserialize)]
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct AccountInfoRequest {}
/// Information about the account used to make the request
#[derive(::serde::Serialize, ::serde::Deserialize)]
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct AccountInfoResponse {
    /// The account details associated with
    /// the calling request context
    #[prost(message, optional, tag = "1")]
    pub details: ::core::option::Option<AccountDetails>,
    /// The wallet ID associated with this account
    #[prost(string, tag = "3")]
    pub wallet_id: ::prost::alloc::string::String,
    /// The device ID associated with this account session
    #[prost(string, tag = "4")]
    pub device_id: ::prost::alloc::string::String,
    /// The ecosystem ID within which this account resides
    #[prost(string, tag = "5")]
    pub ecosystem_id: ::prost::alloc::string::String,
    /// The public DID associated with this account.
    /// This DID is used as the `issuer` when signing verifiable credentials
    #[prost(string, tag = "6")]
    pub public_did: ::prost::alloc::string::String,
    /// List of active authentication tokens for this wallet.
    /// This list does not contain the issued token, only metadata
    /// such as ID, description, and creation date.
    #[prost(message, repeated, tag = "8")]
    pub auth_tokens: ::prost::alloc::vec::Vec<WalletAuthToken>,
}
/// Request to begin login flow
#[derive(::serde::Serialize, ::serde::Deserialize)]
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct LoginRequest {
    /// Email address of account. If unspecified, an anonymous account will be created.
    #[prost(string, tag = "1")]
    pub email: ::prost::alloc::string::String,
    /// ID of Ecosystem to sign into.
    #[prost(string, tag = "3")]
    pub ecosystem_id: ::prost::alloc::string::String,
}
/// Response to `LoginRequest`
#[derive(::serde::Serialize, ::serde::Deserialize)]
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct LoginResponse {
    #[prost(oneof = "login_response::Response", tags = "1, 2")]
    pub response: ::core::option::Option<login_response::Response>,
}
/// Nested message and enum types in `LoginResponse`.
pub mod login_response {
    #[derive(::serde::Serialize, ::serde::Deserialize)]
    #[allow(clippy::derive_partial_eq_without_eq)]
    #[derive(Clone, PartialEq, ::prost::Oneof)]
    pub enum Response {
        /// Random byte sequence unique to this login request.
        /// If present, two-factor confirmation of login is required.
        /// Must be sent back, unaltered, in `LoginConfirm`.
        #[prost(bytes, tag = "1")]
        Challenge(::prost::alloc::vec::Vec<u8>),
        /// Account profile response. If present, no confirmation of login is required.
        #[prost(message, tag = "2")]
        Profile(super::AccountProfile),
    }
}
/// Request to finalize login flow
#[derive(::serde::Serialize, ::serde::Deserialize)]
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct LoginConfirmRequest {
    /// Challenge received from `Login`
    #[prost(bytes = "vec", tag = "1")]
    pub challenge: ::prost::alloc::vec::Vec<u8>,
    /// Two-factor confirmation code sent to account email or phone,
    /// hashed using Blake3. Our SDKs will handle this hashing process for you.
    #[prost(bytes = "vec", tag = "2")]
    pub confirmation_code_hashed: ::prost::alloc::vec::Vec<u8>,
}
/// Response to `LoginConfirmRequest`
#[derive(::serde::Serialize, ::serde::Deserialize)]
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct LoginConfirmResponse {
    /// Profile response; must be unprotected using unhashed confirmation code.
    /// Our SDKs will handle this process for you, and return to you an authentication token string.
    #[prost(message, optional, tag = "1")]
    pub profile: ::core::option::Option<AccountProfile>,
}
/// Information about authentication tokens for a wallet
#[derive(::serde::Serialize, ::serde::Deserialize)]
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct WalletAuthToken {
    /// Unique identifier for the token.
    /// This field will match the `DeviceId` in the WalletAuthData
    #[prost(string, tag = "1")]
    pub id: ::prost::alloc::string::String,
    /// Device name/description
    #[prost(string, optional, tag = "2")]
    pub description: ::core::option::Option<::prost::alloc::string::String>,
    /// Date when the token was created in ISO 8601 format
    #[prost(string, tag = "3")]
    pub date_created: ::prost::alloc::string::String,
}
/// Confirmation method type for two-factor workflows
#[derive(::serde::Serialize, ::serde::Deserialize)]
#[derive(Clone, Copy, Debug, PartialEq, Eq, Hash, PartialOrd, Ord, ::prost::Enumeration)]
#[repr(i32)]
pub enum ConfirmationMethod {
    /// No confirmation required
    None = 0,
    /// Email confirmation required
    Email = 1,
    /// SMS confirmation required
    Sms = 2,
    /// Confirmation from a connected device is required
    ConnectedDevice = 3,
    /// Third-party method of confirmation is required
    Other = 10,
}
impl ConfirmationMethod {
    /// String value of the enum field names used in the ProtoBuf definition.
    ///
    /// The values are not transformed in any way and thus are considered stable
    /// (if the ProtoBuf definition does not change) and safe for programmatic use.
    pub fn as_str_name(&self) -> &'static str {
        match self {
            ConfirmationMethod::None => "None",
            ConfirmationMethod::Email => "Email",
            ConfirmationMethod::Sms => "Sms",
            ConfirmationMethod::ConnectedDevice => "ConnectedDevice",
            ConfirmationMethod::Other => "Other",
        }
    }
    /// Creates an enum from field names used in the ProtoBuf definition.
    pub fn from_str_name(value: &str) -> ::core::option::Option<Self> {
        match value {
            "None" => Some(Self::None),
            "Email" => Some(Self::Email),
            "Sms" => Some(Self::Sms),
            "ConnectedDevice" => Some(Self::ConnectedDevice),
            "Other" => Some(Self::Other),
            _ => None,
        }
    }
}
/// Generated client implementations.
pub mod account_client {
    #![allow(unused_variables, dead_code, missing_docs, clippy::let_unit_value)]
    use tonic::codegen::*;
    use tonic::codegen::http::Uri;
    #[derive(Debug, Clone)]
    pub struct AccountClient<T> {
        inner: tonic::client::Grpc<T>,
    }
    impl AccountClient<tonic::transport::Channel> {
        /// Attempt to create a new client by connecting to a given endpoint.
        pub async fn connect<D>(dst: D) -> Result<Self, tonic::transport::Error>
        where
            D: std::convert::TryInto<tonic::transport::Endpoint>,
            D::Error: Into<StdError>,
        {
            let conn = tonic::transport::Endpoint::new(dst)?.connect().await?;
            Ok(Self::new(conn))
        }
    }
    impl<T> AccountClient<T>
    where
        T: tonic::client::GrpcService<tonic::body::BoxBody>,
        T::Error: Into<StdError>,
        T::ResponseBody: Body<Data = Bytes> + Send + 'static,
        <T::ResponseBody as Body>::Error: Into<StdError> + Send,
    {
        pub fn new(inner: T) -> Self {
            let inner = tonic::client::Grpc::new(inner);
            Self { inner }
        }
        pub fn with_origin(inner: T, origin: Uri) -> Self {
            let inner = tonic::client::Grpc::with_origin(inner, origin);
            Self { inner }
        }
        pub fn with_interceptor<F>(
            inner: T,
            interceptor: F,
        ) -> AccountClient<InterceptedService<T, F>>
        where
            F: tonic::service::Interceptor,
            T::ResponseBody: Default,
            T: tonic::codegen::Service<
                http::Request<tonic::body::BoxBody>,
                Response = http::Response<
                    <T as tonic::client::GrpcService<tonic::body::BoxBody>>::ResponseBody,
                >,
            >,
            <T as tonic::codegen::Service<
                http::Request<tonic::body::BoxBody>,
            >>::Error: Into<StdError> + Send + Sync,
        {
            AccountClient::new(InterceptedService::new(inner, interceptor))
        }
        /// Compress requests with the given encoding.
        ///
        /// This requires the server to support it otherwise it might respond with an
        /// error.
        #[must_use]
        pub fn send_compressed(mut self, encoding: CompressionEncoding) -> Self {
            self.inner = self.inner.send_compressed(encoding);
            self
        }
        /// Enable decompressing responses.
        #[must_use]
        pub fn accept_compressed(mut self, encoding: CompressionEncoding) -> Self {
            self.inner = self.inner.accept_compressed(encoding);
            self
        }
        /// Begin login flow for specified account, creating one if it does not already exist
        pub async fn login(
            &mut self,
            request: impl tonic::IntoRequest<super::LoginRequest>,
        ) -> Result<tonic::Response<super::LoginResponse>, tonic::Status> {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/services.account.v1.Account/Login",
            );
            self.inner.unary(request.into_request(), path, codec).await
        }
        /// Finalize login flow with two-factor confirmation code
        pub async fn login_confirm(
            &mut self,
            request: impl tonic::IntoRequest<super::LoginConfirmRequest>,
        ) -> Result<tonic::Response<super::LoginConfirmResponse>, tonic::Status> {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/services.account.v1.Account/LoginConfirm",
            );
            self.inner.unary(request.into_request(), path, codec).await
        }
        /// Get account information
        pub async fn info(
            &mut self,
            request: impl tonic::IntoRequest<super::AccountInfoRequest>,
        ) -> Result<tonic::Response<super::AccountInfoResponse>, tonic::Status> {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/services.account.v1.Account/Info",
            );
            self.inner.unary(request.into_request(), path, codec).await
        }
    }
}
