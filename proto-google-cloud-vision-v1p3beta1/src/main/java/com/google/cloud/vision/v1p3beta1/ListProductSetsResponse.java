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
// source: google/cloud/vision/v1p3beta1/product_search_service.proto

package com.google.cloud.vision.v1p3beta1;

/**
 *
 *
 * <pre>
 * Response message for the `ListProductSets` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p3beta1.ListProductSetsResponse}
 */
public final class ListProductSetsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p3beta1.ListProductSetsResponse)
    ListProductSetsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListProductSetsResponse.newBuilder() to construct.
  private ListProductSetsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListProductSetsResponse() {
    productSets_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListProductSetsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListProductSetsResponse(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                productSets_ =
                    new java.util.ArrayList<com.google.cloud.vision.v1p3beta1.ProductSet>();
                mutable_bitField0_ |= 0x00000001;
              }
              productSets_.add(
                  input.readMessage(
                      com.google.cloud.vision.v1p3beta1.ProductSet.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        productSets_ = java.util.Collections.unmodifiableList(productSets_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1p3beta1_ListProductSetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1p3beta1_ListProductSetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p3beta1.ListProductSetsResponse.class,
            com.google.cloud.vision.v1p3beta1.ListProductSetsResponse.Builder.class);
  }

  public static final int PRODUCT_SETS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.vision.v1p3beta1.ProductSet> productSets_;
  /**
   *
   *
   * <pre>
   * List of ProductSets.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.vision.v1p3beta1.ProductSet> getProductSetsList() {
    return productSets_;
  }
  /**
   *
   *
   * <pre>
   * List of ProductSets.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder>
      getProductSetsOrBuilderList() {
    return productSets_;
  }
  /**
   *
   *
   * <pre>
   * List of ProductSets.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
   */
  @java.lang.Override
  public int getProductSetsCount() {
    return productSets_.size();
  }
  /**
   *
   *
   * <pre>
   * List of ProductSets.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.ProductSet getProductSets(int index) {
    return productSets_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of ProductSets.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder getProductSetsOrBuilder(int index) {
    return productSets_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < productSets_.size(); i++) {
      output.writeMessage(1, productSets_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < productSets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, productSets_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.vision.v1p3beta1.ListProductSetsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p3beta1.ListProductSetsResponse other =
        (com.google.cloud.vision.v1p3beta1.ListProductSetsResponse) obj;

    if (!getProductSetsList().equals(other.getProductSetsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getProductSetsCount() > 0) {
      hash = (37 * hash) + PRODUCT_SETS_FIELD_NUMBER;
      hash = (53 * hash) + getProductSetsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p3beta1.ListProductSetsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.ListProductSetsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.ListProductSetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.ListProductSetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.ListProductSetsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.ListProductSetsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.ListProductSetsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.ListProductSetsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.ListProductSetsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.ListProductSetsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.ListProductSetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.ListProductSetsResponse parseFrom(
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
      com.google.cloud.vision.v1p3beta1.ListProductSetsResponse prototype) {
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
   * Response message for the `ListProductSets` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p3beta1.ListProductSetsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p3beta1.ListProductSetsResponse)
      com.google.cloud.vision.v1p3beta1.ListProductSetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p3beta1_ListProductSetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p3beta1_ListProductSetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p3beta1.ListProductSetsResponse.class,
              com.google.cloud.vision.v1p3beta1.ListProductSetsResponse.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p3beta1.ListProductSetsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getProductSetsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (productSetsBuilder_ == null) {
        productSets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        productSetsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p3beta1_ListProductSetsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.ListProductSetsResponse getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p3beta1.ListProductSetsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.ListProductSetsResponse build() {
      com.google.cloud.vision.v1p3beta1.ListProductSetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.ListProductSetsResponse buildPartial() {
      com.google.cloud.vision.v1p3beta1.ListProductSetsResponse result =
          new com.google.cloud.vision.v1p3beta1.ListProductSetsResponse(this);
      int from_bitField0_ = bitField0_;
      if (productSetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          productSets_ = java.util.Collections.unmodifiableList(productSets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.productSets_ = productSets_;
      } else {
        result.productSets_ = productSetsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.vision.v1p3beta1.ListProductSetsResponse) {
        return mergeFrom((com.google.cloud.vision.v1p3beta1.ListProductSetsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p3beta1.ListProductSetsResponse other) {
      if (other == com.google.cloud.vision.v1p3beta1.ListProductSetsResponse.getDefaultInstance())
        return this;
      if (productSetsBuilder_ == null) {
        if (!other.productSets_.isEmpty()) {
          if (productSets_.isEmpty()) {
            productSets_ = other.productSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductSetsIsMutable();
            productSets_.addAll(other.productSets_);
          }
          onChanged();
        }
      } else {
        if (!other.productSets_.isEmpty()) {
          if (productSetsBuilder_.isEmpty()) {
            productSetsBuilder_.dispose();
            productSetsBuilder_ = null;
            productSets_ = other.productSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productSetsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getProductSetsFieldBuilder()
                    : null;
          } else {
            productSetsBuilder_.addAllMessages(other.productSets_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.cloud.vision.v1p3beta1.ListProductSetsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.vision.v1p3beta1.ListProductSetsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.vision.v1p3beta1.ProductSet> productSets_ =
        java.util.Collections.emptyList();

    private void ensureProductSetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        productSets_ =
            new java.util.ArrayList<com.google.cloud.vision.v1p3beta1.ProductSet>(productSets_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vision.v1p3beta1.ProductSet,
            com.google.cloud.vision.v1p3beta1.ProductSet.Builder,
            com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder>
        productSetsBuilder_;

    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public java.util.List<com.google.cloud.vision.v1p3beta1.ProductSet> getProductSetsList() {
      if (productSetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(productSets_);
      } else {
        return productSetsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public int getProductSetsCount() {
      if (productSetsBuilder_ == null) {
        return productSets_.size();
      } else {
        return productSetsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ProductSet getProductSets(int index) {
      if (productSetsBuilder_ == null) {
        return productSets_.get(index);
      } else {
        return productSetsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public Builder setProductSets(int index, com.google.cloud.vision.v1p3beta1.ProductSet value) {
      if (productSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductSetsIsMutable();
        productSets_.set(index, value);
        onChanged();
      } else {
        productSetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public Builder setProductSets(
        int index, com.google.cloud.vision.v1p3beta1.ProductSet.Builder builderForValue) {
      if (productSetsBuilder_ == null) {
        ensureProductSetsIsMutable();
        productSets_.set(index, builderForValue.build());
        onChanged();
      } else {
        productSetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public Builder addProductSets(com.google.cloud.vision.v1p3beta1.ProductSet value) {
      if (productSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductSetsIsMutable();
        productSets_.add(value);
        onChanged();
      } else {
        productSetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public Builder addProductSets(int index, com.google.cloud.vision.v1p3beta1.ProductSet value) {
      if (productSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductSetsIsMutable();
        productSets_.add(index, value);
        onChanged();
      } else {
        productSetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public Builder addProductSets(
        com.google.cloud.vision.v1p3beta1.ProductSet.Builder builderForValue) {
      if (productSetsBuilder_ == null) {
        ensureProductSetsIsMutable();
        productSets_.add(builderForValue.build());
        onChanged();
      } else {
        productSetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public Builder addProductSets(
        int index, com.google.cloud.vision.v1p3beta1.ProductSet.Builder builderForValue) {
      if (productSetsBuilder_ == null) {
        ensureProductSetsIsMutable();
        productSets_.add(index, builderForValue.build());
        onChanged();
      } else {
        productSetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public Builder addAllProductSets(
        java.lang.Iterable<? extends com.google.cloud.vision.v1p3beta1.ProductSet> values) {
      if (productSetsBuilder_ == null) {
        ensureProductSetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, productSets_);
        onChanged();
      } else {
        productSetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public Builder clearProductSets() {
      if (productSetsBuilder_ == null) {
        productSets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productSetsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public Builder removeProductSets(int index) {
      if (productSetsBuilder_ == null) {
        ensureProductSetsIsMutable();
        productSets_.remove(index);
        onChanged();
      } else {
        productSetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ProductSet.Builder getProductSetsBuilder(int index) {
      return getProductSetsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder getProductSetsOrBuilder(
        int index) {
      if (productSetsBuilder_ == null) {
        return productSets_.get(index);
      } else {
        return productSetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder>
        getProductSetsOrBuilderList() {
      if (productSetsBuilder_ != null) {
        return productSetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(productSets_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ProductSet.Builder addProductSetsBuilder() {
      return getProductSetsFieldBuilder()
          .addBuilder(com.google.cloud.vision.v1p3beta1.ProductSet.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ProductSet.Builder addProductSetsBuilder(int index) {
      return getProductSetsFieldBuilder()
          .addBuilder(index, com.google.cloud.vision.v1p3beta1.ProductSet.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of ProductSets.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ProductSet product_sets = 1;</code>
     */
    public java.util.List<com.google.cloud.vision.v1p3beta1.ProductSet.Builder>
        getProductSetsBuilderList() {
      return getProductSetsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vision.v1p3beta1.ProductSet,
            com.google.cloud.vision.v1p3beta1.ProductSet.Builder,
            com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder>
        getProductSetsFieldBuilder() {
      if (productSetsBuilder_ == null) {
        productSetsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.vision.v1p3beta1.ProductSet,
                com.google.cloud.vision.v1p3beta1.ProductSet.Builder,
                com.google.cloud.vision.v1p3beta1.ProductSetOrBuilder>(
                productSets_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        productSets_ = null;
      }
      return productSetsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p3beta1.ListProductSetsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p3beta1.ListProductSetsResponse)
  private static final com.google.cloud.vision.v1p3beta1.ListProductSetsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p3beta1.ListProductSetsResponse();
  }

  public static com.google.cloud.vision.v1p3beta1.ListProductSetsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListProductSetsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListProductSetsResponse>() {
        @java.lang.Override
        public ListProductSetsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListProductSetsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListProductSetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListProductSetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.ListProductSetsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
