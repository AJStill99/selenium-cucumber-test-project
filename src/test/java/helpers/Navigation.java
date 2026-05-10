package helpers;

import org.openqa.selenium.WebDriver;

public class Navigation {
    private WebDriver driver;

    public Navigation(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo(String url) {
        driver.get(url);
    }
}
