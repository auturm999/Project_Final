package TestCase;

import Page.DashboardPage;
import Page.LoginPage;
import common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginpage ;
    DashboardPage dashboardPage;
    @BeforeMethod
    public void setUpTest()
    {
        loginpage=new LoginPage(driver);
    }
    @Test
    public void testLoginValid() throws InterruptedException {

        dashboardPage=loginpage.login("admin@yourstore.com","admin");
        dashboardPage.OpenDashboard();
    }

}
