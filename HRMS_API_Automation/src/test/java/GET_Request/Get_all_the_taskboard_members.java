package GET_Request;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base_Package.Login;
import Base_Package.Path;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Get_all_the_taskboard_members extends Login{
	static ExtentTest Message;
	public static int id;
	public static int employee_id;
	@Test
	public static void get_all_the_taskboard_members() throws IOException {
		Message=extent.createTest("Get_all_the_taskboard_members").assignAuthor(AutherT).assignCategory(Get);
		login();
		Get_all_the_taskboard.get_all_the_taskboard();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.param("task_board_id", Get_all_the_taskboard.id)
				.get(base_url+Path.Get_all_the_taskboard_members);
		
		JsonPath JP = response.jsonPath(); 
		id=JP.get("data[0].id");
		employee_id=JP.get("data[0].employee_id");
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Get_all_the_taskboard_members", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Get_all_the_taskboard_members", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
