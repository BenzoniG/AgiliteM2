package cours.agilite.projetVille;

public class Maire extends Habitant
{
	public Maire(String prenom, String nom, String sexe, Ville ville)
    {
		super(prenom, nom, sexe, ville);
	}
	
	public void testerPopulation()
	{
		for(Habitant citoyen : this.ville.getHabitants())
		{
			citoyen.testCovid();
		}
	}
}
