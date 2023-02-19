package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebUI;

import java.lang.management.ManagementFactory;

public class DashboardPage {
  private static WebDriver driver;
   public DashboardPage()
   {

   }
   By menuProject=By.xpath("//div[@class='os-padding']//nav//ul//li//p[normalize-space()='Catalog']");
    By menuManufacturers=By.xpath("//p[normalize-space()='Manufacturers']");

   public ManufacturersPage OpenProject()
   {
       WebUI.clickElement(menuProject);
       WebUI.clickElement(menuManufacturers);
       return new ManufacturersPage();
   }
}
