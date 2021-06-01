package HR;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static HR.HR_common.*;
import org.testng.Assert;

public class SlimfitTea extends CommonFunctions {
	
	
	@Test
	  public void slimfitTea() {
		  
		  ExtentTest test = extent.createTest("HR_SlimfitTea");
		  
		  driver.get("https://wowtea.eu/hr/product/slimfit-tea/");
		  
		  addAllVariations();
		  
		  HR_fillingForm();
		  
		  HR_Mollie();
		    
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
