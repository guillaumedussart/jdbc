package fr.digi.jdbc;

import fr.digi.jdbc.bll.FournisseurService;
import fr.digi.jdbc.bo.Fournisseur;

import java.sql.SQLException;

public class App {
	
	public static void main( String[] args ) {
		
		//FournisseurService service = new FournisseurService(); ==> Couplage fort
		//FournisseurService service = FournisseurService.getSingle(); ==> Couplage faible
	
		FournisseurService service = FournisseurService.getSingle();
		/*try {
			service.create( new Fournisseur( "MTC" ) );
		} catch ( SQLException e ) {
			System.err.println(e.getMessage());
		}*/
		/*try {
			service.getAll();
		} catch ( SQLException e ) {
			System.err.println(e.getMessage());
		}*/
		/*try {
			System.out.println(2L);
			service.getOne(1L);
		} catch ( SQLException e ) {
			System.err.println(e.getMessage());
		}*/

		try{
			Fournisseur updateFournisseur = new Fournisseur(2L,"FDM SAS");
			service.update(updateFournisseur);
		}catch(SQLException e){

		}
	}
}
