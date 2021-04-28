package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class loginPage {

    WebDriver driver;

    // creating a constructure
    public loginPage(WebDriver driver){
        this.driver= driver;
        if(!driver.getTitle().equals("Swag Labs")){
            throw new IllegalStateException("!!!!!! This is not Login Page... You are on -> "+driver.getTitle());
        }
    }

    // locators of the login page goes below
    public  By username_field       = By.id("user-name");
    public  By password_field       = By.id("password");
    private By login_button         = By.id("login-button");
    public  By product_page_anchor  = By.className("product_label");


    // page specific methods to perform actions
    public void enterUsername(String username){ driver.findElement(username_field).sendKeys(username); }
    public void enterpassword(String password){
        driver.findElement(password_field).sendKeys(password);
    }
    public void clicklogin(){
        driver.findElement(login_button).click();
    }





}
