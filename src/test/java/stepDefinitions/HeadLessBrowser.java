package stepDefinitions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

    @Test
    public void chromeHeadless(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //create object of chrome options
        ChromeOptions options = new ChromeOptions();

        //add the headless argument
        options.addArguments("headless");

        //pass the options parameter in the Chrome driver declaration
        WebDriver driver = new ChromeDriver(options);

        //Navigate to toolsQA site url
        driver.get("https://demoqa.com/");

        //Print the Title of the Page
        System.out.println("Title of the page is -> " + driver.getTitle());

        //Close the driver
        driver.close();

    }



}
