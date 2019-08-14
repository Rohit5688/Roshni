package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import page.BuildingInvestmentProfilePage;
import runner.SharedDriver;

public class BuildingInvestmentProfileSteps {
	private BuildingInvestmentProfilePage buildingInvestmentProfilePage;
	private WebDriver webDriver;

	public BuildingInvestmentProfileSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		buildingInvestmentProfilePage = new BuildingInvestmentProfilePage(webDriver);
	}
	
	@Then("^I should be on Building Investment Profile Page$")
	public void i_should_be_on_Building_Investment_Profile_Page() throws Throwable {
		Assert.assertTrue(buildingInvestmentProfilePage.isAtThisPage());
	}
}
