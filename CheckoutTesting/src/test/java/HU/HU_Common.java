package HU;
import static baseFunctions.CommonFunctions.driver;

import org.openqa.selenium.By;

public class HU_Common {
	
public static void HU_fillingForm() {
		
	  driver.findElement(By.className("woocommerce-terms-and-conditions-wrapper"));
	  driver.findElement(By.xpath("//*[@id=\"payment\"]/div/div[1]/p"));
	  driver.findElement(By.id("billing_email")).sendKeys("trashthisorder@test.test");
	  driver.findElement(By.id("billing_first_name")).sendKeys("Dragomir");
	  driver.findElement(By.id("billing_phone")).sendKeys("+36204548362");
	  driver.findElement(By.id("billing_city")).sendKeys("Sipron");
	  driver.findElement(By.id("billing_address_1")).sendKeys("9400");
	  driver.findElement(By.id("billing_postcode")).sendKeys("9400");

}
	
}
