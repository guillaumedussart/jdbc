package fr.digi.jdbc.dal.jdbc;

import fr.digi.jdbc.bo.Article;
import fr.digi.jdbc.dal.IArticleDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class ArticleJDBCDAO implements IArticleDAO {

    private static final String INSERT_QUERY = "INSERT INTO ARTICLE (REF,DESIGNATION,PRIX,ID_FOU) VALUES(?,?,?,?)";

    @Override
    public void create(Article o) throws SQLException {
        Connection connection = ConnectionDB.getSingle().getConnection();

        try (PreparedStatement pst = connection.prepareStatement(INSERT_QUERY)) {
            pst.setString(1, o.getRef());
            pst.setString(1, o.getDesignation());
            pst.setString(1, String.valueOf(o.getPrix()));
            pst.setString(1, String.valueOf(o.getFournisseurs()));
            pst.executeUpdate();
        }
    }

    @Override
    public Article findById(Long aLong) throws SQLException {
        return null;
    }

    @Override
    public Set<Article> findAll() throws SQLException {
        return null;
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
}
