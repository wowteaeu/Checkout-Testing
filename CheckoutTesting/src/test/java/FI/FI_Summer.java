package FI;

import static FI.FI_common.FI_fillingForm;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseFunctions.CommonFunctions;

public class FI_Summer extends CommonFunctions {
	
	
	
	
  @Test
  public void SummerdetoxTea() {

	  driver.get("https://wowtea.eu/fi/product/yellow-bottle/");
	  		   
	  addAllVariations();
	  
	  FI_fillingForm();
	  
	  fillingMollie();
	    
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
	  
  }
  
  
  
  
  
  
  
}
