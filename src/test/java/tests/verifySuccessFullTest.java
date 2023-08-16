package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import classes.verifySucessPage;
import utility.openBrowser;

public class verifySuccessFullTest extends openBrowser{
	@Test
	public void loginButtonTest() throws InterruptedException {
		verifySucessPage success = new verifySucessPage();
		success.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
