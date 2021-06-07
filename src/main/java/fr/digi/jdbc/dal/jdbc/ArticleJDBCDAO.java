package fr.digi.jdbc.dal.jdbc;

import fr.digi.jdbc.bo.Article;
import fr.digi.jdbc.dal.IArticleDAO;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class ArticleJDBCDAO implements IArticleDAO {


    private static final String FIND_ALL_QUERY = "SELECT * FROM ARTICLE";
    private static final String FIND_BY_ID_QUERY = "SELECT * FROM FOURNISSEUR WHERE ID = ?";
    private static final String UPDATE_QUERY = "UPDATE FOURNISSEUR SET NOM = ? WHERE ID = ?";
    private static final String DELETE_QUERY = "DELETE FROM FOURNISSEUR WHERE ID = ?";

    private static final String INSERT_QUERY = "INSERT INTO ARTICLE (REF,DESIGNATION,PRIX,ID_FOU) VALUES(?,?,?,?)";
    private static final String COUNT_ALL = "SELECT COUNT(*) as countall FROM ARTICLE";
    private static final String SUM_PRICE = "SELECT SUM(PRIX) as sumprice FROM ARTICLE";
    private static Connection connection;

    static {
        try {
            connection = ConnectionDB.getSingle().getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void create(Article o) throws SQLException {

        try (PreparedStatement pst = connection.prepareStatement(INSERT_QUERY)) {
            pst.setString(1, o.getRef());
            pst.setString(2, o.getDesignation());
            pst.setString(3, String.valueOf(o.getPrix()));
            pst.setString(4, String.valueOf(o.getFournisseur().getId()));
            pst.executeUpdate();
        }
    }

    @Override
    public Article findById(Long aLong) throws SQLException {
        return null;
    }

    @Override
    public Set<Article> findAll() throws SQLException {
        Statement statement = connection.createStatement();

        try (ResultSet result = statement.executeQuery(FIND_ALL_QUERY)) {
            Set<Article> listArticle = new HashSet<>();
            while (result.next()) {
                listArticle.add(new Article(result.getLong("ID"), result.getString("REF"), result.getString("DESIGNATION"), result.getDouble("PRIX")));
            }
            return listArticle;
        }
    }

    @Override
    public void update(Article o) throws SQLException {

    }

    @Override
    public void delete(Article o) {

    }

    @Override
    public void deleteById(Long aLong) throws SQLException {

    }

    public int countAll() throws SQLException {
        Statement statement = connection.createStatement();

        try (ResultSet result = statement.executeQuery(COUNT_ALL)) {
            int count = 0;
            if (result.next() && result != null) {
                count = result.getInt("countall");
            }
            return count;
        }
    }

    public int sumAll() throws SQLException {
        Statement statement = connection.createStatement();

        try (ResultSet result = statement.executeQuery(SUM_PRICE)) {
            int sum = 0;
            if (result.next() && result != null) {
                sum = result.getInt("sumprice");
            }
            return sum;
        }
    }
}
