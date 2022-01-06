package com.abc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage1 {

	public SignInPage1 clickOnSignIn (WebDriver driver) {
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		return new SignInPage1();
	}
	
}
