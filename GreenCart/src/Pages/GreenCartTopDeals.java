/*package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class GreenCartTopDeals {
	WebDriver driver;
	
	public GreenCartTopDeals(WebDriver drv) {
		this.driver=drv;
	}
	
	//@Test(priority=1)
	public void selectpagesize() throws InterruptedException {
		WebElement staticDropdown=	driver.findElement(By.xpath("//select[@id='page-menu']"));

		System.out.println("Dropdown value");

		Select dropdown = new Select(staticDropdown);
		dropdown.selectByValue("5");
		Thread.sleep(3000);
		System.out.println("Dropdown value 5 successfully selected!");
		
	}

}
*/