emopackage Day3;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Getproperty {

	public static void main(String[] args)
			 throws IOException, InterruptedException
	{
	
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("prsnl.propertites");
        props.load(fis);
        String email = props.getProperty("naukri.email");
        String password = props.getProperty("naukri.password");
        String resumePath = props.getProperty("resume.path");
        String chromeDriverPath = props.getProperty("chromedriver.path");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.naukri.com/nlogin/login");
        driver.findElement(By.id("usernameField")).sendKeys(email);
        driver.findElement(By.id("passwordField")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();     
        Thread.sleep(5000);
        driver.get("https://www.naukri.com/mnjuser/profile");
        Thread.sleep(5000);
        WebElement uploadInput = driver.findElement(By.className("fileUpload"));
        uploadInput.sendKeys(resumePath);
        Thread.sleep(5000);
        driver.quit();
	}
}