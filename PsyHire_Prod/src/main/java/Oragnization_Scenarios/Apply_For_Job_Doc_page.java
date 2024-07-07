package Oragnization_Scenarios;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Package.Base_Class;
import Base_Package.Utility_Class;

public class Apply_For_Job_Doc_page extends Utility_Class{

	WebDriver driver = Base_Class.getDriver();
		@FindBy(xpath = "//p[contains(text(),'Jobs')]")
		private WebElement Click_on_Job_Tab;
		public void Click_On_Job_Tab() {Click_on_Job_Tab.click();}
		
			
		@FindBy(xpath = "(//img[@alt='Copy link'])[1]")
		private WebElement Copy_URL_icon;
		public void Click_On_Copy_URL_icon() {
			WebDriverWait wait = new WebDriverWait( driver,Duration.ofSeconds(15));
	        WebElement element = wait.until(ExpectedConditions.visibilityOf(Copy_URL_icon));
	        element.click();}
		
		public void Job_Application_Page() throws HeadlessException, UnsupportedFlavorException, IOException {
        String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        driver.get(myText);
		}
		
		@FindBy(xpath = "(//span[contains(text(),'Apply now')])[1]")
		private WebElement Click_On_Apply_button;
		public void Click_On_Apply_Button() {Click_On_Apply_button.click();}
		
		@FindBy(xpath = "//button[contains(text(),'Upload photo')]")
		private WebElement Upload_Profile;
		public void Upload_Profile_Picture() throws AWTException, InterruptedException {Upload_Profile.click();
		Utility_Class.Upload_File(Utility_Class.userdir+"\\Required_Files\\Profile_Picture.jpg");
		}
		
		@FindBy(name = "name")
		private WebElement Enter_name;
		public void Enter_Name() throws IOException {Enter_name.sendKeys(CellData("Job_Apply", 1, 3));}
		
		@FindBy(name = "email")
		private WebElement Enter_email;
		public void Enter_Email() throws IOException {Enter_email.sendKeys(CellData("Job_Apply", 2, 3));}
		
		@FindBy(name = "phone_number")
		private WebElement Enter_phone_number;
		public void Enter_Phone_Number() throws IOException {Enter_phone_number.sendKeys(CellData("Job_Apply", 3, 3));}
		
		@FindBy(xpath = "(//input[@type='search'])[1]")
		private WebElement click_on_Contry_Code;
		public void Click_on_Contry_Code() throws IOException{click_on_Contry_Code.sendKeys(CellData("Job_Apply", 4, 3));	}
		
		@FindBy(xpath = "//div[@role='option']")
		private WebElement enter_country_code;
		public void Enter_Country_Code(){enter_country_code.click();}
		
		@FindBy(name = "location")
		private WebElement Enter_location;
		public void Enter_Location() throws IOException {Enter_location.sendKeys(CellData("Job_Apply", 5, 3));}
		
		@FindBy(name = "current_designation")
		private WebElement Enter_current_designation;
		public void Enter_Current_Designation() throws IOException {Enter_current_designation.sendKeys(CellData("Job_Apply", 6, 3));}
		
		@FindBy(name = "experience_in_years")
		private WebElement Enter_experience_in_years;
		public void Enter_Experience_In_Years() throws IOException {Enter_experience_in_years.sendKeys(CellData("Job_Apply", 7, 3));}
		
		@FindBy(name = "experience_in_months")
		private WebElement Enter_experience_in_months;
		public void Enter_Experience_In_Months() throws IOException {Enter_experience_in_months.sendKeys(CellData("Job_Apply", 8, 3));}
		
		@FindBy(name = "notice_period")
		private WebElement Enter_notice_period;
		public void Enter_Notice_Period() throws IOException {Enter_notice_period.sendKeys(CellData("Job_Apply", 9, 3));}
		
		
		@FindBy(xpath = "(//input[@type='search'])[2]")
		private WebElement choose_a_source;
		public void Click_on_Source(){choose_a_source.click();	}
		
		//Use line no 62 here
		
		
		@FindBy(xpath = "//span[contains(text(),'upload cover letter')]")
		private WebElement Upload_Cover_letter;
		public void Upload_Cover_Letter() throws AWTException, InterruptedException {Upload_Cover_letter.click();
		Utility_Class.Upload_File(Utility_Class.userdir+"\\Required_Files\\Cover Letter.docx");
		}
		
		@FindBy(xpath = "//div[@role='presentation']")
		private WebElement Upload_Resume_pdf;
		public void Upload_Resume_Doc() throws AWTException, InterruptedException {Upload_Resume_pdf.click();
		Utility_Class.Upload_File(Utility_Class.userdir+"\\Required_Files\\Resume.docx");
		}
		
		@FindBy(xpath = "//input[@type='checkbox']")
		private WebElement Check_T_and_C;
		public void Check_T_And_C(){Check_T_and_C.click();	}
		
		
		@FindBy(xpath = "//span[contains(text(),'Apply')]")
		private WebElement Click_on_Apply_button;
		public void Click_on_Apply_Button(){Click_on_Apply_button.click();	}
		
			
		public  Apply_For_Job_Doc_page(WebDriver driver) {
			PageFactory.initElements(driver, this);
			} 

	
}
