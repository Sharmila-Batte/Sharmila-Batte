package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utility.SeleniumUtility1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VTigerLead extends SeleniumUtility1 {
	@Given("^User is on Vtiger Lead login page$")
	public void loginPAge()
	{
		setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	}
	@And("user enters valid data for Vtiger Lead login as {string} and {string}")
	public void enterData(String unm,String pwd)
	{
		typeInput(driver.findElement(By.name("username")),unm);
		typeInput(driver.findElement(By.name("password")),pwd);
	}
	
	@And("^User click on login button of Vtiger Lead$")
    public void loginBtn()
    {
		clickOnElement(driver.findElement(By.xpath("//button[text()='Sign in']")));
    }
	
	@And("^User click on navigation panel$")
	public void navigationPanel()
	{   
		setSleepTime(1000);
		clickOnElement(driver.findElement(By.cssSelector(".fa-bars")));
	}
	
	@And("^User click on marketing and leads$")
	public void clickOnMArketing()
	{
		clickOnElement(driver.findElement(By.id("MARKETING_modules_dropdownMenu")));
		clickOnElement(driver.findElement(By.xpath("//span[text()=' Leads']")));
	}
	
	@When("^Add lead btn of Vtiger Lead$")
	public void addLeadBtn()
	{
		WebElement addBtn=driver.findElement(By.xpath("//button[contains(@id,'ADD_RECORD')]"));
		clickOnElement(addBtn);
	}
	
	@And("^Enter firstnm as (.+) lastnm as (.+) and click on save button$")
	public void fnmLastnmSaveBn(String fName,String lastName )
	{
		typeInput(driver.findElement(By.name("firstname")),fName);
		typeInput(driver.findElement(By.xpath("//input[contains(@id,'lastname')]")),lastName);
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
		setSleepTime(1000);
	}
	//validation of lead created
	@Then("^click on Leads link$")
	public void leadLink()
	{
		setSleepTime(1000);
		WebElement leadLink=driver.findElement(By.xpath("//a[@title='Leads']/h4"));
		clickOnElement(leadLink);
	}
	
	@And("^Search created lead$")
	public void searchCreatedLeadForValidationOfCreatedLead()
	{
		WebElement firstnmInputFieldCreate=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastnmInputFieldCreate=driver.findElement(By.xpath("//input[@name='lastname']"));
		typeInput(firstnmInputFieldCreate,"Sharmila");
		typeInput(lastnmInputFieldCreate,"Malkar");
		setSleepTime(2000);
		WebElement searchCreate=driver.findElement(By.xpath("//span[@class='s2-btn-text']"));
		clickOnElement(searchCreate);
		setSleepTime(1000);
	}
	
	@And("^verify the result of Vtiger lead$")
	public void verifyResultOfLeadCreated()
	{
		WebElement entryCreate = driver.findElement(By.xpath("//tr[@id='Leads_listView_row_1']"));
		String acutalMsg = getTextFromElement(entryCreate);
		String expectedMsg = "Sharmila";
		Assert.assertTrue(acutalMsg.contains(expectedMsg));
	}
	//VTiger lead update
	@When("^Search created lead for lead update firstnm as (.+) and lastnm as (.+)")
	public void searchFnmandLastnmForUpdate(String fnm,String lastnm)
	{
		WebElement firstName=driver.findElement(By.cssSelector(".searchRow.listViewSearchContainer input[name='firstname']"));
		WebElement lastName=driver.findElement(By.cssSelector(".searchRow.listViewSearchContainer input[name='lastname']"));
		WebElement searchBtn=driver.findElement(By.cssSelector(".btn.btn-success.btn-sm "));
		searchBtn=driver.findElement(By.cssSelector(".btn.btn-success.btn-sm "));
		typeInput(firstName,fnm);
		typeInput(lastName,lastnm);
		clickOnElement(searchBtn);
		setSleepTime(1000);
	}
	
	
	@And("^Click on firstChckbox and click on edit symbol$")
	public void ClickOnFirstChckboxClickOnEditSymbol()
	{
		WebElement chckBox=driver.findElement(By.xpath("(//input[@class='listViewEntriesCheckBox'])[1]"));
		chckBox=driver.findElement(By.xpath("(//input[@class='listViewEntriesCheckBox'])[1]"));
		clickOnElement(chckBox);
		clickOnElement(driver.findElement(By.cssSelector("#Leads_listView_massAction_LBL_EDIT")));
		setSleepTime(1000);
	}
	
	@And("^Enter compnay nm as (.+) and click on save button$")
	public void compnaNnmAndClickOnSaveButton(String compnm)
	{
		typeInput(driver.findElement(By.cssSelector(".fieldValue #Leads_editView_fieldName_company")),compnm);
		clickOnElement(driver.findElement(By.cssSelector(".btn.btn-success.saveButton")));
		setSleepTime(1000);
	}
	//Validation
	@And("^For verification of VTiger lead update enter firstnm as (.+) lastnm as (.+) and companyName as (.+) and click on search button of VTiger lead update$")
	 public void enterDataForUpdate(String firstnm,String lastnm,String compnm)
	 {
		WebElement firstnminput=driver.findElement(By.cssSelector(".searchRow.listViewSearchContainer input[name='firstname']"));
		firstnminput=driver.findElement(By.cssSelector(".searchRow.listViewSearchContainer input[name='firstname']"));
		typeInput(firstnminput,firstnm);
		setSleepTime(600);
		WebElement lastnminput=driver.findElement(By.cssSelector(".searchRow.listViewSearchContainer input[name='lastname']"));
		lastnminput=driver.findElement(By.cssSelector(".searchRow.listViewSearchContainer input[name='lastname']"));
		typeInput(lastnminput,lastnm);
		setSleepTime(600);
		WebElement compname=driver.findElement(By.cssSelector(".searchRow.listViewSearchContainer input[name='company']"));
	    compname=driver.findElement(By.cssSelector(".searchRow.listViewSearchContainer input[name='company']"));
		typeInput(compname,compnm);
		setSleepTime(1000);
		WebElement searchBtn=driver.findElement(By.cssSelector(".btn.btn-success.btn-sm "));
		searchBtn=driver.findElement(By.cssSelector(".btn.btn-success.btn-sm "));
		clickOnElement(searchBtn);
		setSleepTime(1000);
	 }
	
	@And("^verify the result of Vtiger lead update$")
	public void VerifyLeadUpdate()
	{
		WebElement rowData=driver.findElement(By.cssSelector("#Leads_listView_row_1"));
		String actualData=getTextFromElement(rowData);
		String expectedData="LNT";
		Assert.assertTrue(actualData.contains(expectedData));
	}
	
	//VTiger Lead delete
	@When("^Search created lead for lead delete firstnm as (.+) and lastnm as (.+) and compnm as (.+)$")
	public void enterDataForDelete(String fnm, String lastnm, String compnm)
	{
		WebElement firstName=driver.findElement(By.cssSelector(".searchRow input[name='firstname']"));
		WebElement lastName=driver.findElement(By.cssSelector(".searchRow input[name='lastname']"));
		WebElement searchBtn=driver.findElement(By.cssSelector(".btn.btn-success.btn-sm "));
		searchBtn=driver.findElement(By.cssSelector(".btn.btn-success.btn-sm "));
		typeInput(firstName,fnm);
		typeInput(lastName,lastnm);
		typeInput(driver.findElement(By.cssSelector(".searchRow input[name='company']")),compnm);
		clickOnElement(searchBtn);
		setSleepTime(1000);
	}
	
	@And("^Click on firstChckbox and click on delete symbol$")
	public void ClickOnFirstChckboxAndClickOnDeleteSymbol()
	{
		WebElement chckBox=driver.findElement(By.xpath("(//input[@class='listViewEntriesCheckBox'])[1]"));
		chckBox=driver.findElement(By.xpath("(//input[@class='listViewEntriesCheckBox'])[1]"));
		clickOnElement(chckBox);
		clickOnElement(driver.findElement(By.cssSelector("#Leads_listView_massAction_LBL_DELETE")));
	}
	
	@And("^Click on yes button of confirmation pop up$")
	public void confirmationPopup()
	{
		clickOnElement(driver.findElement(By.cssSelector(".modal-content .modal-footer button[data-bb-handler='confirm']")));
		setSleepTime(1000);
	}
	@Then("^Enter fnm as (.+) lastnm as (.+) compnm as (.+) for VTiger Lead delete$")
	public void enterDataForDeleteConfirmaion(String firstnm, String lastnm, String compnm)
	{
		WebElement firstnminput=driver.findElement(By.cssSelector(".searchRow input[name='firstname']"));
		firstnminput=driver.findElement(By.cssSelector(".searchRow input[name='firstname']"));
		typeInput(firstnminput,firstnm);
		WebElement lastName=driver.findElement(By.cssSelector(".searchRow input[name='lastname']"));
		lastName=driver.findElement(By.cssSelector(".searchRow input[name='lastname']"));
		typeInput(lastName,lastnm);
		WebElement compname=driver.findElement(By.cssSelector(".searchRow input[name='company']"));
		compname=driver.findElement(By.cssSelector(".searchRow input[name='company']"));
		typeInput(compname,compnm);
		setSleepTime(1000);
		WebElement searchBtn=driver.findElement(By.cssSelector(".btn.btn-success.btn-sm "));
		searchBtn=driver.findElement(By.cssSelector(".btn.btn-success.btn-sm "));
		clickOnElement(searchBtn);
		setSleepTime(1000);
	}
	@And("^Verify the result of Vtiger lead delete$")
	public void verifyDeleteLead()
	{
		setSleepTime(1000);
		WebElement recordMsg=driver.findElement(By.cssSelector(".emptyRecordsDiv .emptyRecordsContent"));
		String actualData=getTextFromElement(recordMsg);
		String expectedData="No Leads found.";
		Assert.assertTrue(actualData.contains(expectedData));
	}
	
	
	
	
}
