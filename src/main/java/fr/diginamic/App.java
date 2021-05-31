package fr.diginamic;

import java.sql.*;
import java.util.ResourceBundle;

public class App {

    private static final String ID_COL = "ID";
    private static final String NOM_COL = "NOM";

    public static void main(String[] args) throws SQLException {
        ResourceBundle bundle = ResourceBundle.getBundle("db");

        String url = bundle.getString("db.url");
        String login = bundle.getString("db.login");
        String pass = bundle.getString("db.pass");
        try (Connection connection = DriverManager.getConnection(url, login, pass)) {
            System.out.println(connection);
            connection.setAutoCommit(true);
            Statement statement = connection.createStatement();
            //int nb = statement.executeUpdate("INSERT INTO FOURNISSEUR (NOM) VALUES ('La Maison de la Peinture')");
            //System.out.println(nb);
            //ResultSet result = statement.executeQuery();
        }catch (SQLException e){
            System.out.println(e);
            throw e;
        }
    }
}
