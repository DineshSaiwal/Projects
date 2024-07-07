package Institution_Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Institution_Scenarios.Add_HOD_page;
import Base_Package.*;


public class Add_HOD extends Base_Class{
	public String Messages;
	ExtentTest test;
	
		@Test 
		void Add_Hod() throws Exception{
			
			test = extent.createTest("Add_HOD").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Institution");
			test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
			ScreenRecorderUtil.startRecord("Add_HOD");
			test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
			WebDriver driver = getDriver();
			Add_HOD_page page= new Add_HOD_page(driver);	
			Login.Institution_Login();
			
				
 				 try {page.Click_on_Teams_Tab();
				 	test.pass(MarkupHelper.createLabel("Clicked on Teams Tab", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Click on Teams Tab",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
			 			
				 	Thread.sleep(1000);
				 try {page.Click_on_Add_team();
				 	test.pass(MarkupHelper.createLabel("Clicked on Add Team", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Click on Add Team",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}				 
				 
					Thread.sleep(1000);
				 try {page.Upload_Profile();
				 	test.pass(MarkupHelper.createLabel("Profile Picture Uploaded", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Upload Profile Picture",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
				 
				 Thread.sleep(1000);
				 try {page.Enter_name();
				 	test.pass(MarkupHelper.createLabel("Name Entered Successfully", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Enter Name",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
				 
 				 try {page.Enter_Email();
				 	test.pass(MarkupHelper.createLabel("Email Entered Successfully", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Enter Email",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
				 				 
 				 try {page.Enter_Telephone_Number();
				 	test.pass(MarkupHelper.createLabel("Telephone Number Entered Successfully", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Enter Telephone Number",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}	
				 
 				 try {page.Click_on_Contry_Code();
				 	test.pass(MarkupHelper.createLabel("Clicked on Country Code", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Click on Country Code",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
				 
 				 try {page.Enter_Country_Code();
				 	test.pass(MarkupHelper.createLabel("Country Code Selected Successfully", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Select Country Code",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
				 
 				 try {page.Enter_Designation();
				 	test.pass(MarkupHelper.createLabel("Entered Designation Successfully", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Enter Designation",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
				 
//				 Thread.sleep(1000);
//				 try {page.Search_departmet("D5");
//				 	test.pass(MarkupHelper.createLabel("Searching for Department", ExtentColor.GREEN));} 
//				 catch (Exception e) {
//					test.fail(MarkupHelper.createLabel("Failed to search Department",  ExtentColor.RED));
//					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
//					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
//					ScreenRecorderUtil.stopRecord();
//						}
				 
				 
//				 Thread.sleep(1000);
//				 try {page.Select_Department();
//				 	test.pass(MarkupHelper.createLabel("Selected Department", ExtentColor.GREEN));} 
//				 catch (Exception e) {
//					test.fail(MarkupHelper.createLabel("Failed to Select Department",  ExtentColor.RED));
//					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
//					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
//					ScreenRecorderUtil.stopRecord();
//						}
				 
 				 try {page.Click_on_Add_Team_Button();
				 	test.pass(MarkupHelper.createLabel("Clicked on Add Team Member Button", ExtentColor.GREEN));} 
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Click on Add Team Member Button",  ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
					ScreenRecorderUtil.stopRecord();
						}
				 
				 						 
				Thread.sleep(2000);
				 try {Utility_Class.Toast_Message_Validation("New team member added successfully");
				 	test.pass(MarkupHelper.createLabel("Team Member Added Successfully", ExtentColor.GREEN)); 
				 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); }
				 catch (Exception e) {
					test.fail(MarkupHelper.createLabel("Failed to Add Team Member", ExtentColor.RED));
					test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
					test.log(Status.FAIL, "Got an Error Message : "+Utility_Class.Actual_Message);
					ScreenRecorderUtil.stopRecord(); }
				 
				ScreenRecorderUtil.stopRecord();
				test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));

				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
}}
