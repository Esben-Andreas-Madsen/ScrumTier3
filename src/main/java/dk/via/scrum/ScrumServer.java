package dk.via.scrum;

import database.postgres.DatabaseCommands;
import database.postgres.DatabaseConnection;
import io.grpc.stub.StreamObserver;
import shared.Backlog;
import shared.UserStory;
import shared.User;

import java.util.ArrayList;
import java.util.List;

public class ScrumServer extends ScrumServiceGrpc.ScrumServiceImplBase {

    DatabaseConnection connection = new DatabaseConnection();
    DatabaseCommands commands = new DatabaseCommands();
    Formatter formatter = new Formatter();

    ////////////////////////////////////////////////////////////

    @Override
    public void getUser(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        User user = commands.getUser(connection.getConnection(), request.getUserId());

        UserResponse response = formatter.userToResponse(user);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void createUser(NewUserRequest request, StreamObserver<SuccessResponse> responseObserver) {
        User user = formatter.requestToUser(request);
        commands.createUser(connection.getConnection(), user);

        SuccessResponse successResponse = SuccessResponse.newBuilder().build();
        responseObserver.onNext(successResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllUsers(AllUsersRequest request, StreamObserver<UserResponse> responseObserver) {
        List<User> users = commands.getAllUsers(connection.getConnection());

        List<UserResponse> responses = new ArrayList<>();

        for (User user: users) {
            responses.add(formatter.userToResponse(user));
        }

        for (UserResponse response: responses) {
            responseObserver.onNext(response);
        }

        responseObserver.onCompleted();

    }

    ////////////////////////////////////////////////////////////

    @Override
    public void getUserStoryById(UserStoryRequest request, StreamObserver<UserStoryResponse> responseObserver) {
        UserStory userStory = commands.getUserStoryById(connection.getConnection(), request.getUserStoryId());

        UserStoryResponse response = formatter.userStoryToResponse(userStory);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void createUserStory(NewUserStoryRequest request, StreamObserver<SuccessResponse> responseObserver) {
        UserStory userStory = formatter.requestToUserStory(request);
        commands.createUserStory(connection.getConnection(), userStory);

        SuccessResponse successResponse = SuccessResponse.newBuilder().build();
        responseObserver.onNext(successResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllUserStories(AllUserStoriesRequest request, StreamObserver<UserStoryResponse> responseObserver) {
        List<UserStory> userStories = commands.getAllUserStories(connection.getConnection());

        List<UserStoryResponse> responses = new ArrayList<>();

        for (UserStory userStory: userStories) {
            responses.add(formatter.userStoryToResponse(userStory));
        }

        for (UserStoryResponse response: responses) {
            responseObserver.onNext(response);
        }

        responseObserver.onCompleted();
    }

    ////////////////////////////////////////////////////////////

    @Override
    public void getBacklog(BacklogRequest request, StreamObserver<BacklogResponse> responseObserver) {
        List<Backlog> backlogs = commands.getBacklog(connection.getConnection(), request.getBacklogName());

        List<BacklogResponse> responses = formatter.backlogsToResponse(backlogs);
        for (BacklogResponse response: responses) {
            responseObserver.onNext(response);
        }

        responseObserver.onCompleted();
    }

    @Override
    public void getAllBacklogs(AllBacklogsRequest request, StreamObserver<BacklogResponse> responseObserver) {
        List<Backlog> backlogs = commands.getAllBacklogs(connection.getConnection());

        List<BacklogResponse> responses = formatter.backlogsToResponse(backlogs);

        for (BacklogResponse response: responses) {
            responseObserver.onNext(response);
        }

        responseObserver.onCompleted();
    }

    @Override
    public void createBacklog(NewBacklogRequest request, StreamObserver<SuccessResponse> responseObserver) {
        Backlog backlog = formatter.requestToBacklog(request);
        commands.createBacklog(connection.getConnection(), backlog);

        SuccessResponse successResponse = SuccessResponse.newBuilder().build();
        responseObserver.onNext(successResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void assignUserStory(AssignUserStoryToBacklog request, StreamObserver<SuccessResponse> responseObserver) {
        Backlog backlog = formatter.assignRequestToBacklog(request);
        commands.assignUserStory(connection.getConnection(), backlog);

        SuccessResponse successResponse = SuccessResponse.newBuilder().build();
        responseObserver.onNext(successResponse);
        responseObserver.onCompleted();
    }

}
