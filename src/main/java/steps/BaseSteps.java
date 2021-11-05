package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.TestProperties;

import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseSteps {

    static WebDriver driver;
    static String baseUrl;
    static Properties properties = TestProperties.getInstance().getProperties();

    @Before
    public static void beforeTest() {
        System.setProperty("webdriver.chrome.driver", properties.getProperty("driver.path"));
        baseUrl = properties.getProperty("baseUrl");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @After
    public static void afterTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }

    public static WebDriver getDriver() {
        return driver;
    }

}
