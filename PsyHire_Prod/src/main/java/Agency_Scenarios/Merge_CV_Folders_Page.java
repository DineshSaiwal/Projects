package Agency_Scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Base_Class;

public class Merge_CV_Folders_Page {
	
	WebDriver driver = Base_Class.getDriver();			
	@FindBy(xpath = "//p[contains(text(),'CV Bank')]")
	private WebElement click_on_CV_Bank;
	public void Click_On_CV_Bank_Tab() {click_on_CV_Bank.click();}
	
	@FindBy(xpath = "(//div[@class='text-gray-primary font-light '])[1]")
	private WebElement Click_on_Cv_Folder;
	public void Click_on_Cv_Folder() {Click_on_Cv_Folder.click();}
	
	
	@FindBy(xpath = "//p[contains(text(),'Create CV folder')]")
	private WebElement Creat_Cv_Folder;
	public void Create_CV_Folder() {Creat_Cv_Folder.click();}
	

	@FindBy(xpath = "//input[@name='folder_name']")
	private WebElement Enter_Folder_name ;
	public void Enter_Folder_Name() {Enter_Folder_name.sendKeys("CV Folder 002");}

	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElement Click_on_Continue;
	public void Click_On_Continue() {Click_on_Continue.click();}
	
	@FindBy(xpath = "//span[contains(text(),'Merge folder')]")
	private WebElement Click_Merge_folder ;
	public void Click_Merge_Folder() {Click_Merge_folder.click();}
	
	public void Select_CV_Folders() {
		List<WebElement> CV_Folders= driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement Click :CV_Folders) {
			Click.click();}
	}
	
	@FindBy(xpath = "//input[@name='folder_name']")
	private WebElement Enter_Merged_Folder_name ;
	public void Enter_Merged_Folder_Name() {Enter_Merged_Folder_name.sendKeys("Merge Folder");}

	@FindBy(xpath = "//span[text()='Merge']")
	private WebElement Click_On_Confirm_merge ;
	public void Click_On_Confirm_Merge() {Click_On_Confirm_merge.click();}
	

	
	

	
	
	public  Merge_CV_Folders_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		} 
	
	
	
}
