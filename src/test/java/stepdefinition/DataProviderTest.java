package stepdefinition;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
  @Test(dataProvider = "dp")
  public void f(String s) {
	  RestAssured.baseURI = "https://api.ratesapi.io/api/";
	  RequestSpecification httpRequest = RestAssured.given();
	  Response response = httpRequest.get(s);
	  int statusCode = response.getStatusCode();
	  Assert.assertEquals(statusCode,200);
	  System.out.println(response);
  }

  @DataProvider
  public Object[]dp() {
   Object [] ob=new Object[2];
   
   ob[0]="2010-01-12";
   ob[1]="2015-01-12";
   
   return ob;
  }
}
