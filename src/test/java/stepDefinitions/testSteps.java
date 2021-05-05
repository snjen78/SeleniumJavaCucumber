package stepDefinitions;
import dataProvider.ConfigFileReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.inventoryPage;
import pageObjects.loginPage;
import pageManager.PageWrapper;

import java.util.Iterator;
import java.util.Set;

public class testSteps {

    WebDriver driver;
    loginPage loginpage;
    inventoryPage inventorypage;
    ConfigFileReader configFileReader;
    pageManager.PageWrapper pageWrapper;

    @Before
    public void browserSetup(){
        configFileReader= new ConfigFileReader();
        System.out.println("====Iam in Setup method");
        System.setProperty("webdriver.chrome.driver",configFileReader.getDriverPath());
        driver= new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        pageWrapper = new PageWrapper(driver);

    }


    @After
    public void tearDown(){
        System.out.println("====Iam in teardown method");
        driver.close();
    }


    @Given("the user opens URL")
    public void the_user_opens_url() {
        // getting URL from config.properties file
        driver.get(configFileReader.getUrl());
    }

    @Then("^the user enters username as (.*) and password as (.*)$")
    public void the_user_enters_username_as_and_password_as(String username, String password) {

        loginpage = pageWrapper.getLoginpage();
        loginpage.enterUsername(username);
        loginpage.enterpassword(password);
    }

    @Then("the user clicks login button")
    public void the_user_clicks_login_button(){
        loginpage.clicklogin();
    }

    @And("the user clicks item")
    public void the_user_clicks_item(){
        inventorypage = pageWrapper.getInventorypage();
        inventorypage.clickItem();
    }









}
