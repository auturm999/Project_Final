package Page;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.WebUI;

import java.time.Duration;

public class ManufacturersPage  extends CommonPage {
    private static WebDriver driver;
    private WebDriverWait wait;
    public ManufacturersPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        new WebUI (driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    By textManufacturers=By.xpath("//h1[normalize-space()='Manufacturers']");
    private  By buttonaddNew=By.xpath("//a[normalize-space()='Add new']");
    private  By txtname=By.id("Name");

    private By txtDescription = By.id("Description_ifr");
    private  By buttonSave=By.id("save");
    public void addManufacturer()
    {
        WebUI.clickElement(buttonaddNew);
        WebUI.sleep(5000);
        WebUI.setText(txtname,"Test");
        WebUI.setText(txtDescription,"Test");
        WebUI.clickElement(buttonSave);
    }

}
