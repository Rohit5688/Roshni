package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.TermsAndConditionPageElements;
import utils.CUtil;

public class TermsAndConditionPage {
	
	private static WebDriver webDriver;
	private TermsAndConditionPageElements termsAndConditionPageElements;

	public TermsAndConditionPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		termsAndConditionPageElements = new TermsAndConditionPageElements();
	}

	public boolean isAtThisPage() {
		return CUtil.isDisplayed(By.xpath(termsAndConditionPageElements.PAGE_TITLE));
	}

	public void click_ACCEPTANCE_CHECK_BOX() {
		CUtil.click(By.xpath(termsAndConditionPageElements.ACCEPTANCE_CHECHBOX_XPATH));		
	}

	public void click_NEXT_BUTTON_TERMS_CONDITION_PAGE() {
		CUtil.click(By.xpath(termsAndConditionPageElements.NEXT_BUTTON_TERMS_AND_CONDTION_XPATH));		
	}


}
