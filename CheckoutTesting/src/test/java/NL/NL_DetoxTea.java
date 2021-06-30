package NL;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static NL.NL_common.NL_fillingForm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class NL_DetoxTea extends CommonFunctions {
	
	@Test
	  public void NL_DetoxTeaVariations() {
		  
		  ExtentTest test = extent.createTest("NL_DetoxTeaVariationsMollie");
		  
//		  driver.get("https://wowtea.eu/nl/product/wow-tea-detox/");
		  
		  driver.get("https://wowtea.eu/nl/product/slimfit-superfruit/");
		  
		  addAllVariations();
		  
		  NL_fillingForm();
		  
		  fillingMollie();
		  
		  try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  Assert.assertEquals(driver.getCurrentUrl().contains("/order-pay/"), true);
			  // How to reuse this code !
			  
			  String currentUrl = driver.getCurrentUrl();
			  
			  if (currentUrl.contains("/order-pay/")) {
				  test.log(Status.PASS, "Test is successful !");
			  } else {
				  test.log(Status.FAIL, "Test failed!");
			  }
		    
	  }
	
	
	@Test
	  public void NL_DetoxTeaVariationsAdyen() {
		
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		
		  driver.get("https://wowtea.eu/nl/product/wow-tea-detox/");
		  
		  addAllVariations();
		  
		  NL_fillingForm();
		  
		  //Not working properly
		  
//		  driver.findElement(By.className("adn-stored-card__details")).click();
		  wait.until(ExpectedConditions.elementToBeClickable(By.className("payment_box payment_method_woosa_adyen_credit_card")));
		  WebElement m = driver.findElement(By.id("payment_box payment_method_woosa_adyen_credit_card"));
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("arguments[0].click();", m);
		  
		  AdyenPaymentMethod();
		  
			 
		  try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  Assert.assertEquals(driver.getCurrentUrl().contains("/order-received/"), true);

		    
	  }
	
}
