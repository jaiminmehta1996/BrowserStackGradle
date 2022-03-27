package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    WebDriver driver;
    //  @FindBy(xpath = "(//div[text()='Add to cart'])[1]")
    public MainPage(WebDriver driver) {
        this.driver = driver;

    }

  //  WebElement addButton = driver.findElement(By.xpath("(//div[text()='Add to cart'])[1]"));

    public void addToCart() {
      //  addButton.click();

    }
}
