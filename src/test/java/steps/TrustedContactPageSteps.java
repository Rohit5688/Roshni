package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.TrustedContactPage;
import runner.SharedDriver;

public class TrustedContactPageSteps {
	private TrustedContactPage trustedContactPage;
	private WebDriver webDriver;

	public TrustedContactPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		trustedContactPage = new TrustedContactPage(webDriver);
	}

	@Then("I should see Trusted Contact page")
	public void i_should_see_Trusted_Contact_page() {
		Assert.assertTrue(trustedContactPage.isAtThisPage());
	}

	@Then("I should see Include trusted contact checkbox")
	public void i_should_see_Include_trusted_contact_checkbox() {
		Assert.assertTrue(trustedContactPage.is_INCLUDE_TRUSTED_CONTACT_CHECKBOX_PRESENT());
	}

	@When("I click on Next button Trusted Contact page")
	public void i_click_on_Next_button_Trusted_Contact_page() {
		trustedContactPage.click_NEXT_BUTTON();
	}

}
