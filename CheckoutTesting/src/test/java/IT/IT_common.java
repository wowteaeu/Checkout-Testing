package IT;

import static baseFunctions.CommonFunctions.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class IT_common {

public static void IT_fillingForm() {
		
	  driver.findElement(By.className("woocommerce-terms-and-conditions-wrapper"));
	  driver.findElement(By.xpath("//*[@id=\"payment\"]/div/div[1]/p"));
	  driver.findElement(By.id("billing_email")).sendKeys("trashthisorder@test.test");
	  driver.findElement(By.id("billing_first_name")).sendKeys("Dragomir");
	  driver.findElement(By.id("billing_phone")).sendKeys("+393392202522");
	  driver.findElement(By.id("billing_city")).sendKeys("Sipron");
	  driver.findElement(By.id("billing_address_1")).sendKeys("33090");
	  driver.findElement(By.id("billing_postcode")).sendKeys("33090");
	
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	 
}
	
}
