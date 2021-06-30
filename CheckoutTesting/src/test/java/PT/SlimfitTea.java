package PT;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFunctions.CommonFunctions;

import static PT.PT_common.PT_fillingForm;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SlimfitTea extends CommonFunctions {
	
	
	@Test
	public void IT_SlimfitSuperFood() {
		  
		  ExtentTest test = extent.createTest("PT_SlimfitSuperfoodVariations-COD");
		  
		  driver.get("https://wowtea.eu/pt/product/slimfit-tea/");
		  
		  driver.findElement(By.xpath("//*[@id=\"variation_select\"]/div/label[4]")).click();
		  
		  addAllVariations();
		  
		  PT_fillingForm();
		  
		  fillingMollieSecondOption();
		  
		  try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  Assert.assertEquals(driver.getCurrentUrl().contains("/order-pay/"), true);
			  // How to reuse this code !
			  
			  String currentUrl = driver.getCurrentUrl();
			  
			  if (currentUrl.contains("/order-pay/")) {
				  test.log(Status.PASS, "Test is successful !");
			  } else {
				  test.log(Status.FAIL, "Test failed!");
			  }
		  
	}
	
	
	@Test
	public void IT_SlimfitSuperFoodAdyen() {
		  
		  driver.get("https://wowtea.eu/pt/product/slimfit-tea/");
		  
		  driver.findElement(By.xpath("//*[@id=\"variation_select\"]/div/label[4]")).click();
		  
		  addAllVariations();
		  
		  PT_fillingForm();
		  
		  AdyenPaymentMethod();
		  
		  try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  Assert.assertEquals(driver.getCurrentUrl().contains("/order-received/"), true);
			  // How to reuse this code !
	
		  
	}
	
	
}
