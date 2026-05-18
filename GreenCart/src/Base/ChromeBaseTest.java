package Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ChromeBaseTest {
	
	 public static WebDriver driver;
	
//	@Test(priority = 1)
	public static void initializeChromebrowser() {
		driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
	}
	
//	@Test(priority = 2)
	public static void exitChromebrowser() {
		driver.close();
		
	}
}
