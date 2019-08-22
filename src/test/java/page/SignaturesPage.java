package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.SignaturesPageElements;
import utils.CUtil;

public class SignaturesPage {
	private static WebDriver webDriver;
	private SignaturesPageElements signaturesPageElements;

	public SignaturesPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		signaturesPageElements = new SignaturesPageElements();
	}

	public boolean isAtThisPage() {
		return CUtil.isDisplayed(By.xpath(signaturesPageElements.PAGE_TITLE));
	}

	public void click_SIGNATURE_CHECK_BOX() {
		CUtil.click(By.xpath(signaturesPageElements.SIGNATURE_CHECHBOX_XPATH));
	}

	public void select_VALUES_FROM_DROPDOWN(String option, String dropdown) {
		By locator;
		switch (dropdown) {
		case "Type IRA":
			locator = By.xpath(signaturesPageElements.IRA_TYPE_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		case "Joint Form":
			locator = By.xpath(signaturesPageElements.JOINT_FORM_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		default:
			break;
		}

	}

	public void click_NEXT_BUTTON() {
		CUtil.click(By.xpath(signaturesPageElements.NEXT_BUTTON_SIGNATURE_XPATH));
	}

}
