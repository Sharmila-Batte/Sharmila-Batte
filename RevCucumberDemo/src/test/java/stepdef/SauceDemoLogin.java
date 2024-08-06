package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.utility.SeleniumUtility1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoLogin extends SeleniumUtility1 {
	@Given("^User is already in login page of SauceDemo$")
	public void loginPage()
	{
		setUp("chrome","https://www.saucedemo.com/");
	}
	
	@When("^User enters username as(.+)$")
	public void username(String usernm)
	{
		typeInput(driver.findElement(By.id("user-name")),usernm);
	}
	
	@And("^User enters password as(.+)$")
	public void password(String password)
	{
		typeInput(driver.findElement(By.id("password")),password);
	}
	
	@And("^user clicks on login button of sauce demo$")
	public void clickOnLoginBtn()
	{
		clickOnElement(driver.findElement(By.id("login-button")));
	}
	
	@Then("^User should navigate to home page of SauceDemo with URL as(.+)$")
	public void validateLogin(String expectedUrl)
	{
		String actualURL=driver.getCurrentUrl();
		Assert.assertTrue(actualURL.contains(expectedUrl));
	}
	
	@And("^User close the browser$")
	public void closeBrowser()
	{
		driver.close();
	}


}
