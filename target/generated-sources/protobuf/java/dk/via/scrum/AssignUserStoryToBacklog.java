// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScrumService.proto

package dk.via.scrum;

/**
 * Protobuf type {@code dk.via.scrum.AssignUserStoryToBacklog}
 */
public  final class AssignUserStoryToBacklog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dk.via.scrum.AssignUserStoryToBacklog)
    AssignUserStoryToBacklogOrBuilder {
  // Use AssignUserStoryToBacklog.newBuilder() to construct.
  private AssignUserStoryToBacklog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssignUserStoryToBacklog() {
    backlogName_ = "";
    userStoryId_ = 0;
    userId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AssignUserStoryToBacklog(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            backlogName_ = s;
            break;
          }
          case 16: {

            userStoryId_ = input.readInt32();
            break;
          }
          case 24: {

            userId_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dk.via.scrum.ScrumServiceOuterClass.internal_static_dk_via_scrum_AssignUserStoryToBacklog_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dk.via.scrum.ScrumServiceOuterClass.internal_static_dk_via_scrum_AssignUserStoryToBacklog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dk.via.scrum.AssignUserStoryToBacklog.class, dk.via.scrum.AssignUserStoryToBacklog.Builder.class);
  }

  public static final int BACKLOGNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object backlogName_;
  /**
   * <code>string BacklogName = 1;</code>
   */
  public java.lang.String getBacklogName() {
    java.lang.Object ref = backlogName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      backlogName_ = s;
      return s;
    }
  }
  /**
   * <code>string BacklogName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getBacklogNameBytes() {
    java.lang.Object ref = backlogName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      backlogName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERSTORYID_FIELD_NUMBER = 2;
  private int userStoryId_;
  /**
   * <code>int32 UserStoryId = 2;</code>
   */
  public int getUserStoryId() {
    return userStoryId_;
  }

  public static final int USERID_FIELD_NUMBER = 3;
  private int userId_;
  /**
   * <code>int32 UserId = 3;</code>
   */
  public int getUserId() {
    return userId_;
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
    if (!getBacklogNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, backlogName_);
    }
    if (userStoryId_ != 0) {
      output.writeInt32(2, userStoryId_);
    }
    if (userId_ != 0) {
      output.writeInt32(3, userId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBacklogNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, backlogName_);
    }
    if (userStoryId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, userStoryId_);
    }
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, userId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof dk.via.scrum.AssignUserStoryToBacklog)) {
      return super.equals(obj);
    }
    dk.via.scrum.AssignUserStoryToBacklog other = (dk.via.scrum.AssignUserStoryToBacklog) obj;

    boolean result = true;
    result = result && getBacklogName()
        .equals(other.getBacklogName());
    result = result && (getUserStoryId()
        == other.getUserStoryId());
    result = result && (getUserId()
        == other.getUserId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BACKLOGNAME_FIELD_NUMBER;
    hash = (53 * hash) + getBacklogName().hashCode();
    hash = (37 * hash) + USERSTORYID_FIELD_NUMBER;
    hash = (53 * hash) + getUserStoryId();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dk.via.scrum.AssignUserStoryToBacklog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.scrum.AssignUserStoryToBacklog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.scrum.AssignUserStoryToBacklog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.scrum.AssignUserStoryToBacklog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.scrum.AssignUserStoryToBacklog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.scrum.AssignUserStoryToBacklog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.scrum.AssignUserStoryToBacklog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.scrum.AssignUserStoryToBacklog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.scrum.AssignUserStoryToBacklog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dk.via.scrum.AssignUserStoryToBacklog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.scrum.AssignUserStoryToBacklog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.scrum.AssignUserStoryToBacklog parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(dk.via.scrum.AssignUserStoryToBacklog prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code dk.via.scrum.AssignUserStoryToBacklog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dk.via.scrum.AssignUserStoryToBacklog)
      dk.via.scrum.AssignUserStoryToBacklogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dk.via.scrum.ScrumServiceOuterClass.internal_static_dk_via_scrum_AssignUserStoryToBacklog_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dk.via.scrum.ScrumServiceOuterClass.internal_static_dk_via_scrum_AssignUserStoryToBacklog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dk.via.scrum.AssignUserStoryToBacklog.class, dk.via.scrum.AssignUserStoryToBacklog.Builder.class);
    }

    // Construct using dk.via.scrum.AssignUserStoryToBacklog.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      backlogName_ = "";

      userStoryId_ = 0;

      userId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dk.via.scrum.ScrumServiceOuterClass.internal_static_dk_via_scrum_AssignUserStoryToBacklog_descriptor;
    }

    public dk.via.scrum.AssignUserStoryToBacklog getDefaultInstanceForType() {
      return dk.via.scrum.AssignUserStoryToBacklog.getDefaultInstance();
    }

    public dk.via.scrum.AssignUserStoryToBacklog build() {
      dk.via.scrum.AssignUserStoryToBacklog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public dk.via.scrum.AssignUserStoryToBacklog buildPartial() {
      dk.via.scrum.AssignUserStoryToBacklog result = new dk.via.scrum.AssignUserStoryToBacklog(this);
      result.backlogName_ = backlogName_;
      result.userStoryId_ = userStoryId_;
      result.userId_ = userId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof dk.via.scrum.AssignUserStoryToBacklog) {
        return mergeFrom((dk.via.scrum.AssignUserStoryToBacklog)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dk.via.scrum.AssignUserStoryToBacklog other) {
      if (other == dk.via.scrum.AssignUserStoryToBacklog.getDefaultInstance()) return this;
      if (!other.getBacklogName().isEmpty()) {
        backlogName_ = other.backlogName_;
        onChanged();
      }
      if (other.getUserStoryId() != 0) {
        setUserStoryId(other.getUserStoryId());
      }
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      dk.via.scrum.AssignUserStoryToBacklog parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dk.via.scrum.AssignUserStoryToBacklog) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object backlogName_ = "";
    /**
     * <code>string BacklogName = 1;</code>
     */
    public java.lang.String getBacklogName() {
      java.lang.Object ref = backlogName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        backlogName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string BacklogName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBacklogNameBytes() {
      java.lang.Object ref = backlogName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        backlogName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string BacklogName = 1;</code>
     */
    public Builder setBacklogName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      backlogName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string BacklogName = 1;</code>
     */
    public Builder clearBacklogName() {
      
      backlogName_ = getDefaultInstance().getBacklogName();
      onChanged();
      return this;
    }
    /**
     * <code>string BacklogName = 1;</code>
     */
    public Builder setBacklogNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      backlogName_ = value;
      onChanged();
      return this;
    }

    private int userStoryId_ ;
    /**
     * <code>int32 UserStoryId = 2;</code>
     */
    public int getUserStoryId() {
      return userStoryId_;
    }
    /**
     * <code>int32 UserStoryId = 2;</code>
     */
    public Builder setUserStoryId(int value) {
      
      userStoryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 UserStoryId = 2;</code>
     */
    public Builder clearUserStoryId() {
      
      userStoryId_ = 0;
      onChanged();
      return this;
    }

    private int userId_ ;
    /**
     * <code>int32 UserId = 3;</code>
     */
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 UserId = 3;</code>
     */
    public Builder setUserId(int value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 UserId = 3;</code>
     */
    public Builder clearUserId() {
      
      userId_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:dk.via.scrum.AssignUserStoryToBacklog)
  }

  // @@protoc_insertion_point(class_scope:dk.via.scrum.AssignUserStoryToBacklog)
  private static final dk.via.scrum.AssignUserStoryToBacklog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dk.via.scrum.AssignUserStoryToBacklog();
  }

  public static dk.via.scrum.AssignUserStoryToBacklog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssignUserStoryToBacklog>
      PARSER = new com.google.protobuf.AbstractParser<AssignUserStoryToBacklog>() {
    public AssignUserStoryToBacklog parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AssignUserStoryToBacklog(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssignUserStoryToBacklog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssignUserStoryToBacklog> getParserForType() {
    return PARSER;
  }

  public dk.via.scrum.AssignUserStoryToBacklog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

