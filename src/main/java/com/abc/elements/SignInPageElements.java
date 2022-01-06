package com.abc.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageElements {

	public WebDriver driver=null;
	
	public SignInPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='Create account']")
	public WebElement create_button;
	

	
	@FindBy(xpath = "//*[text()='For myself']")
	public WebElement mySelf_button;
}
