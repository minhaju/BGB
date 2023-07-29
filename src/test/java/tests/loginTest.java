package tests;

import org.testng.annotations.Test;

import classes.loginPage;
import utility.openBrowser;

public class loginTest extends openBrowser{
	@Test
	public void loginInTest() throws InterruptedException {
		Thread.sleep(10000);
		loginPage login = new loginPage();
		login.enterEmail("jjkBEezP");
		login.enterPassword("6KYWfeVC");
		login.clickLogin();
		Thread.sleep(5000);
	}
}