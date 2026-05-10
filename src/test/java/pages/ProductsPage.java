package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductsPage {
    WebDriver driver;

    // Define constants
    private By pageTitle = By.cssSelector(".app_logo"); // Using By is anyone's guess, no clue why we do this
    private By burgerMenu = By.cssSelector("#react-burger-menu-btn");
    private By inventoryContainer = By.className("inventory_list");
    private By inventoryItems = By.className("inventory_item");
    private By shoppingCart = By.className(".shopping_cart_link");
    private By filterDropdown = By.className("product_sort_container");
    // private By shoppingCart = By.cssSelector("[data-test='shopping-cart-link');
    // Above line might be more reliable as it is a custom html attribute


    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    // Call this function in the ProductSteps file, taking in DriverManager as an argument to give a driver

    public List<WebElement> getInventoryList() {
        WebElement container = driver.findElement(inventoryContainer);

        return container.findElements(inventoryItems);
        // Returns a list of WebElements (Look at the return type in the method)
    }

    public void SelectFilterMethod(String filter) {
        Select filterDropdown = new Select(driver.findElement(this.filterDropdown));
        filterDropdown.selectByVisibleText(filter);
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}
