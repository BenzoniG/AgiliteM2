package cours.agilite.projetVille;
import java.util.ArrayList;
import java.util.List;

public class Pays 
{
    private String nom;
    private Ville capitale;
    private List<Ville> villes;
    
    public Pays(String nom)
    {
        this.nom = nom;
        this.villes = new ArrayList<Ville>();
    }
    
    public String getNom(){ return this.nom; }
    public Ville getCapitale(){ return this.capitale; }
    public List<Ville> getVilles(){ return this.villes; }

    public void setCapitale(Ville ville)
    {
        if(ville.getPays() != this) ville.setPays(this);
        if(!this.villes.contains(ville)) villes.add(ville);
        this.capitale = ville;
    }
    
    public void ajouterVille(Ville ville)
    {
        this.villes.add(ville);
    }
}
