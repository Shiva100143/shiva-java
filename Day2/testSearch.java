package Day2;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
public class testSearch {
    public static void main(String[] args) throws InterruptedException {
 
        WebDriver driver = new ChromeDriver();       
        driver.manage().window().maximize();
        System.out.print("hello");
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        System.out.print("hello");
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);        
        driver.get("https://www.youtube.com");
        Thread.sleep(5000);
        driver.quit();
    }
}

