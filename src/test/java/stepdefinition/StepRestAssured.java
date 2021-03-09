package stepdefinition;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class StepRestAssured {
  @Test
  public void f() {
	  Response response = RestAssured.given().
	             when().
	             get("https://ratesapi.io/documentation/").
	             then().
	             extract().response();
	  
	  RestAssured.given()
		.when()
		.get("https://ratesapi.io/documentation/") 
		.then()
		.log().ifStatusCodeIsEqualTo(200);
	  
	  
  }
}
