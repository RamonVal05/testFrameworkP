package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void openPageTest(){
        driver.get("https://www.saucedemo.com/");
    }
}
