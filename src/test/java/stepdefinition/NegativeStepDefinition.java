package stepdefinition;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NegativeStepDefinition {
	 private static final String BASE_URL = "http://ratesapi.io/";
	 private static Response response;
	 private static RequestSpecification httpRequest;
	
	  @Test
	  @Given("foreign Exchange API")
	  public void foreign_exchange_api() {
	      // Write code here that turns the phrase above into concrete actions
		  RestAssured.baseURI = BASE_URL;
		  RequestSpecification request = RestAssured.given();
		  response = request.get("documentation/t");
	  }
	  @Test
	  @When("correct information is posted")
	  public void correct_information_is_posted() {
	      // Write code here that turns the phrase above into concrete actions
		  RestAssured.baseURI = BASE_URL;
		  RequestSpecification request = RestAssured.given();
		  
	  }
	  @Test
	  @Then("Retrieve the response code received")
	  public void retrieve_the_response_code_received() {
	      // Write code here that turns the phrase above into concrete actions
		  int code=response.getStatusCode();
		  System.out.println("Status Code Received: "+code);
		  RestAssured.given()
			.when()
			.get("http://ratesapi.io/documentation/t") 
			.then()
			.log().ifStatusCodeIsEqualTo(404);
	  }
	  
	  

  }

