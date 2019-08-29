package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.HyperionLoginPageElements;
import pageelements.LoginPageElements;
import runner.SharedDriver;
import utils.CUtil;

public class HyperionLoginPage {

	private static WebDriver webDriver;
	private HyperionLoginPageElements hyperionloginPageElements;
	static boolean login = false;

	public HyperionLoginPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		hyperionloginPageElements = new HyperionLoginPageElements();
	}

	public void navigateToLoginPage() {
		String env = System.getProperty("environment");
		if (env == null) {
			env = "QA";
		}
		switch (env) {
		case "QA":
		case "qa":
			webDriver.get(CUtil.getProperty("src/test/resources/Config/commonconfig.property", "hyperion_url_qa"));
			break;
		case "UAT":
		case "uat":
			webDriver.get(CUtil.getProperty("src/test/resources/Config/commonconfig.property", "hyperion_url_qa"));
			break;

		}
		// webDriver.manage().window().maximize();

	}

	public void click_ON_LOGIN_BUTTON_LANDING_PAGE() {
		CUtil.waitForPageLoad();
		CUtil.actionClickNew(By.xpath(hyperionloginPageElements.LOGIN_BUTTON_LANDING_PAGE));
	}

	public boolean isAtThisPage() {
		try {
			CUtil.waitForElement(By.xpath(hyperionloginPageElements.PAGE_TITLE));
		} catch (Exception e) {
			webDriver.navigate().to(
					"https://idp.qa.trizic.com/auth/realms/csqa04/protocol/openid-connect/auth?client_id=advisor-ui&redirect_uri=https%3A%2F%2Fadvisor-ui-csqa04.trizic.com%2Fhome&state=6e24ffe4-8992-4bd1-9a70-9754a64682f0&response_mode=fragment&response_type=code&scope=openid&nonce=652b5d54-b014-4676-83f9-4912ca82556a");
		}
		return CUtil.isDisplayed(By.xpath(hyperionloginPageElements.PAGE_TITLE));

	}

	public void type_USER_NAME(String text) {
		CUtil.type(By.xpath(hyperionloginPageElements.USER_NAME_TEXT_BOX), text);
	}

	public void type_PASS_WORD(String text) {
		CUtil.type(By.xpath(hyperionloginPageElements.PASS_WORD_TEXT_BOX), text);
	}

	public void click_ON_LOGIN_BUTTON() {
		CUtil.click(By.xpath(hyperionloginPageElements.LOGIN_BUTTON_XPATH));
	}
}
