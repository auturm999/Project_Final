package TestCase;

import Page.DashboardPage;
import Page.LoginPage;
import Page.ManufacturersPage;
import common.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardTest  extends BaseTest {
    LoginPage loginpage ;
    DashboardPage dashboardPage;
    ManufacturersPage manufacturerPage;
    @BeforeMethod
    public void setUpTest()
    {
        loginpage=new LoginPage(driver);
    }
    @Test
    public void testLoginValid() throws InterruptedException {

        dashboardPage=loginpage.login("admin@yourstore.com","admin");
        manufacturerPage=dashboardPage.OpenProject();
    }
}
