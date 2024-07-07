package Agency_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class One_Way_Assessment_Page_Create {
	
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
	private WebElement Click_on_One_Way;
	public void Click_on_One_Way_Assessment(){Click_on_One_Way.click();}
	
	
	@FindBy(xpath = "//span[contains(text(),'+ Add folder')]")
	private WebElement Click_on_Add_Assessments;
	public void Click_On_Add_Assessments(){Click_on_Add_Assessments.click();}
	
	@FindBy(xpath = "//input[@name='folder_name']")
	private WebElement Enter_folder_name;
	public void Enter_Folder_Name(){Enter_folder_name.sendKeys("QA Engineer");}
	
	@FindBy(xpath = "//span[contains(text(),'Create assessment')]")
	private WebElement Click_On_Create_Assessment_button;
	public void Click_On_Create_Assessment_Button(){Click_On_Create_Assessment_button.click();}
	
	@FindBy(xpath = "//h2[contains(text(),'Create')]")
	private WebElement Method_of_adding_questions;
	public void Method_Of_Adding_Questions(){Method_of_adding_questions.click();}
	
	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElement Click_on_Continue;
	public void Click_On_Continue(){Click_on_Continue.click();}
	
	@FindBy(xpath = "//textarea[@placeholder='Write your question here']")
	private WebElement Write_questions;
	public void Write_Questions(){Write_questions.sendKeys("What is your name ?");}
	
	@FindBy(xpath = "//span[text()='Save']")
	private WebElement Click_on_Save;
	public void Click_On_Save(){Click_on_Save.click();}
	
	
	//Again Call Method 53 
	
	public One_Way_Assessment_Page_Create(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
}
