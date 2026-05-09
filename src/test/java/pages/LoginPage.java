package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class LoginPage  {
    WebDriver driver; // This is empty until the constructor assigns it a value (from DriverManager)

    // Constants
    private By emailField = By.cssSelector(".input_error#user-name");
    private By passwordField = By.cssSelector(".input_error#password");
    private By loginButton = By.cssSelector(".submit-button#login-button");
    // Using By here to find the elements as it's more reliable than driver.findElement()
    private By errorMessage = By.cssSelector("h3[data-test='error']"); // custom HTML attribute



    public LoginPage(WebDriver driver) {
        // Takes in DriverManager drivers as an argument in the constructor
        this.driver = driver;
    } // When we call this, it takes in the DriverManager as an argument to give it a valid driver



    public void passwordFill(String password) {
        this.driver.findElement(passwordField).sendKeys(password);
    }

    public void emailFill(String email) {
        this.driver.findElement(emailField).sendKeys(email);
    }

    public void clickLoginButton() {
        this.driver.findElement(loginButton).click();
    }

    public void enterWrongEmailOrPassword() {
        this.driver.findElement(emailField).sendKeys("wrong");
        this.driver.findElement(passwordField).sendKeys("wrongPassword");
        this.driver.findElement(loginButton).click();
    }
    // Assertion methods

    public boolean isErrorDisplayed() {
            return driver.findElement(errorMessage).isDisplayed();
        }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

        // Add assertion
        // assertNotEquals(
        //         "https://www.saucedemo.com/inventory.html",
        //         this.driver.getCurrentUrl()
        // );

        // assertTrue(driver.findElement(errorMessage).isDisplayed());

}
