// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/universal-wallet/v1/universal-wallet.proto

package trinsic.services.universalwallet.v1;

public interface SearchResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.universalwallet.v1.SearchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Array of query results, as JSON strings
   * </pre>
   *
   * <code>repeated string items = 1;</code>
   * @return A list containing the items.
   */
  java.util.List<java.lang.String>
      getItemsList();
  /**
   * <pre>
   * Array of query results, as JSON strings
   * </pre>
   *
   * <code>repeated string items = 1;</code>
   * @return The count of items.
   */
  int getItemsCount();
  /**
   * <pre>
   * Array of query results, as JSON strings
   * </pre>
   *
   * <code>repeated string items = 1;</code>
   * @param index The index of the element to return.
   * @return The items at the given index.
   */
  java.lang.String getItems(int index);
  /**
   * <pre>
   * Array of query results, as JSON strings
   * </pre>
   *
   * <code>repeated string items = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the items at the given index.
   */
  com.google.protobuf.ByteString
      getItemsBytes(int index);

  /**
   * <pre>
   * Whether more results are available for this query via `continuation_token`
   * </pre>
   *
   * <code>bool has_more = 2;</code>
   * @return The hasMore.
   */
  boolean getHasMore();

  /**
   * <pre>
   * Token to fetch next set of results via `SearchRequest`
   * </pre>
   *
   * <code>string continuation_token = 4;</code>
   * @return The continuationToken.
   */
  java.lang.String getContinuationToken();
  /**
   * <pre>
   * Token to fetch next set of results via `SearchRequest`
   * </pre>
   *
   * <code>string continuation_token = 4;</code>
   * @return The bytes for continuationToken.
   */
  com.google.protobuf.ByteString
      getContinuationTokenBytes();
}
