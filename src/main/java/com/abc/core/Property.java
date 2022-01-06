package com.abc.core;
	
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Property {

	
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		File file = new File(System.getProperty("user.dir")+"/src/main/resources/config/config.properties");
		FileInputStream fis = new FileInputStream(file);
		
		Properties prop =new Properties();
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		
		System.out.println(browser);
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chrome\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");

		}
		
		else if (browser.equalsIgnoreCase("EDGE")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\driver\\EDG\\msedgedriver.exe");

			driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
		}
			
		else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\driver\\IE\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
			driver.get("https://www.facebook.com/");

		}

}

}
