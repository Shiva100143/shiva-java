package Day2;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeStragey {
	public static void main(String[] args) {

	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\OneDrive\\Desktop\\java testing\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     
	 
	 ChromeOptions chromeOptions = getDefaultChromeOptions();
	 chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
	 ChromeDriver driver = new ChromeDriver(chromeOptions);
	 try {
	      // Navigate to Url
	      driver.get("https://selenium.dev");
	    } finally {
	      driver.quit();
	}

}

	private static ChromeOptions getDefaultChromeOptions() {
		// TODO Auto-generated method stub
		return null;
	}
}
