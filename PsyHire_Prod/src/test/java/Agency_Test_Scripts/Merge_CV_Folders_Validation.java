package Agency_Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Agency_Scenarios.Merge_CV_Folders_Page;
import Base_Package.Base_Class;
import Base_Package.Login;
import Base_Package.ScreenRecorderUtil;
import Base_Package.Utility_Class;

public class Merge_CV_Folders_Validation extends Base_Class{
	ExtentTest test;
	
		@Test 
		void Merge_CV_Folders_validation() throws Exception{
			
			
		test = extent.createTest("Merge_CV_Folders_Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Agency");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		ScreenRecorderUtil.startRecord("Merge_CV_Folders_validation");
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
		WebDriver driver = getDriver();
		Merge_CV_Folders_Page page= new Merge_CV_Folders_Page(driver);	
		Login.Agency_Login();
		
			
				
			 try {page.Click_On_CV_Bank_Tab();
			 	test.pass(MarkupHelper.createLabel("Clicked On Cv Bank Tab", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Cv Bank Tab",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			Thread.sleep(1000);
			 try {page.Click_on_Cv_Folder();
			 	test.pass(MarkupHelper.createLabel("Clicked On Existing CV Folder", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Existing CV Folder",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {page.Create_CV_Folder();
			 	test.pass(MarkupHelper.createLabel("Click On Create Sub-CV Folder", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click Create Sub-CV Folder",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 
			 Thread.sleep(1000);
			 try {page.Enter_Folder_Name();
			 	test.pass(MarkupHelper.createLabel("Entered Sub-CV Folder Name", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Sub-CV Folder Name",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {page.Click_On_Continue();
			 	test.pass(MarkupHelper.createLabel("Clicked On Continue Button", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click On Continue Button",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			
			 Thread.sleep(1000);
			 try {page.Click_Merge_Folder();
			 	test.pass(MarkupHelper.createLabel("Click on Merge CV Folder Button", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click On Merge Cv Folder Button",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {page.Select_CV_Folders();
			 	test.pass(MarkupHelper.createLabel("Selected Cv Folders ", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Select Sv Folders",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 
			 Thread.sleep(1000);
			 try {page.Click_Merge_Folder();
			 	test.pass(MarkupHelper.createLabel("Click on Merge CV Folder Button", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click On Merge Cv Folder Button",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 
			 Thread.sleep(1000);
			 try {page.Enter_Merged_Folder_Name();
			 	test.pass(MarkupHelper.createLabel("Enter Merge Cv Folder Name", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed To Enter Merge Cv Folder Name",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {page.Click_On_Confirm_Merge();
			 	test.pass(MarkupHelper.createLabel("Click On Confirm Merge", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed To Click On Confirm Merge",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 	
			 Thread.sleep(2000);
			 try {Utility_Class.Toast_Message_Validation("Merged folders successfully");
			 	test.pass(MarkupHelper.createLabel("Merged folders successfully", ExtentColor.GREEN)); 
			 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); }
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Merged folders", ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Got an Error Message : "+Utility_Class.Actual_Message);
				ScreenRecorderUtil.stopRecord(); }
			
			 ScreenRecorderUtil.stopRecord();
			 test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));
			 
			 
		 
			 
}}
