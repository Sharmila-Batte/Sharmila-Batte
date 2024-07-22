package webpages_orangrhrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.SeleniumUtility1;

public class OrangeHRM_LoginPage extends SeleniumUtility1{
	WebDriver driver;
	public OrangeHRM_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement usernameInputfield;
	
	@FindBy(name="password")
	private WebElement passwordInputfield;

	@FindBy(css=".orangehrm-login-button")
	private WebElement loginButton;
	

	public WebElement usernameInputfield() {
		return usernameInputfield;
	}

	public WebElement getPasswordInputfield() {
		return passwordInputfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginIntoApplication(String username,String password)
	{
		typeInput(usernameInputfield,username);
		typeInput(passwordInputfield,password);
		clickOnElement(loginButton);
	}

}
