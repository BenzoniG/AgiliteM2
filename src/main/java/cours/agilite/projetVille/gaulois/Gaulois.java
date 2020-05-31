package cours.agilite.projetVille.gaulois;

import java.util.ArrayList;

/**
 * Cette classe permet de créer un Gaulois caractérisé par sa force, sa vitesse son ennemi et sa liste d'amis 
 * @author Laetitia and Othmane
 */
public class Gaulois
{
	private int vitesse;
	private int force;
	private ArrayList<Gaulois>amis;
	private Romain ennemi;

	/**
	 * Constructeur d'objets de classe Gaulois sans arguments
	 * la vitesse et la force sont initialisés à 10 
	 * la liste d'amis est initialisée avec une liste vide 
	 */
	public Gaulois()
	{
		// initialisation des variables d'instance
		this.vitesse = 10;
		this.force=10;
		this.amis=new  ArrayList<Gaulois>();
	}

	/**
	 * Constructeur d'objets de classe Gaulois en fournissant les arguments vitesse, force et liste d'amis
	 */
	public Gaulois(int vitesse , int force, ArrayList<Gaulois>amis)

	{
		this.vitesse += vitesse;
		this.force=force;
		// Creation d'une liste contenant les memes elements que le parametre amis ( deep copy)
		this.amis= new ArrayList<Gaulois>(amis);
	}

	/**
	 * Constructeur d'objets de classe Gaulois en fournissant les arguments vitesse et force
	 * la liste d'amis est initialisée avec une liste vide 
	 */
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
	public Romain getEnnemi() {
		return ennemi;
	}
	public void setEnnemi(Romain ennemi) {
		this.ennemi = ennemi;
	}
	public ArrayList<Gaulois> getAmis() {
		return amis;
	}
	
	/***
	 * Cette méthode vérifie que la liste donnée en argument ne contient pas cette instance de gaulois 
	 * et remplace ensuite la liste d'amis actuelle par la nouvelle 
	 * Il faut ensuite s'assurer que pour chaque amis de la liste, le gaulois fait bien partie 
	 * de leur listes d'amis
	 * @param amis
	 */
	public void setAmis(ArrayList<Gaulois> amis) {
		if (!amis.contains(this)) {
    		this.amis = amis;
    		for (Gaulois ami : amis) {
    			ami.addAmi(this);
    		}
    	}
	}

	public void deleteAmi(Gaulois ami) {
		if(this.amis.contains(ami)) { 
			//on supprime bien de la liste de ce gaulois mais aussi de la liste de l'ami
			this.amis.remove(ami);
			ami.deleteAmi(this);
		}
	}
	public void addAmi(Gaulois ami) {
		if(!amis.contains(ami)&& !ami.equals(this)) { 
			//on ajoute bien à la liste de ce gaulois mais aussi à celle de l'ami
			amis.add(ami);
			ami.addAmi(this);
		}

	}
	
	/***
	 * Cette méthode permet à un gaulois d'augmenter sa force et sa vitesse en buvant de la potion 
	 * Chacune passe alors à 500
	 */
	public void boirePotionMagique()
	{
		if(this.vitesse<500){
	        this.vitesse=500;
        }
        if(this.force<500){
	        this.force=500;
        }
	}

}
