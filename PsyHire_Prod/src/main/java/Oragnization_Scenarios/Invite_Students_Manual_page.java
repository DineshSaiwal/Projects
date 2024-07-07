package Oragnization_Scenarios;

 import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Package.Base_Class;

public class Invite_Students_Manual_page {
	WebDriver driver = Base_Class.getDriver();
				@FindBy(xpath = "//p[text()='Jobs']")
				private WebElement click_on_JObs_tab;
				public void Click_on_Jobs_Tab() 
				{click_on_JObs_tab.click();}
				
				@FindBy(xpath = "//img[@alt='Invite via mail']")
				private WebElement click_on_invite_student;
				public void Click_on_Invite_Student() 
				{ WebDriverWait wait = new WebDriverWait( driver,Duration.ofSeconds(15));
		        WebElement element = wait.until(ExpectedConditions.visibilityOf(click_on_invite_student));
		        element.click();}
					
				@FindBy(xpath = "//h5[text()='Enter Manually']")
				private WebElement click_on_Enter_Manually;
				public void Click_on_Enter_Manually() 
				{click_on_Enter_Manually.click();}
				
				@FindBy(xpath = "//input[@type='email']")
				private WebElement enter_mails;
				public void Enter_Mails() 
				{enter_mails.sendKeys("Candidate_1@institute.com",Keys.ENTER);
				enter_mails.sendKeys("Candidate_2@institute.com",Keys.ENTER);}
								
				@FindBy(xpath = "//span[text()='Send']")
				private WebElement click_on_send_Button;
				public void Click_on_Send_Button() 
				{click_on_send_Button.click();}
				
				
				
				public Invite_Students_Manual_page(WebDriver driver) {
					PageFactory.initElements(driver, this);
					} 



}
