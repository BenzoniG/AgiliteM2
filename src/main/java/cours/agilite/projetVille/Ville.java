package cours.agilite.projetVille;

import java.util.ArrayList;
import java.util.List;

public class Ville
{
    private String nom;
    private Pays pays;
    private Maire maire;
    private List<Habitant> habitants;
    
    public Ville(String nom, Pays pays)
    {
        this.nom = nom;
        this.pays = pays;
        this.habitants = new ArrayList<Habitant>();
    }
    
    public String getNom(){ return this.nom; }
    public Pays getPays(){ return this.pays; }
    public Maire getMaire(){ return this.maire; }    
    public List<Habitant> getHabitants(){ return this.habitants; }
    
    public void setPays(Pays pays)
    {
        if(!pays.getVilles().contains(this)) pays.ajouterVille(this);
        this.pays = pays;
    }

    public void emmenagement(Habitant habitant)
    {
    	habitants.add(habitant);
    }  

    public void demenagement(Habitant habitant)
    {
    	if(habitants.contains(habitant)) habitants.remove(habitant);
    }
    
    public void election(Maire maire) throws Exception
    {
        if(maire.getVille() == this) this.maire = maire;
        else throw new Exception("Le maire élu doit être un habitant de la ville");
    }
    
    public Habitant getHabitant(String prenom, String nom) throws Exception
    {
    	for(Habitant habitant : habitants)
    	{
    		if(habitant.getNom() == nom && habitant.getPrenom() == prenom) return habitant;
    	}
    	throw new Exception("Aucun habitant trouvé selon les critères donnés");
    }
    
    public double tauxInfection()
    {
    	int infectes = 0;
    	double resultat = 0;
    	
    	for(Habitant habitant : habitants)
    	{
    		if(habitant.getPositifCOVID()) infectes ++;
    	}
    	
    	resultat = infectes/habitants.size();
    	return resultat;
    }
}
