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
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Login_to_generate_JWT extends Login {
	static ExtentTest Message;
	@Test
	public static void login_to_generate_JWT() throws IOException {
		Message=extent.createTest("login_to_generate_JWT").assignAuthor(AutherT).assignCategory(Post);
		
		Utility_Class.Sheet_Name("POST");
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(Utility_Class.getCellData(2,1))
				.post(base_url+Path.Login_to_generate_JWT);
		
		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==201) {
			Message.pass(MarkupHelper.createLabel("login_to_generate_JWT", ExtentColor.GREEN));
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{Message.fail(MarkupHelper.createLabel("login_to_generate_JWT", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }	
	}
}
