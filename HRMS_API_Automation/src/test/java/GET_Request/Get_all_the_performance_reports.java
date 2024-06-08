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

public class Get_all_the_performance_reports extends Login{
	static ExtentTest Message;
	public static String id;
	public static String review_type_id;
	public static String created_by;
	
	@Test
	public static void get_all_the_performance_reports() throws IOException {
		Message=extent.createTest("Get_all_the_performance_reports").assignAuthor(AutherT).assignCategory(Get);
		login();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.get(base_url+Path.Get_all_the_performance_reports);
		
		JsonPath JP = response.jsonPath(); 
		
			id=JP.getString("data[0].id");		
			review_type_id=JP.getString("data[0].review_type_id");
			created_by=JP.getString("data[0].created_by");
		
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Get_all_the_performance_reports", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Get_all_the_performance_reports", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
