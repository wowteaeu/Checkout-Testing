package EE;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static EE.EE_common.EE_fillingForm;
import org.testng.Assert;

public class WellnessTea extends CommonFunctions {
	
	
	 @Test
	  public void wellnessTea() {
		  
		  ExtentTest test = extent.createTest("EE_WellnessTea");
		  
		  driver.get("https://wowtea.eu/ee/product/new-wellness/");
		  
		  addAllVariations();
		  
		  EE_fillingForm();
		  
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
