package Oragnization_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Talent_Acquisition_Team_Page {
	

	@FindBy(xpath = "//p[contains(text(),'Jobs')]")
	private WebElement ClickedOnJobTab;
	public void Click_On_Job_Tab(){ClickedOnJobTab.click();	}
	
	
	@FindBy(xpath = "(//h4[@class='text-gray-primary font-light'])[1]")
	private WebElement ClickedOnJob;
	public void Click_On_Existing_Job(){ClickedOnJob.click();	}
	
	
	@FindBy(xpath = "//p[contains(text(),'Talent Acquisition Team')]")
	private WebElement ClickedOnTalentAcquisition;
	public void Clicked_On_Talent_Acquisition(){ClickedOnTalentAcquisition.click();	}

	
	@FindBy(xpath = "//p[contains(text(),'Assign a team member for this job')]")
	private WebElement ClickOnPlusIcon;
	public void Click_On_Plus_Icon(){ClickOnPlusIcon.click();	}
	
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement SelectTeamMember;
	public void Select_Team_Member(){SelectTeamMember.click();	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Add Team')]")
	private WebElement ClickOnAddTeam;
	public void Click_On_Add_Team(){ClickOnAddTeam.click();	}
	
	

	public  Add_Talent_Acquisition_Team_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		} 
	
}
