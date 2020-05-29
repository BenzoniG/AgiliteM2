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
	private Ville paris;
	
	
	@Before
	public void before() {
		
	}

	@After
	public void after() {
		
	}

	@Soit("un habitant et une ville")
	public void soitUs1(String searchTerm) 
	{
		springfield = new Ville("Springfield", 0);
		paris = new Ville("Paris", 0);
		homer = new Habitant("Homer", "Simpson", new Date(1980,01,01), "H", false, false, springfield, 0);
	}

	@Quand("l'habitant emménage dans une ville")
	public void quandUs1() 
	{
		homer.demenage(paris);
	}

	@Alors("il est ajouté à la liste des habitants de cette ville")
	public void alorsUs1(String searchResult) 
	{
		assertEquals(homer, paris.getHabitant("Homer", "Simpson"));
	}

	@Soit("un habitant")
	public void soitus2(String searchTerm) 
	{
		springfield = new Ville("Springfield", 0);
		paris = new Ville("Paris", 0);
		homer = new Habitant("Homer", "Simpson", new Date(1980,01,01), "H", false, false, springfield, 0);
	}

	@Quand("l'habitant démménage")
	public void quandUs2() 
	{
		homer.demenage(paris);
	}

	@Alors("l'habitant n'est plus référencé dans sa ville d'origine mais sa nouvelle ville")
	public void alorsUs2(String searchResult) 
	{
		assertEquals(null, springfield.getHabitant("Homer", "Simpson"));
		assertEquals(homer, paris.getHabitant("Homer", "Simpson"));
	}

	@Soit("une ville contenant des habitants")
	public void soitUs3(String searchTerm) 
	{
		homer = new Habitant("Homer", "Simpson", new Date(1980,01,01), "H", false, false, springfield, 0);
	}

	@Quand("un employé s'interroge sur cette ville")
	public void quandUs3() 
	{
		
	}

	@Alors("il peut afficher le % de la population infecté par le COVID-19")
	public void alorsUs3(String searchResult) 
	{
		
	}

}

