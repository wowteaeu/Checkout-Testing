package ES;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static ES.ES_common.ES_fillingForm;
import org.testng.Assert;

public class DetoxTea extends CommonFunctions {
	
	 @Test
	  public void detoxTea() {
		  
		  ExtentTest test = extent.createTest("ES_DetoxTea");
		  
		  driver.get("https://wowtea.eu/es/product/wow-tea-detox/");
		  		   
		  addAllVariations();
		  
		  ES_fillingForm();
		  
		  fillingMollieSecondOption();
		    
		  // How to reuse this code !
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
