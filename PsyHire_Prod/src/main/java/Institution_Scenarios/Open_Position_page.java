package Institution_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Open_Position_page {
	
		@FindBy(xpath = "//p[text()='Open positions']")
		private WebElement click_on_Open_positions_tab;
		public void Click_On_Open_Positions_Tab() 
		{click_on_Open_positions_tab.click();}
		
		@FindBy(xpath = "(//span[text()='Connect'])[1]") //"//span[text()='Connect']"
		private WebElement click_on_connect; 
		public void Click_On_Connect_Button() 
		{click_on_connect.click();}
		
		@FindBy(xpath = "//span[text()='Continue']")
		private WebElement click_on_Continue;
		public void Click_On_Continue() 
		{click_on_Continue.click();}
		
		@FindBy(name = "notes")
		private WebElement add_note;
		public void Add_Note() 
		{add_note.sendKeys("my name is dinesh");}
	
		@FindBy(id = "DEPARTMENT")
		private WebElement select_department;
		public void Select_department()
		{select_department.click();}
		
		@FindBy(name = "departments")
		private WebElement search_department;
		public void Search_Department() 
		{search_department.sendKeys("Mechanical");}
	
		@FindBy(xpath = "(//input[@type='checkbox'])[1]") //input[@type='checkbox']
		private WebElement choose_department;
		public void Choose_Department() 
		{choose_department.click();}
	
		@FindBy(xpath = "//span[text()='Choose Candidates']")
		private WebElement click_on_choose_candidate_button;
		public void Click_on_Choose_Candidate_Button() 
		{click_on_choose_candidate_button.click();}
	
		@FindBy(xpath = "//span[text()='Share all']")
		private WebElement click_on_Share_all;
		public void Click_on_Share_all() 
		{click_on_Share_all.click();}
	
		
		
		
	
	public Open_Position_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		} 

}
