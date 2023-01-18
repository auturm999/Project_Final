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
    @Test(priority=1)
    public void LoginSucces() throws InterruptedException {

        dashboardPage=loginpage.loginSucces("admin@yourstore.com","admin");
        dashboardPage.OpenProject();
    }
    @Test(priority=2)
    public void LoginUsernameInValid() throws InterruptedException {

        loginpage.loginWithUserName_Invalid("admin@yourstore.com11","admin");

    }
    @Test(priority=3)
    public void LoginPasswordInValid() throws InterruptedException {

        loginpage.loginWithPassword_Invalid("admin@yourstore.com","admin11");

    }

}
