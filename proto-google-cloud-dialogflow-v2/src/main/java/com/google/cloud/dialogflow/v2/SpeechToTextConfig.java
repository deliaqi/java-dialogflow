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
// source: google/cloud/dialogflow/v2/audio_config.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Configures speech transcription for [ConversationProfile][google.cloud.dialogflow.v2.ConversationProfile].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.SpeechToTextConfig}
 */
public final class SpeechToTextConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.SpeechToTextConfig)
    SpeechToTextConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SpeechToTextConfig.newBuilder() to construct.
  private SpeechToTextConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SpeechToTextConfig() {
    speechModelVariant_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SpeechToTextConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SpeechToTextConfig(
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
          case 8:
            {
              int rawValue = input.readEnum();

              speechModelVariant_ = rawValue;
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
    return com.google.cloud.dialogflow.v2.AudioConfigProto
        .internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.AudioConfigProto
        .internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.SpeechToTextConfig.class,
            com.google.cloud.dialogflow.v2.SpeechToTextConfig.Builder.class);
  }

  public static final int SPEECH_MODEL_VARIANT_FIELD_NUMBER = 1;
  private int speechModelVariant_;
  /**
   *
   *
   * <pre>
   * Optional. The speech model used in speech to text.
   * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
   * `USE_ENHANCED`. It can be overridden in [AnalyzeContentRequest][google.cloud.dialogflow.v2.AnalyzeContentRequest] and
   * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2.StreamingAnalyzeContentRequest] request.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.SpeechModelVariant speech_model_variant = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for speechModelVariant.
   */
  @java.lang.Override
  public int getSpeechModelVariantValue() {
    return speechModelVariant_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The speech model used in speech to text.
   * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
   * `USE_ENHANCED`. It can be overridden in [AnalyzeContentRequest][google.cloud.dialogflow.v2.AnalyzeContentRequest] and
   * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2.StreamingAnalyzeContentRequest] request.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.SpeechModelVariant speech_model_variant = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The speechModelVariant.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SpeechModelVariant getSpeechModelVariant() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dialogflow.v2.SpeechModelVariant result =
        com.google.cloud.dialogflow.v2.SpeechModelVariant.valueOf(speechModelVariant_);
    return result == null ? com.google.cloud.dialogflow.v2.SpeechModelVariant.UNRECOGNIZED : result;
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
    if (speechModelVariant_
        != com.google.cloud.dialogflow.v2.SpeechModelVariant.SPEECH_MODEL_VARIANT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, speechModelVariant_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (speechModelVariant_
        != com.google.cloud.dialogflow.v2.SpeechModelVariant.SPEECH_MODEL_VARIANT_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, speechModelVariant_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.SpeechToTextConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.SpeechToTextConfig other =
        (com.google.cloud.dialogflow.v2.SpeechToTextConfig) obj;

    if (speechModelVariant_ != other.speechModelVariant_) return false;
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
    hash = (37 * hash) + SPEECH_MODEL_VARIANT_FIELD_NUMBER;
    hash = (53 * hash) + speechModelVariant_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.SpeechToTextConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SpeechToTextConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SpeechToTextConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SpeechToTextConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SpeechToTextConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SpeechToTextConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SpeechToTextConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SpeechToTextConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SpeechToTextConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SpeechToTextConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SpeechToTextConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SpeechToTextConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.SpeechToTextConfig prototype) {
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
   * Configures speech transcription for [ConversationProfile][google.cloud.dialogflow.v2.ConversationProfile].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.SpeechToTextConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.SpeechToTextConfig)
      com.google.cloud.dialogflow.v2.SpeechToTextConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.SpeechToTextConfig.class,
              com.google.cloud.dialogflow.v2.SpeechToTextConfig.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.SpeechToTextConfig.newBuilder()
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
      speechModelVariant_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SpeechToTextConfig getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.SpeechToTextConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SpeechToTextConfig build() {
      com.google.cloud.dialogflow.v2.SpeechToTextConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SpeechToTextConfig buildPartial() {
      com.google.cloud.dialogflow.v2.SpeechToTextConfig result =
          new com.google.cloud.dialogflow.v2.SpeechToTextConfig(this);
      result.speechModelVariant_ = speechModelVariant_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.SpeechToTextConfig) {
        return mergeFrom((com.google.cloud.dialogflow.v2.SpeechToTextConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.SpeechToTextConfig other) {
      if (other == com.google.cloud.dialogflow.v2.SpeechToTextConfig.getDefaultInstance())
        return this;
      if (other.speechModelVariant_ != 0) {
        setSpeechModelVariantValue(other.getSpeechModelVariantValue());
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
      com.google.cloud.dialogflow.v2.SpeechToTextConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2.SpeechToTextConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int speechModelVariant_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. The speech model used in speech to text.
     * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
     * `USE_ENHANCED`. It can be overridden in [AnalyzeContentRequest][google.cloud.dialogflow.v2.AnalyzeContentRequest] and
     * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2.StreamingAnalyzeContentRequest] request.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.SpeechModelVariant speech_model_variant = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for speechModelVariant.
     */
    @java.lang.Override
    public int getSpeechModelVariantValue() {
      return speechModelVariant_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The speech model used in speech to text.
     * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
     * `USE_ENHANCED`. It can be overridden in [AnalyzeContentRequest][google.cloud.dialogflow.v2.AnalyzeContentRequest] and
     * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2.StreamingAnalyzeContentRequest] request.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.SpeechModelVariant speech_model_variant = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for speechModelVariant to set.
     * @return This builder for chaining.
     */
    public Builder setSpeechModelVariantValue(int value) {

      speechModelVariant_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The speech model used in speech to text.
     * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
     * `USE_ENHANCED`. It can be overridden in [AnalyzeContentRequest][google.cloud.dialogflow.v2.AnalyzeContentRequest] and
     * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2.StreamingAnalyzeContentRequest] request.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.SpeechModelVariant speech_model_variant = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The speechModelVariant.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SpeechModelVariant getSpeechModelVariant() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dialogflow.v2.SpeechModelVariant result =
          com.google.cloud.dialogflow.v2.SpeechModelVariant.valueOf(speechModelVariant_);
      return result == null
          ? com.google.cloud.dialogflow.v2.SpeechModelVariant.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. The speech model used in speech to text.
     * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
     * `USE_ENHANCED`. It can be overridden in [AnalyzeContentRequest][google.cloud.dialogflow.v2.AnalyzeContentRequest] and
     * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2.StreamingAnalyzeContentRequest] request.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.SpeechModelVariant speech_model_variant = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The speechModelVariant to set.
     * @return This builder for chaining.
     */
    public Builder setSpeechModelVariant(com.google.cloud.dialogflow.v2.SpeechModelVariant value) {
      if (value == null) {
        throw new NullPointerException();
      }

      speechModelVariant_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The speech model used in speech to text.
     * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
     * `USE_ENHANCED`. It can be overridden in [AnalyzeContentRequest][google.cloud.dialogflow.v2.AnalyzeContentRequest] and
     * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2.StreamingAnalyzeContentRequest] request.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.SpeechModelVariant speech_model_variant = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSpeechModelVariant() {

      speechModelVariant_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.SpeechToTextConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.SpeechToTextConfig)
  private static final com.google.cloud.dialogflow.v2.SpeechToTextConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.SpeechToTextConfig();
  }

  public static com.google.cloud.dialogflow.v2.SpeechToTextConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpeechToTextConfig> PARSER =
      new com.google.protobuf.AbstractParser<SpeechToTextConfig>() {
        @java.lang.Override
        public SpeechToTextConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SpeechToTextConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SpeechToTextConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeechToTextConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SpeechToTextConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
