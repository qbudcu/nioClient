// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgClient.proto

package org.lpf.proto;

public final class MsgClient {
  private MsgClient() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ResConnectCreateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResConnectCreate)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code ResConnectCreate}
   *
   * <pre>
   *RES_CLIENT_CREATE = 100001 连接已经建立
   * </pre>
   */
  public static final class ResConnectCreate extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ResConnectCreate)
      ResConnectCreateOrBuilder {
    // Use ResConnectCreate.newBuilder() to construct.
    private ResConnectCreate(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ResConnectCreate(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ResConnectCreate defaultInstance;
    public static ResConnectCreate getDefaultInstance() {
      return defaultInstance;
    }

    public ResConnectCreate getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ResConnectCreate(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.lpf.proto.MsgClient.internal_static_ResConnectCreate_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.lpf.proto.MsgClient.internal_static_ResConnectCreate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.lpf.proto.MsgClient.ResConnectCreate.class, org.lpf.proto.MsgClient.ResConnectCreate.Builder.class);
    }

    public static com.google.protobuf.Parser<ResConnectCreate> PARSER =
        new com.google.protobuf.AbstractParser<ResConnectCreate>() {
      public ResConnectCreate parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResConnectCreate(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ResConnectCreate> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.lpf.proto.MsgClient.ResConnectCreate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.lpf.proto.MsgClient.ResConnectCreate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.lpf.proto.MsgClient.ResConnectCreate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.lpf.proto.MsgClient.ResConnectCreate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.lpf.proto.MsgClient.ResConnectCreate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.lpf.proto.MsgClient.ResConnectCreate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.lpf.proto.MsgClient.ResConnectCreate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.lpf.proto.MsgClient.ResConnectCreate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.lpf.proto.MsgClient.ResConnectCreate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.lpf.proto.MsgClient.ResConnectCreate parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.lpf.proto.MsgClient.ResConnectCreate prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResConnectCreate}
     *
     * <pre>
     *RES_CLIENT_CREATE = 100001 连接已经建立
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResConnectCreate)
        org.lpf.proto.MsgClient.ResConnectCreateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.lpf.proto.MsgClient.internal_static_ResConnectCreate_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.lpf.proto.MsgClient.internal_static_ResConnectCreate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.lpf.proto.MsgClient.ResConnectCreate.class, org.lpf.proto.MsgClient.ResConnectCreate.Builder.class);
      }

      // Construct using org.lpf.proto.MsgClient.ResConnectCreate.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.lpf.proto.MsgClient.internal_static_ResConnectCreate_descriptor;
      }

      public org.lpf.proto.MsgClient.ResConnectCreate getDefaultInstanceForType() {
        return org.lpf.proto.MsgClient.ResConnectCreate.getDefaultInstance();
      }

      public org.lpf.proto.MsgClient.ResConnectCreate build() {
        org.lpf.proto.MsgClient.ResConnectCreate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.lpf.proto.MsgClient.ResConnectCreate buildPartial() {
        org.lpf.proto.MsgClient.ResConnectCreate result = new org.lpf.proto.MsgClient.ResConnectCreate(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.lpf.proto.MsgClient.ResConnectCreate) {
          return mergeFrom((org.lpf.proto.MsgClient.ResConnectCreate)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.lpf.proto.MsgClient.ResConnectCreate other) {
        if (other == org.lpf.proto.MsgClient.ResConnectCreate.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.lpf.proto.MsgClient.ResConnectCreate parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.lpf.proto.MsgClient.ResConnectCreate) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ResConnectCreate)
    }

    static {
      defaultInstance = new ResConnectCreate(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ResConnectCreate)
  }

  public interface ReqRegisterClientOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReqRegisterClient)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string clientId = 1;</code>
     */
    boolean hasClientId();
    /**
     * <code>required string clientId = 1;</code>
     */
    java.lang.String getClientId();
    /**
     * <code>required string clientId = 1;</code>
     */
    com.google.protobuf.ByteString
        getClientIdBytes();
  }
  /**
   * Protobuf type {@code ReqRegisterClient}
   *
   * <pre>
   *REQ_REGISTER_CLIENT = 100002 请求注册客户端   
   * </pre>
   */
  public static final class ReqRegisterClient extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ReqRegisterClient)
      ReqRegisterClientOrBuilder {
    // Use ReqRegisterClient.newBuilder() to construct.
    private ReqRegisterClient(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReqRegisterClient(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReqRegisterClient defaultInstance;
    public static ReqRegisterClient getDefaultInstance() {
      return defaultInstance;
    }

    public ReqRegisterClient getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReqRegisterClient(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              clientId_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.lpf.proto.MsgClient.internal_static_ReqRegisterClient_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.lpf.proto.MsgClient.internal_static_ReqRegisterClient_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.lpf.proto.MsgClient.ReqRegisterClient.class, org.lpf.proto.MsgClient.ReqRegisterClient.Builder.class);
    }

    public static com.google.protobuf.Parser<ReqRegisterClient> PARSER =
        new com.google.protobuf.AbstractParser<ReqRegisterClient>() {
      public ReqRegisterClient parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqRegisterClient(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ReqRegisterClient> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int CLIENTID_FIELD_NUMBER = 1;
    private java.lang.Object clientId_;
    /**
     * <code>required string clientId = 1;</code>
     */
    public boolean hasClientId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string clientId = 1;</code>
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string clientId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      clientId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasClientId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getClientIdBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getClientIdBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.lpf.proto.MsgClient.ReqRegisterClient parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.lpf.proto.MsgClient.ReqRegisterClient parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.lpf.proto.MsgClient.ReqRegisterClient parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.lpf.proto.MsgClient.ReqRegisterClient parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.lpf.proto.MsgClient.ReqRegisterClient parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.lpf.proto.MsgClient.ReqRegisterClient parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.lpf.proto.MsgClient.ReqRegisterClient parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.lpf.proto.MsgClient.ReqRegisterClient parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.lpf.proto.MsgClient.ReqRegisterClient parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.lpf.proto.MsgClient.ReqRegisterClient parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.lpf.proto.MsgClient.ReqRegisterClient prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ReqRegisterClient}
     *
     * <pre>
     *REQ_REGISTER_CLIENT = 100002 请求注册客户端   
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReqRegisterClient)
        org.lpf.proto.MsgClient.ReqRegisterClientOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.lpf.proto.MsgClient.internal_static_ReqRegisterClient_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.lpf.proto.MsgClient.internal_static_ReqRegisterClient_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.lpf.proto.MsgClient.ReqRegisterClient.class, org.lpf.proto.MsgClient.ReqRegisterClient.Builder.class);
      }

      // Construct using org.lpf.proto.MsgClient.ReqRegisterClient.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        clientId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.lpf.proto.MsgClient.internal_static_ReqRegisterClient_descriptor;
      }

      public org.lpf.proto.MsgClient.ReqRegisterClient getDefaultInstanceForType() {
        return org.lpf.proto.MsgClient.ReqRegisterClient.getDefaultInstance();
      }

      public org.lpf.proto.MsgClient.ReqRegisterClient build() {
        org.lpf.proto.MsgClient.ReqRegisterClient result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.lpf.proto.MsgClient.ReqRegisterClient buildPartial() {
        org.lpf.proto.MsgClient.ReqRegisterClient result = new org.lpf.proto.MsgClient.ReqRegisterClient(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.clientId_ = clientId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.lpf.proto.MsgClient.ReqRegisterClient) {
          return mergeFrom((org.lpf.proto.MsgClient.ReqRegisterClient)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.lpf.proto.MsgClient.ReqRegisterClient other) {
        if (other == org.lpf.proto.MsgClient.ReqRegisterClient.getDefaultInstance()) return this;
        if (other.hasClientId()) {
          bitField0_ |= 0x00000001;
          clientId_ = other.clientId_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasClientId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.lpf.proto.MsgClient.ReqRegisterClient parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.lpf.proto.MsgClient.ReqRegisterClient) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object clientId_ = "";
      /**
       * <code>required string clientId = 1;</code>
       */
      public boolean hasClientId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string clientId = 1;</code>
       */
      public java.lang.String getClientId() {
        java.lang.Object ref = clientId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            clientId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string clientId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getClientIdBytes() {
        java.lang.Object ref = clientId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string clientId = 1;</code>
       */
      public Builder setClientId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        clientId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string clientId = 1;</code>
       */
      public Builder clearClientId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        clientId_ = getDefaultInstance().getClientId();
        onChanged();
        return this;
      }
      /**
       * <code>required string clientId = 1;</code>
       */
      public Builder setClientIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        clientId_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ReqRegisterClient)
    }

    static {
      defaultInstance = new ReqRegisterClient(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ReqRegisterClient)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResConnectCreate_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ResConnectCreate_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReqRegisterClient_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ReqRegisterClient_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017MsgClient.proto\"\022\n\020ResConnectCreate\"%\n" +
      "\021ReqRegisterClient\022\020\n\010clientId\030\001 \002(\tB\032\n\r" +
      "org.lpf.protoB\tMsgClient"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ResConnectCreate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ResConnectCreate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ResConnectCreate_descriptor,
        new java.lang.String[] { });
    internal_static_ReqRegisterClient_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ReqRegisterClient_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ReqRegisterClient_descriptor,
        new java.lang.String[] { "ClientId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
