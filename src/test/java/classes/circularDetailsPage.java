package classes;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.openBrowser;

public class circularDetailsPage extends openBrowser{
	public circularDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[contains(.,'সম্মত হন এবং আবেদন করুন')])[1]") WebElement applyButton;
	
	public void clickApplybutton() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		applyButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	

}
