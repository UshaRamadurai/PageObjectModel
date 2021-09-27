package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassFB {

	public static ChromeDriver driver;
	public Properties prop;
	
	@Parameters ("language")
	@BeforeMethod
	public void precondition(String lang) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		FileInputStream fileIp = new FileInputStream("./src/main/resources/"+lang+".properties");
		prop = new Properties();
		prop.load(fileIp);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
