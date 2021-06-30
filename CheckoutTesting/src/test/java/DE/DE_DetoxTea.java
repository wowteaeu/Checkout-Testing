package DE;

import org.testng.annotations.Test;

import baseFunctions.CommonFunctions;

import org.openqa.selenium.By;
import org.testng.Assert;
import static DE.DE_common.DE_fillingFormM;
public class DE_DetoxTea extends CommonFunctions {
	
	
//  @Test
//  public void DE_DetoxTeaVariations() {
//	  
//	  ExtentTest test = extent.createTest("DE_DetoxTeaVariationsMollie");
//	  
//	  driver.get("https://wowtea.eu/de/product/wow-tea-detox/");
//	  
//	  addAllVariations();
//	  
//	  DE_fillingFormM();
//	  
//	  fillingMollie();
//	    
//	  try {
//		Thread.sleep(10000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	  
//	  Assert.assertEquals(driver.getCurrentUrl().contains("/order-pay/"), true);
//	  // How to reuse this code !
//	  
//	  String currentUrl = driver.getCurrentUrl();
//	  
//	  if (currentUrl.contains("/order-pay/")) {
//		  test.log(Status.PASS, "Test is successful !");
//	  } else {
//		  test.log(Status.FAIL, "Test failed!");
//	  }
//	    
//  }
  
  
  @Test
  public void DE_DetoxVariationsAdyen() {
	  
	  driver.get("https://wowtea.eu/de/product/wow-tea-detox/");
	  
	  addAllVariations();
	  
	  DE_fillingFormM();
	  
	  driver.findElement(By.className("dashicons-plus")).click();
	 
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
