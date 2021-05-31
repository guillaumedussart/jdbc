package fr.diginamic.jdbc;

import fr.diginamic.controllers.Fournisseurs;
import fr.diginamic.utils.BaseDAO;

import java.sql.*;

public class TestSelect extends BaseDAO {


    public static void main(String[] args) throws SQLException {
        Fournisseurs fournisseur = new Fournisseurs();
        fournisseur.getAllFournisseur();
    }
}
