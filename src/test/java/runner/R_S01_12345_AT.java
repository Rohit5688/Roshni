package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		features = "src/test/resources/Features/sprint1/",
		glue = { "steps","runner"},
		tags = { "@Indplaid" }, 
		plugin = {"html:target/cucumber-report/12345","json:target/cucumber-report/12345.json" })


public class R_S01_12345_AT {
}
