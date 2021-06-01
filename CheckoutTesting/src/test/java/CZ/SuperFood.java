package CZ;

import org.testng.annotations.Test;
import static CZ.CZ_Common.*;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SuperFood extends CommonFunctions {
	
	
  @Test
  public void superFood() {
	  
	  ExtentTest test = extent.createTest("CZ_SuperFoodVariations-COD");
	  
	  driver.get("https://wowtea.eu/cz/product/slimfit/");
	  
	  addAllVariationsSuperFoodVersion3();
	  
	  CZ_fillingForm();
	  
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
