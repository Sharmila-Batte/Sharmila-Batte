package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.utility.SeleniumUtility1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webpages_orangrhrm.AddEmployeePage;
import webpages_orangrhrm.HomePage;
import webpages_orangrhrm.OrangeHRM_LoginPage;
import webpages_orangrhrm.PersonalDetailsPage;
import webpages_orangrhrm.PimHomePage;



public class OrangeHrmPIMPOM extends SeleniumUtility1{
	WebDriver driver;
	AddEmployeePage getAddEmployeePage;
	HomePage getHomePage;
	OrangeHRM_LoginPage getOrangeHRM_LoginPage;
	PersonalDetailsPage getPersonalDetailsPage;
	PimHomePage getPimHomePage;
	@Given("^user is on orangeHRM login page for POM$")
	public void loginPage() {
		   driver= setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getOrangeHRM_LoginPage = new OrangeHRM_LoginPage(driver);
		getAddEmployeePage = new AddEmployeePage(driver);
		getHomePage = new HomePage(driver);
		getPersonalDetailsPage = new PersonalDetailsPage(driver);
		getPimHomePage = new PimHomePage(driver);
		}
	@And("^user login successfully with valid data for POM$")
    public void login() {
		getOrangeHRM_LoginPage.loginIntoApplication("Admin", "admin123");
		
    }
	@And("^user clicks on PIM link for POM$")
	public void clickOnPIM()
	{
		getHomePage.clickOnPIM();
	}
	@When("^user click on add button of OrangeHRM for POM$")
	public void clickOnAddBtn()
	{
		getPimHomePage.clickOnAddButton();
	}
	@And("^user enters the firstname as (.+) ,last as (.+) ,employee id as (.+) and click on save button of PIM create for POM$")
	public void enterData(String firstnm, String lastnm, int empId) {
		getAddEmployeePage.createEmployee(firstnm, lastnm, empId);
	}
	@Then("^navigate to PIM home page for POM$")
	public void PIMHomePage()
	{
		getHomePage.clickOnPIM();
	}
	@And("^search newly created employee id as (.+) of PIM create and click on search button for POM$")
	public void searchEmployeeIdCreate(int empId) {
		getPimHomePage.searchCreatedEmployee(12345);
	}
	@And("^verify the result of PIM create for POM$")
	public void VerifyResultCreate() {
		String acutalMsg = getPimHomePage.getSearchResultMsg();
		String expectedMsg = "(1) Record Found";
		Assert.assertEquals(acutalMsg, expectedMsg);
	}
	

}
