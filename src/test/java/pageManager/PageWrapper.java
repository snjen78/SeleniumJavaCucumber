package pageManager;

import org.openqa.selenium.WebDriver;
import pageObjects.inventoryPage;
import pageObjects.loginPage;


public class PageWrapper {

    private WebDriver driver;
    private inventoryPage inventorypage;
    private loginPage loginpage;

    // Creating the constructor and passing parameter of WebDriver
    public PageWrapper(WebDriver driver){
        this.driver = driver;
    }

    public inventoryPage getInventorypage(){ return (inventorypage==null) ? inventorypage=new inventoryPage(driver): inventorypage;}
    public loginPage getLoginpage(){
        if(loginpage==null){ loginpage= new loginPage(driver);}
        System.out.println("=====>> I am inside Page Wrapper=> getloginPage****");
        return loginpage;

    }

}
