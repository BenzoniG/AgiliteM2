package cours.agilite.projetVille;

import java.util.ArrayList;
import java.util.List;

public class Ville
{
    // variables d'instance
    private String nom;
    private int nbHabitants;
    private Maire maire;
    
    private Pays pays;
    private List<Habitant> habitants;
    
    public Ville(String nom, int population)
    {
        this.nom = nom;
        this.nbHabitants = population;
        habitants = new ArrayList<Habitant>();
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
    public int emmenagement(Habitant habitant)
    {
    	habitants.add(habitant);
        this.nbHabitants +=  nbHabitants;
        return this.nbHabitants;
    }  
    
    /**
     * Personnes quittant la ville
     * 
     * @param  nbHabitants   Nombre de départ
     */
    public int demenagement(Habitant habitant)
    {
    	if(habitants.contains(habitant))
    	{
    		habitants.remove(habitant);
    	}
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
    
    public Habitant getHabitant(String prenom, String nom)
    {
    	for(Habitant habitant : habitants)
    	{
    		if(habitant.getNom() == nom && habitant.getPrenom() == prenom)
    		{
    			return habitant;
    		}
    	}
    	
    	return null;
    }
    
    public double getPropagation()
    {
    	int total = 0;
    	
    	for(Habitant habitant : habitants)
    	{
    		if(habitant.getPositifCOVID())
    		{
    			total ++;
    		}
    	}
    	
    	return total*100/habitants.size();
    }
}
