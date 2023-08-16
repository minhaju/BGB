package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import classes.successfullForApplyPage;
import utility.openBrowser;

public class successfullyForApplyTest extends openBrowser{
	@Test(priority = 7)
	public void continueApplyTest() throws InterruptedException {
		successfullForApplyPage apply = new successfullForApplyPage();
		apply.enterPhone("01333568418");
		apply.enterEmail("test@gmail.com");
		apply.clickContinueApply();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
