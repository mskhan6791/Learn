package academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokAndThreadP {

	@Test (invocationCount = 5, threadPoolSize = 2)
	public void k() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
}
