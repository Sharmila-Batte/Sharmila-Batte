package webpages_OrangeHRM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.SeleniumUtility1;

public class PersonalDetailsPage extends SeleniumUtility1 {
	WebDriver driver;

	public PersonalDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Job Link
	@FindBy(xpath = "//a[text()='Job']")
	private WebElement jobTab;

	// Job Title Dropdown
	@FindBy(css = ".oxd-select-text-input")
	private WebElement jobDropDown;

	// save job title
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save;
	
	//Function
	public void selectJobEmployee()
	{
		clickOnElement(jobTab);
		setSleepTime(3000);
		clickOnElement(jobDropDown);
		setSleepTime(1000);
		jobDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		setSleepTime(1000);
		clickOnElement(save);
		setSleepTime(1000);
		
	}
		
}
