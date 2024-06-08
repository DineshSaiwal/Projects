package Base_Package;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Login {
//**************************************{  Global Variable  }*********************************************
	public static String Token;
	public static String base_url="https://api-collaborate.aptagrim.com";
	public static ExtentReports extent;
	public static ExtentSparkReporter htmlReporter;
	public static String AutherT="QA_Team";
	public static String AutherA="Abhishek";
	public static String AutherD="Dinesh";
	public static String AutherN="Nidhin";

	public static String Get="GET_Request";
	public static String Put="PUT_Request";
	public static String Post="POST_Request";
	public static String Delete="DELETE_Request";
	
	
//================================{ Super Admin Login  }===============================================
	public static void login() throws IOException {
			Response response= 	RestAssured.given()
					.contentType(ContentType.JSON)
					.body("{\"username_or_number\": \"Email_address\","
							+"\"password\": \"Passworf\","
							+" \"re_login\": true}")
					.post(base_url+Path.Login_to_generate_JWT);
					JsonPath JP = response.jsonPath(); 
						Token=JP.get("token");}
	
	
//================================{ Admin Login  }===============================================
	public static void Userlogin() throws IOException {
		Response response= 	RestAssured.given()
				.contentType(ContentType.JSON)
				.body("{\"username_or_number\": \"Email\","
						+"\"password\": \"Password\","
						+" \"re_login\": true}")
				.post(base_url+Path.Login_to_generate_JWT);
				JsonPath JP = response.jsonPath(); 
				Token=JP.get("token");}
	
//================================{  Extent Report Script  }===============================================

	 @BeforeTest
		   public static void Extent_R() {
			 	htmlReporter = new ExtentSparkReporter("HRMS 2.0 Api Automation_Report.html"+""+System.currentTimeMillis()).viewConfigurer().viewOrder().as(new ViewName[] {ViewName.TEST,ViewName.DASHBOARD,
			 			ViewName.CATEGORY}).apply();
		    	extent = new ExtentReports();
		    	htmlReporter.config().setTheme(Theme.DARK);
		    	extent.setSystemInfo("Project Name","HRMS_2.0");
		    	extent.setSystemInfo("Environment","Production");
		        extent.attachReporter(htmlReporter); }
	 
	 @AfterClass
	    public static void Flush() {
	    	 extent.flush(); }
	}