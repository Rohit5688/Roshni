package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.HyperionLoginPage;
import page.LoginPage;
import runner.SharedDriver;

public class HyperionLoginPageSteps {
	private HyperionLoginPage hyperionloginPage;
	private WebDriver webDriver;

	public HyperionLoginPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		hyperionloginPage = new HyperionLoginPage(webDriver);
	}

	@Given("I navigate to Login page of Hyperion")
	public void i_navigate_to_Login_page_of_Hyperion() {
		hyperionloginPage.navigateToLoginPage();
	}

	@When("I click Get Started Login button Hyperion landing page")
	public void i_click_Get_Started_Login_button_Hyperion_landing_page() {
		hyperionloginPage.click_ON_LOGIN_BUTTON_LANDING_PAGE();
	}

	@Then("I should see Login section hyperion")
	public void i_should_see_Login_section_hyperion() {
		Assert.assertTrue(hyperionloginPage.isAtThisPage());
	}

	@When("I type Username as {string} for Hyperion")
	public void i_type_Username_as_for_Hyperion(String username) {
		if (username.equalsIgnoreCase("default")) {
			String env = System.getProperty("environment");
			if (env == null) {
				env = "qa";
			}
			switch (env) {
			case "QA":
			case "qa":
				username = System.getProperty("hyperion.qa.user");
				break;
			}
		}
		if (username == null) {
			username = "username";
		}
		hyperionloginPage.type_USER_NAME(username);
	}

	@When("I type Password as {string} for Hyperion")
	public void i_type_Password_as_for_Hyperion(String password) {
		if (password.equalsIgnoreCase("default")) {
			String env = System.getProperty("environment");
			if (env == null) {
				env = "qa";
			}
			switch (env) {
			case "QA":
			case "qa":
				password = System.getProperty("hyperion.qa.password");
				break;
			}
		}
		if (password == null) {
			password = "password";
		}
		hyperionloginPage.type_PASS_WORD(password);
	}

	@When("I click Login button for Hyperion")
	public void i_click_Login_button_for_Hyperion() {
		hyperionloginPage.click_ON_LOGIN_BUTTON();
	}

}
