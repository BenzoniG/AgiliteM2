package cours.agilite.projetVille;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cours.agilite.projetVille.Ville;

/**
 * Classe-test VilleTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class VilleTest
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    private Ville paris;
    private Ville springfield;
    private Maire joe;
    private Pays france = new Pays("France");
    private Habitant homer;
    private Habitant marge;
    private Habitant bart;
    private Habitant lisa;

    /**
     * Constructeur de la classe-test VilleTest
     */
    public VilleTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        paris = new Ville("Paris", france);
        springfield = new Ville("Springfield", france);
        joe = new Maire("Quimby", "Joe", "H", springfield);
        homer = new Habitant("Homer", "Simpson", "H", springfield);
        marge = new Habitant("Marge", "Simpson", "F", springfield);
        bart = new Habitant("Bart", "Simpson", "F", springfield);
        lisa = new Habitant("Lisa", "Simpson", "F", springfield);
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void testEmmenagement() throws Exception
    {
        homer.demenager(paris);
        assertEquals(homer, paris.getHabitant("Homer", "Simpson"));
    }

    @Test
    public void testDemenagement() throws Exception
    {
        homer.demenager(paris);
        assertEquals(homer, paris.getHabitant("Homer", "Simpson"));
    }
}


