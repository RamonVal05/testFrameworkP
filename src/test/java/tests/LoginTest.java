package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);
    @Test
    public void openPageTest(){
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void validLoginTest() {
        driver.get("https://www.saucedemo.com/");

        loginPage.login("standard_user", "secret_sauce");
    }
    @Test
    public void invalidLoginTest(){
        driver.get("https://www.saucedemo.com/");

        loginPage.notlogin("ssasdadasd","secret_sauce");
    }
}
