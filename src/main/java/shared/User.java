package shared;

public class User {
    private int UserId;
    private String UserName;
    private String Password;
    private String Role;
    private String FirstName;
    private String LastName;

    public User(int userId, String userName, String password, String role, String firstName, String lastName) {
        UserId = userId;
        UserName = userName;
        Password = password;
        Role = role;
        FirstName = firstName;
        LastName = lastName;
    }

    public User(String userName, String password, String role, String firstName, String lastName) {
        UserName = userName;
        Password = password;
        Role = role;
        FirstName = firstName;
        LastName = lastName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", UserId=" + UserId +
                ", Password='" + Password + '\'' +
                ", Role='" + Role + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
