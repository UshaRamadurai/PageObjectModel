package pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MergeLeadsPage extends BaseClass {
	
public MergeLeadsPage(ChromeDriver driver) {
	this.driver=driver;	
	}
	
	public FindLeadsPage ClickFromLeadWidget() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> allWindows = driver.getWindowHandles();
	    allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadsPage(driver);
	}
	
		public FindLeadsPage ClickToLeadWidget() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows = driver.getWindowHandles();
	    allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadsPage(driver);
	}
	
	public MyLeadsPage ClickMerge() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return new MyLeadsPage(driver);
	}
}
