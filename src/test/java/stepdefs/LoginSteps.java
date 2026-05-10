package stepdefs;

import helpers.Navigation;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import base.DriverManager;
import org.junit.Assert.*;
import utils.ConfigReader;

public class LoginSteps {
    // ADD THE LOGIN PAGE METHODS TO HERE
    LoginPage loginPage;
    Navigation navigation;

    // Constants come from the LoginPage.java, which are private so we cannot access them here directly

    @Before // Separate to the hooks @Before
    public void pageSetUp() { // execute method if you use ANY of these class methods/step defs below in a feature file
        loginPage = new LoginPage(DriverManager.getDriver());
        navigation = new Navigation(DriverManager.getDriver());
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        navigation.GoTo(ConfigReader.get("base_url"));
        loginPage.getCurrentURL();
        Assert.assertEquals("https://www.saucedemo.com/", loginPage.getCurrentURL());
    }


    // Valid logins
    @When("I enter user email correctly")
    public void i_enter_user_email() {
        loginPage.emailFill("standard_user");
    }

    @When("I enter user password correctly")
    public void i_enter_user_password() {
        loginPage.passwordFill("secret_sauce");
    }

    // Invalid logins

    @When("I enter user email incorrectly")
    public void i_enter_user_email_incorrectly() {
        loginPage.emailFill("wrongEmail");
    }

    @When("I enter user password incorrectly")
    public void i_enter_user_password_incorrectly() {
        loginPage.passwordFill("wrongPassword");
    }

    // Login button click

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();
    }

    // Assertions
    @Then("user should be logged in")
    public void user_should_be_logged_in() {
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", loginPage.getCurrentURL());
    }

    @Then("User will not be logged in")
    public void user_will_not_be_logged_in() {
        Assert.assertTrue(loginPage.isErrorDisplayed());
        // remember we cannot access the constants directly as they're private
    }
}
