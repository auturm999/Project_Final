package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.WebUI;

import java.time.Duration;

public class LoginPage extends CommonPage{
     WebDriver driver;
    private WebDriverWait wait;
    //ham dung
    public LoginPage(WebDriver driver)
    {   super(driver);
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    private By buttonLogin=By.xpath("//button[normalize-space()='Log in']");
    private By inputEmail=By.id("Email");
    private By inputPassword=By.id("Password");

    private By message_error=By.xpath("//div[@class='message-error']");
    private By message_error_account=By.xpath("//div[contains(@class,'message-error')]//li");

    public DashboardPage logIn(String email,String password)  { // thay the voi thanh trang moi toi
        WebUI.openURL("https://admin-demo.nopcommerce.com/login");
        WebUI.clear(inputEmail);
        WebUI.clear(inputPassword);
        WebUI.setText(inputEmail,email);
        WebUI.setText(inputPassword,password);
        WebUI.clickElement(buttonLogin);
        WebUI.sleep(5);
       boolean checkDashboard =WebUI.checkElementExist(getDashboardPage().textTrangChu);
        Assert.assertTrue(checkDashboard,"Khong ton tai trang");
         return new DashboardPage(driver);
    }
    public void loginWithUserName_Invalid(String email,String password) throws InterruptedException { // thay the voi thanh trang moi toi
        WebUI.openURL("https://admin-demo.nopcommerce.com/login");
        WebUI.clear(inputEmail);
        WebUI.clear(inputPassword);
        WebUI.setText(inputEmail,email);
        WebUI.setText(inputPassword,password);
        WebUI.clickElement(buttonLogin);
        boolean checkMessageError =WebUI.checkElementExist(message_error_account);
        Assert.assertTrue(checkMessageError,"Fail. Eror mesaage not display");
        Assert.assertEquals(WebUI.getElementText(message_error_account),"No customer account found","Fail. Eror mesaage not display");
    }
    public void loginWithPassword_Invalid(String email,String password) throws InterruptedException { // thay the voi thanh trang moi toi
        WebUI.openURL("https://admin-demo.nopcommerce.com/login");
        WebUI.clear(inputEmail);
        WebUI.clear(inputPassword);
        WebUI.setText(inputEmail,email);
        WebUI.setText(inputPassword,password);
        WebUI.clickElement(buttonLogin);
        boolean checkMessageError =WebUI.checkElementExist(message_error_account);
        Assert.assertTrue(checkMessageError,"Fail. Eror mesaage not display");
        Assert.assertEquals(WebUI.getElementText(message_error_account),"The credentials provided are incorrect","Fail. Eror mesaage not display");

    }

}
