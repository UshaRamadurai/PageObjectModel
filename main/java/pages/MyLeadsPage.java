package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass{
public MyLeadsPage(ChromeDriver driver) {
	this.driver=driver;	
	}
	
	public CreateLeadPage clickCreateLeadTab() {
		driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();
		return new CreateLeadPage(driver);
	}
	
	public FindLeadsPage clickFindLeadsTab() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}

	public MergeLeadsPage clickMergeLeadsTab() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage(driver);
	}
}
