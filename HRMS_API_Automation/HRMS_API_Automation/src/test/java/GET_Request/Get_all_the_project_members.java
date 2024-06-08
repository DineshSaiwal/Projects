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

public class Get_all_the_project_members extends Login {
	static ExtentTest Message;
	public static int id;
	
	@Test
	public static void get_all_the_project_members() throws IOException {
		Message=extent.createTest("Get_all_the_project_members").assignAuthor(AutherT).assignCategory(Get);
		login();
		Get_all_the_Projects.get_all_the_Projects();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.param("project_id", Get_all_the_Projects.id)
				.get(base_url+Path.Get_all_the_project_members);
		
		JsonPath JP = response.jsonPath(); 
		id=JP.get("data[0].id");
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Get_all_the_project_members", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{Message.fail(MarkupHelper.createLabel("Get_all_the_project_members", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
