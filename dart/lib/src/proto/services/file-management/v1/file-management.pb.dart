//
//  Generated code. Do not modify.
//  source: services/file-management/v1/file-management.proto
//
// @dart = 2.12

// ignore_for_file: annotate_overrides, camel_case_types, comment_references
// ignore_for_file: constant_identifier_names, library_prefixes
// ignore_for_file: non_constant_identifier_names, prefer_final_fields
// ignore_for_file: unnecessary_import, unnecessary_this, unused_import

import 'dart:core' as $core;

import 'package:fixnum/fixnum.dart' as $fixnum;
import 'package:protobuf/protobuf.dart' as $pb;

/// Contains information about a file stored in Trinsic's CDN
class File extends $pb.GeneratedMessage {
  factory File({
    $core.String? id,
    $core.String? uploaderId,
    $core.int? size,
    $core.String? mimeType,
    $core.String? uploaded,
    $core.String? url,
  }) {
    final $result = create();
    if (id != null) {
      $result.id = id;
    }
    if (uploaderId != null) {
      $result.uploaderId = uploaderId;
    }
    if (size != null) {
      $result.size = size;
    }
    if (mimeType != null) {
      $result.mimeType = mimeType;
    }
    if (uploaded != null) {
      $result.uploaded = uploaded;
    }
    if (url != null) {
      $result.url = url;
    }
    return $result;
  }
  File._() : super();
  factory File.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory File.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'File',
      package: const $pb.PackageName(
          _omitMessageNames ? '' : 'services.filemanagement.v1'),
      createEmptyInstance: create)
    ..aOS(1, _omitFieldNames ? '' : 'id')
    ..aOS(2, _omitFieldNames ? '' : 'uploaderId')
    ..a<$core.int>(3, _omitFieldNames ? '' : 'size', $pb.PbFieldType.OU3)
    ..aOS(4, _omitFieldNames ? '' : 'mimeType')
    ..aOS(5, _omitFieldNames ? '' : 'uploaded')
    ..aOS(6, _omitFieldNames ? '' : 'url')
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  File clone() => File()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  File copyWith(void Function(File) updates) =>
      super.copyWith((message) => updates(message as File)) as File;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static File create() => File._();
  File createEmptyInstance() => create();
  static $pb.PbList<File> createRepeated() => $pb.PbList<File>();
  @$core.pragma('dart2js:noInline')
  static File getDefault() =>
      _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<File>(create);
  static File? _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get id => $_getSZ(0);
  @$pb.TagNumber(1)
  set id($core.String v) {
    $_setString(0, v);
  }

  @$pb.TagNumber(1)
  $core.bool hasId() => $_has(0);
  @$pb.TagNumber(1)
  void clearId() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get uploaderId => $_getSZ(1);
  @$pb.TagNumber(2)
  set uploaderId($core.String v) {
    $_setString(1, v);
  }

  @$pb.TagNumber(2)
  $core.bool hasUploaderId() => $_has(1);
  @$pb.TagNumber(2)
  void clearUploaderId() => clearField(2);

  @$pb.TagNumber(3)
  $core.int get size => $_getIZ(2);
  @$pb.TagNumber(3)
  set size($core.int v) {
    $_setUnsignedInt32(2, v);
  }

  @$pb.TagNumber(3)
  $core.bool hasSize() => $_has(2);
  @$pb.TagNumber(3)
  void clearSize() => clearField(3);

  @$pb.TagNumber(4)
  $core.String get mimeType => $_getSZ(3);
  @$pb.TagNumber(4)
  set mimeType($core.String v) {
    $_setString(3, v);
  }

  @$pb.TagNumber(4)
  $core.bool hasMimeType() => $_has(3);
  @$pb.TagNumber(4)
  void clearMimeType() => clearField(4);

  @$pb.TagNumber(5)
  $core.String get uploaded => $_getSZ(4);
  @$pb.TagNumber(5)
  set uploaded($core.String v) {
    $_setString(4, v);
  }

  @$pb.TagNumber(5)
  $core.bool hasUploaded() => $_has(4);
  @$pb.TagNumber(5)
  void clearUploaded() => clearField(5);

  @$pb.TagNumber(6)
  $core.String get url => $_getSZ(5);
  @$pb.TagNumber(6)
  set url($core.String v) {
    $_setString(5, v);
  }

  @$pb.TagNumber(6)
  $core.bool hasUrl() => $_has(5);
  @$pb.TagNumber(6)
  void clearUrl() => clearField(6);
}

