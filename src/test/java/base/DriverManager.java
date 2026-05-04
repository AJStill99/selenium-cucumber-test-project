package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

public class DriverManager {
    protected static WebDriver driver; // Creates the interface

    public static void setup() {
        driver = new ChromeDriver(); // Assigning the driver to the interface object, allowing the driver to follow the driver interface rules
        driver.manage().window().maximize();

        driver.get(ConfigReader.get("base_url"));
    }

    public static void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
