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

    public int getUserId() {
        return UserId;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
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
