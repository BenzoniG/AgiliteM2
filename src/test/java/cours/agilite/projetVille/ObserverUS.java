package cours.agilite.projetVille;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.fr.Soit;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Alors;

import static org.junit.Assert.assertEquals;

public class ObserverUS {

	private Pays france;
	private Ville paris;
	private Ville montpelier;
	private Habitant asterix ;
	private Habitant obelix;
	private Habitant falbala;
	
	
	@Before
	public void before() {
		france = new Pays("France");
		paris = new Ville("Paris", france);
		montpelier = new Ville("Montpelier", france);
		asterix = new AdaptateurGaulois("Asterix", "", "H", paris, 10 , 10);
		obelix = new AdaptateurGaulois("Obelix", "", "H", paris, 10 , 10);
		falbala = new AdaptateurGaulois("Falbala", "", "F", paris, 10 , 10);
		paris.tauxInfection();
	}

	@After
	public void after() {
		
	}

	@Soit("asterix ayant déménagé")
	public void soit() throws Exception 
	{		
		asterix.demenager(montpelier);
		obelix.setTestCovid(true);
	}

	@Quand("il tombe malade")
	public void quand() throws Exception 
	{
		asterix.setTestCovid(true);
	}

	@Alors("la ville d'origine doit être notifiée et recacul son taux d'infection")
	public void alors() throws Exception 
	{
		
		assertEquals(0.5, paris.getTauxInfection(), 0);
	}

	
	

}

