//
//  Generated code. Do not modify.
//  source: services/options/field-options.proto
//
// @dart = 2.12

// ignore_for_file: annotate_overrides, camel_case_types
// ignore_for_file: constant_identifier_names, library_prefixes
// ignore_for_file: non_constant_identifier_names, prefer_final_fields
// ignore_for_file: unnecessary_import, unnecessary_this, unused_import

import 'dart:core' as $core;

import 'package:protobuf/protobuf.dart' as $pb;

class AnnotationOption extends $pb.GeneratedMessage {
  factory AnnotationOption() => create();
  AnnotationOption._() : super();
  factory AnnotationOption.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory AnnotationOption.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'AnnotationOption',
      package:
          const $pb.PackageName(_omitMessageNames ? '' : 'services.options'),
      createEmptyInstance: create)
    ..aOB(1, _omitFieldNames ? '' : 'active')
    ..aOS(2, _omitFieldNames ? '' : 'message')
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  AnnotationOption clone() => AnnotationOption()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  AnnotationOption copyWith(void Function(AnnotationOption) updates) =>
      super.copyWith((message) => updates(message as AnnotationOption))
          as AnnotationOption;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static AnnotationOption create() => AnnotationOption._();
  AnnotationOption createEmptyInstance() => create();
  static $pb.PbList<AnnotationOption> createRepeated() =>
      $pb.PbList<AnnotationOption>();
  @$core.pragma('dart2js:noInline')
  static AnnotationOption getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<AnnotationOption>(create);
  static AnnotationOption? _defaultInstance;

  @$pb.TagNumber(1)
  $core.bool get active => $_getBF(0);
  @$pb.TagNumber(1)
  set active($core.bool v) {
    $_setBool(0, v);
  }

  @$pb.TagNumber(1)
  $core.bool hasActive() => $_has(0);
  @$pb.TagNumber(1)
  void clearActive() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get message => $_getSZ(1);
  @$pb.TagNumber(2)
  set message($core.String v) {
    $_setString(1, v);
  }

  @$pb.TagNumber(2)
  $core.bool hasMessage() => $_has(1);
  @$pb.TagNumber(2)
  void clearMessage() => clearField(2);
}

class SdkTemplateOption extends $pb.GeneratedMessage {
  factory SdkTemplateOption() => create();
  SdkTemplateOption._() : super();
  factory SdkTemplateOption.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory SdkTemplateOption.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);

  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      _omitMessageNames ? '' : 'SdkTemplateOption',
      package:
          const $pb.PackageName(_omitMessageNames ? '' : 'services.options'),
      createEmptyInstance: create)
    ..aOB(1, _omitFieldNames ? '' : 'anonymous')
    ..aOB(2, _omitFieldNames ? '' : 'ignore')
    ..aOB(3, _omitFieldNames ? '' : 'noArguments')
    ..aOM<AnnotationOption>(4, _omitFieldNames ? '' : 'experimental',
        subBuilder: AnnotationOption.create)
    ..aOM<AnnotationOption>(5, _omitFieldNames ? '' : 'deprecated',
        subBuilder: AnnotationOption.create)
    ..hasRequiredFields = false;

  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  SdkTemplateOption clone() => SdkTemplateOption()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  SdkTemplateOption copyWith(void Function(SdkTemplateOption) updates) =>
      super.copyWith((message) => updates(message as SdkTemplateOption))
          as SdkTemplateOption;

  $pb.BuilderInfo get info_ => _i;

  @$core.pragma('dart2js:noInline')
  static SdkTemplateOption create() => SdkTemplateOption._();
  SdkTemplateOption createEmptyInstance() => create();
  static $pb.PbList<SdkTemplateOption> createRepeated() =>
      $pb.PbList<SdkTemplateOption>();
  @$core.pragma('dart2js:noInline')
  static SdkTemplateOption getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<SdkTemplateOption>(create);
  static SdkTemplateOption? _defaultInstance;

  @$pb.TagNumber(1)
  $core.bool get anonymous => $_getBF(0);
  @$pb.TagNumber(1)
  set anonymous($core.bool v) {
    $_setBool(0, v);
  }

  @$pb.TagNumber(1)
  $core.bool hasAnonymous() => $_has(0);
  @$pb.TagNumber(1)
  void clearAnonymous() => clearField(1);

  @$pb.TagNumber(2)
  $core.bool get ignore => $_getBF(1);
  @$pb.TagNumber(2)
  set ignore($core.bool v) {
    $_setBool(1, v);
  }

  @$pb.TagNumber(2)
  $core.bool hasIgnore() => $_has(1);
  @$pb.TagNumber(2)
  void clearIgnore() => clearField(2);

  @$pb.TagNumber(3)
  $core.bool get noArguments => $_getBF(2);
  @$pb.TagNumber(3)
  set noArguments($core.bool v) {
    $_setBool(2, v);
  }

  @$pb.TagNumber(3)
  $core.bool hasNoArguments() => $_has(2);
  @$pb.TagNumber(3)
  void clearNoArguments() => clearField(3);

  @$pb.TagNumber(4)
  AnnotationOption get experimental => $_getN(3);
  @$pb.TagNumber(4)
  set experimental(AnnotationOption v) {
    setField(4, v);
  }

  @$pb.TagNumber(4)
  $core.bool hasExperimental() => $_has(3);
  @$pb.TagNumber(4)
  void clearExperimental() => clearField(4);
  @$pb.TagNumber(4)
  AnnotationOption ensureExperimental() => $_ensure(3);

  @$pb.TagNumber(5)
  AnnotationOption get deprecated => $_getN(4);
  @$pb.TagNumber(5)
  set deprecated(AnnotationOption v) {
    setField(5, v);
  }

  @$pb.TagNumber(5)
  $core.bool hasDeprecated() => $_has(4);
  @$pb.TagNumber(5)
  void clearDeprecated() => clearField(5);
  @$pb.TagNumber(5)
  AnnotationOption ensureDeprecated() => $_ensure(4);
}

class Field_options {
  static final optional = $pb.Extension<$core.bool>(
      _omitMessageNames ? '' : 'google.protobuf.FieldOptions',
      _omitFieldNames ? '' : 'optional',
      60000,
      $pb.PbFieldType.OB);
  static final sdkTemplateOption = $pb.Extension<SdkTemplateOption>(
      _omitMessageNames ? '' : 'google.protobuf.MethodOptions',
      _omitFieldNames ? '' : 'sdkTemplateOption',
      60001,
      $pb.PbFieldType.OM,
      defaultOrMaker: SdkTemplateOption.getDefault,
      subBuilder: SdkTemplateOption.create);
  static void registerAllExtensions($pb.ExtensionRegistry registry) {
    registry.add(optional);
    registry.add(sdkTemplateOption);
  }
}

const _omitFieldNames = $core.bool.fromEnvironment('protobuf.omit_field_names');
const _omitMessageNames =
    $core.bool.fromEnvironment('protobuf.omit_message_names');
