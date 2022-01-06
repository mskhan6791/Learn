package academy;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsM {

	ChromeDriver driver;
	
	@BeforeClass
	public void b() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	}
	
	@Test
	public void k() {
		driver.findElement(By.name("q")).sendKeys("US");
	}
	
	@Test(dependsOnMethods = "k")
	public void k1() throws InterruptedException {
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test (dependsOnMethods = "k1")
	public void k2() throws InterruptedException {
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div//*[text()='Translate']")).click();
	}
	
}
