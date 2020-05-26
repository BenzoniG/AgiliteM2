package cours.agilite.projetVille;
import java.util.ArrayList;
import java.util.List;

public class Pays 
{
    private String nom;
    private int superficie;
    private Ville capitale;
    private List<Ville> villes;
    
    public Pays(String nom, int superficie, Ville capitale)
    {
        this.nom = nom;
        this.superficie = superficie;
        this.villes = new ArrayList<Ville>();
        this.villes.add(capitale);
        this.capitale = capitale;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public int getSuperficie(){
        return this.superficie;
    }
    
    public Ville getCapitale(){
        return this.capitale;
    }
    
    public List<Ville> getVilles(){
        return this.villes;
    }

    public void setCapitale(Ville ville)
    {
        if(ville.getPays() != this)
        {
            ville.setPays(this);
        }
        if(!this.villes.contains(ville))
        {
            villes.add(ville);
        }
        this.capitale = ville;
    }
    
    public void ajouterVille(Ville ville)
    {
        this.villes.add(ville);
    }
}
