package RO;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static RO.RO_common.RO_fillingForm;
import org.testng.Assert;

public class SuperFood extends CommonFunctions {
	
	
	@Test
	  public void slimfitSuperFood() {
		  
		  ExtentTest test = extent.createTest("RO_SlimfitSuperFood");
		  
		  driver.get("https://wowtea.eu/ro/product/slimfit/");
		  
		  addAllVariationsSuperFoodVersion3();
		  
		  RO_fillingForm();
		  
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
