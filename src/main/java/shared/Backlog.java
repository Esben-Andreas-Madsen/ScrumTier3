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

    public void setBacklogName(String backlogName) {
        BacklogName = backlogName;
    }

    public int getUserStoryId() {
        return UserStoryId;
    }

    public void setUserStoryId(int userStoryId) {
        UserStoryId = userStoryId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
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
