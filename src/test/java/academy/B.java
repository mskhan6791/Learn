package academy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class B {

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("@BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("@AfterSuite");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		
		System.out.println("@BeforeGroups");
	}
	
	@AfterGroups
	public void afterGroups() {
		
		System.out.println("@AfterGroups");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}
	
	
}
