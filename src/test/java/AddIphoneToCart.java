import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;

import javax.management.remote.MBeanServerForwarder;

public class AddIphoneToCart extends TestBase {
    WebDriver driver;


    @Test
    public void addIphoneToCart() {
        driver = webDriver();
        MainPage page = new MainPage(driver);
        driver.get("https://bstackdemo.com/");
        page.addToCart();
        destroySetup();

    }
}
