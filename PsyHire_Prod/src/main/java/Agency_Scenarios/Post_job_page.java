package Agency_Scenarios;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Package.Base_Class;
import Base_Package.Utility_Class;


public class Post_job_page extends Utility_Class{
	WebDriver driver = Base_Class.getDriver();
	 
	 @FindBy(xpath = "//p[text()='Jobs']")
	 private WebElement click_on_job_tab;
	 public void Click_On_Job_Tab(){click_on_job_tab.click();}
	 
//	 @FindBy(xpath = "//img[@alt='Post Job']")  
//	 private WebElement click_on_plus;
//	 public void Click_On_Plus(){click_on_plus.click();}
	 
	 @FindBy(xpath = "//span[text()='Get started']")  
	 private WebElement click_on_get_started;
	 public void Click_On_Get_Started(){click_on_get_started.click();}

	 @FindBy(xpath = "//h3[text()='Manual']")
	 private WebElement Select_post_type;
	 public void Select_Post_Type(){Select_post_type.click();}
	 
	 @FindBy(xpath = "//span[text()='Continue']")
	 private WebElement Click_on_continue;
	 public void Click_On_Continue(){Click_on_continue.click();}
	
	 @FindBy(xpath = "(//input[@type='search'])[1]")
	 private WebElement Search_client;
	 public void Search_Client(){Search_client.click();}
	 
	 @FindBy(xpath = "//div[@role='option']")
	 private WebElement Select_client;
	 public void Select_Client(){Select_client.click();}
	
	 @FindBy(xpath = "//input[@name='title']")
	 private WebElement jobtitle;
	 public void Enter_Job_Titile() throws IOException{jobtitle.sendKeys(CellData("Job_Data",2,1));}
	 
	 @FindBy(xpath = "(//input[@type='search'])[2]")
	 private WebElement Search_location;
	 public void Search_Location() throws IOException{Search_location.sendKeys(CellData("Job_Data",2,3));}
	 
	 @FindBy(xpath = "//div[@role='option']")
	 private WebElement Select_location;
	 public void Select_Location(){Select_location.click();}
	 
	 @FindBy(xpath = "(//input[@type='search'])[3]")
	 private WebElement Search_Job_type;
	 public void Search_Job_Type() throws IOException{Search_Job_type.sendKeys(CellData("Job_Data",2,4));}
	 
	 @FindBy(xpath = "//div[@role='option']")
	 private WebElement Select_Job_type;
	 public void Select_Job_Type(){Select_Job_type.click();}
	 
	 @FindBy(xpath = "(//input[@type='text'])[2]")
	 private WebElement Click_on_Experience;
	 public void Click_On_Experience(){Click_on_Experience.click();;}
	 
	 @FindBy(xpath = "//p[text()='1-2 years']")
	 private WebElement Select_experience;
	 public void Select_Experience(){Select_experience.click();}
	
	 @FindBy(xpath = "//input[@name='openings']")
	 private WebElement Total_openings;
	 public void Total_Openings() throws IOException{Total_openings.sendKeys(CellData("Job_Data",2,5));}

	 @FindBy(xpath = "//input[@placeholder='Select Salary Period']")
	 private WebElement Search_Salary_period ;
	 public void Search_Salary_Period(){Search_Salary_period.click();}
	 
	 @FindBy(xpath = " (//div[@role='option'])[2]")
	 private WebElement Select_Salary_period ;
	 public void Select_Salary_Period(){Select_Salary_period.click();}
		 
	 @FindBy(xpath = "(//input[@type='search'])[5]")
	 private WebElement Search_Currency_type;
	 public void Search_Currency_type(){Search_Currency_type.sendKeys("INR");}
	 
	 @FindBy(xpath = "//div[@role='option']")
	 private WebElement Currency_type ;
	 public void Select_Currency_Type(){Currency_type.click();}
	 
