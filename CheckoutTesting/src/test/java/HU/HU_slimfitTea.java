package HU;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import org.testng.Assert;

import static HU.HU_Common.HU_fillingForm;
public class HU_slimfitTea extends CommonFunctions {
	
	
	@Test
	  public void HU_SlimfitTea() {
		  
		  ExtentTest test = extent.createTest("HU_SlimfitTeaVariations-Mollie");
		  
		  driver.get("https://wowtea.eu/hu/product/slimfit-tea/");
		  
		  addAllVariations(); 
		  
		  HU_fillingForm();
		  
		  fillingMollieSecondOption();
		  
		  
		  try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  Assert.assertEquals(driver.getCurrentUrl().contains("/pay.mollie.nl/"), true);
			  // How to reuse this code !
			  
			  String currentUrl = driver.getCurrentUrl();
			  
			  if (currentUrl.contains("/pay.mollie.nl/")) {
				  test.log(Status.PASS, "Test is successful !");
			  } else {
				  test.log(Status.FAIL, "Test failed!");
			  }
		   
	  }
	  
}
