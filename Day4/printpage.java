package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printpage {
	

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://github.com/");
		
		
		String Url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println("The URL of the page:" +Url);
		System.out.println("The title of the page is:" + title);
		
		driver.quit();
		
	}

}
