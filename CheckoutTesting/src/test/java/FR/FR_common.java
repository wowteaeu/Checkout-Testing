package FR;

import static baseFunctions.CommonFunctions.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class FR_common {
	
	
	
	public static void FR_fillingForm() {
		
		  driver.findElement(By.className("woocommerce-terms-and-conditions-wrapper"));
		  driver.findElement(By.xpath("//*[@id=\"payment\"]/div/div[1]/p"));
		  driver.findElement(By.id("billing_email")).sendKeys("trashthisorder@test.test");
		  driver.findElement(By.id("billing_first_name")).sendKeys("Dragomir");
		  driver.findElement(By.id("billing_phone")).sendKeys("0675373093");
		  driver.findElement(By.id("billing_city")).sendKeys("MONTBRISON");
		  driver.findElement(By.id("billing_address_1")).sendKeys("42600");
		  driver.findElement(By.id("billing_postcode")).sendKeys("42600");
		
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		 
	}
	
	

}
