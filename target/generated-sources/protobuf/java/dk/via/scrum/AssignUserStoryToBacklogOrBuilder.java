// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScrumService.proto

package dk.via.scrum;

public interface AssignUserStoryToBacklogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dk.via.scrum.AssignUserStoryToBacklog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string BacklogName = 1;</code>
   */
  java.lang.String getBacklogName();
  /**
   * <code>string BacklogName = 1;</code>
   */
  com.google.protobuf.ByteString
      getBacklogNameBytes();

  /**
   * <code>int32 UserStoryId = 2;</code>
   */
  int getUserStoryId();

  /**
   * <code>int32 UserId = 3;</code>
   */
  int getUserId();
}
