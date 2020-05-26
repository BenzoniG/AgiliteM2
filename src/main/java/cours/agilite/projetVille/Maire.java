package cours.agilite.projetVille;


/**
 * Décrivez votre classe Maire ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Maire
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private String prenom;
    private Ville ville;

    /**
     * Constructeur d'objets de classe Maire
     */
    public Maire()
    {
        // initialisation des variables d'instance
        this.nom = "";
        this.prenom = "";
        this.ville = null;
    }
    
    public Maire(String nom, String prenom)
    {
        // initialisation des variables d'instance
        this.nom = nom;
        this.prenom = prenom;
        this.ville = null;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public String getPrenom(){
        return this.prenom;
    }
    
    public Ville getVille(){
        return this.ville;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String dirige(Ville ville)
    {
        this.ville = ville;
        
        if(ville.getMaire() != this){
            ville.elire(this);
        }
        
        return ville.getNom();
    }
}
