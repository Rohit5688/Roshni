package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.InterestedPartiesPage;
import runner.SharedDriver;

public class InterestedPartiesPageSteps {
	private InterestedPartiesPage interestedPartiesPage;
	private WebDriver webDriver;

	public InterestedPartiesPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		interestedPartiesPage = new InterestedPartiesPage(webDriver);
	}

	@Then("I should see Interested Parties page")
	public void i_should_see_Interested_Parties_page() {
		Assert.assertTrue(interestedPartiesPage.isAtThisPage());
	}

	@When("I click on Next button Interested Parties page")
	public void i_click_on_Next_button_Interested_Parties_page() {
		interestedPartiesPage.click_NEXT_BUTTON();
	}

}
