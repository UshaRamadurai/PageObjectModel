package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
		
	public CreateLeadPage enterCompanyName(String coName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(coName);	
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLeadPage(driver);
	}
	
	
	
}
