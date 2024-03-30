package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TraingleCalssification {
	static WebDriver browser;

	@Before
	public void setup() {

		  System.setProperty("webdriver.gecko.driver","C:\\Users\\97254\\Desktop\\Selleniun_start_projects\\geckodriver.exe");

		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url = "https://testpages.eviltester.com/styled/apps/triangle/triangle001.html";
		browser.get(url);
	}

	@Test
	public void C1C2C3C4F() {
		browser.findElement(By.name("side1")).sendKeys("1");
		browser.findElement(By.name("side2")).sendKeys("2");
		browser.findElement(By.name("side3")).sendKeys("3");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Error: Not a Traingle";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();
	}

	@Test
	public void C1C2C3FC4T() {
		browser.findElement(By.name("side1")).sendKeys("8");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("3");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Error: Not a Traingle";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void C1C2C4FC3T() {
		browser.findElement(By.name("side1")).sendKeys("1");
		browser.findElement(By.name("side2")).sendKeys("2");
		browser.findElement(By.name("side3")).sendKeys("1");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Error: Not a Traingle";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void C1C3C4FC2T() {
		browser.findElement(By.name("side1")).sendKeys("4");
		browser.findElement(By.name("side2")).sendKeys("4");
		browser.findElement(By.name("side3")).sendKeys("9");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Error: Not a Traingle";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void C1TC2C3C4F() {
		browser.findElement(By.name("side1")).sendKeys("2");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("4");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Scalene";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void C1C4TC2C3F() {
		browser.findElement(By.name("side1")).sendKeys("3");
		browser.findElement(By.name("side2")).sendKeys("2");
		browser.findElement(By.name("side3")).sendKeys("2");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Isosceles";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void C1C3TC2C4F() {
		browser.findElement(By.name("side1")).sendKeys("5");
		browser.findElement(By.name("side2")).sendKeys("6");
		browser.findElement(By.name("side3")).sendKeys("5");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Isosceles";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void C1C2TC3C4F() {
		browser.findElement(By.name("side1")).sendKeys("4");
		browser.findElement(By.name("side2")).sendKeys("4");
		browser.findElement(By.name("side3")).sendKeys("3");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Isosceles";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void C1C2C3C4T() {
		browser.findElement(By.name("side1")).sendKeys("7");
		browser.findElement(By.name("side2")).sendKeys("7");
		browser.findElement(By.name("side3")).sendKeys("7");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Equilateral";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}
}