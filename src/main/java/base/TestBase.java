package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestBase {
    WebDriver driver;


    public WebDriver webDriver() {
        driver = new ChromeDriver();
        return driver;
    }


    public void destroySetup() {
        driver.quit();
    }
}
