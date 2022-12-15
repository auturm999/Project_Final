package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebUI {
    private static int TIMEOUT=10;
    private static int STEP_TIME=1;
    private static WebDriver driver;
    public WebUI(WebDriver driver)
    {
        WebUI.driver=driver;
    }
    public static void  sleep(long second)
    {   try{
        Thread.sleep(1000*STEP_TIME);
    }catch(InterruptedException e) {
        throw new RuntimeException(e);
    }
    }

    public static void setText(By by,String value)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));//chờ đọi sẵn sàng cho tơi khi hiên thị
        driver.findElement(by).sendKeys(value);
    }
    public static void clickElement(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

        //  wait.until(ExpectedConditions.presenceOfElementLocated(by));  // chỉ tồn tại
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));  ///chờ đọi sẵn sàng cho tơi khi hiên thị
        driver.findElement(by).click();

    }
    public static void waitforElementClickable(By by,String value)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void waitforElementVisiable(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
