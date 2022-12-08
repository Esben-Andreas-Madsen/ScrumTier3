package database.postgres;


import shared.Backlog;
import shared.UserStory;
import shared.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseCommands implements DatabaseCommandsInterface {

    public User getUser(Connection connection, int UserId) {
        String sql = "select * from scrum.\"User\" where UserId = (?);";
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        User user = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, UserId);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("UserId");
                String uname = resultSet.getString("UserName");
                String pass = resultSet.getString("Password");
                String urole = resultSet.getString("Role");
                String fname = resultSet.getString("FirstName");
                String lname = resultSet.getString("LastName");

                user = new User(id, uname, pass, urole, fname, lname);
            }

            System.out.println("User returned");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    public void createUser(Connection connection, User user) {
        String sql = "insert into scrum.\"User\"(UserName,\"Password\",\"Role\",FirstName,LastName) values (?,?,?,?,?);";
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getRole());
            preparedStatement.setString(4, user.getFirstName());
            preparedStatement.setString(5, user.getLastName());
            preparedStatement.executeUpdate();
            System.out.println("User created");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<User> getAllUsers(Connection connection) {
        String sql = "select * from scrum.\"User\"";
        ResultSet resultSet;
        List<User> users = new ArrayList<>();
        Statement statement;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            User user = null;

            while (resultSet.next()) {
                user = new User(resultSet.getInt("UserId"),
                        resultSet.getString("UserName"),
                        resultSet.getString("Password"),
                        resultSet.getString("Role"),
                        resultSet.getString("FirstName"),
                        resultSet.getString("LastName"));
                users.add(user);
            }
            System.out.println("Users returned");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    ////////////////////////////////////////////////////////////

    public void createUserStory(Connection connection, UserStory userStory) {
        String sql = "insert into scrum.UserStory(UserId,Title,Description) values (?,?,?)";
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userStory.getUserId());
            preparedStatement.setString(2, userStory.getTitle());
            preparedStatement.setString(3, userStory.getDescription());
            preparedStatement.executeUpdate();
            System.out.println("UserStory created");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public UserStory getUserStoryById(Connection connection, int UserStoryId) {
        String sql = "select * from scrum.UserStory where UserStoryid = (?);";
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        UserStory userStory = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, UserStoryId);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("UserStoryId");
                int userid = resultSet.getInt("UserId");
                String head = resultSet.getString("Title");
                String desc = resultSet.getString("Description");

                userStory = new UserStory(id, userid, head, desc);
            }

            System.out.println("UserStory returned");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userStory;
    }

    public List<UserStory> getAllUserStories(Connection connection) {
        String sql = "select * from scrum.userstory";
        ResultSet resultSet;
        List<UserStory> userStories = new ArrayList<>();
        Statement statement;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            UserStory userStory = null;

            while (resultSet.next()) {
                userStory = new UserStory(resultSet.getInt("UserStoryId"),
                        resultSet.getInt("UserId"),
                        resultSet.getString("Title"),
                        resultSet.getString("Description"));
                userStories.add(userStory);
            }
            System.out.println("UserStories returned");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userStories;
    }

    ////////////////////////////////////////////////////////////

    public List<Backlog> getBacklog(Connection connection, String backlogName) {
        String sql = "select * from scrum.Backlog where \"backlogname\" = (?);";
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        Backlog backlog;
        List<Backlog> backlogs = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, backlogName);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("BacklogName");
                int UserStoryId = resultSet.getInt("UserStoryId");
                int userId = resultSet.getInt("UserId");


                backlog = new Backlog(name, UserStoryId, userId);
                backlogs.add(backlog);

            }

            System.out.println("Backlog Returned");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return backlogs;

    }

    public void createBacklog(Connection connection, Backlog backlog){
        String sql = "insert into scrum.\"backlog\"(backlogname,userid) values (?,?)";
        PreparedStatement preparedStatement;


        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, backlog.getBacklogName());
            preparedStatement.setInt(2, backlog.getUserId());
            preparedStatement.executeUpdate();
            System.out.println("Backlog created");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Backlog> getAllBacklogs(Connection connection) {
        String sql = "select * from scrum.backlog";
        ResultSet resultSet;
        List<Backlog> backlogs = new ArrayList<>();
        Statement statement;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            Backlog backlog;

            while (resultSet.next()) {
                backlog = new Backlog(resultSet.getString("BacklogName"),
                        resultSet.getInt("UserStoryId"),
                        resultSet.getInt("UserId"));
                backlogs.add(backlog);
            }
            System.out.println("Backlogs returned");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return backlogs;
    }

    public void assignUserStory(Connection connection, Backlog backlog) {
        String sql = "insert into scrum.\"backlog\"(backlogname,userstoryid,userid) values (?,?,?)";
        PreparedStatement preparedStatement;


        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, backlog.getBacklogName());
            preparedStatement.setInt(2, backlog.getUserStoryId());
            preparedStatement.setInt(3, backlog.getUserId());
            preparedStatement.executeUpdate();
            System.out.println("UserStory assigned");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }




}