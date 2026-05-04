package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import helpers.Constants;

public class LoginSteps {

    public String message = "This is a TEST";

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("On login page");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("Entering credentials");
    }

    @When("user enter invalid username and password")
    public void user_enter_invalid_username_and_password() {
        System.out.println("Entering invalid credentials");
        System.out.println("INAVLID CREDENTIALS -- Please enter correct username and password");
    }

    @Then("user should be logged in")
    public void user_should_be_logged_in() {
        System.out.println("Logged in as: " + message);
        System.out.println(Constants.testString);
    }

    @Then("User will not be logged in")
    public void user_will_not_be_logged_in() {
        System.out.println("User is NOT be logged in");
    }
}
