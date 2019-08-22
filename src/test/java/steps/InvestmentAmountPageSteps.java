package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.InvestmentAmountPage;
import runner.SharedDriver;

public class InvestmentAmountPageSteps {
	private InvestmentAmountPage investmentAmountPage;
	private WebDriver webDriver;

	public InvestmentAmountPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		investmentAmountPage = new InvestmentAmountPage(webDriver);
	}

	@Then("I should see Investment Amount page")
	public void i_should_see_Investment_Amount_page() {
		Assert.assertTrue(investmentAmountPage.isAtThisPage());
	}

	@When("I type Investment Amount as {string}")
	public void i_type_Investment_Amount_as(String text) {
		investmentAmountPage.type_INVESTMENT_AMOUNT(text);
	}

	@When("I click on Next button Investment Amount page")
	public void i_click_on_Next_button_Investment_Amount_page() {
		investmentAmountPage.click_NEXT_BUTTON();
	}
	
	@When("I select option as {string} in {string} dropdown on Investment Amount page")
	public void i_select_option_as_in_dropdown_on_Investment_Amount_page(String text1, String text2) {
		investmentAmountPage.select_VALUES_FROM_DROPDOWN(text1, text2);
	}

}
