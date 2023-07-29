package tests;

import org.testng.annotations.Test;

import classes.applyProcedurePage;
import utility.openBrowser;

public class applyProcedureTest extends openBrowser{
	
	@Test
	public void applyPaymentTest() throws InterruptedException {
		applyProcedurePage procedure = new applyProcedurePage();
		procedure.clickPayNowButton();
		Thread.sleep(5000);
	}
	

}
