// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/provider.proto

package trinsic.services.common.v1;

public interface GrantOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.provider.v1.Grant)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * the urn of the resource
   * </pre>
   *
   * <code>string resourceId = 1;</code>
   *
   * @return The resourceId.
   */
  java.lang.String getResourceId();
  /**
   *
   *
   * <pre>
   * the urn of the resource
   * </pre>
   *
   * <code>string resourceId = 1;</code>
   *
   * @return The bytes for resourceId.
   */
  com.google.protobuf.ByteString getResourceIdBytes();

  /**
   *
   *
   * <pre>
   * list of actions that are allowed
   * </pre>
   *
   * <code>repeated string actions = 2;</code>
   *
   * @return A list containing the actions.
   */
  java.util.List<java.lang.String> getActionsList();
  /**
   *
   *
   * <pre>
   * list of actions that are allowed
   * </pre>
   *
   * <code>repeated string actions = 2;</code>
   *
   * @return The count of actions.
   */
  int getActionsCount();
  /**
   *
   *
   * <pre>
   * list of actions that are allowed
   * </pre>
   *
   * <code>repeated string actions = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The actions at the given index.
   */
  java.lang.String getActions(int index);
  /**
   *
   *
   * <pre>
   * list of actions that are allowed
   * </pre>
   *
   * <code>repeated string actions = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the actions at the given index.
   */
  com.google.protobuf.ByteString getActionsBytes(int index);

  /**
   *
   *
   * <pre>
   * any child grants
   * </pre>
   *
   * <code>repeated .services.provider.v1.Grant child_grants = 3;</code>
   */
  java.util.List<trinsic.services.common.v1.Grant> getChildGrantsList();
  /**
   *
   *
   * <pre>
   * any child grants
   * </pre>
   *
   * <code>repeated .services.provider.v1.Grant child_grants = 3;</code>
   */
  trinsic.services.common.v1.Grant getChildGrants(int index);
  /**
   *
   *
   * <pre>
   * any child grants
   * </pre>
   *
   * <code>repeated .services.provider.v1.Grant child_grants = 3;</code>
   */
  int getChildGrantsCount();
  /**
   *
   *
   * <pre>
   * any child grants
   * </pre>
   *
   * <code>repeated .services.provider.v1.Grant child_grants = 3;</code>
   */
  java.util.List<? extends trinsic.services.common.v1.GrantOrBuilder> getChildGrantsOrBuilderList();
  /**
   *
   *
   * <pre>
   * any child grants
   * </pre>
   *
   * <code>repeated .services.provider.v1.Grant child_grants = 3;</code>
   */
  trinsic.services.common.v1.GrantOrBuilder getChildGrantsOrBuilder(int index);
}
