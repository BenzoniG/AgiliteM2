package cours.agilite.projetVille;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CucumberTestSteps {

	private int chiffre;

	@Before
	public void before() {
		chiffre = 1;
	}

	@After
	public void after() {
		
	}

	@Given("^Enter search term '(.*?)'$")
	public void searchFor(String searchTerm) {
		chiffre = 1;
	}

	@When("^Do search$")
	public void clickSearchButton() {
		chiffre ++;
	}

	@Then("^Single result is shown for '(.*?)'$")
	public void assertSingleResult(String searchResult) {
		assertEquals(2, chiffre);
	}
}

