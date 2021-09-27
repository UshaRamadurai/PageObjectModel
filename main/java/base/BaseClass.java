package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class BaseClass {

	public ChromeDriver driver;
	public String fileName;
	public static Properties prop;
	public static String leadID;
	public List<String> allhandles;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName, testDescription,testAuthor, testCategory;
	
	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(fileName);
	}

	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
	
	/*
	 * @BeforeClass public void setupTestCaseDetails() { test =
	 * extent.createTest(testName,testDescription);
	 * test.assignCategory(testCategory); test.assignAuthor(testAuthor); }
	 */
	@BeforeMethod
	public void preCondition() throws IOException {

		FileInputStream fileIp = new FileInputStream("./src/main/resources/config.properties");
		prop = new Properties();
		prop.load(fileIp); 
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
			}

	@AfterMethod
	public void close() {
		 driver.close();
	}

}
