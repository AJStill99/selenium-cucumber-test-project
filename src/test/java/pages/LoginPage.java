package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class LoginPage  {
    WebDriver driver; // This is empty until the constructor assigns it a value (from DriverManager)

    // Constants
    private By emailField = By.cssSelector("input[type='email']");
    private By passwordField = By.cssSelector("input[type='password']");
    private By loginButton = By.cssSelector("button[type='submit']");
    // Using By here to find the elements as it's more reliable than driver.findElement()

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


}
