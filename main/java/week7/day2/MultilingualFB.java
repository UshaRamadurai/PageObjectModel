package week7.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClassFB;

public class MultilingualFB extends BaseClassFB {
	

	@Test
	public void facebook() {
		
	driver.get(prop.getProperty("url"));
	
	driver.findElement(By.id("email")).sendKeys("Adhiya@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Tatwamashi");

	driver.findElement(By.linkText(prop.getProperty("linktext"))).click();
			}
}
