package academy;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.abc.core.ReadProperty;


public class K {

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
		Thread.sleep(5000);
		if (!property.getKeyValue("device").equalsIgnoreCase("")) {
			
			if(property.getKeyValue("device").equalsIgnoreCase("iPhoneX")) {
				setDimension("iPhoneX");
			} else if (property.getKeyValue("device").equalsIgnoreCase("iPhone13Pro")) {
				setDimension("iPhone13Pro");
			} 
			else if (property.getKeyValue("device").equalsIgnoreCase("iPhone13ProMax")) {
				setDimension("iPhone13ProMax");
			}
		}
	
		driver.get("https://www.yahoo.com");			
	}
	

	public void setDimension(String device) throws IOException {
		ReadProperty deviceProperty = new ReadProperty("device");
		String d = deviceProperty.getKeyValue(device);
		String xy[] = d.split("X");
		
		int x = new Integer(xy[0]);
		int y = new Integer(xy[1]);
		
		System.out.println(x+"-"+y);
		
		driver.manage().window().setSize(new Dimension(x,y));		
	}
}
