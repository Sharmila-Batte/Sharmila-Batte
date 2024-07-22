package stepdef;

import org.openqa.selenium.WebDriver;

import com.utility.SeleniumUtility1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import webpages_vtiger.VTiger_CreateNewLeadPage;
import webpages_vtiger.VTiger_DashboardPage;
import webpages_vtiger.VTiger_EditLeadPage;
import webpages_vtiger.VTiger_LeadPage;
import webpages_vtiger.VTiger_Login;

public class VTigerLeadPOMTest  extends SeleniumUtility1{
	WebDriver driver; 
	VTiger_Login getVTiger_Login;
	VTiger_LeadPage getVTiger_LeadPage;
	VTiger_EditLeadPage getVTiger_EditLeadPage;
	VTiger_DashboardPage getVTiger_DashboardPage;
	VTiger_CreateNewLeadPage getVTiger_CreateNewLeadPage;
	@Given("^user already in login page of vtiger lead for POM$")
	public void loginPage() {
		   driver= setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		getVTiger_Login=new VTiger_Login(driver);
		getVTiger_LeadPage=new VTiger_LeadPage(driver);
		getVTiger_EditLeadPage=new VTiger_EditLeadPage(driver);
		getVTiger_DashboardPage=new VTiger_DashboardPage(driver);
		getVTiger_CreateNewLeadPage=new VTiger_CreateNewLeadPage(driver);
	}
	@And("^user login successfully with valid data of vtiger lead for POM$")
	public void login()
	{
		getVTiger_Login.signInToVtiger("admin", "admin");
	}

}
