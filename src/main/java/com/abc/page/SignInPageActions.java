package com.abc.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.abc.elements.SignInPageElements;

public class SignInPageActions extends SignInPageElements{
	//	WebDriver driver=null;
	
	public SignInPageActions (WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	
	}
			
	public CreateAccountActions selectMyselfToCreateAccount () throws InterruptedException {
		create_button.click();
		mySelf_button.click();
		Thread.sleep(1000);
		return new CreateAccountActions(driver);
	}
		
}
