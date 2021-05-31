package fr.diginamic.jdbc;

import fr.diginamic.entities.Fournisseur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class TestInsertion {
    public static void main(String[] args) throws SQLException {
        ResourceBundle bundle = ResourceBundle.getBundle("db");

        String url = bundle.getString("db.url");
        String login = bundle.getString("db.login");
        String pass = bundle.getString("db.pass");

        try (Connection connection = DriverManager.getConnection(url, login, pass)) {
            System.out.println(connection);
            connection.setAutoCommit(true);
            Statement statement = connection.createStatement();
            int nb = statement.executeUpdate("INSERT INTO FOURNISSEUR (NOM) VALUES ('La Maison de la Peinture')");
            System.out.println(nb);

        }catch (SQLException e){
            System.out.println(e);
            throw e;
        }
    }
}
