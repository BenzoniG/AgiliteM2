package cours.agilite.projetVille.gaulois;



import java.util.ArrayList;

import cours.agilite.projetVille.CovidAbonne;

/**
 * 
 *
 * @author Laetitia and Othmane
 */
public class Gaulois
{
    // variables d'instance - remplacez l'exemple qui suit par le v�tre
    private int vitesse;
    private int force;
    private ArrayList<Gaulois>amis;
    private ArrayList<CovidAbonne>abonnes; 
    private Romain ennemi;

    /**
     * Constructeur d'objets de classe Gaulois
     */
    public Gaulois()
    {
        // initialisation des variables d'instance
        this.vitesse = 10;
        this.force=10;
        this.amis=new  ArrayList<Gaulois>();
    }
    public Gaulois(int vitesse , int force, ArrayList<Gaulois>amis)
    
    {
        this.vitesse += vitesse;
        this.force=force;
        // Creation d'une liste contenant les memes elements que le parametre amis ( deep copy)
        this.amis= new ArrayList<Gaulois>(amis);
    }
    public Gaulois(int vitesse , int force) {
    	
        this.vitesse = vitesse;
        this.force=force;
        // Creation d'une liste contenant les memes elements que le parametre amis ( deep copy)
        this.amis= new ArrayList<Gaulois>();
    }
    public void  setVitesse(int vit){
        this.vitesse=vit;     
    }
    public void  setForce(int force){
        this.force=force;
        
    }
    public int getForce(){
        return force;
        
    }
    public int getVitesse(){
        return vitesse;
        
    }

    public void deleteAmi(Gaulois ami) {
    	if(this.amis.contains(ami)) {
    	this.amis.remove(ami);
    	ami.deleteAmi(this);
    	}
    }
    public void addAmi(Gaulois ami) {
    	if(!amis.contains(ami)&& !ami.equals(this)) {
    		amis.add(ami);
    		ami.addAmi(this);
    	}

    }
    public void boirePotionMagique()
    {
        if(this.vitesse<500 & this.force<500){
        this.vitesse=500;
        this.force=500;
    }
        
}
	public ArrayList<Gaulois> getAmis() {
		return amis;
	}
	public void setAmis(ArrayList<Gaulois> amis) {
		this.amis = amis;
	}
	public Romain getEnnemi() {
		return ennemi;
	}
	public void setEnnemi(Romain ennemi) {
		this.ennemi = ennemi;
	}
	public ArrayList<CovidAbonne> getAbonnes() {
		return abonnes;
	}
	public void setAbonnes(ArrayList<CovidAbonne> abonnes) {
		this.abonnes = abonnes;
	}
	public void ajoutAbonne(CovidAbonne abonne) {
		this.abonnes.add(abonne);
		
	}
	public void supprimeAbonne(CovidAbonne abonne) {
		this.abonnes.remove(abonne);
	}
	public void notifie() {
		for(CovidAbonne a: this.getAbonnes()) {
			a.notify();
		}
	}
}
