package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SignaturesPage;
import runner.SharedDriver;

public class SignaturesPageSteps {
	private SignaturesPage signaturesPage;
	private WebDriver webDriver;

	public SignaturesPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		signaturesPage = new SignaturesPage(webDriver);
	}

	@Then("I should see Signatures page")
	public void i_should_see_Signatures_page() {
		Assert.assertTrue(signaturesPage.isAtThisPage());
	}

	@When("I select Applicant Signature checkbox")
	public void i_select_Applicant_Signature_checkbox() {
		signaturesPage.click_SIGNATURE_CHECK_BOX();
	}

	@When("I select option as {string} in {string} dropdown on Signatures page")
	public void i_select_option_as_in_dropdown_on_Signatures_page(String text1, String text2) {
		signaturesPage.select_VALUES_FROM_DROPDOWN(text1, text2);
	}

	@When("I click on Next button Signatures page")
	public void i_click_on_Next_button_Signatures_page() {
		signaturesPage.click_NEXT_BUTTON();
	}
}