	 @FindBy(xpath = "//input[@name='salary_range_from']")
	 private WebElement salary_range_from ;
	 public void Salary_Range_From() throws IOException{salary_range_from.sendKeys(CellData("Job_Data",2,6));}
	 
	 @FindBy(xpath = "//input[@name='salary_range_to']")
	 private WebElement salary_range_to ;
	 public void Salary_Range_To() throws IOException{salary_range_to.sendKeys(CellData("Job_Data",2,7));}
	 
	 @FindBy(xpath = "(//span[text()='Add Manually'])[1]")
	 private WebElement JD_Type;
	 public void Add_JD_Type(){JD_Type.click();}

	 @FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	 private WebElement Write_Jd;
	 public void Write_JD() throws IOException{Write_Jd.sendKeys(CellData("Job_Data",2,2));}
	 
	 
	 @FindBy(xpath = "//span[text()='Import from job description']")
	 private WebElement import_skills;
	 public void Import_Skills_From_JD(){
		 WebDriverWait wait= new WebDriverWait( driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOf(import_skills));		 
		 import_skills.click();}

	 
	
	
	 @FindBy(xpath = "//p[text()='glassdoor']")
	 private WebElement glassdoor;
	 @FindBy(xpath = "//p[text()='indeed']")
	 private WebElement indeed;
	 
	 public void selectJobBoards() { 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView(true);", glassdoor);
         glassdoor.click();
	 }
	
	 
	 @FindBy(xpath = "//button[@name='next']")
	 private WebElement Click_On_next;
	 public void Click_On_Next(){Click_On_next.click();}
	 
	 @FindBy(xpath = "//h3[text()='CV Screening']")
	 private WebElement Open_Cv;
	 public void Open_Cv_Screeing(){Open_Cv.click();}
	 
	 @FindBy(xpath = "//p[text()='Select team member']")
	 private WebElement CV_Screeing_assignee;
	 public void CV_Screeing_Assignee(){CV_Screeing_assignee.click();}
	 
	 @FindBy(xpath = "(//input[@type='checkbox'])[1]") 
	 private WebElement Select_cv_team;
	 public void Select_Cv_Team(){Select_cv_team.click();}
	 
	 
//======================{Skill Assessment}==========================	 
	 
	 @FindBy(xpath = "//span[text()='Add Stage']") 
	 private WebElement Add_More_stage;
	 public void Add_More_Stage(){Add_More_stage.click();}
	 
	 @FindBy(xpath = "//p[text()='Skill assessment']") 
	 private WebElement Add_Skill;
	 public void Add_Skill_Assessment(){Add_Skill.click();}
	 
	 @FindBy(xpath = "//span[text()='Add']") 
	 private WebElement Confirm_add;
	 public void Confirm_Add(){Confirm_add.click();}
	 
	 @FindBy(xpath = "//p[text()='Select team member']")
	 private WebElement Skill_assignee;
	 public void Skill_Assignee(){Skill_assignee.click();}
	 
	 @FindBy(xpath = "(//input[@type='checkbox'])[2]") 
	 private WebElement Select_Skill_team;
	 public void Select_Skill_Team(){Select_Skill_team.click();}
	 
	 @FindBy(xpath = "//input[@name='stages.1.complete_in']") 
	 private WebElement Compleation_time;
	 public void Compleation_Time(){Compleation_time.sendKeys("2");}
	 
	 @FindBy(xpath = "(//input[@name='stages.1.selection_mode'])[1]") // Auto mode of adding questions 
	 private WebElement selection_mode;
	 public void Selection_Mode(){selection_mode.click();}
	 
	 @FindBy(xpath = "//input[@name='stages.1.duration']") 
	 private WebElement Skill_duration;
	 public void Skill_Duration(){Skill_duration.sendKeys("10");}
	 
	 @FindBy(xpath = "//span[text()='Add Assessment']") 
	 private WebElement Add_assessment;
	 public void Add_Assessment(){Add_assessment.click();}
	 	 
