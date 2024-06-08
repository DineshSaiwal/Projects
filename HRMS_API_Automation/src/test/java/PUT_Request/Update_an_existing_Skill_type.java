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
import Base_Package.Utility_Class;
import GET_Request.Get_all_the_available_Skill_types;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Update_an_existing_Skill_type  extends Login{
	static ExtentTest Message;
	@Test
	public static void update_an_existing_Skill_type() throws IOException {
		Message=extent.createTest("Update_an_existing_Skill_type").assignAuthor("QA_Team").assignCategory("PUT_Request");
		login();
		Get_all_the_available_Skill_types.get_all_the_available_Skill_types();
		Random_data_From_Excel.main("PUT", 6, 1, 5);
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.JSON)
				.body("{\"id\":\""+Get_all_the_available_Skill_types.id+"\","
						+Random_data_From_Excel.data+"}")
				.put(base_url+Path.Update_an_existing_Skill_type);

		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Update_an_existing_Skill_type", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{Message.fail(MarkupHelper.createLabel("Update_an_existing_Skill_type", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
