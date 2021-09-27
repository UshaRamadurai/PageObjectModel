package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class EditLead extends BaseClass{
	
	@BeforeTest
	public void setFileName() {
		fileName = "Sheet3";
		}
	
	@Test(dataProvider = "sendData")
	public void runEditLead(String fname, String comName) throws IOException, InterruptedException {
			
		LoginPage lp = new LoginPage(driver);
		
	  lp.enterUsername()
		.enterPassword()
		.clickLoginButton().clickCRMSFA()
		.clickLeadsTab().clickFindLeadsTab().enterFirstName(fname)
		.clickFindLeads().clickFirstResultingLead()
		.clickEdit()
		.editCompanyName(comName).clickUpdate().verifyEditLead();
	}


}