	 @FindBy(xpath = "(//div[@class='flex items-center w-full justify-between '])[1]") 
	 private WebElement Choose_Assessment_folder;
	 public void Choose_Assessment_folder(){Choose_Assessment_folder.click();}
	 
	 @FindBy(xpath = "//h1[text()='Multiple Choice Questions']") 
	 private WebElement Select_mcq;
	 public void Select_MCQ(){Select_mcq.click();}
	 
	 @FindBy(xpath = "//h1[text()='True or False Questions ']") 
	 private WebElement Select_TF;
	 public void Select_T_F(){Select_TF.click();}
	
	 @FindBy(xpath = "//h1[text()='Short Answer Questions']") 
	 private WebElement Select_saq;
	 public void Select_SAQ(){Select_saq.click();}
	 	 
	 @FindBy(xpath = "//span[text()='Continue']") 
	 private WebElement Click_on_Continue;
	 public void Continue(){Click_on_Continue.click();}
	 
	 @FindBy(xpath = "(//input[@type='search'])[1]") 
	 private WebElement mcq_drop_down;
	 public void MCQ_drop_down(){
		 ((JavascriptExecutor)  driver).executeScript("arguments[0].scrollIntoView(true);", mcq_drop_down);
		 mcq_drop_down.click();}
	 
	 @FindBy(xpath = "(//div[@role='option'])[3]") 
	 private WebElement No_Of_questions;
	 public void Total_No_Of_Questions(){No_Of_questions.click();}// Reusable for total no of questions
	 	 
	 @FindBy(xpath = "(//input[@type='search'])[2]") 
	 private WebElement TF_drop_down;
	 public void TF_drop_down(){TF_drop_down.click();}
	 
	 @FindBy(xpath = "(//input[@type='search'])[3]") 
	 private WebElement saq_drop_down;
	 public void SAQ_drop_down(){saq_drop_down.click();}
	 
	 
//======================{Psy Assessment}==========================	 
	
	 @FindBy(xpath = "//p[text()='Psychometric assessment']") 
	 private WebElement Add_Psychometric;
	 public void Add_Psychometric_Assessment(){Add_Psychometric.click();}
	 
	 @FindBy(xpath = "//p[text()='Select team member']")
	 private WebElement psy_assignee;
	 public void Psy_Assignee(){psy_assignee.click();}
	 
	 @FindBy(xpath = "(//input[@type='checkbox'])[2]") 
	 private WebElement Select_psy_team;
	 public void Select_Psy_team(){Select_psy_team.click();}
	 
	 @FindBy(xpath = "//input[@name='stages.2.complete_in']") 
	 private WebElement psy_Compleation_time;
	 public void Psy_Compleation_time(){psy_Compleation_time.sendKeys("2");}
	 
	 @FindBy(xpath = "(//input[@name='stages.2.selection_mode'])[1]") // Auto mode of adding questions 
	 private WebElement Psy_selection_mode;
	 public void Psy_Selection_mode(){Psy_selection_mode.click();}
	 
	 @FindBy(xpath = "(//span[text()='Add Assessment'])[2]") 
	 private WebElement Psy_Add_assessment;
	 public void Psy_Add_Assessment(){Psy_Add_assessment.click();}
	 	 
	 @FindBy(xpath = "(//div[@class='flex items-center w-full justify-between '])[1]") 
	 private WebElement Choose_Psy_Assessment_folder;
	 public void Choose_Psy_Assessment_Folder(){Choose_Psy_Assessment_folder.click();}
	 
	 @FindBy(xpath = "(//input[@type='search'])[4]") 
	 private WebElement psy_drop_down;
	 public void Psy_drop_down(){psy_drop_down.click();}
	 //Use 211 
	 
	  
//======================{One-Way Assessment}==========================	 

	 @FindBy(xpath = "//p[text()='One-way technical interview']") 
	 private WebElement Add_One_way;
	 public void Add_One_Way_Assessment(){Add_One_way.click();}
	 
