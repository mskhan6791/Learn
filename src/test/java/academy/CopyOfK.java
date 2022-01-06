package academy;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.abc.core.Exel;
import com.abc.core.ReadProperty;

public class CopyOfK {

WebDriver driver = null;
	
	@Test
	public void k () throws IOException, InterruptedException {
		ReadProperty property = new ReadProperty("config");
		
		String browserName = property.getKeyValue("browser");
		
		System.out.println(browserName);
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chrome\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}else if (browserName.equalsIgnoreCase("EDGE")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\driver\\EDG\\\\msedgedriver.exe");
		} else {
			
		}
		
		driver.close();
				
	}
	
	@Test (dataProvider = "data")
	public void k1 (String userName, String password) throws InterruptedException {
		System.out.println(userName+" "+password);
		Thread.sleep(2000);
	}
	
		
	@DataProvider (name = "data") 
	public Object [][] d () throws InvalidFormatException, IOException{
		Exel exel = new Exel ("Data");
		return exel.getDataFordataProvider("A");
			
		
	}
	
}


