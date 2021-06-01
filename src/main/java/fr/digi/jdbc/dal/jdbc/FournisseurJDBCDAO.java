package fr.digi.jdbc.dal.jdbc;

import fr.digi.jdbc.bo.Fournisseur;
import fr.digi.jdbc.dal.IFournisseurDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

public class FournisseurJDBCDAO implements IFournisseurDAO {
	
	private static final String INSERT_QUERY = "INSERT INTO FOURNISSEUR (NOM) VALUES('%s')";
	private static final String FIND_ALL_QUERY = "SELECT * FOURNISSEUR";
	private static final String FIND_BY_ID_QUERY = "SELECT * FOURNISSEUR WHERE ID = %s";
	private static final String UPDATE_QUERY = "UPDATE FOURNISSEUR SET NOM = '%s' WHERE ID = %s";
	private static final String DELETE_QUERY = "DELETE FROM FOURNISSEUR WHERE ID = %s";
	
	@Override
	public void create( Fournisseur o ) throws SQLException {
		
		Connection connection = ConnectionDB.getSingle().getConnection();
		try( Statement st = connection.createStatement() ) {
			st.executeUpdate( String.format( INSERT_QUERY, o.getNom() ) );
		}
	}
	
	@Override
	public Fournisseur findById( Long aLong ) {
		return null;
	}
	
	@Override
	public Set<Fournisseur> findAll() {
		return null;
	}
	
	@Override
	public void update( Fournisseur o ) {
	
	}
	
	@Override
	public void delete( Fournisseur o ) {
	
	}
	
	@Override
	public void deleteById( Long aLong ) {
	
	}
}
