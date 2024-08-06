package webpages_OrangeHRM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.SeleniumUtility1;

public class PimHomePage extends SeleniumUtility1 {
	WebDriver driver;
	public PimHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css=".orangehrm-header-container>button")
	private WebElement addButton;
	
	@FindBy(xpath="//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement employeeIdInputField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchBtnPimPage;
	
	@FindBy(css=".oxd-form-row .oxd-grid-4.orangehrm-full-width-grid>div:nth-of-type(6) div>*:nth-of-type(2)>div>div>div[class='oxd-select-text-input']")
	private WebElement jobTitle;
	
	@FindBy(css=".orangehrm-vertical-padding>span")
	private WebElement searchResultCountMsg;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) label")
	private WebElement firstEmpCheckBox;
	@FindBy(css=".oxd-table-body>div:nth-child(1) label")
	private WebElement firstEmpCheckBoxNew;
	
	@FindBy(xpath="//div[@class='oxd-table-cell-actions']/button[1]")
	private WebElement firstEmpEditSymbol;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) .bi-trash")
	private WebElement firstEmpDeleteSymbol;
	
	@FindBy(css=".orangehrm-modal-footer>button:nth-of-type(2)")
	private WebElement yesButtonOnConfirmationPopup;

	
	//Function add
	public void addBtn()
	{
		clickOnElement(addButton);
	}
	
	public void searchcreatedEmp(int employeeId)
	{
		typeInput(employeeIdInputField,String.valueOf(employeeId));
		setSleepTime(2000);
		clickOnElement(searchBtnPimPage);
		setSleepTime(2000);
	}
	
	public String getSearchResultMsg()
	{
		isElementExist(searchResultCountMsg);
		setSleepTime(2000);
		return getTextFromElement(searchResultCountMsg);
	}
	
	public void editCreatedEmployee()
	{
		clickOnElement(firstEmpCheckBoxNew);
		clickOnElement(firstEmpEditSymbol);
		setSleepTime(2000);
	}
	
	public void searchCreatedEmployeeIdTitle(int employeeId,String jobtitle)
	{
		typeInput(employeeIdInputField,String.valueOf(employeeId));
		setSleepTime(2000);
		clickOnElement(jobTitle);
		setSleepTime(1000);
		jobTitle.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		setSleepTime(1000);
		clickOnElement(searchBtnPimPage);
		setSleepTime(1000);
	}
	public void deleteCreatedEmployee()
	{
		clickOnElement(firstEmpCheckBox);
		clickOnElement(firstEmpDeleteSymbol);
		clickOnElement(yesButtonOnConfirmationPopup);
	}
	

}
