package Agency_Test_Scripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Agency_Scenarios.Post_job_page;
import Base_Package.Base_Class;
import Base_Package.Login;
import Base_Package.ScreenRecorderUtil;
import Base_Package.Utility_Class;

public class Job_Post_Validation extends Base_Class{
	ExtentTest test;
		
	@Test 
	void Job_Post_validation() throws Exception{
		
	
	test = extent.createTest("Job_Post_Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Agency");
	test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
	ScreenRecorderUtil.startRecord("Job_Post_Validation");
	test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
	WebDriver driver = getDriver();
	Post_job_page page= new Post_job_page(driver);	
	Login.Agency_Login();
	
 	 try {page.Click_On_Job_Tab();
	 	test.pass(MarkupHelper.createLabel("Clicked On Job Tab", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Job Tab",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Click_On_Get_Started();
	 	test.pass(MarkupHelper.createLabel("Click on Get Started Button", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Get Started Button",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_Post_Type();
	 	test.pass(MarkupHelper.createLabel("Seleted Job Post Type As Manual", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Job Post Type As Manual",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Click_On_Continue();
	 	test.pass(MarkupHelper.createLabel("Clicked On Continue Button", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Continue Button",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Search_Client();
	 	test.pass(MarkupHelper.createLabel("Searching Client", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Search Client",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_Client();
	 	test.pass(MarkupHelper.createLabel("Selected Client ", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Client",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Enter_Job_Titile();
	 	test.pass(MarkupHelper.createLabel("Entered Job Title", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Enter Job Title",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Search_Location();
	 	test.pass(MarkupHelper.createLabel("Searching Location", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Search Location",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_Location();
	 	test.pass(MarkupHelper.createLabel("Selected Location", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Location",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Search_Job_Type();
	 	test.pass(MarkupHelper.createLabel("Searching Job Type", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Search Job Type ",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_Job_Type();
	 	test.pass(MarkupHelper.createLabel("Selected Job Type As Full-time", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Select Job Type As Full-time",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Click_On_Experience();
	 	test.pass(MarkupHelper.createLabel("Clicked On Experience Dropdown", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Experience Dropdown",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_Experience();
	 	test.pass(MarkupHelper.createLabel("Selected Experience", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Experience",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Total_Openings();
	 	test.pass(MarkupHelper.createLabel("Entered Total No. Of Openings ", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Enter Total No. of Opening",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Search_Salary_Period();
	 	test.pass(MarkupHelper.createLabel("Searching Salary Period", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Search Salary Period",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_Salary_Period();
	 	test.pass(MarkupHelper.createLabel("Selected Monthly As a Salary Period ", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Monthly As a Salary Period ",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Search_Currency_type();
	 	test.pass(MarkupHelper.createLabel("Searching Currency Type", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Search Currency Type",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_Currency_Type();
	 	test.pass(MarkupHelper.createLabel("Selected INR As a Currency Type ", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select INR As a Currency Type ",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Salary_Range_From();
	 	test.pass(MarkupHelper.createLabel("Entered Salary Range Form", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Enter Salary Range Form",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Salary_Range_To();
	 	test.pass(MarkupHelper.createLabel("Entered Salary Range To", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Enter Salary Range To",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.selectJobBoards();
	 	test.pass(MarkupHelper.createLabel("Selected Job Boards", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Job Boards",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Add_JD_Type();
	 	test.pass(MarkupHelper.createLabel("Selected JD Type As Manual", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select JD Type As Manual",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Write_JD();
	 	test.pass(MarkupHelper.createLabel("Entered Job Description", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Enter Job Description",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}

	 try {page.Import_Skills_From_JD();
	 	test.pass(MarkupHelper.createLabel("Imported Skills From JD", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Import Skills From JD",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 
	 Thread.sleep(3000);
	 try {page.Click_On_Next();
	 	test.pass(MarkupHelper.createLabel("Clicked on Next button", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Next Button",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 
	 Thread.sleep(2000);
	 try {page.Open_Cv_Screeing();
	 	test.pass(MarkupHelper.createLabel("Clicked On CV Screening Stage", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Click On CV Screening Stage",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.CV_Screeing_Assignee();
	 	test.pass(MarkupHelper.createLabel("Clicked On Assignee Dropdon", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click On Assignee Dropdon",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_Cv_Team();
	 	test.pass(MarkupHelper.createLabel("Assigned Team Member ", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Assign Team Member ",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 
//************************************************{   Skill Assessment      }*******************************************
	 
 	 try {page.Add_More_Stage();
	 	test.pass(MarkupHelper.createLabel("Clicked On Add More Stage", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Add More Stage",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
		 
	 Thread.sleep(1000);
	 try {page.Add_Skill_Assessment();
	 	test.pass(MarkupHelper.createLabel("Selectd Skill Assessment Stage", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Skill Assessment Stage",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Confirm_Add();
	 	test.pass(MarkupHelper.createLabel("Confirmed To Add Stage", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Confirm To Add Stage",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
				 
	 Thread.sleep(1000);
	 try {page.Skill_Assignee();
	 	test.pass(MarkupHelper.createLabel("Clicked On Assignee Dropdown", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click On Assignee Dropdown",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_Skill_Team();
	 	test.pass(MarkupHelper.createLabel("Selected Team Member", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Team Member",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Compleation_Time();
	 	test.pass(MarkupHelper.createLabel("Entered Assessment Compleation Time", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Enter Assessment Compleation Time",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Selection_Mode();
	 	test.pass(MarkupHelper.createLabel("Selected Auto Mode of Adding Questions", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Select Auto Mode of Adding Questions",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Skill_Duration();
	 	test.pass(MarkupHelper.createLabel("Entered Assessment Duration", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Enter Assessment Duration",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 
 	 try {page.Add_Assessment();
	 	test.pass(MarkupHelper.createLabel("Clicked On Add Assessment Button", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Click On Add Assessment Button",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Choose_Assessment_folder();
	 	test.pass(MarkupHelper.createLabel("Selected Existing Skill Assessment Folder", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Select Existing Skill Assessment Folder",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_MCQ();
	 	test.pass(MarkupHelper.createLabel("Selected MCQ Question", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select MCQ Question",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_T_F();
	 	test.pass(MarkupHelper.createLabel("Selected T&F Question", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select T&F Question",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_SAQ();
	 	test.pass(MarkupHelper.createLabel("Selected SAQ Question", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select SAQ Question",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Continue();
	 	test.pass(MarkupHelper.createLabel("Clicked On Continue Button", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click On Continue Button ",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.MCQ_drop_down();
	 	test.pass(MarkupHelper.createLabel("Clicked On MCQ Dropdown", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on MCQ Dropdown",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Total_No_Of_Questions();
	 	test.pass(MarkupHelper.createLabel("Selected Total No. OF MCQ Questions", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Total No. OF Questions",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.TF_drop_down();
	 	test.pass(MarkupHelper.createLabel("Clicked On T&F Dropdown", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on T&F Dropdown",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Total_No_Of_Questions();
	 	test.pass(MarkupHelper.createLabel("Selected Total No. OF T&F Questions", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Total No. OF T&F Questions",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.SAQ_drop_down();
	 	test.pass(MarkupHelper.createLabel("Clicked On SAQ Dropdown", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click On SAQ Dropdown",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Total_No_Of_Questions();
	 	test.pass(MarkupHelper.createLabel("Selected Total No. OF SAQ Questions", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Total No. OF SAQ Questions",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 	 
	 
//	 ***************************************{   Add_Psychometric_Assessment }*****************************
	 
	 Thread.sleep(1000);
	 try {page.Add_More_Stage();
	 	test.pass(MarkupHelper.createLabel("Clicked On Add More Stage", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Add More Stage",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Add_Psychometric_Assessment();
		test.pass(MarkupHelper.createLabel("Selected Psychometric Assessment", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Psychometric Assessment",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Confirm_Add();
	 	test.pass(MarkupHelper.createLabel("Clicked on Confirm Add", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Confirm Add",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Psy_Assignee();
	 	test.pass(MarkupHelper.createLabel("Clicked on Asignee Dropdown", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Asignee Dropdown",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_Psy_team();
	 	test.pass(MarkupHelper.createLabel("Selected Team Member", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Team Member",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Psy_Compleation_time();
	 	test.pass(MarkupHelper.createLabel("Entered Assessment Compleation Time", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Enter Assessment Completion Time",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Psy_Selection_mode();
	 	test.pass(MarkupHelper.createLabel("Selected Auto Mode of Adding Questions", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Auto Mode of Adding Questions",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Psy_Add_Assessment();
	 	test.pass(MarkupHelper.createLabel("Clicked On Add Assessment Button", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Click On Add Assessment Button",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Choose_Psy_Assessment_Folder();
	 	test.pass(MarkupHelper.createLabel("Selected Existing Assessment Folder", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Existing Assessment Folder",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Psy_drop_down();
	 	test.pass(MarkupHelper.createLabel("Clicked On Question Dropdown", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Question Dropdown",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Total_No_Of_Questions();
	 	test.pass(MarkupHelper.createLabel("Selected Total No. OF Questions ", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Total No. Of Questions ",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
//==================================={One Way Assessment}=========================
	
	 
	 Thread.sleep(1000);
	 try {page.Add_More_Stage();
	 	test.pass(MarkupHelper.createLabel("Clicked On Add More Stage", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Add More Stage",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Add_One_Way_Assessment();
	 	test.pass(MarkupHelper.createLabel("Clicked On One-way Assessment", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click On One-way Assessment",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
			 
	 Thread.sleep(1000);
	 try {page.Confirm_Add();
	 	test.pass(MarkupHelper.createLabel("Clicked On Confirmed To Add", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Click On Confirmed To Add",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 Thread.sleep(1000); 
 	 try {page.One_Way_Assignee();
	 	test.pass(MarkupHelper.createLabel("Clicked On Assignee Dropdown", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click On Assignee Dropdown",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Select_One_Way_Team();
	 	test.pass(MarkupHelper.createLabel("Selected Team Member", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Team Member",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.One_way_Compleation_time();
	 	test.pass(MarkupHelper.createLabel("Entered Assessment Compleation time", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Enter Assessment Compleation time",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.One_way_selection_mode();
	 	test.pass(MarkupHelper.createLabel("Selected Auto Mode Of Adding Questions", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Select Auto Mode Of Adding Questions",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.One_Way_duration();
	 	test.pass(MarkupHelper.createLabel("Entered Assessment Duration ", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Enter Assessment Duration ",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.One_Way_Add_assessment();
	 	test.pass(MarkupHelper.createLabel("Clicked On Add Assessment Button", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click On Add Assessment Button",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Choose_One_Way_Assessment_folder();
	 	test.pass(MarkupHelper.createLabel("Clicked On Existing One-way Assessment Button", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Click On Existing One-way Assessment Button",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.One_way_drop_down();
	 	test.pass(MarkupHelper.createLabel("Clicked On Question Dropdown", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Click On Question Dropdown",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
 	 try {page.Total_No_Of_Questions();
	 	test.pass(MarkupHelper.createLabel("Selected Total No. Of Questions", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Total No. Of Questions",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();}
	 
	 
//******************************************[ Panel Interview ]************************************	 
	 
	 Thread.sleep(1000);
	 try {page.Add_More_Stage();
	 	test.pass(MarkupHelper.createLabel("Clicked On Add More Stage", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Add More Stage",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Add_Panel_Interview();
	 	test.pass(MarkupHelper.createLabel("Clicked on Panel Interview", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Panel Interview",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
		 
	 Thread.sleep(1000);
	 try {page.Confirm_Add();
	 	test.pass(MarkupHelper.createLabel("Clicked on Confirm Add", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Confirm Add",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Panel_Mode_Of_Interview();
	 	test.pass(MarkupHelper.createLabel("Selected Online Mode Of Enterview", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Select Online Mode Of Enterview",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 
//******************************************[ Technical Interview ]************************************	 

	 
	 Thread.sleep(1000);
	 try {page.Add_More_Stage();
	 	test.pass(MarkupHelper.createLabel("Clicked On Add More Stage", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Add More Stage",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Add_Technical_interview();
	 	test.pass(MarkupHelper.createLabel("Selected Technical interview", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Select Technical interview",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Confirm_Add();
	 	test.pass(MarkupHelper.createLabel("Clicked on Confirm Add", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Confirm Add",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 	Thread.sleep(1000);
	 try {page.Tech_Mode_Of_Interview();
	 	test.pass(MarkupHelper.createLabel("Selected Online Mode Of Enterview", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Select Online Mode Of Enterview",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 
	//******************************************[ HR Interview ]************************************	 

	 
	 Thread.sleep(1000);
	 try {page.Add_More_Stage();
	 	test.pass(MarkupHelper.createLabel("Clicked On Add More Stage", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Add More Stage",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}

	 Thread.sleep(1000);
	 try { page.Add_HR_Interview();
	 	test.pass(MarkupHelper.createLabel("Selected HR Interview", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Selected HR Interview",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 Thread.sleep(1000);
	 try {page.Confirm_Add();
	 	test.pass(MarkupHelper.createLabel("Clicked on Confirm Add", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click on Confirm Add",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
	 
	 	Thread.sleep(1000);
	 try {page.HR_Mode_of_interview();
	 	test.pass(MarkupHelper.createLabel("Selected Online Mode Of Enterview", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed To Select Online Mode Of Enterview",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
		ScreenRecorderUtil.stopRecord();
			}
		 
		Thread.sleep(1000);
		 try {page.Click_on_Next_Button();
		 	test.pass(MarkupHelper.createLabel("Clicked On Next Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To On Next Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Click_On_Post_Job();
		 	test.pass(MarkupHelper.createLabel("Clicked On Post Job Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Click On Post Job Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(3000);
		 try {Utility_Class.Toast_Message_Validation("Job posting completed successfully.");
		 	test.pass(MarkupHelper.createLabel("Posted Job Successfully.", ExtentColor.GREEN)); 
		 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); }
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Post Job", ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Got an Error Message : "+Utility_Class.Actual_Message);
			ScreenRecorderUtil.stopRecord(); }
		
		 
		 
}
	}
