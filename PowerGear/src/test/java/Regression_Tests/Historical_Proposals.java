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
import Scenarios.Historical_Proposals_Page;

public class Historical_Proposals extends Base_Class{
	public static Historical_Proposals_Page page;
	ExtentTest test;

	@Test
	void Add_Proposal_Validation() throws IOException, InterruptedException, AWTException  {
		
		test = extent.createTest("Add_Proposal_Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Regression Test");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		page= new Historical_Proposals_Page(driver);
		PowerGear.Login();
		
		 try {page.ClickHSProposal();
		 	test.pass(MarkupHelper.createLabel("Clicked On Historical Proposal", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Historical Proposal",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 Thread.sleep(1000);
		 try {page.Clickupload();
		 	test.pass(MarkupHelper.createLabel("Clicked On Upload Button", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Upload Button",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 Thread.sleep(1000);
		 try {page.SelectMode();
		 	test.pass(MarkupHelper.createLabel("Selected Upload Mode As Single", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Select Upload Mode As Single",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 Thread.sleep(1000);
		 try {page.proposalTitle();
		 	test.pass(MarkupHelper.createLabel("Entered Proposal Title", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Enter Proposal Title",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 Thread.sleep(1000);
		 try {page.client();
		 	test.pass(MarkupHelper.createLabel("Entered Client Title", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Enter Client Title",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 Thread.sleep(1000);
		 try {page.Click_bidStatus();
		 	test.pass(MarkupHelper.createLabel("Clicked on Bid Status Dropdpwn", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Bid Status Dropdpwn",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 Thread.sleep(1000);
		 try {page.Select_Status();
		 	test.pass(MarkupHelper.createLabel("Selected Bid Status", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Select Bid Status",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 Thread.sleep(1000);
		 try {page.Click_ReceivedProposal();
		 	Utility_Class.Upload_File(userdir+"\\Files\\1348305_02.pdf");
		 	test.pass(MarkupHelper.createLabel("Uploaded Received Proposal", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Upload Received Proposal",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 Thread.sleep(1000);
		 try {page.Click_SubmittedProposal();
			Utility_Class.Upload_File(userdir+"\\Files\\1348373_02.pdf");
		 	test.pass(MarkupHelper.createLabel("Uploaded Submitted Proposal", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Upload Submitted Proposal",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 Thread.sleep(1000);
		 try {page.UploadProposal();
		 	test.pass(MarkupHelper.createLabel("Confirmed Upload Proposal ", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Confirmed Upload Proposal",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		
		 
		 
	
	}
	
	@Test(dependsOnMethods = "Add_Proposal_Validation")
	void Update_Proposal_Validation() throws InterruptedException {
		test = extent.createTest("Update_Proposal_Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Regression Test");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		Thread.sleep(1000);
		 try {page.HoverProposal();
		 	test.pass(MarkupHelper.createLabel("Hover On Existing Proposal", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Hover On Existing Proposal",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 Thread.sleep(1000);
		 try {page.ClickEdit();
		 	test.pass(MarkupHelper.createLabel("Clicked on Edit Icon", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Edit Icon",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				}
		 Thread.sleep(1000);
		 try {page.EditTitle();
		 	test.pass(MarkupHelper.createLabel("Updated Title", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Update Title",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				} 
		 Thread.sleep(1000);
		 try {page.Editclient();
		 	test.pass(MarkupHelper.createLabel("Updated Client Title", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Update Client Title",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				} 
		 Thread.sleep(1000);
		 try {page.SelectDueDate();
		 	test.pass(MarkupHelper.createLabel("Selected Due Date", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Select due date",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				} 
		 Thread.sleep(1000);
		 try {page.Click_bidStatus();
		 	test.pass(MarkupHelper.createLabel("Clicked On Bid Status Dropdown", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click on Bid Status Dropdown",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				} 
		 Thread.sleep(1000);
		 try {page.UpdateStatus();
		 	test.pass(MarkupHelper.createLabel("Updated Status of The Proposal", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Updated Status of The Proposal",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				} 
		 Thread.sleep(1000);
		 try {page.SaveChanges();
		 	test.pass(MarkupHelper.createLabel("Clicked On Confirm Upated", ExtentColor.GREEN));} 
		 catch (Exception e) {
			test.fail(MarkupHelper.createLabel("Failed to Click On Confirm Upated",  ExtentColor.RED));
			test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
			test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
				} 
	
	}
	
	
	
	@Test(dependsOnMethods = "Update_Proposal_Validation")
	void Delete_Proposal_Validation() throws InterruptedException {
		test = extent.createTest("Delete_Proposal_Validation").assignAuthor("Dinesh_Saiwal").assignDevice(browserName).assignCategory("Regression Test");
		test.info(MarkupHelper.createLabel("Test Case Executed On { "+ browserName +" } Browser", ExtentColor.BLUE));
		Thread.sleep(1000);
		try {page.HoverProposal();
	 	test.pass(MarkupHelper.createLabel("Hover on Existing Proposal", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Hover on Existing Proposal",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			} 
		Thread.sleep(1000);
		try {page.ClickDelete();
	 	test.pass(MarkupHelper.createLabel("Clicked on Delete Icon", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Click On Delete Icon",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			} 
		Thread.sleep(1000);
		try {page.delete();
	 	test.pass(MarkupHelper.createLabel("Confirmed Delete", ExtentColor.GREEN));} 
	 catch (Exception e) {
		test.fail(MarkupHelper.createLabel("Failed to Confirm Delete",  ExtentColor.RED));
		test.addScreenCaptureFromBase64String(Utility_Class.Capture_Screenshot()); 
		test.log(Status.FAIL, "Exception occurred ==> " + e.getMessage());
			} 
		
	}
	
	
	
	
	
	
	
	
	
	
	
}