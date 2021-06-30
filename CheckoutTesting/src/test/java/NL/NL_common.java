package NL;

import static baseFunctions.CommonFunctions.driver;

import org.openqa.selenium.By;

public class NL_common {

	public static void NL_fillingForm() {

		  driver.findElement(By.className("woocommerce-terms-and-conditions-wrapper"));
		  driver.findElement(By.xpath("//*[@id=\"payment\"]/div/div[1]/p"));
		  driver.findElement(By.id("billing_email")).sendKeys("trashthisorder@test.test");
		  driver.findElement(By.id("billing_first_name")).sendKeys("Test");
		  driver.findElement(By.id("billing_last_name")).sendKeys("Test");
		  driver.findElement(By.id("billing_phone")).sendKeys("+31613050497"); 
		  driver.findElement(By.id("billing_city")).sendKeys("Amsterdam");
		  driver.findElement(By.id("billing_address_1")).sendKeys("Street 2564");
		  driver.findElement(By.id("billing_postcode")).sendKeys("3864 JT");  
		  
	}

}
