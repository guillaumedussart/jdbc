package fr.digi.jdbc.dal.jdbc;

import fr.digi.jdbc.bo.Fournisseur;
import fr.digi.jdbc.dal.IFournisseurDAO;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FournisseurJDBCDAO implements IFournisseurDAO {

    private static final String INSERT_QUERY = "INSERT INTO FOURNISSEUR (NOM) VALUES(?)";
    private static final String FIND_ALL_QUERY = "SELECT * FROM FOURNISSEUR";
    private static final String FIND_BY_ID_QUERY = "SELECT * FROM FOURNISSEUR WHERE ID = ?";
    private static final String UPDATE_QUERY = "UPDATE FOURNISSEUR SET NOM = ? WHERE ID = ?";
    private static final String DELETE_QUERY = "DELETE FROM FOURNISSEUR WHERE ID = ?";

    @Override
    public void create(Fournisseur o) throws SQLException {

        Connection connection = ConnectionDB.getSingle().getConnection();

        try (PreparedStatement pst = connection.prepareStatement(INSERT_QUERY)) {
            pst.setString(1, o.getNom());
            pst.executeUpdate();
        }
    }

    @Override
    public Fournisseur findById(Long aLong) throws SQLException {

        Connection connection = ConnectionDB.getSingle().getConnection();

        try (PreparedStatement pst = connection.prepareStatement(FIND_BY_ID_QUERY)) {
            pst.setLong(1, aLong);
            ResultSet rs = pst.executeQuery();
            Fournisseur fournisseur = null;
            while (rs.next()) {
                fournisseur = new Fournisseur(rs.getLong("ID"), rs.getString("NOM"));
            }
            return fournisseur;
        }
    }

    @Override
    public Set<Fournisseur> findAll() throws SQLException {

        Connection connection = ConnectionDB.getSingle().getConnection();
        Statement statement = connection.createStatement();

        try (ResultSet result = statement.executeQuery(FIND_ALL_QUERY)) {
            Set<Fournisseur> listFournisseur = new HashSet<>();
            while (result.next()) {
                listFournisseur.add(new Fournisseur(result.getLong("ID"), result.getString("NOM")));
            }
            return listFournisseur;
        }
    }

    @Override
    public void update(Fournisseur o) throws SQLException {
        Connection connection = ConnectionDB.getSingle().getConnection();
        try (PreparedStatement pst = connection.prepareStatement(UPDATE_QUERY)) {
            pst.setString(1, o.getNom());
            pst.setString(2, String.valueOf(o.getId()));
            pst.executeUpdate();
        }
    }

    @Override
    public void delete(Fournisseur o) {

    }

    @Override
    public void deleteById(Long aLong) throws SQLException {
        Connection connection = ConnectionDB.getSingle().getConnection();
        try (PreparedStatement pst = connection.prepareStatement(DELETE_QUERY)) {
            pst.setString(1, String.valueOf(aLong));
            pst.executeUpdate();
        }
    }
}
