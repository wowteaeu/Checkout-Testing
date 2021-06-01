package RO;

import static baseFunctions.CommonFunctions.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RO_common {

public static void RO_fillingForm() {
		
	  driver.findElement(By.className("woocommerce-terms-and-conditions-wrapper"));
	  driver.findElement(By.xpath("//*[@id=\"payment\"]/div/div[1]/p"));
	  driver.findElement(By.id("billing_email")).sendKeys("trashthisorder@test.test");
	  driver.findElement(By.id("billing_first_name")).sendKeys("Dragomir");
	  driver.findElement(By.id("billing_phone")).sendKeys("+40762618530"); 
	  driver.findElement(By.id("billing_city")).sendKeys("Sipron");
	  driver.findElement(By.id("billing_address_1")).sendKeys("905700");
	  
	  //here the dropdown
	  
	  Select drpdown = new Select(driver.findElement(By.className("select2-hidden-accessible")));
	  drpdown.selectByIndex(2);
	  driver.findElement(By.id("billing_postcode")).sendKeys("905700");

	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	 
}
	
	
}
