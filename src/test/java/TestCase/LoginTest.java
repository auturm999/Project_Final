package TestCase;

import Page.CommonPage;
import datatest.ConstantData;
import Page.DashboardPage;
import Page.LoginPage;
import common.BaseTest;
import helpers.PropertiesHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.WebUI;

public class LoginTest extends BaseTest {
    public LoginPage loginpage ;
    public CommonPage commonPage;
    @BeforeMethod
    public void loginTest()
    {
        loginpage=new LoginPage(driver);
        commonPage = new CommonPage(driver);
    }
    @Test(priority=1)
    public void testLoginSucces() throws InterruptedException {

      // loginpage.logIn(PropertiesHelper.getValue("email"),PropertiesHelper.getValue("pass"));
        loginpage.logIn(ConstantData.EMAIL,ConstantData.PASSWORD);
        commonPage.dangXuat();
    }
    @Test(priority=2)
    public void LoginUsernameInValid() throws InterruptedException {

        loginpage.loginWithUserName_Invalid(ConstantData.EMAIL,ConstantData.PASSWORD);
        WebUI.sleep(5);
    }
    @Test(priority=3)
    public void LoginPasswordInValid() throws InterruptedException {

        loginpage.loginWithPassword_Invalid("dfa",PropertiesHelper.getValue("fdgsdfgs"));
    }

}
