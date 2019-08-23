package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LinkBankAccountPage;
import runner.SharedDriver;

public class LinkBankAccountPageSteps {
	private LinkBankAccountPage linkBankAccountPage;
	private WebDriver webDriver;

	public LinkBankAccountPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		linkBankAccountPage = new LinkBankAccountPage(webDriver);
	}
	
	@Then("I should see Link Bank Account page")
	public void i_should_see_Link_Bank_Account_page() {
		Assert.assertTrue(linkBankAccountPage.isAtThisPage());
	}

	@When("I click Link Account With Plaid button")
	public void i_click_Link_Account_With_Plaid_button() {
	    linkBankAccountPage.click_LINK_ACCOUNT_WITH_PLAID_BUTTON();
	}

	@Then("I should see link your bank pop up")
	public void i_should_see_link_your_bank_pop_up() {
		Assert.assertTrue(linkBankAccountPage.is_LINK_YOUR_BANK_POP_UP_DISPLAYED());
	}

	@When("I click on Continue button link your bank pop up")
	public void i_click_on_Continue_button_link_your_bank_pop_up() {
		linkBankAccountPage.click_CONTINUE_BUTTON();
	}

	@Then("I should see Select your bank option")
	public void i_should_see_Select_your_bank_option() {
		Assert.assertTrue(linkBankAccountPage.is_SELECT_YOUR_BANK_DISPLAYED());
	}

	@When("I type Bank Name as {string}")
	public void i_type_Bank_Name_as(String text) {
	   linkBankAccountPage.type_BANK_NAME(text);
	}

	@When("I click on {string} option from Select your bank")
	public void i_click_on_option_from_Select_your_bank(String text) {
	    linkBankAccountPage.click_BANK_NAME_OPTION(text);
	}

	@Then("I should see Enter Your Credentials for {string}")
	public void i_should_see_Enter_Your_Credentials_for(String text) {
		Assert.assertTrue(linkBankAccountPage.is_ENTER_YOUR_CREDENTIALS_DISPLAYED(text));
	}

	@When("I type User Name for bank as {string}")
	public void i_type_User_Name_for_bank_as(String username) {
		if (username.equalsIgnoreCase("default")) {
			String env = System.getProperty("environment");
			if (env == null) {
				env = "qa";
			}
			switch (env) {
			case "QA":
			case "qa":
				username = System.getProperty("bank.qa.user");
				break;
			}
		}
		if (username == null) {
			username = "username";
		}
		linkBankAccountPage.type_USERNAME(username);
	}

	@When("I type Password for bank as {string}")
	public void i_type_Password_for_bank_as(String password) {
		if (password.equalsIgnoreCase("default")) {
			String env = System.getProperty("environment");
			if (env == null) {
				env = "qa";
			}
			switch (env) {
			case "QA":
			case "qa":
				password = System.getProperty("bank.qa.password");
				break;
			}
		}
		if (password == null) {
			password = "password";
		}
		linkBankAccountPage.type_PASSWORD(password);
	}

	@When("I click on Submit button")
	public void i_click_on_Submit_button() {
	    linkBankAccountPage.click_SUBMIT_BUTTON();
	}
	
	@Then("I should see Select your account for specific bank")
	public void i_should_see_Select_your_account_for_specific_bank() {
		Assert.assertTrue(linkBankAccountPage.is_SELECT_YOUR_BANK_ACCOUNT_DISPLAYED());
	}

	@When("I click on Plaid Checking")
	public void i_click_on_Plaid_Checking() {
	    linkBankAccountPage.click_PLAID_CHECKING();
	}

	@When("I click on Continue button for specific bank")
	public void i_click_on_Continue_button_for_specific_bank() {
	    linkBankAccountPage.click_CONTINUE_BUTTON();
	}
	
	@When("I click Link Account With Micro Deposits")
	public void i_click_Link_Account_With_Micro_Deposits() {
		linkBankAccountPage.click_LINK_ACCOUNT_WITH_MICRO_DEPOSITES_BUTTON();
	}

	@Then("I should see Link Bank Account with Micro Deposits")
	public void i_should_see_Link_Bank_Account_with_Micro_Deposits() {
		Assert.assertTrue(linkBankAccountPage.is_LINK_BANK_ACCOUNT_WITH_MICRO_DEPOSITS_LABLE_DISPLAYED());
	}

	@When("I type Bank Account Number as {string}")
	public void i_type_Bank_Account_Number_as(String text) {
	   linkBankAccountPage.type_BANK_ACCOUNT_NUMBER(text);
	}

	@When("I type Bank Routing Number as {string}")
	public void i_type_Bank_Routing_Number_as(String text) {
		linkBankAccountPage.type_BANK_ROUTING_NUMBER(text);
	}

	@When("I type Bank Account Owner Name as {string}")
	public void i_type_Bank_Account_Owner_Name_as(String text) {
		linkBankAccountPage.type_BANK_ACCOUNT_OWNER_NAME(text);
	}

	@When("I type Bank Account Nickname as {string}")
	public void i_type_Bank_Account_Nickname_as(String text) {
		linkBankAccountPage.type_BANK_ACCOUNT_NICK_NAME(text);
	}

	@When("I select option as {string} in {string} dropdown on Link Bank Account with Micro Deposits page")
	public void i_select_option_as_in_dropdown_on_Link_Bank_Account_with_Micro_Deposits_page(String text1, String text2) {
		linkBankAccountPage.select_VALUES_FROM_DROPDOWN(text1, text2);
	}

	@When("I click on Next button Link Bank Account with Micro Deposits page")
	public void i_click_on_Next_button_Link_Bank_Account_with_Micro_Deposits_page() {
		linkBankAccountPage.click_NEXT_BUTTON();
	}

}
