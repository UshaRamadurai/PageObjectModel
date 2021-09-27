package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class EditLeadPage extends BaseClass {
public EditLeadPage(ChromeDriver driver) {
	this.driver=driver;
	}

	public EditLeadPage editCompanyName(String comName) {
		WebElement coName = driver.findElement(By.id("updateLeadForm_companyName"));
		coName.clear();
		coName.sendKeys(comName);
		return this;
	}

	public EditLeadPage clickUpdate() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		return this;
	}

	public void verifyEditLead() {
		boolean displayed = driver.findElement(By.xpath("//span[contains(text(),'Feathers')]")).isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("TEst pass!! Updation successful");
		}
}
