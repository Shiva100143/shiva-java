package Day3;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties props = Properties("");
		FileInputStream fis = new FileInputStream(null);
		props.load(fis);
		String email = props.getProperty("facebook.email");
		String password = props.getProperty("facebook.password");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(30000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(30000);
		driver.quit();

	}

}
