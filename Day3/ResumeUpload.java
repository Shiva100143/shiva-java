package Day3;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ResumeUpload {

	public static void main(String[] args)
			throws InterruptedException 
	{
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\OneDrive\\Desktop\\java testing\\selenium\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();	        
	            driver.get("https://login.naukri.com/nLogin/Login.php");

	            driver.findElement(By.id("usernameField")).sendKeys("shivajakkam201@gmail.com");
	            driver.findElement(By.id("passwordField")).sendKeys("Shiva@8074");
	            driver.findElement(By.xpath("//button[@type='submit']")).click();	            
	            Thread.sleep(5000);
	            driver.get("https://www.naukri.com/mnjuser/profile");	                       
	            Thread.sleep(5000);	  
	            //WebElement fileInput = driver.findElement(By.id("attachCV")); 
	            File resumeFile = new File("C:\\Users\\shiva\\OneDrive\\Desktop\\java testing\\selenium\\jakkamshiva_resume.pdf");   
	            //WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"resume360\"]"));
	            WebElement fileInput = driver.findElement(By.id("attachCV")); 
	            
	            fileInput.sendKeys(resumeFile.getAbsolutePath());
	            Thread.sleep(5000);            
	  
	            //driver.quit();
	        }
}