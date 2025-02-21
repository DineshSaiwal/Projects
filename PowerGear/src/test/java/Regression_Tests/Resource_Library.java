package Regression_Tests;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Base_Class;
import Base_Package.PowerGear;
import Base_Package.Utility_Class;
import Scenarios.Resource_Library_Page;

public class Resource_Library extends Base_Class{

	public static Resource_Library_Page page;
	ExtentTest test;

	@Test
	void Add_Resource_Library_Validation() throws IOException, InterruptedException, AWTException  {
		
		test = extent.createTest("Add Resource Library").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Regression Test");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		page= new Resource_Library_Page(driver);
		PowerGear.Login();
		
		Thread.sleep(1000);
		 try {page.ClickHSProposal();
		 	test.pass(MarkupHelper.createLabel("Clicked On Resource Library", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Resource Library",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
	
		 try {page.Clickupload();Thread.sleep(1000);
		 	test.pass(MarkupHelper.createLabel("Clicked On Upload Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Upload Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
	
		 try {page.EnterdocDetails();Thread.sleep(1000);
		 	test.pass(MarkupHelper.createLabel("Entered Doc Details", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Enter Doc Details",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 
	 	 try {page.UploadFile();Thread.sleep(1000);
		 	test.pass(MarkupHelper.createLabel("Clicked Upload file", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click Uplaod file",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 
		 try {page.SelectTag();Thread.sleep(1000);
		 	test.pass(MarkupHelper.createLabel("Select Tag", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Select Tag",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 try {page.ConfirmUpload();Thread.sleep(1000);
		 	test.pass(MarkupHelper.createLabel("Confirmed Uplaod", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to click on Confirm Upload",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 Thread.sleep(1000);
		 try {Utility_Class.Toast_Message_Validation("Resource created successfully");
		 	test.pass(MarkupHelper.createLabel("Resource created successfully", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Did't got Success Message",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 
		 
	
	}
	 @Test
	 void Update_Resource_Bank() throws InterruptedException {
		test = extent.createTest("Update Resource Library Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Regression Test");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
			
		 try {page.HoverProposal();Thread.sleep(1000);
		 	test.pass(MarkupHelper.createLabel("Hover on Resource", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Hover on Resource",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 
		 try {page.ClickEdit();Thread.sleep(1000);
		 	test.pass(MarkupHelper.createLabel("Clicked on Edit", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click On Edit",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 
		 try {page.FileTitle();Thread.sleep(1000);
		 	test.pass(MarkupHelper.createLabel("Updated Title", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Update title ",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 
		 try {page.UpdatedDocDetails();Thread.sleep(1000);
		 	test.pass(MarkupHelper.createLabel("Updated Doc Details", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Update Doc Details",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 
		 try {page.saveChanges();Thread.sleep(1000);
		 	test.pass(MarkupHelper.createLabel("Click On Save Changes", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Save changes",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 
		 Thread.sleep(1000);
		 try {Utility_Class.Toast_Message_Validation("Resource updated successfully");
		 	test.pass(MarkupHelper.createLabel("Resource updated successfully", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Did't got Success Message",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
	 }
	 @Test
	 void Delete_Resource_Bank() throws InterruptedException {
		 test = extent.createTest("Delete Resource Library Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Regression Test");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
			
		 
		 try {page.HoverProposal();Thread.sleep(1000);
		 	test.pass(MarkupHelper.createLabel("Hover on Resource", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Hover on Resource",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 
		 try {page.ClickDelete();Thread.sleep(1000);
		 	test.pass(MarkupHelper.createLabel("Clicked on Delete Icon", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Delete Icon",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 
		 try {page.ConfirmDelete();Thread.sleep(1000);
		 	test.pass(MarkupHelper.createLabel("Clicked on Confirm Delete", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Confirm Delete",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 
		 Thread.sleep(1000);
		 try {Utility_Class.Toast_Message_Validation("Resource deleted successfully");
		 	test.pass(MarkupHelper.createLabel(" Resource deleted successfully", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Did't got Success Message",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 
		
		 }
		 	 
	
}
