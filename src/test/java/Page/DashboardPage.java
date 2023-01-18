package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.WebUI;

import java.lang.management.ManagementFactory;

public class DashboardPage {
  private static WebDriver driver;
    ManufacturersPage manufacturersPage ;
   public DashboardPage()
   {    manufacturersPage= new ManufacturersPage();
   }
   By menuProject=By.xpath("//div[@class='os-padding']//nav//ul//li//p[normalize-space()='Catalog']");
   By menuManufacturers=By.xpath("//p[normalize-space()='Manufacturers']");
   By textTrangChu=By.xpath("//h1[normalize-space()='Dashboard']");
   By  linkLogOut=By.xpath("//a[text()='Logout']");
   public ManufacturersPage OpenProject()
   {
       WebUI.clickElement(menuProject);
       WebUI.clickElement(menuManufacturers);
//       boolean checkDashboard =WebUI.checkElementExist(manufacturersPage.textTrangChu);
//       Assert.assertTrue(checkDashboard,"Khong ton tai trang");
       return new ManufacturersPage();
   }
   public void LogOut()
   {
       WebUI.clickElement(linkLogOut);
   }
}
