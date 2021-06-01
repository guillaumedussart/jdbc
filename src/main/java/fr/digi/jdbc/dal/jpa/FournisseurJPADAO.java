package fr.digi.jdbc.dal.jpa;

import fr.digi.jdbc.bo.Fournisseur;
import fr.digi.jdbc.dal.IFournisseurDAO;

import java.sql.SQLException;
import java.util.Set;

public class FournisseurJPADAO implements IFournisseurDAO {
	@Override
	public void create( Fournisseur o ) throws SQLException {
	
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
