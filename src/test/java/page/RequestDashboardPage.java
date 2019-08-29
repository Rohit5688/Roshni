package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.RequestDashboardPageElements;
import utils.CUtil;

public class RequestDashboardPage {

	private static WebDriver webDriver;
	private RequestDashboardPageElements requestDashboardPageElements;
	static boolean login = false;

	public RequestDashboardPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		requestDashboardPageElements = new RequestDashboardPageElements();
	}

	public boolean isAtThisPage() {
		CUtil.waitForElement(By.xpath(requestDashboardPageElements.PAGE_TITLE));
		return CUtil.isDisplayed(By.xpath(requestDashboardPageElements.PAGE_TITLE));
	}

	public void click_REFERSH_BUTTON() {
		CUtil.click(By.xpath(requestDashboardPageElements.REFERSH_BUTTON));
	}

	public void Click_ON_LAST_CREATED_PROJECT(String text) {
		String locator = "//div[contains(text(),'" + text + "')]";
		CUtil.click(By.xpath(locator));
	}

}
