package com.abc.core;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PDriver {
	WebDriver driver = null;
		
	public WebDriver createDriver() throws IOException, InterruptedException {
	
		ReadProperty configProperty = new ReadProperty("config");
		ReadProperty envProperty = new ReadProperty("env");
		
		String browserName = null;
		String browser = System.getProperty("browser");
		
		if (browser != null) {
			browserName = browser;
		} else {
			browserName = configProperty.getKeyValue("browser");
		}
		
		System.out.println(browserName);
		
		if (browserName.equalsIgnoreCase("EDGE")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\driver\\EDG\\msedgedriver.exe");
			driver = new EdgeDriver();
			Thread.sleep(5000);
		} 
		else  if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chrome\\chromedriver.exe");
			driver = new ChromeDriver(); 
		
		} 
		else {
		
		}
		Thread.sleep(5000);
		setDimension();
		
		
		String URLName = null;
		String AA = System.getProperty("website");
		System.out.println(AA);
		
		if (AA != null) {
			URLName = AA;
		} else {
			URLName = envProperty.getKeyValue("QA");
		}
		if (URLName.equalsIgnoreCase("google")) {
			driver.get("https://www.google.com/");
		}
		 if (URLName.equalsIgnoreCase("yahoo")) {
			driver.get("https://www.yahoo.com/");
		} else {
			//String testEnv = configProperty.getKeyValue("env");
			//String testUrl = envProperty.getKeyValue(testEnv);
			
			driver.get(URLName);
			//driver.get(testUrl);
		 
		
		}
	 return driver;
}
	
	public void setDimension() throws IOException {
		
		ReadProperty configProperty = new ReadProperty("config");
//		String deviceValue = configProperty.getKeyValue("device");
		
		ReadProperty deviceProperty = new ReadProperty("device");

		//===============This part is for maven	(below)	
		String deviceValue = null;
		String device = System.getProperty("device");
		
		if (device != null) {
			deviceValue = device;
		} else {
			deviceValue = configProperty.getKeyValue("device");
		}
		
		System.out.println(deviceValue);

		if (deviceValue.equalsIgnoreCase("deviceValue")) {
			String d = deviceProperty.getKeyValue(deviceValue);
			System.out.println();
			String xy[] = d.split("X");
			
			int x = new Integer(xy[0]);
			int y = new Integer(xy[1]);
			
			System.out.println(x+"-"+y);
			
			driver.manage().window().setSize(new Dimension(x,y));	
		}		
//===============This part is for maven	(above)

		else if (!deviceValue.equalsIgnoreCase("")) {
			String d = deviceProperty.getKeyValue(deviceValue);
			System.out.println();
			String xy[] = d.split("X");
			
			int x = new Integer(xy[0]);
			int y = new Integer(xy[1]);
			
			System.out.println(x+"-"+y);
			
			driver.manage().window().setSize(new Dimension(x,y));	
			
		}	
	}
	
	
}
