package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect {
    private static final String URL = "jdbc:mysql://your-localhost/couples?useSSL=false&serverTimezone=UTC";
    private static final String USER = "your-username";
    private static final String PASSWORD = "your-password";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // ✅ Add this line
            return DriverManager.getConnection(
                    "jdbc:mysql://your-localhost/couples?useSSL=false&serverTimezone=UTC",
                    "your-username",
                    "your-password"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    }
