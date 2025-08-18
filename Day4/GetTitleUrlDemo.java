package Day4;

import org.openqa.selenium.WebDriver;

public class GetTitleUrlDemo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println();
	}

}
