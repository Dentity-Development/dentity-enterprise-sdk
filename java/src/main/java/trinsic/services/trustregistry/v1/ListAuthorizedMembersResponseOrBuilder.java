// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/trust-registry/v1/trust-registry.proto

package trinsic.services.trustregistry.v1;

public interface ListAuthorizedMembersResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.trustregistry.v1.ListAuthorizedMembersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * JSON string containing array of resultant objects
   * </pre>
   *
   * <code>repeated .services.trustregistry.v1.AuthorizedMember authorized_members = 1;</code>
   */
  java.util.List<trinsic.services.trustregistry.v1.AuthorizedMember> getAuthorizedMembersList();
  /**
   *
   *
   * <pre>
   * JSON string containing array of resultant objects
   * </pre>
   *
   * <code>repeated .services.trustregistry.v1.AuthorizedMember authorized_members = 1;</code>
   */
  trinsic.services.trustregistry.v1.AuthorizedMember getAuthorizedMembers(int index);
  /**
   *
   *
   * <pre>
   * JSON string containing array of resultant objects
   * </pre>
   *
   * <code>repeated .services.trustregistry.v1.AuthorizedMember authorized_members = 1;</code>
   */
  int getAuthorizedMembersCount();
  /**
   *
   *
   * <pre>
   * JSON string containing array of resultant objects
   * </pre>
   *
   * <code>repeated .services.trustregistry.v1.AuthorizedMember authorized_members = 1;</code>
   */
  java.util.List<? extends trinsic.services.trustregistry.v1.AuthorizedMemberOrBuilder>
      getAuthorizedMembersOrBuilderList();
  /**
   *
   *
   * <pre>
   * JSON string containing array of resultant objects
   * </pre>
   *
   * <code>repeated .services.trustregistry.v1.AuthorizedMember authorized_members = 1;</code>
   */
  trinsic.services.trustregistry.v1.AuthorizedMemberOrBuilder getAuthorizedMembersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Whether more data is available to fetch for query
   * </pre>
   *
   * <code>bool has_more_results = 2;</code>
   *
   * @return The hasMoreResults.
   */
  boolean getHasMoreResults();

  /**
   *
   *
   * <pre>
   * Token to fetch next set of results via `ListAuthorizedMembersRequest`
   * </pre>
   *
   * <code>string continuation_token = 3;</code>
   *
   * @return The continuationToken.
   */
  java.lang.String getContinuationToken();
  /**
   *
   *
   * <pre>
   * Token to fetch next set of results via `ListAuthorizedMembersRequest`
   * </pre>
   *
   * <code>string continuation_token = 3;</code>
   *
   * @return The bytes for continuationToken.
   */
  com.google.protobuf.ByteString getContinuationTokenBytes();
}