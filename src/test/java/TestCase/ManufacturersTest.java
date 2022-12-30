package TestCase;

import Page.DashboardPage;
import Page.LoginPage;
import Page.ManufacturersPage;
import common.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.WebUI;

public class ManufacturersTest extends BaseTest {
    LoginPage loginpage ;
    DashboardPage dashboardPage;
    ManufacturersPage manufacturerPage;
    @BeforeMethod
    public void setUpTest()
    {
        loginpage=new LoginPage(driver);
    }
    @Test
     public void testAddProject() throws InterruptedException {

        dashboardPage=loginpage.login("admin@yourstore.com","admin");
        manufacturerPage=dashboardPage.OpenProject();
        manufacturerPage.addManufacturer();
    }

}
