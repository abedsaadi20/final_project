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
	 public void correct_password() {
		 browser.findElement(By.name("characters")).sendKeys("abed201");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Valid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();
	 }
	 @Test
	 public void passowrd_more_than_7() {
		 browser.findElement(By.name("characters")).sendKeys("abedsaadi2000");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
		 }
	 @Test
	 public void passowrd_more_less_7() {
		 browser.findElement(By.name("characters")).sendKeys("abed1");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
	 @Test
	 public void not_valid_characters() {
		 browser.findElement(By.name("characters")).sendKeys("abed@");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
	 @Test
	 public void not_valid_characters_2() {
		 browser.findElement(By.name("characters")).sendKeys("abed123$");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
	 @Test
	 public void not_valid_characters_3() {
		 browser.findElement(By.name("characters")).sendKeys("abed43^");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
}
