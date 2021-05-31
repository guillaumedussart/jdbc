package fr.diginamic.controllers;

import fr.diginamic.entities.Fournisseur;
import fr.diginamic.utils.BaseDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Fournisseurs extends BaseDAO {


    public String getAllFournisseur() throws SQLException {
        Connection conn = getConnection();
        System.out.println(conn);

        Statement statement = conn.createStatement();
        try {
            ResultSet result = statement.executeQuery("SELECT * FROM FOURNISSEUR");
            List<Fournisseur> listFournisseur = new ArrayList<>();
            while (result.next()) {
                listFournisseur.add(new Fournisseur(result.getInt("ID"), result.getString("NOM")));
            }
            for (Fournisseur fournisseur : listFournisseur) {
                System.out.println(fournisseur.toString());
            }
        } catch (SQLException e) {
            throw e;

        }
        return null;
    }

    public void InsertFournisseur(String fournisseur){

    }
}
