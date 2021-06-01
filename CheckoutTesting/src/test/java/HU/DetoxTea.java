package HU;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static HU.HU_Common.HU_fillingForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DetoxTea extends CommonFunctions {
	
  @Test
  public void detoxTea() {
	  
	  ExtentTest test = extent.createTest("HU_DetoxTeaVariations-COD");
	  
	  driver.get("https://wowtea.eu/hu/product/wow-tea-detox/");
	  
	  addAllVariations(); 
	  
	  HU_fillingForm();
	  
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
