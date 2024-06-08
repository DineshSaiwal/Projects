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

public class Get_the_chart_data_for_a_specific_taskboard extends Login{
	static ExtentTest Message;
	
	
	@Test
	public static void get_the_chart_data_for_a_specific_taskboard() throws IOException {
		Message=extent.createTest("Get_the_chart_data_for_a_specific_taskboard").assignAuthor(AutherT).assignCategory(Get);
		login();
		Get_all_the_taskboard.get_all_the_taskboard();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.param("task_board_id", Get_all_the_taskboard.id)
				.get(base_url+Path.Get_the_chart_data_for_a_specific_taskboard);
		
		JsonPath JP = response.jsonPath(); 
		System.out.println(response.getStatusLine());
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Get_the_chart_data_for_a_specific_taskboard", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Get_the_chart_data_for_a_specific_taskboard", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
