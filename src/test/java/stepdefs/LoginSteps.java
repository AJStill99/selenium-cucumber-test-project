package stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import helpers.Constants;
import pages.LoginPage;
import base.DriverManager;

public class LoginSteps {
    // ADD THE LOGIN PAGE METHODS TO HERE
    LoginPage loginPage;

    public String message = "This is a TEST";

    @Before // Separate to the hooks @Before
    public void pageSetUp() { // execute method if you use ANY of these class methods/step defs below in a feature file
        loginPage = new LoginPage(DriverManager.getDriver());
        // Don't want to use this long term apparently
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {

        System.out.println("On login page");
    }

    @When("I enter user email")
    public void i_enter_user_email() {
        loginPage.emailFill("admin");
    }

    @When("I enter user password")
    public void i_enter_user_password() {
        loginPage.passwordFill("admin");
    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("Entering credentials");
    }

    @When("user enter invalid username and password")
    public void user_enter_invalid_username_and_password() {
        System.out.println("Entering invalid credentials");
        System.out.println("INVALID CREDENTIALS -- Please enter correct username and password");
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
