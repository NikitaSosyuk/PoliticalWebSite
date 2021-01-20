package model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {
    public Connection getNewConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/RM_schema?useUnicode=true&serverTimezone=Europe/Moscow";
            String user = "root";
            String password = "rootpassword";
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
