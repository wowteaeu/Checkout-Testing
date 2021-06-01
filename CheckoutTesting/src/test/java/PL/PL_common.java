package PL;

import static baseFunctions.CommonFunctions.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class PL_common {
	
public static void PL_fillingForm() {
		
		
	  driver.findElement(By.className("woocommerce-terms-and-conditions-wrapper"));
	  driver.findElement(By.xpath("//*[@id=\"payment\"]/div/div[1]/p"));
	  driver.findElement(By.id("billing_email")).sendKeys("trashthisorder@test.test");
	  driver.findElement(By.id("billing_first_name")).sendKeys("Dragomir");
	  driver.findElement(By.id("billing_phone")).sendKeys("+48691623661"); 
	  driver.findElement(By.id("billing_city")).sendKeys("Sipron");
	  driver.findElement(By.id("billing_address_1")).sendKeys("42-244");
	  driver.findElement(By.id("billing_postcode")).sendKeys("42-244");
	
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	 
}
	
	

}
