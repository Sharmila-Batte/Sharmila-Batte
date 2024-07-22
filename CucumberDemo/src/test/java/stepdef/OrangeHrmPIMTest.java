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

public class OrangeHrmPIMTest extends SeleniumUtility1 {
	@Given("^user is on orangeHRM login page$")
	public void loginPage() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@And("enters valid data for login as {string} and {string}")
	public void login(String username, String password) {
		typeInput(driver.findElement(By.name("username")), username);
		typeInput(driver.findElement(By.name("password")), password);
	}

	@And("^clicks on login button of OrangeHRM$")
	public void loginOrange() {
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
	}

	@And("^user clicks on PIM link$")
	public void clickOnPIMLink() {
		clickOnElement(driver.findElement(By.cssSelector("ul.oxd-main-menu>li:nth-of-type(2) span")));
	}

	@When("^user click on add button of OrangeHRM$")
	public void clickOnAddBtnOfOrangeHrmPIM() {
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-header-container>button")));
	}

	@And("^user enters the firstname as (.+) ,last as (.+) ,employee id as (.+) and click on save button of PIM create$")
	public void enterData(String firstnm, String lastnm, int empId) {
		typeInput(driver.findElement(By.name("firstName")), firstnm);
		typeInput(driver.findElement(By.name("lastName")), lastnm);
		setSleepTime(2000);
		getActiveElementFromUI().sendKeys(Keys.TAB, Keys.BACK_SPACE);
		waitForElementDisplayed(driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")));
		typeInput(driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")),
				String.valueOf(empId));
		setSleepTime(2000);
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		setSleepTime(2000);
	}

	@Then("^navigate to PIM home page$")
	public void clickOnPIMHomePage() {
		clickOnElement(driver.findElement(By.cssSelector("ul.oxd-main-menu>li:nth-of-type(2) span")));
	}

	@And("^search newly created employee id as (.+) of PIM create$")
	public void searchEmployeeIdCreate(int empId) {
		typeInput(driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")),String.valueOf(empId));
		setSleepTime(2000);
	}

	@And("^click on search button of PIM create$")
	public void clickOnSearchButtonOfPIMCreate() {
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		setSleepTime(2000);
	}

	@And("^verify the result of PIM create$")
	public void VerifyResultCreate() {
		WebElement searchResultCountMsg = driver.findElement(By.cssSelector(".orangehrm-vertical-padding>span"));
		isElementExist(searchResultCountMsg);
		setSleepTime(2000);
		String acutalMsg = getTextFromElement(searchResultCountMsg);
		String expectedMsg = "(1) Record Found";
		Assert.assertEquals(acutalMsg, expectedMsg);
	}

	// update
	@When("^search for newly created Employee id as (.+) of PIM update$")
	public void searchEmployeeIdUpdate(int empId) {
		typeInput(driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")),
				String.valueOf(empId));
		setSleepTime(2000);
	}

	@And("^click on search button of PIM Edit$")
	public void clickOnSearchButtonOfPIMUpdate() {
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		setSleepTime(2000);
	}

	@And("^click on firstchcekbox and click on edit symbol$")
	public void clickOnCheckboxEditSymbol() {
		clickOnElement(driver.findElement(By.cssSelector(".oxd-table-body>div:nth-child(1) label")));
		clickOnElement(driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']/button[2]")));
		setSleepTime(1000);
	}
	 @And("^click on job and  click on jobtitle dropdown$")
	 public void clickOnJobAndJobTitleDropDown()
	 {
		clickOnElement(driver.findElement(By.xpath("//a[text()='Job']")));
		setSleepTime(3000);
		WebElement jobDropDown =driver.findElement(By.cssSelector(".oxd-select-text-input"));
		clickOnElement(jobDropDown);
		setSleepTime(1000);
	 }
	 @And("^select job title$")
	 public void selectJobTitle()
	 {
		 WebElement jobDropDown =driver.findElement(By.cssSelector(".oxd-select-text-input"));
		jobDropDown.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		setSleepTime(1000);
	 }
	 @And("^Click on save button of PIM Edit$")
	 public void clickOnSavePIMEdit()
	 {
		 clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		 setSleepTime(1000);
	 }
	 @Then("^Click on PIM for verify$")
	 public void clickOnPIMVerify()
	 {
		 setSleepTime(1000);
		 clickOnElement(driver.findElement(By.cssSelector("ul.oxd-main-menu>li:nth-of-type(2) span")));
	 }
	 @And("^search Employee id as (.+) and jobtitle as (.+)$")
	 public void searchIdAndJobTitle(int empId,String jobTitle)
	 {
		typeInput(driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")), String.valueOf(empId));
		setSleepTime(2000);
		WebElement jobTitle1=driver.findElement(By.cssSelector(".oxd-form-row .oxd-grid-4.orangehrm-full-width-grid>div:nth-of-type(6) div>*:nth-of-type(2)>div>div>div[class='oxd-select-text-input']"));
		clickOnElement(jobTitle1);
		setSleepTime(1000);
		jobTitle1.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		setSleepTime(1000);
	 }
	 @And("^Click on Search button of PIM edit to check updated record$")
	 public void clickOnSearchButtonOfPIMEdit()
	 {
		 clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
	 }
	 @And("^verify the result of PIM edit$")
	 public void verifyResultOfPIMEdit()
	 {
		    WebElement searchResultCountMsg = driver.findElement(By.cssSelector(".orangehrm-vertical-padding>span"));
			isElementExist(searchResultCountMsg);
			setSleepTime(2000);
			String acutalMsg = getTextFromElement(searchResultCountMsg);
			String expectedMsg = "(1) Record Found";
			Assert.assertEquals(acutalMsg, expectedMsg);
	 }
	 //delete
	 @When("^search for newly created Employee id as (.+) for PIM delete and click on search button of PIM delete$")
	 public void searchEmployeeIdDelete(int empId)
	 { 
		 typeInput(driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")),String.valueOf(empId));
		 setSleepTime(2000);
		 clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		 setSleepTime(2000);
	 }
	 @And("^click on firstchcekbox and click on delete symbol of PIM delete$")
	 public void clickOnCheckboxAndDeleteSymbol()
	 {
		 WebElement firstEmpCheckBox=driver.findElement(By.cssSelector(".oxd-table-body>div:nth-child(1) label"));
		 clickOnElement(firstEmpCheckBox);
		 WebElement firstEmpDeleteSymbol=  driver.findElement(By.cssSelector(".oxd-table-body>div:nth-child(1) .bi-trash"));
		 clickOnElement(firstEmpDeleteSymbol);
	 }
	 @And("^click on yes button of confirmaion pop-up$")
	 public void clickOnYesButton()
	 {
		 WebElement yesButtonOnConfirmationPopup=driver.findElement(By.cssSelector(".orangehrm-modal-footer>button:nth-of-type(2)"));
		 clickOnElement(yesButtonOnConfirmationPopup);
	 }
	 
	 @And("^verify the result of PIM delete$")
	 public void verifyPIMDelete()
	 {
		 WebElement searchResultCountMsg = driver.findElement(By.cssSelector(".orangehrm-vertical-padding>span"));
		 isElementExist(searchResultCountMsg);
		 setSleepTime(2000);
		 String acutalMsg = getTextFromElement(searchResultCountMsg);
		 String expectedMsg="No Records Found";
		 Assert.assertEquals(acutalMsg, expectedMsg);
		 
	 }
	 
	 

	 
	 
}