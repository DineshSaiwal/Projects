package PUT_Request;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Login;
import Base_Package.Path;
import Base_Package.Random_data_From_Excel;
import GET_Request.Get_all_the_available_holiday_types;
import GET_Request.Get_all_the_employees;
import GET_Request.Get_the_education_details;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Update_the_education_details extends Login{
	static ExtentTest Message;
	@Test
	public static void update_the_education_details() throws IOException {
		Message=extent.createTest("Update_the_education_details").assignAuthor(AutherT).assignCategory(Put);
		Userlogin();	
		Get_the_education_details.get_the_education_details();
		Get_all_the_employees.get_all_the_employees();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.MULTIPART)	
				.param("id",Get_the_education_details.id )
				.param("employee_id",Get_all_the_employees.id )
				.param("instituition","JNU")
				.param("university","IIT Bombay")
				.param("degree","Btech")
				.param("from_date","2016-09-17")
				.param("to_date","2020-01-15")				
				.multiPart("certificate", new File ("C:\\Users\\user\\Desktop\\file\\HTTP-status-code-696x970.png"))			
				.put(base_url+Path.Update_the_education_details);
		
		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Update_the_education_details", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Update_the_education_details", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
