package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.OpenYourAccountPageElements;
import utils.CUtil;

public class OpenYourAccountPage {

	private static WebDriver webDriver;
	private OpenYourAccountPageElements openYourAccountPageElements;

	public OpenYourAccountPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		openYourAccountPageElements = new OpenYourAccountPageElements();
	}

	public boolean isAtThisPage() {
		return CUtil.isDisplayed(By.xpath(openYourAccountPageElements.PAGE_TITLE));
	}

	public void click_NEXT_BUTTON_OPEN_ACCOUNT_PAGE() {
		CUtil.click(By.xpath(openYourAccountPageElements.NEXT_BUTTON_OPEN_ACCOUNT_PAGE_XPATH));
		
	}

	public void select_ACCOUNT_TYPE(String text) {
		switch (text) {
		case "Individual":
			CUtil.click(By.xpath(openYourAccountPageElements.INDIVIDUAL_ACCOUNT_XPATH));
			break;
		case "Joint":
			CUtil.click(By.xpath(openYourAccountPageElements.JOINT_ACCOUNT_XPATH));
			break;
		case "Retirement":
			CUtil.click(By.xpath(openYourAccountPageElements.RETIREMENT_ACCOUNT_XPATH));
			break;

		default:
			break;
		}
		
	}

	public void select_VALUES_FROM_DROPDOWN(String option, String dropdown) {
		By locator;
		switch (dropdown) {
		case "Investment Objective":
			locator=By.xpath(openYourAccountPageElements.INVESMENT_OBJECT_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator,option);
			break;
		case "Investment Experience":
			locator=By.xpath(openYourAccountPageElements.INVESMENT_EXPERIENCE_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator,option);
			break;
		case "Risk Tolerance":
			locator=By.xpath(openYourAccountPageElements.RISK_TOLERANCE_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator,option);
			break;
		case "Tax Bracket":
			locator=By.xpath(openYourAccountPageElements.TAX_BRACKET_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator,option);
			break;
		case "Annual Income (from all sources)":
			locator=By.xpath(openYourAccountPageElements.ANNUAL_INCOME_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator,option);
			break;
		case "Liquid Net Worth (cash & liquid investments only)":
			locator=By.xpath(openYourAccountPageElements.LIQUID_NET_WORTH_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator,option);
			break;
		case "Total Net Worth (excluding residence)":
			locator=By.xpath(openYourAccountPageElements.TOTAL_NET_WORTH_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator,option);
			break;
		case "Time Horizon":
			locator=By.xpath(openYourAccountPageElements.TIME_HORIZON_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator,option);
			break;
		case "Liquidity Needs (The ability to quickly and easily convert all or a portion of the account assets into cash without experiencing significant loss)":
			locator=By.xpath(openYourAccountPageElements.LIQUIDITY_NEEDS_DROPDOWN_XPATH);
			CUtil.selectDropdown(locator,option);
			break;

		default:
			break;
		}
		
	}

}
