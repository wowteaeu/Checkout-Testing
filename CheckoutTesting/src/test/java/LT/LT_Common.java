package LT;
import static baseFunctions.CommonFunctions.driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class LT_Common {
	

	
	public static void LT_fillingForm() {

		  driver.findElement(By.className("woocommerce-terms-and-conditions-wrapper"));
		  driver.findElement(By.xpath("//*[@id=\"payment\"]/div/div[1]/p"));
		  driver.findElement(By.id("billing_email")).sendKeys("trashthisorder@test.test");
		  driver.findElement(By.id("billing_first_name")).sendKeys("TEST");
		  driver.findElement(By.id("billing_phone")).sendKeys("+37064464346");
		  driver.findElement(By.id("billing_city")).sendKeys("Pozzallo");
		  driver.findElement(By.id("billing_address_1")).sendKeys("48209");
		  driver.findElement(By.id("billing_postcode")).sendKeys("48209");
		
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	  		
	}
	

	
//	public static void testResult(String testName) {
//		
//		 ExtentTest test = extent.createTest(testName);
//		 
//		 WebElement thGif = driver.findElement((By.cssSelector("figure[class='gif_success']")));
//		 
//		 	
//			if (thGif.isDisplayed()) {
//
//				test.log(Status.PASS, "Test is successful");
//
//			} else {
//
//				test.log(Status.FAIL, "Test Failed.Check your system !");
//				
//			}
//				 
//		
//	}
				
	}
	


