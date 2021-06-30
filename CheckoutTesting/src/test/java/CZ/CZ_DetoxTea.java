package CZ;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static CZ.CZ_Common.*;
import org.testng.Assert;

public class CZ_DetoxTea extends CommonFunctions {
	
	
  @Test
  public void DetoxTea() {
	  
  ExtentTest test = extent.createTest("CZ_DetoxTeaVariationsMollie");
	  
	  driver.get("https://wowtea.eu/cz/product/wow-tea-detox/");
	   
	  addAllVariations();
	  
	  CZ_fillingForm();
	  
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
