package baseFunctions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public abstract class CommonFunctions {

	public static WebDriver driver;
	
	
	public static ExtentReports extent = new ExtentReports();

	public static void browserSetUp() {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dragomir\\\\selenium\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();

}
	
	
	public static void successGif() {
		
		WebDriverWait wdw = new WebDriverWait(driver, 30); // wait up to 30 seconds
	    wdw.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("figure[class='gif_success']")));
		
	}
	
	public static void reportSetup() {
		
	
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/index.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		extent.attachReporter(spark);
		
	}
	

	public static void clickAddtoCartBtn() {
		WebElement  submitBtn=driver.findElement(By.className("single_add_to_cart_button"));  
		  JavascriptExecutor subBtn=(JavascriptExecutor)driver;
		  subBtn.executeScript("arguments[0].click()", submitBtn);	
	}
	
	public static void addAllVariations() { 
	  driver.findElement(By.xpath("//*[@id=\"variation_select\"]/div/label[1]")).click();
      clickAddtoCartBtn();
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"variation_select\"]/div/label[2]")).click();
	  clickAddtoCartBtn();
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"variation_select\"]/div/label[3]")).click();
	  clickAddtoCartBtn();
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"variation_select\"]/div/label[4]")).click();
	  clickAddtoCartBtn();
	  
	  System.out.println("All variations successfully added");
}
	
	public static void addAllVariationsSuperFood() {
	 	
	  driver.findElement(By.xpath("//*[@id=\"variation_select\"]/div/label[1]")).click();
	  clickAddtoCartBtn();
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"variation_select\"]/div/label[2]")).click();
	  clickAddtoCartBtn();
}  

	public static void addAllVariationsSuperFoodVersion3() {
		
		  clickAddtoCartBtn();
		  driver.navigate().back();
		  driver.findElement(By.xpath("//*[@id=\"variation_select\"]/div/label[2]")).click();
		  clickAddtoCartBtn();
		  driver.navigate().back();
		  driver.findElement(By.xpath("//*[@id=\"variation_select\"]/div/label[3]")).click();
		  clickAddtoCartBtn();
	}  
	
	public static void myAddressOption() {
		driver.findElement(By.xpath("//*[@id=\"carrier_field\"]/span/div[2]/label")).click();
		
		System.out.println("My address was successfully checked !");
	}
	
	public static void speedyOfficeOption() {
		
		driver.findElement(By.xpath("//*[@id=\"carrier_field\"]/span/div[1]/label")).click();
		
		Select drpSpeedy = new Select (driver.findElement(By.name("speedy_offices")));
		
		drpSpeedy.selectByIndex(0);
		
	}
	
	public static void econtOfficeOption() {
		
		driver.findElement(By.xpath("//*[@id=\"carrier_field\"]/span/div[3]/label"));
		
		Select drpEcont = new Select (driver.findElement(By.name("econt_offices")));
		
		drpEcont.selectByIndex(0);
		
	}
	
	public static void fillingForm() {
		
		
		  driver.findElement(By.className("woocommerce-terms-and-conditions-wrapper"));
		  driver.findElement(By.xpath("//*[@id=\"payment\"]/div/div[1]/p"));
		  driver.findElement(By.id("billing_email")).sendKeys("trashthisorder@test.test");
		  driver.findElement(By.id("billing_first_name")).sendKeys("Dragomir");
		  driver.findElement(By.id("billing_phone")).sendKeys("3938485");
		  driver.findElement(By.id("billing_city")).sendKeys("Sofia");
		  driver.findElement(By.id("billing_address_1")).sendKeys("1000");
		  
		  //Find the checkbox
		  
		  WebElement  element=driver.findElement(By.xpath("//*[@id=\"terms\"]"));  
		  JavascriptExecutor ex=(JavascriptExecutor)driver;
		  ex.executeScript("arguments[0].click()", element);
		  
//		  //Click the place order  btn
		  
		  WebElement  element1=driver.findElement(By.id("place_order"));  
		  JavascriptExecutor ex1=(JavascriptExecutor)driver;
		  ex1.executeScript("arguments[0].click()", element1);
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		  
		  
//		  String title = driver.getTitle();
//		  System.out.println("the page title is" + title);
//		  Assert.assertEquals(title, "Checkout - WOW TEA");
//		  Assert.assertEquals(title, "Title");
		
		
	}
	
	public static void fillingMollie() {
		
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  WebDriverWait waitTwo = new WebDriverWait(driver, 10);
	
		  //Click the Mollie option
	
		  WebElement  mollieElement=driver.findElement(By.xpath("//*[@id=\"payment\"]/ul/li[1]/label"));  
		  JavascriptExecutor mollie=(JavascriptExecutor)driver;
		  mollie.executeScript("arguments[0].click()", mollieElement);
		  WebElement paypalShit = driver.findElement(By.id("paypal_checkout_method"));
		  waitTwo.until(ExpectedConditions.invisibilityOf(paypalShit));
		  JavascriptExecutor paypalSHit = (JavascriptExecutor)driver;
		//  paypalSHit.executeScript("arguments[0].scrollIntoView(true)", paypalShit);
		  paypalSHit.executeScript("window.scrollBy(0,1200)");
		  
		  
		  
		  driver.switchTo().frame((WebElement)driver.findElement(By.xpath("//*[@id=\"cardHolder\"]/div[1]/iframe"))); 
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cardHolder\"]")));
		  waitTwo.until(ExpectedConditions.presenceOfElementLocated(By.id("cardHolder"))).sendKeys("testtest");
		  System.out.println("CardHolder credentials successfully placed!");
		  driver.switchTo().defaultContent();
		  
		  
		  driver.switchTo().frame((WebElement)driver.findElement(By.xpath("//*[@id=\"cardNumber\"]/div[1]/iframe"))); 
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cardNumber\"]")));
		  waitTwo.until(ExpectedConditions.presenceOfElementLocated(By.id("cardNumber"))).sendKeys("3456 789012 34564");
		  System.out.println("CardNumber credentials successfully placed!");
		  
		  driver.switchTo().defaultContent();
		  
		  
		  driver.switchTo().frame((WebElement)driver.findElement(By.xpath("//*[@id=\"expiryDate\"]/div[1]/iframe"))); 
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"expiryDate\"]")));
		  waitTwo.until(ExpectedConditions.presenceOfElementLocated(By.id("expiryDate"))).sendKeys("1123");
		  System.out.println("ExpiryDate credentials successfully placed!");
		  driver.switchTo().defaultContent();
		  
		  
		  driver.switchTo().frame((WebElement)driver.findElement(By.xpath("//*[@id=\"verificationCode\"]/div[1]/iframe"))); 
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"verificationCode\"]")));
		  waitTwo.until(ExpectedConditions.presenceOfElementLocated(By.id("verificationCode"))).sendKeys("2314");
		  System.out.println("Varification code credentials successfully placed!");
		  driver.switchTo().defaultContent();
		  

		  //Find the checkbox
		  
		  WebElement  element=driver.findElement(By.xpath("//*[@id=\"terms\"]"));  
		  JavascriptExecutor ex=(JavascriptExecutor)driver;
		  ex.executeScript("arguments[0].click()", element);
		  
		  //Click the place order  button
		  
		  WebElement  element1=driver.findElement(By.id("place_order"));  
		  JavascriptExecutor ex1=(JavascriptExecutor)driver;
		  ex1.executeScript("arguments[0].click()", element1);
	
	}
	
	public static void fillingMollieSecondOption() {
		
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  WebDriverWait waitTwo = new WebDriverWait(driver, 10);
	
		  //Click the Mollie option
	
		  WebElement  mollieElement=driver.findElement(By.xpath("//*[@id=\"payment\"]/ul/li[2]/label"));  
		  JavascriptExecutor mollie=(JavascriptExecutor)driver;
		  mollie.executeScript("arguments[0].click()", mollieElement);
		  WebElement paypalShit = driver.findElement(By.id("paypal_checkout_method"));
		  waitTwo.until(ExpectedConditions.invisibilityOf(paypalShit));
		  JavascriptExecutor paypalSHit = (JavascriptExecutor)driver;
		//  paypalSHit.executeScript("arguments[0].scrollIntoView(true)", paypalShit);
		  paypalSHit.executeScript("window.scrollBy(0,1200)");
		  
		  
		  
		  driver.switchTo().frame((WebElement)driver.findElement(By.xpath("//*[@id=\"cardHolder\"]/div[1]/iframe"))); 
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cardHolder\"]")));
		  waitTwo.until(ExpectedConditions.presenceOfElementLocated(By.id("cardHolder"))).sendKeys("testtest");
		  System.out.println("CardHolder credentials successfully placed!");
		  driver.switchTo().defaultContent();
		  
		  
		  driver.switchTo().frame((WebElement)driver.findElement(By.xpath("//*[@id=\"cardNumber\"]/div[1]/iframe"))); 
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cardNumber\"]")));
		  waitTwo.until(ExpectedConditions.presenceOfElementLocated(By.id("cardNumber"))).sendKeys("3456 789012 34564");
		  System.out.println("CardNumber credentials successfully placed!");
		  
		  driver.switchTo().defaultContent();
		  
		  
		  driver.switchTo().frame((WebElement)driver.findElement(By.xpath("//*[@id=\"expiryDate\"]/div[1]/iframe"))); 
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"expiryDate\"]")));
		  waitTwo.until(ExpectedConditions.presenceOfElementLocated(By.id("expiryDate"))).sendKeys("1123");
		  System.out.println("ExpiryDate credentials successfully placed!");
		  driver.switchTo().defaultContent();
		  
		  
		  driver.switchTo().frame((WebElement)driver.findElement(By.xpath("//*[@id=\"verificationCode\"]/div[1]/iframe"))); 
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"verificationCode\"]")));
		  waitTwo.until(ExpectedConditions.presenceOfElementLocated(By.id("verificationCode"))).sendKeys("2314");
		  System.out.println("Varification code credentials successfully placed!");
		  driver.switchTo().defaultContent();
		  

		  //Find the checkbox
		  
		  WebElement  element=driver.findElement(By.xpath("//*[@id=\"terms\"]"));  
		  JavascriptExecutor ex=(JavascriptExecutor)driver;
		  ex.executeScript("arguments[0].click()", element);
		  
		  //Click the place order  button
		  
		  WebElement  element1=driver.findElement(By.id("place_order"));  
		  JavascriptExecutor ex1=(JavascriptExecutor)driver;
		  ex1.executeScript("arguments[0].click()", element1);
	
	}
	
	public static void completeOrderBtn() {
		
		 WebElement  element=driver.findElement(By.xpath("//*[@id=\"terms\"]"));  
		  JavascriptExecutor ex=(JavascriptExecutor)driver;
		  ex.executeScript("arguments[0].click()", element);
		  
//		  //Click the place order button
		  
		  WebElement  element1=driver.findElement(By.id("place_order"));  
		  JavascriptExecutor ex1=(JavascriptExecutor)driver;
		  ex1.executeScript("arguments[0].click()", element1);  
	}
	
	 @BeforeMethod
	  public void beforeMethod() {
		  
		  browserSetUp();
		   
		  reportSetup();
		  
	  }
	  
	  
	  @AfterMethod
	  public void afterMethod() {
		  
		  String currentUrl = driver.getCurrentUrl();
		  System.out.println("the current url is" + currentUrl);
	   	  String title = driver.getTitle();
	   	  System.out.println("The title of the page is " + title);
	  
		  driver.quit();	 
		  
	  }
}
