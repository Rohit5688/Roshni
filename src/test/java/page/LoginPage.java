package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageelements.LoginPageElements;
import utils.CUtil;
import utils.SharedDriver;

public class LoginPage {
	private static WebDriver webDriver;
	private LoginPageElements loginPageElements;
	static boolean login = false;

	public LoginPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		loginPageElements = new LoginPageElements();
	}

	public void navigateToLoginPage() {

		String env = System.getProperty("environment");
		if (env == null) {
			env = "QA";
		}
		switch (env) {
		case "QA":
		case "qa":
			webDriver.get(CUtil.getProperty("src/test/resources/Config/commonconfig.property", "osiris_url_qa"));
			break;
		case "UAT":
		case "uat":
			webDriver.get(CUtil.getProperty("src/test/resources/Config/commonconfig.property", "osiris_url_uat"));
			break;

		}
		// webDriver.manage().window().maximize();
	}

	public void click_ON_GET_STARTED_LOGIN_BUTTON() {
		CUtil.click(By.xpath(loginPageElements.GET_STATRED_LOGIN_BUTTON_XPATH));
	}

	public boolean is_LOGIN_MODAL_DISPLAYED() {
		return CUtil.isDisplayed(By.xpath(loginPageElements.LOGIN_MODAL_XPATH));
	}

	public void type_USERNAME(String text) {
		CUtil.type(By.xpath(loginPageElements.USER_NAME_XPATH), text);		
	}

	public void type_PASSWORD(String text) {
		CUtil.type(By.xpath(loginPageElements.PASS_WORD_XPATH), text);		
	}

	public void click_LOGIN_BUTTON() {
		CUtil.click(By.xpath(loginPageElements.LOGIN_BUTTON_XPATH));
		
	}

}
