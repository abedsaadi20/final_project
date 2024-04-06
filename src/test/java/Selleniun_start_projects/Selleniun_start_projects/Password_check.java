package Selleniun_start_projects.Selleniun_start_projects;
import static org.junit.Assert.assertNotEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Password_check {
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\97254\\Desktop\\Selleniun_start_projects\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  	  String url="https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html";
		      browser.get(url);
	  }
	 @Test
	 public void Correct_password_is_7_in_length_with_numbers() {
		 browser.findElement(By.name("characters")).sendKeys("abed201");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Valid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();
	 }
	 @Test
	 public void Correct_password_is_7_in_length_without_numbers() {
		 browser.findElement(By.name("characters")).sendKeys("abedsaa");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Valid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();
	 }
	 @Test
	 public void Correct_password_is_7_in_length_only_numbers() {
		 browser.findElement(By.name("characters")).sendKeys("1234567");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Valid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();
	 }
	 @Test
	 public void Correct_password_is_7_in_length_only_with_stars() {
		 browser.findElement(By.name("characters")).sendKeys("*******");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Valid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();
	 }
	 
	 @Test
	 public void Correct_password_is_7_in_length_with_numbers_and_biglatters_and_smalllatters() {
		 browser.findElement(By.name("characters")).sendKeys("abedS2*");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Valid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
	 @Test
	 public void Incorrect_password_longer_than_7() {
		 browser.findElement(By.name("characters")).sendKeys("abed2345");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
	 @Test
	 public void passowrd_less_than_7() {
		 browser.findElement(By.name("characters")).sendKeys("abed2");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
		 }
	 @Test
	 public void Incorrect_password_of_length_7_with_number_and_a_sign() {
		 browser.findElement(By.name("characters")).sendKeys("abedsa@");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
	 public void Incorrect_password_of_length_7_with_number_and_a_sign1() {
		 browser.findElement(By.name("characters")).sendKeys("678Mar%");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
	 @Test
	 public void Incorrect_password_of_length_7_with_number_and_a_sign2() {
		 browser.findElement(By.name("characters")).sendKeys("abed43^");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
}
