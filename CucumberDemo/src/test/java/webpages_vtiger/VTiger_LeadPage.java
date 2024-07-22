package webpages_vtiger;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.SeleniumUtility1;

public class VTiger_LeadPage extends SeleniumUtility1 {
	WebDriver driver;
	public VTiger_LeadPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[contains(@id,'ADD_RECORD')]")
	WebElement addLeadBtn;
	
	@FindBy(css=".listViewRecordActions>div>span>input")
	List<WebElement> checkBox;
	
	@FindBy(xpath="//h4[text()=' Leads ']")
	WebElement leadLink;
	
	@FindBy(xpath="//button[@id='Leads_listView_massAction_LBL_EDIT']")
	WebElement editSymbol;

	@FindBy(xpath="//button[contains(@id,'LBL_DELETE')]")
	WebElement deleteSymbol;
	
	@FindBy(xpath="//button[text()='Yes']")
	WebElement yesBtn;
	
	public void addLeadBtn ()
	{
		clickOnElement(addLeadBtn);
	}
	
	public void leadLink()
	{
		clickOnElement(leadLink);
	}
	public void leadEdit() throws InterruptedException
	{
		checkBox.get(0).click();
		Thread.sleep(1000);
		clickOnElement(editSymbol);
	}
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstnmInputFieldCreate;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastnmInputFieldCreate;
	
	@FindBy(xpath="//span[@class='s2-btn-text']")
	WebElement searchCreate;
	
	public void searchCreatedEntry(String fnm,String lastnm) throws InterruptedException
	{
		typeInput(firstnmInputFieldCreate,fnm);
		typeInput(lastnmInputFieldCreate,lastnm);
		setSleepTime(2000);
		clickOnElement(searchCreate);
		Thread.sleep(1000);
		
	}
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstnmInputFieldUpdate;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastnmInputFieldUpdate;
	
	@FindBy(xpath="//input[@name='company']")
	WebElement companyNameInputField;
	
	@FindBy(xpath="//span[@class='s2-btn-text']")
	WebElement searchUpdate;
	
	public void searchUpdatedEntry(String fname,String lastname,String companyName) throws InterruptedException
	{
		typeInput(firstnmInputFieldUpdate,fname);
		typeInput(lastnmInputFieldUpdate,lastname);
		typeInput(companyNameInputField,companyName);
		setSleepTime(2000);
		clickOnElement(searchUpdate);
		Thread.sleep(1000);
	}
	public void leadDelete()
	{
		checkBox.get(0).click();
		clickOnElement(deleteSymbol);
		clickOnElement(yesBtn);
	}
	
	@FindBy(xpath="//tr[@id='Leads_listView_row_1']")
	WebElement entryCreate;
	
	public String getSearchResultRowCreate() {
		isElementExist(entryCreate);
		setSleepTime(2000);
		return getTextFromElement(entryCreate);
	}
	@FindBy(xpath="//tr[@id='Leads_listView_row_1']")
	WebElement entryUpdate;
	
	public String getSearchResultRowUpdate() {
		isElementExist(entryUpdate);
		setSleepTime(2000);
		return getTextFromElement(entryUpdate);
	}
}