/// Represents aggregate statistics of all files uploaded by a single issuer
class StorageStats extends $pb.GeneratedMessage {
  factory StorageStats({
    $core.int? numFiles,
    $fixnum.Int64? totalSize,
  }) {
    final $result = create();
    if (numFiles != null) {
      $result.numFiles = numFiles;
    }
    if (totalSize != null) {
      $result.totalSize = totalSize;
    }
    return $result;
  }
  StorageStats._() : super();
  factory StorageStats.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory StorageStats.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'StorageStats',
      package: const $pb.PackageName(
          _omitMessageNames ? '' : 'services.filemanagement.v1'),
      createEmptyInstance: create)
    ..a<$core.int>(1, _omitFieldNames ? '' : 'numFiles', $pb.PbFieldType.OU3)
    ..a<$fixnum.Int64>(
        2, _omitFieldNames ? '' : 'totalSize', $pb.PbFieldType.OU6,
        defaultOrMaker: $fixnum.Int64.ZERO)
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  StorageStats clone() => StorageStats()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  StorageStats copyWith(void Function(StorageStats) updates) =>
      super.copyWith((message) => updates(message as StorageStats))
          as StorageStats;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static StorageStats create() => StorageStats._();
  StorageStats createEmptyInstance() => create();
  static $pb.PbList<StorageStats> createRepeated() =>
      $pb.PbList<StorageStats>();
  @$core.pragma('dart2js:noInline')
  static StorageStats getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<StorageStats>(create);
  static StorageStats? _defaultInstance;

  @$pb.TagNumber(1)
  $core.int get numFiles => $_getIZ(0);
  @$pb.TagNumber(1)
  set numFiles($core.int v) {
    $_setUnsignedInt32(0, v);
  }

  @$pb.TagNumber(1)
  $core.bool hasNumFiles() => $_has(0);
  @$pb.TagNumber(1)
  void clearNumFiles() => clearField(1);

  @$pb.TagNumber(2)
  $fixnum.Int64 get totalSize => $_getI64(1);
  @$pb.TagNumber(2)
  set totalSize($fixnum.Int64 v) {
    $_setInt64(1, v);
  }

  @$pb.TagNumber(2)
  $core.bool hasTotalSize() => $_has(1);
  @$pb.TagNumber(2)
  void clearTotalSize() => clearField(2);
}

/// Request to upload a file to Trinsic's CDN
class UploadFileRequest extends $pb.GeneratedMessage {
  factory UploadFileRequest({
    $core.List<$core.int>? contents,
    $core.String? mimeType,
  }) {
    final $result = create();
    if (contents != null) {
      $result.contents = contents;
    }
    if (mimeType != null) {
      $result.mimeType = mimeType;
    }
    return $result;
  }
  UploadFileRequest._() : super();
  factory UploadFileRequest.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory UploadFileRequest.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'UploadFileRequest',
      package: const $pb.PackageName(
          _omitMessageNames ? '' : 'services.filemanagement.v1'),
      createEmptyInstance: create)
    ..a<$core.List<$core.int>>(
        1, _omitFieldNames ? '' : 'contents', $pb.PbFieldType.OY)
    ..aOS(2, _omitFieldNames ? '' : 'mimeType')
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  UploadFileRequest clone() => UploadFileRequest()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  UploadFileRequest copyWith(void Function(UploadFileRequest) updates) =>
      super.copyWith((message) => updates(message as UploadFileRequest))
          as UploadFileRequest;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static UploadFileRequest create() => UploadFileRequest._();
  UploadFileRequest createEmptyInstance() => create();
  static $pb.PbList<UploadFileRequest> createRepeated() =>
      $pb.PbList<UploadFileRequest>();
  @$core.pragma('dart2js:noInline')
  static UploadFileRequest getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<UploadFileRequest>(create);
  static UploadFileRequest? _defaultInstance;

  /// Raw content of file
  @$pb.TagNumber(1)
  $core.List<$core.int> get contents => $_getN(0);
  @$pb.TagNumber(1)
  set contents($core.List<$core.int> v) {
    $_setBytes(0, v);
  }

  @$pb.TagNumber(1)
  $core.bool hasContents() => $_has(0);
  @$pb.TagNumber(1)
  void clearContents() => clearField(1);

  /// MIME type describing file contents
  @$pb.TagNumber(2)
  $core.String get mimeType => $_getSZ(1);
  @$pb.TagNumber(2)
  set mimeType($core.String v) {
    $_setString(1, v);
  }

  @$pb.TagNumber(2)
  $core.bool hasMimeType() => $_has(1);
  @$pb.TagNumber(2)
  void clearMimeType() => clearField(2);
}

