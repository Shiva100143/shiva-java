package Day1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumSe {

	public static void main(String[] args) {
		// start session
		WebDriver driver = new ChromeDriver();
		//navigation the browser
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		driver.getTitle();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
          
        //take action
        textBox.sendKeys("Selenium");
        submitButton.click();
        
        WebElement message = driver.findElement(By.id("message"));
        message.getText();
        
        driver.quit();
	
	}

}
