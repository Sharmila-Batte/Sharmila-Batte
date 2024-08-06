package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utility.SeleniumUtility1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webpages_OrangeHRM.AddEmployeePage;
import webpages_OrangeHRM.OrangeHRM_HomePage;
import webpages_OrangeHRM.OrangeHRM_Login;
import webpages_OrangeHRM.PersonalDetailsPage;
import webpages_OrangeHRM.PimHomePage;

public class OrangeHRMPIMPOMTest extends SeleniumUtility1 {
	WebDriver driver;
	AddEmployeePage getAddEmployeePage;
	OrangeHRM_HomePage getOrangeHRM_HomePage;
	OrangeHRM_Login getOrangeHRM_Login;
	PersonalDetailsPage getPersonalDetailsPage;
	PimHomePage getPimHomePage;
	@Given("^User is on OrangeHRM login page of OrangeHRM PIM POM$")
	public void loginPage()
	{
		driver=setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getAddEmployeePage = new AddEmployeePage(driver);
		getOrangeHRM_HomePage = new OrangeHRM_HomePage(driver);
		getOrangeHRM_Login = new OrangeHRM_Login(driver);
		getPersonalDetailsPage = new PersonalDetailsPage(driver);
		getPimHomePage = new PimHomePage(driver);
	}
	
	@And("^User login successfully with valid data for OrangeHRM PIM POM and clicks on login button of OrangeHRM PIM POM$")
	public void login()
	{
		getOrangeHRM_Login.logintoApplication("Admin", "admin123");
	}
	
	@And("^user clicks on PIM link of OrangeHRM PIM POM$")
	public void clickOnPIM()
	{
		getOrangeHRM_HomePage.clickOnPIM();
	}
	
	    //PIM Create
		@When("^User click on add button of OrangeHRM PIM POM$")
		public void clickOnAdd() {
			getPimHomePage.addBtn();
		}
		
		@And("^Type input firstnm as (.+) ,lastnm as (.+) ,empid as (.+) and click on save button of PIM create of OrangeHRM PIM POM$")
		public void enterDataClickOnSave(String firstnm,String lastnm,int empId)
		{
			getAddEmployeePage.createEmployee(firstnm, lastnm, empId);
		} 
		//PIM Create validation
		@Then("^Navigate to PIM home page of OrangeHRM PIM POM$")
		public void navigatePIMHomePage()
		{
			getOrangeHRM_HomePage.clickOnPIM();
		}
		@And("^Search newly created empid as (.+) of PIM create and Click on search button PIM create of OrangeHRM PIM POM$")
		public void searchCreatedEmp(int empId)
		{
			getPimHomePage.searchcreatedEmp(empId);
		}
		
		@And("^Verify the result of PIM create for OrangeHRM POM$")
		public void verifyCreatePIMResult()
		{
			String actualMsg=getPimHomePage.getSearchResultMsg();
			String expectedMsg="(1) Record Found";
			Assert.assertEquals(actualMsg, expectedMsg);
		}
		
		//PIM update
		@When("^Search created empid as (.+) of PIM edit of OrangeHRM PIM POM$")
		public void searchEmpIdForUpdate(int empId)
		{
			getPimHomePage.searchcreatedEmp(empId);
		}
		
		 @And("^select firstcheckbox and click on edit buton symbol of PIM edit of OrangeHRM PIM POM$")
		 public void selectFirstcheckboxEditBtnSymbol()
		 {
			 getPimHomePage.editCreatedEmployee();
		 }
		 
		 @And("^click on job and click on jobTitle of PIM edit of OrangeHRM PIM POM$")
		 public void clickOnJobAndJobTitle()
		 {
			 getPersonalDetailsPage.selectJobEmployee();
		 }
		 
		
		//PIM edit validation
		 @Then("^Click on PIM for verification of OrangeHRM PIM POM$")
		 public void PIM()
		 {
			 getOrangeHRM_HomePage.clickOnPIM();
		 }
		 
		 @And("^search Employee id as (.+) of PIM edit of OrangeHRM PIM POM$")
		 public void searchEmpIdJobTitle(int empId)
		 {
			 getPimHomePage.searchCreatedEmployeeIdTitle(empId, "Account Assistant");
		 }
		 
		 @And("verify the result of PIM edit of OrangeHRM PIM POM$")
		 public void verifyPIMEdit()
		 {
			 String actualMsgCount= getPimHomePage.getSearchResultMsg();
			 String expectedMsgCount="(1) Record Found";
			 Assert.assertEquals(actualMsgCount, expectedMsgCount);
		 }
		 //PIM Delete
		 @When("^Search created empId as (.+) of PIM delete of OrangeHRM PIM POM$")
		 public void searchEmpIdForDelete(int empId)
		 {
			 getPimHomePage.searchcreatedEmp(empId);
		 }
		 
		 @And("^click on firstcheckbox and delete symbol of PIM delete of OrangeHRM PIM POM$")
		 public void clickOnCheckBoxAndDeleteSymbol()
		 {
			 getPimHomePage.deleteCreatedEmployee();
		 }
		 //Validation of PIM Delete
		 @Then("^For verification search created empId as (.+) of PIM delete of OrangeHRM PIM POM$")
		 public void searchEmpIdForValidation(int empId)
		 {
			 getPimHomePage.searchcreatedEmp(empId);
		 }
		 
		 @And("^Verify the result of PIM delete of OrangeHRM PIM POM$")
		 public void verifyResultOfDelete()
		 {
			 String actualMsg=getPimHomePage.getSearchResultMsg();
			 String expectedMsg="No Records Found";
			 Assert.assertEquals(actualMsg, expectedMsg);
		 }
		
		
	

}
