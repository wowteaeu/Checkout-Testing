package IT;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static IT.IT_common.IT_fillingForm;
public class Detox_Tea extends CommonFunctions {
	
	
	 @Test
	  public void detoxTea() {
		  
		  ExtentTest test = extent.createTest("IT_DetoxTeaVariations-COD");
		  
		  driver.get("https://wowtea.eu/it/product/wow-tea-detox/");
		   
		  addAllVariations();
		  
		  IT_fillingForm();
		  
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
