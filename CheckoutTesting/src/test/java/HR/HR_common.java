package HR;

import static baseFunctions.CommonFunctions.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HR_common {

public static void HR_fillingForm() {
		
	  driver.findElement(By.className("woocommerce-terms-and-conditions-wrapper"));
	  driver.findElement(By.xpath("//*[@id=\"payment\"]/div/div[1]/p"));
	  driver.findElement(By.id("billing_email")).sendKeys("trashthisorder@test.test");
	  driver.findElement(By.id("billing_first_name")).sendKeys("Dragomir");
	  driver.findElement(By.id("billing_phone")).sendKeys("+385989417580");
	  driver.findElement(By.id("billing_city")).sendKeys("Sipron");
	  driver.findElement(By.id("billing_address_1")).sendKeys("23000");
	  driver.findElement(By.id("billing_postcode")).sendKeys("23000");
	
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	 
}

public static void HR_Mollie() {
	
	  WebDriverWait wait = new WebDriverWait(driver, 20);
	  WebDriverWait waitTwo = new WebDriverWait(driver, 10);

	  //Click the Mollie option

	  WebElement  mollieElement=driver.findElement(By.xpath("//*[@id=\"payment\"]/ul/li[3]/label"));  
	  JavascriptExecutor mollie=(JavascriptExecutor)driver;
	  mollie.executeScript("arguments[0].click()", mollieElement);
	  WebElement paypalShit = driver.findElement(By.id("paypal_checkout_method"));
	  waitTwo.until(ExpectedConditions.invisibilityOf(paypalShit));
	  JavascriptExecutor paypalSHit = (JavascriptExecutor)driver;
	//  paypalSHit.executeScript("arguments[0].scrollIntoView(true)", paypalShit);
	  paypalSHit.executeScript("window.scrollBy(0,1200)");
	  
	  
	  
	  driver.switchTo().frame((WebElement)driver.findElement(By.xpath("//*[@id=\"cardHolder\"]/div[1]/iframe"))); 
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cardHolder\"]")));
	  waitTwo.until(ExpectedConditions.presenceOfElementLocated(By.id("cardHolder"))).sendKeys("testtest");
	  System.out.println("CardHolder credentials successfully placed!");
	  driver.switchTo().defaultContent();
	  
	  
	  driver.switchTo().frame((WebElement)driver.findElement(By.xpath("//*[@id=\"cardNumber\"]/div[1]/iframe"))); 
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cardNumber\"]")));
	  waitTwo.until(ExpectedConditions.presenceOfElementLocated(By.id("cardNumber"))).sendKeys("3456 789012 34564");
	  System.out.println("CardNumber credentials successfully placed!");
	  
	  driver.switchTo().defaultContent();
	  
	  
	  driver.switchTo().frame((WebElement)driver.findElement(By.xpath("//*[@id=\"expiryDate\"]/div[1]/iframe"))); 
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"expiryDate\"]")));
	  waitTwo.until(ExpectedConditions.presenceOfElementLocated(By.id("expiryDate"))).sendKeys("1123");
	  System.out.println("ExpiryDate credentials successfully placed!");
	  driver.switchTo().defaultContent();
	  
	  
	  driver.switchTo().frame((WebElement)driver.findElement(By.xpath("//*[@id=\"verificationCode\"]/div[1]/iframe"))); 
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"verificationCode\"]")));
	  waitTwo.until(ExpectedConditions.presenceOfElementLocated(By.id("verificationCode"))).sendKeys("2314");
	  System.out.println("Varification code credentials successfully placed!");
	  driver.switchTo().defaultContent();
	  

	  //Find the checkbox
	  
	  WebElement  element=driver.findElement(By.xpath("//*[@id=\"terms\"]"));  
	  JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	  
	  //Click the place order  button
	  
	  WebElement  element1=driver.findElement(By.id("place_order"));  
	  JavascriptExecutor ex1=(JavascriptExecutor)driver;
	  ex1.executeScript("arguments[0].click()", element1);

}
	
	
}
