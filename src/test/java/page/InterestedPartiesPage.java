package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.InterestedPartiesPageElements;
import utils.CUtil;

public class InterestedPartiesPage {
	private static WebDriver webDriver;
	private InterestedPartiesPageElements interestedPartiesPageElements;

	public InterestedPartiesPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		interestedPartiesPageElements = new InterestedPartiesPageElements();
	}

	public boolean isAtThisPage() {
		return CUtil.isDisplayed(By.xpath(interestedPartiesPageElements.PAGE_TITLE));
	}

	public void click_NEXT_BUTTON() {
		CUtil.click(By.xpath(interestedPartiesPageElements.NEXT_BUTTON_INTERESTED_PARTIES_XPATH));
	}
}
