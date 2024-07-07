package Agency_Scenarios;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sync_CV_page {
	
								
	@FindBy(xpath = "//p[contains(text(),'CV Bank')]")
	private WebElement click_on_CV_Bank;
	public void Click_On_CV_Bank() {click_on_CV_Bank.click();}
	
	@FindBy(xpath = "//p[contains(text(),'Add CV folder')]")
	private WebElement Creat_Cv_Folder;
	public void Create_CV_Folder() {Creat_Cv_Folder.click();}
	
//	@FindBy(xpath = "//span[contains(text(),'+ Add folder')]")
//	private WebElement Creat_Cv_Folder;
//	public void Create_CV_Folder() {Creat_Cv_Folder.click();}
	

	@FindBy(xpath = "//input[@name='folder_name']")
	private WebElement Enter_Folder_name ;
	public void Enter_Folder_Name() {Enter_Folder_name.sendKeys("Qa Engineer");}

	@FindBy(xpath = "//input[@placeholder='Type tag & press enter to add']")
	private WebElement Add_tags;
	public void Add_Tags() {Add_tags.sendKeys("SDLC",Keys.ENTER,"STLC",Keys.ENTER);}
	
	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElement Click_on_Continue;
	public void Click_On_Continue() {Click_on_Continue.click();}

	@FindBy(xpath = "//div[contains(text(),'Qa Engineer')]")
	private WebElement Open_Folder;
	public void Open_Cv_Folder() {Open_Folder.click();}
	
	@FindBy(xpath = "//span[contains(text(),'Sync folder')]")
	private WebElement Click_Sync_folder;
	public void Click_On_Sync_folder() {Click_Sync_folder.click();}
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement Search_job_folder;
	public void Search_Job_folder() {Search_job_folder.click();}
	
	@FindBy(xpath = "(//div[@role='option'])[1]")
	private WebElement Select_job_folder;
	public void Select_Job_folder() {Select_job_folder.click();}
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement Radio_button;
	public void Radio_Button() {Radio_button.click();}
	
	// Call Click_On_Continue again line no. 35
	
	@FindBy(xpath = "//input[@name='folder_name']")
	private WebElement Enter_Sub_Folder_name ;
	public void Enter_Sub_Folder_Name() {Enter_Folder_name.sendKeys("Sync CV Folder");}

	
	// Call Click_On_Continue again line no. 30
	
	
	@FindBy(xpath = "//span[text()='Sync']")
	private WebElement Confirm_sync;
	public void Confirm_Sync() {Confirm_sync.click();}
	
	
	public  Sync_CV_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		} 
	
	
	
}
