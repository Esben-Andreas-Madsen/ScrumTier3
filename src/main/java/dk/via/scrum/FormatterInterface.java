package dk.via.scrum;

import shared.Backlog;
import shared.UserStory;
import shared.User;

import java.util.List;

public interface FormatterInterface {
    UserResponse userToResponse(User user);
    User requestToUser(NewUserRequest request);
    UserStory requestToUserStory(NewUserStoryRequest request);
    UserStoryResponse userStoryToResponse(UserStory userStory);
    List<BacklogResponse> backlogsToResponse(List<Backlog> backlogs);
    Backlog requestToBacklog(NewBacklogRequest request);

    Backlog assignRequestToBacklog(AssignUserStoryToBacklog request);

}
