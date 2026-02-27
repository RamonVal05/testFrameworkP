package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By epicSadface = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/text()");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys("username");
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys("password");
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    public void verifyLoginDetails(){driver.findElement(epicSadface).equals("Epic sadface: Username and password do not match any user in this service");}

    public void login(String username, String password){
        enterPassword(username);
        enterPassword(password);
        clickLogin();
    }

    public void notlogin(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLogin();
        verifyLoginDetails();
    }
}