	 @FindBy(xpath = "//p[text()='Select team member']")
	 private WebElement one_way_assignee;
	 public void One_Way_Assignee(){one_way_assignee.click();}
	 
	 @FindBy(xpath = "(//input[@type='checkbox'])[2]") 
	 private WebElement Selectone_way_team;
	 public void Select_One_Way_Team(){Selectone_way_team.click();}
	 
	 @FindBy(xpath = "//input[@name='stages.3.complete_in']") 
	 private WebElement One_way_Compleation_time;
	 public void One_way_Compleation_time(){One_way_Compleation_time.sendKeys("2");}
	 
	 @FindBy(xpath = "(//input[@name='stages.3.selection_mode'])[1]") // Auto mode of adding questions 
	 private WebElement One_way_selection_mode;
	 public void One_way_selection_mode(){One_way_selection_mode.click();}
	
	 @FindBy(xpath = "//input[@name='stages.3.duration']") 
	 private WebElement One_way_duration;
	 public void One_Way_duration(){One_way_duration.sendKeys("10");}
	
	 @FindBy(xpath = "(//span[text()='Add Assessment'])[3]") 
	 private WebElement One_way_Add_assessment;
	 public void One_Way_Add_assessment(){One_way_Add_assessment.click();}
	
	 @FindBy(xpath = "(//div[@class='flex items-center w-full justify-between '])[1]") 
	 private WebElement Choose_one_way_Assessment_folder;
	 public void Choose_One_Way_Assessment_folder(){Choose_one_way_Assessment_folder.click();}
	
	 
	 @FindBy(xpath = "(//input[@type='search'])[5]") 
	 private WebElement One_way_drop_down;
	 public void One_way_drop_down(){One_way_drop_down.click();}
	//Use 211 and 207 Methods here
	 

//	 @FindBy(xpath = "//p[text()='Pre-hire assessment']") 
//	 private WebElement Add_Pre_hire;
//	 public void Add_Pre_Hire(){Add_Pre_hire.click();}
	 
	 
	 
//======================================{ Panel/Tech/HR interview  }===================================	 
	 
	 @FindBy(xpath = "//p[text()='Panel interview']") 
	 private WebElement Add_Panel_interview;
	 public void Add_Panel_Interview(){Add_Panel_interview.click();}
	 
	 @FindBy(xpath = "//p[text()='Technical interview']") 
	 private WebElement Add_Technical_interview;
	 public void Add_Technical_interview(){Add_Technical_interview.click();}
	 
	 @FindBy(xpath = "//p[text()='HR interview']") 
	 private WebElement Add_HR_interview;
	 public void Add_HR_Interview(){Add_HR_interview.click();}
	 
	 @FindBy(xpath = "//label[contains(text(),'Online')]")
	 private WebElement Panel_Mode_of_Interiew;
	 public void Panel_Mode_Of_Interview(){Panel_Mode_of_Interiew.click();}
	 
	 @FindBy(xpath = " (//label[contains(text(),'Online')])[2]")
	 private WebElement Tesh_Mode_Of_Interview;
	 public void Tech_Mode_Of_Interview(){Tesh_Mode_Of_Interview.click();}
	
	 @FindBy(xpath = " (//label[contains(text(),'Online')])[3]")
	 private WebElement HR_Mode_of_interview;
	 public void HR_Mode_of_interview(){HR_Mode_of_interview.click();}
		 
	 @FindBy(xpath = "//span[contains(text(),'Next')]")
	 private WebElement Click_on_next_button;
	 public void Click_on_Next_Button(){Click_on_next_button.click();}
	 
	 @FindBy(xpath = "//span[contains(text(),'Post Job')]")
	 private WebElement Click_On_Post_job;
	 public void Click_On_Post_Job(){Click_On_Post_job.click();}
	 
	 
	 
	 
	 
	 public  Post_job_page(WebDriver driver) {
	   	PageFactory.initElements(driver, this);
	   	
	   	
	 
	 
	 
	 
	 
}}
