package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    // @BeforeMethod
    @BeforeMethod
    public static void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Cho
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));// Thoi gian load trang

    }
    @AfterMethod
    // @AfterMethod
    public static void closeDriver()
    {  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException();

        }
        if(driver !=null)
            driver.close();

    }
}
