/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/gaming/v1alpha/realms.proto

package com.google.cloud.gaming.v1alpha;

public interface CreateRealmRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1alpha.CreateRealmRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name, using the form:
   * `projects/{project_id}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource name, using the form:
   * `projects/{project_id}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The ID of the realm resource to be created.
   * </pre>
   *
   * <code>string realm_id = 2;</code>
   */
  java.lang.String getRealmId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the realm resource to be created.
   * </pre>
   *
   * <code>string realm_id = 2;</code>
   */
  com.google.protobuf.ByteString getRealmIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The realm resource to be created.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
   */
  boolean hasRealm();
  /**
   *
   *
   * <pre>
   * Required. The realm resource to be created.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
   */
  com.google.cloud.gaming.v1alpha.Realm getRealm();
  /**
   *
   *
   * <pre>
   * Required. The realm resource to be created.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
   */
  com.google.cloud.gaming.v1alpha.RealmOrBuilder getRealmOrBuilder();
}
