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
 *  4. Close the browser.
 */
public class GoogleMain {

    public final static String CHROME_DRIVER_RAGINI = "/Users/raginiyampalli/opt/homebrew/bin/chromedriver";
    //TODO
    public final static String CHROME_DRIVER_KARTHIK = "replace this text with your chrome driver location";


    public final static String GOOGLE_URL = "https://google.com";

    public static void main(String args[]) throws InterruptedException{
        WebDriver webDriver = new ChromeDriver();
        //TODO : Get this from environmental variables.
        System.setProperty("webdriver.chrome.driver",CHROME_DRIVER_RAGINI);
        webDriver.get(GOOGLE_URL);
        Thread.sleep(300);
        WebElement searchBar = webDriver.findElement(By.xpath("//*[@title=\"Search\"]"));
        searchBar.sendKeys("How to make paper planes");


        WebElement searchButton = webDriver.findElement(By.xpath("//*[@value=\"Google Search\"]"));
        searchButton.click();
        Thread.sleep(300);
        webDriver.quit();

    }

}
