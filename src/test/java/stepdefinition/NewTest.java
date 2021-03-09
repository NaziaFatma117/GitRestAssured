package stepdefinition;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewTest {
  @Test
  @Given("a and b")
  public void a_and_b() {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("Given");
  }
  @Test
  @When("a and b is greater than zero")
  public void a_and_b_is_greater_than_zero() {
      // Write code here that turns the phrase above into concrete actions
	  System.out.println("@When");
  }
  @Test
  @Then("a multiplies b")
  public void a_multiplies_b() {
      // Write code here that turns the phrase above into concrete actions
	  System.out.println("Then");
	  Reporter.log("TestNG Reporter Class in @Then");
  }

}
