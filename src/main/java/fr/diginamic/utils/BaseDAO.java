package fr.diginamic.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class BaseDAO {
    public Connection getConnection() throws SQLException {


        ResourceBundle bundle = ResourceBundle.getBundle("db2");
        String url = bundle.getString("db.url");
        String login = bundle.getString("db.addon_user");
        String pass = bundle.getString("db.addon_password");

        try {
            Connection connection = DriverManager.getConnection(url, login, pass);
            return connection;
        }catch (SQLException e){
            throw e;
        }
    }
}
