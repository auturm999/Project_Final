package PageLogin;

import common.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginPage  extends BaseTest {
    @Test
    public void login() throws InterruptedException {
          driver.get("https://admin-demo.nopcommerce.com/login");

        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

    }
}
