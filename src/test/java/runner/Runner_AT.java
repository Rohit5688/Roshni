package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = true, features = "classpath:/", glue = { "classpath:/" }, tags = { "@Indmicro" }, plugin = {
		"html:target/cucumber-report/Regression", "json:target/cucumber-report/Regression.json" })

public class Runner_AT {
}
