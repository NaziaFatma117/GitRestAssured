package stepdefinition;

import java.util.logging.LogManager;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import jdk.jfr.internal.Logger;

public class StepResponseCode {
	private static final String BASE_URL = "http://ratesapi.io/";
	 private static Response response;
	 private static RequestSpecification httpRequest;
  @Test
  @Given("API for foreign Exchange")
  public void api_for_foreign_exchange() {
      // Write code here that turns the phrase above into concrete actions
	  RestAssured.baseURI = BASE_URL;
	  RequestSpecification request = RestAssured.given();
	  response = request.get("documentation/t");
  }

  @When("posted with correct information")
  public void posted_with_correct_information() {
      // Write code here that turns the phrase above into concrete actions
	  RestAssured.baseURI = BASE_URL;
	  RequestSpecification request = RestAssured.given();
	  
  }

  @Then("validate the reponse received")
  public void validate_the_reponse_received() {
      // Write code here that turns the phrase above into concrete actions
	  int code=response.getStatusCode();
	  System.out.println("Status Code Received: "+code);
	  Assert.assertEquals(404,code);
  }
}
