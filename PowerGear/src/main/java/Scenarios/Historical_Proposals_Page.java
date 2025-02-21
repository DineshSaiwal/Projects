package Scenarios;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base_Package.Base_Class;

public class Historical_Proposals_Page {
	
//--------------------------------------{Add Proposal}----------------------------------	
	WebDriverWait wait = new WebDriverWait(Base_Class.driver, Duration.ofSeconds(10));
	Actions act = new Actions(Base_Class.driver);
	@FindBy(xpath="//h3[text()='Historical Proposals']") 	private WebElement ClickHSP;
	@FindBy(xpath="(//img[@alt='Historical Proposals'])[1]") 	private WebElement Hover;
	public void ClickHSProposal() {
	    
	    act.moveToElement(Hover).perform();
	    wait.until(ExpectedConditions.elementToBeClickable(ClickHSP));
	    act.moveToElement(ClickHSP).click().perform();
	}
	
	@FindBy(xpath="//span[contains(text(),'Upload')]") private WebElement upload;
	public void Clickupload() {
		upload.click();
	}
	
	@FindBy(xpath="//p[contains(text(), 'Single')]") private WebElement single;
	public void SelectMode() {
		single.click();
	}
	
	
	@FindBy(name="title") private WebElement proposalTitle;	
	public void proposalTitle() {
		proposalTitle.sendKeys("Proposal 011");
	}
	
	@FindBy(name="client") private WebElement client;
	public void client() {
		client.sendKeys("D test Client 1");
	}
	
	@FindBy(xpath = "//input[@placeholder='Select the bid status']") private WebElement ClickbidStatus;
	public void Click_bidStatus() {
		ClickbidStatus.click();
	}
	
	@FindBy(xpath="(//div[@role='option'])[2]") private WebElement Status;
	public void Select_Status() {
		Status.click();
	}
	
	@FindBy(xpath="(//button[@type='button']/div)[1]") private WebElement ReceivedProposal;
	public void Click_ReceivedProposal() {
		ReceivedProposal.click();
	}
	
	@FindBy(xpath="(//button[@type='button']/div)[2]") private WebElement SubmittedProposal;
	public void Click_SubmittedProposal() {
		SubmittedProposal.click();
	}
	
	
	@FindBy(xpath = "(//span[text()='Upload'])[2]") private WebElement UploadProposal;
	public void UploadProposal() {
		UploadProposal.click();
	}
	
	
//----------------------------------------{Edit}-----------------------------------	
	
	
	@FindBy(xpath="(//div[@data-column-id='7'])[2]") private WebElement HoverDelete;
	public void HoverProposal() {
		act.moveToElement(HoverDelete).click().perform();
	}
	
	@FindBy(xpath="(//div[@data-column-id='7']/div/button)[2]") private WebElement ClickEdit;
	public void ClickEdit() {
		ClickEdit.click();
	}
	
	@FindBy(name="title") private WebElement EditTitle;	
	public void EditTitle() {
		EditTitle.clear();
		EditTitle.sendKeys("Proposal 022");
	}
	
	@FindBy(name="client") private WebElement Editclient;
	public void Editclient() {
		Editclient.clear();
		Editclient.sendKeys("D test Client 22");
	}
	
	
	@FindBy(xpath="//Input[@placeholder='Enter due date']") private WebElement SelectDueDate;
	public void SelectDueDate() {
		SelectDueDate.click();
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
	    String currentDateString  = currentDate.format(formatter);
	    WebElement currentDateElement = Base_Class.driver.findElement(By.xpath("//button[@aria-label='" + currentDateString + "']"));	    currentDateElement.click();
	}
	
	
	@FindBy(xpath="(//div[@role='option'])[3]") private WebElement UpdateStatus;
	public void UpdateStatus() {
		UpdateStatus.click();
	}
	
	@FindBy(xpath="//span[text()='Save Changes']") private WebElement saveChanges;
	public void SaveChanges() {
		saveChanges.click();
	}
	
	
//--------------------------------------{Delete Proposal}----------------------------------	
	
	@FindBy(xpath="(//div[@data-column-id='7']/div/button)[3]") private WebElement ClickDelete;
	public void ClickDelete() {
		ClickDelete.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Delete')]") private WebElement delete;
	public void delete() {
		delete.click();
	}
	
	public  Historical_Proposals_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		} 
	
}
