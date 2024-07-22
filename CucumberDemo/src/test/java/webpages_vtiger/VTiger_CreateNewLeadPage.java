package webpages_vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.SeleniumUtility1;

public class VTiger_CreateNewLeadPage extends SeleniumUtility1{
	WebDriver driver;
	public VTiger_CreateNewLeadPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="firstname")
	WebElement firstNameField;
	
	@FindBy(xpath="//input[contains(@id,'lastname')]")
	WebElement lastNameField;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement save;
	
	public void createLead(String fName,String lasName)
	{
		typeInput(firstNameField,fName);
		typeInput(lastNameField,lasName);
		clickOnElement(save);
	}

}
