package GR;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static GR.GR_common.GR_fillingForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WellnessTea extends CommonFunctions {
	
	
	 @Test
	  public void wellnessTea() {
		  
		  ExtentTest test = extent.createTest("GR_WellnessTea");
		  
		  driver.get("https://wowtea.eu/gr/product/new-wellness/");
		  
		  addAllVariations();
		   
		  GR_fillingForm();
		  
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
