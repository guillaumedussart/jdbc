package fr.diginamic.jdbc;

import fr.diginamic.entities.Fournisseur;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TestSelect {
    public static void main(String[] args) throws SQLException {
        ResourceBundle bundle = ResourceBundle.getBundle("db");

        String url = bundle.getString("db.url");
        String login = bundle.getString("db.login");
        String pass = bundle.getString("db.pass");


        try (Connection connection = DriverManager.getConnection(url, login, pass)) {
            System.out.println(connection);
            connection.setAutoCommit(true);
            Statement statement = connection.createStatement();

            try(ResultSet result = statement.executeQuery("SELECT * FROM FOURNISSEUR")){
                List<Fournisseur> listFournisseur = new ArrayList<>();
                while (result.next()){
                    listFournisseur.add(new Fournisseur(result.getInt("ID"),result.getString("NOM")));
                }
                for (Fournisseur fournisseur: listFournisseur ) {
                    System.out.println(fournisseur.toString());
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
            throw e;
        }
    }
}
