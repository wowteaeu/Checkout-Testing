package BG;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class SlimfitTea extends CommonFunctions {
 
	
	
	@Test
  public void SlimfitTea1() {
		
		 ExtentTest test = extent.createTest("BG_SlimfitTeaVariations");
		  
		  driver.get("https://wowtea.eu/product/slimfit-tea/");
		 		  
		  addAllVariations();
		  
		  myAddressOption();
		  
		  fillingForm();
		  
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
