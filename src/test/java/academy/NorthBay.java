package academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NorthBay {

	WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		
	}
	
	@Test (dataProvider ="array")
	public void k(String userName, String password) throws InterruptedException {
			
		driver.get("https://www.northbaycadillac.com/");	
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userName);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys(" ");
	}
	
	@DataProvider (name ="array")
	public Object [][] d() {
		Object [][] obj = new String [4][2];
		
		obj [0][0] = "Test1@gmail.com";
		obj [0][1] = "password1";
		
		obj [1][0] = "Test2@gmail.com";
		obj [1][1] = "password2";

		obj [2][0] = "Test3@gmail.com";
		obj [2][1] = "password3";
		
		obj [3][0] = "Test4@gmail.com";
		obj [3][1] = "password4";

		return obj;
	}
	
	
	@AfterClass
	void close() {
	driver.close();

}	
	
}
