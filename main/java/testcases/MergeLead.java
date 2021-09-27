package testcases;

import java.io.IOException;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class MergeLead extends BaseClass{
	
	
	@Test
	public void runMergeLead() throws IOException, InterruptedException {
			
		LoginPage lp = new LoginPage(driver);
		
	  lp.enterUsername()
		.enterPassword()
		.clickLoginButton().clickCRMSFA()
		.clickLeadsTab().clickMergeLeadsTab().ClickFromLeadWidget()
		.enterFirstNameNewWnd("test").clickFindLeads().clickFromFirstResultingLead().ClickToLeadWidget()
		.enterFirstNameNewWnd("usha").clickFindLeads().clickToFirstResultingLead().ClickMerge()
		.clickFindLeadsTab().enterLeadId().clickFindLeads().verifyLeadID();
	}

}
