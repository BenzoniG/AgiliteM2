package cours.agilite.projetVille;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class Senario2 {
	
  @Given("^un habitant déjà malade$")
  public void given() throws Throwable {
  }

  @When("^l état de l habitant change de \\\"([^\\\"]*)\\\" à \\\"([^\\\"]*)\\\"$")
  public void when(String arg1, String arg2) throws Throwable {
  }

  @Then("^enregistrement du nouvel \"([^\"]*)\" de l habitant malade$")
  public void then(String arg1) throws Throwable {
  }

  
}
