package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import classes.circularDetailsPage;
import utility.openBrowser;

public class circularDetailsTest extends openBrowser {
	
	@Test(priority = 2)
	public void opencircularTest() throws InterruptedException {
		circularDetailsPage  circularDetails = new circularDetailsPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		circularDetails.clickApplybutton();
		Thread.sleep(10000);
	}
}
	
