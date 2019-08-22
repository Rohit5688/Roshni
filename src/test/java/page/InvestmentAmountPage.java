package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.InvestmentAmountPageElements;
import utils.CUtil;

public class InvestmentAmountPage {
	private static WebDriver webDriver;
	private InvestmentAmountPageElements investmentAmountPageElements;

	public InvestmentAmountPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		investmentAmountPageElements = new InvestmentAmountPageElements();
	}

	public boolean isAtThisPage() {
		return CUtil.isDisplayed(By.xpath(investmentAmountPageElements.PAGE_TITLE));
	}

	public void click_NEXT_BUTTON() {
		CUtil.click(By.xpath(investmentAmountPageElements.NEXT_BUTTON_INVEST_AMOUNT_XPATH));
	}

	public void type_INVESTMENT_AMOUNT(String text) {
		CUtil.type(By.xpath(investmentAmountPageElements.INVESTMENT_AMOUNT_TEXTBOX_XPATH), text);
	}

	public void select_VALUES_FROM_DROPDOWN(String option, String dropdown) {
		By locator;
		switch (dropdown) {
		case "Contribution Type":
			locator = By.xpath(investmentAmountPageElements.CONTRIBUTION_TYPE_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		case "Contribution Year":
			locator = By.xpath(investmentAmountPageElements.CONTRIBUTION_YEAR_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		default:
			break;
		}
		
	}

}
