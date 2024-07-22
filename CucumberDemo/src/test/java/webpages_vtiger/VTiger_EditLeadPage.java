package webpages_vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.SeleniumUtility1;

public class VTiger_EditLeadPage extends SeleniumUtility1 {
	WebDriver driver;
	public VTiger_EditLeadPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Leads_editView_fieldName_company")
	WebElement CompanyNameField;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveEdit;
	
	public void compEdit(String compName) throws InterruptedException
	{
		typeInput(CompanyNameField,compName);
		clickOnElement(saveEdit);
		Thread.sleep(1000);
	}

}
