package dk.via.scrum;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: ScrumService.proto")
public final class ScrumServiceGrpc {

  private ScrumServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.scrum.ScrumService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.scrum.UserRequest,
      dk.via.scrum.UserResponse> METHOD_GET_USER =
      io.grpc.MethodDescriptor.<dk.via.scrum.UserRequest, dk.via.scrum.UserResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.scrum.ScrumService", "getUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.UserRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.UserResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.scrum.NewUserRequest,
      dk.via.scrum.SuccessResponse> METHOD_CREATE_USER =
      io.grpc.MethodDescriptor.<dk.via.scrum.NewUserRequest, dk.via.scrum.SuccessResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.scrum.ScrumService", "createUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.NewUserRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.SuccessResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.scrum.AllUsersRequest,
      dk.via.scrum.UserResponse> METHOD_GET_ALL_USERS =
      io.grpc.MethodDescriptor.<dk.via.scrum.AllUsersRequest, dk.via.scrum.UserResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "dk.via.scrum.ScrumService", "getAllUsers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.AllUsersRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.UserResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.scrum.UserStoryRequest,
      dk.via.scrum.UserStoryResponse> METHOD_GET_USER_STORY_BY_ID =
      io.grpc.MethodDescriptor.<dk.via.scrum.UserStoryRequest, dk.via.scrum.UserStoryResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.scrum.ScrumService", "getUserStoryById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.UserStoryRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.UserStoryResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.scrum.NewUserStoryRequest,
      dk.via.scrum.SuccessResponse> METHOD_CREATE_USER_STORY =
      io.grpc.MethodDescriptor.<dk.via.scrum.NewUserStoryRequest, dk.via.scrum.SuccessResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.scrum.ScrumService", "createUserStory"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.NewUserStoryRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.SuccessResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.scrum.AllUserStoriesRequest,
      dk.via.scrum.UserStoryResponse> METHOD_GET_ALL_USER_STORIES =
      io.grpc.MethodDescriptor.<dk.via.scrum.AllUserStoriesRequest, dk.via.scrum.UserStoryResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "dk.via.scrum.ScrumService", "getAllUserStories"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.AllUserStoriesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.UserStoryResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.scrum.BacklogRequest,
      dk.via.scrum.BacklogResponse> METHOD_GET_BACKLOG =
      io.grpc.MethodDescriptor.<dk.via.scrum.BacklogRequest, dk.via.scrum.BacklogResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "dk.via.scrum.ScrumService", "getBacklog"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.BacklogRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.BacklogResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.scrum.NewBacklogRequest,
      dk.via.scrum.SuccessResponse> METHOD_CREATE_BACKLOG =
      io.grpc.MethodDescriptor.<dk.via.scrum.NewBacklogRequest, dk.via.scrum.SuccessResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.scrum.ScrumService", "createBacklog"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.NewBacklogRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.SuccessResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.scrum.AllBacklogsRequest,
      dk.via.scrum.BacklogResponse> METHOD_GET_ALL_BACKLOGS =
      io.grpc.MethodDescriptor.<dk.via.scrum.AllBacklogsRequest, dk.via.scrum.BacklogResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "dk.via.scrum.ScrumService", "getAllBacklogs"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.AllBacklogsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.BacklogResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.scrum.AssignUserStoryToBacklog,
      dk.via.scrum.SuccessResponse> METHOD_ASSIGN_USER_STORY =
      io.grpc.MethodDescriptor.<dk.via.scrum.AssignUserStoryToBacklog, dk.via.scrum.SuccessResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.scrum.ScrumService", "assignUserStory"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.AssignUserStoryToBacklog.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.scrum.SuccessResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScrumServiceStub newStub(io.grpc.Channel channel) {
    return new ScrumServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScrumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ScrumServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScrumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ScrumServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ScrumServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUser(dk.via.scrum.UserRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER, responseObserver);
    }

    /**
     */
    public void createUser(dk.via.scrum.NewUserRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.SuccessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_USER, responseObserver);
    }

    /**
     */
    public void getAllUsers(dk.via.scrum.AllUsersRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_USERS, responseObserver);
    }

    /**
     */
    public void getUserStoryById(dk.via.scrum.UserStoryRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.UserStoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_STORY_BY_ID, responseObserver);
    }

    /**
     */
    public void createUserStory(dk.via.scrum.NewUserStoryRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.SuccessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_USER_STORY, responseObserver);
    }

    /**
     */
    public void getAllUserStories(dk.via.scrum.AllUserStoriesRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.UserStoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_USER_STORIES, responseObserver);
    }

    /**
     */
    public void getBacklog(dk.via.scrum.BacklogRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.BacklogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BACKLOG, responseObserver);
    }

    /**
     */
    public void createBacklog(dk.via.scrum.NewBacklogRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.SuccessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_BACKLOG, responseObserver);
    }

    /**
     */
    public void getAllBacklogs(dk.via.scrum.AllBacklogsRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.BacklogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_BACKLOGS, responseObserver);
    }

    /**
     */
    public void assignUserStory(dk.via.scrum.AssignUserStoryToBacklog request,
        io.grpc.stub.StreamObserver<dk.via.scrum.SuccessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ASSIGN_USER_STORY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_USER,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.scrum.UserRequest,
                dk.via.scrum.UserResponse>(
                  this, METHODID_GET_USER)))
          .addMethod(
            METHOD_CREATE_USER,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.scrum.NewUserRequest,
                dk.via.scrum.SuccessResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            METHOD_GET_ALL_USERS,
            asyncServerStreamingCall(
              new MethodHandlers<
                dk.via.scrum.AllUsersRequest,
                dk.via.scrum.UserResponse>(
                  this, METHODID_GET_ALL_USERS)))
          .addMethod(
            METHOD_GET_USER_STORY_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.scrum.UserStoryRequest,
                dk.via.scrum.UserStoryResponse>(
                  this, METHODID_GET_USER_STORY_BY_ID)))
          .addMethod(
            METHOD_CREATE_USER_STORY,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.scrum.NewUserStoryRequest,
                dk.via.scrum.SuccessResponse>(
                  this, METHODID_CREATE_USER_STORY)))
          .addMethod(
            METHOD_GET_ALL_USER_STORIES,
            asyncServerStreamingCall(
              new MethodHandlers<
                dk.via.scrum.AllUserStoriesRequest,
                dk.via.scrum.UserStoryResponse>(
                  this, METHODID_GET_ALL_USER_STORIES)))
          .addMethod(
            METHOD_GET_BACKLOG,
            asyncServerStreamingCall(
              new MethodHandlers<
                dk.via.scrum.BacklogRequest,
                dk.via.scrum.BacklogResponse>(
                  this, METHODID_GET_BACKLOG)))
          .addMethod(
            METHOD_CREATE_BACKLOG,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.scrum.NewBacklogRequest,
                dk.via.scrum.SuccessResponse>(
                  this, METHODID_CREATE_BACKLOG)))
          .addMethod(
            METHOD_GET_ALL_BACKLOGS,
            asyncServerStreamingCall(
              new MethodHandlers<
                dk.via.scrum.AllBacklogsRequest,
                dk.via.scrum.BacklogResponse>(
                  this, METHODID_GET_ALL_BACKLOGS)))
          .addMethod(
            METHOD_ASSIGN_USER_STORY,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.scrum.AssignUserStoryToBacklog,
                dk.via.scrum.SuccessResponse>(
                  this, METHODID_ASSIGN_USER_STORY)))
          .build();
    }
  }

  /**
   */
  public static final class ScrumServiceStub extends io.grpc.stub.AbstractStub<ScrumServiceStub> {
    private ScrumServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScrumServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScrumServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScrumServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUser(dk.via.scrum.UserRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUser(dk.via.scrum.NewUserRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.SuccessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_USER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUsers(dk.via.scrum.AllUsersRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.UserResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_ALL_USERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserStoryById(dk.via.scrum.UserStoryRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.UserStoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_STORY_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUserStory(dk.via.scrum.NewUserStoryRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.SuccessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_USER_STORY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUserStories(dk.via.scrum.AllUserStoriesRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.UserStoryResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_ALL_USER_STORIES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBacklog(dk.via.scrum.BacklogRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.BacklogResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_BACKLOG, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBacklog(dk.via.scrum.NewBacklogRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.SuccessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_BACKLOG, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllBacklogs(dk.via.scrum.AllBacklogsRequest request,
        io.grpc.stub.StreamObserver<dk.via.scrum.BacklogResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_ALL_BACKLOGS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignUserStory(dk.via.scrum.AssignUserStoryToBacklog request,
        io.grpc.stub.StreamObserver<dk.via.scrum.SuccessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ASSIGN_USER_STORY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ScrumServiceBlockingStub extends io.grpc.stub.AbstractStub<ScrumServiceBlockingStub> {
    private ScrumServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScrumServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScrumServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScrumServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.scrum.UserResponse getUser(dk.via.scrum.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER, getCallOptions(), request);
    }

    /**
     */
    public dk.via.scrum.SuccessResponse createUser(dk.via.scrum.NewUserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_USER, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<dk.via.scrum.UserResponse> getAllUsers(
        dk.via.scrum.AllUsersRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_ALL_USERS, getCallOptions(), request);
    }

    /**
     */
    public dk.via.scrum.UserStoryResponse getUserStoryById(dk.via.scrum.UserStoryRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_STORY_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public dk.via.scrum.SuccessResponse createUserStory(dk.via.scrum.NewUserStoryRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_USER_STORY, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<dk.via.scrum.UserStoryResponse> getAllUserStories(
        dk.via.scrum.AllUserStoriesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_ALL_USER_STORIES, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<dk.via.scrum.BacklogResponse> getBacklog(
        dk.via.scrum.BacklogRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_BACKLOG, getCallOptions(), request);
    }

    /**
     */
    public dk.via.scrum.SuccessResponse createBacklog(dk.via.scrum.NewBacklogRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_BACKLOG, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<dk.via.scrum.BacklogResponse> getAllBacklogs(
        dk.via.scrum.AllBacklogsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_ALL_BACKLOGS, getCallOptions(), request);
    }

    /**
     */
    public dk.via.scrum.SuccessResponse assignUserStory(dk.via.scrum.AssignUserStoryToBacklog request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ASSIGN_USER_STORY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ScrumServiceFutureStub extends io.grpc.stub.AbstractStub<ScrumServiceFutureStub> {
    private ScrumServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScrumServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScrumServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScrumServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.scrum.UserResponse> getUser(
        dk.via.scrum.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.scrum.SuccessResponse> createUser(
        dk.via.scrum.NewUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_USER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.scrum.UserStoryResponse> getUserStoryById(
        dk.via.scrum.UserStoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_STORY_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.scrum.SuccessResponse> createUserStory(
        dk.via.scrum.NewUserStoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_USER_STORY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.scrum.SuccessResponse> createBacklog(
        dk.via.scrum.NewBacklogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_BACKLOG, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.scrum.SuccessResponse> assignUserStory(
        dk.via.scrum.AssignUserStoryToBacklog request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ASSIGN_USER_STORY, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;
  private static final int METHODID_CREATE_USER = 1;
  private static final int METHODID_GET_ALL_USERS = 2;
  private static final int METHODID_GET_USER_STORY_BY_ID = 3;
  private static final int METHODID_CREATE_USER_STORY = 4;
  private static final int METHODID_GET_ALL_USER_STORIES = 5;
  private static final int METHODID_GET_BACKLOG = 6;
  private static final int METHODID_CREATE_BACKLOG = 7;
  private static final int METHODID_GET_ALL_BACKLOGS = 8;
  private static final int METHODID_ASSIGN_USER_STORY = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScrumServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScrumServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER:
          serviceImpl.getUser((dk.via.scrum.UserRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.scrum.UserResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((dk.via.scrum.NewUserRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.scrum.SuccessResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_USERS:
          serviceImpl.getAllUsers((dk.via.scrum.AllUsersRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.scrum.UserResponse>) responseObserver);
          break;
        case METHODID_GET_USER_STORY_BY_ID:
          serviceImpl.getUserStoryById((dk.via.scrum.UserStoryRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.scrum.UserStoryResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER_STORY:
          serviceImpl.createUserStory((dk.via.scrum.NewUserStoryRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.scrum.SuccessResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_USER_STORIES:
          serviceImpl.getAllUserStories((dk.via.scrum.AllUserStoriesRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.scrum.UserStoryResponse>) responseObserver);
          break;
        case METHODID_GET_BACKLOG:
          serviceImpl.getBacklog((dk.via.scrum.BacklogRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.scrum.BacklogResponse>) responseObserver);
          break;
        case METHODID_CREATE_BACKLOG:
          serviceImpl.createBacklog((dk.via.scrum.NewBacklogRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.scrum.SuccessResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_BACKLOGS:
          serviceImpl.getAllBacklogs((dk.via.scrum.AllBacklogsRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.scrum.BacklogResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_USER_STORY:
          serviceImpl.assignUserStory((dk.via.scrum.AssignUserStoryToBacklog) request,
              (io.grpc.stub.StreamObserver<dk.via.scrum.SuccessResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class ScrumServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.scrum.ScrumServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ScrumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScrumServiceDescriptorSupplier())
              .addMethod(METHOD_GET_USER)
              .addMethod(METHOD_CREATE_USER)
              .addMethod(METHOD_GET_ALL_USERS)
              .addMethod(METHOD_GET_USER_STORY_BY_ID)
              .addMethod(METHOD_CREATE_USER_STORY)
              .addMethod(METHOD_GET_ALL_USER_STORIES)
              .addMethod(METHOD_GET_BACKLOG)
              .addMethod(METHOD_CREATE_BACKLOG)
              .addMethod(METHOD_GET_ALL_BACKLOGS)
              .addMethod(METHOD_ASSIGN_USER_STORY)
              .build();
        }
      }
    }
    return result;
  }
}
