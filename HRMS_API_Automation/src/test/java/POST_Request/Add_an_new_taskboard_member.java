package POST_Request;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base_Package.Login;
import Base_Package.Path;
import Base_Package.Utility_Class;
import GET_Request.Get_all_the_available_BehaviouralRating;
import GET_Request.Get_all_the_available_Grades;
import GET_Request.Get_all_the_employees;
import GET_Request.Get_all_the_taskboard;
import GET_Request.Get_all_the_taskboard_members;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Add_an_new_taskboard_member extends Login {
	static ExtentTest Message;
	@Test
	public static void add_an_new_taskboard_member() throws IOException {
		Message=extent.createTest("Add_an_new_taskboard_member").assignAuthor(AutherT).assignCategory(Post);
		login();	
		Get_all_the_taskboard.get_all_the_taskboard();
		Get_all_the_taskboard_members.get_all_the_taskboard_members();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.JSON)
				.body("{\"task_board_id\": \""+Get_all_the_taskboard.id+"\","
						+"\"employee_id\": \""+Get_all_the_taskboard_members.id+"\"}")
				.post(base_url+Path.Add_an_new_taskboard_member);

		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Add_an_new_taskboard_member", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Add_an_new_taskboard_member", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
