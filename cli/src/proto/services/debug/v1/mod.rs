/// Generated client implementations.
pub mod debugging_client {
    #![allow(unused_variables, dead_code, missing_docs, clippy::let_unit_value)]
    use tonic::codegen::http::Uri;
    use tonic::codegen::*;
    #[derive(Debug, Clone)]
    pub struct DebuggingClient<T> {
        inner: tonic::client::Grpc<T>,
    }
    impl DebuggingClient<tonic::transport::Channel> {
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
    impl<T> DebuggingClient<T>
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
        pub fn with_interceptor<F>(inner: T, interceptor: F) -> DebuggingClient<InterceptedService<T, F>>
        where
            F: tonic::service::Interceptor,
            T::ResponseBody: Default,
            T: tonic::codegen::Service<
                http::Request<tonic::body::BoxBody>,
                Response = http::Response<<T as tonic::client::GrpcService<tonic::body::BoxBody>>::ResponseBody>,
            >,
            <T as tonic::codegen::Service<http::Request<tonic::body::BoxBody>>>::Error: Into<StdError> + Send + Sync,
        {
            DebuggingClient::new(InterceptedService::new(inner, interceptor))
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
        pub async fn call_empty(
            &mut self,
            request: impl tonic::IntoRequest<super::super::super::super::google::protobuf::Empty>,
        ) -> Result<tonic::Response<super::super::super::super::google::protobuf::Empty>, tonic::Status> {
            self.inner
                .ready()
                .await
                .map_err(|e| tonic::Status::new(tonic::Code::Unknown, format!("Service was not ready: {}", e.into())))?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/services.debug.v1.Debugging/CallEmpty");
            self.inner.unary(request.into_request(), path, codec).await
        }
        pub async fn call_empty_auth(
            &mut self,
            request: impl tonic::IntoRequest<super::super::super::super::google::protobuf::Empty>,
        ) -> Result<tonic::Response<super::super::super::super::google::protobuf::Empty>, tonic::Status> {
            self.inner
                .ready()
                .await
                .map_err(|e| tonic::Status::new(tonic::Code::Unknown, format!("Service was not ready: {}", e.into())))?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/services.debug.v1.Debugging/CallEmptyAuth");
            self.inner.unary(request.into_request(), path, codec).await
        }
    }
}
