package Day3;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\OneDrive\\Desktop\\java testing\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 try
		{
			driver.get("http://the-internet.herokuapp.com/upload");
			
		     File uploadFile=new File("C:\\Users\\shiva\\OneDrive\\Desktop\\java testing\\selenium\\114-the-art-of-software-testing-3-edition.pdf");
			
			WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
			 fileInput.sendKeys(uploadFile.getAbsolutePath());
			 
			 driver.findElement(By.id("file-submit")).click();
			 String resultText = driver.findElement(By.id("upload-files")).getText();
			 System.out.println("Uploaded: " + resultText);
			 Thread.sleep(500000);
			 
		}
		finally
		{
		driver.quit();
		}

	}

}
