package com.abc.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.abc.elements.CreateAccountsElements;

public class CreateAccountActions extends CreateAccountsElements {

	public CreateAccountActions (WebDriver driver) {
			super (driver);
			PageFactory.initElements(driver, this);
	}
		public void fillTextInFirstName() {
		firstName_textBox.sendKeys("Test");
	}
}
