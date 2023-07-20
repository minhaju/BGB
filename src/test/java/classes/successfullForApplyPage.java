package classes;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.openBrowser;

public class successfullForApplyPage extends openBrowser{
	
	public successfullForApplyPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='email']") WebElement emailAddress;
	@FindBy(xpath = "//input[@placeholder='ফোন নম্বর']") WebElement phoneNumber;
	@FindBy(xpath ="//a[contains(.,'Continue to Apply')]") WebElement continueApplyButton;
	
	public void enterEmail(String email) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		emailAddress.sendKeys(email);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public void enterPhone(String phone) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		phoneNumber.sendKeys(phone);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void clickContinueApply() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		continueApplyButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
