package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.HyperionHomePageElements;
import utils.CUtil;

public class HyperionHomePage {
	private static WebDriver webDriver;
	private HyperionHomePageElements hyperionHomePageElements;
	static boolean login = false;

	public HyperionHomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
		hyperionHomePageElements = new HyperionHomePageElements();
	}
	
	public boolean isAtThisPage() {
		CUtil.waitForElement(By.xpath(hyperionHomePageElements.PAGE_TITLE));
		return CUtil.isDisplayed(By.xpath(hyperionHomePageElements.PAGE_TITLE));
	}

	public void click_REQUEST_DASHBOAR_BUTTON() {
		CUtil.click(By.xpath(hyperionHomePageElements.REQUEST_DASHBOAR_BUTTON));
	}

}
