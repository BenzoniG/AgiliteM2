package cours.agilite.projetVille;

import java.util.ArrayList;
import java.util.Date;

import cours.agilite.projetVille.gaulois.Gaulois;
import cours.agilite.projetVille.gaulois.Romain;

public class AdaptateurRomain extends Habitant 
{
	private Romain romain;

	public AdaptateurRomain(String prenom, String nom, String sexe, Ville ville, int vitesse , int force, Gaulois gaulois) 
	{
		super(prenom, nom, sexe, ville);

		this.romain = new Romain(vitesse, force, gaulois);
	}
	
	public Romain getRomain() { return this.romain; }
    public int getForce(){ return this.romain.getForce(); }
    public int getVitesse(){ return this.romain.getVitesse(); }

    public void  setForce(int force){ this.romain.setForce(force); }
    public void  setVitesse(int vit){ this.romain.setVitesse(vit); }
	public void setEnnemi(Gaulois ennemi) { this.romain.setEnnemi(ennemi);}

    public boolean peutAttaquerEnnemi()
    {
        return this.romain.peutAttaquerEnnemi();
    }
}
