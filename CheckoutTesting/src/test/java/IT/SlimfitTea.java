package IT;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import org.testng.Assert;
import static IT.IT_common.IT_fillingForm;

public class SlimfitTea extends CommonFunctions {
	
	@Test
	  public void IT_SlimfitTea() {
		  
		  ExtentTest test = extent.createTest("IT_SlimfitTeaVariations-Mollie");
		  
		  driver.get("https://wowtea.eu/it/product/slimfit-tea/");
		  
		  addAllVariations();
		  
		  IT_fillingForm();
		  
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
