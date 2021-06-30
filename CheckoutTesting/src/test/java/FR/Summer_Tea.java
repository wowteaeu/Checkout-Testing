package FR;

import static ES.ES_common.ES_fillingForm;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseFunctions.CommonFunctions;

public class Summer_Tea extends CommonFunctions {
	
	
	
	
  @Test
  public void Fr_Summer() {
	  
	  driver.get("https://wowtea.eu/fr/product/summer-detox-tea/");
		   
	  addAllVariations();
	  
	  ES_fillingForm();
	  
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
