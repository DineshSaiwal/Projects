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
import GET_Request.Get_all_the_employees;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Add_an_new_taskboard extends Login{
	static ExtentTest Message;
	@Test
	public static void add_an_new_taskboard() throws IOException {
		Message=extent.createTest("Add_an_new_taskboard").assignAuthor(AutherT).assignCategory(Post);
		Userlogin();		
		Get_all_the_employees.get_all_the_employees();
		Utility_Class.Sheet_Name("POST");
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.JSON)				
				.body("{\"created_by_id\": \""+Get_all_the_employees.id +"\","
						+"\"members\":[\""+ Get_all_the_employees.Newid +"\"]"
						+Utility_Class.getCellData(2,38)+"}")
				.post(base_url+Path.Add_an_new_taskboard);
		
		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Add_an_new_taskboard", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}
		else{
			Message.fail(MarkupHelper.createLabel("Add_an_new_taskboard", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
