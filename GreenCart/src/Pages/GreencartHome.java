package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;




public class GreencartHome  {
	WebDriver driver;   

	public GreencartHome(WebDriver drv){
    	this.driver = drv;
    }
	
	
     //search vegetables
	public void searchforvegetables() {
	driver.findElement(By.cssSelector("input[placeholder='Search for Vegetables and Fruits']")).sendKeys("Beetroot");
	}
	
	//Get product name
	public String getproductname() {
	return driver.findElement(By.cssSelector("h4.product-name")).getText();
	}
	
	//Add to cart
	public void addBeetroottocart() {
		driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
		
	}
	
	//click on bag icon
	public void clickonbag() {
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		}
	
	//click on proceed to checkout
	public void proceedtocheckout() {
		driver.findElement(By.xpath("//div[@class='action-block']")).click();
	}
	
	
	
	
	
	
	
	
	
/*//	@Test(priority=1)
	public void checkTopDealsLink() throws InterruptedException {
		driver.findElement(By.cssSelector("a[class='cart-header-navlink']:nth-child(2)")).click();
		 Thread.sleep(2000);
		 java.util.Iterator<String> it = driver.getWindowHandles().iterator();
		 String parentId = it.next(); 
		 String childId = it.next();
		 driver.switchTo().window(childId);
		 System.out.println("Naye tab ka URL hai: " + driver.getCurrentUrl());
		 driver.close(); 
		 driver.switchTo().window(parentId);
		 System.out.println("Wapas main page par aa gaye. Title hai: " + driver.getTitle());
		
	}
	
//	@Test(priority=2)
	public void checkFlightBooking() throws InterruptedException {
		driver.findElement(By.cssSelector("a[class='cart-header-navlink']:nth-child(3)")).click();
		 Thread.sleep(2000);
		 java.util.Iterator<String> it = driver.getWindowHandles().iterator();
		 String parentId = it.next(); 
		 String childId = it.next();
		 driver.switchTo().window(childId);
		 System.out.println("Naye tab ka URL hai: " + driver.getCurrentUrl());
	     driver.close(); 
	     driver.switchTo().window(parentId);
		 System.out.println("Wapas main page par aa gaye. Title hai: " + driver.getTitle());
	}*/
	

	

}
