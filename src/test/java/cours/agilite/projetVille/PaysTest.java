package cours.agilite.projetVille;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cours.agilite.projetVille.Ville;
import cours.agilite.projetVille.Pays;

import static org.junit.Assert.*;

/**
 * @author  guill
 */
public class PaysTest
{
    private Ville paris;
    private Ville perpignan;
    private Pays france;    
    
    public PaysTest(){}

    // Met en place les engagements. Méthode appelée avant chaque appel de méthode de test.
    @Before
    public void setUp() // throws java.lang.Exception
    {
        paris = new Ville("Paris", 2148000);
        perpignan = new Ville("Perpignan", 121934);
        france = new Pays("France", 643801, paris);
        france.ajouterVille(perpignan);
        paris.setPays(france);
        perpignan.setPays(france);
    }

    //Supprime les engagements. Méthode appelée après chaque appel de méthode de test.
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }
    
    
    @Test
    public void testCapitale()
    {
        assertEquals(paris, france.getCapitale());
        assertEquals(france, paris.getPays());
        assertEquals(france, perpignan.getPays());
        assertEquals(true, france.getVilles().contains(paris));
        assertEquals(true, france.getVilles().contains(perpignan));
        assertNotEquals(perpignan, france.getCapitale());
    }
}






