package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import classes.circularApplyPage;
import utility.openBrowser;

public class circularApplyTest extends openBrowser{
	@Test(priority = 3)
	public void goAheadTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(200);
		circularApplyPage circularApply = new circularApplyPage();
		circularApply.clickGoAhead();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority = 4)
	public void enterSSCPassInfoTest() throws InterruptedException {
		circularApplyPage circularApply = new circularApplyPage();
		circularApply.selectSSCBoard("ঢাকা");
		circularApply.selectSSCPassYear("২০০৪");
		circularApply.enterSSCRollNo("34567987");
		circularApply.enterSSCRegistrationNo("3459876");
		circularApply.enterSSCResult("4.50");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority = 5)
	public void enterHSCPassInfoTest() throws InterruptedException {
		circularApplyPage circularApply = new circularApplyPage();
		circularApply.selectHSCBoard("ঢাকা");
		circularApply.selectHSCPassYear("২০০৬");
		circularApply.enterHSCRollNo("34567980");
		circularApply.enterHSCRegistrationNo("3459879");
		circularApply.enterHSCResult("4.20");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority = 6)
	public void selectOtherAndSubmitFirstForm() throws InterruptedException {
		circularApplyPage circularApply = new circularApplyPage();
		circularApply.selectComputerYes();
		circularApply.selectDataEntryYes();
		circularApply.selectCommunicationYes();
		circularApply.clickqualityExam();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority = 7)
	public void checkQualityTest() throws InterruptedException {
		circularApplyPage circularApply = new circularApplyPage();
		circularApply.checkquality();
		circularApply.clickqualityExam();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
}
