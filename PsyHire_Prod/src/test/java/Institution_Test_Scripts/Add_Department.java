package Institution_Test_Scripts;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Institution_Scenarios.Add_Department_Page;
import Base_Package.*;


public class Add_Department extends Base_Class {
ExtentTest test;

	@Test 
	void Add_Department_Validation() throws Exception{
		
		
		test = extent.createTest("Add_Department").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Institution");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		ScreenRecorderUtil.startRecord("Add_Department_Validation");
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
		WebDriver driver = getDriver();
		Add_Department_Page page= new Add_Department_Page(driver);	
		
		Login.Institution_Login();
		
 		 try {page.Click_on_Department();
		 	test.pass(MarkupHelper.createLabel("Clicked on Department Tab", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Department Tab",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			  ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.click_on_Add_department();
		 	test.pass(MarkupHelper.createLabel("Clicked on Add Department Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Add Department Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			 ScreenRecorderUtil.stopRecord();		
		 		}
	 
		 Thread.sleep(1000);
		 try {page.department_name();
		 	test.pass(MarkupHelper.createLabel("Entered Department Name", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Enter Department Name",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			 ScreenRecorderUtil.stopRecord();
				}
		 
 		 try {page.Click_on_Dropdown();
		 	test.pass(MarkupHelper.createLabel("Clicked on Assigne Head Dropdown", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Assigne Head Dropdown",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			 ScreenRecorderUtil.stopRecord();
				}
	 
 		 try {page.Select_HOD("Dinesh Saiwal");
		 	test.pass(MarkupHelper.createLabel("HOD Selected", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Select HOD",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			 ScreenRecorderUtil.stopRecord();
				}
			 
 		 try {page.Create_Department();
		 	test.pass(MarkupHelper.createLabel("Clicked on Add Department Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Add Department Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			 ScreenRecorderUtil.stopRecord();
				}
	 
		 Thread.sleep(000);
		 try {Utility_Class.Toast_Message_Validation("Department Added Successfully");
		 	test.pass(MarkupHelper.createLabel("Department Added Successfully", ExtentColor.GREEN)); 
		 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); }
		 catch (AssertionError e) {
			test.fail(MarkupHelper.createLabel("Failed to Add Department ", ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Got an Error Message : "+Utility_Class.Actual_Message);
			ScreenRecorderUtil.stopRecord(); }
		 
		 
		 
	 
		 ScreenRecorderUtil.stopRecord();
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}}
