package Organization_Test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Base_Class;
import Base_Package.Login;
import Base_Package.ScreenRecorderUtil;
import Base_Package.Utility_Class;
import Oragnization_Scenarios.Psy_Assessment_Page_Database;

public class Psy_Assessment_Database_Validation extends Base_Class{
	ExtentTest test;
	public String Messages;
	
		@Test 
		void Psy_Assessment_Database_validation() throws Exception{
			
			
		test = extent.createTest("Psy_Assessment_Database_Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Organization");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
		ScreenRecorderUtil.startRecord("Psy_Assessment_Database_Validation");
		WebDriver driver = getDriver();
		Psy_Assessment_Page_Database page= new Psy_Assessment_Page_Database(driver);	
		Login.Organization_Login();
		
			
 		 try {page.Click_on_Settings();
		 	test.pass(MarkupHelper.createLabel("Clicked on Settings", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Settings",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Click_on_Data_Bank();
		 	test.pass(MarkupHelper.createLabel("Clicked on Data_Bank", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Data_Bank",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
 		 try {page.Click_On_Assessments();
		 	test.pass(MarkupHelper.createLabel("Clicked on Assessments tab", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Assessments tab",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Click_On_Psy_Assessments();
		 	test.pass(MarkupHelper.createLabel("Clicked on Psychometric Assessments ", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Psychometric Assessments",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Click_On_Add_Assessments();
		 	test.pass(MarkupHelper.createLabel("Clicked on Add_Assessments", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Add_Assessments",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
 		 try {page.Enter_Folder_Name();
		 	test.pass(MarkupHelper.createLabel("Entered_Folder_Name", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Enter Folder Name",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
 		 try {page.Click_On_Create_Assessment_Button();
		 	test.pass(MarkupHelper.createLabel("Clicked on Create_Assessment_Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Create_Assessment_Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Method_Of_Adding_Questions();
		 	test.pass(MarkupHelper.createLabel("Selected Create Mode Of Adding Questions", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Select Create Mode Of Adding Questions",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Click_On_Continue();
		 	test.pass(MarkupHelper.createLabel("Clicked on Continue Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Continue Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Click_On_Existing_Domain();
		 	test.pass(MarkupHelper.createLabel("Clicked on Existing Domain Card", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Existing Domain Card",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		
//		 Thread.sleep(1000);
//		 try {page.Select_One_Questions();
//		 	test.pass(MarkupHelper.createLabel("Selected One Questins", ExtentColor.GREEN));} 
//		 catch (Exception e) {
//			test.fail(MarkupHelper.createLabel("Failed to One All Questin",  ExtentColor.RED));
//			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
//			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
//			ScreenRecorderUtil.stopRecord();
//				}
		 
		 Thread.sleep(1000);
		 try {page.Select_All_Questions();
		 	test.pass(MarkupHelper.createLabel("Selected All Questins", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Select All Questin",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Click_On_Add_To_Folder();
		 	test.pass(MarkupHelper.createLabel("Clicked on Add to folder Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Add to folder Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {Utility_Class.Toast_Message_Validation("Added questions from database");
		 	test.pass(MarkupHelper.createLabel("Added Questions From Database", ExtentColor.GREEN));
		 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot());  } 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Add Questions From Database", ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Got an Error Message : "+Utility_Class.Actual_Message);
			ScreenRecorderUtil.stopRecord(); }
		 	
				 
		ScreenRecorderUtil.stopRecord();
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));

}}
