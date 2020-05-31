package cours.agilite.projetVille;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.fr.Soit;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Alors;

import static org.junit.Assert.assertEquals;

import java.util.Date;

public class CucumberTestSteps {

	private Ville springfield;
	private Habitant homer;
	private Habitant marge;
	private Habitant bart;
	private Ville paris;
	private Pays france = new Pays("France");
	
	
	@Before
	public void before() {
		
	}

	@After
	public void after() {
		
	}

	@Soit("un habitant")
	public void soitUs1() 
	{
		springfield = new Ville("Springfield", france);
		paris = new Ville("Paris", france);
		homer = new Habitant("Homer", "Simpson", "H", springfield);
	}

	@Quand("l'habitant emménage dans une ville")
	public void quandUs1() throws Exception 
	{
		homer.demenager(paris);
	}

	@Alors("il est ajouté à la liste des habitants de cette ville")
	public void alorsUs1() throws Exception 
	{
		assertEquals(homer, paris.getHabitant("Homer", "Simpson"));
	}

	/*@Soit("un habitant")
	public void soitus2() 
	{
		springfield = new Ville("Springfield", 0);
		paris = new Ville("Paris", 0);
		homer = new Habitant("Homer", "Simpson", new Date(1980,01,01), "H", false, false, springfield, 0);
	}*/

	@Quand("l'habitant démménage")
	public void quandUs2() throws Exception 
	{
		homer.demenager(paris);
	}

	@Alors("l'habitant n'est plus référencé dans sa ville d'origine mais sa nouvelle ville")
	public void alorsUs2() throws Exception 
	{
		assertEquals(null, springfield.getHabitant("Homer", "Simpson"));
		assertEquals(homer, paris.getHabitant("Homer", "Simpson"));
	}

	@Soit("une ville contenant des habitants")
	public void soitUs3() throws Exception 
	{
		springfield = new Ville("Springfield", france);
		homer = new Habitant("Homer", "Simpson", "H", springfield);
		marge = new Habitant("Marge", "Simpson", "H", springfield);
		bart = new Habitant("Bart", "Simpson", "H", springfield);
		homer.demenager(springfield);
		marge.demenager(springfield);
		bart.demenager(springfield);
	}

	@Quand("le maire s'interroge sur la propagation du COVID entre les habitants")
	public void quandUs3() 
	{
		
	}

	@Alors("il peut afficher le % de la population infecté par le COVID-19")
	public void alorsUs3() 
	{
		assertEquals(1*100/3, springfield.tauxInfection(), 0);
	}

}

