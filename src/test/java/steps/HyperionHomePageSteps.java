package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.HyperionHomePage;
import runner.SharedDriver;

public class HyperionHomePageSteps {
	private HyperionHomePage hyperionHomePage;
	private WebDriver webDriver;

	public HyperionHomePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		hyperionHomePage = new HyperionHomePage(webDriver);
	}

	@Then("I should be at Hyperion Home page")
	public void i_should_be_at_Hyperion_Home_page() {
		Assert.assertTrue(hyperionHomePage.isAtThisPage());
	}

	@When("I click on Request Dashboard button")
	public void i_click_on_Request_Dashboard_button() {
		hyperionHomePage.click_REQUEST_DASHBOAR_BUTTON();
	}
}
