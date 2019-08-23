package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, features = "classpath:/", glue = { "classpath:/" }, tags = { "@regression" }, plugin = {
		"html:target/cucumber-report/Regression", "json:target/cucumber-report/Regression.json" })

public class Runner_AT {
}
