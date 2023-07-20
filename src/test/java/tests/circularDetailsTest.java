package tests;

import org.testng.annotations.Test;

import classes.circularDetailsPage;
import utility.openBrowser;

public class circularDetailsTest extends openBrowser {
	
	@Test(priority = 2)
	public void opencircularTest() throws InterruptedException {
		circularDetailsPage  circularDetails = new circularDetailsPage();
		circularDetails.clickApplybutton();
		Thread.sleep(10000);
	}
}
	
