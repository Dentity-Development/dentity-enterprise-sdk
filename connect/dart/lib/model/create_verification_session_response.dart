//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateVerificationSessionResponse {
  /// Returns a new [CreateVerificationSessionResponse] instance.
  CreateVerificationSessionResponse({
    required this.sessionId,
    required this.launchUrl,
  });

  /// The ID of the created VerificationSession.                This should be saved in your system for record-keeping and to retrieve the results of the verification session.
  String sessionId;

  /// The URL that your user should be sent to in order to perform the verification.
  String launchUrl;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is CreateVerificationSessionResponse &&
          other.sessionId == sessionId &&
          other.launchUrl == launchUrl;

  @override
  int get hashCode =>
      // ignore: unnecessary_parenthesis
      (sessionId.hashCode) + (launchUrl.hashCode);

  @override
  String toString() =>
      'CreateVerificationSessionResponse[sessionId=$sessionId, launchUrl=$launchUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    json[r'sessionId'] = this.sessionId;
    json[r'launchUrl'] = this.launchUrl;
    return json;
  }

  /// Returns a new [CreateVerificationSessionResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateVerificationSessionResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key),
              'Required key "CreateVerificationSessionResponse[$key]" is missing from JSON.');
          assert(json[key] != null,
              'Required key "CreateVerificationSessionResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateVerificationSessionResponse(
        sessionId: mapValueOfType<String>(json, r'sessionId')!,
        launchUrl: mapValueOfType<String>(json, r'launchUrl')!,
      );
    }
    return null;
  }

  static List<CreateVerificationSessionResponse> listFromJson(
    dynamic json, {
    bool growable = false,
  }) {
    final result = <CreateVerificationSessionResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateVerificationSessionResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateVerificationSessionResponse> mapFromJson(
      dynamic json) {
    final map = <String, CreateVerificationSessionResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateVerificationSessionResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateVerificationSessionResponse-objects as value to a dart map
  static Map<String, List<CreateVerificationSessionResponse>> mapListFromJson(
    dynamic json, {
    bool growable = false,
  }) {
    final map = <String, List<CreateVerificationSessionResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateVerificationSessionResponse.listFromJson(
          entry.value,
          growable: growable,
        );
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'sessionId',
    'launchUrl',
  };
}