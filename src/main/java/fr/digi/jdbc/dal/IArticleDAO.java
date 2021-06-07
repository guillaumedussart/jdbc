package fr.digi.jdbc.dal;

import fr.digi.jdbc.bo.Article;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IArticleDAO extends IDAO<Article, Long> {

    int sumAll() throws SQLException;

    int countAll() throws SQLException;
}