/// Response to `UploadFileRequest`
class UploadFileResponse extends $pb.GeneratedMessage {
  factory UploadFileResponse({
    File? uploadedFile,
  }) {
    final $result = create();
    if (uploadedFile != null) {
      $result.uploadedFile = uploadedFile;
    }
    return $result;
  }
  UploadFileResponse._() : super();
  factory UploadFileResponse.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory UploadFileResponse.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'UploadFileResponse',
      package: const $pb.PackageName(
          _omitMessageNames ? '' : 'services.filemanagement.v1'),
      createEmptyInstance: create)
    ..aOM<File>(1, _omitFieldNames ? '' : 'uploadedFile',
        subBuilder: File.create)
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  UploadFileResponse clone() => UploadFileResponse()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  UploadFileResponse copyWith(void Function(UploadFileResponse) updates) =>
      super.copyWith((message) => updates(message as UploadFileResponse))
          as UploadFileResponse;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static UploadFileResponse create() => UploadFileResponse._();
  UploadFileResponse createEmptyInstance() => create();
  static $pb.PbList<UploadFileResponse> createRepeated() =>
      $pb.PbList<UploadFileResponse>();
  @$core.pragma('dart2js:noInline')
  static UploadFileResponse getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<UploadFileResponse>(create);
  static UploadFileResponse? _defaultInstance;

  @$pb.TagNumber(1)
  File get uploadedFile => $_getN(0);
  @$pb.TagNumber(1)
  set uploadedFile(File v) {
    setField(1, v);
  }

  @$pb.TagNumber(1)
  $core.bool hasUploadedFile() => $_has(0);
  @$pb.TagNumber(1)
  void clearUploadedFile() => clearField(1);
  @$pb.TagNumber(1)
  File ensureUploadedFile() => $_ensure(0);
}

/// Request to fetch information about a stored file
class GetFileRequest extends $pb.GeneratedMessage {
  factory GetFileRequest({
    $core.String? id,
  }) {
    final $result = create();
    if (id != null) {
      $result.id = id;
    }
    return $result;
  }
  GetFileRequest._() : super();
  factory GetFileRequest.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory GetFileRequest.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'GetFileRequest',
      package: const $pb.PackageName(
          _omitMessageNames ? '' : 'services.filemanagement.v1'),
      createEmptyInstance: create)
    ..aOS(1, _omitFieldNames ? '' : 'id')
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  GetFileRequest clone() => GetFileRequest()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  GetFileRequest copyWith(void Function(GetFileRequest) updates) =>
      super.copyWith((message) => updates(message as GetFileRequest))
          as GetFileRequest;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static GetFileRequest create() => GetFileRequest._();
  GetFileRequest createEmptyInstance() => create();
  static $pb.PbList<GetFileRequest> createRepeated() =>
      $pb.PbList<GetFileRequest>();
  @$core.pragma('dart2js:noInline')
  static GetFileRequest getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<GetFileRequest>(create);
  static GetFileRequest? _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get id => $_getSZ(0);
  @$pb.TagNumber(1)
  set id($core.String v) {
    $_setString(0, v);
  }

  @$pb.TagNumber(1)
  $core.bool hasId() => $_has(0);
  @$pb.TagNumber(1)
  void clearId() => clearField(1);
}

