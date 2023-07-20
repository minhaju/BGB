package tests;

import org.testng.annotations.Test;

import classes.successfullForApplyPage;
import utility.openBrowser;

public class successfullyForApplyTest extends openBrowser{
	@Test(priority = 7)
	public void continueApplyTest() throws InterruptedException {
		successfullForApplyPage apply = new successfullForApplyPage();
		apply.enterEmail("test@gmail.com");
		apply.enterPhone("12345672");
		apply.clickContinueApply();
		Thread.sleep(10000);
	}
}
