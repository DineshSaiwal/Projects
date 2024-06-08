package POST_Request;

import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import Base_Package.Login;
import Base_Package.Path;
import Base_Package.Utility_Class;
import GET_Request.Get_all_the_task;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Add_an_new_Task_Attachment extends Login{
	static ExtentTest Message;
	@Test
	public static void add_an_new_Task_Attachment() throws IOException {
		Message=extent.createTest("Add_an_new_Task_Attachment").assignAuthor(AutherT).assignCategory(Post);
		Utility_Class.Sheet_Name("POST");
		login();
		Get_all_the_task.get_all_the_task();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.MULTIPART)				
				.param("task_id",Get_all_the_task.id )
				.multiPart("attachment", new File ("C:\\Users\\user\\API Automation\\HRMS_API_Automation\\Required Files\\Task Attachment.png"))
				.post(base_url+Path.Add_an_new_Task_Attachment);
		
		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Add_an_new_Task_Attachment", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Add_an_new_Task_Attachment", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
