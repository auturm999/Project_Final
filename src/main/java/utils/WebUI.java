package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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
//Set text textbox
    public static void setText(By by,String value)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));//chờ đọi sẵn sàng cho tơi khi hiên thị
        driver.findElement(by).sendKeys(value);
    }
    public static WebElement getWebElement(By by) {
        return driver.findElement(by);
    }

    public static String getElementText(By by) {

        waitforElementVisiable(by);
        sleep(STEP_TIME);
        String text = getWebElement(by).getText();

        return text; //Trả về một giá trị kiểu String
    }
    //Mở đường dẫn
    public static void OpenURL()
    {
            driver.get("https://admin-demo.nopcommerce.com/login");
    }
    public static void clear(By by)
    {
        driver.findElement(by).clear();
    }
    // kiểm tra thành phần có tồn tại
    public static Boolean checkElementExist(By by)
    {  sleep(2);
        List<WebElement> listElement=driver.findElements(by);
        if(listElement.size()>0)
        {
             System.out.println("checkElementExist"+true+""+by);
             return true;
        }
        else
            System.out.println("checkElementExist"+false+""+by);
            return false;
    }
    public static void clickElement(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

        //  wait.until(ExpectedConditions.presenceOfElementLocated(by));  // chỉ tồn tại
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));  ///chờ đọi sẵn sàng cho tơi khi hiên thị
        driver.findElement(by).click();

    }
    public static void waitforElementClickable(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(by));// hiển thị thành phần
    }
    public static void waitforElementVisiable(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void waitforpresenceOfElement(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.presenceOfElementLocated(by)); // chờ đợi khi tồn tại
    }

}
