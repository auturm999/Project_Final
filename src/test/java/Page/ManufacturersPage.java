package Page;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebUI;

public class ManufacturersPage   {

    public ManufacturersPage()
    {
    }
    private  By addNew=By.xpath("//a[normalize-space()='Add new']");
    private  By name=By.id("Name");
    public void addManufacturer()
    {
        WebUI.clickElement(addNew);
        WebUI.sleep(5000);
        WebUI.setText(name,"Test");

    }

}
