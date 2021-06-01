package PL;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static PL.PL_common.PL_fillingForm;



public class DetoxTea extends CommonFunctions {
	
	
	 @Test
	  public void PL_detoxTea() {
		  
		  ExtentTest test = extent.createTest("PL_DetoxTea");
		  
		  driver.get("https://wowtea.eu/pl/product/wow-tea-detox/");
		   
		  addAllVariations();
		  
		  PL_fillingForm();
		  
		  completeOrderBtn();
		  
		  successGif();
		  
		  WebElement thGif = driver.findElement((By.cssSelector("figure[class='gif_success']")));
		  
		  Assert.assertEquals (thGif.isDisplayed(), true);
			 
			if (thGif.isDisplayed()) {

				test.log(Status.PASS, "Test is successful");

			} else {

				test.log(Status.FAIL, "Test Failed.Check your system !");
			} 
		  
	  }
}
