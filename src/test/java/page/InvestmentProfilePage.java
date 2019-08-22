package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.InvestmentProfilePageElements;
import utils.CUtil;

public class InvestmentProfilePage {
	private static WebDriver webDriver;
	private InvestmentProfilePageElements investmentProfilePageElements;

	public InvestmentProfilePage(WebDriver webDriver) {
		this.webDriver = webDriver;
		investmentProfilePageElements = new InvestmentProfilePageElements();
	}

	public void select_VALUES_FROM_DROPDOWN(String option, String dropdown) {
		By locator;
		switch (dropdown) {
		case "Investment Objective":
			locator = By.xpath(investmentProfilePageElements.INVESMENT_OBJECT_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		case "Investment Experience":
			locator = By.xpath(investmentProfilePageElements.INVESMENT_EXPERIENCE_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		case "Risk Tolerance":
			locator = By.xpath(investmentProfilePageElements.RISK_TOLERANCE_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		case "Tax Bracket":
			locator = By.xpath(investmentProfilePageElements.TAX_BRACKET_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		case "Annual Income (from all sources)":
			locator = By.xpath(investmentProfilePageElements.ANNUAL_INCOME_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		case "Liquid Net Worth (cash & liquid investments only)":
			locator = By.xpath(investmentProfilePageElements.LIQUID_NET_WORTH_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		case "Total Net Worth (excluding residence)":
			locator = By.xpath(investmentProfilePageElements.TOTAL_NET_WORTH_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		case "Time Horizon":
			locator = By.xpath(investmentProfilePageElements.TIME_HORIZON_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;
		case "Liquidity Needs (The ability to quickly and easily convert all or a portion of the account assets into cash without experiencing significant loss)":
			locator = By.xpath(investmentProfilePageElements.LIQUIDITY_NEEDS_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator, option);
			break;

		default:
			break;
		}

	}

	public boolean isAtThisPage() {
		return CUtil.isDisplayed(By.xpath(investmentProfilePageElements.PAGE_TITLE));
	}

	public void click_NEXT_BUTTON() {
		CUtil.click(By.xpath(investmentProfilePageElements.NEXT_BUTTON_INEVESTMENT_PROFILE));
	}

}
