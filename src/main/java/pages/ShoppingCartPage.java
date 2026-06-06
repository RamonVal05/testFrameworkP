package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ShoppingCartPage {
    private WebDriver driver;
    private By tittleText = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
    }

    public void verifyTittleText(){
        String actualMessage = driver.findElement(tittleText).getText();
        String expectedMessage = "Your Cart";

        Assert.assertEquals(actualMessage,expectedMessage);

    }
}
