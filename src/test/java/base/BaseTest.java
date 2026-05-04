package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

public class BaseTest {
    protected static WebDriver driver;

    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(ConfigReader.get("base_url"));
    }

    public static void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
