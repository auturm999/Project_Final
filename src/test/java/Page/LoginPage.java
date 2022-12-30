package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebUI;

public class LoginPage {
    WebDriver driver;
    //ham dung
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        new WebUI (driver);
    }

    private By buttonLogin=By.xpath("//button[normalize-space()='Log in']");
    private By inputEmail=By.id("Email");
    private By inputPassword=By.id("Password");
    public DashboardPage login(String email,String password) throws InterruptedException { // thay the voi thanh trang moi toi
          driver.get("https://admin-demo.nopcommerce.com/login");
      //  WebUI.setText(driver,inputEmail,email);
      //  WebUI.setText(driver,inputPassword,password);
         WebUI.clickElement(buttonLogin);
         WebUI.sleep(2000);
         return new DashboardPage();
    }

}
