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
// source: google/cloud/dialogflow/v2/version.proto

package com.google.cloud.dialogflow.v2;

public final class VersionProto {
  private VersionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Version_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Version_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListVersionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListVersionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UpdateVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteVersionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "(google/cloud/dialogflow/v2/version.pro"
          + "to\022\032google.cloud.dialogflow.v2\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\033google/protobuf/empty.proto\032"
          + " google/protobuf/field_mask.proto\032\037google/protobuf/timestamp.proto\"\303\003\n"
          + "\007Version\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022\030\n"
          + "\013description\030\002 \001(\tB\003\340A\001\022\033\n"
          + "\016version_number\030\003 \001(\005B\003\340A\003\0224\n"
          + "\013create_time\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022F\n"
          + "\006status\030\006"
          + " \001(\01621.google.cloud.dialogflow.v2.Version.VersionStatusB\003\340A\003\"W\n\r"
          + "VersionStatus\022\036\n"
          + "\032VERSION_STATUS_UNSPECIFIED\020\000\022\017\n"
          + "\013IN_PROGRESS\020\001\022\t\n"
          + "\005READY\020\002\022\n\n"
          + "\006FAILED\020\003:\226\001\352A\222\001\n"
          + "!dialogflow.googleapis.com/Version\022+projects/{project}/agent/versions/{version}\022@projects/{project}/locations/{location}/agent/versions/{version}\"\201\001\n"
          + "\023ListVersionsRequest\0229\n"
          + "\006parent\030\001 \001("
          + "\tB)\340A\002\372A#\022!dialogflow.googleapis.com/Version\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\"f\n"
          + "\024ListVersionsResponse\0225\n"
          + "\010versions\030\001 \003(\0132#.google.cloud.dialogflow.v2.Version\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"L\n"
          + "\021GetVersionRequest\0227\n"
          + "\004name\030\001 \001(\tB)\340A\002\372A#\n"
          + "!dialogflow.googleapis.com/Version\"\214\001\n"
          + "\024CreateVersionRequest\0229\n"
          + "\006parent\030\001 \001("
          + "\tB)\340A\002\372A#\022!dialogflow.googleapis.com/Version\0229\n"
          + "\007version\030\002"
          + " \001(\0132#.google.cloud.dialogflow.v2.VersionB\003\340A\002\"\207\001\n"
          + "\024UpdateVersionRequest\0229\n"
          + "\007version\030\001"
          + " \001(\0132#.google.cloud.dialogflow.v2.VersionB\003\340A\002\0224\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\"O\n"
          + "\024DeleteVersionRequest\0227\n"
          + "\004name\030\001 \001(\tB)\340A\002\372A#\n"
          + "!dialogflow.googleapis.com/Version2\374\t\n"
          + "\010Versions\022\340\001\n"
          + "\014ListVersions\022/.google.cloud.dialogflow.v2.ListVersi"
          + "onsRequest\0320.google.cloud.dialogflow.v2.ListVersionsResponse\"m\202\323\344\223\002^\022&/v2/{parent=projects/*/agent}/versionsZ4\0222/v2/{parent=projects/*/locations/*/agent}/versions\332A\006parent\022\315\001\n\n"
          + "GetVersion\022-.google.cloud.dialogflow.v2.GetVersionRequest\032#.google.cloud.dialogflow.v2.Version\"k\202\323\344\223\002^\022&/v2/{name=projects/*/agent/versions/*}Z4\0222/v2/{name=projects/*/locations/*/agent/versions/*}\332A\004name\022\360\001\n\r"
          + "CreateVersion\0220.google.cloud.dialogflow.v2.CreateVersion"
          + "Request\032#.google.cloud.dialogflow.v2.Version\"\207\001\202\323\344\223\002p\"&/v2/{parent=projects/*/agent}/versions:\007versionZ=\"2/v2/{parent=projects/*/locations/*/agent}/versions:\007version\332A\016parent,version\022\206\002\n\r"
          + "UpdateVersion\0220.google.cloud.dialogflow.v2.UpdateVers"
          + "ionRequest\032#.google.cloud.dialogflow.v2.Version\"\235\001\202\323\344\223\002\200\0012./v2/{version.name=projects/*/agent/versions/*}:\007versionZE2:/v2/{version.name=projects/*/locations/*/agent/versions/*}:\007version\332A\023version,update_mask\022\306\001\n\r"
          + "DeleteVersion\0220.google.cloud.dialogflow.v2.DeleteVersionRequest\032\026.go"
          + "ogle.protobuf.Empty\"k\202\323\344\223\002^*&/v2/{name=p"
          + "rojects/*/agent/versions/*}Z4*2/v2/{name=projects/*/locations/*/agent/versions/*}\332A\004name\032x\312A\031dialogflow.googleapis.com\322AYhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflowB\233\001\n"
          + "\036com.google.cloud.dialogflow.v2B\014VersionProtoP\001ZDgoogle.golang.org"
          + "/genproto/googleapis/cloud/dialogflow/v2"
          + ";dialogflow\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogflow.V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_Version_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Version_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Version_descriptor,
            new java.lang.String[] {
              "Name", "Description", "VersionNumber", "CreateTime", "Status",
            });
    internal_static_google_cloud_dialogflow_v2_ListVersionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_ListVersionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListVersionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListVersionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListVersionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListVersionsResponse_descriptor,
            new java.lang.String[] {
              "Versions", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_GetVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_GetVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetVersionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_CreateVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_CreateVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateVersionRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Version",
            });
    internal_static_google_cloud_dialogflow_v2_UpdateVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_UpdateVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UpdateVersionRequest_descriptor,
            new java.lang.String[] {
              "Version", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_DeleteVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteVersionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
