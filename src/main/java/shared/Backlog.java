package shared;

public class Backlog {

    private String BacklogName;
    private int UserStoryId;
    private int UserId;

    public Backlog(String backlogName, int userStoryId, int userId) {
        BacklogName = backlogName;
        UserStoryId = userStoryId;
        UserId = userId;
    }

    public Backlog(String backlogName, int userId) {
        BacklogName = backlogName;
        UserId = userId;
    }

    public String getBacklogName() {
        return BacklogName;
    }

    public int getUserStoryId() {
        return UserStoryId;
    }

    public int getUserId() {
        return UserId;
    }

    @Override
    public String toString() {
        return "Backlog{" +
                "BacklogName='" + BacklogName + '\'' +
                ", UserStoryId=" + UserStoryId +
                ", UserId=" + UserId +
                '}';
    }
}
