package Pages;

import org.openqa.selenium.By;

import Base.ChromeBaseTest;

public class GreencartCountryPage extends ChromeBaseTest {
	
	private By countryDropdown = By.cssSelector("div select");
	private By termsCheckbox = By.cssSelector("input.chkAgree");
	private By proceedBtn = By.xpath("//button[text()='Proceed']");


public void selectcountryName(String countryName) throws InterruptedException {
//Line 1: Pehle dropdown ke load hone ka wait karo
waitForElementToAppear(countryDropdown);

//Line 2 & 3: Select machine lagao aur desh select karo
org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(driver.findElement(countryDropdown));
select.selectByValue(countryName);

Thread.sleep(3000);
}


//2. Checkbox par click karne ka method
public void clickTermsCheckbox() throws InterruptedException {
 driver.findElement(termsCheckbox).click();
 
 Thread.sleep(3000);
}

//3. Proceed button par click karne ka method
public void clickProceedButton() throws InterruptedException {
 driver.findElement(proceedBtn).click();
 Thread.sleep(3000);
}

}










