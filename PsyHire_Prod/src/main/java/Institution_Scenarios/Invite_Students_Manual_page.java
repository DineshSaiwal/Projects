package Institution_Scenarios;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invite_Students_Manual_page {
	
				@FindBy(xpath = "//p[text()='Department']")
				private WebElement click_on_department;
				public void Click_on_Department() 
				{click_on_department.click();}
				
				@FindBy(xpath = "(//div[@class='text-gray-primary font-light '])[1]")
				private WebElement click_on_department_card;
				public void Click_on_Department_Card() 
				{click_on_department_card.click();}
				
				@FindBy(xpath = "//span[text()='Invite students']")
				private WebElement click_on_invite_student;
				public void Click_on_Invite_Student() 
				{click_on_invite_student.click();}
					
				@FindBy(xpath = "//h5[text()='Enter Manually']")
				private WebElement click_on_Enter_Manually;
				public void Click_on_Enter_Manually() 
				{click_on_Enter_Manually.click();}
				
				@FindBy(xpath = "//input[@type='email']")
				private WebElement enter_mails;
				public void Enter_Mails() 
				{enter_mails.sendKeys("student01@institute.com",Keys.ENTER);
				enter_mails.sendKeys("student02@institute.com",Keys.ENTER);}
								
				@FindBy(xpath = "//span[text()='Send']")
				private WebElement click_on_send_Button;
				public void Click_on_Send_Button() 
				{click_on_send_Button.click();}
				
				
				
				
				
				
				public Invite_Students_Manual_page(WebDriver driver) {
					PageFactory.initElements(driver, this);
					} 



}
