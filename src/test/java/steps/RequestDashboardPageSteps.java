package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.RequestDashboardPage;
import runner.SharedDriver;

public class RequestDashboardPageSteps {
	private RequestDashboardPage requestDashboardPage;
	private WebDriver webDriver;

	public RequestDashboardPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		requestDashboardPage = new RequestDashboardPage(webDriver);
	}

	@Then("I should be at Request Dashboard page")
	public void i_should_be_at_Request_Dashboard_page() {
		Assert.assertTrue(requestDashboardPage.isAtThisPage());
	}

	@When("I click on Refresh button")
	public void i_click_on_Refresh_button() {
		requestDashboardPage.click_REFERSH_BUTTON();
	}
	
	@When("I click on Account with Name as {string}")
	public void i_click_on_Account_with_Name_as(String text) {
		requestDashboardPage.Click_ON_LAST_CREATED_PROJECT(text);
	}

	@Then("I should see Account number as recorded text")
	public void i_should_see_Account_number_as_recorded_text() {
	    //todo
	}

}
