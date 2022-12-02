package database.postgres;

import shared.Backlog;
import shared.UserStory;
import shared.User;

import java.sql.Connection;
import java.util.List;

public interface DatabaseCommandsInterface {
    User getUser(Connection connection, int UserId);
    void createUser(Connection connection, User user);
    void createUserStory(Connection connection, UserStory userStory);
    UserStory getUserStoryById(Connection connection, int UserStory);
    List<Backlog> getBacklog(Connection connection, String backlogName);


}
