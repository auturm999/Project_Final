package TestCase;

import Page.DashboardPage;
import Page.LoginPage;
import Page.ManufacturersPage;
import common.BaseTest;
import datatest.ConstantData;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.WebUI;

public class ManufacturersTest extends BaseTest {
    LoginPage loginpage ;

    ManufacturersPage manufacturerPage;
    DashboardPage dashboardPage;
    @BeforeMethod
    public void setUpTest()
    {
        loginpage=new LoginPage(driver);
    }
    @Test
    @Parameters({"email","pass"})
     public void testAddProject(String email,String pass) throws InterruptedException {

        dashboardPage=loginpage.logIn(email,pass);
        manufacturerPage=dashboardPage.Openfacturers();
        manufacturerPage.addManufacturer();
    }

}
