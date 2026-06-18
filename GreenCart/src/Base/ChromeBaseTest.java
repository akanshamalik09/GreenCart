package Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.time.Duration;  // Timer ka time (seconds) set karne ke liye
import org.openqa.selenium.By;   // Locator pass karne ke liye
import org.openqa.selenium.support.ui.ExpectedConditions;   // Shart (Condition) check karne ke liye
import org.openqa.selenium.support.ui.WebDriverWait;          //Explicit Wait ke liye 

public class ChromeBaseTest {
	
	 public static WebDriver driver;
	
	// 1. DEEP CONCEPT: ENCAPSULATION (ACCESS CONTROL)
	    protected static WebDriverWait wait;
	    
	
//	@Test(priority = 1)
	public static void initializeChromebrowser() {
		driver= new ChromeDriver();
		System.out.println("hello world");
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		// 2. IMPLEMENTATION: OBJECT INITIALIZATION
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	}
	// 3. DEEP CONCEPT: ABSTRACTION (COMPLEXITY HIDING)
	public static void waitForElementToAppear(By locator) {
	    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
//	@Test(priority = 2)
	public static void exitChromebrowser() {
		driver.close();
		
	}
}
