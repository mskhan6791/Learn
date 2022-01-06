package com.abc.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountsElements {

	public WebDriver driver = null;
	
	public CreateAccountsElements (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy( id = "firstName")
	public WebElement firstName_textBox;

}

