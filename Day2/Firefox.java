package Day2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Firefox {
 
    public static void main(String[] args) {
    	 System.setProperty("webdriver.firefox.driver", "C:\\Users\\shiva\\OneDrive\\Desktop\\java testing\\selenium\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");
        // Initialize Firefox WebDriver
        WebDriver driver = new FirefoxDriver();
 
        // Open Google
        driver.get("https://www.google.com");
 
        // Print title
        System.out.println("Page Title: " + driver.getTitle());
 
        // Close browser
//        driver.close();
    }
}
 
 

