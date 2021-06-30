package SI;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static SI.SI_common.SI_fillingForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DetoxTea extends CommonFunctions {
	
	
	 @Test
	  public void detoxTea() {
		  
		  ExtentTest test = extent.createTest("SI_DetoxTea");
		  
//		  driver.get("https://wowtea.eu/si/product/wow-tea-detox/");
		  
		  driver.get("https://wowtea.eu/si/product/steklenica-za-caj-crna/");
		  
		  addAllVariations();
		  
		  SI_fillingForm();
		  
		  completeOrderBtn();
		  
		  successGif();
		  
		  // How to reuse this code !
		  
		  WebElement thGif = driver.findElement((By.cssSelector("figure[class='gif_success']")));
		  
		  Assert.assertEquals (thGif.isDisplayed(), true);
			 
			if (thGif.isDisplayed()) {

				test.log(Status.PASS, "Test is successful");

			} else {

				test.log(Status.FAIL, "Test Failed.Check your system !");
			} 
		  
	  }
}
