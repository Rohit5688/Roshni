package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.InvestmentProfilePage;
import runner.SharedDriver;

public class InvestmentProfilePageSteps {

	private InvestmentProfilePage investmentProfilePage;
	private WebDriver webDriver;

	public InvestmentProfilePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		investmentProfilePage = new InvestmentProfilePage(webDriver);
	}

	@When("^I select option as \"([^\"]*)\" in \"([^\"]*)\" dropdown$")
	public void i_select_option_as_in_dropdown(String text1, String text2) throws Throwable {
		investmentProfilePage.select_VALUES_FROM_DROPDOWN(text1, text2);
	}

	@Then("I should see Investment Profile page")
	public void i_should_see_Investment_Profile_page() {
		Assert.assertTrue(investmentProfilePage.isAtThisPage());
	}

	@When("I click on Next button Investment Profile page")
	public void i_click_on_Next_button_Investment_Profile_page() {
		investmentProfilePage.click_NEXT_BUTTON();
	}

}
