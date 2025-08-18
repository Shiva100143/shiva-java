package Day4;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntra {
    public static void main(String[] args) throws IOException, InterruptedException {
       
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\shiva\\java selenium\\SeleniumTesting\\src\\Day4\\myntra.properties");
        props.load(fis);

        String myntraUsername = props.getProperty("myntra.username");
        String myntraPassword = props.getProperty("myntra.password");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.myntra.com/login");

        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email_login")).sendKeys(myntraUsername);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys(myntraPassword);
        driver.findElement(By.id("signInSubmit")).click();       
        List<String> searchItems = new ArrayList<>();
        searchItems.add("Men T-shirt");
        searchItems.add("Men Jeans");
        searchItems.add("Casual Shoes");
        searchItems.add("Backpack");
        searchItems.add("Sunglasses");

        for (String item : searchItems) {
            try { 
                WebElement searchBox = driver.findElement(By.className("desktop-searchBar")); 
                searchBox.clear();
                searchBox.sendKeys(item);
                driver.findElement(By.cssSelector(".desktop-submit")).click();                
                driver.findElement(By.xpath("//li[@class='product-base'][1]//a")).click(); 
                
                ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
                driver.switchTo().window(tabs.get(1)); 
                List<WebElement> sizeButtons = driver.findElements(By.cssSelector(".size-buttons-unified-size")); 
                if (!sizeButtons.isEmpty()) {
                    sizeButtons.get(0).click(); 
                } else {
                    System.out.println("No size found for " + item + ". Skipping.");
                    driver.close(); 
                    driver.switchTo().window(tabs.get(0)); 
                    continue; 
                }
                WebElement addToBagButton = driver.findElement(By.xpath("//div[@class='pdp-add-to-bag pdp-button pdp-add-to-bag--v2 ']")); 
                addToBagButton.click();
                Thread.sleep(2000);
                driver.close();
                driver.switchTo().window(tabs.get(0));

            } catch (Exception e) {
                System.err.println("Failed to add " + item + " to cart. Error: " + e.getMessage());
                ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
                driver.switchTo().window(tabs.get(0));
            }
        }
       
        try {  
            WebElement bagIcon = driver.findElement(By.cssSelector("span.myntraweb-sprite.desktop-iconBag")); 
            Actions actions = new Actions(driver);
            actions.moveToElement(bagIcon).perform();
            
            driver.findElement(By.cssSelector("a.myntra-cart-icon")).click(); 
            Thread.sleep(3000);
            
            driver.findElement(By.cssSelector(".css-1e6m34j")).click(); 

        } catch (Exception e) {
            System.err.println("Could not proceed to payment. Check cart locators. Error: " + e.getMessage());
        }

        try {            
            WebElement profileIcon = driver.findElement(By.cssSelector(".desktop-userTitle")); 
            Actions actions = new Actions(driver);
            actions.moveToElement(profileIcon).perform();           
            WebElement logoutLink = driver.findElement(By.cssSelector("a.desktop-link[href='/logout']")); 
            logoutLink.click();
            System.out.println("Logged out successfully.");
        } catch (Exception e) {
            System.err.println("Logout failed. Check locators. Error: " + e.getMessage());
        }

        driver.quit();
    }
}