/// Response to `GetFileRequest`
class GetFileResponse extends $pb.GeneratedMessage {
  factory GetFileResponse({
    File? file,
  }) {
    final $result = create();
    if (file != null) {
      $result.file = file;
    }
    return $result;
  }
  GetFileResponse._() : super();
  factory GetFileResponse.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory GetFileResponse.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'GetFileResponse',
      package: const $pb.PackageName(
          _omitMessageNames ? '' : 'services.filemanagement.v1'),
      createEmptyInstance: create)
    ..aOM<File>(1, _omitFieldNames ? '' : 'file', subBuilder: File.create)
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  GetFileResponse clone() => GetFileResponse()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  GetFileResponse copyWith(void Function(GetFileResponse) updates) =>
      super.copyWith((message) => updates(message as GetFileResponse))
          as GetFileResponse;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static GetFileResponse create() => GetFileResponse._();
  GetFileResponse createEmptyInstance() => create();
  static $pb.PbList<GetFileResponse> createRepeated() =>
      $pb.PbList<GetFileResponse>();
  @$core.pragma('dart2js:noInline')
  static GetFileResponse getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<GetFileResponse>(create);
  static GetFileResponse? _defaultInstance;

  @$pb.TagNumber(1)
  File get file => $_getN(0);
  @$pb.TagNumber(1)
  set file(File v) {
    setField(1, v);
  }

  @$pb.TagNumber(1)
  $core.bool hasFile() => $_has(0);
  @$pb.TagNumber(1)
  void clearFile() => clearField(1);
  @$pb.TagNumber(1)
  File ensureFile() => $_ensure(0);
}

/// Request to delete a file from Trinsic's CDN by ID
class DeleteFileRequest extends $pb.GeneratedMessage {
  factory DeleteFileRequest({
    $core.String? id,
  }) {
    final $result = create();
    if (id != null) {
      $result.id = id;
    }
    return $result;
  }
  DeleteFileRequest._() : super();
  factory DeleteFileRequest.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory DeleteFileRequest.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'DeleteFileRequest',
      package: const $pb.PackageName(
          _omitMessageNames ? '' : 'services.filemanagement.v1'),
      createEmptyInstance: create)
    ..aOS(1, _omitFieldNames ? '' : 'id')
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  DeleteFileRequest clone() => DeleteFileRequest()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  DeleteFileRequest copyWith(void Function(DeleteFileRequest) updates) =>
      super.copyWith((message) => updates(message as DeleteFileRequest))
          as DeleteFileRequest;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static DeleteFileRequest create() => DeleteFileRequest._();
  DeleteFileRequest createEmptyInstance() => create();
  static $pb.PbList<DeleteFileRequest> createRepeated() =>
      $pb.PbList<DeleteFileRequest>();
  @$core.pragma('dart2js:noInline')
  static DeleteFileRequest getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<DeleteFileRequest>(create);
  static DeleteFileRequest? _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get id => $_getSZ(0);
  @$pb.TagNumber(1)
  set id($core.String v) {
    $_setString(0, v);
  }

  @$pb.TagNumber(1)
  $core.bool hasId() => $_has(0);
  @$pb.TagNumber(1)
  void clearId() => clearField(1);
}

/// Response to `DeleteFileRequest`. Empty payload.
class DeleteFileResponse extends $pb.GeneratedMessage {
  factory DeleteFileResponse() => create();
  DeleteFileResponse._() : super();
  factory DeleteFileResponse.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory DeleteFileResponse.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'DeleteFileResponse',
      package: const $pb.PackageName(
          _omitMessageNames ? '' : 'services.filemanagement.v1'),
      createEmptyInstance: create)
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  DeleteFileResponse clone() => DeleteFileResponse()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  DeleteFileResponse copyWith(void Function(DeleteFileResponse) updates) =>
      super.copyWith((message) => updates(message as DeleteFileResponse))
          as DeleteFileResponse;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static DeleteFileResponse create() => DeleteFileResponse._();
  DeleteFileResponse createEmptyInstance() => create();
  static $pb.PbList<DeleteFileResponse> createRepeated() =>
      $pb.PbList<DeleteFileResponse>();
  @$core.pragma('dart2js:noInline')
  static DeleteFileResponse getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<DeleteFileResponse>(create);
  static DeleteFileResponse? _defaultInstance;
}

