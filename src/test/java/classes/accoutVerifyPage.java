package classes;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.openBrowser;

public class accoutVerifyPage extends openBrowser{
	public accoutVerifyPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='text']") WebElement verfyCode1;
	@FindBy(xpath = "(//input[@type='text'])[2]") WebElement verfyCode2;
	@FindBy(xpath = "(//input[contains(@type,'text')])[3]") WebElement verfyCode3;
	@FindBy(xpath = "(//input[@type='text'])[4]") WebElement verfyCode4;
	@FindBy(xpath = "//button[contains(.,'যাচাই করুন')]") WebElement verfyButton;
	
	public void enterVerifyCode(String code1) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		verfyCode1.sendKeys(code1);
//		verfyCode2.sendKeys(code2);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		verfyCode3.sendKeys(code3);
//		verfyCode4.sendKeys(code4);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void clickVerifyButton() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		verfyButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
}

