package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebUI;

public class CommonPage {
    private WebDriver driver;
    private DashboardPage dashboardPage;
    private ManufacturersPage manufacturersPage ;
    private LoginPage loginPage;
    public By  linkLogOut=By.xpath("//a[text()='Logout']");

   public CommonPage(WebDriver driver)
   {
       this.driver=driver;
        new WebUI (driver);
   }
    public LoginPage getLoginpage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    public DashboardPage getDashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage();
        }
        return dashboardPage;
    }

//    public ManufacturersPage getManufacturersPage() {
//
//        if (manufacturersPage == null) {
//            manufacturersPage = new ManufacturersPage(driver);
//        }
//        return manufacturersPage;
//    }
    public LoginPage dangXuat()
    {
        WebUI.clickElement(linkLogOut);
        return new LoginPage(driver);
    }


}
