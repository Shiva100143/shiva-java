package Day4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class FlipkartShopping {

    public static void main(String[] args) throws InterruptedException {

    	Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\shiva\\java selenium\\SeleniumTesting\\src\\Day4\\Config.properties");
        props.load(fis);        
        String email = props.getProperty("amazon.email");
        String password = props.getProperty("amazon.password");
        String searchItem1 = props.getProperty("searchItem1"); 
       
        List<String> products = new ArrayList<>();
        products.add("laptop");
        products.add("wireless mouse");
        products.add("headphones");
        products.add("smartphone");
        products.add("backpack");

        for (String product : products) {
           
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.clear();
            searchBox.sendKeys(product);
            driver.findElement(By.cssSelector("button[type='submit']")).click();

            Thread.sleep(3000);

          
            List<WebElement> items = WebDriver.findElements(By.cssSelector("a._1fQZEK, a.IRpwTa")); // product links
            if (items.size() > 0) {
                items.get(0).click();
            } else {
                System.out.println("No products found for: " + product);
                continue;
            }

           
            Set<String> windows = driver.getWindowHandles();
            List<String> tabs = new ArrayList<>(windows);
            driver.switchTo().window(tabs.get(tabs.size() - 1));

            
            try {
                WebElement addToCart = driver.findElement(By.cssSelector("button._2KpZ6l._2U9uOA._3v1-ww"));
                addToCart.click();
                System.out.println(product + " added to cart.");
            } catch (Exception e) {
                System.out.println("Could not add to cart: " + product);
            }

            Thread.sleep(2000);
            driver.close();
            driver.switchTo().window(tabs.get(0));
        }

      
        driver.findElement(By.cssSelector("a._3SkBxJ")).click();

        Thread.sleep(3000);

    
        try {
            WebElement placeOrder = driver.findElement(By.cssSelector("button._2KpZ6l._2ObVJD._3AWRsL"));
            placeOrder.click();
        } catch (Exception e) {
            System.out.println("Please log in to proceed with payment.");
        }

        // Optionally, driver.quit();
        // driver.quit();
    }
}

