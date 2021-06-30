package BE;

import static BE.BE_common.BE_fillingForm;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseFunctions.CommonFunctions;

public class BE_Summer extends CommonFunctions {
	
	
	@Test
	  public void NL_DetoxTeaVariations() {

		  driver.get("https://wowtea.eu/be/product/summer-reborn/");
		  
//		  addAllVariations();
		  
		  addAllVariationsSuperFood();
		  
		  BE_fillingForm();
		  
		  fillingMollieSecondOption();
		  
		  try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  Assert.assertEquals(driver.getCurrentUrl().contains("/order-pay/"), true);
			  // How to reuse this code !
			  
			
	  }
}
