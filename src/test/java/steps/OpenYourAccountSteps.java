package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.OpenYourAccountPage;
import runner.SharedDriver;

public class OpenYourAccountSteps {
	private OpenYourAccountPage openYourAccountPage;
	private WebDriver webDriver;

	public OpenYourAccountSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		openYourAccountPage = new OpenYourAccountPage(webDriver);
	}

	@Then("^I should see Open Your Account Page$")
	public void i_should_see_Open_Your_Account_Page() throws Throwable {
		Assert.assertTrue(openYourAccountPage.isAtThisPage());
	}

	@When("^I click on Next button Open Your Account Page$")
	public void i_click_on_Next_button_Open_Your_Account_Page() throws Throwable {
		openYourAccountPage.click_NEXT_BUTTON_OPEN_ACCOUNT_PAGE();
	}

	@When("^I select Account Type as \"([^\"]*)\"$")
	public void i_select_Account_Type_as(String text) throws Throwable {
		openYourAccountPage.select_ACCOUNT_TYPE(text);
	}

}
