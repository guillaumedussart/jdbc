package fr.digi.jdbc.bll;

import fr.digi.jdbc.bo.Article;
import fr.digi.jdbc.dal.DAOFactory;
import fr.digi.jdbc.dal.IFournisseurDAO;

import java.sql.SQLException;

public class ArticleService {
    private static ArticleService single;

    private ArticleService() {
    }//Prevent initialization

    public static ArticleService getSingle() {

        if (null == single) {
            single = new ArticleService();
        }
        return single;
    }
    public void create(Article article) throws SQLException {
        IFournisseurDAO dao = DAOFactory.getFournisseurDAO();
        dao.create(article);
    }

}
