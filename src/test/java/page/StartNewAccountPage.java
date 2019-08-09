package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.StartNewAccountPageElements;
import utils.CUtil;

public class StartNewAccountPage {
	private static WebDriver webDriver;
	private StartNewAccountPageElements startNewAccountPageElements;
	static boolean login = false;

	public StartNewAccountPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		startNewAccountPageElements = new StartNewAccountPageElements();
	}

	public boolean is_QUESTION_NUMBER_DISPLAYED(String text) {
		return CUtil.isContainsText(By.xpath(startNewAccountPageElements.QUESTION_NUMBER_XPATH), text);
	}

	public boolean is_QUESTION_TEXT_DISPLAYED(String text) {
		CUtil.waitForVisibleElement(By.xpath(startNewAccountPageElements.QUESTION_TEXT_XPATH));
		return CUtil.isEqualText(By.xpath(startNewAccountPageElements.QUESTION_TEXT_XPATH), text);
	}

	public void select_ANSWER(String text) {
		boolean flag = false;
		char[] arr = text.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '\'') {
				flag = true;
			}
		}
		if (flag) {
			text = "\"" + text + "\"";
		} else {
			text = "\'" + text + "\'";
		}
		String locator = "//div[contains(text()," + text + ")]/preceding-sibling::div";
		CUtil.waitForClickableElement(By.xpath(locator));
		CUtil.click(By.xpath(locator));
	}

	public void click_NEXT_BUTTON() {
		CUtil.click(By.xpath(startNewAccountPageElements.NEXT_BUTTON_XPATH));
	}

	public void click_SUBMIT_BUTTON() {
		CUtil.click(By.xpath(startNewAccountPageElements.SUBMIT_BUTTON_XPATH));
	}

}
