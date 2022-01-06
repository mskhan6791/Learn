package com.abc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount1 {
	
	public void fillTextInFirstName(WebDriver driver) {
		driver.findElement(By.name("firstName")).sendKeys("Test");
	}
}
