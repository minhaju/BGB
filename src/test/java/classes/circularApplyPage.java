package classes;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.openBrowser;

public class circularApplyPage extends openBrowser{
	public circularApplyPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(.,'এগিয়ে যান')]") WebElement goAhead;
	@FindBy(xpath = "(//select[@class='p-2 border-2 rounded-md w-full border-[#969F9F]'])[1]") WebElement sscBoard;
	@FindBy(xpath = "(//select[@class='p-2 border-2 rounded-md w-full border-[#969F9F]'])[2]") WebElement sscPassYear;
	@FindBy(xpath = "(//input[@placeholder='রোল নাম্বার'])[1]") WebElement sscRollNo;
	@FindBy(xpath = "(//input[contains(@placeholder,'রেজিস্ট্রেশন নম্বর')])[1]") WebElement sscRegistrationNo;
	
	@FindBy(xpath = "(//select[@class='p-2 border-2 rounded-md w-full border-[#969F9F]'])[3]") WebElement hscBoard;
	@FindBy(xpath = "(//select[@class='p-2 border-2 rounded-md w-full border-[#969F9F]'])[4]") WebElement hscPassYear;
	@FindBy(xpath = "(//input[@placeholder='রোল নাম্বার'])[2]") WebElement hscRollNo;
	@FindBy(xpath = "(//input[@placeholder='রেজিস্ট্রেশন নম্বর'])[2]") WebElement hscRegistrationNo;
	
	@FindBy(xpath = "(//input[contains(@id,'yes-7')])[1]") WebElement swimmingYes;
	@FindBy(xpath = "(//input[contains(@id,'no-7')])[1]") WebElement swimmingNo;
	@FindBy(xpath = "(//input[@id='yes-7'])[2]") WebElement heightYes;
	@FindBy(xpath = "(//input[@id='no-7'])[2]") WebElement heightNo;
	@FindBy(xpath = "//a[contains(.,'যোগ্যতা পরীক্ষা করুন')]") WebElement qualifyExam;
	
	
	
	public void clickGoAhead() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		goAhead.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void selectSSCBoard(String board) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Select drpBoard = new Select(sscBoard);
		drpBoard.selectByVisibleText(board);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void selectSSCPassYear(String year) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Select drpSSCPassYear = new Select(sscPassYear);
		drpSSCPassYear.selectByVisibleText(year);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void enterSSCRollNo(String roll) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		sscRollNo.sendKeys(roll);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void enterSSCRegistrationNo(String registation) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		sscRegistrationNo.sendKeys(registation);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void selectHSCBoard(String board) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Select drpHSCBoard = new Select(hscBoard);
		drpHSCBoard.selectByVisibleText(board);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void selectHSCPassYear(String year) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Select drpHSCPassYear = new Select(hscPassYear);
		drpHSCPassYear.selectByVisibleText(year);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void enterHSCRollNo(String roll) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		hscRollNo.sendKeys(roll);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void enterHSCRegistrationNo(String registation) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		hscRegistrationNo.sendKeys(registation);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void selectSwimmingYes() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		swimmingYes.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void selectSwimmingNo() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		swimmingNo.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void selectHeightYes() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		heightYes.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void selectHeightNo() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		heightNo.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void clickqualityExam() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		qualifyExam.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
}
