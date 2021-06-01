package CZ;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static CZ.CZ_Common.*;

import org.testng.Assert;

public class WellnessTea extends CommonFunctions {
  @Test
  public void wellnessTea() {
	  
	  ExtentTest test = extent.createTest("CZ_WellnessTeaVariations-COD");
	  
	  driver.get("https://wowtea.eu/cz/product/new-wellness/");
	  
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
