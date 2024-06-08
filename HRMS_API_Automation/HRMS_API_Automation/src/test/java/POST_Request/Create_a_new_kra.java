package POST_Request;

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
import GET_Request.Get_all_the_available_Review_types;
import GET_Request.Get_all_the_performance_reports;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Create_a_new_kra extends Login{
	static ExtentTest Message;
	@Test
	public static void create_a_new_kra() throws IOException {
		Message=extent.createTest("Create_a_new_kra").assignAuthor(AutherT).assignCategory(Post);
		Utility_Class.Sheet_Name("POST");
		login();
		Get_all_the_performance_reports.get_all_the_performance_reports();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.JSON)			
				.body("{\"performance_report_id\":\""+Get_all_the_performance_reports.id+"\","
						+ Utility_Class.getCellData(2,20)+"}")
				.post(base_url+Path.Create_a_new_kra);
		System.out.println(response.getStatusLine());
		JsonPath JP = response.jsonPath(); 

//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Create_a_new_kra", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Create_a_new_kra", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
