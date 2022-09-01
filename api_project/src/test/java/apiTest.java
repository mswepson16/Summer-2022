import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import io.restassured.response.Response;

public class apiTest {
	@Test
	public void testStatus() {
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(response.statusCode());
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.statusLine());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	@Test
	public void canGetSingleUser() {
		given().
	  		get("https://reqres.in/api/users/2{id)", 2).
	  	then().
	  		statusCode(200).
	  		body("data.id[1]", equalTo(2)).
	  		body("data.email", equalsTo("janet.weaver@reqres.in")));
	  	
	}
  
	@Test
	public void canPostLogin() {
		JSONObject request = new JSONObject();
		
		request.put("email", "m.s@reques.in");
		request.put("password", "pass123");
		
		System.out.println(request);
		System.out.println(request.toString());
		
		given().
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/login").
		then().statusCode(201);
	}
	
	@Test
	public void canDelete() {
		JSONObject request = new JSONObject();
			
		given().
		body(request.toJSONString()).
		when().
		delete("https://reqres.in/api/users/2").
		then().statusCode(204).
		log().all();
		
	}
	
	@Test
	public void canPatch() {
		JSONObject request = new JSONObject();
		
		request.put("name", "morpheus2");
		
		System.out.println(request);
		
		given().
		body(request.toJSONString()).
		when().
		patch("https://reqres.in/api/users/2").
		then().statusCode(200);
	}
	
	@Test
	public void canPut() {
		JSONObject request = new JSONObject();
		
		request.put("name", "morpheus2");
		
		given().
		body(request.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().statusCode(200);
	}
	
}
