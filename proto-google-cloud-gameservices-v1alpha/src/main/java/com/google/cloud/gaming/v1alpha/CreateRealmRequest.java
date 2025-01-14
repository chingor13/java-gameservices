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

/**
 *
 *
 * <pre>
 * Request message for RealmsService.CreateRealm.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1alpha.CreateRealmRequest}
 */
public final class CreateRealmRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1alpha.CreateRealmRequest)
    CreateRealmRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateRealmRequest.newBuilder() to construct.
  private CreateRealmRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateRealmRequest() {
    parent_ = "";
    realmId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateRealmRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              realmId_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.gaming.v1alpha.Realm.Builder subBuilder = null;
              if (realm_ != null) {
                subBuilder = realm_.toBuilder();
              }
              realm_ =
                  input.readMessage(
                      com.google.cloud.gaming.v1alpha.Realm.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(realm_);
                realm_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.gaming.v1alpha.Realms
        .internal_static_google_cloud_gaming_v1alpha_CreateRealmRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1alpha.Realms
        .internal_static_google_cloud_gaming_v1alpha_CreateRealmRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1alpha.CreateRealmRequest.class,
            com.google.cloud.gaming.v1alpha.CreateRealmRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
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
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
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
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REALM_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object realmId_;
  /**
   *
   *
   * <pre>
   * Required. The ID of the realm resource to be created.
   * </pre>
   *
   * <code>string realm_id = 2;</code>
   */
  public java.lang.String getRealmId() {
    java.lang.Object ref = realmId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      realmId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID of the realm resource to be created.
   * </pre>
   *
   * <code>string realm_id = 2;</code>
   */
  public com.google.protobuf.ByteString getRealmIdBytes() {
    java.lang.Object ref = realmId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      realmId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REALM_FIELD_NUMBER = 3;
  private com.google.cloud.gaming.v1alpha.Realm realm_;
  /**
   *
   *
   * <pre>
   * Required. The realm resource to be created.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
   */
  public boolean hasRealm() {
    return realm_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The realm resource to be created.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
   */
  public com.google.cloud.gaming.v1alpha.Realm getRealm() {
    return realm_ == null ? com.google.cloud.gaming.v1alpha.Realm.getDefaultInstance() : realm_;
  }
  /**
   *
   *
   * <pre>
   * Required. The realm resource to be created.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
   */
  public com.google.cloud.gaming.v1alpha.RealmOrBuilder getRealmOrBuilder() {
    return getRealm();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!getRealmIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, realmId_);
    }
    if (realm_ != null) {
      output.writeMessage(3, getRealm());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!getRealmIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, realmId_);
    }
    if (realm_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getRealm());
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
    if (!(obj instanceof com.google.cloud.gaming.v1alpha.CreateRealmRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1alpha.CreateRealmRequest other =
        (com.google.cloud.gaming.v1alpha.CreateRealmRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getRealmId().equals(other.getRealmId())) return false;
    if (hasRealm() != other.hasRealm()) return false;
    if (hasRealm()) {
      if (!getRealm().equals(other.getRealm())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + REALM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRealmId().hashCode();
    if (hasRealm()) {
      hash = (37 * hash) + REALM_FIELD_NUMBER;
      hash = (53 * hash) + getRealm().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1alpha.CreateRealmRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.CreateRealmRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.CreateRealmRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.CreateRealmRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.CreateRealmRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.CreateRealmRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.CreateRealmRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.CreateRealmRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.CreateRealmRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.CreateRealmRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.CreateRealmRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.CreateRealmRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gaming.v1alpha.CreateRealmRequest prototype) {
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
   * Request message for RealmsService.CreateRealm.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1alpha.CreateRealmRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1alpha.CreateRealmRequest)
      com.google.cloud.gaming.v1alpha.CreateRealmRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gaming.v1alpha.Realms
          .internal_static_google_cloud_gaming_v1alpha_CreateRealmRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1alpha.Realms
          .internal_static_google_cloud_gaming_v1alpha_CreateRealmRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1alpha.CreateRealmRequest.class,
              com.google.cloud.gaming.v1alpha.CreateRealmRequest.Builder.class);
    }

    // Construct using com.google.cloud.gaming.v1alpha.CreateRealmRequest.newBuilder()
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
      parent_ = "";

      realmId_ = "";

      if (realmBuilder_ == null) {
        realm_ = null;
      } else {
        realm_ = null;
        realmBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gaming.v1alpha.Realms
          .internal_static_google_cloud_gaming_v1alpha_CreateRealmRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.CreateRealmRequest getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1alpha.CreateRealmRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.CreateRealmRequest build() {
      com.google.cloud.gaming.v1alpha.CreateRealmRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.CreateRealmRequest buildPartial() {
      com.google.cloud.gaming.v1alpha.CreateRealmRequest result =
          new com.google.cloud.gaming.v1alpha.CreateRealmRequest(this);
      result.parent_ = parent_;
      result.realmId_ = realmId_;
      if (realmBuilder_ == null) {
        result.realm_ = realm_;
      } else {
        result.realm_ = realmBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.gaming.v1alpha.CreateRealmRequest) {
        return mergeFrom((com.google.cloud.gaming.v1alpha.CreateRealmRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gaming.v1alpha.CreateRealmRequest other) {
      if (other == com.google.cloud.gaming.v1alpha.CreateRealmRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getRealmId().isEmpty()) {
        realmId_ = other.realmId_;
        onChanged();
      }
      if (other.hasRealm()) {
        mergeRealm(other.getRealm());
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
      com.google.cloud.gaming.v1alpha.CreateRealmRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gaming.v1alpha.CreateRealmRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
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
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
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
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
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
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
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
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
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
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object realmId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID of the realm resource to be created.
     * </pre>
     *
     * <code>string realm_id = 2;</code>
     */
    public java.lang.String getRealmId() {
      java.lang.Object ref = realmId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        realmId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the realm resource to be created.
     * </pre>
     *
     * <code>string realm_id = 2;</code>
     */
    public com.google.protobuf.ByteString getRealmIdBytes() {
      java.lang.Object ref = realmId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        realmId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the realm resource to be created.
     * </pre>
     *
     * <code>string realm_id = 2;</code>
     */
    public Builder setRealmId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      realmId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the realm resource to be created.
     * </pre>
     *
     * <code>string realm_id = 2;</code>
     */
    public Builder clearRealmId() {

      realmId_ = getDefaultInstance().getRealmId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the realm resource to be created.
     * </pre>
     *
     * <code>string realm_id = 2;</code>
     */
    public Builder setRealmIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      realmId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.gaming.v1alpha.Realm realm_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1alpha.Realm,
            com.google.cloud.gaming.v1alpha.Realm.Builder,
            com.google.cloud.gaming.v1alpha.RealmOrBuilder>
        realmBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The realm resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
     */
    public boolean hasRealm() {
      return realmBuilder_ != null || realm_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The realm resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
     */
    public com.google.cloud.gaming.v1alpha.Realm getRealm() {
      if (realmBuilder_ == null) {
        return realm_ == null ? com.google.cloud.gaming.v1alpha.Realm.getDefaultInstance() : realm_;
      } else {
        return realmBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The realm resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
     */
    public Builder setRealm(com.google.cloud.gaming.v1alpha.Realm value) {
      if (realmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        realm_ = value;
        onChanged();
      } else {
        realmBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The realm resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
     */
    public Builder setRealm(com.google.cloud.gaming.v1alpha.Realm.Builder builderForValue) {
      if (realmBuilder_ == null) {
        realm_ = builderForValue.build();
        onChanged();
      } else {
        realmBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The realm resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
     */
    public Builder mergeRealm(com.google.cloud.gaming.v1alpha.Realm value) {
      if (realmBuilder_ == null) {
        if (realm_ != null) {
          realm_ =
              com.google.cloud.gaming.v1alpha.Realm.newBuilder(realm_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          realm_ = value;
        }
        onChanged();
      } else {
        realmBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The realm resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
     */
    public Builder clearRealm() {
      if (realmBuilder_ == null) {
        realm_ = null;
        onChanged();
      } else {
        realm_ = null;
        realmBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The realm resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
     */
    public com.google.cloud.gaming.v1alpha.Realm.Builder getRealmBuilder() {

      onChanged();
      return getRealmFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The realm resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
     */
    public com.google.cloud.gaming.v1alpha.RealmOrBuilder getRealmOrBuilder() {
      if (realmBuilder_ != null) {
        return realmBuilder_.getMessageOrBuilder();
      } else {
        return realm_ == null ? com.google.cloud.gaming.v1alpha.Realm.getDefaultInstance() : realm_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The realm resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.Realm realm = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1alpha.Realm,
            com.google.cloud.gaming.v1alpha.Realm.Builder,
            com.google.cloud.gaming.v1alpha.RealmOrBuilder>
        getRealmFieldBuilder() {
      if (realmBuilder_ == null) {
        realmBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gaming.v1alpha.Realm,
                com.google.cloud.gaming.v1alpha.Realm.Builder,
                com.google.cloud.gaming.v1alpha.RealmOrBuilder>(
                getRealm(), getParentForChildren(), isClean());
        realm_ = null;
      }
      return realmBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1alpha.CreateRealmRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1alpha.CreateRealmRequest)
  private static final com.google.cloud.gaming.v1alpha.CreateRealmRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1alpha.CreateRealmRequest();
  }

  public static com.google.cloud.gaming.v1alpha.CreateRealmRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRealmRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateRealmRequest>() {
        @java.lang.Override
        public CreateRealmRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateRealmRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateRealmRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRealmRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1alpha.CreateRealmRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
