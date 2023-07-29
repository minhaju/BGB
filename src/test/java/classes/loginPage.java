package classes;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.openBrowser;

public class loginPage extends openBrowser{
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='ইউজার আইডি']") WebElement emailAddress;
	@FindBy(xpath = "//input[@placeholder='পাসওয়ার্ড']") WebElement password;
	@FindBy(xpath = "//button[contains(.,'Login')]") WebElement loginButton;	
	
	public void enterEmail(String email) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		emailAddress.sendKeys(email);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public void enterPassword(String pass) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		password.sendKeys(pass);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public void clickLogin() {
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}


