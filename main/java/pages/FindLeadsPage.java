package pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class FindLeadsPage extends BaseClass {
public FindLeadsPage(ChromeDriver driver) {
	this.driver=driver;	
	}

	public FindLeadsPage enterFirstName(String fname) {
		driver.findElement(By.xpath("(//input[@name ='firstName'])[3]")).sendKeys(fname);
		return this;
	}

	public FindLeadsPage clickFindLeads() throws InterruptedException {
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(3000);
		return this;
	}

	public FindLeadsPage enterFirstNameNewWnd(String fname) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		return this;
	}

	public MergeLeadsPage clickFromFirstResultingLead() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')])[1]/a")).click();
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
		return new MergeLeadsPage(driver);
	}

	public MergeLeadsPage clickToFirstResultingLead() {
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')])[1]/a")).click();
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
		return new MergeLeadsPage(driver);
	}

	public ViewLeadPage clickFirstResultingLead() {
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')])[1]/a")).click();
		return new ViewLeadPage(driver);
	}

	public FindLeadsPage enterLeadId() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}

	public void verifyLeadID() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		Assert.assertEquals("No records to display", text);
		System.out.println("Test Pass!! No records to display");
			
	}
}
