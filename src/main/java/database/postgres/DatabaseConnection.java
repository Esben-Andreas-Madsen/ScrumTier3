package database.postgres;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection implements DBConnectionInterface
{

        public Connection getConnection() {
            Connection connection = null;

            try {
                Class.forName("org.postgresql.Driver");
              connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");

            } catch (Exception e) {
                e.printStackTrace();
            }

            return connection;
        }
    }

