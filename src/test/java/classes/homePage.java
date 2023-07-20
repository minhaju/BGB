package classes;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.openBrowser;

public class homePage extends openBrowser{
	public homePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[contains(.,'বিস্তারিত')])[4]") WebElement detailsButton;
	
	public void clickDetails() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		detailsButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
