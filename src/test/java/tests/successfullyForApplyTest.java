package tests;

import org.testng.annotations.Test;

import classes.successfullForApplyPage;
import utility.openBrowser;

public class successfullyForApplyTest extends openBrowser{
	@Test(priority = 7)
	public void continueApplyTest() throws InterruptedException {
		successfullForApplyPage apply = new successfullForApplyPage();
		apply.enterPhone("01723568418");
		apply.enterEmail("test@gmail.com");
		apply.clickContinueApply();
		Thread.sleep(10000);
	}
}
