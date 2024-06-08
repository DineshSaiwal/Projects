package PUT_Request;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Login;
import Base_Package.Path;
import Base_Package.Random_data_From_Excel;
import GET_Request.Get_all_the_Projects;
import GET_Request.Get_all_the_available_holiday_types;
import GET_Request.Get_all_the_employees;
import GET_Request.Get_all_the_task;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Move_a_task_from_one_section_to_other extends Login{
	static ExtentTest Message;
	@Test
	public static void move_a_task_from_one_section_to_other() throws IOException {
		Message=extent.createTest("Move_a_task_from_one_section_to_other").assignAuthor(AutherT).assignCategory(Put);
		login();
		Random_data_From_Excel.main("PUT", 39, 1, 1);
		Get_all_the_task.get_all_the_task();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.JSON)
				.body("{\"task_id\": \""+Get_all_the_task.id+"\","
						+ Random_data_From_Excel.data+"}")
				.put(base_url+Path.Move_a_task_from_one_section_to_other);
		JsonPath JP = response.jsonPath(); 

//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Move_a_task_from_one_section_to_other", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Move_a_task_from_one_section_to_other", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
