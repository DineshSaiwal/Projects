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

public class Get_the_list_of_upcoming_events extends Login{
	static ExtentTest Message;
	
	@Test
	public static void get_the_list_of_upcoming_events() throws IOException {
		Message=extent.createTest("Get_the_information_related_of_the_leaves").assignAuthor(AutherT).assignCategory(Get);
		Userlogin();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token)				
				.get(base_url+Path.Get_the_list_of_upcoming_events);
		
		JsonPath JP = response.jsonPath();
		
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Get_the_list_of_upcoming_events", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Get_the_list_of_upcoming_events", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}