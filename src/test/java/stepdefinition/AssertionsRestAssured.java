package stepdefinition;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AssertionsRestAssured {
  @Test
  public void f() {
	  RestAssured.baseURI = "http://ratesapi.io";
	  RequestSpecification httpRequest = RestAssured.given();
	  Response response = httpRequest.get("/documentation/");
	  int statusCode = response.getStatusCode();
	  Assert.assertEquals(statusCode,200);
	  System.out.println("The API page Exists");
	  
	  RestAssured.baseURI = "http://ratesapi.io";
	  RequestSpecification httpRequest2 = RestAssured.given();
	  Response response2 = httpRequest2.get("/documentation/t");
	  int statusCode2 = response2.getStatusCode();
	  Assert.assertFalse(statusCode2==200);
	  System.out.println("The API page does not exists");
	  
  }
}
