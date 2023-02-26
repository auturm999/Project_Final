package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebUI;

import java.lang.management.ManagementFactory;
import java.time.Duration;

public class DashboardPage extends CommonPage {
   WebDriver driver;
  private WebDriverWait wait;
   public DashboardPage(WebDriver driver)
   {
    super(driver);
    this.driver=driver;
    wait=new WebDriverWait(driver, Duration.ofSeconds(10));
   }
   By menuProject=By.xpath("//div[@class='os-padding']//nav//ul//li//p[normalize-space()='Catalog']");
   By menuManufacturers=By.xpath("//p[normalize-space()='Manufacturers']");


}
