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
	@FindBy(name = "sscName") WebElement sscBoard;
	@FindBy(name = "sscYear") WebElement sscPassYear;
	@FindBy(name = "sscRollNumber") WebElement sscRollNo;
	@FindBy(name = "sscRegistrationNumber") WebElement sscRegistrationNo;
	@FindBy(name = "sscResult") WebElement sscRegult;
	
	@FindBy(name = "hscName") WebElement hscBoard;
	@FindBy(name = "hscYear") WebElement hscPassYear;
	@FindBy(name = "hscRollNumber") WebElement hscRollNo;
	@FindBy(name = "hscRegistrationNumber") WebElement hscRegistrationNo;
	@FindBy(name = "hscResult") WebElement hscRegult;
	
	@FindBy(xpath = "(//input[@value='Yes'])[1]") WebElement computerExperienceYes;
	@FindBy(xpath = "(//input[@value='Yes'])[2]") WebElement dataEntryExperienceYes;
	@FindBy(name = "questionRadio2") WebElement dataEntryExperienceN0;
	@FindBy(xpath = "(//input[@value='Yes'])[3]") WebElement communicationSkillsYes;
	@FindBy(xpath = "(//input[@id='no-7'])[2]") WebElement heightNo;
	@FindBy(xpath = "//button[text()='যোগ্যতা পরীক্ষা']") WebElement qualifyExam;
	
	
	@FindBy(xpath = "(//input[@value='yes'])[1]") WebElement hightYes;
	@FindBy(xpath = "(//input[@value='yes'])[2]") WebElement ageYes;
	@FindBy(xpath = "(//input[@value='yes'])[3]") WebElement sscYes;
	@FindBy(xpath = "(//input[@value='yes'])[4]") WebElement hscYes;
	@FindBy(xpath = "(//input[@value='yes'])[5]") WebElement bangladeshiYes;
	
	
	
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
	
	public void enterSSCResult(String result) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		sscRegult.sendKeys(result);
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
	
	public void enterHSCResult(String result) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		hscRegult.sendKeys(result);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	
	public void selectComputerYes() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		computerExperienceYes.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void selectDataEntryYes() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dataEntryExperienceYes.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void selectCommunicationYes() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		communicationSkillsYes.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
		
	public void clickqualityExam() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		qualifyExam.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void checkquality() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		hightYes.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ageYes.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		sscYes.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		hscYes.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		bangladeshiYes.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
}
