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
import Oragnization_Scenarios.One_Way_Assessment_Page_Create;

public class One_Way_Assessment_Create_Validation extends Base_Class{
	ExtentTest test;
	public String Messages;
		@Test 
		void One_Way_Assessment_Create_validation() throws Exception{
			
			
		test = extent.createTest("One_Way_Assessment_Create_Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Organization");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
		ScreenRecorderUtil.startRecord("One_Way_Assessment_Create_Validation");
		WebDriver driver = getDriver();
		One_Way_Assessment_Page_Create page= new One_Way_Assessment_Page_Create(driver);	
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
		 
		 Thread.sleep(1000);
		 try {page.Click_On_Assessments();
		 	test.pass(MarkupHelper.createLabel("Clicked on Assessments tab", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Assessments tab",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Click_on_One_Way_Assessment();
		 	test.pass(MarkupHelper.createLabel("Clicked on One_Way_Assessment", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on One_Way_Assessment",  ExtentColor.RED));
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
		 
		 Thread.sleep(1000);
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
		 try {page.Write_Questions();
		 	test.pass(MarkupHelper.createLabel("Entered Question", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Enter Question",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		
 		 try {page.Click_On_Save();
		 	test.pass(MarkupHelper.createLabel("Clicked on Save Question Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Save Question Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
			 
		 Thread.sleep(1000);
		 try {page.Click_On_Save();
		 	test.pass(MarkupHelper.createLabel("Clicked on Save Assessment Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Save Assessment Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(3000);
		 try {Utility_Class.Toast_Message_Validation("Added Question");
		 	test.pass(MarkupHelper.createLabel("One-Way Tech. Assessment Folder Created Successfully", ExtentColor.GREEN));
		 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot());  } 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Create One-Way Tech. Assessment" , ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Got an Error Message : "+Utility_Class.Actual_Message);
			ScreenRecorderUtil.stopRecord(); }
		 
				 
		ScreenRecorderUtil.stopRecord();
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));

}}
