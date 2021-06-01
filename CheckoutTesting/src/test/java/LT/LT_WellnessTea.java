package LT;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import org.testng.Assert;

import static LT.LT_Common.LT_fillingForm;
public class LT_WellnessTea extends CommonFunctions {
 
  
  @Test
  public void WellnessTeaDetoxTea() {
	  
	  ExtentTest test = extent.createTest("LT_WellnessVariationsMollie");
	  
	  driver.get("https://wowtea.eu/lt/product/new-wellness/");
	  
	  
	  	addAllVariations();
		
		LT_fillingForm();
			
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
