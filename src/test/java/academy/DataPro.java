package academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://www.pch.com/");	
		
		driver.findElement(By.xpath("//a[@class='uninav__sign-in uninav__button link-button']")).click();
		Thread.sleep(3000);
	}
	
	@Test (dataProvider ="array")
	public void k(String userName, String password) throws InterruptedException {
			
		driver.findElement(By.xpath("//input[@name='EM']")).sendKeys(userName);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='PW']")).sendKeys(password);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='EM']")).clear();
		driver.findElement(By.xpath("//input[@name='PW']")).clear();
		
	//	driver.close();
	}
	
	@DataProvider (name ="array")
	public Object [][] d() {
		Object [][] obj = new String [4][2];
		
		obj [0][0] = "test1";
		obj [0][1] = "password1";
		
		obj [1][0] = "test2";
		obj [1][1] = "password2";

		obj [2][0] = "test3";
		obj [2][1] = "password3";
		
		obj [3][0] = "test4";
		obj [3][1] = "password4";
		return obj;
	}
	
	
//	@AfterClass
//	void close()
//	{
//	driver.close();
//
//}
}
