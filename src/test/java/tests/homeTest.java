package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import classes.homePage;
import utility.openBrowser;

public class homeTest extends openBrowser{
	
	@Test(priority = 1)
	public void openDetails() throws InterruptedException {
		homePage home=new homePage();
		home.clickDetails();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
