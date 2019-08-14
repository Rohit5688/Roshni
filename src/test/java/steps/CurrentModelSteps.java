package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.CurrentModelPage;
import runner.SharedDriver;

public class CurrentModelSteps {
	private CurrentModelPage currentModelPage;
	private WebDriver webDriver;

	public CurrentModelSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		currentModelPage = new CurrentModelPage(webDriver);
	}

	@Then("^I should be on Current Model Page$")
	public void i_should_be_on_Current_Model_Page() throws Throwable {
		Assert.assertTrue(currentModelPage.isAtThisPage());
	}

	@When("^I click on Select button Current Model page$")
	public void i_click_on_Select_button_Current_Model_page() throws Throwable {
		currentModelPage.click_SELECT_BUTTON_CURRENT_MODEL_PAGE();
	}

}
