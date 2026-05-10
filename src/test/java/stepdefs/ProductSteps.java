package stepdefs;

import helpers.Navigation;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import base.DriverManager;
import org.junit.Assert.*;
import pages.ProductsPage;
import utils.ConfigReader;
import helpers.Routing;

import java.util.List;


public class ProductSteps {
    ProductsPage productsPage;
    Navigation navigation;
    public String base_url = ConfigReader.get("base_url");

    @Before
    public void pageSetup() {
        productsPage = new ProductsPage(DriverManager.getDriver());
        navigation = new Navigation(DriverManager.getDriver());
    }

    @Given("User is on products page")
    public void user_is_on_products_page() {
        navigation.GoTo(base_url);
        Assert.assertEquals("https://www.saucedemo.com/" + Routing.Inventory, productsPage.getCurrentURL());
    }

    @Given("I have the inventory list")
    public List<WebElement> i_have_the_inventory_list() {
        return productsPage.getInventoryList();
    }

    @When("User clicks 'Add to cart'")
    public void user_clicks_add_to_cart() {
        // This is going to be tricky. Need to access the list of products, and access the Add To Cart button for each one

    }

}
