package Institution_Scenarios;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Utility_Class;

public class Add_HOD_page {
			
	
			
	
			@FindBy(xpath = "//p[text()='Teams']")
			private WebElement click_on_teams_tab;
			public void Click_on_Teams_Tab(){
				click_on_teams_tab.click();
			}
			
			@FindBy(xpath = "//p[text()='Add team']")
			private WebElement click_on_Add_team;
			public void Click_on_Add_team(){
				click_on_Add_team.click();
			}
			
			@FindBy(xpath = "//img[@alt='Profile']")
			private WebElement upload_profile;
			public void Upload_Profile() throws AWTException, InterruptedException{
		        upload_profile.click();
		        Utility_Class.Upload_File(Utility_Class.userdir+"\\Required_Files\\Profile_Picture.jpg");
			}
	
			@FindBy(name="name")
			private WebElement enter_name;
			public void Enter_name(){
				enter_name.sendKeys("Team member");
			}
	
			@FindBy(name="email")
			private WebElement enter_email;
			public void Enter_Email(){
				enter_email.sendKeys("hod01@institute.com");
			}
	
			@FindBy(name="phone_number")
			private WebElement enter_Telephone_Number;
			public void Enter_Telephone_Number(){
				enter_Telephone_Number.sendKeys("123456789");
				
			}
	
			
			@FindBy(xpath = "(//input[@type='search'])[1]")
			private WebElement click_on_Contry_Code;
			public void Click_on_Contry_Code(){
				click_on_Contry_Code.sendKeys("India");				
			}
			
			
			@FindBy(xpath = "//p[@class=' font-normal text-sm text-gray-primary']")
			private WebElement enter_country_code;
			public void Enter_Country_Code(){
				enter_country_code.click();
			}
	
			
			@FindBy(name="designation")
			private WebElement enter_designation;
			public void Enter_Designation(){
				enter_designation.sendKeys("Mechanical HOD");;
			}
				
			
			@FindBy(xpath = "(//input[@type='search'])[2]")
			private WebElement Entered_Dept;
			public void Search_departmet(String Name_of_Department){
				Entered_Dept.sendKeys(Name_of_Department);				
			}
			
			@FindBy(xpath = "//div[@class='mantine-1hcv8aj mantine-MultiSelect-item']")
			private WebElement select_dept;
			public void Select_Department(){
				select_dept.click();
			}
			
	
			@FindBy(xpath = "//span[text()='Add team member']")
			private WebElement click_on_Add_team_button;
			public void Click_on_Add_Team_Button(){
				click_on_Add_team_button.click();
			}
	
	
			public  Add_HOD_page(WebDriver driver) {
					PageFactory.initElements(driver, this);
				}
			
			
			

}
