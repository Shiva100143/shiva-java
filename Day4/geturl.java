package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;

public class geturl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		 driver.get("https://www.selenium.dev/");
	     PrintOptions printOptions = new PrintOptions();
	     printOptions.setOrientation(PrintOptions.Orientation.LANDSCAPE);
	     PrintOptions.Orientation current_orientation = printOptions.getOrientation();
        System.out.println(current_orientation);
	}

}
