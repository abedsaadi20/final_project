package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.System;

public class Selenium_calculator {

	static WebDriver browser;

	@Before
	public void setup() {

		  System.setProperty("webdriver.gecko.driver","C:\\Users\\97254\\Desktop\\Selleniun_start_projects\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url = "https://testpages.eviltester.com/styled/apps/calculator.html";
		browser.get(url);

	}

	@Test
	public void plus() {

		browser.findElement(By.id("button01")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button02")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "3";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void plus2() {

		browser.findElement(By.id("button02")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button02")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "4";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void minus() {
		browser.findElement(By.id("button08")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button02")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "6";
		assertEquals(Expected, result);
		browser.close();

	}
	@Test
	public void minus2() {
		browser.findElement(By.id("button08")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button04")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "4";
		assertEquals(Expected, result);
		browser.close();

	}

	@Test
	public void multiply() {
		browser.findElement(By.id("button09")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button01")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "9";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void multiply2() {
		browser.findElement(By.id("button07")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button02")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "14";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void divide() {
		browser.findElement(By.id("button06")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button03")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "2";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void divide2() {
		browser.findElement(By.id("button04")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button02")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "2";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void divideByZero() {
		browser.findElement(By.id("button02")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button00")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "Infinity";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void ZerodivideZero() {
		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button00")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");
		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "NaN";
		assertEquals(Expected, result);
		browser.close();
	}
}