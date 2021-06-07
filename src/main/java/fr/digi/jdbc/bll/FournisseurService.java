package fr.digi.jdbc.bll;

import fr.digi.jdbc.bo.Fournisseur;
import fr.digi.jdbc.dal.DAOFactory;
import fr.digi.jdbc.dal.IFournisseurDAO;

import java.sql.SQLException;

public class FournisseurService {

    private static FournisseurService single;

    private FournisseurService() {
    }//Prevent initialization

    /**
     * get single
     *
     * @return {@link FournisseurService}
     * @see FournisseurService
     */
    public static FournisseurService getSingle() {

        if (null == single) {
            single = new FournisseurService();
        }
        return single;
    }

    /**
     * get one
     *
     * @param aLong aLong
     * @throws SQLException java.sql. s q l exception
     * @return
     */
    public Fournisseur getOne(Long aLong) throws SQLException {
        IFournisseurDAO dao = DAOFactory.getFournisseurDAO();
        Fournisseur fournisseur = dao.findById(aLong);
        return fournisseur;
    }

    /**
     * get all
     *
     * @throws SQLException java.sql. s q l exception
     */
    public void getAll() throws SQLException {
        IFournisseurDAO dao = DAOFactory.getFournisseurDAO();
        System.out.println(dao.findAll());
    }

    /**
     * create
     *
     * @param fournisseur fournisseur
     * @throws SQLException java.sql. s q l exception
     */
    public void create(Fournisseur fournisseur) throws SQLException {
        IFournisseurDAO dao = DAOFactory.getFournisseurDAO();
        dao.create(fournisseur);
    }

    /**
     * update
     *
     * @param fournisseur fournisseur
     * @throws SQLException java.sql. s q l exception
     */
    public void update(Fournisseur fournisseur) throws SQLException {
        IFournisseurDAO dao = DAOFactory.getFournisseurDAO();
        dao.update(fournisseur);
    }

    /**
     * delete
     *
     * @param aLong aLong
     * @throws SQLException java.sql. s q l exception
     */
    public void delete(Long aLong) throws SQLException {
        IFournisseurDAO dao = DAOFactory.getFournisseurDAO();
        dao.deleteById(aLong);
    }
}
