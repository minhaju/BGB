package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import classes.loginPage;
import utility.openBrowser;

public class loginTest extends openBrowser{
	@Test
	public void loginInTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginPage login = new loginPage();
		login.enterEmail("E692VSHK");
		login.enterPassword("0a11hvu0");
		login.clickLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}