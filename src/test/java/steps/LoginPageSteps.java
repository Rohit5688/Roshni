package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import utils.CUtil;
import utils.SharedDriver;

public class LoginPageSteps {
	private LoginPage loginPage;
	private WebDriver webDriver;

	public LoginPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		loginPage = new LoginPage(webDriver);
	}

	@Given("^I navigate to Login page of Osiris$")
	public void I_navigate_to_Login_page_of_Osiris() throws Throwable {
		loginPage.navigateToLoginPage();
	}

	@When("^I click Get Started Login button$")
	public void I_click_Get_Started_Login_button() throws Throwable {
		loginPage.click_ON_GET_STARTED_LOGIN_BUTTON();
	}

	@Then("^I should see Login modal$")
	public void I_should_see_Login_modal() throws Throwable {
		Assert.assertTrue(loginPage.is_LOGIN_MODAL_DISPLAYED());
	}

	@When("^I type Username as \"([^\"]*)\"$")
	public void I_type_Username_as(String username) throws Throwable {
		if (username.equalsIgnoreCase("default")) {
			String env = System.getProperty("environment");
			if (env == null) {
				env = "qa";
			}
			switch (env) {
			case "QA":
			case "qa":
				username = System.getProperty("osiris.qa.user");
				break;
			}
		}
		if (username == null) {
			username = "username";
		}
		loginPage.type_USERNAME(username);
	}

	@When("^I type Password as \"([^\"]*)\"$")
	public void I_type_Password_as(String password) throws Throwable {
		if (password.equalsIgnoreCase("default")) {
			String env = System.getProperty("environment");
			if (env == null) {
				env = "qa";
			}
			switch (env) {
			case "QA":
			case "qa":
				password = System.getProperty("osiris.qa.password");
				break;
			}
		}
		if (password == null) {
			password = "password";
		}
		loginPage.type_PASSWORD(password);
	}

	@When("^I click Login button$")
	public void i_click_Login_button() throws Throwable {
		loginPage.click_LOGIN_BUTTON();
	}

}