/// Request to list files
class ListFilesRequest extends $pb.GeneratedMessage {
  factory ListFilesRequest({
    $core.String? query,
    $core.String? continuationToken,
  }) {
    final $result = create();
    if (query != null) {
      $result.query = query;
    }
    if (continuationToken != null) {
      $result.continuationToken = continuationToken;
    }
    return $result;
  }
  ListFilesRequest._() : super();
  factory ListFilesRequest.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory ListFilesRequest.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'ListFilesRequest',
      package: const $pb.PackageName(
          _omitMessageNames ? '' : 'services.filemanagement.v1'),
      createEmptyInstance: create)
    ..aOS(1, _omitFieldNames ? '' : 'query')
    ..aOS(2, _omitFieldNames ? '' : 'continuationToken')
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  ListFilesRequest clone() => ListFilesRequest()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  ListFilesRequest copyWith(void Function(ListFilesRequest) updates) =>
      super.copyWith((message) => updates(message as ListFilesRequest))
          as ListFilesRequest;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static ListFilesRequest create() => ListFilesRequest._();
  ListFilesRequest createEmptyInstance() => create();
  static $pb.PbList<ListFilesRequest> createRepeated() =>
      $pb.PbList<ListFilesRequest>();
  @$core.pragma('dart2js:noInline')
  static ListFilesRequest getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<ListFilesRequest>(create);
  static ListFilesRequest? _defaultInstance;

  /// Query to search with. If not specified, will return the most recent 100 files.
  @$pb.TagNumber(1)
  $core.String get query => $_getSZ(0);
  @$pb.TagNumber(1)
  set query($core.String v) {
    $_setString(0, v);
  }

  @$pb.TagNumber(1)
  $core.bool hasQuery() => $_has(0);
  @$pb.TagNumber(1)
  void clearQuery() => clearField(1);

  /// Token provided by previous `ListFilesRequest`
  /// if more data is available for query
  @$pb.TagNumber(2)
  $core.String get continuationToken => $_getSZ(1);
  @$pb.TagNumber(2)
  set continuationToken($core.String v) {
    $_setString(1, v);
  }

  @$pb.TagNumber(2)
  $core.bool hasContinuationToken() => $_has(1);
  @$pb.TagNumber(2)
  void clearContinuationToken() => clearField(2);
}

/// Response to `ListFilesRequest`
class ListFilesResponse extends $pb.GeneratedMessage {
  factory ListFilesResponse({
    $core.Iterable<File>? files,
    $core.bool? hasMoreResults,
    $core.String? continuationToken,
  }) {
    final $result = create();
    if (files != null) {
      $result.files.addAll(files);
    }
    if (hasMoreResults != null) {
      $result.hasMoreResults = hasMoreResults;
    }
    if (continuationToken != null) {
      $result.continuationToken = continuationToken;
    }
    return $result;
  }
  ListFilesResponse._() : super();
  factory ListFilesResponse.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory ListFilesResponse.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'ListFilesResponse',
      package: const $pb.PackageName(
          _omitMessageNames ? '' : 'services.filemanagement.v1'),
      createEmptyInstance: create)
    ..pc<File>(1, _omitFieldNames ? '' : 'files', $pb.PbFieldType.PM,
        subBuilder: File.create)
    ..aOB(2, _omitFieldNames ? '' : 'hasMoreResults')
    ..aOS(3, _omitFieldNames ? '' : 'continuationToken')
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  ListFilesResponse clone() => ListFilesResponse()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  ListFilesResponse copyWith(void Function(ListFilesResponse) updates) =>
      super.copyWith((message) => updates(message as ListFilesResponse))
          as ListFilesResponse;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static ListFilesResponse create() => ListFilesResponse._();
  ListFilesResponse createEmptyInstance() => create();
  static $pb.PbList<ListFilesResponse> createRepeated() =>
      $pb.PbList<ListFilesResponse>();
  @$core.pragma('dart2js:noInline')
  static ListFilesResponse getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<ListFilesResponse>(create);
  static ListFilesResponse? _defaultInstance;

  /// Files found by query
  @$pb.TagNumber(1)
  $core.List<File> get files => $_getList(0);

  /// Whether more results are available for this query via `continuation_token`
  @$pb.TagNumber(2)
  $core.bool get hasMoreResults => $_getBF(1);
  @$pb.TagNumber(2)
  set hasMoreResults($core.bool v) {
    $_setBool(1, v);
  }

  @$pb.TagNumber(2)
  $core.bool hasHasMoreResults() => $_has(1);
  @$pb.TagNumber(2)
  void clearHasMoreResults() => clearField(2);

  /// Token to fetch next set of results via `ListFilesRequest`
  @$pb.TagNumber(3)
  $core.String get continuationToken => $_getSZ(2);
  @$pb.TagNumber(3)
  set continuationToken($core.String v) {
    $_setString(2, v);
  }

  @$pb.TagNumber(3)
  $core.bool hasContinuationToken() => $_has(2);
  @$pb.TagNumber(3)
  void clearContinuationToken() => clearField(3);
}

