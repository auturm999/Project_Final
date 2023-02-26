package TestCase;

import Page.CommonPage;
import Page.DashboardPage;
import Page.LoginPage;
import Page.ManufacturersPage;
import common.BaseTest;
import datatest.ConstantData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardTest  extends BaseTest {
    LoginPage loginPage ;
    DashboardPage dashboardPage;
    public CommonPage commonPage;
    @BeforeMethod

    public void setupTest(){
        loginPage=new LoginPage(driver);
       //dashboardPage = new DashboardPage(driver);
    }
    @Test (priority=11)
    public void LoginValid() {

        dashboardPage=loginPage.logIn(ConstantData.EMAIL,ConstantData.PASSWORD);
        dashboardPage.Openfacturers();
    }
    @Test(priority=2)
    public void LogOut() {   dashboardPage=loginPage.logIn(ConstantData.EMAIL,ConstantData.PASSWORD);
        dashboardPage.dangXuat();
    }

}
