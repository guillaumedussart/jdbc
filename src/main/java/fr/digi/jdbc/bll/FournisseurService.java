package fr.digi.jdbc.bll;

import fr.digi.jdbc.bo.Fournisseur;
import fr.digi.jdbc.dal.DAOFactory;
import fr.digi.jdbc.dal.IFournisseurDAO;

import java.sql.SQLException;

public class FournisseurService {
	
	private static FournisseurService single;
	
	private FournisseurService() {}//Prevent initialization
	
	public static FournisseurService getSingle() {
		
		if (null == single) {
			single = new FournisseurService();
		}
		return single;
	}
	public void getAll () throws SQLException {
		IFournisseurDAO dao = DAOFactory.getFournisseurDAO();
		System.out.println(dao.findAll());
	}
	
	public void create( Fournisseur fournisseur ) throws SQLException {
		IFournisseurDAO dao = DAOFactory.getFournisseurDAO();
		dao.create( fournisseur );
	}
}