/// Request to get statistics about files uploaded by this account
class GetStorageStatsRequest extends $pb.GeneratedMessage {
  factory GetStorageStatsRequest() => create();
  GetStorageStatsRequest._() : super();
  factory GetStorageStatsRequest.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory GetStorageStatsRequest.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'GetStorageStatsRequest',
      package: const $pb.PackageName(
          _omitMessageNames ? '' : 'services.filemanagement.v1'),
      createEmptyInstance: create)
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  GetStorageStatsRequest clone() =>
      GetStorageStatsRequest()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  GetStorageStatsRequest copyWith(
          void Function(GetStorageStatsRequest) updates) =>
      super.copyWith((message) => updates(message as GetStorageStatsRequest))
          as GetStorageStatsRequest;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static GetStorageStatsRequest create() => GetStorageStatsRequest._();
  GetStorageStatsRequest createEmptyInstance() => create();
  static $pb.PbList<GetStorageStatsRequest> createRepeated() =>
      $pb.PbList<GetStorageStatsRequest>();
  @$core.pragma('dart2js:noInline')
  static GetStorageStatsRequest getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<GetStorageStatsRequest>(create);
  static GetStorageStatsRequest? _defaultInstance;
}

/// Response to `GetStorageStatsRequest`
class GetStorageStatsResponse extends $pb.GeneratedMessage {
  factory GetStorageStatsResponse({
    StorageStats? stats,
  }) {
    final $result = create();
    if (stats != null) {
      $result.stats = stats;
    }
    return $result;
  }
  GetStorageStatsResponse._() : super();
  factory GetStorageStatsResponse.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory GetStorageStatsResponse.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'GetStorageStatsResponse',
      package: const $pb.PackageName(
          _omitMessageNames ? '' : 'services.filemanagement.v1'),
      createEmptyInstance: create)
    ..aOM<StorageStats>(1, _omitFieldNames ? '' : 'stats',
        subBuilder: StorageStats.create)
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  GetStorageStatsResponse clone() =>
      GetStorageStatsResponse()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  GetStorageStatsResponse copyWith(
          void Function(GetStorageStatsResponse) updates) =>
      super.copyWith((message) => updates(message as GetStorageStatsResponse))
          as GetStorageStatsResponse;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static GetStorageStatsResponse create() => GetStorageStatsResponse._();
  GetStorageStatsResponse createEmptyInstance() => create();
  static $pb.PbList<GetStorageStatsResponse> createRepeated() =>
      $pb.PbList<GetStorageStatsResponse>();
  @$core.pragma('dart2js:noInline')
  static GetStorageStatsResponse getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<GetStorageStatsResponse>(create);
  static GetStorageStatsResponse? _defaultInstance;

  @$pb.TagNumber(1)
  StorageStats get stats => $_getN(0);
  @$pb.TagNumber(1)
  set stats(StorageStats v) {
    setField(1, v);
  }

  @$pb.TagNumber(1)
  $core.bool hasStats() => $_has(0);
  @$pb.TagNumber(1)
  void clearStats() => clearField(1);
  @$pb.TagNumber(1)
  StorageStats ensureStats() => $_ensure(0);
}

const _omitFieldNames = $core.bool.fromEnvironment('protobuf.omit_field_names');
const _omitMessageNames =
    $core.bool.fromEnvironment('protobuf.omit_message_names');
