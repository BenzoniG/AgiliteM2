package cours.agilite.projetVille;

import java.util.Date;

public class Habitant {
	
	private String prenom;
	private String nom;
	private Date dateNaissance;
	private String sexe;
	private boolean depistage;
	private boolean positifCOVID;
	private Ville ville;
	
	public Habitant(String prenom, String nom, Date dateNaissance, String sexe, boolean depistage, boolean positifCOVID, Ville ville)
	{
		this.prenom = prenom;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.depistage = depistage;
		this.positifCOVID = positifCOVID;
		this.ville = ville;
	}
	
	public String getPrenom() { return this.prenom; }
	public String getNom() { return this.nom; }	
	public Date getAge() { return this.dateNaissance; }	
	public String getSexe() { return this.sexe; }	
	public boolean getDepistage() { return this.depistage; }	
	public boolean getPositifCOVID() { return this.positifCOVID; }	
	public Ville getVille() { return this.ville; }
	
	
	public void testCovid(boolean resultat)
	{
		this.depistage = true;
		this.positifCOVID = resultat;
	}
	
	public void demenage(Ville ville)
	{
		this.ville = ville;
	}
	

}
