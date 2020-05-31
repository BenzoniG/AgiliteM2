package cours.agilite.projetVille.gaulois;

/**
 * Cette classe permet de créer un Romain caractérisé par sa force, sa vitesse et son ennemi
 *
 */
public class Romain
{
    private int vitesse=10;
    private int force=15;
    private Gaulois ennemi;

    /**
     * Constructeur d'objets de la classe Romain sans arguments
     * la vitesse et la force sont initialisés à 10 
     */
    public Romain()
    {
        // initialisation des variables d'instance
        this.vitesse = 10;
        this.force = 10;
    }
    
    /**
     * Constructeur d'objets de la classe Romain avec les arguments vitesse, force et ennemi
     */
    public Romain(int vit, int forc, Gaulois g)
    {
        // initialisation des variables d'instance
        this.vitesse = vit;
        this.force=forc;
        this.ennemi=g;
    }
    
    public void  setVitesse(int vit){
        this.vitesse=vit; 
    }
    public void  setForce(int force){
        this.force=force;
    }
    public void  setEnnemi(Gaulois g){
        this.ennemi=g;
    }
    public int getForce(){
        return force;
    }
    public int getVitesse(){
        return vitesse;
    }
	public Object getEnnemi() {
		return this.ennemi;
	}
	
	/***
	 * Cette methode permet de savoir si un romain peut attaquer son ennemi ou non
	 * @return true si le romain a plus de force que son ennemi, false sinon
	 */
    public boolean peutAttaquerEnnemi(){
        return (this.force >= this.ennemi.getForce());
    }


}
