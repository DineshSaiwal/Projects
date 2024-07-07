package Agency_Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Agency_Scenarios.Add_Client_Page;
import Base_Package.Base_Class;
import Base_Package.Login;
import Base_Package.ScreenRecorderUtil;
import Base_Package.Utility_Class;

public class Add_Client extends Base_Class {
	ExtentTest test;

		
		@Test 
		void Add_Client_Validation() throws Exception{
			
			
			test = extent.createTest("Add_Client_Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Agency");
			test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
			test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
			ScreenRecorderUtil.startRecord("Add_Client_Validation");
			WebDriver driver = getDriver();
			Add_Client_Page page= new Add_Client_Page(driver);	
			Login.Agency_Login();
			
			 
			 try {page.Click_On_Client_Tab();
			 	test.pass(MarkupHelper.createLabel("Clicked On Client Tab", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Client Tab",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 Thread.sleep(2000);
			 try {page.Click_On_Add_Client();
			 	test.pass(MarkupHelper.createLabel("Clicked on Add Client ", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Click on Add Client",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
//			 			 
//			 Thread.sleep(1000);
//			 try {page.Upload_Profile();
//			 	test.pass(MarkupHelper.createLabel("Profile Uploaded", ExtentColor.GREEN));} 
//			 catch (Exception e) {
//				test.fail(MarkupHelper.createLabel("Failed To Upload Profile",  ExtentColor.RED));
//				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
//				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
//			 ScreenRecorderUtil.stopRecord();
//					}
			 
			  
			 try {page.Enter_Name();
			 	test.pass(MarkupHelper.createLabel("Entered Client Name", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Client Enter Name",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 
			 try {page.Enter_Address();
			 	test.pass(MarkupHelper.createLabel("Entered Address", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Addredd",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 			 
			  
			 try {page.Enter_Website_Url();
			 	test.pass(MarkupHelper.createLabel("Entered Website Url", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Website Url",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			  
			 try {page.Enter_Industry();
			 	test.pass(MarkupHelper.createLabel("Entered Industry Type", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Industry Type",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 
			  
			 try {page.Enter_Email();
			 	test.pass(MarkupHelper.createLabel("Entered Email", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Email",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			  
			 try {page.Enter_phone_number();
			 	test.pass(MarkupHelper.createLabel("Entered Phone No.", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Phone No.",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			  
			 try {page.Click_on_Contry_Code();
			 	test.pass(MarkupHelper.createLabel("Searching County Code", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Search Contry Code",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 			 
			  
			 try {page.Enter_Country_Code();
			 	test.pass(MarkupHelper.createLabel("Entered County Code", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Entered Country Code",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 			 
			  
			 try {page.Enter_Linkedin_url();
			 	test.pass(MarkupHelper.createLabel("Entered Linkedin Url", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Linkedin Url",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			  
			 try {page.Enter_Twitter_url();
			 	test.pass(MarkupHelper.createLabel("Entered Twitter Url", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Entered Twitter Url",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 
			 try {page.Enter_Contact_name();
			 	test.pass(MarkupHelper.createLabel("Entered Contact Name ", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Entered Contact Name",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 
			  
			 try {page.Enter_Contact_email();
			 	test.pass(MarkupHelper.createLabel("Entered Contact Email", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Contact Email",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 			 
			  
			 try {page.Enter_Contact_Phone_number();
			 	test.pass(MarkupHelper.createLabel("Entered Contact Phone No.", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Enter Contact phone No.",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			  
			 try {page.click_on_Contact_Contry_Code();
			 	test.pass(MarkupHelper.createLabel("Searching County Code", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Search County Code ",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 			 
			  
			 try {page.Enter_Country_Code();
			 	test.pass(MarkupHelper.createLabel("Selected County Code", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Select County Code",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			 
			 try {page.Click_On_Add_Client_Button();
			 	test.pass(MarkupHelper.createLabel("Clicked On Add Client Button", ExtentColor.GREEN));} 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to Clicked on Add Client Button",  ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				ScreenRecorderUtil.stopRecord();
					}
			 
			
				 
			 Thread.sleep(2000);
			 try {Utility_Class.Toast_Message_Validation("New client added successfully");
			 	test.pass(MarkupHelper.createLabel("New client added successfully", ExtentColor.GREEN));
			 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot());  } 
			 catch (Exception e) {
				test.fail(MarkupHelper.createLabel("Failed to add Client ", ExtentColor.RED));
				test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
				test.log(Status.FAIL, "Got an Error Message : "+Utility_Class.Actual_Message);
				ScreenRecorderUtil.stopRecord();
			 }
	 
		 	
		 	ScreenRecorderUtil.stopRecord();
		 	test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
}}
