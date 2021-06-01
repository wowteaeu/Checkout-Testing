package LV;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static LV.LV_common.LV_fillingForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SuperFood extends CommonFunctions {
	
	
	 @Test
	  public void slimfitSuperFood() {
		  
		  ExtentTest test = extent.createTest("LV_SlimfitSuperFood");
		  
		  driver.get("https://wowtea.eu/lv/product/slimfit/");
		  
		  addAllVariationsSuperFoodVersion3();
		  
		  LV_fillingForm();
		  
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
