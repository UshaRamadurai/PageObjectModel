package week7.day2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class RunProperties {
	
	@Test
	public void runPropertyFile() throws IOException {
		FileInputStream fileIp = new FileInputStream("./src/main/resources/config.properties");
		Properties prop = new Properties();
		prop.load(fileIp);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		FileOutputStream fileOp = new FileOutputStream("./src/main/resources/config.properties");
		prop.store(fileOp, "Saving file");
		
		
	}

}
