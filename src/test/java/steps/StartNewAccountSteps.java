package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.StartNewAccountPage;
import runner.SharedDriver;

public class StartNewAccountSteps {
	private StartNewAccountPage startNewAccountPage;
	private WebDriver webDriver;

	public StartNewAccountSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		startNewAccountPage = new StartNewAccountPage(webDriver);
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String text) throws Throwable {
		Assert.assertTrue(startNewAccountPage.is_QUESTION_NUMBER_DISPLAYED(text));
	}

	@Then("^I should see question as \"([^\"]*)\"$")
	public void i_should_see_question_as(String text) throws Throwable {
		Assert.assertTrue(startNewAccountPage.is_QUESTION_TEXT_DISPLAYED(text));
	}

	@When("^I select answer option as \"([^\"]*)\"$")
	public void i_select_answer_option_as(String text) throws Throwable {
		startNewAccountPage.select_ANSWER(text);
	}

	@When("^I click on Next button$")
	public void i_click_on_Next_button() throws Throwable {
		startNewAccountPage.click_NEXT_BUTTON();
	}

	@Then("^I click Submit button$")
	public void i_click_Submit_button() throws Throwable {
		startNewAccountPage.click_SUBMIT_BUTTON();
	}

}
