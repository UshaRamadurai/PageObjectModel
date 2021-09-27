package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
public ViewLeadPage(ChromeDriver driver) {
	this.driver=driver;
		
	}

	public void verifyFirstName() {
		String text = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		Assert.assertEquals("View Lead", text);
			}
	
	public EditLeadPage clickEdit() {
		driver.findElement(By.xpath("//a[contains (@href, 'updateLeadForm?partyId')]")).click();
		return new EditLeadPage(driver);
	}
}
