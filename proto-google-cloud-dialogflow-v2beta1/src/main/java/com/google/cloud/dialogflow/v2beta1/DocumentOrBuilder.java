/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/document.proto

package com.google.cloud.dialogflow.v2beta1;

public interface DocumentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.Document)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The document resource name.
   * The name must be empty when creating a document.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Optional. The document resource name.
   * The name must be empty when creating a document.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The display name of the document. The name must be 1024 bytes or
   * less; otherwise, the creation request fails.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the document. The name must be 1024 bytes or
   * less; otherwise, the creation request fails.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The MIME type of this document.
   * </pre>
   *
   * <code>string mime_type = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * Required. The MIME type of this document.
   * </pre>
   *
   * <code>string mime_type = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Document.KnowledgeType knowledge_types = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the knowledgeTypes.
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Document.KnowledgeType>
      getKnowledgeTypesList();
  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Document.KnowledgeType knowledge_types = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of knowledgeTypes.
   */
  int getKnowledgeTypesCount();
  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Document.KnowledgeType knowledge_types = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The knowledgeTypes at the given index.
   */
  com.google.cloud.dialogflow.v2beta1.Document.KnowledgeType getKnowledgeTypes(int index);
  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Document.KnowledgeType knowledge_types = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for knowledgeTypes.
   */
  java.util.List<java.lang.Integer> getKnowledgeTypesValueList();
  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Document.KnowledgeType knowledge_types = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of knowledgeTypes at the given index.
   */
  int getKnowledgeTypesValue(int index);

  /**
   *
   *
   * <pre>
   * The URI where the file content is located.
   * For documents stored in Google Cloud Storage, these URIs must have
   * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * NOTE: External URLs must correspond to public webpages, i.e., they must
   * be indexed by Google Search. In particular, URLs for showing documents in
   * Google Cloud Storage (i.e. the URL in your browser) are not supported.
   * Instead use the `gs://` format URI described above.
   * </pre>
   *
   * <code>string content_uri = 5;</code>
   *
   * @return Whether the contentUri field is set.
   */
  boolean hasContentUri();
  /**
   *
   *
   * <pre>
   * The URI where the file content is located.
   * For documents stored in Google Cloud Storage, these URIs must have
   * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * NOTE: External URLs must correspond to public webpages, i.e., they must
   * be indexed by Google Search. In particular, URLs for showing documents in
   * Google Cloud Storage (i.e. the URL in your browser) are not supported.
   * Instead use the `gs://` format URI described above.
   * </pre>
   *
   * <code>string content_uri = 5;</code>
   *
   * @return The contentUri.
   */
  java.lang.String getContentUri();
  /**
   *
   *
   * <pre>
   * The URI where the file content is located.
   * For documents stored in Google Cloud Storage, these URIs must have
   * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * NOTE: External URLs must correspond to public webpages, i.e., they must
   * be indexed by Google Search. In particular, URLs for showing documents in
   * Google Cloud Storage (i.e. the URL in your browser) are not supported.
   * Instead use the `gs://` format URI described above.
   * </pre>
   *
   * <code>string content_uri = 5;</code>
   *
   * @return The bytes for contentUri.
   */
  com.google.protobuf.ByteString getContentUriBytes();

  /**
   *
   *
   * <pre>
   * The raw content of the document. This field is only permitted for
   * EXTRACTIVE_QA and FAQ knowledge types.
   * Note: This field is in the process of being deprecated, please use
   * raw_content instead.
   * </pre>
   *
   * <code>string content = 6 [deprecated = true];</code>
   *
   * @return Whether the content field is set.
   */
  @java.lang.Deprecated
  boolean hasContent();
  /**
   *
   *
   * <pre>
   * The raw content of the document. This field is only permitted for
   * EXTRACTIVE_QA and FAQ knowledge types.
   * Note: This field is in the process of being deprecated, please use
   * raw_content instead.
   * </pre>
   *
   * <code>string content = 6 [deprecated = true];</code>
   *
   * @return The content.
   */
  @java.lang.Deprecated
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * The raw content of the document. This field is only permitted for
   * EXTRACTIVE_QA and FAQ knowledge types.
   * Note: This field is in the process of being deprecated, please use
   * raw_content instead.
   * </pre>
   *
   * <code>string content = 6 [deprecated = true];</code>
   *
   * @return The bytes for content.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * The raw content of the document. This field is only permitted for
   * EXTRACTIVE_QA and FAQ knowledge types.
   * </pre>
   *
   * <code>bytes raw_content = 9;</code>
   *
   * @return Whether the rawContent field is set.
   */
  boolean hasRawContent();
  /**
   *
   *
   * <pre>
   * The raw content of the document. This field is only permitted for
   * EXTRACTIVE_QA and FAQ knowledge types.
   * </pre>
   *
   * <code>bytes raw_content = 9;</code>
   *
   * @return The rawContent.
   */
  com.google.protobuf.ByteString getRawContent();

  /**
   *
   *
   * <pre>
   * Optional. If true, we try to automatically reload the document every day
   * (at a time picked by the system). If false or unspecified, we don't try
   * to automatically reload the document.
   * Currently you can only enable automatic reload for documents sourced from
   * a public url, see `source` field for the source types.
   * Reload status can be tracked in `latest_reload_status`. If a reload
   * fails, we will keep the document unchanged.
   * If a reload fails with internal errors, the system will try to reload the
   * document on the next day.
   * If a reload fails with non-retriable errors (e.g. PERMISION_DENIED), the
   * system will not try to reload the document anymore. You need to manually
   * reload the document successfully by calling `ReloadDocument` and clear the
   * errors.
   * </pre>
   *
   * <code>bool enable_auto_reload = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableAutoReload.
   */
  boolean getEnableAutoReload();

  /**
   *
   *
   * <pre>
   * Output only. The time and status of the latest reload.
   * This reload may have been triggered automatically or manually
   * and may not have succeeded.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Document.ReloadStatus latest_reload_status = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the latestReloadStatus field is set.
   */
  boolean hasLatestReloadStatus();
  /**
   *
   *
   * <pre>
   * Output only. The time and status of the latest reload.
   * This reload may have been triggered automatically or manually
   * and may not have succeeded.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Document.ReloadStatus latest_reload_status = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The latestReloadStatus.
   */
  com.google.cloud.dialogflow.v2beta1.Document.ReloadStatus getLatestReloadStatus();
  /**
   *
   *
   * <pre>
   * Output only. The time and status of the latest reload.
   * This reload may have been triggered automatically or manually
   * and may not have succeeded.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.Document.ReloadStatus latest_reload_status = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.Document.ReloadStatusOrBuilder
      getLatestReloadStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Metadata for the document. The metadata supports arbitrary
   * key-value pairs. Suggested use cases include storing a document's title,
   * an external URL distinct from the document's content_uri, etc.
   * The max size of a `key` or a `value` of the metadata is 1024 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * Optional. Metadata for the document. The metadata supports arbitrary
   * key-value pairs. Suggested use cases include storing a document's title,
   * an external URL distinct from the document's content_uri, etc.
   * The max size of a `key` or a `value` of the metadata is 1024 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * Optional. Metadata for the document. The metadata supports arbitrary
   * key-value pairs. Suggested use cases include storing a document's title,
   * an external URL distinct from the document's content_uri, etc.
   * The max size of a `key` or a `value` of the metadata is 1024 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * Optional. Metadata for the document. The metadata supports arbitrary
   * key-value pairs. Suggested use cases include storing a document's title,
   * an external URL distinct from the document's content_uri, etc.
   * The max size of a `key` or a `value` of the metadata is 1024 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getMetadataOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Metadata for the document. The metadata supports arbitrary
   * key-value pairs. Suggested use cases include storing a document's title,
   * an external URL distinct from the document's content_uri, etc.
   * The max size of a `key` or a `value` of the metadata is 1024 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);

  public com.google.cloud.dialogflow.v2beta1.Document.SourceCase getSourceCase();
}
