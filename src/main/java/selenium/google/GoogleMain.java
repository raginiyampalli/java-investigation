package selenium.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This will do the following :
 *  1. Open google.com
 *  2. Enter "how to make paper air planes"
 *  3. Click on "Google Search" button.
 */
public class GoogleMain {

    public final static String CHROME_DRIVER_RAGINI = "/Users/raginiyampalli/opt/homebrew/bin/chromedriver";

    public final static String GOOGLE_URL = "https://google.com";

    public static void main(String args[]) throws InterruptedException{
        WebDriver webDriver = new ChromeDriver();
        //TODO : Get this from environmental variables.
        System.setProperty("webdriver.chrome.driver",CHROME_DRIVER_RAGINI);
        webDriver.get(GOOGLE_URL);
        Thread.sleep(1000);
        WebElement feelingLuckyButton = webDriver.findElement(By.id("gbqfbb")); //found
        //WebElement search = webDriver.findElement(By.id("gNO89b")); //unable to find


    }

}
