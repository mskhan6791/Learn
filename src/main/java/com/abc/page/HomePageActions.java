package com.abc.page;

import org.openqa.selenium.WebDriver;

import com.abc.elements.HomePageElements;

public class HomePageActions extends HomePageElements {
		
	public HomePageActions (WebDriver driver) {
		super(driver);
		
	}
	
	public SignInPageActions clickOnSignIn () {
		signIn_link.click();
		return new SignInPageActions(driver);
	}
	
}
