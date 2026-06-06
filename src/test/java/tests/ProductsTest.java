package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import pages.ShoppingCartPage;

public class ProductsTest extends BaseTest {

    @Test
    public void checkShoppingCart(){
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.validLogin();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.clickShoppingCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.verifyTittleText();
    }
}
