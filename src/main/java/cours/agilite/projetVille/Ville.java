package cours.agilite.projetVille;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Ville implements Observer
{
    private String nom;
    private Pays pays;
    private Maire maire;
    private List<Habitant> habitants;
    private double tauxInfection;
    
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

    public void demenagement(Habitant habitant) throws Exception
    {
    	if(habitants.contains(habitant))
		{
    		habitants.remove(habitant);
        	habitant.addObserver(this);
		}
    	else throw new Exception("L'habitant n'habite pas dans la ville");
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
    		if(habitant.getTestCovid()) infectes ++;
    	}
    	
    	resultat = infectes/habitants.size();
    	this.tauxInfection = resultat;
    	return resultat;
    }

	@Override
	public void update(Observable o, Object arg) 
	{		
		this.tauxInfection();
	}
}
