package Agency_Scenarios;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Utility_Class;

public class Add_Client_Page extends Utility_Class{
	
		
		
		@FindBy(xpath = "//p[text()='My Clients']")
		private WebElement Click_on_Client_Tab;
		public void Click_On_Client_Tab(){
			Click_on_Client_Tab.click();	
		}
				
		@FindBy(xpath = "//span[contains(text(),'Add Client')]")
		private WebElement Click_on_Add_Client;
		public void Click_On_Add_Client(){
			Click_on_Add_Client.click();	
		}
		
		@FindBy(xpath = "//img[@alt='Profile']")
		private WebElement upload_profile;
		public void Upload_Profile() throws AWTException, InterruptedException{
	        upload_profile.click();
	        Utility_Class.Upload_File(Utility_Class.userdir+"\\Required_Files\\Profile_Picture.jpg");
		}
		
		@FindBy(name="name")
		private WebElement Enter_Name;
		public void Enter_Name() throws IOException{
			Enter_Name.sendKeys(CellData("Client_Details",1,1));	
		}
		
		@FindBy(name="address")
		private WebElement Enter_Address;	
		public void Enter_Address() throws IOException{
			Enter_Address.sendKeys(CellData("Client_Details",2,1));	
		}
				
		@FindBy(name="website_url")
		private WebElement Enter_website_url;
		public void Enter_Website_Url() throws IOException{
			Enter_website_url.sendKeys(CellData("Client_Details",3,1));	
		}
		
		@FindBy(name="industry")
		private WebElement Enter_Industry;
		public void Enter_Industry() throws IOException{
			Enter_Industry.sendKeys(CellData("Client_Details",4,1));	
		}
		
		@FindBy(name="email")
		private WebElement Enter_Email;
		public void Enter_Email() throws IOException{
			Enter_Email.sendKeys(CellData("Client_Details",5,1));	
		}
		@FindBy(name="phone_number")
		private WebElement Enter_phone_number;
		public void Enter_phone_number() throws IOException{
			Enter_phone_number.sendKeys(CellData("Client_Details",6,1));	
		}
		
		@FindBy(xpath = "(//input[@type='search'])[1]")
		private WebElement click_on_Contry_Code;
		public void Click_on_Contry_Code() throws IOException{
			click_on_Contry_Code.sendKeys(CellData("Client_Details",7,1));				
		}
		
		
		@FindBy(xpath = "//p[@class=' font-normal text-sm text-gray-primary']")
		private WebElement enter_country_code;
		public void Enter_Country_Code(){
			enter_country_code.click();}
		
		@FindBy(name="linkedin_url")
		private WebElement Enter_linkedin_url;
		public void Enter_Linkedin_url() throws IOException{
			Enter_linkedin_url.sendKeys(CellData("Client_Details",8,1));	
		}
		
		
		@FindBy(name="twitter_url")
		private WebElement Enter_twitter_url;
		public void Enter_Twitter_url() throws IOException{
			Enter_twitter_url.sendKeys(CellData("Client_Details",9,1));	
		}
		
		@FindBy(name="contact_name")
		private WebElement Enter_contact_name;
		public void Enter_Contact_name() throws IOException{
			Enter_contact_name.sendKeys(CellData("Client_Details",10,1));	
		}
		
		@FindBy(name="contact_email")
		private WebElement Enter_Contact_email;
		public void Enter_Contact_email() throws IOException{
			Enter_Contact_email.sendKeys(CellData("Client_Details",11,1));	
		}
		
		@FindBy(name="contact_phone_number")
		private WebElement Enter_Contact_Phone_number;
		public void Enter_Contact_Phone_number() throws IOException{
			Enter_Contact_Phone_number.sendKeys(CellData("Client_Details",12,1));	
		}
		
		@FindBy(xpath = "(//input[@type='search'])[2]")
		private WebElement click_on_Contact_Contry_Code;
		public void click_on_Contact_Contry_Code(){
			click_on_Contact_Contry_Code.sendKeys("India");				
		}
		
		
//		@FindBy(xpath = "//p[@class=' font-normal text-sm text-gray-primary']")
//		private WebElement enter_Contact_country_code;
//		public void enter_Contact_country_code(){
//			enter_Contact_country_code.click();}
		
		@FindBy(xpath = "(//span[text()=('Add Client')])[2]")
		private WebElement Click_On_Add_Client;
		public void Click_On_Add_Client_Button(){
			Click_On_Add_Client.click();				
		}
		
		
		public  Add_Client_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
			} 
}
