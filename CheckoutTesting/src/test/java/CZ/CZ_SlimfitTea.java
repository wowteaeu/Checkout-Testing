package CZ;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static CZ.CZ_Common.CZ_fillingForm;

public class CZ_SlimfitTea extends CommonFunctions {
	
	
  @Test
  public void slimfitTea() {
	  
	  ExtentTest test = extent.createTest("CZ_SlimfitTeaVariations-COD");
	  
	  driver.get("https://wowtea.eu/cz/product/slimfit-tea/");
	  
	  addAllVariations();
	  
	  CZ_fillingForm();
	  
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
