package fr.digi.jdbc.dal;

import fr.digi.jdbc.dal.jax.ArticleJAXDAO;
import fr.digi.jdbc.dal.jax.FournisseurJAXDAO;
import fr.digi.jdbc.dal.jdbc.ArticleJDBCDAO;
import fr.digi.jdbc.dal.jdbc.FournisseurJDBCDAO;
import fr.digi.jdbc.dal.jpa.ArticleJPADAO;
import fr.digi.jdbc.dal.jpa.FournisseurJPADAO;

import java.util.ResourceBundle;

public final class DAOFactory {

    private static final String STORE_MODE;
    private static final String STORE_MODE_JDBC = "JDBC";
    private static final String STORE_MODE_JPA = "JPA";
    private static final String STORE_MODE_JAX = "JAX";

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        STORE_MODE = bundle.getString("datastore.mode");


    }

    private DAOFactory() {
    }

    /**
     * get fournisseur d a o
     *
     * @return {@link IFournisseurDAO}
     * @see IFournisseurDAO
     */
    public static IFournisseurDAO getFournisseurDAO() {

        IFournisseurDAO dao = null;
        switch (STORE_MODE) {
            case STORE_MODE_JDBC:
                dao = new FournisseurJDBCDAO();
                break;
            case STORE_MODE_JPA:
                dao = new FournisseurJPADAO();
                break;
            case STORE_MODE_JAX:
                dao = new FournisseurJAXDAO();
                break;

            default:
                //TODO throw your own exception class instance
        }
        return dao;
    }
    /**
     * get article d a o
     *
     * @return {@link IArticleDAO}
     * @see IArticleDAO
     */
    public static IArticleDAO getArticleDAO() {

        IArticleDAO dao = null;
        switch (STORE_MODE) {
            case STORE_MODE_JDBC:
                dao = new ArticleJDBCDAO();
                break;
            case STORE_MODE_JPA:
                dao = new ArticleJPADAO();
                break;
            case STORE_MODE_JAX:
                dao = new ArticleJAXDAO();
                break;

            default:
                //TODO throw your own exception class instance
        }
        return dao;
    }
}
