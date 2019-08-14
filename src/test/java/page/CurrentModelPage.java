package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.CurrentModelPageElements;
import utils.CUtil;

public class CurrentModelPage {

	private static WebDriver webDriver;
	private CurrentModelPageElements currentModelPageElements;

	public CurrentModelPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		currentModelPageElements = new CurrentModelPageElements();
	}

	public boolean isAtThisPage() {
		return CUtil.isDisplayed(By.xpath(currentModelPageElements.PAGE_TITLE));
	}

	public void click_SELECT_BUTTON_CURRENT_MODEL_PAGE() {
		CUtil.click(By.xpath(currentModelPageElements.SELECT_BUTTON_CURRENT_MODEL_PAGE));
		
	}

}
