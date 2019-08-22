package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.AccountInformationPageElements;
import utils.CUtil;

public class AccountInformationPage {
	private static WebDriver webDriver;
	private AccountInformationPageElements accountInformationPageElements;

	public AccountInformationPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		accountInformationPageElements = new AccountInformationPageElements();
	}

	public boolean isAtThisPage() {
		return CUtil.isDisplayed(By.xpath(accountInformationPageElements.PAGE_TITLE));
	}

	public boolean isAtBeneficiariesSection() {
		return CUtil.isDisplayed(By.xpath(accountInformationPageElements.BENEFICIARIES_SECTION_TITLE));
	}
	
	public boolean isAtPrimaryAccountSection() {
		return CUtil.isDisplayed(By.xpath(accountInformationPageElements.PRIMARY_ACCOUNT_SECTION_TITLE));
	}
	
	public boolean isAtJointAccountSection() {
		return CUtil.isDisplayed(By.xpath(accountInformationPageElements.JOINT_ACCOUNT_SECTION_TITLE));
	}

	public void type_FIRST_NAME(String text) {
		CUtil.type(By.xpath(accountInformationPageElements.FIRST_NAME_ACCOUNT_INFORMATION_XPATH), text);
	}

	public void type_LAST_NAME(String text) {
		CUtil.type(By.xpath(accountInformationPageElements.LAST_NAME_ACCOUNT_INFORMATION_XPATH), text);
	}

	public void type_DATE_OF_BIRTH(String text) {
		CUtil.type(By.xpath(accountInformationPageElements.DATE_OF_BIRTH_ACCOUNT_INFORMATION_XPATH), text);
	}

	public void type_SOCIAL_SECURITY_NUMBER(String text) {
		CUtil.type(By.xpath(accountInformationPageElements.SOCIAL_SECURITY_NUMBER_ACCOUNT_INFORMATION_XPATH), text);
	}

	public void click_ENTER_ADDRESS_MANUALLY_BUTTON() {
		CUtil.click(By.xpath(accountInformationPageElements.ENTER_ADDRESS_MANUALLY_ACCOUNT_INFORMATION_XPATH));
	}


	public void type_STREET_ADDRESS(String text) {
		CUtil.type(By.xpath(accountInformationPageElements.STREET_ADDRESS_ACCOUNT_INFORMATION_XPATH), text);
	}


	public void type_CITY(String text) {
		CUtil.type(By.xpath(accountInformationPageElements.CITY_ACCOUNT_INFORMATION_XPATH), text);
	}


	public void type_STATE(String text) {
		CUtil.type(By.xpath(accountInformationPageElements.STATE_ACCOUNT_INFORMATION_XPATH), text);
	}


	public void type_POSTAL_CODE(String text) {
		CUtil.type(By.xpath(accountInformationPageElements.POSTAL_CODE_ACCOUNT_INFORMATION_XPATH), text);
	}


	public void type_PHONE_NUMBER(String text) {
		CUtil.type(By.xpath(accountInformationPageElements.PHONE_NUMBER_ACCOUNT_INFORMATION_XPATH), text);
	}


	public void click_ADD_BENEFICIARY_BUTTON() {
		CUtil.click(By.xpath(accountInformationPageElements.ADD_BENEFICIARY_BUTTON_ACCOUNT_INFORMATION_XPATH));
		CUtil.count++;
	}

	public void type_RELATIONSHIP(String text) {
		String locator = "//input[@name='beneficiaries[" + (CUtil.count - 1) + "].relationship']";
		CUtil.type(By.xpath(locator), text);
	}

	public void type_SHARE_PERCENTAGE(String text) {
		String locator = "//input[@name='beneficiaries[" + (CUtil.count - 1) + "].sharePercent']";
		CUtil.type(By.xpath(locator), text);
	}

	public void type_FIRST_NAME_BENEFICIARIES_SECTION(String text) {
		String locator = "//input[@name='beneficiaries[" + (CUtil.count - 1) + "].givenName']";
		CUtil.type(By.xpath(locator), text);
	}

	public void type_LAST_NAME_BENEFICIARIES_SECTION(String text) {
		String locator = "//input[@name='beneficiaries[" + (CUtil.count - 1) + "].familyName']";
		CUtil.type(By.xpath(locator), text);
	}

	public void type_DATE_OF_BIRTH_BENEFICIARIES_SECTION(String text) {
		String locator = "//input[@name='beneficiaries[" + (CUtil.count - 1) + "].dateOfBirth']";
		CUtil.type(By.xpath(locator), text);
	}

	public void type_SOCIAL_SECURITY_NUMBER_BENEFICIARIES_SECTION(String text) {
		String locator = "//input[@name='beneficiaries[" + (CUtil.count - 1) + "].socialSecurityNumber']";
		CUtil.type(By.xpath(locator), text);
	}

	public void select_VALUES_FROM_DROPDOWN(String option, String dropdown) {
		By locator;
		switch (dropdown) {
		case "Phone Number Type":
			locator = By.xpath(accountInformationPageElements.PHONE_NUMBER_TYPE_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		case "Employment Status":
			locator = By.xpath(accountInformationPageElements.EMPLOYMENT_STATUS_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		case "Beneficiary Type":
			locator = By.xpath("//select[@name='beneficiaries[" + (CUtil.count - 1) + "].beneficiaryType']");
			CUtil.selectDropdown(locator, option);
			break;
		default:
			break;
		}

	}

	public void click_ENTER_ADDRESS_MANUALLY_BUTTON_BENEFICIARIES_SECTION() {
		CUtil.click(
				By.xpath(accountInformationPageElements.ENTER_ADDRESS_MANUALLY_ACCOUNT_INFORMATION_BENEFICIARY_XPATH));
	}

	public void type_STREET_ADDRESS_BENEFICIARIES_SECTION(String text) {
		String locator = "//input[@name='beneficiaries[" + (CUtil.count - 1) + "].streetAddress']";
		CUtil.type(By.xpath(locator), text);
	}

	public void type_CITY_BENEFICIARIES_SECTION(String text) {
		String locator = "//input[@name='beneficiaries[" + (CUtil.count - 1) + "].city']";
		CUtil.type(By.xpath(locator), text);
	}

	public void type_STATE_BENEFICIARIES_SECTION(String text) {
		String locator = "//input[@name='beneficiaries[" + (CUtil.count - 1) + "].state']";
		CUtil.type(By.xpath(locator), text);
	}

	public void type_POSTAL_CODE_BENEFICIARIES_SECTION(String text) {
		String locator = "//input[@name='beneficiaries[" + (CUtil.count - 1) + "].postalCode']";
		CUtil.type(By.xpath(locator), text);
	}

	public void click_NEXT_BUTTON() {
		CUtil.click(By.xpath(accountInformationPageElements.NEXT_BUTTON_ACCOUNT_INFORMATION));
	}





}
