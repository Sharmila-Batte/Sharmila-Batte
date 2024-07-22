package webpages_orangrhrm;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.SeleniumUtility1;

public class PimHomePage extends SeleniumUtility1 {

	public PimHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css ="div[class*='oxd-toast-content']>p:nth-of-type(2)")
	private WebElement updateMsg;
    
	@FindBy(css =".oxd-form-row .oxd-grid-4.orangehrm-full-width-grid>div:nth-of-type(6) div>*:nth-of-type(2)>div>div>div[class='oxd-select-text-input']")
	private WebElement jobTitle;


	@FindBy(css = ".orangehrm-header-container>button")
	private WebElement addButton;

	@FindBy(xpath = "//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement employeeIdInputField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchButtonOnPimPage;

	@FindBy(css = ".orangehrm-vertical-padding>span")
	private WebElement searchResultCountMsg;

	@FindBy(css = ".oxd-table-body>div:nth-child(1) label")
	private WebElement firstEmpCheckBox;

	@FindBy(xpath = "//div[@class='oxd-table-cell-actions']/button[2]")
	private WebElement firstEmpEditSymbol;
	//@FindBy(css = ".oxd-table-body>div:nth-child(1) .bi-pencil-fill")
	//private WebElement firstEmpEditSymbol;

	@FindBy(css = ".oxd-table-body>div:nth-child(1) .bi-trash")
	private WebElement firstEmpDeleteSymbol;

	@FindBy(css = ".orangehrm-modal-footer>button:nth-of-type(2)")
	private WebElement yesButtonOnConfirmationPopup;

	// Function: clickOn Add button
	public void clickOnAddButton() {
		clickOnElement(addButton);
	}

	// Function: search employee
	public void searchCreatedEmployee(int employeeId) {
		typeInput(employeeIdInputField, String.valueOf(employeeId));
		setSleepTime(2000);
		clickOnElement(searchButtonOnPimPage);
		setSleepTime(2000);
	}
	public void searchCreatedEmployeeIdTitle(int employeeId,String jobtitle) throws InterruptedException {
		typeInput(employeeIdInputField, String.valueOf(employeeId));
		setSleepTime(2000);
		clickOnElement(jobTitle);
		Thread.sleep(1000);
		jobTitle.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		clickOnElement(searchButtonOnPimPage);
		Thread.sleep(1000);
		
	}
	// Function: getSearchResultMsg
	public String getSearchResultMsg() {
		isElementExist(searchResultCountMsg);
		setSleepTime(2000);
		return getTextFromElement(searchResultCountMsg);
	}

	// Function: deleteCreatedEmployee
	public void deleteCreatedEmployee() {
		clickOnElement(firstEmpCheckBox);
		clickOnElement(firstEmpDeleteSymbol);
		clickOnElement(yesButtonOnConfirmationPopup);
	}

	public String getSuccessUpdatedMsg() {
		return getTextFromElement(updateMsg);
		
	}
	
	// Function: clickOnEditSymbolOfCreatedEmployee
	public void editCreatedEmployee() throws InterruptedException {
		clickOnElement(firstEmpCheckBox);
		clickOnElement(firstEmpEditSymbol);
		Thread.sleep(1000);
	}
	
	}
