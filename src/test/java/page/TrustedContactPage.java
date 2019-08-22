package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.TrustedContactPageElements;
import utils.CUtil;

public class TrustedContactPage {
	private static WebDriver webDriver;
	private TrustedContactPageElements trustedContactPageElements;

	public TrustedContactPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		trustedContactPageElements = new TrustedContactPageElements();
	}

	public boolean isAtThisPage() {
		return CUtil.isDisplayed(By.xpath(trustedContactPageElements.PAGE_TITLE));
	}

	public boolean is_INCLUDE_TRUSTED_CONTACT_CHECKBOX_PRESENT() {
		return CUtil.isDisplayed(By.xpath(trustedContactPageElements.INCLUDE_TRUSTED_CONTACT_CHECKBOX_XPATH));
	}

	public void click_NEXT_BUTTON() {
		CUtil.click(By.xpath(trustedContactPageElements.NEXT_BUTTON_TRUSTED_CONTACT_XPATH));
	}
}
