package classes;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.openBrowser;

public class homePage extends openBrowser{
	public homePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[contains(.,'আবেদনের জন্য বিস্তারিত তথ্য')])[1]") WebElement detailsButton;
	
	public void clickDetails() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, -400)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		detailsButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
