package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usecase1 {
    public static void main(String[] args) {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\OneDrive\\Desktop\\java testing\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
         
            driver.get("https://www.google.com");        
            WebElement searchBox = driver.findElement(By.name("q")); 
            searchBox.sendKeys("https://www.tutorialspoint.com/selenium/index.htm");
            searchBox.sendKeys(Keys.RETURN);
            Thread.sleep(20000);
            System.out.println("Search Results Page Title: " + driver.getTitle());

      } catch (Exception e) {
            e.printStackTrace();
        }  
    }
}

