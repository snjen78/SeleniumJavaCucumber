package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class inventoryPage {

    WebDriver driver;

    public inventoryPage(WebDriver driver) {
        this.driver= driver;
        if(!driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")){
            throw new IllegalStateException("!!!!!! This is not Login Page... You are on -> "+driver.getCurrentUrl());
        }
    }

    private By item= By.xpath("//div[@class='inventory_container']//div[@class='inventory_item'][1]//button");
    public void clickItem(){
        driver.findElement(item).click();
    }



}
