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
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Add_a_new_blog extends Login{
	static ExtentTest Message;
	@Test
	public static void add_a_new_blog() throws IOException {
		Message=extent.createTest("Add_a_new_blog").assignAuthor(AutherT).assignCategory(Post);
		login();
		Response response = RestAssured.given()
				.header("Authorization","jwt "+Token) 
				.contentType(ContentType.MULTIPART)
				.formParam("topic", "Somthing")
				.formParam("title", "New Update")
				.param("content", "oooll jj   dhgbbebehu feuebnf")
				.param("is_draft", "False")
				.param("requested_delete", "False")
				.param("minutes","5")
				.multiPart("thumbnail", new File ("C:\\Users\\user\\Desktop\\file\\HTTP-status-code-696x970.png"))
				.post(base_url+Path.Add_a_new_blog);
		JsonPath JP = response.jsonPath(); 
//Validation 
		if(response.getStatusCode()==200) {
			Message.pass(MarkupHelper.createLabel("Add_a_new_blog", ExtentColor.GREEN));			
			Message.info(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.BLUE));
			Message.info(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.BLUE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON)); }
		else{
			Message.fail(MarkupHelper.createLabel("Add_a_new_blog", ExtentColor.RED));
			Message.warning(MarkupHelper.createLabel(response.getStatusLine(), ExtentColor.ORANGE));
			Message.warning(MarkupHelper.createLabel((String) JP.get("message"), ExtentColor.ORANGE));
			Message.info(MarkupHelper.createCodeBlock(response.getBody().asString(), CodeLanguage.JSON));}	
	}
}
