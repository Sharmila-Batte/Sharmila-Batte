package webpages_vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.SeleniumUtility1;

public class VTiger_Login extends SeleniumUtility1{
	WebDriver driver;
	public VTiger_Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	 private WebElement usernameField;

	@FindBy(name="password")
	 private WebElement passwordField;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signIn;
	
	

	public WebElement getUsernameField() {
		return usernameField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public void signInToVtiger(String userName,String password)
	{
		typeInput(usernameField,userName);
		typeInput(passwordField,password);
		clickOnElement(signIn);
	}
}
