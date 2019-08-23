package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, features = "classpath:/", glue = { "" }, tags = {
		"@Joiplaid" }, plugin = { "html:target/cucumber-report/Regression", "json:target/cucumber-report/Regression.json" })

public class Runner_AT {
}
