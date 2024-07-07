package Oragnization_Scenarios;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Package.Base_Class;
import Base_Package.Utility_Class;

public class Invite_Students_Bulk_Upload_Page {
	WebDriver driver = Base_Class.getDriver();
		@FindBy(xpath = "//p[text()='Jobs']")
		private WebElement click_on_JObs_tab;
		public void Click_on_Jobs_Tab() 
		{click_on_JObs_tab.click();}
		
					
		@FindBy(xpath = "//img[@alt='Invite via mail']")
		private WebElement click_on_invite_student;
		public void Click_on_Invite_Student() 
		{WebDriverWait wait = new WebDriverWait( driver,Duration.ofSeconds(15));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(click_on_invite_student));
        element.click();}
		
		
		@FindBy(xpath = "//h5[text()='Upload in Bulk']")
		private WebElement select_bulk_upload;
		public void Select_Bulk_Upload()
		{select_bulk_upload.click();
		}
		
		@FindBy(xpath = "//div[@role='presentation']")
		private WebElement upload_excel_file;
		public void Upload_Excel_File() throws AWTException, InterruptedException 
		{upload_excel_file.click();
		Utility_Class.Upload_File(Utility_Class.userdir+"\\Required_Files\\Agencies_emails.xlsx");
		}
		

		@FindBy(xpath = "//span[contains(text(),'Upload')]")
		private WebElement click_on_upload_button;
		public void Click_On_Upload_Button()
		{click_on_upload_button.click();
		}
		
		public Invite_Students_Bulk_Upload_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
			} 



}
