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

/**
 *
 *
 * <pre>
 * Request message for [Documents.ReloadDocument][google.cloud.dialogflow.v2beta1.Documents.ReloadDocument].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.ReloadDocumentRequest}
 */
public final class ReloadDocumentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.ReloadDocumentRequest)
    ReloadDocumentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReloadDocumentRequest.newBuilder() to construct.
  private ReloadDocumentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReloadDocumentRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReloadDocumentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ReloadDocumentRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.dialogflow.v2beta1.GcsSource.Builder subBuilder = null;
              if (sourceCase_ == 3) {
                subBuilder = ((com.google.cloud.dialogflow.v2beta1.GcsSource) source_).toBuilder();
              }
              source_ =
                  input.readMessage(
                      com.google.cloud.dialogflow.v2beta1.GcsSource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.dialogflow.v2beta1.GcsSource) source_);
                source_ = subBuilder.buildPartial();
              }
              sourceCase_ = 3;
              break;
            }
          case 32:
            {
              importGcsCustomMetadata_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.DocumentProto
        .internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.DocumentProto
        .internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.class,
            com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;

  public enum SourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_SOURCE(3),
    SOURCE_NOT_SET(0);
    private final int value;

    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 3:
          return GCS_SOURCE;
        case 0:
          return SOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase getSourceCase() {
    return SourceCase.forNumber(sourceCase_);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The name of the document to reload.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the document to reload.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCS_SOURCE_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * The path for a Cloud Storage source file for reloading document content.
   * If not provided, the Document's existing source will be reloaded.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  @java.lang.Override
  public boolean hasGcsSource() {
    return sourceCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * The path for a Cloud Storage source file for reloading document content.
   * If not provided, the Document's existing source will be reloaded.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
   *
   * @return The gcsSource.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.GcsSource getGcsSource() {
    if (sourceCase_ == 3) {
      return (com.google.cloud.dialogflow.v2beta1.GcsSource) source_;
    }
    return com.google.cloud.dialogflow.v2beta1.GcsSource.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * The path for a Cloud Storage source file for reloading document content.
   * If not provided, the Document's existing source will be reloaded.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
    if (sourceCase_ == 3) {
      return (com.google.cloud.dialogflow.v2beta1.GcsSource) source_;
    }
    return com.google.cloud.dialogflow.v2beta1.GcsSource.getDefaultInstance();
  }

  public static final int IMPORT_GCS_CUSTOM_METADATA_FIELD_NUMBER = 4;
  private boolean importGcsCustomMetadata_;
  /**
   *
   *
   * <pre>
   * Whether to import custom metadata from Google Cloud Storage.
   * Only valid when the document source is Google Cloud Storage URI.
   * </pre>
   *
   * <code>bool import_gcs_custom_metadata = 4;</code>
   *
   * @return The importGcsCustomMetadata.
   */
  @java.lang.Override
  public boolean getImportGcsCustomMetadata() {
    return importGcsCustomMetadata_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (sourceCase_ == 3) {
      output.writeMessage(3, (com.google.cloud.dialogflow.v2beta1.GcsSource) source_);
    }
    if (importGcsCustomMetadata_ != false) {
      output.writeBool(4, importGcsCustomMetadata_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (sourceCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.cloud.dialogflow.v2beta1.GcsSource) source_);
    }
    if (importGcsCustomMetadata_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, importGcsCustomMetadata_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest other =
        (com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (getImportGcsCustomMetadata() != other.getImportGcsCustomMetadata()) return false;
    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 3:
        if (!getGcsSource().equals(other.getGcsSource())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + IMPORT_GCS_CUSTOM_METADATA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getImportGcsCustomMetadata());
    switch (sourceCase_) {
      case 3:
        hash = (37 * hash) + GCS_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getGcsSource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for [Documents.ReloadDocument][google.cloud.dialogflow.v2beta1.Documents.ReloadDocument].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.ReloadDocumentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.ReloadDocumentRequest)
      com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.DocumentProto
          .internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.DocumentProto
          .internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.class,
              com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      importGcsCustomMetadata_ = false;

      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.DocumentProto
          .internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest build() {
      com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest result =
          new com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest(this);
      result.name_ = name_;
      if (sourceCase_ == 3) {
        if (gcsSourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = gcsSourceBuilder_.build();
        }
      }
      result.importGcsCustomMetadata_ = importGcsCustomMetadata_;
      result.sourceCase_ = sourceCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getImportGcsCustomMetadata() != false) {
        setImportGcsCustomMetadata(other.getImportGcsCustomMetadata());
      }
      switch (other.getSourceCase()) {
        case GCS_SOURCE:
          {
            mergeGcsSource(other.getGcsSource());
            break;
          }
        case SOURCE_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int sourceCase_ = 0;
    private java.lang.Object source_;

    public SourceCase getSourceCase() {
      return SourceCase.forNumber(sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the document to reload.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the document to reload.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the document to reload.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the document to reload.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the document to reload.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.GcsSource,
            com.google.cloud.dialogflow.v2beta1.GcsSource.Builder,
            com.google.cloud.dialogflow.v2beta1.GcsSourceOrBuilder>
        gcsSourceBuilder_;
    /**
     *
     *
     * <pre>
     * The path for a Cloud Storage source file for reloading document content.
     * If not provided, the Document's existing source will be reloaded.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
     *
     * @return Whether the gcsSource field is set.
     */
    @java.lang.Override
    public boolean hasGcsSource() {
      return sourceCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * The path for a Cloud Storage source file for reloading document content.
     * If not provided, the Document's existing source will be reloaded.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
     *
     * @return The gcsSource.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.GcsSource getGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 3) {
          return (com.google.cloud.dialogflow.v2beta1.GcsSource) source_;
        }
        return com.google.cloud.dialogflow.v2beta1.GcsSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 3) {
          return gcsSourceBuilder_.getMessage();
        }
        return com.google.cloud.dialogflow.v2beta1.GcsSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The path for a Cloud Storage source file for reloading document content.
     * If not provided, the Document's existing source will be reloaded.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
     */
    public Builder setGcsSource(com.google.cloud.dialogflow.v2beta1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The path for a Cloud Storage source file for reloading document content.
     * If not provided, the Document's existing source will be reloaded.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
     */
    public Builder setGcsSource(
        com.google.cloud.dialogflow.v2beta1.GcsSource.Builder builderForValue) {
      if (gcsSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The path for a Cloud Storage source file for reloading document content.
     * If not provided, the Document's existing source will be reloaded.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
     */
    public Builder mergeGcsSource(com.google.cloud.dialogflow.v2beta1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 3
            && source_ != com.google.cloud.dialogflow.v2beta1.GcsSource.getDefaultInstance()) {
          source_ =
              com.google.cloud.dialogflow.v2beta1.GcsSource.newBuilder(
                      (com.google.cloud.dialogflow.v2beta1.GcsSource) source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 3) {
          gcsSourceBuilder_.mergeFrom(value);
        }
        gcsSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The path for a Cloud Storage source file for reloading document content.
     * If not provided, the Document's existing source will be reloaded.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
     */
    public Builder clearGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 3) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 3) {
          sourceCase_ = 0;
          source_ = null;
        }
        gcsSourceBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The path for a Cloud Storage source file for reloading document content.
     * If not provided, the Document's existing source will be reloaded.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.GcsSource.Builder getGcsSourceBuilder() {
      return getGcsSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The path for a Cloud Storage source file for reloading document content.
     * If not provided, the Document's existing source will be reloaded.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
      if ((sourceCase_ == 3) && (gcsSourceBuilder_ != null)) {
        return gcsSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 3) {
          return (com.google.cloud.dialogflow.v2beta1.GcsSource) source_;
        }
        return com.google.cloud.dialogflow.v2beta1.GcsSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The path for a Cloud Storage source file for reloading document content.
     * If not provided, the Document's existing source will be reloaded.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.GcsSource,
            com.google.cloud.dialogflow.v2beta1.GcsSource.Builder,
            com.google.cloud.dialogflow.v2beta1.GcsSourceOrBuilder>
        getGcsSourceFieldBuilder() {
      if (gcsSourceBuilder_ == null) {
        if (!(sourceCase_ == 3)) {
          source_ = com.google.cloud.dialogflow.v2beta1.GcsSource.getDefaultInstance();
        }
        gcsSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2beta1.GcsSource,
                com.google.cloud.dialogflow.v2beta1.GcsSource.Builder,
                com.google.cloud.dialogflow.v2beta1.GcsSourceOrBuilder>(
                (com.google.cloud.dialogflow.v2beta1.GcsSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 3;
      onChanged();
      ;
      return gcsSourceBuilder_;
    }

    private boolean importGcsCustomMetadata_;
    /**
     *
     *
     * <pre>
     * Whether to import custom metadata from Google Cloud Storage.
     * Only valid when the document source is Google Cloud Storage URI.
     * </pre>
     *
     * <code>bool import_gcs_custom_metadata = 4;</code>
     *
     * @return The importGcsCustomMetadata.
     */
    @java.lang.Override
    public boolean getImportGcsCustomMetadata() {
      return importGcsCustomMetadata_;
    }
    /**
     *
     *
     * <pre>
     * Whether to import custom metadata from Google Cloud Storage.
     * Only valid when the document source is Google Cloud Storage URI.
     * </pre>
     *
     * <code>bool import_gcs_custom_metadata = 4;</code>
     *
     * @param value The importGcsCustomMetadata to set.
     * @return This builder for chaining.
     */
    public Builder setImportGcsCustomMetadata(boolean value) {

      importGcsCustomMetadata_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to import custom metadata from Google Cloud Storage.
     * Only valid when the document source is Google Cloud Storage URI.
     * </pre>
     *
     * <code>bool import_gcs_custom_metadata = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImportGcsCustomMetadata() {

      importGcsCustomMetadata_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.ReloadDocumentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.ReloadDocumentRequest)
  private static final com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReloadDocumentRequest> PARSER =
      new com.google.protobuf.AbstractParser<ReloadDocumentRequest>() {
        @java.lang.Override
        public ReloadDocumentRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReloadDocumentRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ReloadDocumentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReloadDocumentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
