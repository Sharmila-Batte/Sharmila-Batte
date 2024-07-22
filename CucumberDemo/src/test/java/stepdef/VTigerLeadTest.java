package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utility.SeleniumUtility1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VTigerLeadTest extends SeleniumUtility1{
	@Given("^user already in login page of vtiger lead$")
	public void loginPage()
	{
		setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	}
	@And("^user login successfully with valid data of vtiger lead$")
	public void login()
	{
		typeInput(driver.findElement(By.name("username")), "admin");
		typeInput(driver.findElement(By.name("password")), "admin");
		clickOnElement(driver.findElement(By.xpath("//button[text()='Sign in']")));
	}
	@And("^click on navigation bar of vtiger lead$")
	public void click_on_navigation_bar() {
        clickOnElement(driver.findElement(By.cssSelector(".fa-bars")));
    }
	@And("^go to Marketing and select Leads of vtiger lead$")
	 public void go_to_marketing_and_select_leads() 
	 {
		clickOnElement(driver.findElement(By.id("MARKETING_modules_dropdownMenu")));
		clickOnElement(driver.findElement(By.xpath("//span[text()=' Leads']")));
	 }
	@When("^click on Add Leads button and enter firstname as (.+) ,last as (.+) ,number as (.+) and click on save button$")
	public void clickOnAddBtnEnterData(String fName,String lastName,int mobile_number)
	{
		WebElement addBtn=driver.findElement(By.xpath("//button[contains(@id,'ADD_RECORD')]"));
		clickOnElement(addBtn);
		typeInput(driver.findElement(By.name("firstname")),fName);
		typeInput(driver.findElement(By.xpath("//input[contains(@id,'lastname')]")),lastName);
		typeInput(driver.findElement(By.cssSelector("#Leads_editView_fieldName_mobile")),String.valueOf(mobile_number));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
	}
	@And("^click on Leads link$")
	public void leadLink()
	{
		WebElement leadLink=driver.findElement(By.xpath("//a[@title='Leads']/h4"));
		clickOnElement(leadLink);
	}
	@Then("^verify lead is created$")
	public void verifyLead()
	{
		WebElement firstnmInputFieldCreate=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastnmInputFieldCreate=driver.findElement(By.xpath("//input[@name='lastname']"));
		typeInput(firstnmInputFieldCreate,"Sharmila");
		typeInput(lastnmInputFieldCreate,"Malkar");
		setSleepTime(2000);
		WebElement searchCreate=driver.findElement(By.xpath("//span[@class='s2-btn-text']"));
		clickOnElement(searchCreate);
		setSleepTime(1000);
		
		WebElement entryCreate = driver.findElement(By.xpath("//tr[@id='Leads_listView_row_1']"));
		isElementExist(entryCreate);
		setSleepTime(2000);
		
		String acutalMsg = getTextFromElement(entryCreate);
		String expectedMsg = "Sharmila";
		Assert.assertTrue(acutalMsg.contains(expectedMsg));
		
	}

}
