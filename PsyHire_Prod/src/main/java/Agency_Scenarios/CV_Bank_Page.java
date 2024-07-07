package Agency_Scenarios;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Utility_Class;


public class CV_Bank_Page extends Utility_Class{

	
	
	@FindBy(xpath = "//p[text()='CV Bank']")
	private WebElement click_on_cvbank_tab;
	public void Click_on_CVBank_Tab() 
	{click_on_cvbank_tab.click();}
	
	@FindBy(xpath = "//span[text()='+ Add folder']")
	private WebElement Click_add_folder;
	public void Click_On_Add_Folder() 
	{Click_add_folder.click();}
	
	
	@FindBy(xpath = "//input[@name='folder_name']")
	private WebElement Enter_Folder_title;
	public void Enter_Folder_Title() 
	{Enter_Folder_title.sendKeys("Information Tech");}
	
	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElement Click_Continue_button;
	public void Click_Continue_Button() 
	{Click_Continue_button.click();}
	
	@FindBy(xpath = "//div[contains(text(),'Information ...')]")
	private WebElement Open_cv_Folder;
	public void Open_Cv_Folder() 
	{Open_cv_Folder.click();}
	
	@FindBy(xpath = "//p[contains(text(),'Create CV folder')]")
	private WebElement Create_Sub_Cv_folder;
	public void Create_Sub_CV_Folder() 
	{Create_Sub_Cv_folder.click();}
	
	@FindBy(xpath = "//input[@name='folder_name']")
	private WebElement Enter_Folder_name;
	public void Enter_Folder_Name() 
	{Enter_Folder_name.sendKeys("Qa Engineer");}// After this call continue method line no. 34
	
	@FindBy(xpath = "//div[contains(text(),'Qa Engineer')]")
	private WebElement Open_Sub_cv_Folder;
	public void Open_Sub_Cv_Folder() 
	{Open_Sub_cv_Folder.click();}
	
	
	@FindBy(xpath = "//span[contains(text(),'Upload')]")
	private WebElement Click_on_Upload_button;
	public void Click_on_Upload_Button() 
	{Click_on_Upload_button.click();}
	
	@FindBy(xpath = "//p[contains(text(),'Drag and drop or browse to choose a file')]")
	private WebElement Click_on_browse_file;
	public void Click_on_Browse_File() throws AWTException, InterruptedException 
	{Click_on_browse_file.click();
	Upload_File(Utility_Class.userdir+"\\Required_Files\\Resume.pdf");
	}
	
	@FindBy(xpath = "(//span[contains(text(),'Upload')])[2]")
	private WebElement Click_on_Upload_CV_Button;
	public void Click_On_Upload_CV_Button() 
	{Click_on_Upload_CV_Button.click();}
	
	
	
	
	
	
	public  CV_Bank_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		} 
}
