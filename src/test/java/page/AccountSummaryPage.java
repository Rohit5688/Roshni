package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.AccountSummaryPageElements;
import pageelements.LoginPageElements;
import utils.CUtil;
import utils.SharedDriver;

public class AccountSummaryPage {
	private static WebDriver webDriver;
	private AccountSummaryPageElements accountSummaryPageElements;
	static boolean login = false;

	public AccountSummaryPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		accountSummaryPageElements = new AccountSummaryPageElements();
	}

	public boolean isAtThisPage() {
		CUtil.waitForElement(By.xpath(accountSummaryPageElements.PAGE_TITLE));
		return CUtil.isDisplayed(By.xpath(accountSummaryPageElements.PAGE_TITLE));
	}

	public void click_ON_MENU_BUTTON() {
		CUtil.click(By.xpath(accountSummaryPageElements.MENU_BUTTON_XPATH));
	}

	public boolean is_MENU_OPTION_DISPLAYED(String text) {
		switch (text) {
		case "Start New Account":
			return CUtil.isDisplayed(By.xpath(accountSummaryPageElements.START_NEW_ACCOUNT_XPATH));
		default:
			break;
		}
		return false;
	}

	public void click_MENU_OPTIONS(String text) {
		switch (text) {
		case "Start New Account":
			CUtil.click(By.xpath(accountSummaryPageElements.START_NEW_ACCOUNT_XPATH));
			break;
		default:
			break;
		}

	}

}
