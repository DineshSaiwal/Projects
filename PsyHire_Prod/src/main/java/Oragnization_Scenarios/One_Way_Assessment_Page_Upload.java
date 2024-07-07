package Oragnization_Scenarios;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Utility_Class;

public class One_Way_Assessment_Page_Upload {
	
	@FindBy(xpath = "//img[@alt='settings']")
	private WebElement click_on_setting;
	public void Click_on_Settings(){click_on_setting.click();}
	
	@FindBy(xpath = "//p[contains(text(),'Data Bank')]")
	private WebElement Click_on_data_Bank;
	public void Click_on_Data_Bank(){Click_on_data_Bank.click();}
	
	@FindBy(xpath = "//p[contains(text(),'Assessments')]")
	private WebElement Click_on_Assessments;
	public void Click_On_Assessments(){Click_on_Assessments.click();}
	
	@FindBy(xpath = "//label[contains(text(),'One-way Technical Interviews')]")
	private WebElement Click_On_One_Way_tech;
	public void Click_On_One_Way_Tech(){Click_On_One_Way_tech.click();}
	
	@FindBy(xpath = "//p[contains(text(),'Add Assessment')]")
	private WebElement Click_on_Add_Assessments;
	public void Click_On_Add_Assessments(){Click_on_Add_Assessments.click();}
	
	@FindBy(xpath = "//input[@name='folder_name']")
	private WebElement Enter_folder_name;
	public void Enter_Folder_Name(){Enter_folder_name.sendKeys("QA Engineer 002");}
	
	@FindBy(xpath = "//span[contains(text(),'Create assessment')]")
	private WebElement Click_On_Create_Assessment_button;
	public void Click_On_Create_Assessment_Button(){Click_On_Create_Assessment_button.click();}
	
	@FindBy(xpath = "//h2[contains(text(),'Upload')]")
	private WebElement Method_of_adding_questions;
	public void Method_Of_Adding_Questions(){Method_of_adding_questions.click();}
	
	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElement Click_on_Continue;
	public void Click_On_Continue(){Click_on_Continue.click();}
	

	@FindBy(xpath = "//div[@role='presentation']")
	private WebElement Click_on_Browse_file;
	public void Upload_Excel_file() throws AWTException, InterruptedException{Click_on_Browse_file.click();
	  Utility_Class.Upload_File(Utility_Class.userdir+"\\Required_Files\\QA_Psy.xlsx");}
	
	
	@FindBy(xpath = "//span[contains(text(),'Upload')]")
	private WebElement Click_On_Upload_button;
	public void Click_On_Upload_Button(){Click_On_Upload_button.click();}
	
	
	
	@FindBy(xpath = "//span[text()='Save']")
	private WebElement Click_on_Save_Button;
	public void Click_On_Save_Button(){Click_on_Save_Button.click();}
	
	
	
	public One_Way_Assessment_Page_Upload(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
}
