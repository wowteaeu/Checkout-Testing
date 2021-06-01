package AT;

import static baseFunctions.CommonFunctions.driver;

import org.openqa.selenium.By;

public class AT_common {

	public static void AT_fillingForm() {
		
		  driver.findElement(By.className("woocommerce-terms-and-conditions-wrapper"));
		  driver.findElement(By.xpath("//*[@id=\"payment\"]/div/div[1]/p"));
		  driver.findElement(By.id("billing_email")).sendKeys("trashthisorder@test.test");
		  driver.findElement(By.id("billing_first_name")).sendKeys("Test");
		  driver.findElement(By.id("billing_last_name")).sendKeys("Test");
		  driver.findElement(By.id("billing_phone")).sendKeys("+436644189497"); 
		  driver.findElement(By.id("billing_city")).sendKeys("Berlin");
		  driver.findElement(By.id("billing_address_1")).sendKeys("9523");
		  driver.findElement(By.id("billing_postcode")).sendKeys("9523"); 
		  
	}
	
	
}
