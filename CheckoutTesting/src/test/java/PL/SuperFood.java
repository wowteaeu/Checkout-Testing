package PL;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static PL.PL_common.PL_fillingForm;
import org.testng.Assert;

public class SuperFood extends CommonFunctions {
	
	
	 @Test
	  public void slimfitSuperFood() {
		  
		  ExtentTest test = extent.createTest("PL_SlimfitSuperFood");
		  
		  driver.get("https://wowtea.eu/pl/product/slimfit/");
		  
		  addAllVariationsSuperFoodVersion3();
		  
		  PL_fillingForm();
		  
		  fillingMollieSecondOption();
		  
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
