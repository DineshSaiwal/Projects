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
import Oragnization_Scenarios.One_Way_Assessment_Page_Upload;

public class One_Way_Assessment_Upload_Validation extends Base_Class{
	ExtentTest test;
		@Test 
		void One_Way_Assessment_Upload_validation() throws Exception{
			
			
		test = extent.createTest("One_Way_Assessment_Upload_Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Organization");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Started", ExtentColor.BLUE));
		ScreenRecorderUtil.startRecord("One_Way_Assessment_Upload_Validation");
		WebDriver driver = getDriver();
		One_Way_Assessment_Page_Upload page= new One_Way_Assessment_Page_Upload(driver);	
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
		 	test.pass(MarkupHelper.createLabel("Clicked on Assessments Tab", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Assessments Tab",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Click_On_One_Way_Tech();
		 	test.pass(MarkupHelper.createLabel("Clicked on One-way Tech. Assessments ", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on One-way Tech. Assessments",  ExtentColor.RED));
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
		 	test.pass(MarkupHelper.createLabel("Selected Bulk Upload Mode Of Adding Questions", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Select Bulk Upload Mode Of Adding Questions",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
 		 try {page.Click_On_Continue();
		 	test.pass(MarkupHelper.createLabel("Clicked on Continue Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Continue Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Upload_Excel_file();
		 	test.pass(MarkupHelper.createLabel("Excel File Selected", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Select Excel File",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(1000);
		 try {page.Click_On_Upload_Button();
		 	test.pass(MarkupHelper.createLabel("Clicked on Upload Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Upload Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}		 
		 
		 
		 Thread.sleep(1000);
		 try {page.Click_On_Save_Button();
		 	test.pass(MarkupHelper.createLabel("One-way Tech. Assessment Folder Created Successfully", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Create One-way Tech. AssessmentFolder",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			ScreenRecorderUtil.stopRecord();
				}
		 
		 Thread.sleep(3000);
		 try {Utility_Class.Toast_Message_Validation("Questions added successfully.");
		 	test.pass(MarkupHelper.createLabel("Questions Added From Excel File", ExtentColor.GREEN));
		 	test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot());  } 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed To Add Questions From Excel File", ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Got an Error Message : "+Utility_Class.Actual_Message);
			ScreenRecorderUtil.stopRecord(); }
		 
		 
		ScreenRecorderUtil.stopRecord();
		test.info(MarkupHelper.createLabel("Screen Recording Has Been Stopped", ExtentColor.BLUE));

}}
