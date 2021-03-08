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
// source: google/cloud/dialogflow/v2beta1/conversation_profile.proto

package com.google.cloud.dialogflow.v2beta1;

public interface UpdateConversationProfileRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The conversation profile to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the conversationProfile field is set.
   */
  boolean hasConversationProfile();
  /**
   *
   *
   * <pre>
   * Required. The conversation profile to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The conversationProfile.
   */
  com.google.cloud.dialogflow.v2beta1.ConversationProfile getConversationProfile();
  /**
   *
   *
   * <pre>
   * Required. The conversation profile to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.ConversationProfileOrBuilder
      getConversationProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The mask to control which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The mask to control which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The mask to control which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
