package academy;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeDep {

	WebDriver driver;

	@BeforeClass
	public void hd() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver/chrome/chromedriver.exe");
		driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
	}
	
	@Test (dataProvider = "array")
	public void hd1 (String email, String password, String zip, String tel) throws InterruptedException {
	
	driver.get("https:\\homedepot.com");
	
	Thread.sleep(3000);
		
	driver.findElement(By.xpath("//div[@class='MyAccount__label SimpleFlyout__link--bold']")).click(); 
	
	Thread.sleep(3000);
		
	driver.findElement(By.xpath("//*[text()=' Sign in ']")).click();

	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='Create an Account']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[text()='Select & Continue']")).click();

	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='zipcode']")).sendKeys(zip);

	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(tel);

	
	Thread.sleep(3000);
	}
	
	@DataProvider (name = "array") 
	public Object [][] p() {
		Object [][] obj = new String [2][4];
		
		obj [0][0] = "Test1@gmail.com";
		obj [0][1] = "password10";
		obj [0][2] = "11105";
		obj [0][3] = "64630940";
		
		obj [1][0] = "Test2@gmail.com";
		obj [1][1] = "password20";
		obj [1][2] = "11105";
		obj [1][3] = "64630943";
	
	return obj;
	}	
	
		
}
