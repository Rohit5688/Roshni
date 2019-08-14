package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AccountSummaryPage;
import page.LoginPage;
import runner.SharedDriver;

public class AccountSummarySteps {
	private AccountSummaryPage accountSummaryPage;
	private WebDriver webDriver;

	public AccountSummarySteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		accountSummaryPage = new AccountSummaryPage(webDriver);
	}

	@Then("^I should be at Account Summary Page$")
	public void i_should_be_at_Account_Summary_Page() throws Throwable {
		Assert.assertTrue(accountSummaryPage.isAtThisPage());
	}

	@When("^I click on Menu$")
	public void i_click_on_Menu() throws Throwable {
		accountSummaryPage.click_ON_MENU_BUTTON();
	}

	@Then("^I should see \"([^\"]*)\" option$")
	public void i_should_see_option(String text) throws Throwable {
		Assert.assertTrue(accountSummaryPage.is_MENU_OPTION_DISPLAYED(text));
	}

	@When("^I click on \"([^\"]*)\" option$")
	public void i_click_on_option(String text) throws Throwable {
		accountSummaryPage.click_MENU_OPTIONS(text);
	}
}
