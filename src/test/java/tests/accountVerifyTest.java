package tests;

import org.testng.annotations.Test;
import classes.accoutVerifyPage;
import utility.openBrowser;

public class accountVerifyTest extends openBrowser{
	@Test
	public void enterVerifyCodeTest() throws InterruptedException {
	Thread.sleep(5000);
	accoutVerifyPage verify= new accoutVerifyPage();
	verify.enterVerifyCode("2", "2", "2", "2");
	Thread.sleep(5000);
	}
	
	@Test
	public void clickVerifyButtonTest() throws InterruptedException {
	Thread.sleep(5000);
	accoutVerifyPage verify= new accoutVerifyPage();
	verify.clickVerifyButton();
	Thread.sleep(5000);
	}
	
}
