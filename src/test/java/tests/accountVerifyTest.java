package tests;

import java.time.Duration;

import org.testng.annotations.Test;
import classes.accoutVerifyPage;
import utility.openBrowser;

public class accountVerifyTest extends openBrowser{
	@Test
	public void enterVerifyCodeTest() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(300);
	accoutVerifyPage verify= new accoutVerifyPage();
	verify.enterVerifyCode("2453");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void clickVerifyButtonTest() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(300);
	accoutVerifyPage verify= new accoutVerifyPage();
	verify.clickVerifyButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
}
