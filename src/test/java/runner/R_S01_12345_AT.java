package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		features = "src/test/resources/Features/sprint1/",
		glue = { "steps"},
		tags = { "@Indplaid" }, 
		plugin = {"html:target/cucumber-report/12345","json:target/cucumber-report/12345.json" })


public class R_S01_12345_AT {
}
