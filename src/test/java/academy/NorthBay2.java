package academy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NorthBay2 {

	
WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.northbaycadillac.com/");	
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		Thread.sleep(2000);			
	}
	
	@Test (dataProvider ="array")
	public void k(String userName, String password) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userName);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).clear();
	}
	
	@DataProvider (name ="array")
	public String [][] d() throws InvalidFormatException, IOException  {

		File file= new File(System.getProperty("user.dir")+"/src/test/resources/data/Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		Sheet sheet=workbook.getSheet("A");
				
		int numOfRow = sheet.getLastRowNum()+1;
		int numOfCol = sheet.getRow(0).getLastCellNum();

		String data [][] = new String [numOfRow][numOfCol];
		
		for (int i=1; i<numOfRow; i++) {
			for (int f=0; f<numOfCol; f++) {
				try {
				data[i][f]=sheet.getRow(i).getCell(f).getStringCellValue();		
				}catch (Throwable e){
				data [i][f]="";			
				}				
			}		
		}
		return data;
	
	}
	
//	public void close (){
//		driver.close();
//	}
}
