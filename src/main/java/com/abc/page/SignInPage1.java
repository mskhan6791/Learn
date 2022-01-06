package com.abc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage1 {

	public CreateAccount1 selectMyselfToCreateAccount (WebDriver driver) {
		driver.findElement(By.xpath("//*[text()='Create account']")).click();
		driver.findElement(By.xpath("//*[text()='For myself']")).click();	
		return new CreateAccount1();
	}
	
}
