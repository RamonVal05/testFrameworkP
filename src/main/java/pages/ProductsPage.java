package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private WebDriver driver;

    private By shoppingCart = By.id("shopping_cart_container");

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickShoppingCart(){
        driver.findElement(shoppingCart).click();
    }
}
