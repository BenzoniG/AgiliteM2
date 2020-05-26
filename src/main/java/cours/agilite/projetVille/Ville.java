package cours.agilite.projetVille;
public class Ville
{
    // variables d'instance
    private String nom;
    private int nbHabitants;
    private Maire maire;
    
    private Pays pays;
    
    public Ville(String nom, int population)
    {
        this.nom = nom;
        this.nbHabitants = population;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public int getNbHabitants(){
        return this.nbHabitants;
    }
    
    public Maire getMaire(){
        return this.maire;
    }
    
    public Pays getPays()
    {
        return this.pays;
    }
    
    public void setPays(Pays pays)
    {
        if(!pays.getVilles().contains(this))
        {
            pays.ajouterVille(this);
        }
        this.pays = pays;
    }
        
    /**
     * Nouveaux arrivants dans la ville
     * 
     * @param  nbHabitants   Nombre d'arrivant
     */
    public int emmenagement(int nbHabitants)
    {
        this.nbHabitants +=  nbHabitants;
        return this.nbHabitants;
    }  
    
    /**
     * Personnes quittant la ville
     * 
     * @param  nbHabitants   Nombre de départ
     */
    public int demenagement(int nbHabitants)
    {
        this.nbHabitants -=  nbHabitants;
        return this.nbHabitants;
    }
    
    public String elire(Maire maire)
    {
        this.maire = maire;
        
        if(maire.getVille() != this){
            maire.dirige(this);
        }
      
        return maire.getPrenom() + " " + maire.getNom();
    }
}
