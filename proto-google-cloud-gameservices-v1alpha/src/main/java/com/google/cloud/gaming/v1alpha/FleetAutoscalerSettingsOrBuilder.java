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
// source: google/cloud/gaming/v1alpha/scaling_policies.proto

package com.google.cloud.gaming.v1alpha;

public interface FleetAutoscalerSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1alpha.FleetAutoscalerSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The size of a buffer of ready game server instances in absolute number.
   * As game server instances get allocated or terminated, the fleet will be
   * scaled up and down so that this buffer is maintained.
   * </pre>
   *
   * <code>int64 buffer_size_absolute = 1;</code>
   */
  long getBufferSizeAbsolute();

  /**
   *
   *
   * <pre>
   * The size of a buffer of ready game server instances in percentage.
   * As game server instances get allocated or terminated, the fleet will be
   * scaled up and down so that this buffer is maintained.
   * </pre>
   *
   * <code>float buffer_size_percentage = 2;</code>
   */
  float getBufferSizePercentage();

  /**
   *
   *
   * <pre>
   * The minimum fleet size.
   * </pre>
   *
   * <code>int64 min_replicas = 3;</code>
   */
  long getMinReplicas();

  /**
   *
   *
   * <pre>
   * The maximum fleet size.
   * </pre>
   *
   * <code>int64 max_replicas = 4;</code>
   */
  long getMaxReplicas();

  public com.google.cloud.gaming.v1alpha.FleetAutoscalerSettings.BufferSizeCase getBufferSizeCase();
}
