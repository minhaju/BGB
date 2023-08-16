package classes;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.openBrowser;

public class applyProcedurePage extends openBrowser{
	public applyProcedurePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//button[contains(.,'ফি প্রদান করুন')]") WebElement payNow;
	
	public void clickPayNowButton() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		payNow.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

}
