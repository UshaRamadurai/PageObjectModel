package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
public LoginPage(ChromeDriver driver) {
	this.driver=driver;
	}
	
	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		return this;
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		return this;
	}
	
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}
	
}
