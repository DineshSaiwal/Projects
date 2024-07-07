package Agency_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Base_Class;

public class Skill_Assessment_Page_Create {
	WebDriver driver = Base_Class.getDriver();
	@FindBy(xpath = "//img[@alt='settings']")
	private WebElement click_on_setting;
	public void Click_on_Settings(){click_on_setting.click();}
	
	@FindBy(xpath = "//p[contains(text(),'Data Bank')]")
	private WebElement Click_on_data_Bank;
	public void Click_on_Data_Bank(){Click_on_data_Bank.click();}
	
	@FindBy(xpath = "//p[contains(text(),'Assessments')]")
	private WebElement Click_on_Assessments;
	public void Click_On_Assessments(){Click_on_Assessments.click();}
	
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
	
	@FindBy(xpath = "//input[@placeholder='Add option']")
	private WebElement Enter_option_A;
	public void Enter_Option_A(){Enter_option_A.sendKeys("Option A");}
	
	@FindBy(xpath = "(//input[@placeholder='Add option'])[2]")
	private WebElement Enter_option_B;
	public void Enter_Option_B(){Enter_option_B.sendKeys("Option B");}
	
	@FindBy(xpath = "(//input[@placeholder='Add option'])[3]")
	private WebElement Enter_option_C;
	public void Enter_Option_C(){Enter_option_C.sendKeys("Option C");}
	
	@FindBy(xpath = "(//input[@placeholder='Add option'])[4]")
	private WebElement Enter_option_D;
	public void Enter_Option_D(){Enter_option_D.sendKeys("Option D");}
	
	@FindBy(xpath = "(//input[@type='radio'])[4]")
	private WebElement Select_answer;
	public void Select_Answer(){Select_answer.click();}
	
	@FindBy(xpath = "(//span[text()='Save'])[1]")
	private WebElement Click_on_Save;
	public void Click_On_Save(){Click_on_Save.click();}
	
	@FindBy(xpath = "//p[text()='T/F']")
	private WebElement Click_on_TF_Tab;
	public void Click_On_TF_Tab(){
		Actions Act= new Actions( driver);
		Act.click(Click_on_TF_Tab).perform();;
		}

	/* 	Use line no 44 code here 
		Use line no 64 code here 
		Use line no 68 code here 
	
	*/
	@FindBy(xpath = "//p[text()='SAQ']")
	private WebElement Click_on_SAQ_Tab;
	public void Click_On_SAQ_Tab(){
		Actions Act= new Actions( driver);
	Act.click(Click_on_SAQ_Tab).perform();;}
	
	//Use Line No 44 Here 
	//Use Line No 68 Here 
	@FindBy(xpath = "//span[text()='Save']")
	private WebElement Click_on_Save_Button;
	public void Click_On_Save_Button(){Click_on_Save_Button.click();}
	
	
	
	
	
	
	
	public Skill_Assessment_Page_Create(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
}
