package webpages_orangrhrm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.SeleniumUtility1;

public class PersonalDetailsPage extends SeleniumUtility1 {

	public PersonalDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    
	// Job Link
	@FindBy(xpath = "//a[text()='Job']")
	private WebElement jobTab;
	
	// Job Title Dropdown
	@FindBy(css=".oxd-select-text-input")
	private WebElement jobDropDown;
	
	//save job title
	@FindBy(xpath="//button[@type='submit']")
	private WebElement save;
	
	
	


	// Job Title Dropdown Elements
	

	
	
	// Function: Update PIM
	public void selectJobEmployee() throws InterruptedException {
		clickOnElement(jobTab);
		Thread.sleep(3000);
		clickOnElement(jobDropDown);
		Thread.sleep(1000);
		jobDropDown.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		clickOnElement(save);
		Thread.sleep(1000);
		
		
		
	}
	}
		

