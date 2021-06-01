package fr.digi.jdbc.dal;

import fr.digi.jdbc.dal.jax.FournisseurJAXDAO;
import fr.digi.jdbc.dal.jdbc.FournisseurJDBCDAO;
import fr.digi.jdbc.dal.jpa.FournisseurJPADAO;

import java.util.ResourceBundle;

public final class DAOFactory {
	
	private static final String STORE_MODE;
	private static final String STORE_MODE_JDBC = "JDBC";
	private static final String STORE_MODE_JPA = "JPA";
	private static final String STORE_MODE_JAX = "JAX";
	
	static {
		ResourceBundle bundle = ResourceBundle.getBundle( "db" );
		STORE_MODE = bundle.getString( "db.properties" );
	}
	
	private DAOFactory() {}
	
	public static IFournisseurDAO getFournisseurDAO() {
		
		IFournisseurDAO dao = null;
		switch ( STORE_MODE ) {
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
}
