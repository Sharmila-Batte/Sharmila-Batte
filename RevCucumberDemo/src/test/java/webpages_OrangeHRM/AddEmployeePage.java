package webpages_OrangeHRM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.SeleniumUtility1;

public class AddEmployeePage extends SeleniumUtility1{
	WebDriver driver;
	public AddEmployeePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="firstName")
	private WebElement firstNameInputField;
	
	@FindBy(name="lastName")
	private WebElement lastNameInputField;
	
	@FindBy(xpath="//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement epmloyeeIdInputField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveButtonOnAddEmployeePage;
	
	
	//Function :
	public void createEmployee(String fnm,String lastnm,int empId)
	{
		typeInput(firstNameInputField, fnm);
		typeInput(lastNameInputField,lastnm);
		setSleepTime(2000);
		epmloyeeIdInputField.sendKeys(Keys.chord(Keys.CONTROL,"a"),String.valueOf(empId));
		//typeInput(epmloyeeIdInputField,String.valueOf(empId));
		setSleepTime(2000);
		clickOnElement(saveButtonOnAddEmployeePage);
		setSleepTime(2000);
	}
	 
	

}
