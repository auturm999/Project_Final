package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.WebUI;

public class CommonPage {
    private WebDriver driver;
    private DashboardPage dashboardPage;
    private ManufacturersPage manufacturersPage ;
    private LoginPage loginPage;
    public By  linkLogOut=By.xpath("//a[text()='Logout']");
    By menuProject=By.xpath("//div[@class='os-padding']//nav//ul//li//p[normalize-space()='Catalog']");
    By menuManufacturers=By.xpath("//p[normalize-space()='Manufacturers']");
    By textTrangChu=By.xpath("//h1[normalize-space()='Dashboard']");

   public CommonPage(WebDriver driver)
   {
       this.driver=driver;
        new WebUI (driver);//Khởi tạo giá trị cho class WebUI
   }
    public LoginPage getLoginpage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    public DashboardPage getDashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage(driver);
        }
        return dashboardPage;
    }
    public ManufacturersPage getManufacturersPage() {

        if (manufacturersPage == null) {
            manufacturersPage = new ManufacturersPage(driver);
        }
        return manufacturersPage;
    }
    public LoginPage dangXuat()
    {
        WebUI.clickElement(linkLogOut);
        return new LoginPage(driver);
    }
    public ManufacturersPage Openfacturers()
    {
        WebUI.clickElement(menuProject);
        WebUI.clickElement(menuManufacturers);
        boolean checkManufacturers=WebUI.checkElementExist(getManufacturersPage().textManufacturers);
        Assert.assertTrue(checkManufacturers,"Khong ton tai trang");
        return new ManufacturersPage(driver);
    }

}
