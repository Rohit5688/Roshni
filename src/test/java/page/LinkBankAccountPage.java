package page;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.LinkBankAccountPageElements;
import utils.CUtil;

public class LinkBankAccountPage {
	private static WebDriver webDriver;
	private LinkBankAccountPageElements linkBankAccountPageElements;

	public LinkBankAccountPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		linkBankAccountPageElements = new LinkBankAccountPageElements();
	}

	public boolean isAtThisPage() {
		return CUtil.isDisplayed(By.xpath(linkBankAccountPageElements.PAGE_TITLE));
	}

	public void click_LINK_ACCOUNT_WITH_PLAID_BUTTON() {
		CUtil.click(By.xpath(linkBankAccountPageElements.LINK_ACCOUNT_WITH_PLAID_BUTTON_XPATH));
	}

	public boolean is_LINK_YOUR_BANK_POP_UP_DISPLAYED() {
		boolean result = false;
		CUtil.switchFrame("plaid-link-iframe-1");
		CUtil.waitForElement(By.xpath(linkBankAccountPageElements.CONTINUE_BUTTON_XPATH));
		result = CUtil.isDisplayed(By.xpath(linkBankAccountPageElements.LINK_YOUR_BANK_POP_UP_XPATH));
		CUtil.switchToTopFrame();
		return result;
	}

	public void click_CONTINUE_BUTTON() {
		CUtil.switchFrame("plaid-link-iframe-1");
		CUtil.click(By.xpath(linkBankAccountPageElements.CONTINUE_BUTTON_XPATH));
		CUtil.switchToTopFrame();
	}

	public boolean is_SELECT_YOUR_BANK_DISPLAYED() {
		boolean result = false;
		CUtil.switchFrame("plaid-link-iframe-1");
		result = CUtil.isDisplayed(By.xpath(linkBankAccountPageElements.SELECT_YOUR_BANK_LABEL_XPATH));
		CUtil.switchToTopFrame();
		return result;
	}

	public void type_BANK_NAME(String text) {
		CUtil.switchFrame("plaid-link-iframe-1");
		CUtil.type(By.xpath(linkBankAccountPageElements.BANK_NAME_TEXT_BOX_XPATH), text);
		CUtil.switchToTopFrame();
	}

	public void click_BANK_NAME_OPTION(String text) {
		CUtil.switchFrame("plaid-link-iframe-1");
		String locator = "//span[text()='" + text + "']";
		CUtil.click(By.xpath(locator));
		CUtil.switchToTopFrame();
	}

	public void type_USERNAME(String username) {
		CUtil.switchFrame("plaid-link-iframe-1");
		CUtil.type(By.xpath(linkBankAccountPageElements.USERNAME_TEXT_BOX_XPATH), username);
		CUtil.switchToTopFrame();
	}

	public boolean is_ENTER_YOUR_CREDENTIALS_DISPLAYED(String text) {
		boolean result = false;
		CUtil.switchFrame("plaid-link-iframe-1");
		result = CUtil.isDisplayed(By.xpath(linkBankAccountPageElements.ENTER_YOUR_CREDENTIALS_LABEL_XPATH));
		CUtil.switchToTopFrame();
		return result;
	}

	public void type_PASSWORD(String password) {
		CUtil.switchFrame("plaid-link-iframe-1");
		CUtil.type(By.xpath(linkBankAccountPageElements.PASSWORD_TEXT_BOX_XPATH), password);
		CUtil.switchToTopFrame();
	}

	public void click_SUBMIT_BUTTON() {
		CUtil.switchFrame("plaid-link-iframe-1");
		CUtil.click(By.xpath(linkBankAccountPageElements.SUBMIT_BUTTON_XPATH));
		CUtil.switchToTopFrame();
	}

	public boolean is_SELECT_YOUR_BANK_ACCOUNT_DISPLAYED() {
		boolean result = false;
		CUtil.switchFrame("plaid-link-iframe-1");
		CUtil.waitForElement(By.xpath(linkBankAccountPageElements.SELECT_YOUR_BANK_ACCOUNT_LABEL_XPATH));
		result = CUtil.isDisplayed(By.xpath(linkBankAccountPageElements.SELECT_YOUR_BANK_ACCOUNT_LABEL_XPATH));
		CUtil.switchToTopFrame();
		return result;
	}

	public void click_PLAID_CHECKING() {
		CUtil.switchFrame("plaid-link-iframe-1");
		CUtil.click(By.xpath(linkBankAccountPageElements.PLAID_CHECKING_XPATH));
		CUtil.switchToTopFrame();
	}

	public void click_LINK_ACCOUNT_WITH_MICRO_DEPOSITES_BUTTON() {
		CUtil.click(By.xpath(linkBankAccountPageElements.LINK_ACCOUNT_WITH_MICRO_DEPOSITES_BUTTON_XPATH));
	}

	public boolean is_LINK_BANK_ACCOUNT_WITH_MICRO_DEPOSITS_LABLE_DISPLAYED() {
		return CUtil.isDisplayed(By.xpath(linkBankAccountPageElements.LINK_BANK_ACCOUNT_WITH_MICRO_DEPOSITS_LABLE));
	}

	public void type_BANK_ACCOUNT_NUMBER(String text) {
		CUtil.type(By.xpath(linkBankAccountPageElements.BANK_ACCOUNT_NUMBER), text);
	}

	public void type_BANK_ROUTING_NUMBER(String text) {
		CUtil.type(By.xpath(linkBankAccountPageElements.BANK_ROUTING_NUMBER), text);
	}

	public void type_BANK_ACCOUNT_OWNER_NAME(String text) {
		CUtil.type(By.xpath(linkBankAccountPageElements.BANK_ACCOUNT_OWNER_NAME), text);
	}

	public void type_BANK_ACCOUNT_NICK_NAME(String text) {
		CUtil.type(By.xpath(linkBankAccountPageElements.BANK_ACCOUNT_NICK_NAME), text);
	}

	public void select_VALUES_FROM_DROPDOWN(String option, String dropdown) {
		By locator;
		switch (dropdown) {
		case "Bank Account Type":
			locator = By.xpath(linkBankAccountPageElements.BANK_ACCOUNT_TYPE_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		default:
			break;
		}
		
	}

	public void click_NEXT_BUTTON() {
		CUtil.click(By.xpath(linkBankAccountPageElements.NEXT_BUTTON_XPATH));
	}

}
