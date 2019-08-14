package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.TermsAndConditionPage;
import runner.SharedDriver;

public class TermsAndConditionSteps {
	private TermsAndConditionPage termsAndConditionPage;
	private WebDriver webDriver;

	public TermsAndConditionSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		termsAndConditionPage = new TermsAndConditionPage(webDriver);
	}

	@Then("^I should be on Terms and Condition Page$")
	public void i_should_be_on_Terms_and_Condition_Page() throws Throwable {
		Assert.assertTrue(termsAndConditionPage.isAtThisPage());
	}

	@When("^I select Accpetance checkbox$")
	public void i_select_Accpetance_checkbox() throws Throwable {
		termsAndConditionPage.click_ACCEPTANCE_CHECK_BOX();
	}

	@When("^I click on Next button Terms and Condition Page$")
	public void i_click_on_Next_button_Terms_and_Condition_Page() throws Throwable {
		termsAndConditionPage.click_NEXT_BUTTON_TERMS_CONDITION_PAGE();
	}

}
