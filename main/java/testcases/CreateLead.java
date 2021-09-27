package testcases;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass{
	@BeforeTest
	public void setFileName() {
		/*
		 * testName="CreateLead"; testDescription =
		 * "Create lead from leaptaps application"; testAuthor = "Usha";
		 * testCategory="Smoke";
		 */
		fileName = "Sheet1";
		}
	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String fname, String lname, String comName) throws IOException {
			
		LoginPage lp = new LoginPage(driver);
		
	  lp.enterUsername()
		.enterPassword()
		.clickLoginButton().clickCRMSFA()
		.clickLeadsTab().clickCreateLeadTab().enterFirstName(fname).enterCompanyName(comName).enterLastName(lname)
		.clickCreateLeadButton().verifyFirstName();
	}

}
