package trinsic.services.account.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.2)",
    comments = "Source: services/account/v1/account.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountGrpc {

  private AccountGrpc() {}

  public static final String SERVICE_NAME = "services.account.v1.Account";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          trinsic.services.account.v1.SignInRequest, trinsic.services.account.v1.SignInResponse>
      getSignInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignIn",
      requestType = trinsic.services.account.v1.SignInRequest.class,
      responseType = trinsic.services.account.v1.SignInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          trinsic.services.account.v1.SignInRequest, trinsic.services.account.v1.SignInResponse>
      getSignInMethod() {
    io.grpc.MethodDescriptor<
            trinsic.services.account.v1.SignInRequest, trinsic.services.account.v1.SignInResponse>
        getSignInMethod;
    if ((getSignInMethod = AccountGrpc.getSignInMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getSignInMethod = AccountGrpc.getSignInMethod) == null) {
          AccountGrpc.getSignInMethod =
              getSignInMethod =
                  io.grpc.MethodDescriptor
                      .<trinsic.services.account.v1.SignInRequest,
                          trinsic.services.account.v1.SignInResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignIn"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              trinsic.services.account.v1.SignInRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              trinsic.services.account.v1.SignInResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new AccountMethodDescriptorSupplier("SignIn"))
                      .build();
        }
      }
    }
    return getSignInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          trinsic.services.account.v1.LoginRequest, trinsic.services.account.v1.LoginResponse>
      getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = trinsic.services.account.v1.LoginRequest.class,
      responseType = trinsic.services.account.v1.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          trinsic.services.account.v1.LoginRequest, trinsic.services.account.v1.LoginResponse>
      getLoginMethod() {
    io.grpc.MethodDescriptor<
            trinsic.services.account.v1.LoginRequest, trinsic.services.account.v1.LoginResponse>
        getLoginMethod;
    if ((getLoginMethod = AccountGrpc.getLoginMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getLoginMethod = AccountGrpc.getLoginMethod) == null) {
          AccountGrpc.getLoginMethod =
              getLoginMethod =
                  io.grpc.MethodDescriptor
                      .<trinsic.services.account.v1.LoginRequest,
                          trinsic.services.account.v1.LoginResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Login"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              trinsic.services.account.v1.LoginRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              trinsic.services.account.v1.LoginResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new AccountMethodDescriptorSupplier("Login"))
                      .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          trinsic.services.account.v1.LoginConfirmRequest,
          trinsic.services.account.v1.LoginConfirmResponse>
      getLoginConfirmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginConfirm",
      requestType = trinsic.services.account.v1.LoginConfirmRequest.class,
      responseType = trinsic.services.account.v1.LoginConfirmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          trinsic.services.account.v1.LoginConfirmRequest,
          trinsic.services.account.v1.LoginConfirmResponse>
      getLoginConfirmMethod() {
    io.grpc.MethodDescriptor<
            trinsic.services.account.v1.LoginConfirmRequest,
            trinsic.services.account.v1.LoginConfirmResponse>
        getLoginConfirmMethod;
    if ((getLoginConfirmMethod = AccountGrpc.getLoginConfirmMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getLoginConfirmMethod = AccountGrpc.getLoginConfirmMethod) == null) {
          AccountGrpc.getLoginConfirmMethod =
              getLoginConfirmMethod =
                  io.grpc.MethodDescriptor
                      .<trinsic.services.account.v1.LoginConfirmRequest,
                          trinsic.services.account.v1.LoginConfirmResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginConfirm"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              trinsic.services.account.v1.LoginConfirmRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              trinsic.services.account.v1.LoginConfirmResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new AccountMethodDescriptorSupplier("LoginConfirm"))
                      .build();
        }
      }
    }
    return getLoginConfirmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          trinsic.services.account.v1.AccountInfoRequest,
          trinsic.services.account.v1.AccountInfoResponse>
      getInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Info",
      requestType = trinsic.services.account.v1.AccountInfoRequest.class,
      responseType = trinsic.services.account.v1.AccountInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          trinsic.services.account.v1.AccountInfoRequest,
          trinsic.services.account.v1.AccountInfoResponse>
      getInfoMethod() {
    io.grpc.MethodDescriptor<
            trinsic.services.account.v1.AccountInfoRequest,
            trinsic.services.account.v1.AccountInfoResponse>
        getInfoMethod;
    if ((getInfoMethod = AccountGrpc.getInfoMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getInfoMethod = AccountGrpc.getInfoMethod) == null) {
          AccountGrpc.getInfoMethod =
              getInfoMethod =
                  io.grpc.MethodDescriptor
                      .<trinsic.services.account.v1.AccountInfoRequest,
                          trinsic.services.account.v1.AccountInfoResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Info"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              trinsic.services.account.v1.AccountInfoRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              trinsic.services.account.v1.AccountInfoResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new AccountMethodDescriptorSupplier("Info"))
                      .build();
        }
      }
    }
    return getInfoMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static AccountStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AccountStub>() {
          @java.lang.Override
          public AccountStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AccountStub(channel, callOptions);
          }
        };
    return AccountStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AccountBlockingStub>() {
          @java.lang.Override
          public AccountBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AccountBlockingStub(channel, callOptions);
          }
        };
    return AccountBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static AccountFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AccountFutureStub>() {
          @java.lang.Override
          public AccountFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AccountFutureStub(channel, callOptions);
          }
        };
    return AccountFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class AccountImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Sign in to an already existing account
     * </pre>
     */
    @java.lang.Deprecated
    public void signIn(
        trinsic.services.account.v1.SignInRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.account.v1.SignInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignInMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Begin login flow for specified account, creating one if it does not already exist
     * </pre>
     */
    @java.lang.Deprecated
    public void login(
        trinsic.services.account.v1.LoginRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.account.v1.LoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Finalize login flow with two-factor confirmation code
     * </pre>
     */
    @java.lang.Deprecated
    public void loginConfirm(
        trinsic.services.account.v1.LoginConfirmRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.account.v1.LoginConfirmResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getLoginConfirmMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Get account information
     * </pre>
     */
    @java.lang.Deprecated
    public void info(
        trinsic.services.account.v1.AccountInfoRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.account.v1.AccountInfoResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInfoMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getSignInMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      trinsic.services.account.v1.SignInRequest,
                      trinsic.services.account.v1.SignInResponse>(this, METHODID_SIGN_IN)))
          .addMethod(
              getLoginMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      trinsic.services.account.v1.LoginRequest,
                      trinsic.services.account.v1.LoginResponse>(this, METHODID_LOGIN)))
          .addMethod(
              getLoginConfirmMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      trinsic.services.account.v1.LoginConfirmRequest,
                      trinsic.services.account.v1.LoginConfirmResponse>(
                      this, METHODID_LOGIN_CONFIRM)))
          .addMethod(
              getInfoMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      trinsic.services.account.v1.AccountInfoRequest,
                      trinsic.services.account.v1.AccountInfoResponse>(this, METHODID_INFO)))
          .build();
    }
  }

  /** */
  public static final class AccountStub extends io.grpc.stub.AbstractAsyncStub<AccountStub> {
    private AccountStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Sign in to an already existing account
     * </pre>
     */
    @java.lang.Deprecated
    public void signIn(
        trinsic.services.account.v1.SignInRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.account.v1.SignInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Begin login flow for specified account, creating one if it does not already exist
     * </pre>
     */
    @java.lang.Deprecated
    public void login(
        trinsic.services.account.v1.LoginRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.account.v1.LoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Finalize login flow with two-factor confirmation code
     * </pre>
     */
    @java.lang.Deprecated
    public void loginConfirm(
        trinsic.services.account.v1.LoginConfirmRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.account.v1.LoginConfirmResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginConfirmMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Get account information
     * </pre>
     */
    @java.lang.Deprecated
    public void info(
        trinsic.services.account.v1.AccountInfoRequest request,
        io.grpc.stub.StreamObserver<trinsic.services.account.v1.AccountInfoResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /** */
  public static final class AccountBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AccountBlockingStub> {
    private AccountBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Sign in to an already existing account
     * </pre>
     */
    @java.lang.Deprecated
    public trinsic.services.account.v1.SignInResponse signIn(
        trinsic.services.account.v1.SignInRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignInMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Begin login flow for specified account, creating one if it does not already exist
     * </pre>
     */
    @java.lang.Deprecated
    public trinsic.services.account.v1.LoginResponse login(
        trinsic.services.account.v1.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Finalize login flow with two-factor confirmation code
     * </pre>
     */
    @java.lang.Deprecated
    public trinsic.services.account.v1.LoginConfirmResponse loginConfirm(
        trinsic.services.account.v1.LoginConfirmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginConfirmMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Get account information
     * </pre>
     */
    @java.lang.Deprecated
    public trinsic.services.account.v1.AccountInfoResponse info(
        trinsic.services.account.v1.AccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInfoMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class AccountFutureStub
      extends io.grpc.stub.AbstractFutureStub<AccountFutureStub> {
    private AccountFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Sign in to an already existing account
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<
            trinsic.services.account.v1.SignInResponse>
        signIn(trinsic.services.account.v1.SignInRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Begin login flow for specified account, creating one if it does not already exist
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<
            trinsic.services.account.v1.LoginResponse>
        login(trinsic.services.account.v1.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Finalize login flow with two-factor confirmation code
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<
            trinsic.services.account.v1.LoginConfirmResponse>
        loginConfirm(trinsic.services.account.v1.LoginConfirmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginConfirmMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Get account information
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<
            trinsic.services.account.v1.AccountInfoResponse>
        info(trinsic.services.account.v1.AccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN_IN = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_LOGIN_CONFIRM = 2;
  private static final int METHODID_INFO = 3;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN_IN:
          serviceImpl.signIn(
              (trinsic.services.account.v1.SignInRequest) request,
              (io.grpc.stub.StreamObserver<trinsic.services.account.v1.SignInResponse>)
                  responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login(
              (trinsic.services.account.v1.LoginRequest) request,
              (io.grpc.stub.StreamObserver<trinsic.services.account.v1.LoginResponse>)
                  responseObserver);
          break;
        case METHODID_LOGIN_CONFIRM:
          serviceImpl.loginConfirm(
              (trinsic.services.account.v1.LoginConfirmRequest) request,
              (io.grpc.stub.StreamObserver<trinsic.services.account.v1.LoginConfirmResponse>)
                  responseObserver);
          break;
        case METHODID_INFO:
          serviceImpl.info(
              (trinsic.services.account.v1.AccountInfoRequest) request,
              (io.grpc.stub.StreamObserver<trinsic.services.account.v1.AccountInfoResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class AccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return trinsic.services.account.v1.AccountOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Account");
    }
  }

  private static final class AccountFileDescriptorSupplier extends AccountBaseDescriptorSupplier {
    AccountFileDescriptorSupplier() {}
  }

  private static final class AccountMethodDescriptorSupplier extends AccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AccountGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new AccountFileDescriptorSupplier())
                      .addMethod(getSignInMethod())
                      .addMethod(getLoginMethod())
                      .addMethod(getLoginConfirmMethod())
                      .addMethod(getInfoMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
