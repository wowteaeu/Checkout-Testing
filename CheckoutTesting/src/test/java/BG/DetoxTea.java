package BG;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

//import static bg.CommonFunctions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class DetoxTea extends CommonFunctions  {
	
	
  @Test
  public void DetoxTea1() {
	  
	  ExtentTest test = extent.createTest("BG_DetoxTeaVariations");
	  
	  driver.get("https://wowtea.eu/product/wow-tea-detox/");
	  
	  addAllVariations();
	  
	  speedyOfficeOption();
	    
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


  
  
//  @BeforeMethod
//  public void beforeMethod() {
//	  
//	  browserSetUp();
//	   
//	  reportSetup();
//	  
//  }
//  
//  
//
//  @AfterMethod
//  public void afterMethod() {
//	  
//	  String currentUrl = driver.getCurrentUrl();
//	  System.out.println("the current url is" + currentUrl);
//   	  String title = driver.getTitle();
//   	  System.out.println("The title of the page is " + title);
//  
//	  driver.quit();	 
//	  
//  }
  

}
