package Scenarios;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Package.Base_Class;
import Base_Package.Utility_Class;

public class Resource_Library_Page {

	WebDriverWait wait = new WebDriverWait(Base_Class.driver, Duration.ofSeconds(10));
	Actions act = new Actions(Base_Class.driver);
	@FindBy(xpath="//h3[text()='Resource Library']") 	private WebElement ClickResourceLibrary;
	@FindBy(xpath="(//img[@alt='Historical Proposals'])[1]") 	private WebElement HoverSideBar;
	public void ClickHSProposal() {
	    
	    act.moveToElement(HoverSideBar).perform();
	    wait.until(ExpectedConditions.elementToBeClickable(ClickResourceLibrary));
	    act.moveToElement(ClickResourceLibrary).click().perform();
	}
	
	@FindBy(xpath="//span[contains(text(),'Upload')]") private WebElement upload;
	public void Clickupload() {
		upload.click();
	}
	
	@FindBy(name="description") private WebElement docDetails;
	public void EnterdocDetails() {
		docDetails.sendKeys("D test Doc Detail 01");
	}
	
	@FindBy(xpath ="//input[@placeholder='Add relevant tags']") private WebElement tags;
	@FindBy(xpath="(//div[@role='option'])[1]") private WebElement SelectTag;
	public void SelectTag() {
		tags.click();SelectTag.click();
	}
	
	@FindBy(xpath = "(//div[@role='presentation'])[1]") private WebElement UploadFile;
	public void UploadFile() throws AWTException, InterruptedException {
		UploadFile.click();
		Utility_Class.Upload_File(Base_Class.userdir+"\\Files\\1348373_02.pdf");
	}
	
	@FindBy(xpath="//button[contains(@type,'submit')]") private WebElement ConfirmUpload;
	public void ConfirmUpload() {
		ConfirmUpload.click();
	}

//	------------------------------------------{Update Proposal}----------------------------------
	
	@FindBy(xpath="(//div[@data-column-id='6'])[2]") private WebElement Hover;
	public void HoverProposal() {
		act.moveToElement(Hover).click().perform();
	}
	
	@FindBy(xpath="(//div[@data-column-id='6']/div/button)[3]") private WebElement ClickEdit;
	public void ClickEdit() {
		ClickEdit.click();
	}
	
	@FindBy(name="title") private WebElement fileName;
	public void FileTitle() {
		fileName.clear();
		fileName.sendKeys("Updated File Title 01");
	}
	
	@FindBy(name="description") private WebElement UpdatedocDetails;
	public void UpdatedDocDetails() {
		UpdatedocDetails.clear();
		UpdatedocDetails.sendKeys("Updated Doc Detail 01");
	}
	
	@FindBy(xpath="//span[contains(text(),'Save Changes')]") private WebElement saveChanges;
	public void saveChanges() {
		saveChanges.click();
	}
	
	
//	------------------------------------------{Delete Proposal}----------------------------------
	
//				 Call hover method here
	
	@FindBy(xpath="(//div[@data-column-id='6']/div/button)[4]") private WebElement ClickDelete;
	public void ClickDelete() {
		ClickDelete.click();
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Delete')]") private WebElement ConfirmDelete;
	public void ConfirmDelete() {
		ConfirmDelete.click();
	}
	
	
	
	
	public  Resource_Library_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		} 
}
