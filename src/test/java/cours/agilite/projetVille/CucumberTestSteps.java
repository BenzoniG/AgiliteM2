package cours.agilite.projetVille;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.fr.Soit;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Alors;

import static org.junit.Assert.assertEquals;

public class CucumberTestSteps {


	@Before
	public void before() {
		
	}

	@After
	public void after() {
		
	}

	@Soit("un habitant et une ville")
	public void searchFor(String searchTerm) {
		Ville springfield = new Ville("springfield",0);
	}

	@Quand("l'habitant emménage dans une ville")
	public void clickSearchButton() {
		
	}

	@Alors("^l'habitant habite dans cette ville qui contient un habitant de plus$")
	public void assertSingleResult(String searchResult) {
		
	}

}

