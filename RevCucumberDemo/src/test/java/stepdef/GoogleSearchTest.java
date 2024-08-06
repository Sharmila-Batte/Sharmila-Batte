package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.utility.SeleniumUtility1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchTest extends SeleniumUtility1{
	 @Given("^User already opened web browser and having google search page opened$")
	 public void opengoogle()
	 {
		 setUp("chrome","https://www.google.com/");
	 }
	 @When("^User search text as (.+) on google$")
	 public void searchext(String text)
	 {
		 typeInput(driver.findElement(By.xpath("//textarea[@name='q']")),text);
	 }
	 
	 @And("^user click on enter$")
	 public void clickOnEnter()
	 {
		 driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
	 }
	 @Then("^User should navigate to google home page having title (.+)$")
	 public void homePage(String expectedTitle)
	 {
		 setSleepTime(1000);
		 String actualTitle=getCurrentTitleOfApplication();
		 Assert.assertEquals(actualTitle, expectedTitle);
	 }
	 
	 @And("^close the browser$")
	 public void closeBrowser()
	 {
		 driver.close();
	 }

}
