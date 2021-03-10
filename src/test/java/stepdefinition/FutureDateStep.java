package stepdefinition;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FutureDateStep {
	private static final String BASE_URL = "https://api.ratesapi.io/api/";
	 private static Response response;
	 private static RequestSpecification httpRequest;
	@Test
	@Given("The URI API for foreign Exchange")
	public void the_uri_api_for_foreign_exchange() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI = BASE_URL;
		  RequestSpecification request = RestAssured.given();
		  response = request.get("2050-01-12");
	}
	@Test
	@When("posted with future date information")
	public void posted_with_future_date_information() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI = BASE_URL;
		  RequestSpecification request = RestAssured.given();
	}
	@Test
	@Then("Validate the positive response code received")
	public void validate_the_positive_response_code_received() {
	    // Write code here that turns the phrase above into concrete actions
		int code=response.getStatusCode();
		  System.out.println("Status Code Received: "+code);
		  Assert.assertEquals(200,code);
		  RestAssured.given()
			.when()
			.get("https://api.ratesapi.io/api/2050-01-12") 
			.then()
			.log().body();
	}

 
}
