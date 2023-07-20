package tests;

import org.testng.annotations.Test;

import classes.circularApplyPage;
import utility.openBrowser;

public class circularApplyTest extends openBrowser{
	@Test(priority = 3)
	public void goAheadTest() throws InterruptedException {
		circularApplyPage circularApply = new circularApplyPage();
		circularApply.clickGoAhead();
		Thread.sleep(10000);
	}
	
	@Test(priority = 4)
	public void enterSSCPassInfoTest() throws InterruptedException {
		circularApplyPage circularApply = new circularApplyPage();
		circularApply.selectSSCBoard("ঢাকা");
		circularApply.selectSSCPassYear("২০০৪");
		circularApply.enterSSCRollNo("34567987");
		circularApply.enterSSCRegistrationNo("3459876");
		Thread.sleep(10000);
	}
	
	@Test(priority = 5)
	public void enterHSCPassInfoTest() throws InterruptedException {
		circularApplyPage circularApply = new circularApplyPage();
		circularApply.selectHSCBoard("ঢাকা");
		circularApply.selectHSCPassYear("২০০৬");
		circularApply.enterHSCRollNo("34567980");
		circularApply.enterHSCRegistrationNo("3459879");
		Thread.sleep(10000);
	}
	
	@Test(priority = 6)
	public void selectOtherAndSubmitFirstForm() throws InterruptedException {
		circularApplyPage circularApply = new circularApplyPage();
		circularApply.selectSwimmingYes();
		circularApply.selectHeightYes();
		circularApply.clickqualityExam();
		Thread.sleep(10000);
	}
	
	
	
}
