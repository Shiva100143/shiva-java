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
public class AmazonLogin
{
	public static void main(String[] args)
			throws IOException, InterruptedException
	{
		Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\shiva\\java selenium\\SeleniumTesting\\src\\Day4\\Config.properties");
        props.load(fis);        
        String email = props.getProperty("amazon.email");
        String password = props.getProperty("amazon.password");
        String searchItem1 = props.getProperty("searchItem1"); 
       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     
        driver.get("https://www.amazon.in");   
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email_login")).sendKeys(email);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
        
        List<String> products = new ArrayList<>();
        products.add("laptop");
        products.add("headphones");
        products.add("wireless mouse");
        for (String product : products) {
            
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.clear();
            searchBox.sendKeys(product);
            driver.findElement(By.id("nav-search-submit-button")).click();
            driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();
            Thread.sleep(3000);
 
        driver.quit();
	}
        
}
}