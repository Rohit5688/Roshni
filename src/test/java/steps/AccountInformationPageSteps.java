package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AccountInformationPage;
import runner.SharedDriver;

public class AccountInformationPageSteps {

	private AccountInformationPage accountInformationPage;
	private WebDriver webDriver;

	public AccountInformationPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		accountInformationPage = new AccountInformationPage(webDriver);
	}

	@Then("I should see Account Information page")
	public void i_should_see_Account_Information_page() {
		Assert.assertTrue(accountInformationPage.isAtThisPage());
	}

	@When("I type First Name as {string}")
	public void i_type_First_Name_as(String text) {
		accountInformationPage.type_FIRST_NAME(text);
	}

	@When("I type Last Name as {string}")
	public void i_type_Last_Name_as(String text) {
		accountInformationPage.type_LAST_NAME(text);
	}

	@When("I type Date Of Birth as {string}")
	public void i_type_Date_Of_Birth_as(String text) {
		accountInformationPage.type_DATE_OF_BIRTH(text);
	}

	@When("I type Social Security Number as {string}")
	public void i_type_Social_Security_Number_as(String text) {
		accountInformationPage.type_SOCIAL_SECURITY_NUMBER(text);
	}

	@When("I click on Enter Address Manually button")
	public void i_click_on_Enter_Address_Manually_button() {
		accountInformationPage.click_ENTER_ADDRESS_MANUALLY_BUTTON();
	}

	@When("I type Street Address as {string}")
	public void i_type_Street_Address_as(String text) {
		accountInformationPage.type_STREET_ADDRESS(text);
	}

	@When("I type City as {string}")
	public void i_type_City_as(String text) {
		accountInformationPage.type_CITY(text);
	}

	@When("I type State as {string}")
	public void i_type_State_as(String text) {
		accountInformationPage.type_STATE(text);
	}

	@When("I type Postal Code as {string}")
	public void i_type_Postal_Code_as(String text) {
		accountInformationPage.type_POSTAL_CODE(text);
	}

	@When("I type Phone Number as {string}")
	public void i_type_Phone_Number_as(String text) {
		accountInformationPage.type_PHONE_NUMBER(text);
	}

	@When("I click on Add Beneficiary button")
	public void i_click_on_Add_Beneficiary_button() {
		accountInformationPage.click_ADD_BENEFICIARY_BUTTON();
	}

	@Then("I should see Beneficiaries section")
	public void i_should_see_Beneficiaries_section() {
		Assert.assertTrue(accountInformationPage.isAtBeneficiariesSection());
	}

	@When("I type Relationship as {string}")
	public void i_type_Relationship_as(String text) {
		accountInformationPage.type_RELATIONSHIP(text);
	}

	@When("I type Share Percent - All beneficiaries must total {int}% as {string}")
	public void i_type_Share_Percent_All_beneficiaries_must_total_as(int num, String text) {
		accountInformationPage.type_SHARE_PERCENTAGE(text);
	}

	@When("I type First Name as {string} in Beneficiaries section")
	public void i_type_First_Name_as_in_Beneficiaries_section(String text) {
		accountInformationPage.type_FIRST_NAME_BENEFICIARIES_SECTION(text);
	}

	@When("I type Last Name as {string} in Beneficiaries section")
	public void i_type_Last_Name_as_in_Beneficiaries_section(String text) {
		accountInformationPage.type_LAST_NAME_BENEFICIARIES_SECTION(text);
	}

	@When("I type Date Of Birth as {string} in Beneficiaries section")
	public void i_type_Date_Of_Birth_as_in_Beneficiaries_section(String text) {
		accountInformationPage.type_DATE_OF_BIRTH_BENEFICIARIES_SECTION(text);
	}

	@When("I type Social Security Number as {string} in Beneficiaries section")
	public void i_type_Social_Security_Number_as_in_Beneficiaries_section(String text) {
		accountInformationPage.type_SOCIAL_SECURITY_NUMBER_BENEFICIARIES_SECTION(text);
	}

	@When("I select option as {string} in {string} dropdown on Account Information page")
	public void i_select_option_as_in_dropdown_on_Account_Information_page(String text1, String text2) {
		accountInformationPage.select_VALUES_FROM_DROPDOWN(text1, text2);
	}

	@When("I click on Enter Address Manually button in Beneficiaries section")
	public void i_click_on_Enter_Address_Manually_button_in_Beneficiaries_section() {
		accountInformationPage.click_ENTER_ADDRESS_MANUALLY_BUTTON_BENEFICIARIES_SECTION();
	}

	@When("I type Street Address as {string} in Beneficiaries section")
	public void i_type_Street_Address_as_in_Beneficiaries_section(String text) {
		accountInformationPage.type_STREET_ADDRESS_BENEFICIARIES_SECTION(text);
	}

	@When("I type City as {string} in Beneficiaries section")
	public void i_type_City_as_in_Beneficiaries_section(String text) {
		accountInformationPage.type_CITY_BENEFICIARIES_SECTION(text);
	}

	@When("I type State as {string} in Beneficiaries section")
	public void i_type_State_as_in_Beneficiaries_section(String text) {
		accountInformationPage.type_STATE_BENEFICIARIES_SECTION(text);
	}

	@When("I type Postal Code as {string} in Beneficiaries section")
	public void i_type_Postal_Code_as_in_Beneficiaries_section(String text) {
		accountInformationPage.type_POSTAL_CODE_BENEFICIARIES_SECTION(text);
	}

	@When("I click on Next button Account Information page")
	public void i_click_on_Next_button_Account_Information_page() {
		accountInformationPage.click_NEXT_BUTTON();
	}
	
	@Then("I should see Primary account section")
	public void i_should_see_Primary_account_section() {
		Assert.assertTrue(accountInformationPage.isAtPrimaryAccountSection());
	}

	@When("I type First Name as {string} for Primary Applicant")
	public void i_type_First_Name_as_for_Primary_Applicant(String text) {
	    accountInformationPage.type_FIRST_NAME(text);
	}

	@When("I type Last Name as {string} for Primary Applicant")
	public void i_type_Last_Name_as_for_Primary_Applicant(String text) {
	    accountInformationPage.type_LAST_NAME(text);
	}

	@When("I type Date Of Birth as {string} for Primary Applicant")
	public void i_type_Date_Of_Birth_as_for_Primary_Applicant(String text) {
		 accountInformationPage.type_DATE_OF_BIRTH(text);
	}

	@When("I type Social Security Number as {string} for Primary Applicant")
	public void i_type_Social_Security_Number_as_for_Primary_Applicant(String text) {
		accountInformationPage.type_SOCIAL_SECURITY_NUMBER(text);
	}

	@When("I click on Enter Address Manually button for Primary Applicant")
	public void i_click_on_Enter_Address_Manually_button_for_Primary_Applicant() {
		accountInformationPage.click_ENTER_ADDRESS_MANUALLY_BUTTON();
	}

	@When("I type Street Address as {string} for Primary Applicant")
	public void i_type_Street_Address_as_for_Primary_Applicant(String text) {
		accountInformationPage.type_STREET_ADDRESS(text);
	}

	@When("I type City as {string} for Primary Applicant")
	public void i_type_City_as_for_Primary_Applicant(String text) {
		accountInformationPage.type_CITY(text);
	}

	@When("I type State as {string} for Primary Applicant")
	public void i_type_State_as_for_Primary_Applicant(String text) {
		accountInformationPage.type_STATE(text);
	}

	@When("I type Postal Code as {string} for Primary Applicant")
	public void i_type_Postal_Code_as_for_Primary_Applicant(String text) {
		accountInformationPage.type_POSTAL_CODE(text);
	}

	@When("I type Phone Number as {string} for Primary Applicant")
	public void i_type_Phone_Number_as_for_Primary_Applicant(String text) {
		accountInformationPage.type_PHONE_NUMBER(text);
	}

	@When("I select option as {string} in {string} dropdown on Account Information page for Primary Applicant")
	public void i_select_option_as_in_dropdown_on_Account_Information_page_for_Primary_Applicant(String text1, String text2) {
		accountInformationPage.select_VALUES_FROM_DROPDOWN(text1, text2);
	}

	@Then("I should see Joint Applicant section")
	public void i_should_see_Joint_Applicant_section() {
		Assert.assertTrue(accountInformationPage.isAtJointAccountSection());
	}

	@When("I type First Name as {string} for Joint Applicant")
	public void i_type_First_Name_as_for_Joint_Applicant(String text) {
		accountInformationPage.type_FIRST_NAME(text);
	}

	@When("I type Last Name as {string} for Joint Applicant")
	public void i_type_Last_Name_as_for_Joint_Applicant(String text) {
		accountInformationPage.type_LAST_NAME(text);
	}

	@When("I type Date Of Birth as {string} for Joint Applicant")
	public void i_type_Date_Of_Birth_as_for_Joint_Applicant(String text) {
		accountInformationPage.type_DATE_OF_BIRTH(text);
	}

	@When("I type Social Security Number as {string} for Joint Applicant")
	public void i_type_Social_Security_Number_as_for_Joint_Applicant(String text) {
		accountInformationPage.type_SOCIAL_SECURITY_NUMBER(text);
	}

	@When("I click on Enter Address Manually button for Joint Applicant")
	public void i_click_on_Enter_Address_Manually_button_for_Joint_Applicant() {
		accountInformationPage.click_ENTER_ADDRESS_MANUALLY_BUTTON();
	}

	@When("I type Street Address as {string} for Joint Applicant")
	public void i_type_Street_Address_as_for_Joint_Applicant(String text) {
		accountInformationPage.type_STREET_ADDRESS(text);
	}

	@When("I type City as {string} for Joint Applicant")
	public void i_type_City_as_for_Joint_Applicant(String text) {
		accountInformationPage.type_CITY(text);
	}

	@When("I type State as {string} for Joint Applicant")
	public void i_type_State_as_for_Joint_Applicant(String text) {
		accountInformationPage.type_STATE(text);
	}

	@When("I type Postal Code as {string} for Joint Applicant")
	public void i_type_Postal_Code_as_for_Joint_Applicant(String text) {
		accountInformationPage.type_POSTAL_CODE(text);
	}

	@When("I type Phone Number as {string} for Joint Applicant")
	public void i_type_Phone_Number_as_for_Joint_Applicant(String text) {
		accountInformationPage.type_PHONE_NUMBER(text);
	}

	@When("I select option as {string} in {string} dropdown on Account Information page for Joint Applicant")
	public void i_select_option_as_in_dropdown_on_Account_Information_page_for_Joint_Applicant(String text1, String text2) {
		accountInformationPage.select_VALUES_FROM_DROPDOWN(text1, text2);
	}


}
