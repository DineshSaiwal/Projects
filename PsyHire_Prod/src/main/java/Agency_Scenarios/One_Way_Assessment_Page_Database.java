package Agency_Scenarios;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class One_Way_Assessment_Page_Database {
	
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
	public void Enter_Folder_Name(){Enter_folder_name.sendKeys("QA Engineer 003");}
	
	@FindBy(xpath = "//span[contains(text(),'Create assessment')]")
	private WebElement Click_On_Create_Assessment_button;
	public void Click_On_Create_Assessment_Button(){Click_On_Create_Assessment_button.click();}
	
	@FindBy(xpath = "//h2[contains(text(),'Database')]")
	private WebElement Method_of_adding_questions;
	public void Method_Of_Adding_Questions(){Method_of_adding_questions.click();}
	
	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElement Click_on_Continue;
	public void Click_On_Continue(){Click_on_Continue.click();}
	

	@FindBy(xpath = "(//div[@role='button'])[1]")
	private WebElement Click_On_existing_domain;
	public void Click_On_Existing_Domain(){Click_On_existing_domain.click();}
	
	
//	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
//	private WebElement Select_one_questiones;
//	public void Select_One_Questions(){Select_one_questiones.click();}
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement Select_All_questiones;
	public void Select_All_Questions(){Select_All_questiones.click();}
	
	@FindBy(xpath = "//span[contains(text(),'Add to folder')]")
	private WebElement Click_on_Continue_3;
	public void Click_On_Add_To_Folder(){Click_on_Continue_3.click();}
	
		
	public One_Way_Assessment_Page_Database(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
}
