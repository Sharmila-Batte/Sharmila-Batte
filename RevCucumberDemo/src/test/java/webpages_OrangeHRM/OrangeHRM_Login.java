package webpages_OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.SeleniumUtility1;

public class OrangeHRM_Login extends SeleniumUtility1{
	WebDriver driver;
	public OrangeHRM_Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username")
	private WebElement userNameInputField;
	
	@FindBy(name="password")
	private WebElement passwordInputField;
	
	@FindBy(css=".orangehrm-login-button")
	private WebElement login;
	
	public WebElement getUserNameInputField() {
		return userNameInputField;
	}

	public WebElement getPasswordInputField() {
		return passwordInputField;
	}

	public WebElement getLogin() {
		return login;
	}

	public void logintoApplication(String username,String password)
	{
		typeInput(userNameInputField,username);
		typeInput(passwordInputField,password);
		clickOnElement(login);
	}
	
	

}
