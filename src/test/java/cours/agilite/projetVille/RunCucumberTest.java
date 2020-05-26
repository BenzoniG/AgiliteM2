package cours.agilite.projetVille;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/test/java",strict = true, monochrome=true, plugin = { "pretty", "junit:target/cucumber.xml" })
@RunWith(Cucumber.class)
public class RunCucumberTest {
}
