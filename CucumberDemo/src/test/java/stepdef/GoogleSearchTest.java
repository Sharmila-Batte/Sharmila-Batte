package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utility.SeleniumUtility1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchTest extends SeleniumUtility1{
	WebElement search;
	@Given("^user already opened Web browser and having google search page opened$")
	public void googlePage()
	{
		setUp("chrome","https://www.google.com/");
	}
	
	@When("^user search text as (.+) on google$")
	public void searchText(String text)
	{
	    search=driver.findElement(By.xpath("//textarea[@aria-label='Search']"));
		typeInput(driver.findElement(By.xpath("//textarea[@aria-label='Search']")),text);
	
	}
	
	@And("^user clicks on enter$")
	public void clickOnEnter()
	{
		search.sendKeys(Keys.ENTER);
		
	}
	
	@Then("^user should navigate to google home page having title as (.+)$")
	public void validate(String expectedTitle)
	{
		String actualTitle=getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@And("^close the browser$")
	public void closeBrowser() 
	{
		driver.close();
	}

}
