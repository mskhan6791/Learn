package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.abc.base.BaseTest;
import com.abc.core.PDriver;
import com.abc.page.CreateAccountActions;
import com.abc.page.HomePageActions;
import com.abc.page.SignInPageActions;

	
	public class Goog extends BaseTest{

	HomePageActions homePage=null;


	@Test
	public void t() throws InterruptedException {
		homePage = new HomePageActions(driver);
		
	SignInPageActions signInPage = homePage.clickOnSignIn();
			
	CreateAccountActions createAccount=signInPage.selectMyselfToCreateAccount();
	createAccount.fillTextInFirstName();
	}
}
