package webpages_OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.SeleniumUtility1;

public class OrangeHRM_HomePage extends SeleniumUtility1 {
	WebDriver driver;
    public OrangeHRM_HomePage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    }
    
    @FindBy(xpath="//span[text()='PIM']")
    WebElement PIM;
    
    @FindBy(css=".oxd-userdropdown")
    WebElement userProfileIcon;
    
    @FindBy(xpath="//a[text()='Logout']")
    WebElement logOut;
    
    public void clickOnPIM()
    {
    	clickOnElement(PIM);
    }
    
    public void clickOnLogOut()
    {
    	clickOnElement(userProfileIcon);
    	clickOnElement(logOut);
    	
    }

}
