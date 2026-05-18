package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GreencartCheckoutpage {
	
	WebDriver driver;
	
	public GreencartCheckoutpage(WebDriver drv) {
		this.driver=drv;
		
	}
	
	public void enterpromocode(String Jimjam) {
	driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys(Jimjam);
	
	}
	
	public void clickapplybtn() {
		driver.findElement(By.cssSelector("button.promoBtn")).click();
	}
	
	//Clear
	public void clear() {
    driver.findElement(By.cssSelector("input.promoCode")).clear();
 
	}
}




