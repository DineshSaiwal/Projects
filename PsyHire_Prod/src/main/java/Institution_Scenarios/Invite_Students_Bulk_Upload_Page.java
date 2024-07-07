package Institution_Scenarios;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Utility_Class;

public class Invite_Students_Bulk_Upload_Page {
	
				@FindBy(xpath = "//p[text()='Department']")
				private WebElement click_on_department;
				public void Click_on_Department() 
				{click_on_department.click();}
				
				@FindBy(xpath = "(//div[@class='text-gray-primary font-light '])[1]")
				private WebElement click_on_department_card;
				public void Click_on_Department_Card() 
				{click_on_department_card.click();}
				
				@FindBy(xpath = "//span[text()='Invite students']")
				private WebElement click_on_invite_student;
				public void Click_on_Invite_Student() 
				{click_on_invite_student.click();}
				
				@FindBy(xpath = "//h5[text()='Upload in Bulk']")
				private WebElement select_bulk_upload;
				public void Select_Bulk_Upload()
				{select_bulk_upload.click();
				}
				
				@FindBy(xpath = "//div[@role='presentation']")
				private WebElement upload_excel_file;
				public void Upload_Excel_File() throws AWTException, InterruptedException 
				{upload_excel_file.click();
				Utility_Class.Upload_File(Utility_Class.userdir+"\\Required_Files\\Bulk Emails.xlsx");
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
