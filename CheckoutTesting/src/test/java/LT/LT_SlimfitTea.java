package LT;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static LT.LT_Common.LT_fillingForm;
public class LT_SlimfitTea extends CommonFunctions {
	

  @Test
  public void SlimfitTeaCOD() {
	  
	  ExtentTest test = extent.createTest("LT_SlimfitTeaCOD");
	
//	driver.get("https://wowtea.eu/lt/product/slimfit-tea/");
	  
	  driver.get("https://wowtea.eu/lt/product/yellow-bottle/");
	  
	  addAllVariations();
	  
	  LT_fillingForm();
	  
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
