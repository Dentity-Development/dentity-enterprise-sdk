///
//  Generated code. Do not modify.
//  source: services/account/v1/account.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:async' as $async;

import 'dart:core' as $core;

import 'package:grpc/service_api.dart' as $grpc;
import 'account.pb.dart' as $4;
export 'account.pb.dart';

class AccountClient extends $grpc.Client {
  static final _$signIn =
      $grpc.ClientMethod<$4.SignInRequest, $4.SignInResponse>(
          '/services.account.v1.Account/SignIn',
          ($4.SignInRequest value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $4.SignInResponse.fromBuffer(value));
  static final _$login = $grpc.ClientMethod<$4.LoginRequest, $4.LoginResponse>(
      '/services.account.v1.Account/Login',
      ($4.LoginRequest value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $4.LoginResponse.fromBuffer(value));
  static final _$loginConfirm =
      $grpc.ClientMethod<$4.LoginConfirmRequest, $4.LoginConfirmResponse>(
          '/services.account.v1.Account/LoginConfirm',
          ($4.LoginConfirmRequest value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $4.LoginConfirmResponse.fromBuffer(value));
  static final _$info =
      $grpc.ClientMethod<$4.AccountInfoRequest, $4.AccountInfoResponse>(
          '/services.account.v1.Account/Info',
          ($4.AccountInfoRequest value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $4.AccountInfoResponse.fromBuffer(value));

  AccountClient($grpc.ClientChannel channel,
      {$grpc.CallOptions? options,
      $core.Iterable<$grpc.ClientInterceptor>? interceptors})
      : super(channel, options: options, interceptors: interceptors);

  $grpc.ResponseFuture<$4.SignInResponse> signIn($4.SignInRequest request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$signIn, request, options: options);
  }

  $grpc.ResponseFuture<$4.LoginResponse> login($4.LoginRequest request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$login, request, options: options);
  }

  $grpc.ResponseFuture<$4.LoginConfirmResponse> loginConfirm(
      $4.LoginConfirmRequest request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$loginConfirm, request, options: options);
  }

  $grpc.ResponseFuture<$4.AccountInfoResponse> info(
      $4.AccountInfoRequest request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$info, request, options: options);
  }
}

abstract class AccountServiceBase extends $grpc.Service {
  $core.String get $name => 'services.account.v1.Account';

  AccountServiceBase() {
    $addMethod($grpc.ServiceMethod<$4.SignInRequest, $4.SignInResponse>(
        'SignIn',
        signIn_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $4.SignInRequest.fromBuffer(value),
        ($4.SignInResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$4.LoginRequest, $4.LoginResponse>(
        'Login',
        login_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $4.LoginRequest.fromBuffer(value),
        ($4.LoginResponse value) => value.writeToBuffer()));
    $addMethod(
        $grpc.ServiceMethod<$4.LoginConfirmRequest, $4.LoginConfirmResponse>(
            'LoginConfirm',
            loginConfirm_Pre,
            false,
            false,
            ($core.List<$core.int> value) =>
                $4.LoginConfirmRequest.fromBuffer(value),
            ($4.LoginConfirmResponse value) => value.writeToBuffer()));
    $addMethod(
        $grpc.ServiceMethod<$4.AccountInfoRequest, $4.AccountInfoResponse>(
            'Info',
            info_Pre,
            false,
            false,
            ($core.List<$core.int> value) =>
                $4.AccountInfoRequest.fromBuffer(value),
            ($4.AccountInfoResponse value) => value.writeToBuffer()));
  }

  $async.Future<$4.SignInResponse> signIn_Pre(
      $grpc.ServiceCall call, $async.Future<$4.SignInRequest> request) async {
    return signIn(call, await request);
  }

  $async.Future<$4.LoginResponse> login_Pre(
      $grpc.ServiceCall call, $async.Future<$4.LoginRequest> request) async {
    return login(call, await request);
  }

  $async.Future<$4.LoginConfirmResponse> loginConfirm_Pre(
      $grpc.ServiceCall call,
      $async.Future<$4.LoginConfirmRequest> request) async {
    return loginConfirm(call, await request);
  }

  $async.Future<$4.AccountInfoResponse> info_Pre($grpc.ServiceCall call,
      $async.Future<$4.AccountInfoRequest> request) async {
    return info(call, await request);
  }

  $async.Future<$4.SignInResponse> signIn(
      $grpc.ServiceCall call, $4.SignInRequest request);
  $async.Future<$4.LoginResponse> login(
      $grpc.ServiceCall call, $4.LoginRequest request);
  $async.Future<$4.LoginConfirmResponse> loginConfirm(
      $grpc.ServiceCall call, $4.LoginConfirmRequest request);
  $async.Future<$4.AccountInfoResponse> info(
      $grpc.ServiceCall call, $4.AccountInfoRequest request);
}
