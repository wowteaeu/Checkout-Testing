package BG;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class SuperFood extends CommonFunctions {
	
	
	  @Test
	  public void SlimfitSuperFood21() {
		  
		  ExtentTest test = extent.createTest("BG_SuperFoodVariations");
		  
		  driver.get("https://wowtea.eu/product/slimfit/");

		  
		  driver.findElement(By.xpath("//*[@id=\"variation_select\"]/div/label[2]")).click();
		  
		  addAllVariationsSuperFood();
		  
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
