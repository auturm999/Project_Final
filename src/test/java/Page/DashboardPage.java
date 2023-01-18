package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.WebUI;

import java.lang.management.ManagementFactory;
import java.time.Duration;

public class DashboardPage  extends CommonPage{
    WebDriver driver;

   public DashboardPage(WebDriver driver)
   {
       super(driver);
       this.driver=driver;
       new WebUI (driver);

   }

   By  linkLogOut=By.xpath("//a[text()='Logout']");

   public void LogOut()
   {
       WebUI.clickElement(linkLogOut);
   }


}
