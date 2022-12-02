package shared;

public class UserStory {
    private int UserStoryId;
    private int UserId;
    private String Title;
    private String Description;

    public UserStory(int userStoryId, int userId, String title, String description) {
        UserStoryId = userStoryId;
        UserId = userId;
        Title = title;
        Description = description;
    }

    public UserStory(int userId, String title, String description) {
        UserId = userId;
        Title = title;
        Description = description;
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

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "UseCase{" +
                "UseCaseId=" + UserStoryId +
                ", UserId=" + UserId +
                ", Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
