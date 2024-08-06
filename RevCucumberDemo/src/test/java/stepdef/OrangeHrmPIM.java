package stepdef;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utility.SeleniumUtility1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmPIM extends SeleniumUtility1 {
	@Given("^User is on OrangeHRM login page$")
	public void loginPage()
	{
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@And("user enter valid data for OrangeHRM login as {string} and {string}")
	public void enterUnmPwd(String usernm,String password)
	{
		typeInput(driver.findElement(By.name("username")),usernm);
		typeInput(driver.findElement(By.name("password")),password);
	}
	
	@And("^user clicks on login button of OrangeHRM$")
	public void clickOnLogin()
	{
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
	}
	
	@And("^user clicks on PIM link$")
	public void clickOnPIM()
	{
		clickOnElement(driver.findElement(By.cssSelector("ul.oxd-main-menu>li:nth-of-type(2) span")));
	}
	
	//PIM Create
	@When("^User click on add button of OrangeHRM$")
	public void clickOnAdd() {
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-header-container>button")));
	}
	
	@And("^Type input firstnm as (.+) ,lastnm as (.+) ,empid as (.+) and click on save button of PIM create$")
	public void enterDataClickOnSave(String firstnm,String lastnm,int empId)
	{
		typeInput(driver.findElement(By.name("firstName")),firstnm);
		typeInput(driver.findElement(By.name("lastName")),lastnm);
		setSleepTime(2000);
		WebElement empIdWeb = driver
				.findElement(By.cssSelector(".oxd-grid-2.orangehrm-full-width-grid div div div:nth-of-type(2) input"));
		empIdWeb.sendKeys(Keys.chord(Keys.CONTROL, "a"), String.valueOf(empId));
		setSleepTime(2000);
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		setSleepTime(2000);
	}
	@Then("^Navigate to PIM home page$")
	public void navigatePIMHomePage()
	{
		clickOnElement(driver.findElement(By.cssSelector("ul.oxd-main-menu>li:nth-of-type(2) span")));
	}
	
	//Validation ofPIM Create
	@And("^Search newly created empid as(.+) of PIM create$")
	public void enterEmpId(int empId)
	{
		typeInput(driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")),String.valueOf(empId));
		setSleepTime(2000);
	}
	
	@And("^Click on search button PIM create$")
	public void clickOnSearch()
	{
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		setSleepTime(2000);
	}
	
	@And("^Verify the result of PIM create$")
	public void verifyResult()
	{
		String actualMsg=driver.findElement(By.cssSelector(".orangehrm-vertical-padding>span")).getText();
		String expectedMsg="(1) Record Found";
		Assert.assertEquals(actualMsg, expectedMsg);
	}
	
	//PIM Edit
	@When("^Search created empid as (.+) of PIM edit$")
	public void searchEmpIdForUpdate(int empId)
	{
		typeInput(driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")),String.valueOf(empId));
		setSleepTime(2000);
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		setSleepTime(2000);
	}
	
	 @And("^select firstcheckbox and click on edit buton symbol of PIM edit$")
	 public void selectFirstcheckboxEditBtnSymbol()
	 {
		 clickOnElement(driver.findElement(By.cssSelector(".oxd-table-body>div:nth-child(1) label")));
		 clickOnElement(driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']/button[1]")));
		 setSleepTime(2000);
	 }
	 
	 @And("^click on job and click on jobTitle of PIM edit$")
	 public void clickOnJobAndJobTitle()
	 {
		 clickOnElement(driver.findElement(By.xpath("//a[text()='Job']")));
		 setSleepTime(3000);
		 clickOnElement(driver.findElement(By.cssSelector(".oxd-select-text-input")));
		 setSleepTime(1000);
	 }
	 
	 @And("^select jobTitle$")
	 public void selectJobTitle()
	 {
		 WebElement jobDropDown=driver.findElement(By.cssSelector(".oxd-select-text-input"));
		 jobDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		 setSleepTime(1000);
			
			
	 }
	 @And("^Click on save button of PIM edit$")
	 public void saveBtn()
	 {
		 WebElement save=driver.findElement(By.xpath("//button[@type='submit']"));
		 clickOnElement(save);
		 setSleepTime(1000);
	 }
	 
	 //PIM edit validation
	 @Then("^Click on PIM for verification$")
	 public void PIM()
	 {
		 clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
		 setSleepTime(1000);
	 }
	 
	 @And("^search Employee id as (.+) of PIM edit$")
	 public void searchEmpIdJobTitle(int empId)
	 {
		    typeInput(driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")), String.valueOf(empId));
			setSleepTime(2000);
			WebElement jobTitleDropDown=driver.findElement(By.cssSelector(".oxd-form-row .oxd-grid-4.orangehrm-full-width-grid>div:nth-of-type(6) div>*:nth-of-type(2)>div>div>div[class='oxd-select-text-input']"));
			clickOnElement(jobTitleDropDown);
			setSleepTime(1000);
			jobTitleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			setSleepTime(1000);
			WebElement searchBtnPimPage=driver.findElement(By.xpath("//button[@type='submit']"));
			clickOnElement(searchBtnPimPage);
			setSleepTime(1000);
	 }
	 
	 @And("verify the result of PIM edit$")
	 public void verifyPIMEdit()
	 {
		 String actualMsgCount=driver.findElement(By.cssSelector(".orangehrm-vertical-padding>span")).getText();
		 String expectedMsgCount="(1) Record Found";
		 Assert.assertEquals(actualMsgCount, expectedMsgCount);
	 }
	// PIM delete
	 @When("^Search created empId as (.+) of PIM delete$")
	 public void searchEmpIdForDelete(int empId)
	 {
		typeInput(driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")),String.valueOf(empId));
		setSleepTime(2000);
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		setSleepTime(2000);
	 }
	 
	 @And("^click on firstcheckbox and delete symbol of PIM delete$")
	 public void clickOnCheckBoxAndDeleteSymbol()
	 {
		 clickOnElement(driver.findElement(By.cssSelector(".oxd-table-body>div:nth-child(1) label")));
		 clickOnElement(driver.findElement(By.cssSelector(".oxd-table-body>div:nth-child(1) .bi-trash")));
		 setSleepTime(2000);
	 }
	 
	 @And("^click on yes button of delete pop up of PIM delete$")
	 public void yesBtnPopUp()
	 {
		 clickOnElement(driver.findElement(By.cssSelector(".orangehrm-modal-footer>button:nth-of-type(2)")));
	 }
	
	 //Validation
	 @Then("^For verification search created empId as (.+) of PIM delete$")
	 public void searchEmpIdForValidation(int empId)
	 {
		 //typeInput(driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")),String.valueOf(empId));
		 //setSleepTime(2000);
		 clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		 setSleepTime(2000);
	 }
	 
	 @And("^Verify the result of PIM delete$")
	 public void verifyResultOfDelete()
	 {
		 String actualMsg=driver.findElement(By.cssSelector(".orangehrm-vertical-padding>span")).getText();
		 String expectedMsg="No Records Found";
		 Assert.assertEquals(actualMsg, expectedMsg);
	 }
	
	

}
