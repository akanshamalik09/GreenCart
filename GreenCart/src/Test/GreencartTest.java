package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.ChromeBaseTest;
import Pages.GreencartCheckoutpage;
//import Pages.GreenCartTopDeals;
import Pages.GreencartHome;

public class GreencartTest extends ChromeBaseTest {
  
	

	@BeforeMethod
	static void setup() {
		initializeChromebrowser();
	}
	
	 static void browserBackNavigations() throws InterruptedException {
		 driver.navigate().back();
	 }
	 
	 @Test
	 public void executeGreencartTests() throws InterruptedException {
		 
		 GreencartHome greencthm = new GreencartHome(driver);
		
		 greencthm.searchforvegetables();
		 Thread.sleep(2000);
		 String actualName =greencthm.getproductname();
		 System.out.println(actualName);
		 
		 //verification
		 org.testng.Assert.assertTrue(actualName.contains("Beetroot"), "Mismatched product found!");
         System.out.println("Verification Passed: Beetroot hi screen par hai.");
         
         //add to cart
         greencthm.addBeetroottocart();
         
         //click on bag
         greencthm.clickonbag(); 
         
         //click on proceed to checkout
         greencthm.proceedtocheckout();
         
         GreencartCheckoutpage greenchkoutpge=new GreencartCheckoutpage(driver);
         
         //Enterpromocode
         Thread.sleep(3000);
         greenchkoutpge.enterpromocode("Jimjam");
         
         //Click Apply Button
         greenchkoutpge.clickapplybtn();
         
         greenchkoutpge.clear();
         
        //GreencartTest.java mein ye badlav karo:
         greenchkoutpge.enterpromocode("rahulshettyacademy");
         
       //Click Apply Button
         greenchkoutpge.clickapplybtn();
         
	 } 
	 
	
	 
	 
		 
      // GreenCartTopDeals greenctopdeals= new GreenCartTopDeals(driver);
		 //greencthm.checkTopDealsLink();
		// greenctopdeals.selectpagesize();
        // greencthm.checkFlightBooking();
		 
		 

	 }
	 
	 
	 
	 
	
	

