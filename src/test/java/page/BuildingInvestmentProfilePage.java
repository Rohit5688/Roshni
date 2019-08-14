package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageelements.BuildingInvestmentProfilePageElements;
import runner.SharedDriver;
import utils.CUtil;

public class BuildingInvestmentProfilePage {

	private static WebDriver webDriver;
	private BuildingInvestmentProfilePageElements buildingInvestmentProfilePageElements;

	public BuildingInvestmentProfilePage(WebDriver webDriver) {
		this.webDriver = webDriver;
		buildingInvestmentProfilePageElements = new BuildingInvestmentProfilePageElements();
	}

	public boolean isAtThisPage() {
		return CUtil.isDisplayed(By.xpath(buildingInvestmentProfilePageElements.PAGE_TITLE));
	}

}
