package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.OpenYourAccountPageElements;
import utils.CUtil;

public class OpenYourAccountPage {

	private static WebDriver webDriver;
	private OpenYourAccountPageElements openYourAccountPageElements;

	public OpenYourAccountPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		openYourAccountPageElements = new OpenYourAccountPageElements();
	}

	public boolean isAtThisPage() {
		return CUtil.isDisplayed(By.xpath(openYourAccountPageElements.PAGE_TITLE));
	}

	public void click_NEXT_BUTTON_OPEN_ACCOUNT_PAGE() {
		CUtil.click(By.xpath(openYourAccountPageElements.NEXT_BUTTON_OPEN_ACCOUNT_PAGE_XPATH));

	}

	public void select_ACCOUNT_TYPE(String text) {
		switch (text) {
		case "Individual":
			CUtil.click(By.xpath(openYourAccountPageElements.INDIVIDUAL_ACCOUNT_XPATH));
			break;
		case "Joint":
			CUtil.click(By.xpath(openYourAccountPageElements.JOINT_ACCOUNT_XPATH));
			break;
		case "Retirement":
			CUtil.click(By.xpath(openYourAccountPageElements.RETIREMENT_ACCOUNT_XPATH));
			break;

		default:
			break;
		}

	}

}
