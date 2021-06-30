package SK;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static SK.SK_common.SK_fillingForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SlimfitTea extends CommonFunctions {
	
	@Test
	  public void SK_SlimfitTea() {
		  
		  ExtentTest test = extent.createTest("SK_SlimfitTea");
		  
//		  driver.get("https://wowtea.eu/sk/product/slimfit-tea/");
		  
		  driver.get("https://wowtea.eu/sk/product/cajova-flasa-cierna/");
		  
		  addAllVariations();
		  
		  SK_fillingForm();
		  
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
