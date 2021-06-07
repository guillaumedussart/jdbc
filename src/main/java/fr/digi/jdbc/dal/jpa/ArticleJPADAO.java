package fr.digi.jdbc.dal.jpa;

import fr.digi.jdbc.bo.Article;
import fr.digi.jdbc.dal.IArticleDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

public class ArticleJPADAO implements IArticleDAO {

	@Override
	public void create(Article o) throws SQLException {

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

	@Override
	public int sumAll() {
		return 0;
	}

	@Override
	public int countAll() {
		return 0;
	}
}
