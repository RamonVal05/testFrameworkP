package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Constants;

public class LoginPage {
    private WebDriver driver;

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By epicSadface = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    public void verifyLoginDetails(){
        String actualMessage = driver.findElement(epicSadface).getText();
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualMessage,expectedMessage);

    }

    public void login(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    public void notlogin(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLogin();
        verifyLoginDetails();
    }

    public void validLogin(){

        enterUsername(Constants.CORRECTUSER);
        enterPassword(Constants.CORRECTPASSWORD);
        clickLogin();
    }
}


