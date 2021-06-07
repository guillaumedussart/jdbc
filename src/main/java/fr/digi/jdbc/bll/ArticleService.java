package fr.digi.jdbc.bll;


import fr.digi.jdbc.bo.Article;
import fr.digi.jdbc.dal.DAOFactory;
import fr.digi.jdbc.dal.IArticleDAO;

import java.sql.SQLException;
import java.util.Set;

public class ArticleService {

    private static ArticleService single;
    private IArticleDAO dao = DAOFactory.getArticleDAO();

    private ArticleService() {
    }//Prevent initialization

    /**
     * get single
     *
     * @return {@link ArticleService}
     * @see ArticleService
     */
    public static ArticleService getSingle() {

        if (null == single) {
            single = new ArticleService();
        }
        return single;
    }

    /**
     * create
     *
     * @param article article
     * @throws SQLException java.sql. s q l exception
     */
    public void create(Article article) throws SQLException {
        dao.create(article);
    }


    /**
     * reduce price mat
     *
     * @throws SQLException java.sql. s q l exception
     */
    public void reducePriceMat() throws SQLException {

        Set<Article> articleFind = dao.findAll();
        for (Article a : articleFind) {
            if (a.getDesignation().contains("mate")) {
                double price = a.getPrix();
                double priceReduce = price * 25 / 100;
                double finalPrice = price - priceReduce;
                System.out.println("Le prix des peintures mate apres reduction est de "+finalPrice+" pour "+a.getDesignation());
            }
        }
    }

    public int averagePrice() throws SQLException {
        int sum = dao.sumAll();
        int count = dao.countAll();
        return sum/count;
    }
}
