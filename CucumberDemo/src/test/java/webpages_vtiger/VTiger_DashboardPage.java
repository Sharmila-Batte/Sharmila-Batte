package webpages_vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.SeleniumUtility1;

public class VTiger_DashboardPage extends SeleniumUtility1 {
	WebDriver driver;
	public VTiger_DashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[@class='fa fa-user']")
	WebElement userProfile;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	WebElement signOut;
	
	@FindBy(xpath="//span[@class='app-icon fa fa-bars']")
	WebElement navigationPanel;
	
	@FindBy(id="MARKETING_modules_dropdownMenu")
	WebElement marketing;
	
	@FindBy(xpath="//span[text()=' Leads']")
	WebElement clickLeads;
	
	public void signOut()
	{
		clickOnElement(userProfile); 
		clickOnElement(signOut); 
	}
	public void leads() throws InterruptedException
	{
		clickOnElement(navigationPanel);
	
		clickOnElement(marketing);
		clickOnElement(clickLeads);
	}
	

	

	
}
