package Delete_Request;

import java.io.IOException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Login;
import Base_Package.Path;
import GET_Request.Get_all_the_available_leave_types;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Delete_a_leave_type extends Login{
	static ExtentTest Message;
	@Test
	public static void delete_a_leave_type() throws IOException {
		Message=extent.createTest("Delete_a_leave_type").assignAuthor(AutherT).assignCategory(Delete);
		login();
		Get_all_the_available_leave_types.get_all_the_available_leave_types();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.JSON)
				.body("{\"id\":\""+Get_all_the_available_leave_types.id+"\"}")
				.delete(base_url+Path.Delete_a_leave_type);

		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Delete_a_leave_type", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Delete_a_leave_type", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
