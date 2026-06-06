package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void openPageTest(){
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void validLoginTest() {
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.validLogin();
    }
    @Test
    public void invalidLoginTest(){
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.notlogin();
    }
}
