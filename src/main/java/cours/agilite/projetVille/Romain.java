package cours.agilite.projetVille;



/**
 * D�crivez votre classe Romain ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class Romain
{
     // variables d'instance - remplacez l'exemple qui suit par le v�tre
    private int vitesse=10;
    private int force=15;
    private Gaulois ennemi;

    /**
     * Constructeur d'objets de classe Gaulois
     */
    public Romain()
    {
        // initialisation des variables d'instance
        int vitesse = 10;
        int force=10;
    }
    public Romain(int vit, int forc, Gaulois g)
    {
        // initialisation des variables d'instance
        int vitesse = vit;
        int force=forc;
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
    
    public boolean peutAttaquerEnnemi(){
        return (this.force >= this.ennemi.getForce());
    }

}
