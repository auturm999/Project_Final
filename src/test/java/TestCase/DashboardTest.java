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
    @Test (priority=11)
    public void LoginValid() {

        dashboardPage=loginpage.loginSucces("admin@yourstore.com","admin");
        manufacturerPage=dashboardPage.OpenProject();
    }
    @Test(priority=2)
    public void LogOut() {   dashboardPage=loginpage.loginSucces("admin@yourstore.com","admin");
        dashboardPage.LogOut();
    }

}
