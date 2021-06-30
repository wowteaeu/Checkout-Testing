package ES;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static ES.ES_common.ES_fillingForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SlimfitTea extends CommonFunctions {
	
	@Test
	  public void ES_SlimfitTea() {
		  
		  ExtentTest test = extent.createTest("ES_SlimfitTea");
		  
//		  driver.get("https://wowtea.eu/es/product/slimfit-tea/");
		  
		  driver.get("https://wowtea.eu/pt/product/summer-detox-tea/");
		    
		  addAllVariations();
		  
		  ES_fillingForm();
		  
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