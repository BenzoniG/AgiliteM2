package cours.agilite.projetVille;

import java.util.Date;

public class Adaptateur extends Habitant {
	
	public Adaptateur(String prenom, String nom, Date dateNaissance, String sexe, boolean depistage,
			boolean positifCOVID, Ville ville) {
		super(prenom, nom, dateNaissance, sexe, depistage, positifCOVID, ville);
		// TODO Auto-generated constructor stub
	}


	private Gaulois gaulois;

	
	
	/*
	@override
	public boolean testCovid()
	{
		
	}
	*/
}
