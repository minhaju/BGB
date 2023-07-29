package classes;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.openBrowser;

public class verifySucessPage extends openBrowser{
	public verifySucessPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//a[contains(.,'Go to Login')]") WebElement loginButton;
	
	public void clickLoginButton() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
