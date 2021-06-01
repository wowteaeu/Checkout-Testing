package AT;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static AT.AT_common.AT_fillingForm;

import org.testng.Assert;

public class AT_DetoxTea extends CommonFunctions {
	
	 @Test
	  public void AT_DetoxTeaVariations() {
		  
		  ExtentTest test = extent.createTest("AT_DetoxTeaVariationsMollie");
		  
		  driver.get("https://wowtea.eu/at/product/wow-tea-detox/");
		  
		  addAllVariations();
		  
		  AT_fillingForm();
		  
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
 

}
