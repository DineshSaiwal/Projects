package API;

import java.io.IOException;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;



public class Org_Clean_Data{
	
	public static String Org_Email_Id ="unitedspirits@fthcapital.com";//agency_01@awgarstone.com
	public static String PWD="Abcd.1234";
	public static String Token;
	
	
	@Test
	public static void Delete_Acc_Data() throws IOException {
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.body("{\"email\":\"" + Org_Email_Id + "\","
					    + "\"password\":\"" + PWD + "\","
					    + "\"re_login\": true}")
				.post("https://api.psyhire.ai/accounts/api/client/v1/user-login-api/");
//				.post("https://qa-api.psyhire.ai/accounts/api/client/v1/user-login-api/");
		JsonPath JP = response.jsonPath();
		Token =JP.get("token");
		
		Response response2 = RestAssured.given()
				.header("Authorization","Bearer "+Token) 
				.contentType(ContentType.JSON)
				.delete("https://api.psyhire.ai/company/api/client/v1/company-data-delete-api/");
//				.delete("https://qa-api.psyhire.ai/company/api/client/v1/company-data-delete-api/");

		JsonPath JP2 = response2.jsonPath(); 
		System.out.println("*******************[           "+JP2.get("message").toString()+"         ]*******************");
		}
	}
