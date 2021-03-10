package stepdefinition;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataProviderTestngReports {
  @Test(dataProvider = "dp")
	  public void f(String s) {
		  RestAssured.baseURI = "https://api.ratesapi.io/api/";
		  RequestSpecification httpRequest = RestAssured.given();
		  Response response = httpRequest.get(s);
		  int statusCode = response.getStatusCode();
		  System.out.println("Record Inserted: "+s);
		  Assert.assertEquals(statusCode,200);
		  System.out.println(response);
		  Reporter.log("Date: "+s+" was checked");
	  }
	  @DataProvider
	  public Object[]dp() {
	   Object [] ob=new Object[2];
	   
	   ob[0]="2010-01-12";
	   ob[1]="2015-01-12";
	   
	   return ob;
	  }
  }

