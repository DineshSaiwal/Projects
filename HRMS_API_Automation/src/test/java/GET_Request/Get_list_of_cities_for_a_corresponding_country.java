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

public class Get_list_of_cities_for_a_corresponding_country extends Login {
	static ExtentTest Message;
	@Test
	public static void get_list_of_cities_for_a_corresponding_country() throws IOException {
		Message=extent.createTest("Get_list_of_cities_for_a_corresponding_country").assignAuthor("QA_Team").assignCategory("GET_Request");
		
		Response response = RestAssured.given()
				.param("country_code","HU")
				.param("state_code", "DE")
				.get(base_url+Path.Get_list_of_cities_for_a_corresponding_country);
		
		JsonPath JP = response.jsonPath(); 		
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Get_list_of_cities_for_a_corresponding_country", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{Message.fail(MarkupHelper.createLabel("Get_list_of_cities_for_a_corresponding_country", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
