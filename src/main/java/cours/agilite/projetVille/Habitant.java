package cours.agilite.projetVille;

import java.util.Observable;

public class Habitant extends Observable
{
	protected String prenom;
	protected String nom;
	protected String sexe;
	protected boolean testCovid;
	protected Ville ville;
	
	public Habitant(String prenom, String nom, String sexe, Ville ville)
	{
		this.prenom = prenom;
		this.nom = nom;
		this.sexe = sexe;
		this.ville = ville;
		this.testCovid = false;
		ville.emmenagement(this);
	}
	
	public String getPrenom() { return this.prenom; }
	public String getNom() { return this.nom; }	
	public String getSexe() { return this.sexe; }		
	public boolean getTestCovid() { return this.testCovid; }	
	public Ville getVille() { return this.ville; }
	
	public void setTestCovid(boolean resultat)
	{  
		this.testCovid = resultat;
        setChanged();
		notifyObservers();
	}
	
	public void demenager(Ville ville) throws Exception
	{
		this.ville.demenagement(this);
		ville.emmenagement(this);
		this.ville = ville;
	}
		
	public void testCovid()
	{
		boolean contamination = false;
		double tauxPropagation = Math.min(1, this.ville.tauxInfection()+0.1);
		
		if(!this.testCovid)
		{
			double rand = Math.random();
			if(rand < tauxPropagation)
			{
				contamination = true;
		        setChanged();
				notifyObservers();
			}
		}
		else contamination = true;
		
		this.testCovid = contamination;
	}
}
