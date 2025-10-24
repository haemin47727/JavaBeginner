package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect {
    private static final String URL = "jdbc:mysql://localhost:3306/couples?useSSL=false&serverTimezone=UTC";
    private static final String USER = "haemin47727";
    private static final String PASSWORD = "So11539094!";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // ✅ Add this line
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/couples?useSSL=false&serverTimezone=UTC",
                    "haemin47727",
                    "So11539094!"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    }
