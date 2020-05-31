package cours.agilite.projetVille;

import java.util.ArrayList;
import java.util.Date;

import cours.agilite.projetVille.gaulois.Gaulois;
import cours.agilite.projetVille.gaulois.Romain;

public class AdaptateurGaulois extends Habitant 
{
	private Gaulois gaulois;

	public AdaptateurGaulois(String prenom, String nom, String sexe, Ville ville, int vitesse , int force) 
	{
		super(prenom, nom, sexe, ville);

		this.gaulois = new Gaulois(vitesse, force);
	}
	
	public Gaulois getGaulois() { return this.gaulois; }
    public int getForce(){ return this.gaulois.getForce(); }
    public int getVitesse(){ return this.gaulois.getVitesse(); }
	public ArrayList<Gaulois> getAmis() { return this.gaulois.getAmis(); }
	public Romain getEnnemi() { return this.gaulois.getEnnemi(); }

    public void  setForce(int force){ this.gaulois.setForce(force); }
    public void  setVitesse(int vit){ this.gaulois.setVitesse(vit); }
	public void setAmis(ArrayList<Gaulois> amis) { this.gaulois.setAmis(amis); }
	public void setEnnemi(Romain ennemi) { this.gaulois.setEnnemi(ennemi);}

    public void deleteAmi(Gaulois ami) 
    {
    	this.gaulois.deleteAmi(ami);;
    }
    
    public void addAmi(Gaulois ami) 
    {
    	this.gaulois.addAmi(ami);
    }
    
    public void boirePotionMagique()
    {
        this.gaulois.boirePotionMagique();
    }

	@Override
	public void testCovid()
	{
		boolean contamination = false;
		
		double tauxPropagation = Math.min(1, this.ville.tauxInfection()+0.1);
		
		for(Habitant habitant : this.ville.getHabitants())
		{
			if(habitant instanceof AdaptateurGaulois && habitant.getTestCovid())
			{
				AdaptateurGaulois ami = (AdaptateurGaulois)habitant;
				if(this.getAmis().contains(ami.getGaulois())) tauxPropagation = 9/10;
			}
		}
		
		if(!this.testCovid)
		{
			double rand = Math.random();
			if(rand < tauxPropagation) 
			{
				contamination = true;
				notifyObservers();
			}
		}
		else contamination = true;

		this.testCovid = contamination;
	}
}
