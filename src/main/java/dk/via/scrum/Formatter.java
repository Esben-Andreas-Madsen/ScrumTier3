package dk.via.scrum;

import shared.Backlog;
import shared.User;
import shared.UserStory;

import java.util.ArrayList;
import java.util.List;

public class Formatter implements FormatterInterface {

    @Override
    public UserResponse userToResponse(User user) {
        return UserResponse.newBuilder().
                setUserId(user.getUserId()).
                setUserName(user.getUserName()).
                setPassword(user.getPassword()).
                setRole(user.getRole()).
                setFirstName(user.getFirstName()).
                setLastName(user.getLastName()).
                build();
    }

    @Override
    public User requestToUser(NewUserRequest request) {
        return new User(request.getUserName(),
                request.getPassword(),
                request.getRole(),
                request.getFirstName(),
                request.getLastName());
    }

    @Override
    public UserStory requestToUserStory(NewUserStoryRequest request) {
        return new UserStory(request.getUserId(),
                request.getTitle(),
                request.getDescription());
    }

    @Override
    public UserStoryResponse userStoryToResponse(UserStory userStory) {
        return UserStoryResponse.newBuilder().
                setUserStoryId(userStory.getUserStoryId()).
                setUserId(userStory.getUserStoryId()).
                setTitle(userStory.getTitle()).
                setDescription(userStory.getDescription()).
                build();
    }

    @Override
    public List<BacklogResponse> backlogsToResponse(List<Backlog> backlogs) {

        List<BacklogResponse> responses = new ArrayList<>();

        for (Backlog backlog : backlogs) {
            BacklogResponse response = BacklogResponse.newBuilder().
                    setBacklogName(backlog.getBacklogName()).
                    setUserStoryId(backlog.getUserStoryId()).
                    setUserId(backlog.getUserId()).
                    build();
            responses.add(response);
        }
        return responses;
    }

    @Override
    public Backlog requestToBacklog(NewBacklogRequest request) {
        return new Backlog(request.getBacklogName(), request.getUserId());
    }

}


