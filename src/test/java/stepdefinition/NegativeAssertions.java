package stepdefinition;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NegativeAssertions {
  @Test
  public void f() {
	  RestAssured.baseURI = "https://api.ratesapi.io/";
	  RequestSpecification httpRequest = RestAssured.given();
	  Response response = httpRequest.get("api");
	  int statusCode = response.getStatusCode();
	  Assert.assertEquals(statusCode,400);
	  System.out.println(response);
	  
	  RestAssured.baseURI = "https://api.ratesapi.io/";
	  RequestSpecification httpRequest2 = RestAssured.given();
	  Response response2 = httpRequest2.get("2010-01-12");
	  int statusCode2 = response2.getStatusCode();
	  Assert.assertEquals(statusCode2,200);
	  System.out.println(response2);
	  
	  
  }
}
