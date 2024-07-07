package Agency_Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Agency_Scenarios.Sync_CV_page;
import Base_Package.Base_Class;
import Base_Package.Login;
import Base_Package.ScreenRecorderUtil;
import Base_Package.Utility_Class;

public class Sync_Cv_Validation extends Base_Class{
	public String Messages;
	ExtentTest test;
	
		@Test 
		void Sync_CV_Validation() throws Exception{
			
			
		test = extent.createTest("Sync_Cv_Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Agency");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		ScreenRecorderUtil.startRecord("Sync_Cv_Validation");
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
		WebDriver driver = getDriver();
		Sync_CV_page page= new Sync_CV_page(driver);	
		Login.Agency_Login();
		
			
				Thread.sleep(1000);
			 try {page.Click_On_CV_Bank();
			 	test.pass(MarkupHelper.createLabel("Clicked On Cv Bank Tab", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Cv Bank Tab",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			Thread.sleep(1000);
			 try {page.Create_CV_Folder();
			 	test.pass(MarkupHelper.createLabel("Clicked On Create CV Folder", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Create CV Folder",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {page.Enter_Folder_Name();
			 	test.pass(MarkupHelper.createLabel("Entered Folder Name", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Folder Name",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {page.Add_Tags();
			 	test.pass(MarkupHelper.createLabel("Added Tags", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Add Tags",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {page.Click_On_Continue();
			 	test.pass(MarkupHelper.createLabel("Clicked On Continue", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Continue",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {page.Open_Cv_Folder();
			 	test.pass(MarkupHelper.createLabel("Opening Newly Created CV Folder", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Open Newly Created Cv Folder",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 
			 Thread.sleep(1000);
			 try {page.Click_On_Sync_folder();
			 	test.pass(MarkupHelper.createLabel("Clicked On Sync Folder Button ", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click On Sync Folder Button",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 Thread.sleep(1000);
			 try {page.Search_Job_folder();
			 	test.pass(MarkupHelper.createLabel("Searching Existing Job ", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Search Existing Job",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 Thread.sleep(1000);
			 try {page.Select_Job_folder();
			 	test.pass(MarkupHelper.createLabel("Selecting Job Folder", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Select Job Folder",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 Thread.sleep(1000);
			 try {page.Radio_Button();
			 	test.pass(MarkupHelper.createLabel("Clicked On Raido Button", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Radio Button",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {page.Click_On_Continue();
			 	test.pass(MarkupHelper.createLabel("Clicked On Continue", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Continue",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {page.Enter_Sub_Folder_Name();
			 	test.pass(MarkupHelper.createLabel("Entered Folder Name", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Folder Name",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(1000);
			 try {page.Click_On_Continue();
			 	test.pass(MarkupHelper.createLabel("Clicked On Continue", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Continue",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
					 
			 Thread.sleep(1000);
			 try {page.Confirm_Sync();
			 	test.pass(MarkupHelper.createLabel("Clicked On Confirm Sync ", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Confirm sync",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(2000);
			 try {Utility_Class.Toast_Message_Validation("Synced CV's successfully");
			 	test.pass(MarkupHelper.createLabel("CVs Successfully Synced From Job", ExtentColor.GREEN)); 
			 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); }
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Sync CV's From Job", ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Got an Error Message : "+Utility_Class.Actual_Message);
				ScreenRecorderUtil.stopRecord(); }
			
			 ScreenRecorderUtil.stopRecord();
			 test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));
			 
			 
		 
			 
}}
