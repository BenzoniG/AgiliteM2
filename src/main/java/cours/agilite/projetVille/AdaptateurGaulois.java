package cours.agilite.projetVille;

import java.util.ArrayList;

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
        this.testCovid = false;
    }

	@Override
	public void testCovid()
	{		
		if(this.getForce() < 500)
		{
			super.testCovid();
		}
	}
}
